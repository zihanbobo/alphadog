package com.moseeker.useraccounts.service;

import com.alibaba.fastjson.JSON;
import com.moseeker.baseorm.constant.EmployeeActiveState;
import com.moseeker.baseorm.dao.candidatedb.CandidateCompanyDao;
import com.moseeker.baseorm.dao.hrdb.HrEmployeeCertConfDao;
import com.moseeker.baseorm.dao.userdb.UserEmployeeDao;
import com.moseeker.baseorm.dao.userdb.UserUserDao;
import com.moseeker.baseorm.db.userdb.tables.records.UserEmployeeRecord;
import com.moseeker.baseorm.pojo.ExecuteResult;
import com.moseeker.baseorm.redis.RedisClient;
import com.moseeker.common.constants.Constant;
import com.moseeker.common.constants.EmployeeOperationEntrance;
import com.moseeker.common.constants.EmployeeOperationIsSuccess;
import com.moseeker.common.constants.EmployeeOperationType;
import com.moseeker.common.util.StringUtils;
import com.moseeker.common.util.query.Query;
import com.moseeker.common.validation.ValidateUtil;
import com.moseeker.entity.*;
import com.moseeker.rpccenter.client.ServiceManager;
import com.moseeker.thrift.gen.dao.struct.candidatedb.CandidateCompanyDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrEmployeeCertConfDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserUserDO;
import com.moseeker.thrift.gen.employee.struct.BindingParams;
import com.moseeker.thrift.gen.employee.struct.Result;
import com.moseeker.thrift.gen.mq.service.MqService;
import com.moseeker.useraccounts.exception.UserAccountException;
import com.moseeker.useraccounts.service.impl.EmployeeBindByEmail;
import org.apache.thrift.TException;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lucky8987 on 17/6/29.
 */
@Component
public abstract class EmployeeBinder {

    private static final Logger log = LoggerFactory.getLogger(EmployeeBinder.class);

    protected MqService.Iface mqService = ServiceManager.SERVICEMANAGER.getService(MqService.Iface.class);

    @Resource(name = "cacheClient")
    protected RedisClient client;

    @Autowired
    protected UserUserDao userDao;

    @Autowired
    protected UserEmployeeDao employeeDao;

    @Autowired
    protected UserWxEntity wxEntity;

    @Autowired
    protected EmployeeEntity employeeEntity;

    @Autowired
    protected UserAccountEntity userAccountEntity;

    @Autowired
    protected HrEmployeeCertConfDao hrEmployeeCertConfDao;

    @Autowired
    protected SearchengineEntity searchengineEntity;

    @Autowired
    protected CandidateCompanyDao candidateCompanyDao;

    @Autowired
    protected LogEmployeeOperationLogEntity logEmployeeOperationLogEntity;

    @Autowired
    EmployeeBindByEmail employeeBindByEmail;

    protected ThreadLocal<UserEmployeeDO> userEmployeeDOThreadLocal = new ThreadLocal<>();

    /**
     * 员工认证
     * @param bindingParams 认证参数
     * @return 认证结果
     */
    public Result bind(BindingParams bindingParams,Integer bingSource) {
        log.info("bind param: BindingParams={}", bindingParams);
        Result response = new Result();
        Query.QueryBuilder query = new Query.QueryBuilder();
        try {
            userEmployeeDOThreadLocal.set(employeeEntity.getCompanyEmployee(bindingParams.getUserId(),
                    bindingParams.getCompanyId()));
            if (userEmployeeDOThreadLocal.get() != null && userEmployeeDOThreadLocal.get().getId() > 0
                    && userEmployeeDOThreadLocal.get().getActivation() == 0) {
                throw new RuntimeException("该员工已绑定");
            }
            query.where("company_id", String.valueOf(bindingParams.getCompanyId())).and("disable", String.valueOf(0));
            HrEmployeeCertConfDO certConf = hrEmployeeCertConfDao.getData(query.buildQuery());
            if(certConf == null || certConf.getCompanyId() == 0) {
                throw new RuntimeException("暂时不接受员工认证");
            }
            paramCheck(bindingParams, certConf);
            UserEmployeeDO userEmployee = createEmployee(bindingParams);
            response = doneBind(userEmployee,bingSource);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
            response.setSuccess(false);
            response.setMessage(e.getMessage());
        }
        log.info("bind response: {}", response);
        return response;
    }

