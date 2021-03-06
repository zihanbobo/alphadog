/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.candidatedb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 候选人推荐记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidateRecomRecord implements Serializable {

    private static final long serialVersionUID = 200037567;

    private Integer   id;
    private Integer   positionId;
    private Integer   appId;
    private Integer   presenteeId;
    private Timestamp clickTime;
    private Integer   depth;
    private Integer   recomId_2;
    private Integer   recomId;
    private String    realname;
    private String    company;
    private String    position;
    private String    recomReason;
    private Timestamp recomTime;
    private Integer   isRecom;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String    mobile;
    private Integer   presenteeUserId;
    private Integer   repostUserId;
    private Integer   postUserId;
    private Byte      gender;
    private String    email;

    public CandidateRecomRecord() {}

    public CandidateRecomRecord(CandidateRecomRecord value) {
        this.id = value.id;
        this.positionId = value.positionId;
        this.appId = value.appId;
        this.presenteeId = value.presenteeId;
        this.clickTime = value.clickTime;
        this.depth = value.depth;
        this.recomId_2 = value.recomId_2;
        this.recomId = value.recomId;
        this.realname = value.realname;
        this.company = value.company;
        this.position = value.position;
        this.recomReason = value.recomReason;
        this.recomTime = value.recomTime;
        this.isRecom = value.isRecom;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.mobile = value.mobile;
        this.presenteeUserId = value.presenteeUserId;
        this.repostUserId = value.repostUserId;
        this.postUserId = value.postUserId;
        this.gender = value.gender;
        this.email = value.email;
    }

    public CandidateRecomRecord(
        Integer   id,
        Integer   positionId,
        Integer   appId,
        Integer   presenteeId,
        Timestamp clickTime,
        Integer   depth,
        Integer   recomId_2,
        Integer   recomId,
        String    realname,
        String    company,
        String    position,
        String    recomReason,
        Timestamp recomTime,
        Integer   isRecom,
        Timestamp createTime,
        Timestamp updateTime,
        String    mobile,
        Integer   presenteeUserId,
        Integer   repostUserId,
        Integer   postUserId,
        Byte      gender,
        String    email
    ) {
        this.id = id;
        this.positionId = positionId;
        this.appId = appId;
        this.presenteeId = presenteeId;
        this.clickTime = clickTime;
        this.depth = depth;
        this.recomId_2 = recomId_2;
        this.recomId = recomId;
        this.realname = realname;
        this.company = company;
        this.position = position;
        this.recomReason = recomReason;
        this.recomTime = recomTime;
        this.isRecom = isRecom;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.mobile = mobile;
        this.presenteeUserId = presenteeUserId;
        this.repostUserId = repostUserId;
        this.postUserId = postUserId;
        this.gender = gender;
        this.email = email;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getAppId() {
        return this.appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getPresenteeId() {
        return this.presenteeId;
    }

    public void setPresenteeId(Integer presenteeId) {
        this.presenteeId = presenteeId;
    }

    public Timestamp getClickTime() {
        return this.clickTime;
    }

    public void setClickTime(Timestamp clickTime) {
        this.clickTime = clickTime;
    }

    public Integer getDepth() {
        return this.depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getRecomId_2() {
        return this.recomId_2;
    }

    public void setRecomId_2(Integer recomId_2) {
        this.recomId_2 = recomId_2;
    }

    public Integer getRecomId() {
        return this.recomId;
    }

    public void setRecomId(Integer recomId) {
        this.recomId = recomId;
    }

    public String getRealname() {
        return this.realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRecomReason() {
        return this.recomReason;
    }

    public void setRecomReason(String recomReason) {
        this.recomReason = recomReason;
    }

    public Timestamp getRecomTime() {
        return this.recomTime;
    }

    public void setRecomTime(Timestamp recomTime) {
        this.recomTime = recomTime;
    }

    public Integer getIsRecom() {
        return this.isRecom;
    }

    public void setIsRecom(Integer isRecom) {
        this.isRecom = isRecom;
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

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getPresenteeUserId() {
        return this.presenteeUserId;
    }

    public void setPresenteeUserId(Integer presenteeUserId) {
        this.presenteeUserId = presenteeUserId;
    }

    public Integer getRepostUserId() {
        return this.repostUserId;
    }

    public void setRepostUserId(Integer repostUserId) {
        this.repostUserId = repostUserId;
    }

    public Integer getPostUserId() {
        return this.postUserId;
    }

    public void setPostUserId(Integer postUserId) {
        this.postUserId = postUserId;
    }

    public Byte getGender() {
        return this.gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CandidateRecomRecord (");

        sb.append(id);
        sb.append(", ").append(positionId);
        sb.append(", ").append(appId);
        sb.append(", ").append(presenteeId);
        sb.append(", ").append(clickTime);
        sb.append(", ").append(depth);
        sb.append(", ").append(recomId_2);
        sb.append(", ").append(recomId);
        sb.append(", ").append(realname);
        sb.append(", ").append(company);
        sb.append(", ").append(position);
        sb.append(", ").append(recomReason);
        sb.append(", ").append(recomTime);
        sb.append(", ").append(isRecom);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(mobile);
        sb.append(", ").append(presenteeUserId);
        sb.append(", ").append(repostUserId);
        sb.append(", ").append(postUserId);
        sb.append(", ").append(gender);
        sb.append(", ").append(email);

        sb.append(")");
        return sb.toString();
    }
}
