/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 员工积分记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserEmployeePointsRecordTest implements Serializable {

    private static final long serialVersionUID = 234744328;

    private Integer   id;
    private Long      employeeId;
    private String    reason;
    private Integer   award;
    private Timestamp _CreateTime;
    private Long      applicationId;
    private Long      recomWxuser;
    private Timestamp updateTime;
    private Long      positionId;
    private Long      berecomWxuserId;
    private Long      awardConfigId;
    private Integer   recomUserId;
    private Integer   berecomUserId;

    public UserEmployeePointsRecordTest() {}

    public UserEmployeePointsRecordTest(UserEmployeePointsRecordTest value) {
        this.id = value.id;
        this.employeeId = value.employeeId;
        this.reason = value.reason;
        this.award = value.award;
        this._CreateTime = value._CreateTime;
        this.applicationId = value.applicationId;
        this.recomWxuser = value.recomWxuser;
        this.updateTime = value.updateTime;
        this.positionId = value.positionId;
        this.berecomWxuserId = value.berecomWxuserId;
        this.awardConfigId = value.awardConfigId;
        this.recomUserId = value.recomUserId;
        this.berecomUserId = value.berecomUserId;
    }

    public UserEmployeePointsRecordTest(
        Integer   id,
        Long      employeeId,
        String    reason,
        Integer   award,
        Timestamp _CreateTime,
        Long      applicationId,
        Long      recomWxuser,
        Timestamp updateTime,
        Long      positionId,
        Long      berecomWxuserId,
        Long      awardConfigId,
        Integer   recomUserId,
        Integer   berecomUserId
    ) {
        this.id = id;
        this.employeeId = employeeId;
        this.reason = reason;
        this.award = award;
        this._CreateTime = _CreateTime;
        this.applicationId = applicationId;
        this.recomWxuser = recomWxuser;
        this.updateTime = updateTime;
        this.positionId = positionId;
        this.berecomWxuserId = berecomWxuserId;
        this.awardConfigId = awardConfigId;
        this.recomUserId = recomUserId;
        this.berecomUserId = berecomUserId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getAward() {
        return this.award;
    }

    public void setAward(Integer award) {
        this.award = award;
    }

    public Timestamp get_CreateTime() {
        return this._CreateTime;
    }

    public void set_CreateTime(Timestamp _CreateTime) {
        this._CreateTime = _CreateTime;
    }

    public Long getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getRecomWxuser() {
        return this.recomWxuser;
    }

    public void setRecomWxuser(Long recomWxuser) {
        this.recomWxuser = recomWxuser;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Long getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getBerecomWxuserId() {
        return this.berecomWxuserId;
    }

    public void setBerecomWxuserId(Long berecomWxuserId) {
        this.berecomWxuserId = berecomWxuserId;
    }

    public Long getAwardConfigId() {
        return this.awardConfigId;
    }

    public void setAwardConfigId(Long awardConfigId) {
        this.awardConfigId = awardConfigId;
    }

    public Integer getRecomUserId() {
        return this.recomUserId;
    }

    public void setRecomUserId(Integer recomUserId) {
        this.recomUserId = recomUserId;
    }

    public Integer getBerecomUserId() {
        return this.berecomUserId;
    }

    public void setBerecomUserId(Integer berecomUserId) {
        this.berecomUserId = berecomUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserEmployeePointsRecordTest (");

        sb.append(id);
        sb.append(", ").append(employeeId);
        sb.append(", ").append(reason);
        sb.append(", ").append(award);
        sb.append(", ").append(_CreateTime);
        sb.append(", ").append(applicationId);
        sb.append(", ").append(recomWxuser);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(positionId);
        sb.append(", ").append(berecomWxuserId);
        sb.append(", ").append(awardConfigId);
        sb.append(", ").append(recomUserId);
        sb.append(", ").append(berecomUserId);

        sb.append(")");
        return sb.toString();
    }
}
