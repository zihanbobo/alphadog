package com.moseeker.useraccounts.service.impl;

import com.alibaba.fastjson.JSON;
import com.moseeker.baseorm.dao.hrdb.HRThirdPartyAccountDao;
import com.moseeker.baseorm.dao.hrdb.HrCompanyDao;
import com.moseeker.baseorm.dao.hrdb.HrSearchConditionDao;
import com.moseeker.baseorm.dao.hrdb.HrTalentpoolDao;
import com.moseeker.baseorm.dao.userdb.UserEmployeeDao;
import com.moseeker.baseorm.dao.userdb.UserHrAccountDao;
import com.moseeker.baseorm.dao.userdb.UserSearchConditionDao;
import com.moseeker.baseorm.dao.userdb.UserUserDao;
import com.moseeker.baseorm.dao.userdb.UserWxUserDao;
import com.moseeker.baseorm.db.hrdb.tables.HrCompany;
import com.moseeker.baseorm.db.hrdb.tables.records.HrCompanyRecord;
import com.moseeker.baseorm.db.hrdb.tables.records.HrSearchConditionRecord;
import com.moseeker.baseorm.db.userdb.tables.UserEmployee;
import com.moseeker.baseorm.db.userdb.tables.UserUser;
import com.moseeker.baseorm.db.userdb.tables.records.UserHrAccountRecord;
import com.moseeker.baseorm.redis.RedisClient;
import com.moseeker.baseorm.util.BeanUtils;
import com.moseeker.common.annotation.iface.CounterIface;
import com.moseeker.common.annotation.notify.UpdateEs;
import com.moseeker.common.constants.ChannelType;
import com.moseeker.common.constants.Constant;
import com.moseeker.common.constants.ConstantErrorCodeMessage;
import com.moseeker.common.exception.RedisException;
import com.moseeker.common.providerutils.ExceptionUtils;
import com.moseeker.common.providerutils.ResponseUtils;
import com.moseeker.common.util.MD5Util;
import com.moseeker.common.util.StringUtils;
import com.moseeker.common.util.query.Condition;
import com.moseeker.common.util.query.Order;
import com.moseeker.common.util.query.Query;
import com.moseeker.common.util.query.Select;
import com.moseeker.common.util.query.SelectOp;
import com.moseeker.common.util.query.ValueOp;
import com.moseeker.common.validation.ValidateUtil;
import com.moseeker.entity.EmployeeEntity;
import com.moseeker.thrift.gen.common.struct.BIZException;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.dao.struct.ThirdPartAccountData;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrTalentpoolDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserHrAccountDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserUserDO;
import com.moseeker.thrift.gen.useraccounts.struct.DownloadReport;
import com.moseeker.thrift.gen.useraccounts.struct.HrNpsResult;
import com.moseeker.thrift.gen.useraccounts.struct.HrNpsStatistic;
import com.moseeker.thrift.gen.useraccounts.struct.HrNpsUpdate;
import com.moseeker.thrift.gen.useraccounts.struct.ImportErrorUserEmployee;
import com.moseeker.thrift.gen.useraccounts.struct.SearchCondition;
import com.moseeker.thrift.gen.useraccounts.struct.UserEmployeeDetailVO;
import com.moseeker.thrift.gen.useraccounts.struct.UserEmployeeNumStatistic;
import com.moseeker.thrift.gen.useraccounts.struct.UserEmployeeVO;
import com.moseeker.thrift.gen.useraccounts.struct.UserEmployeeVOPageVO;
import com.moseeker.thrift.gen.useraccounts.struct.UserHrAccount;
import com.moseeker.useraccounts.constant.ResultMessage;
import com.moseeker.useraccounts.exception.ExceptionCategory;
import com.moseeker.useraccounts.exception.ExceptionFactory;
import com.moseeker.useraccounts.service.thirdpartyaccount.ThirdPartyAccountSynctor;

import org.apache.thrift.TException;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Resource;

/**
 * HR账号服务
 * <p>
 * <p>
 * Created by zzh on 16/5/31.
 */
