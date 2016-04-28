/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables.records;


import com.moseeker.db.dqv4.tables.HrPointsConf;

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
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrPointsConfRecord extends UpdatableRecordImpl<HrPointsConfRecord> implements Record16<Integer, Integer, String, Long, String, Byte, Byte, String, Byte, String, String, Byte, String, String, UInteger, Timestamp> {

	private static final long serialVersionUID = 715528123;

	/**
	 * Setter for <code>dqv4.hr_points_conf.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.company_id</code>.
	 */
	public void setCompanyId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.company_id</code>.
	 */
	public Integer getCompanyId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.status_name</code>. name of status defined, if using ATS, please set it the same as ATS
	 */
	public void setStatusName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.status_name</code>. name of status defined, if using ATS, please set it the same as ATS
	 */
	public String getStatusName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.reward</code>. 积分数量
	 */
	public void setReward(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.reward</code>. 积分数量
	 */
	public Long getReward() {
		return (Long) getValue(3);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.description</code>.
	 */
	public void setDescription(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.is_using</code>. 是否启用0：启用1：禁用
	 */
	public void setIsUsing(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.is_using</code>. 是否启用0：启用1：禁用
	 */
	public Byte getIsUsing() {
		return (Byte) getValue(5);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.order_num</code>. 优先级
	 */
	public void setOrderNum(Byte value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.order_num</code>. 优先级
	 */
	public Byte getOrderNum() {
		return (Byte) getValue(6);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.tag</code>.
	 */
	public void setTag(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.tag</code>.
	 */
	public String getTag() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.is_applier_send</code>. 申请者是否发送消息模板0:发送1:不发送
	 */
	public void setIsApplierSend(Byte value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.is_applier_send</code>. 申请者是否发送消息模板0:发送1:不发送
	 */
	public Byte getIsApplierSend() {
		return (Byte) getValue(8);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.applier_first</code>. 申请状态模板发送问候语
	 */
	public void setApplierFirst(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.applier_first</code>. 申请状态模板发送问候语
	 */
	public String getApplierFirst() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.applier_remark</code>. 申请状态模板发送结束语
	 */
	public void setApplierRemark(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.applier_remark</code>. 申请状态模板发送结束语
	 */
	public String getApplierRemark() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.is_recom_send</code>. 推荐者是否发送消息模板0:发送1:不发送
	 */
	public void setIsRecomSend(Byte value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.is_recom_send</code>. 推荐者是否发送消息模板0:发送1:不发送
	 */
	public Byte getIsRecomSend() {
		return (Byte) getValue(11);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.recom_first</code>. 推荐者申请状态模板发送问候语
	 */
	public void setRecomFirst(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.recom_first</code>. 推荐者申请状态模板发送问候语
	 */
	public String getRecomFirst() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.recom_remark</code>. 推荐者申请状态模板发送结束语
	 */
	public void setRecomRemark(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.recom_remark</code>. 推荐者申请状态模板发送结束语
	 */
	public String getRecomRemark() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.template_id</code>. 申请状态模板ID，hr_award_config_template.id
	 */
	public void setTemplateId(UInteger value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.template_id</code>. 申请状态模板ID，hr_award_config_template.id
	 */
	public UInteger getTemplateId() {
		return (UInteger) getValue(14);
	}

	/**
	 * Setter for <code>dqv4.hr_points_conf.update_time</code>.
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>dqv4.hr_points_conf.update_time</code>.
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(15);
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
	public Row16<Integer, Integer, String, Long, String, Byte, Byte, String, Byte, String, String, Byte, String, String, UInteger, Timestamp> fieldsRow() {
		return (Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row16<Integer, Integer, String, Long, String, Byte, Byte, String, Byte, String, String, Byte, String, String, UInteger, Timestamp> valuesRow() {
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
	public Field<String> field8() {
		return HrPointsConf.HR_POINTS_CONF.TAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field9() {
		return HrPointsConf.HR_POINTS_CONF.IS_APPLIER_SEND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return HrPointsConf.HR_POINTS_CONF.APPLIER_FIRST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return HrPointsConf.HR_POINTS_CONF.APPLIER_REMARK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field12() {
		return HrPointsConf.HR_POINTS_CONF.IS_RECOM_SEND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return HrPointsConf.HR_POINTS_CONF.RECOM_FIRST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field14() {
		return HrPointsConf.HR_POINTS_CONF.RECOM_REMARK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field15() {
		return HrPointsConf.HR_POINTS_CONF.TEMPLATE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field16() {
		return HrPointsConf.HR_POINTS_CONF.UPDATE_TIME;
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
	public String value8() {
		return getTag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value9() {
		return getIsApplierSend();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getApplierFirst();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getApplierRemark();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value12() {
		return getIsRecomSend();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getRecomFirst();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value14() {
		return getRecomRemark();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value15() {
		return getTemplateId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value16() {
		return getUpdateTime();
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
	public HrPointsConfRecord value8(String value) {
		setTag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrPointsConfRecord value9(Byte value) {
		setIsApplierSend(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrPointsConfRecord value10(String value) {
		setApplierFirst(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrPointsConfRecord value11(String value) {
		setApplierRemark(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrPointsConfRecord value12(Byte value) {
		setIsRecomSend(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrPointsConfRecord value13(String value) {
		setRecomFirst(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrPointsConfRecord value14(String value) {
		setRecomRemark(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrPointsConfRecord value15(UInteger value) {
		setTemplateId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrPointsConfRecord value16(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrPointsConfRecord values(Integer value1, Integer value2, String value3, Long value4, String value5, Byte value6, Byte value7, String value8, Byte value9, String value10, String value11, Byte value12, String value13, String value14, UInteger value15, Timestamp value16) {
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
	public HrPointsConfRecord(Integer id, Integer companyId, String statusName, Long reward, String description, Byte isUsing, Byte orderNum, String tag, Byte isApplierSend, String applierFirst, String applierRemark, Byte isRecomSend, String recomFirst, String recomRemark, UInteger templateId, Timestamp updateTime) {
		super(HrPointsConf.HR_POINTS_CONF);

		setValue(0, id);
		setValue(1, companyId);
		setValue(2, statusName);
		setValue(3, reward);
		setValue(4, description);
		setValue(5, isUsing);
		setValue(6, orderNum);
		setValue(7, tag);
		setValue(8, isApplierSend);
		setValue(9, applierFirst);
		setValue(10, applierRemark);
		setValue(11, isRecomSend);
		setValue(12, recomFirst);
		setValue(13, recomRemark);
		setValue(14, templateId);
		setValue(15, updateTime);
	}
}
