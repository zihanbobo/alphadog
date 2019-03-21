/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 猎头上传简历表 猎头上传简历临时存储，hr接收后为正式简历
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrHeadhunterProfile implements Serializable {

    private static final long serialVersionUID = 1256289092;

    private Integer   id;
    private Integer   headhunterId;
    private String    userName;
    private String    email;
    private String    mobile;
    private String    profileParsing;
    private Integer   candidateId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Byte      status;

    public HrHeadhunterProfile() {}

    public HrHeadhunterProfile(HrHeadhunterProfile value) {
        this.id = value.id;
        this.headhunterId = value.headhunterId;
        this.userName = value.userName;
        this.email = value.email;
        this.mobile = value.mobile;
        this.profileParsing = value.profileParsing;
        this.candidateId = value.candidateId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.status = value.status;
    }

    public HrHeadhunterProfile(
        Integer   id,
        Integer   headhunterId,
        String    userName,
        String    email,
        String    mobile,
        String    profileParsing,
        Integer   candidateId,
        Timestamp createTime,
        Timestamp updateTime,
        Byte      status
    ) {
        this.id = id;
        this.headhunterId = headhunterId;
        this.userName = userName;
        this.email = email;
        this.mobile = mobile;
        this.profileParsing = profileParsing;
        this.candidateId = candidateId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHeadhunterId() {
        return this.headhunterId;
    }

    public void setHeadhunterId(Integer headhunterId) {
        this.headhunterId = headhunterId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProfileParsing() {
        return this.profileParsing;
    }

    public void setProfileParsing(String profileParsing) {
        this.profileParsing = profileParsing;
    }

    public Integer getCandidateId() {
        return this.candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
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

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrHeadhunterProfile (");

        sb.append(id);
        sb.append(", ").append(headhunterId);
        sb.append(", ").append(userName);
        sb.append(", ").append(email);
        sb.append(", ").append(mobile);
        sb.append(", ").append(profileParsing);
        sb.append(", ").append(candidateId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
