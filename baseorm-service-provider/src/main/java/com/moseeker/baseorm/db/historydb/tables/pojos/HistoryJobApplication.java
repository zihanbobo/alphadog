/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 申请记录归档表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryJobApplication implements Serializable {

    private static final long serialVersionUID = 1434854750;

    private Integer   id;
    private Integer   positionId;
    private Integer   recommenderId;
    private Integer   lApplicationId;
    private Integer   userId;
    private Integer   atsStatus;
    private Integer   disable;
    private Integer   routine;
    private Byte      isViewed;
    private Integer   viewCount;
    private Byte      notSuitable;
    private Integer   companyId;
    private Integer   appTplId;
    private Byte      proxy;
    private Integer   applyType;
    private Integer   emailStatus;
    private Timestamp submitTime;
    private Timestamp createTime;
    private Timestamp updateTime;

    public HistoryJobApplication() {}

    public HistoryJobApplication(HistoryJobApplication value) {
        this.id = value.id;
        this.positionId = value.positionId;
        this.recommenderId = value.recommenderId;
        this.lApplicationId = value.lApplicationId;
        this.userId = value.userId;
        this.atsStatus = value.atsStatus;
        this.disable = value.disable;
        this.routine = value.routine;
        this.isViewed = value.isViewed;
        this.viewCount = value.viewCount;
        this.notSuitable = value.notSuitable;
        this.companyId = value.companyId;
        this.appTplId = value.appTplId;
        this.proxy = value.proxy;
        this.applyType = value.applyType;
        this.emailStatus = value.emailStatus;
        this.submitTime = value.submitTime;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public HistoryJobApplication(
        Integer   id,
        Integer   positionId,
        Integer   recommenderId,
        Integer   lApplicationId,
        Integer   userId,
        Integer   atsStatus,
        Integer   disable,
        Integer   routine,
        Byte      isViewed,
        Integer   viewCount,
        Byte      notSuitable,
        Integer   companyId,
        Integer   appTplId,
        Byte      proxy,
        Integer   applyType,
        Integer   emailStatus,
        Timestamp submitTime,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.positionId = positionId;
        this.recommenderId = recommenderId;
        this.lApplicationId = lApplicationId;
        this.userId = userId;
        this.atsStatus = atsStatus;
        this.disable = disable;
        this.routine = routine;
        this.isViewed = isViewed;
        this.viewCount = viewCount;
        this.notSuitable = notSuitable;
        this.companyId = companyId;
        this.appTplId = appTplId;
        this.proxy = proxy;
        this.applyType = applyType;
        this.emailStatus = emailStatus;
        this.submitTime = submitTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public Integer getRecommenderId() {
        return this.recommenderId;
    }

    public void setRecommenderId(Integer recommenderId) {
        this.recommenderId = recommenderId;
    }

    public Integer getLApplicationId() {
        return this.lApplicationId;
    }

    public void setLApplicationId(Integer lApplicationId) {
        this.lApplicationId = lApplicationId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAtsStatus() {
        return this.atsStatus;
    }

    public void setAtsStatus(Integer atsStatus) {
        this.atsStatus = atsStatus;
    }

    public Integer getDisable() {
        return this.disable;
    }

    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    public Integer getRoutine() {
        return this.routine;
    }

    public void setRoutine(Integer routine) {
        this.routine = routine;
    }

    public Byte getIsViewed() {
        return this.isViewed;
    }

    public void setIsViewed(Byte isViewed) {
        this.isViewed = isViewed;
    }

    public Integer getViewCount() {
        return this.viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Byte getNotSuitable() {
        return this.notSuitable;
    }

    public void setNotSuitable(Byte notSuitable) {
        this.notSuitable = notSuitable;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getAppTplId() {
        return this.appTplId;
    }

    public void setAppTplId(Integer appTplId) {
        this.appTplId = appTplId;
    }

    public Byte getProxy() {
        return this.proxy;
    }

    public void setProxy(Byte proxy) {
        this.proxy = proxy;
    }

    public Integer getApplyType() {
        return this.applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public Integer getEmailStatus() {
        return this.emailStatus;
    }

    public void setEmailStatus(Integer emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Timestamp getSubmitTime() {
        return this.submitTime;
    }

    public void setSubmitTime(Timestamp submitTime) {
        this.submitTime = submitTime;
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
        StringBuilder sb = new StringBuilder("HistoryJobApplication (");

        sb.append(id);
        sb.append(", ").append(positionId);
        sb.append(", ").append(recommenderId);
        sb.append(", ").append(lApplicationId);
        sb.append(", ").append(userId);
        sb.append(", ").append(atsStatus);
        sb.append(", ").append(disable);
        sb.append(", ").append(routine);
        sb.append(", ").append(isViewed);
        sb.append(", ").append(viewCount);
        sb.append(", ").append(notSuitable);
        sb.append(", ").append(companyId);
        sb.append(", ").append(appTplId);
        sb.append(", ").append(proxy);
        sb.append(", ").append(applyType);
        sb.append(", ").append(emailStatus);
        sb.append(", ").append(submitTime);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
