/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 角色的应用权限
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserHrRoleApp implements Serializable {

    private static final long serialVersionUID = -706141872;

    private Integer   id;
    private Integer   roleId;
    private Integer   appId;
    private Integer   companyId;
    private Byte      enable;
    private Timestamp createTime;
    private String    creator;
    private Timestamp updateTime;
    private String    updator;

    public UserHrRoleApp() {}

    public UserHrRoleApp(UserHrRoleApp value) {
        this.id = value.id;
        this.roleId = value.roleId;
        this.appId = value.appId;
        this.companyId = value.companyId;
        this.enable = value.enable;
        this.createTime = value.createTime;
        this.creator = value.creator;
        this.updateTime = value.updateTime;
        this.updator = value.updator;
    }

    public UserHrRoleApp(
        Integer   id,
        Integer   roleId,
        Integer   appId,
        Integer   companyId,
        Byte      enable,
        Timestamp createTime,
        String    creator,
        Timestamp updateTime,
        String    updator
    ) {
        this.id = id;
        this.roleId = roleId;
        this.appId = appId;
        this.companyId = companyId;
        this.enable = enable;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updator = updator;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAppId() {
        return this.appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Byte getEnable() {
        return this.enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdator() {
        return this.updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserHrRoleApp (");

        sb.append(id);
        sb.append(", ").append(roleId);
        sb.append(", ").append(appId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(enable);
        sb.append(", ").append(createTime);
        sb.append(", ").append(creator);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(updator);

        sb.append(")");
        return sb.toString();
    }
}
