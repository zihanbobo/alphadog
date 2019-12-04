/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 公司账号数量配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyAccountConf implements Serializable {

    private static final long serialVersionUID = -1211108290;

    private Integer   id;
    private Integer   companyId;
    private String    roleType;
    private Integer   accountLimit;
    private Timestamp createTime;
    private Timestamp updateTime;

    public HrCompanyAccountConf() {}

    public HrCompanyAccountConf(HrCompanyAccountConf value) {
        this.id = value.id;
        this.companyId = value.companyId;
        this.roleType = value.roleType;
        this.accountLimit = value.accountLimit;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public HrCompanyAccountConf(
        Integer   id,
        Integer   companyId,
        String    roleType,
        Integer   accountLimit,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.companyId = companyId;
        this.roleType = roleType;
        this.accountLimit = accountLimit;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getRoleType() {
        return this.roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public Integer getAccountLimit() {
        return this.accountLimit;
    }

    public void setAccountLimit(Integer accountLimit) {
        this.accountLimit = accountLimit;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrCompanyAccountConf (");

        sb.append(id);
        sb.append(", ").append(companyId);
        sb.append(", ").append(roleType);
        sb.append(", ").append(accountLimit);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
