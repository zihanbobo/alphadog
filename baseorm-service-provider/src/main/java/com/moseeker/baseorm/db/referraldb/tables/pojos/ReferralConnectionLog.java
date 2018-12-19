/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用于记录人脉连连看当前连接状态（未开始 已完成 连接中）
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralConnectionLog implements Serializable {

    private static final long serialVersionUID = -922769891;

    private Integer   id;
    private Integer   rootChainId;
    private Integer   companyId;
    private Integer   positionId;
    private Integer   rootUserId;
    private Integer   endUserId;
    private Byte      degree;
    private Byte      state;
    private Timestamp createTime;
    private Timestamp updateTime;

    public ReferralConnectionLog() {}

    public ReferralConnectionLog(ReferralConnectionLog value) {
        this.id = value.id;
        this.rootChainId = value.rootChainId;
        this.companyId = value.companyId;
        this.positionId = value.positionId;
        this.rootUserId = value.rootUserId;
        this.endUserId = value.endUserId;
        this.degree = value.degree;
        this.state = value.state;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ReferralConnectionLog(
        Integer   id,
        Integer   rootChainId,
        Integer   companyId,
        Integer   positionId,
        Integer   rootUserId,
        Integer   endUserId,
        Byte      degree,
        Byte      state,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.rootChainId = rootChainId;
        this.companyId = companyId;
        this.positionId = positionId;
        this.rootUserId = rootUserId;
        this.endUserId = endUserId;
        this.degree = degree;
        this.state = state;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRootChainId() {
        return this.rootChainId;
    }

    public void setRootChainId(Integer rootChainId) {
        this.rootChainId = rootChainId;
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

    public Integer getRootUserId() {
        return this.rootUserId;
    }

    public void setRootUserId(Integer rootUserId) {
        this.rootUserId = rootUserId;
    }

    public Integer getEndUserId() {
        return this.endUserId;
    }

    public void setEndUserId(Integer endUserId) {
        this.endUserId = endUserId;
    }

    public Byte getDegree() {
        return this.degree;
    }

    public void setDegree(Byte degree) {
        this.degree = degree;
    }

    public Byte getState() {
        return this.state;
    }

    public void setState(Byte state) {
        this.state = state;
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
        StringBuilder sb = new StringBuilder("ReferralConnectionLog (");

        sb.append(id);
        sb.append(", ").append(rootChainId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(positionId);
        sb.append(", ").append(rootUserId);
        sb.append(", ").append(endUserId);
        sb.append(", ").append(degree);
        sb.append(", ").append(state);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