@Service
@CounterIface
public class UserHrAccountService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String REDIS_KEY_HR_SMS_SIGNUP = "HR_SMS_SIGNUP";


    @Autowired
    private UserHrAccountDao userHrAccountDao;

    @Autowired
    private HrSearchConditionDao hrSearchConditionDao;

    @Autowired
    private HrTalentpoolDao hrTalentpoolDao;

    @Autowired
    private SmsSender smsSender;

    @Resource(name = "cacheClient")
    private RedisClient redisClient;

    @Autowired
    private HRThirdPartyAccountDao hrThirdPartyAccountDao;

    @Autowired
    private UserSearchConditionDao searchConditionDao;

    @Autowired
    private ThirdPartyAccountSynctor thirdPartyAccountSynctor;

    @Autowired
    private UserEmployeeDao userEmployeeDao;

    @Autowired
    private UserWxUserDao userWxUserDao;

    @Autowired
    private UserUserDao userUserDao;

    @Autowired
    private EmployeeEntity employeeEntity;


    @Autowired
    private HrCompanyDao hrCompanyDao;


    /**
     * HR在下载行业报告是注册
     *
     * @param mobile 手机号
     * @param code   验证码
     * @param source 系统区分 1:雇主 2:官网 3:微信扫描 4:我也要招人(聚合号) 5:我也要招人(企业号)
     */
    public Response sendMobileVerifiyCode(String mobile, String code, int source) throws TException {
        try {
            // HR账号验证码校验
            Response response = validateSendMobileVertifyCode(mobile, code, source);
            if (response.status > 0) {
                return response;
            }

            // 发送HR注册的验证码
            return ResponseUtils.success(smsSender.sendHrMobileVertfyCode(mobile, REDIS_KEY_HR_SMS_SIGNUP, source));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            logger.error("postUserFavoritePosition UserFavPositionRecord error: ", e);
        } finally {
            // do nothing
        }
        return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_PUT_FAILED);
    }

    /**
     * 下载行业报告，添加HR记录
     *
     * @param downloadReport
     * @return
     * @throws TException
     */
    public Response postResource(DownloadReport downloadReport) throws TException {
        try {
            ValidateUtil vu = new ValidateUtil();
            vu.addRequiredStringValidate("手机号码", downloadReport.getMobile(), null, null);
            vu.addRequiredStringValidate("验证码", downloadReport.getCode(), null, null);
            vu.addRequiredStringValidate("公司名称", downloadReport.getCompany_name(), null, null);
            String message = vu.validate();
            if (StringUtils.isNullOrEmpty(message)) {

                String redisCode = redisClient.get(Constant.APPID_ALPHADOG, REDIS_KEY_HR_SMS_SIGNUP,
                        Constant.HR_ACCOUNT_SIGNUP_SOURCE_ARRAY[downloadReport.getSource() - 1],
                        downloadReport.getMobile());
                if (!downloadReport.getCode().equals(redisCode)) {
                    return ResponseUtils.fail(ConstantErrorCodeMessage.INVALID_SMS_CODE);
                }

                String[] passwordArray = this.genPassword(null);
                // 密码生成及加密, 谨慎使用, 防止密码泄露, 有个漏洞, source不是官网以外的时候, 会生成密码, 无法告知
                UserHrAccountRecord userHrAccountRecord = new UserHrAccountRecord();
                if (downloadReport.isSetSource()) {
                    userHrAccountRecord.setSource(downloadReport.getSource());
                }
                userHrAccountRecord.setMobile(downloadReport.getMobile());
                userHrAccountRecord.setPassword(passwordArray[1]);
                userHrAccountRecord.setAccountType(2);
                userHrAccountRecord.setUsername(downloadReport.getMobile());
                if (downloadReport.isSetRegister_ip()) {
                    userHrAccountRecord.setRegisterIp(downloadReport.getRegister_ip());
                }
                if (downloadReport.isSetLast_login_ip()) {
                    userHrAccountRecord.setLastLoginIp(downloadReport.getLast_login_ip());
                }
                HrCompanyRecord companyRecord = new HrCompanyRecord();
                companyRecord.setType((byte) (1));
                if (downloadReport.isSetCompany_name()) {
                    companyRecord.setName(downloadReport.getCompany_name());
                }
                companyRecord.setSource((byte) (Constant.COMPANY_SOURCE_DOWNLOAD));
                int result = userHrAccountDao.createHRAccount(userHrAccountRecord, companyRecord);

                if (result > 0 && downloadReport.getSource() == Constant.HR_ACCOUNT_SIGNUP_SOURCE_WWW) {
                    smsSender.sendHrSmsSignUpForDownloadIndustryReport(downloadReport.getMobile(), passwordArray[0]);
                }
                if (result > 0) {
                    return ResponseUtils.success(new HashMap<String, Object>() {
                        {
                            put("userHrAccountId", result);
                        }
                    }); // 返回 userFavoritePositionId
                } else {
                    return ResponseUtils.success(result);
                }
            } else {
                return ResponseUtils.fail(ConstantErrorCodeMessage.VALIDATE_FAILED.replace("{MESSAGE}", message));
            }
        } catch (RedisException e) {
            WarnService.notify(e);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            logger.error("postUserFavoritePosition UserFavPositionRecord error: ", e);
        } finally {
            // do nothing
        }
        return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_PUT_FAILED);
    }

    /**
     * 更新HR账户信息
     *
     * @param userHrAccount 用户实体
     */
    public Response putResource(UserHrAccount userHrAccount) throws TException {
        try {
            // 必填项验证
            Response response = validatePutResource(userHrAccount);
            if (response.status > 0) {
                return response;
            }

            // 密码加密
            userHrAccount.setPassword(MD5Util.encryptSHA(userHrAccount.password));

            // 添加HR用户
            UserHrAccountRecord userHrAccountRecord = (UserHrAccountRecord) BeanUtils.structToDB(userHrAccount,
                    UserHrAccountRecord.class);

            int userHrAccountId = userHrAccountDao.updateRecord(userHrAccountRecord);
            if (userHrAccountId > 0) {
                return ResponseUtils.success(new HashMap<String, Object>() {
                    private static final long serialVersionUID = -5929607838950864392L;

                    {
                        put("userHrAccountId", userHrAccountId);
                    }
                }); // 返回 userFavoritePositionId
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            logger.error("putResource UserHrAccountRecord error: ", e);
        } finally {
            // do nothing
        }
        return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_PUT_FAILED);
    }

    /**
     * 添加HR账号验证
     *
     * @param userHrAccount hr用户实体
     */
    private Response validatePostResource(UserHrAccount userHrAccount, String code) {

        Response response = new Response(0, "ok");
        if (userHrAccount == null) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_DATA_EMPTY);
        }
        if (userHrAccount.mobile == null || userHrAccount.mobile.equals("")) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_VALIDATE_REQUIRED.replace("{0}", "mobile"));
        }
        if (userHrAccount.source <= 0 || userHrAccount.source > 5) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.HR_ACCOUNT_SIGNUP_VALIDATE_SOURCE);
        }
        if (code == null || code.equals("")) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_VALIDATE_REQUIRED.replace("{0}", "code"));
        }

        String redisCode = null;
        try {
            redisCode = redisClient.get(Constant.APPID_ALPHADOG, REDIS_KEY_HR_SMS_SIGNUP,
                    Constant.HR_ACCOUNT_SIGNUP_SOURCE_ARRAY[userHrAccount.source - 1], userHrAccount.mobile);
        } catch (RedisException e) {
            WarnService.notify(e);
        }
        // 验证码无法验证
        if (!code.equals(redisCode)) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.INVALID_SMS_CODE);
        }

        return response;
    }

    /**
     * 更新HR账号验证
     *
     * @param userHrAccount hr用户实体
     */
    private Response validatePutResource(UserHrAccount userHrAccount) {

        Response response = new Response(0, "ok");
        if (userHrAccount == null) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_DATA_EMPTY);
        }
        if (userHrAccount.id <= 0) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_VALIDATE_REQUIRED.replace("{0}", "id"));
        }
        if (userHrAccount.mobile == null || userHrAccount.mobile.equals("")) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_VALIDATE_REQUIRED.replace("{0}", "mobile"));
        }
        if (userHrAccount.password == null || userHrAccount.password.equals("")) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_VALIDATE_REQUIRED.replace("{0}", "password"));
        }
        if (userHrAccount.source <= 0 || userHrAccount.source > 5) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.HR_ACCOUNT_SIGNUP_VALIDATE_SOURCE);
        }
        return response;
    }

    /**
     * 第三方账号绑定
     *
     * @param hrId
     * @param account
     * @return
     */
    public HrThirdPartyAccountDO bindThirdAccount(int hrId, HrThirdPartyAccountDO account) throws Exception {
        logger.info("-------bindThirdAccount--------{}:{}", hrId, JSON.toJSONString(account));
        // 判断Channel是否合法
        ChannelType channelType = ChannelType.instaceFromInteger(account.getChannel());

        if (channelType == null) {
            throw new BIZException(-1, "不支持的渠道类型：" + account.getChannel());
        }

        // 判断是否需要进行帐号绑定
        Query qu = new Query.QueryBuilder().where("id", String.valueOf(hrId)).buildQuery();

        UserHrAccountDO userHrAccount = userHrAccountDao.getData(qu);

        if (userHrAccount == null || userHrAccount.getActivation() != Byte.valueOf("1") || userHrAccount.getDisable() != 1) {
            //没有找到该hr账号
            throw new BIZException(-1, "无效的HR帐号");
        }

        account.setCompanyId(userHrAccount.getCompanyId());

        int allowStatus = allowBind(userHrAccount, account);

        logger.info("bindThirdAccount allowStatus:{}", allowStatus);

        if (allowStatus > 0) {
            account.setId(allowStatus);
        }

        //allowStatus==0,绑定之后将hrId和帐号关联起来，allowStatus==1,只绑定不关联
        HrThirdPartyAccountDO result = thirdPartyAccountSynctor.bindThirdPartyAccount(allowStatus == 0 ? hrId : 0, account, true);


        return result;
    }

    /**
     * 是否允许执行绑定
     * <0,主张号已绑定，
     * 0,正常绑定，
     * >0,复用帐号
     */
    @CounterIface
    public int allowBind(UserHrAccountDO hrAccount, HrThirdPartyAccountDO thirdPartyAccount) throws Exception {

        //主账号或者没有绑定第三方账号，检查公司下该渠道已经绑定过相同的第三方账号
        Query.QueryBuilder qu = new Query.QueryBuilder();
        qu.where("company_id", thirdPartyAccount.getCompanyId());
        qu.and("channel", thirdPartyAccount.getChannel());
        qu.and("username", thirdPartyAccount.getUsername());
        qu.and(new Condition("binding", 0, ValueOp.NEQ));//有效的状态
        List<ThirdPartAccountData> datas = hrThirdPartyAccountDao.getDatas(qu.buildQuery(), ThirdPartAccountData.class);

        logger.info("allowBind:相同名字的帐号:{}", JSON.toJSONString(datas));

        ThirdPartAccountData data = null;

        for (ThirdPartAccountData d : datas) {
            ///数据库中username是不区分大小写的，如果大小写不同，那么认为不是一个账号
            if (d.getUsername().equals(thirdPartyAccount.getUsername())) {
                data = d;
                break;
            }
        }

        if (data == null || data.getId() == 0) {
            //检查该用户是否绑定了其它相同渠道的账号
            HrThirdPartyAccountDO bindingAccount = hrThirdPartyAccountDao.getThirdPartyAccountByUserId(hrAccount.getId(), thirdPartyAccount.getChannel());
            logger.info("该用户绑定渠道{}的帐号:{}", thirdPartyAccount.getChannel(), JSON.toJSONString(bindingAccount));
            if (bindingAccount != null && bindingAccount.getId() > 0 && bindingAccount.getBinding() != 0) {
                if (hrAccount.getAccountType() == 0) {
                    logger.info("主张号已经绑定该渠道第三方帐号");
                    //如果主账号已经绑定该渠道第三方账号，那么绑定人为空,并允许绑定
                    return -1;
                } else {
                    logger.info("已经绑定过该渠道第三方帐号");
                    //已经绑定该渠道第三方账号，并且不是主账号，那么不允许绑定
                    throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.HRACCOUNT_BINDING_LIMIT);
                }
            } else {
                return 0;
            }
        } else {
            //如果尝试绑定相同的帐号
            if (data.getUsername().equals(thirdPartyAccount.getUsername())) {
                if (data.getBinding() == 1 || data.getBinding() == 3 || data.getBinding() == 7) {
                    throw new BIZException(-1, "已经绑定该帐号了");
                } else if (data.getBinding() == 2 || data.getBinding() == 6) {
                    throw new BIZException(-1, "该帐号已经在绑定中了");
                } else if (data.getBinding() == 4 || data.getBinding() == 5) {
                    //重新绑定
                    logger.info("重新绑定:{}", data.getId());
                    return data.getId();
                }
            }
            logger.info("这个帐号已经被其它人绑定了");
            //公司下已经有人绑定了这个第三方账号，则这个公司谁都不能再绑定这个账号了
            if (data.getBinding() == 1) {
                throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.HRACCOUNT_ALREADY_BOUND);
            } else if (data.getBinding() == 2) {
                throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.HRACCOUNT_BINDING);
            } else {
                return 0;
            }
        }
    }


    /**
     * 同步第三方账号信息
     *
     * @param id
     * @return
     */

    public HrThirdPartyAccountDO synchronizeThirdpartyAccount(int id) throws Exception {
        //查找第三方帐号
        Query qu = new Query.QueryBuilder().where("id", id).buildQuery();
        HrThirdPartyAccountDO hrThirdPartyAccount = hrThirdPartyAccountDao.getData(qu);

        if (hrThirdPartyAccount == null || hrThirdPartyAccount.getBinding() == 0) {
            throw new BIZException(-1, "无效的第三方帐号");
        }
        //如果是绑定状态，则进行
        hrThirdPartyAccount = thirdPartyAccountSynctor.syncThirdPartyAccount(hrThirdPartyAccount, true);

        //刷新成功
        return hrThirdPartyAccount;
    }

    /**
     * HR账号验证码校验
     * <p>
     */
    private Response validateSendMobileVertifyCode(String mobile, String code, int source) {

        Response response = new Response(0, "ok");
        if (mobile == null || mobile.equals("")) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_VALIDATE_REQUIRED.replace("{0}", "mobile"));
        }
        if (code == null || code.equals("")) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_VALIDATE_REQUIRED.replace("{0}", "code"));
        }
        if (source <= 0 || source > 5) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.HR_ACCOUNT_SIGNUP_VALIDATE_SOURCE);
        }
        return response;
    }

    /**
     * 判断密码为空时生成密码 密码加密
     * <p>
     *
     * @return String[] 0:原始密码 1:加密后密码
     */
    private String[] genPassword(String passowrd) {
        String[] passwordArray = new String[2];
        String plainPassword = "8E69c6";
        if (passowrd == null || passowrd.trim().equals("")) {
            plainPassword = StringUtils.getRandomString(6);
        } else {
            plainPassword = passowrd;
        }

        passwordArray[0] = plainPassword;
        passwordArray[1] = MD5Util.encryptSHA(MD5Util.md5(plainPassword));

        return passwordArray;
    }

    /**
     * 获取常用筛选项
     *
     * @param hrAccountId
     * @param type        (0:候选人列表筛选项， 1：人才库列表筛选)
     * @return
     * @throws TException
     */
    public Response getSearchCondition(int hrAccountId, int type) {
        logger.info("UserHrAccountService - getSearchCondition ");
        Query.QueryBuilder query = new Query.QueryBuilder();
        query.where("hr_account_id", String.valueOf(hrAccountId)).and("type", String.valueOf(type));
        List<SearchCondition> list;
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        try {
            list = hrSearchConditionDao.getDatas(query.buildQuery(), SearchCondition.class);
            logger.info("UserHrAccountService - getSearchCondition  list:{}", list);
            list.forEach(sc -> {
                Map<String, Object> map = new HashMap<>();
                map.put("id", sc.getId());
                map.put("name", org.apache.commons.lang.StringUtils.defaultString(sc.getName()));
                map.put("publisher", sc.getPublisher());
                map.put("position_id", sc.getPosition_id());
                map.put("keyword", org.apache.commons.lang.StringUtils.defaultString(sc.getKeyword()));
                map.put("submit_time", org.apache.commons.lang.StringUtils.defaultString(sc.getSubmit_time()));
                map.put("work_years", sc.getWork_years());
                map.put("city_name", org.apache.commons.lang.StringUtils.defaultString(sc.getCity_name()));
                map.put("degree", org.apache.commons.lang.StringUtils.defaultString(sc.getDegree()));
                map.put("past_position", org.apache.commons.lang.StringUtils.defaultString(sc.getPast_position()));
                map.put("in_last_job_search_position", sc.getIn_last_job_search_position());
                map.put("min_age", sc.getMin_age());
                map.put("max_age", sc.getMax_age());
                map.put("intention_city_name", org.apache.commons.lang.StringUtils.defaultString(sc.getIntention_city_name()));
                map.put("sex", sc.getSex());
                map.put("intention_salary_code", org.apache.commons.lang.StringUtils.defaultString(sc.getIntention_salary_code()));
                map.put("company_name", org.apache.commons.lang.StringUtils.defaultString(sc.getCompany_name()));
                map.put("in_last_job_search_company", sc.getIn_last_job_search_company());
                map.put("hr_account_id", sc.getHr_account_id());
                map.put("update_time", sc.getUpdate_time());
                map.put("type", sc.getType());
                result.add(map);
            });
            logger.info("UserHrAccountService - getSearchCondition  result:{}", result);
            return ResponseUtils.success(result);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            logger.info("UserHrAccountService - getSearchCondition  error:{}", e);
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION);
        }
    }

    /**
     * 添加常用筛选条件
     *
     * @param searchCondition
     * @return
     */
    public Response postSearchCondition(SearchCondition searchCondition) {
        try {
            Query.QueryBuilder query = new Query.QueryBuilder();
            query.where("hr_account_id", String.valueOf(searchCondition.getHr_account_id())).and("type", String.valueOf(searchCondition.getType()));
            int row = hrSearchConditionDao.getCount(query.buildQuery());
            // 每个hr最多只能添加10条常用筛选
            if (row >= 10) {
                logger.warn("保存常用筛选失败，hr={}，已拥有{}条常用筛选项", searchCondition.getHr_account_id(), row);
                return ResponseUtils.fail("{'status':42004,'message':'添加失败，最多只能添加10条筛选项'}");
            }
            // 筛选项名字保证不重复
            query.and("name", searchCondition.getName());
            row = hrSearchConditionDao.getCount(query.buildQuery());
            if (row > 0) {
                logger.warn("保存常用筛选失败，筛选项名称={}，已存在", searchCondition.getName());
                return ResponseUtils.fail("{'status':42004,'message':'保存失败，改筛选项名称已存在'}");
            }
            int primaryKey = hrSearchConditionDao.addRecord(BeanUtils.structToDB(searchCondition, HrSearchConditionRecord.class)).getId();
            if (primaryKey > 0) {
                return ResponseUtils.success(primaryKey);
            } else {
                return ResponseUtils.fail(ConstantErrorCodeMessage.THIRD_PARTY_POSITION_UPSERT_FAILED);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION);
        }
    }

    /**
     * 删除常用筛选条件
     *
     * @param hrAccountId
     * @param id
     * @return
     */
    public Response delSearchCondition(int hrAccountId, int id) {
        int resultRow = 0;
        try {
            resultRow = hrSearchConditionDao.delResource(hrAccountId, id);
            if (resultRow > 0) {
                return ResponseUtils.success("");
            } else {
                return ResponseUtils.fail(ConstantErrorCodeMessage.THIRD_PARTY_POSITION_UPSERT_FAILED);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION);
        }
    }

    /**
     * 加入人才库
     *
     * @param hrAccountId
     * @param applierIds
     * @return
     */
    @UpdateEs(tableName = "hr_talentpool", argsIndex = 1, argsName = "user_id")
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public Response joinTalentpool(int hrAccountId, List<Integer> applierIds) {
        Query.QueryBuilder query = new Query.QueryBuilder();
        query.where("hr_account_id", String.valueOf(hrAccountId));
        int resultRow = 0;
        for (Integer applierId : applierIds) {
            query.and("applier_id", String.valueOf(applierId));
            HrTalentpoolDO talentpool = hrTalentpoolDao.getData(query.buildQuery());
            if (talentpool == null || talentpool.getId() == 0) {
                // 将用户加入人才库
                talentpool = new HrTalentpoolDO();
                talentpool.setApplierId(Integer.valueOf(applierId));
                talentpool.setHrAccountId(hrAccountId);
                resultRow += hrTalentpoolDao.addData(talentpool).getId();
            } else {
                // 将状态改为正常
                talentpool.setStatus(0);
                resultRow += hrTalentpoolDao.updateData(talentpool);
            }
        }
        if (resultRow > 0) {
            return ResponseUtils.success("");
        } else {
            return ResponseUtils.fail(ConstantErrorCodeMessage.THIRD_PARTY_POSITION_UPSERT_FAILED);
        }
    }

    /**
     * 移出人才库
     *
     * @param hrAccountId
     * @param applierIds
     * @return
     */
    @UpdateEs(tableName = "hr_talentpool", argsIndex = 1, argsName = "user_id")
    public Response shiftOutTalentpool(int hrAccountId, List<Integer> applierIds) {
        Query.QueryBuilder query = new Query.QueryBuilder();
        query.where("hr_account_id", String.valueOf(hrAccountId));
        try {
            int resultRow = 0;
            for (Integer applierId : applierIds) {
                query.and("applier_id", String.valueOf(applierId));
                HrTalentpoolDO talentpool = hrTalentpoolDao.getData(query.buildQuery());
                if (talentpool != null && talentpool.getId() > 0) {
                    // 将状态改为删除
                    talentpool.setStatus(1);
                    resultRow += hrTalentpoolDao.updateData(talentpool);
                }
            }
            if (resultRow <= 0) {
                return ResponseUtils.fail(ConstantErrorCodeMessage.THIRD_PARTY_POSITION_UPSERT_FAILED);
            } else {
                return ResponseUtils.success("");
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION);
        }
    }


    /**
     * 分页获取userHrAccount数据
     *
     * @param companyId
     * @param disable
     * @return
     */
    public Response userHrAccount(int companyId, int disable, int page, int per_age) {
        try {
            Query.QueryBuilder query = new Query.QueryBuilder();
            query.where("company_id", String.valueOf(companyId)).and("disable", String.valueOf(disable));
            query.setPageNum(page);
            query.setPageSize(per_age);
            return ResponseUtils.success(userHrAccountDao.getDatas(query.buildQuery(), UserHrAccount.class));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION);
        }
    }

    /**
     * 判断是否有权限发布职位
     *
     * @param companyId 公司编号
     * @param channel   渠道号
     * @return
     */
    public Response ifSynchronizePosition(int companyId, int channel) {
        Response response = ResultMessage.PROGRAM_EXHAUSTED.toResponse();
        Query.QueryBuilder qu = new Query.QueryBuilder();
        qu.where("company_id", String.valueOf(companyId)).and("channel", String.valueOf(channel));
        try {
            ThirdPartAccountData data = hrThirdPartyAccountDao.getData(qu.buildQuery(), ThirdPartAccountData.class);
            if (data.getId() == 0 || data.getBinding() != 1) {
                response = ResultMessage.THIRD_PARTY_ACCOUNT_UNBOUND.toResponse();
            }
            if (data.getRemain_num() == 0) {
                response = ResultMessage.THIRD_PARTY_ACCOUNT_HAVE_NO_REMAIN_NUM.toResponse();
            }
            if (data.getId() > 0 && data.binding == 1 && data.getRemain_num() > 0) {
                response = ResultMessage.SUCCESS.toResponse();
            } else {
                response = ResultMessage.THIRD_PARTY_ACCOUNT_UNBOUND.toResponse();
            }
        } catch (Exception e) {
            e.printStackTrace();
            response = ResultMessage.PROGRAM_EXHAUSTED.toResponse();
            logger.error(e.getMessage(), e);
        } finally {
            //do nothing
        }
        return response;
    }

    public HrNpsResult npsStatus(int userId, String startDate, String endDate) throws Exception {
        return userHrAccountDao.npsStatus(userId, startDate, endDate);
    }

    public HrNpsResult npsUpdate(HrNpsUpdate npsUpdate) throws Exception {
        return userHrAccountDao.npsUpdate(npsUpdate);
    }

    public HrNpsStatistic npsList(String startDate, String endDate, int page, int pageSize) throws Exception {
        return userHrAccountDao.npsList(startDate, endDate, page, pageSize);
    }

    public List<HrThirdPartyAccountDO> getThirdPartyAccounts(Query query) throws TException {
        return hrThirdPartyAccountDao.getDatas(query);
    }

    public int updateThirdPartyAccount(HrThirdPartyAccountDO account) throws BIZException, TException {
        return hrThirdPartyAccountDao.updateData(account);
    }

    /**
     * 员工列表，员工数量查询条件封装
     *
     * @param queryBuilder 查询条件
     * @param keyWord      关键字
     * @param companyId    公司ID
     * @return
     */
    public Query.QueryBuilder getQueryBuilder(Query.QueryBuilder queryBuilder, String keyWord, Integer companyId) throws BIZException {
        List<UserEmployeeDO> userEmployeeDOList = employeeEntity.getUserEmployeeDOList(companyId);
        List<Integer> sysIdsTemp = userEmployeeDOList.stream().filter(userEmployeeDO -> userEmployeeDO.getSysuserId() > 0)
                .map(userEmployeeDO -> userEmployeeDO.getSysuserId()).collect(Collectors.toList());
        Condition sysuserId = new Condition(UserUser.USER_USER.ID.getName(), sysIdsTemp, ValueOp.IN);
        Condition nickName = new Condition(UserUser.USER_USER.NICKNAME.getName(), keyWord, ValueOp.LIKE);

        Query.QueryBuilder nicknameCondition = new Query.QueryBuilder();
        nicknameCondition.where(sysuserId).and(nickName);
        List<UserUserDO> userUserDOList = userUserDao.getDatas(nicknameCondition.buildQuery());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("%");
        stringBuffer.append(keyWord);
        stringBuffer.append("%");
        List<Integer> sysIds = userUserDOList.stream().map(userUserDO -> userUserDO.getId()).collect(Collectors.toList());
        // 名字
        Condition cname = new Condition(UserEmployee.USER_EMPLOYEE.CNAME.getName(), stringBuffer.toString(), ValueOp.LIKE);
        // 自定义字段
        Condition customField = new Condition(UserEmployee.USER_EMPLOYEE.CUSTOM_FIELD.getName(), stringBuffer.toString(), ValueOp.LIKE);
        // 邮箱
        Condition email = new Condition(UserEmployee.USER_EMPLOYEE.EMAIL.getName(), stringBuffer.toString(), ValueOp.LIKE);
        // 手机号码
        Condition mobile = new Condition(UserEmployee.USER_EMPLOYEE.MOBILE.getName(), stringBuffer.toString(), ValueOp.LIKE);

        queryBuilder.andInnerCondition(cname).or(customField).or(email).or(mobile);

        if (!StringUtils.isEmptyList(userEmployeeDOList)) {
            Condition sysIdsCon = new Condition(UserEmployee.USER_EMPLOYEE.SYSUSER_ID.getName(), sysIds, ValueOp.IN);
            queryBuilder.or(sysIdsCon);
        }
        // sysuser_id
        Condition sysIdsCon = new Condition(UserEmployee.USER_EMPLOYEE.SYSUSER_ID.getName(), sysIds, ValueOp.IN);
        queryBuilder.andInnerCondition(cname).or(customField).or(email).or(mobile).or(sysIdsCon);
        return queryBuilder;
    }

    /**
     * 获取列表number
     * 通过公司ID,查询认证员工和未认证员工数量
     *
     * @param keyWord   关键字
     * @param companyId 公司ID
     * @return
     */
    public UserEmployeeNumStatistic getListNum(String keyWord, Integer companyId) throws BIZException {
        UserEmployeeNumStatistic userEmployeeNumStatistic = new UserEmployeeNumStatistic();
        userEmployeeNumStatistic.setUnregcount(0);
        userEmployeeNumStatistic.setRegcount(0);
        if (companyId == 0) {
            throw ExceptionFactory.buildException(ExceptionCategory.PROGRAM_DATA_EMPTY);
        }
        try {
            Query.QueryBuilder queryBuilder = new Query.QueryBuilder();
            queryBuilder.select(new Select(UserEmployee.USER_EMPLOYEE.ACTIVATION.getName(), SelectOp.COUNT))
                    .select(UserEmployee.USER_EMPLOYEE.ACTIVATION.getName());
            List<Integer> list = employeeEntity.getCompanyIds(companyId);
            Condition companyIdCon = new Condition(UserEmployee.USER_EMPLOYEE.COMPANY_ID.getName(), list, ValueOp.IN);
            queryBuilder.where(companyIdCon).and(UserEmployee.USER_EMPLOYEE.DISABLE.getName(), 0);
            if (!StringUtils.isEmptyObject(keyWord)) {
                getQueryBuilder(queryBuilder, keyWord, companyId);
            }
            queryBuilder.groupBy(UserEmployee.USER_EMPLOYEE.ACTIVATION.getName());
            // 查询
            List<Map<String, Object>> result = userEmployeeDao.getMaps(queryBuilder.buildQuery());
            if (!StringUtils.isEmptyList(result)) {
                for (Map<String, Object> map : result) {
                    if (map.get("activation") != null) {
                        if ((Byte) map.get("activation") == 0) {
                            userEmployeeNumStatistic.setRegcount((Integer) map.get("activation_count"));
                        } else if ((Byte) map.get("activation") == 1
                                || (Byte) map.get("activation") == 2
                                || (Byte) map.get("activation") == 3
                                || (Byte) map.get("activation") == 4) {
                            userEmployeeNumStatistic.setUnregcount(userEmployeeNumStatistic.getUnregcount() + (Integer) map.get("activation_count"));
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw ExceptionFactory.buildException(ExceptionCategory.PROGRAM_EXCEPTION);
        }
        return userEmployeeNumStatistic;
    }


    /**
     * 员工列表
     *
     * @param keyword    关键字搜索
     * @param companyId  公司ID
     * @param filter     过滤条件，0：全部，1：已认证，2：未认证,默认：0
     * @param order      排序条件
     * @param by         正序，倒序 0: 正序,1:倒序 默认
     * @param pageNumber 第几页
     * @param pageSize   每页的条数
     */
    public UserEmployeeVOPageVO employeeList(String keword, Integer companyId, Integer filter, String order, Integer by, Integer pageNumber, Integer pageSize) throws BIZException {
        UserEmployeeVOPageVO userEmployeeVOPageVO = new UserEmployeeVOPageVO();
        try {
            List<UserEmployeeVO> userEmployeeVOS = new ArrayList<>();
            Query.QueryBuilder queryBuilder = new Query.QueryBuilder();
            List<Integer> list = employeeEntity.getCompanyIds(companyId);
            Condition companyIdCon = new Condition(UserEmployee.USER_EMPLOYEE.COMPANY_ID.getName(), list, ValueOp.IN);
            queryBuilder.where(companyIdCon).and(UserEmployee.USER_EMPLOYEE.DISABLE.getName(), 0);
            // 如果有关键字，拼接关键字
            if (!StringUtils.isEmptyObject(keword)) {
                getQueryBuilder(queryBuilder, keword, companyId);
            }
            // 过滤条件
            if (filter != 0) {
                if (filter == 1) {
                    queryBuilder.and(UserEmployee.USER_EMPLOYEE.ACTIVATION.getName(), 0);
                } else if (filter == 2) {
                    List<Integer> filters = new ArrayList<>();
                    filters.add(1);
                    filters.add(2);
                    filters.add(3);
                    filters.add(4);
                    queryBuilder.and(new Condition(UserEmployee.USER_EMPLOYEE.ACTIVATION.getName(), filters, ValueOp.IN));
                }
            }
            // 排序条件
            if (!StringUtils.isEmptyObject(order)) {
                // 首先判断排序的条件是否正确
                if (!StringUtils.isEmptyObject(UserEmployee.USER_EMPLOYEE.field(order).getName())) {
                    if (by.intValue() == 0) {  // 正序
                        queryBuilder.orderBy(UserEmployee.USER_EMPLOYEE.field(order).getName(), Order.ASC);
                    } else if (by.intValue() == 1) { //倒序
                        queryBuilder.orderBy(UserEmployee.USER_EMPLOYEE.field(order).getName(), Order.DESC);
                    }
                }
            }
            // 查询总条数
            int counts = userEmployeeDao.getCount(queryBuilder.buildQuery());
            if (counts == 0) {
                throw ExceptionFactory.buildException(ExceptionCategory.USEREMPLOYEES_EMPTY);
            }
            // 默认第一页
            queryBuilder.setPageNum(pageNumber > 0 ? pageNumber : 1);
            // 默认每页15条数据
            queryBuilder.setPageSize(pageSize > 0 ? pageSize : 15);
            List<UserEmployeeDO> userEmployeeDOS = userEmployeeDao.getDatas(queryBuilder.buildQuery());
            Set<Integer> sysuserId = userEmployeeDOS.stream().filter(userUserDO -> userUserDO.getSysuserId() > 0)
                    .map(UserEmployeeDO::getSysuserId).collect(Collectors.toSet());
            queryBuilder.clear();
            queryBuilder.where(new Condition(UserUser.USER_USER.ID.getName(), sysuserId, ValueOp.IN));
            // 查询微信昵称
            List<UserUserDO> userUserDOList = userUserDao.getDatas(queryBuilder.buildQuery());
            Map<Integer, UserUserDO> userMap = userUserDOList.stream().collect(Collectors.toMap(UserUserDO::getId, Function.identity()));

            queryBuilder.clear();
            queryBuilder.where(new Condition(HrCompany.HR_COMPANY.ID.getName(), list, ValueOp.IN));
            List<HrCompanyDO> companyList = hrCompanyDao.getDatas(queryBuilder.buildQuery());
            // 查询公司信息
            Map<Integer, HrCompanyDO> companyMap = companyList.stream().collect(Collectors.toMap(HrCompanyDO::getId, Function.identity()));
            if (!StringUtils.isEmptyList(userEmployeeDOS)) {
                for (UserEmployeeDO userEmployeeDO : userEmployeeDOS) {
                    UserEmployeeVO userEmployeeVO = new UserEmployeeVO();
                    userEmployeeVO.setId(userEmployeeDO.getId());
                    userEmployeeVO.setUsername(userEmployeeDO.getCname());
                    userEmployeeVO.setMobile(userEmployeeDO.getMobile());
                    userEmployeeVO.setEmail(userEmployeeDO.getEmail());
                    userEmployeeVO.setCustomField(userEmployeeDO.getCustomField());
                    // 微信昵称
                    if (!StringUtils.isEmptyObject(userMap) && !StringUtils.isEmptyObject(userMap.get(userEmployeeDO.getSysuserId()))) {
                        userEmployeeVO.setNickName(userMap.get(userEmployeeDO.getSysuserId()).getNickname());
                    } else {
                        userEmployeeVO.setNickName("未知");
                    }
                    // 公司名称
                    if (!StringUtils.isEmptyObject(companyMap) && !StringUtils.isEmptyObject(companyMap.get(userEmployeeDO.getCompanyId()))) {
                        userEmployeeVO.setCompanyName(companyMap.get(userEmployeeDO.getCompanyId()).getName());
                    }
                    userEmployeeVO.setActivation((new Double(userEmployeeDO.getActivation())).intValue());
                    userEmployeeVO.setAward(userEmployeeDO.getAward());
                    userEmployeeVO.setBindingTime(userEmployeeDO.getBindingTime());
                    userEmployeeVOS.add(userEmployeeVO);
                }
                userEmployeeVOPageVO.setData(userEmployeeVOS);
                userEmployeeVOPageVO.setPageSize(pageSize);
                userEmployeeVOPageVO.setPageNumber(pageNumber);
                userEmployeeVOPageVO.setTotalRow(counts);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw ExceptionFactory.buildException(ExceptionCategory.PROGRAM_EXCEPTION);
        }
        return userEmployeeVOPageVO;
    }

    /**
     * 员工信息导出
     *
     * @param userEmployees 员工ID列表
     * @return
     */
    public List<UserEmployeeVO> employeeExport(List<Integer> userEmployees) throws BIZException {
        List<UserEmployeeVO> userEmployeeVOS = new ArrayList<>();
        try {
            if (!StringUtils.isEmptyObject(userEmployees)) {
                Query.QueryBuilder queryBuilder = new Query.QueryBuilder();
                queryBuilder.where(new Condition(UserEmployee.USER_EMPLOYEE.ID.getName(), userEmployees, ValueOp.IN));
                // 员工列表
                List<UserEmployeeDO> list = userEmployeeDao.getDatas(queryBuilder.buildQuery());
                if (StringUtils.isEmptyObject(list)) {
                    throw ExceptionFactory.buildException(ExceptionCategory.USEREMPLOYEES_WRONG);
                }
                Set<Integer> sysuserId = list.stream().filter(userUserDO -> userUserDO.getSysuserId() > 0)
                        .map(UserEmployeeDO::getSysuserId).collect(Collectors.toSet());
                queryBuilder.clear();
                queryBuilder.where(new Condition(UserUser.USER_USER.ID.getName(), sysuserId, ValueOp.IN));
                // 查询微信昵称
                List<UserUserDO> userUserDOList = userUserDao.getDatas(queryBuilder.buildQuery());
                Map<Integer, UserUserDO> userMap = userUserDOList.stream().collect(Collectors.toMap(UserUserDO::getId, Function.identity()));

                // 公司ID列表
                Set<Integer> companyIds = list.stream().filter(userEmployeeDO -> userEmployeeDO.getCompanyId() > 0)
                        .map(userEmployeeDO -> userEmployeeDO.getCompanyId()).collect(Collectors.toSet());

                queryBuilder.clear();
                queryBuilder.where(new Condition(HrCompany.HR_COMPANY.ID.getName(), companyIds, ValueOp.IN));
                List<HrCompanyDO> companyList = hrCompanyDao.getDatas(queryBuilder.buildQuery());
                // 查询公司信息
                Map<Integer, HrCompanyDO> companyMap = companyList.stream().collect(Collectors.toMap(HrCompanyDO::getId, Function.identity()));
                for (UserEmployeeDO userEmployeeDO : list) {
                    UserEmployeeVO userEmployeeVO = new UserEmployeeVO();
                    userEmployeeVO.setId(userEmployeeDO.getId());
                    userEmployeeVO.setUsername(userEmployeeDO.getCname());
                    userEmployeeVO.setMobile(userEmployeeDO.getMobile());
                    userEmployeeVO.setCustomField(userEmployeeDO.getCustomField());
                    userEmployeeVO.setEmail(userEmployeeDO.getEmail());
                    if (!StringUtils.isEmptyObject(userMap) && !StringUtils.isEmptyObject(userMap.get(userEmployeeDO.getSysuserId()))) {
                        userEmployeeVO.setNickName(userMap.get(userEmployeeDO.getSysuserId()).getNickname());
                    } else {
                        userEmployeeVO.setNickName("未知");
                    }
                    // 公司名称
                    if (!StringUtils.isEmptyObject(companyMap) && !StringUtils.isEmptyObject(companyMap.get(userEmployeeDO.getCompanyId()))) {
                        userEmployeeVO.setCompanyName(companyMap.get(userEmployeeDO.getCompanyId()).getName());
                    }
                    userEmployeeVO.setActivation((new Double(userEmployeeDO.getActivation())).intValue());
                    userEmployeeVO.setAward(userEmployeeDO.getAward());
                    userEmployeeVO.setBindingTime(userEmployeeDO.getCreateTime());
                    userEmployeeVOS.add(userEmployeeVO);
                }
            } else {
                throw ExceptionFactory.buildException(ExceptionCategory.USEREMPLOYEES_DATE_EMPTY);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw ExceptionFactory.buildException(ExceptionCategory.PROGRAM_EXCEPTION);
        }
        return userEmployeeVOS;
    }


    /**
     * 员工信息导入
     *
     * @param userEmployeeList 员工信息列表
     * @param companyId        公司ID
     */
    public Response employeeImport(Integer companyId, List<UserEmployeeDO> userEmployeeList) throws BIZException {
        Response response = new Response();
        logger.info("开始导入员工信息");
        try {
//            // 判断是否有重复数据
//            if (repetitionFilter(userEmployeeList, companyId)) {
//
//            }

            // 查询公司ID是否设置正确
            Query.QueryBuilder queryBuilder = new Query.QueryBuilder();
            queryBuilder.where(HrCompany.HR_COMPANY.ID.getName(), companyId);
            HrCompanyDO company = hrCompanyDao.getData(queryBuilder.buildQuery());
            // 公司ID设置错误
            if (StringUtils.isEmptyObject(company)) {
                return ResponseUtils.fail(ConstantErrorCodeMessage.COMPANY_ID_ISNOTEXIST);
            }
            // 通过手机号查询那些员工数据是更新，那些数据是新增
            List<String> moblies = new ArrayList<>();
            userEmployeeList.forEach(userEmployeeDO -> {
                if (!StringUtils.isEmptyObject(userEmployeeDO.getMobile())) {
                    moblies.add(userEmployeeDO.getMobile());
                }
            });
            Condition condition = new Condition(UserEmployee.USER_EMPLOYEE.MOBILE.getName(), moblies, ValueOp.IN);
            queryBuilder.clear();
            queryBuilder.where(UserEmployee.USER_EMPLOYEE.COMPANY_ID.getName(), companyId).and(condition);
            // 数据库中已经有的员工列表
            List<UserEmployeeDO> userEmployeeDOS = userEmployeeDao.getDatas(queryBuilder.buildQuery());
            List<UserEmployeeDO> updateUserEmployee = new ArrayList<>();
            if (!StringUtils.isEmptyList(userEmployeeDOS)) {
                // 查询出需要更新的数据
                for (UserEmployeeDO userEmployeeDOTemp : userEmployeeList) {
                    for (UserEmployeeDO user : userEmployeeDOS) {
                        if (userEmployeeDOTemp.getMobile().equals(user.getMobile())) {
                            userEmployeeDOTemp.setId(user.getId());
                            updateUserEmployee.add(userEmployeeDOTemp);
                        }
                    }
                }
                if (!StringUtils.isEmptyList(updateUserEmployee)) {
                    // 更新数据
                    userEmployeeDao.updateDatas(updateUserEmployee);
                    // 去掉需要更新的数据
                    userEmployeeList.removeAll(updateUserEmployee);
                }
            }
            // 新增数据
            if (!StringUtils.isEmptyList(userEmployeeList)) {
                userEmployeeDao.addAllData(userEmployeeList);
                response = ResultMessage.SUCCESS.toResponse();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw ExceptionFactory.buildException(ExceptionCategory.PROGRAM_EXCEPTION);
        }
        logger.info("导入员工信息结束");
        return response;
    }


    /**
     * 检查员工重复(批量导入之前验证)
     *
     * @param userEmployeeDOS
     * @param companyId
     * @return
     */
    public Response checkBatchInsert(List<UserEmployeeDO> userEmployeeDOS, Integer companyId) throws BIZException {
        Response response = new Response();
        try {


        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw ExceptionFactory.buildException(ExceptionCategory.PROGRAM_EXCEPTION);
        }
        return response;
    }

    /**
     * 查询是否有重复数据
     *
     * @param userEmployeeDOS
     * @param companyId
     */
    public void repetitionFilter(List<UserEmployeeDO> userEmployeeDOS, Integer companyId) {
        Query.QueryBuilder queryBuilder = new Query.QueryBuilder();
        queryBuilder.where(UserEmployee.USER_EMPLOYEE.COMPANY_ID.getName(), companyId)
                .and(UserEmployee.USER_EMPLOYEE.DISABLE.getName(), 0);
        // 数据库中取出来的数据
        List<UserEmployeeDO> dbEmployeeDOList = userEmployeeDao.getDatas(queryBuilder.buildQuery());
        // 重复的对象
        List<ImportErrorUserEmployee> repetitionObj = new ArrayList<>();
        // 错误的对象
        List<UserEmployeeDO> errorObj = new ArrayList<>();
        int repetitionCounts = 0;
        if (StringUtils.isEmptyList(dbEmployeeDOList)) {
            for (UserEmployeeDO userEmployeeDO : userEmployeeDOS) {
                ImportErrorUserEmployee importErrorUserEmployee = new ImportErrorUserEmployee();
                // 判断上传的数据是否有字段长度的错误
                // 姓名不能为空
                if (StringUtils.isEmptyObject(userEmployeeDO.getCname())) {
                    importErrorUserEmployee.setUserEmployeeDO(userEmployeeDO);
                    importErrorUserEmployee.setMessage("cname不能为空");
                    errorObj.add(userEmployeeDO);
                    continue;
                }
                for (UserEmployeeDO dbUserEmployeeDO : dbEmployeeDOList) {
                    // 非自定义员工,忽略检查
                    if (StringUtils.isEmptyObject(dbUserEmployeeDO.getCustomField())
                            || StringUtils.isEmptyObject(dbUserEmployeeDO.getCname())) {
                        continue;
                    }
                    if (StringUtils.isEmptyObject(userEmployeeDO.getCustomField())) {
                        continue;
                    }
                    // 当提交的数据和数据库中的数据，cname和customField都相等时候，认为是重复数据
                    if (userEmployeeDO.getCname().equals(dbUserEmployeeDO.getCname())
                            && userEmployeeDO.getCustomField().equals(dbUserEmployeeDO.getCustomField())) {
                        repetitionCounts = repetitionCounts + 1;
                        importErrorUserEmployee.setUserEmployeeDO(userEmployeeDO);
                        importErrorUserEmployee.setMessage("cname和customField和数据中的数据一致");
                        repetitionObj.add(importErrorUserEmployee);
                    }
                }
            }
        }
    }


    /**
     * 员工信息
     *
     * @param userEmployeeId 员工ID
     */
    public UserEmployeeDetailVO userEmployeeDetail(Integer userEmployeeId) throws BIZException {
        UserEmployeeDetailVO userEmployeeDetailVO = new UserEmployeeDetailVO();
        try {
            Query.QueryBuilder queryBuilder = new Query.QueryBuilder();
            queryBuilder.where(UserEmployee.USER_EMPLOYEE.ID.getName(), userEmployeeId);
            // 员工基本信息
            UserEmployeeDO userEmployeeDO = userEmployeeDao.getData(queryBuilder.buildQuery());
            if (StringUtils.isEmptyObject(userEmployeeDO)) {
                throw ExceptionFactory.buildException(ExceptionCategory.USEREMPLOYEES_WRONG);
            }
            userEmployeeDetailVO.setId(userEmployeeDO.getId());
            userEmployeeDetailVO.setUsername(userEmployeeDO.getCname());
            userEmployeeDetailVO.setMobile(userEmployeeDO.getMobile());
            userEmployeeDetailVO.setCustomField(userEmployeeDO.getCustomField());
            userEmployeeDetailVO.setEmail(userEmployeeDO.getEmail());
            userEmployeeDetailVO.setActivation((new Double(userEmployeeDO.getActivation())).intValue());
            // 查询微信信息
            if (userEmployeeDO.getSysuserId() > 0) {
                queryBuilder.clear();
                queryBuilder.where(UserUser.USER_USER.ID.getName(), userEmployeeDO.getSysuserId());
                UserUserDO userUserDO = userUserDao.getData(queryBuilder.buildQuery());
                if (!StringUtils.isEmptyObject(userUserDO)) {
                    userEmployeeDetailVO.setNickName(userUserDO.getNickname());
                    userEmployeeDetailVO.setHeadImg(userUserDO.getHeadimg());
                }
            }
            // 查询公司信息
            if (userEmployeeDO.getCompanyId() > 0) {
                queryBuilder.clear();
                queryBuilder.where(HrCompany.HR_COMPANY.ID.getName(), userEmployeeDO.getCompanyId());
                HrCompanyDO hrCompanyDO = hrCompanyDao.getData(queryBuilder.buildQuery());
                if (!StringUtils.isEmptyObject(hrCompanyDO)) {
                    userEmployeeDetailVO.setCompanyName(hrCompanyDO.getName());
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw ExceptionFactory.buildException(ExceptionCategory.PROGRAM_EXCEPTION);
        }
        return userEmployeeDetailVO;
    }

    /**
     * 编辑公司员工信息
     *
     * @param cname       姓名
     * @param mobile      手机号
     * @param email       邮箱
     * @param customField 自定义字段
     * @param id          user_employee.id
     * @return
     * @throws BIZException
     */
    public Response updateUserEmployee(String cname, String mobile, String email, String customField, Integer userEmployeeId) throws BIZException {
        Response response = new Response();
        if (StringUtils.isEmptyObject(userEmployeeId)) {
            throw ExceptionFactory.buildException(ExceptionCategory.USEREMPLOYEES_DATE_EMPTY);
        }
        try {
            UserEmployeeDO userEmployeeDO = new UserEmployeeDO();
            if (!StringUtils.isEmptyObject(cname)) {
                userEmployeeDO.setCname(cname);
            }
            if (!StringUtils.isEmptyObject(mobile)) {
                userEmployeeDO.setMobile(mobile);
            }
            if (!StringUtils.isEmptyObject(customField)) {
                userEmployeeDO.setCustomField(customField);
            }
            if (!StringUtils.isEmptyObject(email)) {
                userEmployeeDO.setEmail(email);
            }
            userEmployeeDO.setId(userEmployeeId);
            int i = userEmployeeDao.updateData(userEmployeeDO);
            if (i > 0) {
                response = ResultMessage.SUCCESS.toResponse();
            } else {
                response = ResultMessage.PROGRAM_EXCEPTION.toResponse();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw ExceptionFactory.buildException(ExceptionCategory.PROGRAM_EXCEPTION);
        }
        return response;
    }


}
