/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 公司级别的配置信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyConf implements Serializable {

    private static final long serialVersionUID = 1224196220;

    private Integer   companyId;
    private Integer   themeId;
    private Integer   hbThrottle;
    private String    appReply;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String    employeeBinding;
    private String    recommendPresentee;
    private String    recommendSuccess;
    private String    forwardMessage;
    private Short     applicationCountLimit;
    private Short     schoolApplicationCountLimit;
    private String    jobCustomTitle;
    private String    searchSeq;
    private String    searchImg;
    private String    jobOccupation;
    private String    teamnameCustom;
    private Timestamp applicationTime;
    private Integer   newjdStatus;
    private Byte      hrChat;
    private Byte      showInQx;
    private String    employeeSlug;
    private String    displayLocale;
    private Byte      talentpoolStatus;
    private Byte      veryeastSwitch;
    private Byte      mallSwitch;
    private String    mallGoodsMethod;
    private Byte      mallGoodsMethodState;
    private Byte      job51SalaryDiscuss;

    public HrCompanyConf() {}

    public HrCompanyConf(HrCompanyConf value) {
        this.companyId = value.companyId;
        this.themeId = value.themeId;
        this.hbThrottle = value.hbThrottle;
        this.appReply = value.appReply;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.employeeBinding = value.employeeBinding;
        this.recommendPresentee = value.recommendPresentee;
        this.recommendSuccess = value.recommendSuccess;
        this.forwardMessage = value.forwardMessage;
        this.applicationCountLimit = value.applicationCountLimit;
        this.schoolApplicationCountLimit = value.schoolApplicationCountLimit;
        this.jobCustomTitle = value.jobCustomTitle;
        this.searchSeq = value.searchSeq;
        this.searchImg = value.searchImg;
        this.jobOccupation = value.jobOccupation;
        this.teamnameCustom = value.teamnameCustom;
        this.applicationTime = value.applicationTime;
        this.newjdStatus = value.newjdStatus;
        this.hrChat = value.hrChat;
        this.showInQx = value.showInQx;
        this.employeeSlug = value.employeeSlug;
        this.displayLocale = value.displayLocale;
        this.talentpoolStatus = value.talentpoolStatus;
        this.veryeastSwitch = value.veryeastSwitch;
        this.mallSwitch = value.mallSwitch;
        this.mallGoodsMethod = value.mallGoodsMethod;
        this.mallGoodsMethodState = value.mallGoodsMethodState;
        this.job51SalaryDiscuss = value.job51SalaryDiscuss;
    }

    public HrCompanyConf(
        Integer   companyId,
        Integer   themeId,
        Integer   hbThrottle,
        String    appReply,
        Timestamp createTime,
        Timestamp updateTime,
        String    employeeBinding,
        String    recommendPresentee,
        String    recommendSuccess,
        String    forwardMessage,
        Short     applicationCountLimit,
        Short     schoolApplicationCountLimit,
        String    jobCustomTitle,
        String    searchSeq,
        String    searchImg,
        String    jobOccupation,
        String    teamnameCustom,
        Timestamp applicationTime,
        Integer   newjdStatus,
        Byte      hrChat,
        Byte      showInQx,
        String    employeeSlug,
        String    displayLocale,
        Byte      talentpoolStatus,
        Byte      veryeastSwitch,
        Byte      mallSwitch,
        String    mallGoodsMethod,
        Byte      mallGoodsMethodState,
        Byte      job51SalaryDiscuss
    ) {
        this.companyId = companyId;
        this.themeId = themeId;
        this.hbThrottle = hbThrottle;
        this.appReply = appReply;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.employeeBinding = employeeBinding;
        this.recommendPresentee = recommendPresentee;
        this.recommendSuccess = recommendSuccess;
        this.forwardMessage = forwardMessage;
        this.applicationCountLimit = applicationCountLimit;
        this.schoolApplicationCountLimit = schoolApplicationCountLimit;
        this.jobCustomTitle = jobCustomTitle;
        this.searchSeq = searchSeq;
        this.searchImg = searchImg;
        this.jobOccupation = jobOccupation;
        this.teamnameCustom = teamnameCustom;
        this.applicationTime = applicationTime;
        this.newjdStatus = newjdStatus;
        this.hrChat = hrChat;
        this.showInQx = showInQx;
        this.employeeSlug = employeeSlug;
        this.displayLocale = displayLocale;
        this.talentpoolStatus = talentpoolStatus;
        this.veryeastSwitch = veryeastSwitch;
        this.mallSwitch = mallSwitch;
        this.mallGoodsMethod = mallGoodsMethod;
        this.mallGoodsMethodState = mallGoodsMethodState;
        this.job51SalaryDiscuss = job51SalaryDiscuss;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getThemeId() {
        return this.themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public Integer getHbThrottle() {
        return this.hbThrottle;
    }

    public void setHbThrottle(Integer hbThrottle) {
        this.hbThrottle = hbThrottle;
    }

    public String getAppReply() {
        return this.appReply;
    }

    public void setAppReply(String appReply) {
        this.appReply = appReply;
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

    public String getEmployeeBinding() {
        return this.employeeBinding;
    }

    public void setEmployeeBinding(String employeeBinding) {
        this.employeeBinding = employeeBinding;
    }

    public String getRecommendPresentee() {
        return this.recommendPresentee;
    }

    public void setRecommendPresentee(String recommendPresentee) {
        this.recommendPresentee = recommendPresentee;
    }

    public String getRecommendSuccess() {
        return this.recommendSuccess;
    }

    public void setRecommendSuccess(String recommendSuccess) {
        this.recommendSuccess = recommendSuccess;
    }

    public String getForwardMessage() {
        return this.forwardMessage;
    }

    public void setForwardMessage(String forwardMessage) {
        this.forwardMessage = forwardMessage;
    }

    public Short getApplicationCountLimit() {
        return this.applicationCountLimit;
    }

    public void setApplicationCountLimit(Short applicationCountLimit) {
        this.applicationCountLimit = applicationCountLimit;
    }

    public Short getSchoolApplicationCountLimit() {
        return this.schoolApplicationCountLimit;
    }

    public void setSchoolApplicationCountLimit(Short schoolApplicationCountLimit) {
        this.schoolApplicationCountLimit = schoolApplicationCountLimit;
    }

    public String getJobCustomTitle() {
        return this.jobCustomTitle;
    }

    public void setJobCustomTitle(String jobCustomTitle) {
        this.jobCustomTitle = jobCustomTitle;
    }

    public String getSearchSeq() {
        return this.searchSeq;
    }

    public void setSearchSeq(String searchSeq) {
        this.searchSeq = searchSeq;
    }

    public String getSearchImg() {
        return this.searchImg;
    }

    public void setSearchImg(String searchImg) {
        this.searchImg = searchImg;
    }

    public String getJobOccupation() {
        return this.jobOccupation;
    }

    public void setJobOccupation(String jobOccupation) {
        this.jobOccupation = jobOccupation;
    }

    public String getTeamnameCustom() {
        return this.teamnameCustom;
    }

    public void setTeamnameCustom(String teamnameCustom) {
        this.teamnameCustom = teamnameCustom;
    }

    public Timestamp getApplicationTime() {
        return this.applicationTime;
    }

    public void setApplicationTime(Timestamp applicationTime) {
        this.applicationTime = applicationTime;
    }

    public Integer getNewjdStatus() {
        return this.newjdStatus;
    }

    public void setNewjdStatus(Integer newjdStatus) {
        this.newjdStatus = newjdStatus;
    }

    public Byte getHrChat() {
        return this.hrChat;
    }

    public void setHrChat(Byte hrChat) {
        this.hrChat = hrChat;
    }

    public Byte getShowInQx() {
        return this.showInQx;
    }

    public void setShowInQx(Byte showInQx) {
        this.showInQx = showInQx;
    }

    public String getEmployeeSlug() {
        return this.employeeSlug;
    }

    public void setEmployeeSlug(String employeeSlug) {
        this.employeeSlug = employeeSlug;
    }

    public String getDisplayLocale() {
        return this.displayLocale;
    }

    public void setDisplayLocale(String displayLocale) {
        this.displayLocale = displayLocale;
    }

    public Byte getTalentpoolStatus() {
        return this.talentpoolStatus;
    }

    public void setTalentpoolStatus(Byte talentpoolStatus) {
        this.talentpoolStatus = talentpoolStatus;
    }

    public Byte getVeryeastSwitch() {
        return this.veryeastSwitch;
    }

    public void setVeryeastSwitch(Byte veryeastSwitch) {
        this.veryeastSwitch = veryeastSwitch;
    }

    public Byte getMallSwitch() {
        return this.mallSwitch;
    }

    public void setMallSwitch(Byte mallSwitch) {
        this.mallSwitch = mallSwitch;
    }

    public String getMallGoodsMethod() {
        return this.mallGoodsMethod;
    }

    public void setMallGoodsMethod(String mallGoodsMethod) {
        this.mallGoodsMethod = mallGoodsMethod;
    }

    public Byte getMallGoodsMethodState() {
        return this.mallGoodsMethodState;
    }

    public void setMallGoodsMethodState(Byte mallGoodsMethodState) {
        this.mallGoodsMethodState = mallGoodsMethodState;
    }

    public Byte getJob51SalaryDiscuss() {
        return this.job51SalaryDiscuss;
    }

    public void setJob51SalaryDiscuss(Byte job51SalaryDiscuss) {
        this.job51SalaryDiscuss = job51SalaryDiscuss;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrCompanyConf (");

        sb.append(companyId);
        sb.append(", ").append(themeId);
        sb.append(", ").append(hbThrottle);
        sb.append(", ").append(appReply);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(employeeBinding);
        sb.append(", ").append(recommendPresentee);
        sb.append(", ").append(recommendSuccess);
        sb.append(", ").append(forwardMessage);
        sb.append(", ").append(applicationCountLimit);
        sb.append(", ").append(schoolApplicationCountLimit);
        sb.append(", ").append(jobCustomTitle);
        sb.append(", ").append(searchSeq);
        sb.append(", ").append(searchImg);
        sb.append(", ").append(jobOccupation);
        sb.append(", ").append(teamnameCustom);
        sb.append(", ").append(applicationTime);
        sb.append(", ").append(newjdStatus);
        sb.append(", ").append(hrChat);
        sb.append(", ").append(showInQx);
        sb.append(", ").append(employeeSlug);
        sb.append(", ").append(displayLocale);
        sb.append(", ").append(talentpoolStatus);
        sb.append(", ").append(veryeastSwitch);
        sb.append(", ").append(mallSwitch);
        sb.append(", ").append(mallGoodsMethod);
        sb.append(", ").append(mallGoodsMethodState);
        sb.append(", ").append(job51SalaryDiscuss);

        sb.append(")");
        return sb.toString();
    }
}
