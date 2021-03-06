/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 职位招聘流程绑定表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionAtsProcess implements Serializable {

    private static final long serialVersionUID = 2105367452;

    private Integer   id;
    private Integer   pid;
    private Integer   processId;
    private Timestamp createTime;
    private Timestamp updateTime;

    public JobPositionAtsProcess() {}

    public JobPositionAtsProcess(JobPositionAtsProcess value) {
        this.id = value.id;
        this.pid = value.pid;
        this.processId = value.processId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public JobPositionAtsProcess(
        Integer   id,
        Integer   pid,
        Integer   processId,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.pid = pid;
        this.processId = processId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getProcessId() {
        return this.processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
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
        StringBuilder sb = new StringBuilder("JobPositionAtsProcess (");

        sb.append(id);
        sb.append(", ").append(pid);
        sb.append(", ").append(processId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
