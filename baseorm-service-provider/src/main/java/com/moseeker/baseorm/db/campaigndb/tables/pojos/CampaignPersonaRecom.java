/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.campaigndb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 推送职位表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CampaignPersonaRecom implements Serializable {

    private static final long serialVersionUID = 1947274711;

    private Integer   id;
    private Integer   userId;
    private Integer   companyId;
    private Integer   positionId;
    private Timestamp createTime;
    private Timestamp sendTime;
    private Byte      isSend;
    private Timestamp updateTime;
    private Byte      type;

    public CampaignPersonaRecom() {}

    public CampaignPersonaRecom(CampaignPersonaRecom value) {
        this.id = value.id;
        this.userId = value.userId;
        this.companyId = value.companyId;
        this.positionId = value.positionId;
        this.createTime = value.createTime;
        this.sendTime = value.sendTime;
        this.isSend = value.isSend;
        this.updateTime = value.updateTime;
        this.type = value.type;
    }

    public CampaignPersonaRecom(
        Integer   id,
        Integer   userId,
        Integer   companyId,
        Integer   positionId,
        Timestamp createTime,
        Timestamp sendTime,
        Byte      isSend,
        Timestamp updateTime,
        Byte      type
    ) {
        this.id = id;
        this.userId = userId;
        this.companyId = companyId;
        this.positionId = positionId;
        this.createTime = createTime;
        this.sendTime = sendTime;
        this.isSend = isSend;
        this.updateTime = updateTime;
        this.type = type;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getSendTime() {
        return this.sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    public Byte getIsSend() {
        return this.isSend;
    }

    public void setIsSend(Byte isSend) {
        this.isSend = isSend;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CampaignPersonaRecom (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(positionId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(sendTime);
        sb.append(", ").append(isSend);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}
