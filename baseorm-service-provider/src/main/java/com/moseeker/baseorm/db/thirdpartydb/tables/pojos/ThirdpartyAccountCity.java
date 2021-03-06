/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 第三方渠道的可发布职位的地区
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThirdpartyAccountCity implements Serializable {

    private static final long serialVersionUID = -1674494660;

    private Integer   id;
    private Integer   accountId;
    private Integer   code;
    private Byte      jobtype;
    private Integer   remainNum;
    private Timestamp createTime;
    private Timestamp updateTime;

    public ThirdpartyAccountCity() {}

    public ThirdpartyAccountCity(ThirdpartyAccountCity value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.code = value.code;
        this.jobtype = value.jobtype;
        this.remainNum = value.remainNum;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ThirdpartyAccountCity(
        Integer   id,
        Integer   accountId,
        Integer   code,
        Byte      jobtype,
        Integer   remainNum,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.accountId = accountId;
        this.code = code;
        this.jobtype = jobtype;
        this.remainNum = remainNum;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Byte getJobtype() {
        return this.jobtype;
    }

    public void setJobtype(Byte jobtype) {
        this.jobtype = jobtype;
    }

    public Integer getRemainNum() {
        return this.remainNum;
    }

    public void setRemainNum(Integer remainNum) {
        this.remainNum = remainNum;
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
        StringBuilder sb = new StringBuilder("ThirdpartyAccountCity (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(code);
        sb.append(", ").append(jobtype);
        sb.append(", ").append(remainNum);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
