/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrInterviewConcrete;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 面试安排表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrInterviewConcreteRecord extends UpdatableRecordImpl<HrInterviewConcreteRecord> implements Record20<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1209430708;

    /**
     * Setter for <code>hrdb.hr_interview_concrete.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.company_id</code>. 公司编号
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.company_id</code>. 公司编号
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.app_id</code>. 申请id
     */
    public void setAppId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.app_id</code>. 申请id
     */
    public Integer getAppId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.applier_id</code>. 申请人id
     */
    public void setApplierId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.applier_id</code>. 申请人id
     */
    public Integer getApplierId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.hr_id</code>. hr id
     */
    public void setHrId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.hr_id</code>. hr id
     */
    public Integer getHrId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.interviewer_id</code>. 面试官id
     */
    public void setInterviewerId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.interviewer_id</code>. 面试官id
     */
    public Integer getInterviewerId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.interview_address_id</code>. 面试地点编号 hr_interview_address.id
     */
    public void setInterviewAddressId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.interview_address_id</code>. 面试地点编号 hr_interview_address.id
     */
    public Integer getInterviewAddressId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.interview_type</code>. 面试形式 dictdb.dict_constant
     */
    public void setInterviewType(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.interview_type</code>. 面试形式 dictdb.dict_constant
     */
    public Integer getInterviewType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.interview_round_name</code>. 面试轮次名称  hr_interview_process_round.name
     */
    public void setInterviewRoundName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.interview_round_name</code>. 面试轮次名称  hr_interview_process_round.name
     */
    public String getInterviewRoundName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.interview_feedback_sheet_id</code>. 面试反馈表的id hr_interview_feedback_result_answer_sheet.id
     */
    public void setInterviewFeedbackSheetId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.interview_feedback_sheet_id</code>. 面试反馈表的id hr_interview_feedback_result_answer_sheet.id
     */
    public Integer getInterviewFeedbackSheetId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.app_tpl_id</code>. 招聘进度的id
     */
    public void setAppTplId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.app_tpl_id</code>. 招聘进度的id
     */
    public Integer getAppTplId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.concrete_order</code>. 面试安排 排序字段
     */
    public void setConcreteOrder(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.concrete_order</code>. 面试安排 排序字段
     */
    public Integer getConcreteOrder() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.interview_template_id</code>. 面试模版ID,hr_interview_feedback_template.id 
     */
    public void setInterviewTemplateId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.interview_template_id</code>. 面试模版ID,hr_interview_feedback_template.id 
     */
    public Integer getInterviewTemplateId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.start_time</code>. 面试开始时间
     */
    public void setStartTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.start_time</code>. 面试开始时间
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.end_time</code>. 面试结束时间
     */
    public void setEndTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.end_time</code>. 面试结束时间
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.finished</code>. 0 未完成 1完成
     */
    public void setFinished(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.finished</code>. 0 未完成 1完成
     */
    public Integer getFinished() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.passed</code>. 面试是否通过 0 未通过 1 通过 2未参加面试
     */
    public void setPassed(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.passed</code>. 面试是否通过 0 未通过 1 通过 2未参加面试
     */
    public Integer getPassed() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.disable</code>. 状态：0 有效  1 无效 2 逻辑删除
     */
    public void setDisable(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.disable</code>. 状态：0 有效  1 无效 2 逻辑删除
     */
    public Integer getDisable() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>hrdb.hr_interview_concrete.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>hrdb.hr_interview_concrete.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.APPLIER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.HR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.INTERVIEWER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.INTERVIEW_ADDRESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.INTERVIEW_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.INTERVIEW_ROUND_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.INTERVIEW_FEEDBACK_SHEET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.APP_TPL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.CONCRETE_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.INTERVIEW_TEMPLATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.FINISHED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.PASSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return HrInterviewConcrete.HR_INTERVIEW_CONCRETE.UPDATE_TIME;
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
    public Integer value2() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getApplierId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getHrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getInterviewerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getInterviewAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getInterviewType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getInterviewRoundName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getInterviewFeedbackSheetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getAppTplId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getConcreteOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getInterviewTemplateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getFinished();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getPassed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value3(Integer value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value4(Integer value) {
        setApplierId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value5(Integer value) {
        setHrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value6(Integer value) {
        setInterviewerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value7(Integer value) {
        setInterviewAddressId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value8(Integer value) {
        setInterviewType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value9(String value) {
        setInterviewRoundName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value10(Integer value) {
        setInterviewFeedbackSheetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value11(Integer value) {
        setAppTplId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value12(Integer value) {
        setConcreteOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value13(Integer value) {
        setInterviewTemplateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value14(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value15(Timestamp value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value16(Integer value) {
        setFinished(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value17(Integer value) {
        setPassed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value18(Integer value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value19(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord value20(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewConcreteRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, String value9, Integer value10, Integer value11, Integer value12, Integer value13, Timestamp value14, Timestamp value15, Integer value16, Integer value17, Integer value18, Timestamp value19, Timestamp value20) {
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
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrInterviewConcreteRecord
     */
    public HrInterviewConcreteRecord() {
        super(HrInterviewConcrete.HR_INTERVIEW_CONCRETE);
    }

    /**
     * Create a detached, initialised HrInterviewConcreteRecord
     */
    public HrInterviewConcreteRecord(Integer id, Integer companyId, Integer appId, Integer applierId, Integer hrId, Integer interviewerId, Integer interviewAddressId, Integer interviewType, String interviewRoundName, Integer interviewFeedbackSheetId, Integer appTplId, Integer concreteOrder, Integer interviewTemplateId, Timestamp startTime, Timestamp endTime, Integer finished, Integer passed, Integer disable, Timestamp createTime, Timestamp updateTime) {
        super(HrInterviewConcrete.HR_INTERVIEW_CONCRETE);

        set(0, id);
        set(1, companyId);
        set(2, appId);
        set(3, applierId);
        set(4, hrId);
        set(5, interviewerId);
        set(6, interviewAddressId);
        set(7, interviewType);
        set(8, interviewRoundName);
        set(9, interviewFeedbackSheetId);
        set(10, appTplId);
        set(11, concreteOrder);
        set(12, interviewTemplateId);
        set(13, startTime);
        set(14, endTime);
        set(15, finished);
        set(16, passed);
        set(17, disable);
        set(18, createTime);
        set(19, updateTime);
    }
}