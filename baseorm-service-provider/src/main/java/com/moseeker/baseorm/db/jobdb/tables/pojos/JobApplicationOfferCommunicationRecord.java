/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationOfferCommunicationRecord implements Serializable {

    private static final long serialVersionUID = 857450145;

    private Integer   id;
    private String    content;
    private Byte      creatorType;
    private Integer   creatorId;
    private Timestamp createTime;
    private Timestamp updateTime;

    public JobApplicationOfferCommunicationRecord() {}

    public JobApplicationOfferCommunicationRecord(JobApplicationOfferCommunicationRecord value) {
        this.id = value.id;
        this.content = value.content;
        this.creatorType = value.creatorType;
        this.creatorId = value.creatorId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public JobApplicationOfferCommunicationRecord(
        Integer   id,
        String    content,
        Byte      creatorType,
        Integer   creatorId,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.content = content;
        this.creatorType = creatorType;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getCreatorType() {
        return this.creatorType;
    }

    public void setCreatorType(Byte creatorType) {
        this.creatorType = creatorType;
    }

    public Integer getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
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
        StringBuilder sb = new StringBuilder("JobApplicationOfferCommunicationRecord (");

        sb.append(id);
        sb.append(", ").append(content);
        sb.append(", ").append(creatorType);
        sb.append(", ").append(creatorId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
