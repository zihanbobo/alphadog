/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 候选人联系内推记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferralSeekRecommend implements Serializable {

    private static final long serialVersionUID = -693634666;

    private Integer   id;
    private Integer   postUserId;
    private Integer   presenteeUserId;
    private Integer   positionId;
    private Integer   appId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer   origin;

    public ReferralSeekRecommend() {}

    public ReferralSeekRecommend(ReferralSeekRecommend value) {
        this.id = value.id;
        this.postUserId = value.postUserId;
        this.presenteeUserId = value.presenteeUserId;
        this.positionId = value.positionId;
        this.appId = value.appId;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.origin = value.origin;
    }

    public ReferralSeekRecommend(
        Integer   id,
        Integer   postUserId,
        Integer   presenteeUserId,
        Integer   positionId,
        Integer   appId,
        Timestamp createTime,
        Timestamp updateTime,
        Integer   origin
    ) {
        this.id = id;
        this.postUserId = postUserId;
        this.presenteeUserId = presenteeUserId;
        this.positionId = positionId;
        this.appId = appId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.origin = origin;
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

    public Integer getOrigin() {
        return this.origin;
    }

    public void setOrigin(Integer origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ReferralSeekRecommend (");

        sb.append(id);
        sb.append(", ").append(postUserId);
        sb.append(", ").append(presenteeUserId);
        sb.append(", ").append(positionId);
        sb.append(", ").append(appId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(origin);

        sb.append(")");
        return sb.toString();
    }
}
