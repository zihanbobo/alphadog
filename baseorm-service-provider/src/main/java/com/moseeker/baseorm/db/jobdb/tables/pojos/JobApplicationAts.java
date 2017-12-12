/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * MoSeeker与ATS渠道申请编号对应关系
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationAts implements Serializable {

    private static final long serialVersionUID = -2124325086;

    private Integer   appId;
    private Integer   companyId;
    private String    atsAppId;
    private Timestamp createTime;
    private Timestamp updateTime;

    public JobApplicationAts() {}

    public JobApplicationAts(JobApplicationAts value) {
        this.appId = value.appId;
        this.companyId = value.companyId;
        this.atsAppId = value.atsAppId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public JobApplicationAts(
        Integer   appId,
        Integer   companyId,
        String    atsAppId,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.appId = appId;
        this.companyId = companyId;
        this.atsAppId = atsAppId;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public String getAtsAppId() {
        return this.atsAppId;
    }

    public void setAtsAppId(String atsAppId) {
        this.atsAppId = atsAppId;
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
        StringBuilder sb = new StringBuilder("JobApplicationAts (");

        sb.append(appId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(atsAppId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
