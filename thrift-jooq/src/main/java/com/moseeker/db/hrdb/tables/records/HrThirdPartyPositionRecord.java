/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables.records;


import com.moseeker.db.hrdb.tables.HrThirdPartyPosition;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 第三方渠道同步的职位
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrThirdPartyPositionRecord extends UpdatableRecordImpl<HrThirdPartyPositionRecord> implements Record14<Integer, UInteger, String, Short, Short, Short, Timestamp, Timestamp, Timestamp, String, String, String, Short, Integer> {

	private static final long serialVersionUID = -1411439922;

	/**
	 * Setter for <code>hrdb.hr_third_party_position.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.position_id</code>. jobdb.job_position.id
	 */
	public void setPositionId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.position_id</code>. jobdb.job_position.id
	 */
	public UInteger getPositionId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.third_part_position_id</code>. 第三方渠道编号
	 */
	public void setThirdPartPositionId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.third_part_position_id</code>. 第三方渠道编号
	 */
	public String getThirdPartPositionId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.channel</code>. 1=51job,2=猎聘,3=智联,4=linkedin
	 */
	public void setChannel(Short value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.channel</code>. 1=51job,2=猎聘,3=智联,4=linkedin
	 */
	public Short getChannel() {
		return (Short) getValue(3);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.is_synchronization</code>. 是否同步:0=未同步,1=同步,2=同步中，3=同步失败
	 */
	public void setIsSynchronization(Short value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.is_synchronization</code>. 是否同步:0=未同步,1=同步,2=同步中，3=同步失败
	 */
	public Short getIsSynchronization() {
		return (Short) getValue(4);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.is_refresh</code>. 是否刷新:0=未刷新,1=刷新,2=刷新中
	 */
	public void setIsRefresh(Short value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.is_refresh</code>. 是否刷新:0=未刷新,1=刷新,2=刷新中
	 */
	public Short getIsRefresh() {
		return (Short) getValue(5);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.sync_time</code>. 职位同步时间
	 */
	public void setSyncTime(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.sync_time</code>. 职位同步时间
	 */
	public Timestamp getSyncTime() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.refresh_time</code>. 职位刷新时间
	 */
	public void setRefreshTime(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.refresh_time</code>. 职位刷新时间
	 */
	public Timestamp getRefreshTime() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.update_time</code>. 数据更新时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.update_time</code>. 数据更新时间
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.address</code>. 详细地址
	 */
	public void setAddress(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.address</code>. 详细地址
	 */
	public String getAddress() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.occupation</code>. 同步时选中的第三方职位职能
	 */
	public void setOccupation(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.occupation</code>. 同步时选中的第三方职位职能
	 */
	public String getOccupation() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.sync_fail_reason</code>. 失败原因
	 */
	public void setSyncFailReason(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.sync_fail_reason</code>. 失败原因
	 */
	public String getSyncFailReason() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.use_company_address</code>. 使用企业地址
	 */
	public void setUseCompanyAddress(Short value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.use_company_address</code>. 使用企业地址
	 */
	public Short getUseCompanyAddress() {
		return (Short) getValue(12);
	}

	/**
	 * Setter for <code>hrdb.hr_third_party_position.third_party_account_id</code>. 第三方账号ID
	 */
	public void setThirdPartyAccountId(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>hrdb.hr_third_party_position.third_party_account_id</code>. 第三方账号ID
	 */
	public Integer getThirdPartyAccountId() {
		return (Integer) getValue(13);
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
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<Integer, UInteger, String, Short, Short, Short, Timestamp, Timestamp, Timestamp, String, String, String, Short, Integer> fieldsRow() {
		return (Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row14<Integer, UInteger, String, Short, Short, Short, Timestamp, Timestamp, Timestamp, String, String, String, Short, Integer> valuesRow() {
		return (Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.POSITION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.THIRD_PART_POSITION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field4() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.CHANNEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field5() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.IS_SYNCHRONIZATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field6() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.IS_REFRESH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.SYNC_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.REFRESH_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.OCCUPATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.SYNC_FAIL_REASON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Short> field13() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.USE_COMPANY_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field14() {
		return HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.THIRD_PARTY_ACCOUNT_ID;
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
	public UInteger value2() {
		return getPositionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getThirdPartPositionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value4() {
		return getChannel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value5() {
		return getIsSynchronization();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value6() {
		return getIsRefresh();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getSyncTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getRefreshTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getOccupation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getSyncFailReason();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Short value13() {
		return getUseCompanyAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value14() {
		return getThirdPartyAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value2(UInteger value) {
		setPositionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value3(String value) {
		setThirdPartPositionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value4(Short value) {
		setChannel(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value5(Short value) {
		setIsSynchronization(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value6(Short value) {
		setIsRefresh(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value7(Timestamp value) {
		setSyncTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value8(Timestamp value) {
		setRefreshTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value9(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value10(String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value11(String value) {
		setOccupation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value12(String value) {
		setSyncFailReason(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value13(Short value) {
		setUseCompanyAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord value14(Integer value) {
		setThirdPartyAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrThirdPartyPositionRecord values(Integer value1, UInteger value2, String value3, Short value4, Short value5, Short value6, Timestamp value7, Timestamp value8, Timestamp value9, String value10, String value11, String value12, Short value13, Integer value14) {
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
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HrThirdPartyPositionRecord
	 */
	public HrThirdPartyPositionRecord() {
		super(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION);
	}

	/**
	 * Create a detached, initialised HrThirdPartyPositionRecord
	 */
	public HrThirdPartyPositionRecord(Integer id, UInteger positionId, String thirdPartPositionId, Short channel, Short isSynchronization, Short isRefresh, Timestamp syncTime, Timestamp refreshTime, Timestamp updateTime, String address, String occupation, String syncFailReason, Short useCompanyAddress, Integer thirdPartyAccountId) {
		super(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION);

		setValue(0, id);
		setValue(1, positionId);
		setValue(2, thirdPartPositionId);
		setValue(3, channel);
		setValue(4, isSynchronization);
		setValue(5, isRefresh);
		setValue(6, syncTime);
		setValue(7, refreshTime);
		setValue(8, updateTime);
		setValue(9, address);
		setValue(10, occupation);
		setValue(11, syncFailReason);
		setValue(12, useCompanyAddress);
		setValue(13, thirdPartyAccountId);
	}
}