    /**
     * 创建员工记录
     * @param bindingParams
     * @return
     */
    protected UserEmployeeDO createEmployee(BindingParams bindingParams) {
        UserEmployeeDO userEmployee = userEmployeeDOThreadLocal.get() == null ? new UserEmployeeDO() : userEmployeeDOThreadLocal.get();
        userEmployee.setCompanyId(bindingParams.getCompanyId());
        userEmployee.setEmployeeid(org.apache.commons.lang.StringUtils.defaultIfBlank(bindingParams.getMobile(), ""));
        userEmployee.setSysuserId(bindingParams.getUserId());
        userEmployee.setCname(org.apache.commons.lang.StringUtils.defaultIfBlank(bindingParams.getName(), userEmployee.getCname()));
        userEmployee.setMobile(org.apache.commons.lang.StringUtils.defaultIfBlank(bindingParams.getMobile(), userEmployee.getMobile()));
        userEmployee.setEmail(org.apache.commons.lang.StringUtils.defaultIfBlank(bindingParams.getEmail(), userEmployee.getEmail()));
        userEmployee.setWxuserId(wxEntity.getWxuserId(bindingParams.getUserId(), bindingParams.getCompanyId()));
        userEmployee.setAuthMethod((byte)bindingParams.getType().getValue());
        userEmployee.setActivation((byte)0);
        userEmployee.setCreateTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        userEmployee.setBindingTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        userEmployeeDOThreadLocal.set(userEmployee);
        return userEmployee;
    }


    /**
     *  认证数据校验
     * @param bindingParams
     * @param certConf
     * @throws Exception
     */
    protected void paramCheck(BindingParams bindingParams, HrEmployeeCertConfDO certConf) throws Exception {
        ValidateUtil validateUtil = new ValidateUtil();
        validateUtil.addIntTypeValidate("公司信息", bindingParams.getCompanyId(), null, null, 1, null);
        validateUtil.addIntTypeValidate("用户信息", bindingParams.getUserId(), null, null, 1, null);
        String result = validateUtil.validate();
        if (org.apache.commons.lang.StringUtils.isNotBlank(result)) {
            throw UserAccountException.validateFailed(result);
        }
    }


