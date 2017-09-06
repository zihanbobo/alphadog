package com.moseeker.useraccounts.service.impl;

import com.moseeker.common.util.query.Condition;
import com.moseeker.common.util.query.Query;
import com.moseeker.common.util.query.ValueOp;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrEmployeeCertConfDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO;
import com.moseeker.thrift.gen.employee.struct.BindingParams;
import com.moseeker.useraccounts.service.EmployeeBinder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Service;

/**
 * Created by lucky8987 on 17/6/29.
 */
@Service("auth_method_customfield")
public class EmployeeBindByCustomfield extends EmployeeBinder {

    private ThreadLocal<UserEmployeeDO> employeeThreadLocal = new ThreadLocal<>();

    @Override
    protected void paramCheck(BindingParams bindingParams, HrEmployeeCertConfDO certConf) throws Exception {
        Query.QueryBuilder query = new Query.QueryBuilder();
        query.where(new Condition("company_id", employeeEntity.getCompanyIds(bindingParams.getCompanyId()), ValueOp.IN))
                .and("cname", bindingParams.getName())
                .and("custom_field", bindingParams.getCustomField())
                .and("disable", "0");

        employeeThreadLocal.set(employeeDao.getData(query.buildQuery()));
        if (employeeThreadLocal.get() == null || employeeThreadLocal.get().getId() == 0) {
            throw new RuntimeException("员工认证信息不正确");
        } else if (employeeThreadLocal.get().getActivation() == 0) {
            throw new RuntimeException("该员工已绑定");
        }
    }

    @Override
    protected UserEmployeeDO createEmployee(BindingParams bindingParams) {
        UserEmployeeDO userEmployeeDO = userEmployeeDOThreadLocal.get();
        if (employeeThreadLocal.get().getSysuserId() == 0) { // sysuserId =  0 说明员工信息是批量上传的未设置user_id
            if (userEmployeeDOThreadLocal.get() != null && userEmployeeDOThreadLocal.get().getId() != 0) {
                userEmployeeDO = userEmployeeDOThreadLocal.get();
            } else {
                userEmployeeDO = employeeThreadLocal.get();
            }
        } else if (employeeThreadLocal.get().getSysuserId() == bindingParams.getUserId()) {
            if (userEmployeeDOThreadLocal.get() != null && userEmployeeDOThreadLocal.get().getId() != 0) {
                userEmployeeDO = userEmployeeDOThreadLocal.get();
            }
        } else {  // 说明 employee.user_id != bindingParams.user_id 用户提供的信息与员工信息不匹配
            throw new RuntimeException("员工认证信息不匹配");
        }
        userEmployeeDO.setCompanyId(bindingParams.getCompanyId());
        userEmployeeDO.setEmployeeid(org.apache.commons.lang.StringUtils.defaultIfBlank(bindingParams.getMobile(), ""));
        userEmployeeDO.setSysuserId(bindingParams.getUserId());
        userEmployeeDO.setCname(bindingParams.getName());
        userEmployeeDO.setMobile(bindingParams.getMobile());
        userEmployeeDO.setEmail(bindingParams.getEmail());
        userEmployeeDO.setWxuserId(wxEntity.getWxuserId(bindingParams.getUserId(), bindingParams.getCompanyId()));
        userEmployeeDO.setAuthMethod((byte)bindingParams.getType().getValue());
        userEmployeeDO.setActivation((byte)0);
        userEmployeeDO.setCreateTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        userEmployeeDO.setBindingTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        return userEmployeeDO;
    }
}
