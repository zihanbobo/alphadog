/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrCompanyConf;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class HrCompanyConfRecord extends UpdatableRecordImpl<HrCompanyConfRecord> implements Record18<Integer, Integer, Integer, String, Timestamp, Timestamp, String, String, String, String, Short, String, String, String, String, String, Timestamp, Integer> {

    private static final long serialVersionUID = 653194948;

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
     * Setter for <code>hrdb.hr_company_conf.newjd_status</code>. 新jd页去设置状态 0是为开启，1是用户开启，2是审核通过（使用新jd），3撤销（返回基础版） 默认是0
     */
    public void setNewjdStatus(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>hrdb.hr_company_conf.newjd_status</code>. 新jd页去设置状态 0是为开启，1是用户开启，2是审核通过（使用新jd），3撤销（返回基础版） 默认是0
     */
    public Integer getNewjdStatus() {
        return (Integer) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Integer, Integer, String, Timestamp, Timestamp, String, String, String, String, Short, String, String, String, String, String, Timestamp, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Integer, Integer, String, Timestamp, Timestamp, String, String, String, String, Short, String, String, String, String, String, Timestamp, Integer> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrCompanyConf.HR_COMPANY_CONF.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrCompanyConf.HR_COMPANY_CONF.THEME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return HrCompanyConf.HR_COMPANY_CONF.HB_THROTTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HrCompanyConf.HR_COMPANY_CONF.APP_REPLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return HrCompanyConf.HR_COMPANY_CONF.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return HrCompanyConf.HR_COMPANY_CONF.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return HrCompanyConf.HR_COMPANY_CONF.EMPLOYEE_BINDING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return HrCompanyConf.HR_COMPANY_CONF.RECOMMEND_PRESENTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return HrCompanyConf.HR_COMPANY_CONF.RECOMMEND_SUCCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return HrCompanyConf.HR_COMPANY_CONF.FORWARD_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field11() {
        return HrCompanyConf.HR_COMPANY_CONF.APPLICATION_COUNT_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return HrCompanyConf.HR_COMPANY_CONF.JOB_CUSTOM_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return HrCompanyConf.HR_COMPANY_CONF.SEARCH_SEQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return HrCompanyConf.HR_COMPANY_CONF.SEARCH_IMG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return HrCompanyConf.HR_COMPANY_CONF.JOB_OCCUPATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return HrCompanyConf.HR_COMPANY_CONF.TEAMNAME_CUSTOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return HrCompanyConf.HR_COMPANY_CONF.APPLICATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return HrCompanyConf.HR_COMPANY_CONF.NEWJD_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getThemeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getHbThrottle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAppReply();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getEmployeeBinding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRecommendPresentee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRecommendSuccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getForwardMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value11() {
        return getApplicationCountLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getJobCustomTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSearchSeq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSearchImg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getJobOccupation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getTeamnameCustom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getApplicationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getNewjdStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value1(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value2(Integer value) {
        setThemeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value3(Integer value) {
        setHbThrottle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value4(String value) {
        setAppReply(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value7(String value) {
        setEmployeeBinding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value8(String value) {
        setRecommendPresentee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value9(String value) {
        setRecommendSuccess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value10(String value) {
        setForwardMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value11(Short value) {
        setApplicationCountLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value12(String value) {
        setJobCustomTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value13(String value) {
        setSearchSeq(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value14(String value) {
        setSearchImg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value15(String value) {
        setJobOccupation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value16(String value) {
        setTeamnameCustom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value17(Timestamp value) {
        setApplicationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord value18(Integer value) {
        setNewjdStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyConfRecord values(Integer value1, Integer value2, Integer value3, String value4, Timestamp value5, Timestamp value6, String value7, String value8, String value9, String value10, Short value11, String value12, String value13, String value14, String value15, String value16, Timestamp value17, Integer value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
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
    public HrCompanyConfRecord(Integer companyId, Integer themeId, Integer hbThrottle, String appReply, Timestamp createTime, Timestamp updateTime, String employeeBinding, String recommendPresentee, String recommendSuccess, String forwardMessage, Short applicationCountLimit, String jobCustomTitle, String searchSeq, String searchImg, String jobOccupation, String teamnameCustom, Timestamp applicationTime, Integer newjdStatus) {
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
    }
}
