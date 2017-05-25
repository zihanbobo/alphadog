/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables.records;


import com.moseeker.db.hrdb.tables.HrPointsConf;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 雇主积分规则配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrPointsConfRecord extends UpdatableRecordImpl<HrPointsConfRecord> implements Record16<Integer, Integer, String, Long, String, Byte, Byte, Timestamp, String, Byte, String, String, Byte, String, String, UInteger> {

    private static final long serialVersionUID = -1509427145;

    /**
     * Setter for <code>hrdb.hr_points_conf.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.company_id</code>.
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.company_id</code>.
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.status_name</code>. name of status defined, if using ATS, please set it the same as ATS
     */
    public void setStatusName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.status_name</code>. name of status defined, if using ATS, please set it the same as ATS
     */
    public String getStatusName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.reward</code>. 积分数量
     */
    public void setReward(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.reward</code>. 积分数量
     */
    public Long getReward() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.is_using</code>. 是否启用0：启用1：禁用
     */
    public void setIsUsing(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.is_using</code>. 是否启用0：启用1：禁用
     */
    public Byte getIsUsing() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.order_num</code>. 优先级
     */
    public void setOrderNum(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.order_num</code>. 优先级
     */
    public Byte getOrderNum() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf._update_time</code>.
     */
    public void set_UpdateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf._update_time</code>.
     */
    public Timestamp get_UpdateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.tag</code>.
     */
    public void setTag(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.tag</code>.
     */
    public String getTag() {
        return (String) get(8);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.is_applier_send</code>. 申请者是否发送消息模板0:发送1:不发送
     */
    public void setIsApplierSend(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.is_applier_send</code>. 申请者是否发送消息模板0:发送1:不发送
     */
    public Byte getIsApplierSend() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.applier_first</code>. 申请状态模板发送问候语
     */
    public void setApplierFirst(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.applier_first</code>. 申请状态模板发送问候语
     */
    public String getApplierFirst() {
        return (String) get(10);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.applier_remark</code>. 申请状态模板发送结束语
     */
    public void setApplierRemark(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.applier_remark</code>. 申请状态模板发送结束语
     */
    public String getApplierRemark() {
        return (String) get(11);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.is_recom_send</code>. 推荐者是否发送消息模板0:发送1:不发送
     */
    public void setIsRecomSend(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.is_recom_send</code>. 推荐者是否发送消息模板0:发送1:不发送
     */
    public Byte getIsRecomSend() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.recom_first</code>. 推荐者申请状态模板发送问候语
     */
    public void setRecomFirst(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.recom_first</code>. 推荐者申请状态模板发送问候语
     */
    public String getRecomFirst() {
        return (String) get(13);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.recom_remark</code>. 推荐者申请状态模板发送结束语
     */
    public void setRecomRemark(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.recom_remark</code>. 推荐者申请状态模板发送结束语
     */
    public String getRecomRemark() {
        return (String) get(14);
    }

    /**
     * Setter for <code>hrdb.hr_points_conf.template_id</code>. 申请状态模板ID，hr_award_config_template.id
     */
    public void setTemplateId(UInteger value) {
        set(15, value);
    }

    /**
     * Getter for <code>hrdb.hr_points_conf.template_id</code>. 申请状态模板ID，hr_award_config_template.id
     */
    public UInteger getTemplateId() {
        return (UInteger) get(15);
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
    public Row16<Integer, Integer, String, Long, String, Byte, Byte, Timestamp, String, Byte, String, String, Byte, String, String, UInteger> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, String, Long, String, Byte, Byte, Timestamp, String, Byte, String, String, Byte, String, String, UInteger> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrPointsConf.HR_POINTS_CONF.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrPointsConf.HR_POINTS_CONF.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HrPointsConf.HR_POINTS_CONF.STATUS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return HrPointsConf.HR_POINTS_CONF.REWARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return HrPointsConf.HR_POINTS_CONF.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return HrPointsConf.HR_POINTS_CONF.IS_USING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return HrPointsConf.HR_POINTS_CONF.ORDER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return HrPointsConf.HR_POINTS_CONF._UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return HrPointsConf.HR_POINTS_CONF.TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return HrPointsConf.HR_POINTS_CONF.IS_APPLIER_SEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return HrPointsConf.HR_POINTS_CONF.APPLIER_FIRST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return HrPointsConf.HR_POINTS_CONF.APPLIER_REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return HrPointsConf.HR_POINTS_CONF.IS_RECOM_SEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return HrPointsConf.HR_POINTS_CONF.RECOM_FIRST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return HrPointsConf.HR_POINTS_CONF.RECOM_REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field16() {
        return HrPointsConf.HR_POINTS_CONF.TEMPLATE_ID;
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
    public String value3() {
        return getStatusName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getReward();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getIsUsing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getOrderNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return get_UpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getIsApplierSend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getApplierFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getApplierRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getIsRecomSend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getRecomFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getRecomRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value16() {
        return getTemplateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value3(String value) {
        setStatusName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value4(Long value) {
        setReward(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value6(Byte value) {
        setIsUsing(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value7(Byte value) {
        setOrderNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value8(Timestamp value) {
        set_UpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value9(String value) {
        setTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value10(Byte value) {
        setIsApplierSend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value11(String value) {
        setApplierFirst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value12(String value) {
        setApplierRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value13(Byte value) {
        setIsRecomSend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value14(String value) {
        setRecomFirst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value15(String value) {
        setRecomRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord value16(UInteger value) {
        setTemplateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrPointsConfRecord values(Integer value1, Integer value2, String value3, Long value4, String value5, Byte value6, Byte value7, Timestamp value8, String value9, Byte value10, String value11, String value12, Byte value13, String value14, String value15, UInteger value16) {
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
     * Create a detached HrPointsConfRecord
     */
    public HrPointsConfRecord() {
        super(HrPointsConf.HR_POINTS_CONF);
    }

    /**
     * Create a detached, initialised HrPointsConfRecord
     */
    public HrPointsConfRecord(Integer id, Integer companyId, String statusName, Long reward, String description, Byte isUsing, Byte orderNum, Timestamp _UpdateTime, String tag, Byte isApplierSend, String applierFirst, String applierRemark, Byte isRecomSend, String recomFirst, String recomRemark, UInteger templateId) {
        super(HrPointsConf.HR_POINTS_CONF);

        set(0, id);
        set(1, companyId);
        set(2, statusName);
        set(3, reward);
        set(4, description);
        set(5, isUsing);
        set(6, orderNum);
        set(7, _UpdateTime);
        set(8, tag);
        set(9, isApplierSend);
        set(10, applierFirst);
        set(11, applierRemark);
        set(12, isRecomSend);
        set(13, recomFirst);
        set(14, recomRemark);
        set(15, templateId);
    }
}
