/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 简历被转发记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogEmailProfileSendLog implements Serializable {

    private static final long serialVersionUID = -1258576894;

    private Integer   id;
    private String    email;
    private Integer   userId;
    private Integer   type;
    private Timestamp createTime;
    private Integer   companyId;

    public LogEmailProfileSendLog() {}

    public LogEmailProfileSendLog(LogEmailProfileSendLog value) {
        this.id = value.id;
        this.email = value.email;
        this.userId = value.userId;
        this.type = value.type;
        this.createTime = value.createTime;
        this.companyId = value.companyId;
    }

    public LogEmailProfileSendLog(
        Integer   id,
        String    email,
        Integer   userId,
        Integer   type,
        Timestamp createTime,
        Integer   companyId
    ) {
        this.id = id;
        this.email = email;
        this.userId = userId;
        this.type = type;
        this.createTime = createTime;
        this.companyId = companyId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LogEmailProfileSendLog (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(userId);
        sb.append(", ").append(type);
        sb.append(", ").append(createTime);
        sb.append(", ").append(companyId);

        sb.append(")");
        return sb.toString();
    }
}
