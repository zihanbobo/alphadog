/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.pojos;


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
public class JobApplication0517 implements Serializable {

    private static final long serialVersionUID = -377126241;

    private Integer   id;
    private Integer   wechatId;
    private Integer   positionId;
    private Integer   recommenderId;
    private Timestamp submitTime;
    private Integer   statusId;
    private Integer   lApplicationId;
    private Integer   reward;
    private Integer   sourceId;
    private Timestamp _CreateTime;
    private Integer   applierId;
    private Integer   interviewId;
    private String    resumeId;
    private Integer   atsStatus;
    private String    applierName;
    private Integer   disable;
    private Integer   routine;
    private Byte      isViewed;
    private Byte      notSuitable;
    private Integer   companyId;
    private Timestamp updateTime;
    private Integer   appTplId;
    private Byte      proxy;
    private Integer   applyType;
    private Integer   emailStatus;
    private Integer   viewCount;
    private Integer   recommenderUserId;

    public JobApplication0517() {}

    public JobApplication0517(JobApplication0517 value) {
        this.id = value.id;
        this.wechatId = value.wechatId;
        this.positionId = value.positionId;
        this.recommenderId = value.recommenderId;
        this.submitTime = value.submitTime;
        this.statusId = value.statusId;
        this.lApplicationId = value.lApplicationId;
        this.reward = value.reward;
        this.sourceId = value.sourceId;
        this._CreateTime = value._CreateTime;
        this.applierId = value.applierId;
        this.interviewId = value.interviewId;
        this.resumeId = value.resumeId;
        this.atsStatus = value.atsStatus;
        this.applierName = value.applierName;
        this.disable = value.disable;
        this.routine = value.routine;
        this.isViewed = value.isViewed;
        this.notSuitable = value.notSuitable;
        this.companyId = value.companyId;
        this.updateTime = value.updateTime;
        this.appTplId = value.appTplId;
        this.proxy = value.proxy;
        this.applyType = value.applyType;
        this.emailStatus = value.emailStatus;
        this.viewCount = value.viewCount;
        this.recommenderUserId = value.recommenderUserId;
    }

    public JobApplication0517(
        Integer   id,
        Integer   wechatId,
        Integer   positionId,
        Integer   recommenderId,
        Timestamp submitTime,
        Integer   statusId,
        Integer   lApplicationId,
        Integer   reward,
        Integer   sourceId,
        Timestamp _CreateTime,
        Integer   applierId,
        Integer   interviewId,
        String    resumeId,
        Integer   atsStatus,
        String    applierName,
        Integer   disable,
        Integer   routine,
        Byte      isViewed,
        Byte      notSuitable,
        Integer   companyId,
        Timestamp updateTime,
        Integer   appTplId,
        Byte      proxy,
        Integer   applyType,
        Integer   emailStatus,
        Integer   viewCount,
        Integer   recommenderUserId
    ) {
        this.id = id;
        this.wechatId = wechatId;
        this.positionId = positionId;
        this.recommenderId = recommenderId;
        this.submitTime = submitTime;
        this.statusId = statusId;
        this.lApplicationId = lApplicationId;
        this.reward = reward;
        this.sourceId = sourceId;
        this._CreateTime = _CreateTime;
        this.applierId = applierId;
        this.interviewId = interviewId;
        this.resumeId = resumeId;
        this.atsStatus = atsStatus;
        this.applierName = applierName;
        this.disable = disable;
        this.routine = routine;
        this.isViewed = isViewed;
        this.notSuitable = notSuitable;
        this.companyId = companyId;
        this.updateTime = updateTime;
        this.appTplId = appTplId;
        this.proxy = proxy;
        this.applyType = applyType;
        this.emailStatus = emailStatus;
        this.viewCount = viewCount;
        this.recommenderUserId = recommenderUserId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWechatId() {
        return this.wechatId;
    }

    public void setWechatId(Integer wechatId) {
        this.wechatId = wechatId;
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

    public Timestamp getSubmitTime() {
        return this.submitTime;
    }

    public void setSubmitTime(Timestamp submitTime) {
        this.submitTime = submitTime;
    }

    public Integer getStatusId() {
        return this.statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getLApplicationId() {
        return this.lApplicationId;
    }

    public void setLApplicationId(Integer lApplicationId) {
        this.lApplicationId = lApplicationId;
    }

    public Integer getReward() {
        return this.reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Timestamp get_CreateTime() {
        return this._CreateTime;
    }

    public void set_CreateTime(Timestamp _CreateTime) {
        this._CreateTime = _CreateTime;
    }

    public Integer getApplierId() {
        return this.applierId;
    }

    public void setApplierId(Integer applierId) {
        this.applierId = applierId;
    }

    public Integer getInterviewId() {
        return this.interviewId;
    }

    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }

    public String getResumeId() {
        return this.resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getAtsStatus() {
        return this.atsStatus;
    }

    public void setAtsStatus(Integer atsStatus) {
        this.atsStatus = atsStatus;
    }

    public String getApplierName() {
        return this.applierName;
    }

    public void setApplierName(String applierName) {
        this.applierName = applierName;
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

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
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

    public Integer getViewCount() {
        return this.viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getRecommenderUserId() {
        return this.recommenderUserId;
    }

    public void setRecommenderUserId(Integer recommenderUserId) {
        this.recommenderUserId = recommenderUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JobApplication0517 (");

        sb.append(id);
        sb.append(", ").append(wechatId);
        sb.append(", ").append(positionId);
        sb.append(", ").append(recommenderId);
        sb.append(", ").append(submitTime);
        sb.append(", ").append(statusId);
        sb.append(", ").append(lApplicationId);
        sb.append(", ").append(reward);
        sb.append(", ").append(sourceId);
        sb.append(", ").append(_CreateTime);
        sb.append(", ").append(applierId);
        sb.append(", ").append(interviewId);
        sb.append(", ").append(resumeId);
        sb.append(", ").append(atsStatus);
        sb.append(", ").append(applierName);
        sb.append(", ").append(disable);
        sb.append(", ").append(routine);
        sb.append(", ").append(isViewed);
        sb.append(", ").append(notSuitable);
        sb.append(", ").append(companyId);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(appTplId);
        sb.append(", ").append(proxy);
        sb.append(", ").append(applyType);
        sb.append(", ").append(emailStatus);
        sb.append(", ").append(viewCount);
        sb.append(", ").append(recommenderUserId);

        sb.append(")");
        return sb.toString();
    }
}
