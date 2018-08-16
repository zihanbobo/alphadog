/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 邮件日志
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogTalentpoolEmailLog implements Serializable {

    private static final long serialVersionUID = 1437059180;

    private Integer   id;
    private Integer   companyId;
    private Integer   type;
    private Integer   hrId;
    private Integer   balance;
    private Integer   lost;
    private Timestamp createTime;

    public LogTalentpoolEmailLog() {}

    public LogTalentpoolEmailLog(LogTalentpoolEmailLog value) {
        this.id = value.id;
        this.companyId = value.companyId;
        this.type = value.type;
        this.hrId = value.hrId;
        this.balance = value.balance;
        this.lost = value.lost;
        this.createTime = value.createTime;
    }

    public LogTalentpoolEmailLog(
        Integer   id,
        Integer   companyId,
        Integer   type,
        Integer   hrId,
        Integer   balance,
        Integer   lost,
        Timestamp createTime
    ) {
        this.id = id;
        this.companyId = companyId;
        this.type = type;
        this.hrId = hrId;
        this.balance = balance;
        this.lost = lost;
        this.createTime = createTime;
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

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getHrId() {
        return this.hrId;
    }

    public void setHrId(Integer hrId) {
        this.hrId = hrId;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getLost() {
        return this.lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LogTalentpoolEmailLog (");

        sb.append(id);
        sb.append(", ").append(companyId);
        sb.append(", ").append(type);
        sb.append(", ").append(hrId);
        sb.append(", ").append(balance);
        sb.append(", ").append(lost);
        sb.append(", ").append(createTime);

        sb.append(")");
        return sb.toString();
    }
}
