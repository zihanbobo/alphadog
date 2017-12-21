/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrCompanyConf;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 公司级别的配置信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyConfRecord extends UpdatableRecordImpl<HrCompanyConfRecord> {

    private static final long serialVersionUID = 1451790680;

    /**
     * Setter for <code>hrdb.hr_company_conf.company_id</code>.
     */
    public void setCompanyId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.company_id</code>.
     */
    public Integer getCompanyId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.theme_id</code>. config_sys_theme.id
     */
    public void setThemeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.theme_id</code>. config_sys_theme.id
     */
    public Integer getThemeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.hb_throttle</code>. 全局每人每次红包活动可以获得的红包金额上限
     */
    public void setHbThrottle(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.hb_throttle</code>. 全局每人每次红包活动可以获得的红包金额上限
     */
    public Integer getHbThrottle() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.app_reply</code>. 申请提交成功回复信息
     */
    public void setAppReply(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.app_reply</code>. 申请提交成功回复信息
     */
    public String getAppReply() {
        return (String) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.employee_binding</code>. 员工认证自定义文案
     */
    public void setEmployeeBinding(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.employee_binding</code>. 员工认证自定义文案
     */
    public String getEmployeeBinding() {
        return (String) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.recommend_presentee</code>. 推荐候选人自定义文案
     */
    public void setRecommendPresentee(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.recommend_presentee</code>. 推荐候选人自定义文案
     */
    public String getRecommendPresentee() {
        return (String) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.recommend_success</code>. 推荐成功自定义文案
     */
    public void setRecommendSuccess(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.recommend_success</code>. 推荐成功自定义文案
     */
    public String getRecommendSuccess() {
        return (String) get(8);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.forward_message</code>. 转发职位自定义文案
     */
    public void setForwardMessage(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.forward_message</code>. 转发职位自定义文案
     */
    public String getForwardMessage() {
        return (String) get(9);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.application_count_limit</code>. 一个人在一个公司下每月申请次数限制
     */
    public void setApplicationCountLimit(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.application_count_limit</code>. 一个人在一个公司下每月申请次数限制
     */
    public Short getApplicationCountLimit() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.job_custom_title</code>. 职位自定义字段标题
     */
    public void setJobCustomTitle(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.job_custom_title</code>. 职位自定义字段标题
     */
    public String getJobCustomTitle() {
        return (String) get(11);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.search_seq</code>. 搜索页页面设置顺序,3#1#2
     */
    public void setSearchSeq(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.search_seq</code>. 搜索页页面设置顺序,3#1#2
     */
    public String getSearchSeq() {
        return (String) get(12);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.search_img</code>. 搜索页页面设置背景图
     */
    public void setSearchImg(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.search_img</code>. 搜索页页面设置背景图
     */
    public String getSearchImg() {
        return (String) get(13);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.job_occupation</code>. 自定义字段名称
     */
    public void setJobOccupation(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.job_occupation</code>. 自定义字段名称
     */
    public String getJobOccupation() {
        return (String) get(14);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.teamname_custom</code>. 自定义部门别名
     */
    public void setTeamnameCustom(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.teamname_custom</code>. 自定义部门别名
     */
    public String getTeamnameCustom() {
        return (String) get(15);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.application_time</code>. newjd_status即新的jd页的生效时间，
     */
    public void setApplicationTime(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.application_time</code>. newjd_status即新的jd页的生效时间，
     */
    public Timestamp getApplicationTime() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.newjd_status</code>. 新jd页去设置状态0是为开启，1是用户开启，2是审核通过（使用新jd），3撤销（返回基础版） 默认是0
     */
    public void setNewjdStatus(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.newjd_status</code>. 新jd页去设置状态0是为开启，1是用户开启，2是审核通过（使用新jd），3撤销（返回基础版） 默认是0
     */
    public Integer getNewjdStatus() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.hr_chat</code>. IM聊天开关，0：不开启，1：开启
     */
    public void setHrChat(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.hr_chat</code>. IM聊天开关，0：不开启，1：开启
     */
    public Byte getHrChat() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.show_in_qx</code>. 公司信息、团队信息、职位信息在仟寻展示，0: 否， 1: 是
     */
    public void setShowInQx(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.show_in_qx</code>. 公司信息、团队信息、职位信息在仟寻展示，0: 否， 1: 是
     */
    public Byte getShowInQx() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.employee_slug</code>. 员工自定义称谓
     */
    public void setEmployeeSlug(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.employee_slug</code>. 员工自定义称谓
     */
    public String getEmployeeSlug() {
        return (String) get(20);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.display_locale</code>. 公司页面语言，格式:IETF language tag
     */
    public void setDisplayLocale(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.display_locale</code>. 公司页面语言，格式:IETF language tag
     */
    public String getDisplayLocale() {
        return (String) get(21);
    }

    /**
     * Setter for <code>hrdb.hr_company_conf.talentpool_status</code>. '人才库状态表 0未开启，1开启';
     */
    public void setTalentpoolStatus(Byte value) {
        set(22, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.talentpool_status</code>. '人才库状态表 0未开启，1开启';
     */
    public Byte getTalentpoolStatus() {
        return (Byte) get(22);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrCompanyConfRecord
     */
    public HrCompanyConfRecord() {
        super(HrCompanyConf.HR_COMPANY_CONF);
    }

    /**
     * Create a detached, initialised HrCompanyConfRecord
     */
    public HrCompanyConfRecord(Integer companyId, Integer themeId, Integer hbThrottle, String appReply, Timestamp createTime, Timestamp updateTime, String employeeBinding, String recommendPresentee, String recommendSuccess, String forwardMessage, Short applicationCountLimit, String jobCustomTitle, String searchSeq, String searchImg, String jobOccupation, String teamnameCustom, Timestamp applicationTime, Integer newjdStatus, Byte hrChat, Byte showInQx, String employeeSlug, String displayLocale, Byte talentpoolStatus) {
        super(HrCompanyConf.HR_COMPANY_CONF);

        set(0, companyId);
        set(1, themeId);
        set(2, hbThrottle);
        set(3, appReply);
        set(4, createTime);
        set(5, updateTime);
        set(6, employeeBinding);
        set(7, recommendPresentee);
        set(8, recommendSuccess);
        set(9, forwardMessage);
        set(10, applicationCountLimit);
        set(11, jobCustomTitle);
        set(12, searchSeq);
        set(13, searchImg);
        set(14, jobOccupation);
        set(15, teamnameCustom);
        set(16, applicationTime);
        set(17, newjdStatus);
        set(18, hrChat);
        set(19, showInQx);
        set(20, employeeSlug);
        set(21, displayLocale);
        set(22, talentpoolStatus);
    }
}