    /**
     * step 1: 认证当前员工   step 2: 将其他公司的该用户员工设为未认证
     * todo 需要优化  代码过长
     * @param useremployee
     * @return
     * @throws TException
     */
    protected Result doneBind(UserEmployeeDO useremployee,int bindSource) throws TException {
        log.info("doneBind param: useremployee={}", useremployee);
        Result response = new Result();
        int employeeId;
        if (useremployee.getId() != 0) {
            useremployee.setUpdateTime(null);
            String bindTime = useremployee.getBindingTime();
            useremployee.setBindingTime(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
            employeeDao.updateData(useremployee);
            if (useremployee.getAuthMethod() == 1 &&
                    org.apache.commons.lang.StringUtils.isBlank(bindTime)) {
                employeeEntity.addRewardByEmployeeVerified(useremployee.getId(), useremployee.getCompanyId());
            }
            employeeId = useremployee.getId();
        } else {
            log.info("doneBind now:{}", new DateTime().toString("YYYY-MM-dd HH:mm:ss"));
            log.info("doneBind persist employee:{}", useremployee);


            UserEmployeeRecord unActiveEmployee = employeeDao.getUnActiveEmployee(useremployee.getSysuserId(),
                    useremployee.getCompanyId());
            if (unActiveEmployee != null) {
                employeeId = unActiveEmployee.getId();
                if (unActiveEmployee.getActivation() != EmployeeActiveState.Actived.getState()) {
                    if (org.apache.commons.lang.StringUtils.isBlank(unActiveEmployee.getEmail())) {
                        unActiveEmployee.setEmail(org.apache.commons.lang.StringUtils.defaultIfBlank(useremployee.getEmail(), ""));
                    }
                    if (org.apache.commons.lang.StringUtils.isBlank(unActiveEmployee.getMobile())) {
                        unActiveEmployee.setMobile(org.apache.commons.lang.StringUtils.defaultIfBlank(useremployee.getMobile(), ""));
                    }
                    if (org.apache.commons.lang.StringUtils.isBlank(unActiveEmployee.getCname())) {
                        unActiveEmployee.setCname(useremployee.getCname());
                    }
                    if ((org.apache.commons.lang.StringUtils.isBlank(unActiveEmployee.getCustomFieldValues())
                            || Constant.EMPLOYEE_DEFAULT_CUSTOM_FIELD_VALUE.equals(unActiveEmployee.getCustomFieldValues()))
                            && StringUtils.isNotNullOrEmpty(useremployee.getCustomFieldValues())) {
                        unActiveEmployee.setCustomFieldValues(useremployee.getCustomFieldValues());
                    }
                    unActiveEmployee.setActivation(EmployeeActiveState.Actived.getState());
                    log.info("doneBind unActiveEmployee update record");
                    if (useremployee.getAuthMethod() == 1 && unActiveEmployee.getBindingTime() == null) {
                        unActiveEmployee.setBindingTime(new Timestamp(LocalDateTime.parse(useremployee.getBindingTime(),
                                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                                .atZone(ZoneId.systemDefault()).toInstant().getEpochSecond()* 1000));
                        employeeEntity.addRewardByEmployeeVerified(employeeId, useremployee.getCompanyId());
                    }
                    if (unActiveEmployee.getBindingTime() != null) {
                        useremployee.setBindingTime(new DateTime(unActiveEmployee.getBindingTime().getTime()).toString("yyyy-MM-dd HH:mm:ss"));
                    } else {
                        useremployee.setBindingTime(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
                    }

                    unActiveEmployee.setAuthMethod(useremployee.getAuthMethod());
                    employeeDao.updateRecord(unActiveEmployee);

                }
            } else {
                ExecuteResult executeResult = employeeDao.registerEmployee(useremployee);
                employeeId = executeResult.getId();
                if (executeResult.getExecute() > 0) {
                    employeeEntity.addRewardByEmployeeVerified(employeeId, useremployee.getCompanyId());
                }
            }
        }
        if (useremployee.getSysuserId() > 0
                && org.apache.commons.lang.StringUtils.isNotBlank(useremployee.getCname())) {
            UserUserDO userUserDO = new UserUserDO();
            userUserDO.setId(useremployee.getSysuserId());
            userUserDO.setName(useremployee.getCname());
            userDao.updateData(userUserDO);
        }

        //将属于本公司的潜在候选人设置为无效
        cancelCandidate(useremployee.getSysuserId(),useremployee.getCompanyId());
        // 将其他公司的员工认证记录设为未认证
        Query.QueryBuilder query = new Query.QueryBuilder();
        query.where("sysuser_id", String.valueOf(useremployee.getSysuserId())).and("disable", "0");
        List<UserEmployeeDO> employees = employeeDao.getDatas(query.buildQuery());
        log.info("select employees by: {}, result = {}", query, Arrays.toString(employees.toArray()));
        if (!StringUtils.isEmptyList(employees)) {
            employees.forEach(e -> {
                if (e.getId() != employeeId && e.getActivation() == 0) {
                    e.setEmailIsvalid((byte)0);
                    e.setActivation((byte)1);
                    e.setCustomFieldValues("[]");
                }
            });
            log.info("employees========"+JSON.toJSONString(employees));
            if(!StringUtils.isEmptyList(employees)){
                for(UserEmployeeDO DO:employees){
                    int employeeIdOther=DO.getId();
                    if(employeeIdOther==employeeId){
                        continue;
                    }
                    int userId=DO.getSysuserId();
                    int companyId=DO.getCompanyId();
                    convertCandidatePerson(userId,companyId);
                }
            }

        }
        log.info("update employess = {}", Arrays.toString(employees.toArray()));
        int[] updateResult = employeeDao.updateDatas(employees);
        if (Arrays.stream(updateResult).allMatch(m -> m == 1)){
            response.setSuccess(true);
            response.setMessage("success");
            if (StringUtils.isNotNullOrEmpty(useremployee.getActivationCode())) {
                client.del(Constant.APPID_ALPHADOG, Constant.EMPLOYEE_AUTH_CODE, useremployee.getActivationCode());
                client.del(Constant.APPID_ALPHADOG, Constant.EMPLOYEE_AUTH_INFO, employeeEntity.getAuthInfoKey(useremployee.getSysuserId(), useremployee.getCompanyId()));
            }
            // 更新ES中useremployee信息
            searchengineEntity.updateEmployeeDOAwards(employees);
        } else {
            response.setSuccess(false);
            response.setMessage("fail");
        }
        if(response.success){
            if(bindSource == EmployeeOperationEntrance.IMEMPLOYEE.getKey()){
                logEmployeeOperationLogEntity.insertEmployeeOperationLog(useremployee.getId(),bindSource, EmployeeOperationType.EMPLOYEEVALID.getKey(),EmployeeOperationIsSuccess.SUCCESS.getKey(),useremployee.getCompanyId(),null);
                log.error("insertLogSuccess","我是员工");
            }
        }
        log.info("updateEmployee response : {}", response);
        useremployee.setId(employeeId);
        return response;
    }
    /*
        员工认证成功时，需要将潜在候选人置为无效
     */
    public void cancelCandidate(int userId,int companyId) {
        Query query = new Query.QueryBuilder().where("sys_user_id", userId).and("company_id", companyId).and("status", 1).buildQuery();
        List<CandidateCompanyDO> list = candidateCompanyDao.getDatas(query);
        if (!StringUtils.isEmptyList(list)) {
            log.info(JSON.toJSONString(list));
            for (CandidateCompanyDO DO : list) {
                DO.setStatus(0);

            }
            candidateCompanyDao.updateDatas(list);

        }
    }
    /*
        员工取消后，需要将潜在候选人置为有效
     */
    public void convertCandidatePerson(int userId,int companyId){
        Query query=new Query.QueryBuilder().where("sys_user_id",userId).and("company_id",companyId).and("status",0).buildQuery();
        List<CandidateCompanyDO> list=candidateCompanyDao.getDatas(query);
        if(!StringUtils.isEmptyList(list)){
            for(CandidateCompanyDO DO:list){
                DO.setStatus(1);

            }
            candidateCompanyDao.updateDatas(list);
        }
    }

}
