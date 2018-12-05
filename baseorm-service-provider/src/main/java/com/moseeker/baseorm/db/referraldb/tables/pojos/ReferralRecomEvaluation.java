/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 推荐人推荐理由信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralRecomEvaluation implements Serializable {

    private static final long serialVersionUID = 1366003067;

    private Integer   id;
    private Integer   postUserId;
    private Integer   presenteeUserId;
    private String    mobile;
    private Integer   appId;
    private Integer   positionId;
    private String    recomReasonTag;
    private Byte      relationship;
    private String    recomReasonText;
    private Timestamp createTime;
    private Timestamp updateTime;

    public ReferralRecomEvaluation() {}

    public ReferralRecomEvaluation(ReferralRecomEvaluation value) {
        this.id = value.id;
        this.postUserId = value.postUserId;
        this.presenteeUserId = value.presenteeUserId;
        this.mobile = value.mobile;
        this.appId = value.appId;
        this.positionId = value.positionId;
        this.recomReasonTag = value.recomReasonTag;
        this.relationship = value.relationship;
        this.recomReasonText = value.recomReasonText;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public ReferralRecomEvaluation(
        Integer   id,
        Integer   postUserId,
        Integer   presenteeUserId,
        String    mobile,
        Integer   appId,
        Integer   positionId,
        String    recomReasonTag,
        Byte      relationship,
        String    recomReasonText,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.postUserId = postUserId;
        this.presenteeUserId = presenteeUserId;
        this.mobile = mobile;
        this.appId = appId;
        this.positionId = positionId;
        this.recomReasonTag = recomReasonTag;
        this.relationship = relationship;
        this.recomReasonText = recomReasonText;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostUserId() {
        return this.postUserId;
    }

    public void setPostUserId(Integer postUserId) {
        this.postUserId = postUserId;
    }

    public Integer getPresenteeUserId() {
        return this.presenteeUserId;
    }

    public void setPresenteeUserId(Integer presenteeUserId) {
        this.presenteeUserId = presenteeUserId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAppId() {
        return this.appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getPositionId() {
        return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getRecomReasonTag() {
        return this.recomReasonTag;
    }

    public void setRecomReasonTag(String recomReasonTag) {
        this.recomReasonTag = recomReasonTag;
    }

    public Byte getRelationship() {
        return this.relationship;
    }

    public void setRelationship(Byte relationship) {
        this.relationship = relationship;
    }

    public String getRecomReasonText() {
        return this.recomReasonText;
    }

    public void setRecomReasonText(String recomReasonText) {
        this.recomReasonText = recomReasonText;
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
        StringBuilder sb = new StringBuilder("ReferralRecomEvaluation (");

        sb.append(id);
        sb.append(", ").append(postUserId);
        sb.append(", ").append(presenteeUserId);
        sb.append(", ").append(mobile);
        sb.append(", ").append(appId);
        sb.append(", ").append(positionId);
        sb.append(", ").append(recomReasonTag);
        sb.append(", ").append(relationship);
        sb.append(", ").append(recomReasonText);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
