/*
 * This file is generated by jOOQ.
 */
package com.moseeker.baseorm.db.jobdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 招聘进度和具体申请对应表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationAtsProcess implements Serializable {

    private static final long serialVersionUID = -202036327;

    private Integer   id;
    private Integer   processId;
    private Integer   appId;
    private Timestamp createTime;
    private Timestamp updateTime;

    public JobApplicationAtsProcess() {}

    public JobApplicationAtsProcess(JobApplicationAtsProcess value) {
        this.id = value.id;
        this.processId = value.processId;
        this.appId = value.appId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public JobApplicationAtsProcess(
            Integer   id,
            Integer   processId,
            Integer   appId,
            Timestamp createTime,
            Timestamp updateTime
    ) {
        this.id = id;
        this.processId = processId;
        this.appId = appId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProcessId() {
        return this.processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public Integer getAppId() {
        return this.appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
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
        StringBuilder sb = new StringBuilder("JobApplicationAtsProcess (");

        sb.append(id);
        sb.append(", ").append(processId);
        sb.append(", ").append(appId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
