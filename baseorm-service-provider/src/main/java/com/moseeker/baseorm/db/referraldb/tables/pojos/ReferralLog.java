/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 内推记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralLog implements Serializable {

    private static final long serialVersionUID = -786566848;

    private Integer   id;
    private Integer   employeeId;
    private Integer   referenceId;
    private Integer   positionId;
    private Integer   type;
    private Timestamp referralTime;
    private Byte      claim;
    private Timestamp claimTime;
    private Timestamp createTime;
    private Timestamp updateTime;

    public ReferralLog() {}

    public ReferralLog(ReferralLog value) {
        this.id = value.id;
        this.employeeId = value.employeeId;
        this.referenceId = value.referenceId;
        this.positionId = value.positionId;
        this.type = value.type;
        this.referralTime = value.referralTime;
        this.claim = value.claim;
        this.claimTime = value.claimTime;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ReferralLog(
        Integer   id,
        Integer   employeeId,
        Integer   referenceId,
        Integer   positionId,
        Integer   type,
        Timestamp referralTime,
        Byte      claim,
        Timestamp claimTime,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.employeeId = employeeId;
        this.referenceId = referenceId;
        this.positionId = positionId;
        this.type = type;
        this.referralTime = referralTime;
        this.claim = claim;
        this.claimTime = claimTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getReferenceId() {
        return this.referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Timestamp getReferralTime() {
        return this.referralTime;
    }

    public void setReferralTime(Timestamp referralTime) {
        this.referralTime = referralTime;
    }

    public Byte getClaim() {
        return this.claim;
    }

    public void setClaim(Byte claim) {
        this.claim = claim;
    }

    public Timestamp getClaimTime() {
        return this.claimTime;
    }

    public void setClaimTime(Timestamp claimTime) {
        this.claimTime = claimTime;
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
        StringBuilder sb = new StringBuilder("ReferralLog (");

        sb.append(id);
        sb.append(", ").append(employeeId);
        sb.append(", ").append(referenceId);
        sb.append(", ").append(positionId);
        sb.append(", ").append(type);
        sb.append(", ").append(referralTime);
        sb.append(", ").append(claim);
        sb.append(", ").append(claimTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
