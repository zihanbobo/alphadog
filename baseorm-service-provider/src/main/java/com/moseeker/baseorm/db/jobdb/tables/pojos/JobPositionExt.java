/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 职位信息扩展表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionExt implements Serializable {

    private static final long serialVersionUID = -403234472;

    private Integer   pid;
    private Integer   jobCustomId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   jobOccupationId;
    private String    extra;
    private Integer   alipayJobId;

    public JobPositionExt() {}

    public JobPositionExt(JobPositionExt value) {
        this.pid = value.pid;
        this.jobCustomId = value.jobCustomId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.jobOccupationId = value.jobOccupationId;
        this.extra = value.extra;
        this.alipayJobId = value.alipayJobId;
    }

    public JobPositionExt(
        Integer   pid,
        Integer   jobCustomId,
        Timestamp createTime,
        Timestamp updateTime,
        Integer   jobOccupationId,
        String    extra,
        Integer   alipayJobId
    ) {
        this.pid = pid;
        this.jobCustomId = jobCustomId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.jobOccupationId = jobOccupationId;
        this.extra = extra;
        this.alipayJobId = alipayJobId;
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getJobCustomId() {
        return this.jobCustomId;
    }

    public void setJobCustomId(Integer jobCustomId) {
        this.jobCustomId = jobCustomId;
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

    public Integer getJobOccupationId() {
        return this.jobOccupationId;
    }

    public void setJobOccupationId(Integer jobOccupationId) {
        this.jobOccupationId = jobOccupationId;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Integer getAlipayJobId() {
        return this.alipayJobId;
    }

    public void setAlipayJobId(Integer alipayJobId) {
        this.alipayJobId = alipayJobId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JobPositionExt (");

        sb.append(pid);
        sb.append(", ").append(jobCustomId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(jobOccupationId);
        sb.append(", ").append(extra);
        sb.append(", ").append(alipayJobId);

        sb.append(")");
        return sb.toString();
    }
}
