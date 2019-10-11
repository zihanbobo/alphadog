/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 职位申请备注沟通信息总览关系
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationCommunicationCenter implements Serializable {

    private static final long serialVersionUID = 131755691;

    private Integer   id;
    private Byte      communicationType;
    private Integer   communicationId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   jobApplicationId;
    private Byte      communicationStatus;

    public JobApplicationCommunicationCenter() {}

    public JobApplicationCommunicationCenter(JobApplicationCommunicationCenter value) {
        this.id = value.id;
        this.communicationType = value.communicationType;
        this.communicationId = value.communicationId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.jobApplicationId = value.jobApplicationId;
        this.communicationStatus = value.communicationStatus;
    }

    public JobApplicationCommunicationCenter(
        Integer   id,
        Byte      communicationType,
        Integer   communicationId,
        Timestamp createTime,
        Timestamp updateTime,
        Integer   jobApplicationId,
        Byte      communicationStatus
    ) {
        this.id = id;
        this.communicationType = communicationType;
        this.communicationId = communicationId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.jobApplicationId = jobApplicationId;
        this.communicationStatus = communicationStatus;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getCommunicationType() {
        return this.communicationType;
    }

    public void setCommunicationType(Byte communicationType) {
        this.communicationType = communicationType;
    }

    public Integer getCommunicationId() {
        return this.communicationId;
    }

    public void setCommunicationId(Integer communicationId) {
        this.communicationId = communicationId;
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

    public Integer getJobApplicationId() {
        return this.jobApplicationId;
    }

    public void setJobApplicationId(Integer jobApplicationId) {
        this.jobApplicationId = jobApplicationId;
    }

    public Byte getCommunicationStatus() {
        return this.communicationStatus;
    }

    public void setCommunicationStatus(Byte communicationStatus) {
        this.communicationStatus = communicationStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JobApplicationCommunicationCenter (");

        sb.append(id);
        sb.append(", ").append(communicationType);
        sb.append(", ").append(communicationId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(jobApplicationId);
        sb.append(", ").append(communicationStatus);

        sb.append(")");
        return sb.toString();
    }
}
