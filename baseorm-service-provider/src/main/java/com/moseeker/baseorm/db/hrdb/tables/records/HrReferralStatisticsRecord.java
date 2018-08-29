/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrReferralStatistics;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 内推统计表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrReferralStatisticsRecord extends UpdatableRecordImpl<HrReferralStatisticsRecord> implements Record16<Integer, String, String, Integer, Integer, Date, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -114137519;

    /**
     * Setter for <code>hrdb.hr_referral_statistics.id</code>. primary key
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.id</code>. primary key
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.position_title</code>. hr_position.title
     */
    public void setPositionTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.position_title</code>. hr_position.title
     */
    public String getPositionTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.employee_name</code>. sys_employee.cname
     */
    public void setEmployeeName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.employee_name</code>. sys_employee.cname
     */
    public String getEmployeeName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.employee_id</code>. 推荐员工 sys.employee.id
     */
    public void setEmployeeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.employee_id</code>. 推荐员工 sys.employee.id
     */
    public Integer getEmployeeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.company_id</code>. sys_wechat.id
     */
    public void setCompanyId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.company_id</code>. sys_wechat.id
     */
    public Integer getCompanyId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.create_date</code>. 创建时间
     */
    public void setCreateDate(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.create_date</code>. 创建时间
     */
    public Date getCreateDate() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.recom_num</code>. 推荐浏览人次
     */
    public void setRecomNum(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.recom_num</code>. 推荐浏览人次
     */
    public Integer getRecomNum() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.recom_fav_num</code>. 推荐感兴趣人次
     */
    public void setRecomFavNum(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.recom_fav_num</code>. 推荐感兴趣人次
     */
    public Integer getRecomFavNum() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.recom_mobile_num</code>. 推荐留手机人次
     */
    public void setRecomMobileNum(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.recom_mobile_num</code>. 推荐留手机人次
     */
    public Integer getRecomMobileNum() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.recom_apply_num</code>. 推荐投递人次
     */
    public void setRecomApplyNum(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.recom_apply_num</code>. 推荐投递人次
     */
    public Integer getRecomApplyNum() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.recom_after_review_num</code>. 推荐评审通过人数
     */
    public void setRecomAfterReviewNum(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.recom_after_review_num</code>. 推荐评审通过人数
     */
    public Integer getRecomAfterReviewNum() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.recom_after_interview_num</code>. 推荐面试通过人数
     */
    public void setRecomAfterInterviewNum(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.recom_after_interview_num</code>. 推荐面试通过人数
     */
    public Integer getRecomAfterInterviewNum() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.recom_on_board_num</code>. 推荐入职人数
     */
    public void setRecomOnBoardNum(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.recom_on_board_num</code>. 推荐入职人数
     */
    public Integer getRecomOnBoardNum() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.info_type</code>. 0: 日数据，1：周数据，2：月数据
     */
    public void setInfoType(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.info_type</code>. 0: 日数据，1：周数据，2：月数据
     */
    public Integer getInfoType() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.publisher</code>.
     */
    public void setPublisher(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.publisher</code>.
     */
    public Integer getPublisher() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>hrdb.hr_referral_statistics.position_id</code>. job.position_id
     */
    public void setPositionId(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>hrdb.hr_referral_statistics.position_id</code>. job.position_id
     */
    public Integer getPositionId() {
        return (Integer) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, String, Integer, Integer, Date, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, String, String, Integer, Integer, Date, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.POSITION_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.EMPLOYEE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.EMPLOYEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field6() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.RECOM_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.RECOM_FAV_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.RECOM_MOBILE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.RECOM_APPLY_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.RECOM_AFTER_REVIEW_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.RECOM_AFTER_INTERVIEW_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.RECOM_ON_BOARD_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.INFO_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.PUBLISHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return HrReferralStatistics.HR_REFERRAL_STATISTICS.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPositionTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmployeeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value6() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRecomNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getRecomFavNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getRecomMobileNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getRecomApplyNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getRecomAfterReviewNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getRecomAfterInterviewNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getRecomOnBoardNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getInfoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getPublisher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getPositionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value2(String value) {
        setPositionTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value3(String value) {
        setEmployeeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value4(Integer value) {
        setEmployeeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value5(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value6(Date value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value7(Integer value) {
        setRecomNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value8(Integer value) {
        setRecomFavNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value9(Integer value) {
        setRecomMobileNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value10(Integer value) {
        setRecomApplyNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value11(Integer value) {
        setRecomAfterReviewNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value12(Integer value) {
        setRecomAfterInterviewNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value13(Integer value) {
        setRecomOnBoardNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value14(Integer value) {
        setInfoType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value15(Integer value) {
        setPublisher(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord value16(Integer value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatisticsRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Date value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15, Integer value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrReferralStatisticsRecord
     */
    public HrReferralStatisticsRecord() {
        super(HrReferralStatistics.HR_REFERRAL_STATISTICS);
    }

    /**
     * Create a detached, initialised HrReferralStatisticsRecord
     */
    public HrReferralStatisticsRecord(Integer id, String positionTitle, String employeeName, Integer employeeId, Integer companyId, Date createDate, Integer recomNum, Integer recomFavNum, Integer recomMobileNum, Integer recomApplyNum, Integer recomAfterReviewNum, Integer recomAfterInterviewNum, Integer recomOnBoardNum, Integer infoType, Integer publisher, Integer positionId) {
        super(HrReferralStatistics.HR_REFERRAL_STATISTICS);

        set(0, id);
        set(1, positionTitle);
        set(2, employeeName);
        set(3, employeeId);
        set(4, companyId);
        set(5, createDate);
        set(6, recomNum);
        set(7, recomFavNum);
        set(8, recomMobileNum);
        set(9, recomApplyNum);
        set(10, recomAfterReviewNum);
        set(11, recomAfterInterviewNum);
        set(12, recomOnBoardNum);
        set(13, infoType);
        set(14, publisher);
        set(15, positionId);
    }
}
