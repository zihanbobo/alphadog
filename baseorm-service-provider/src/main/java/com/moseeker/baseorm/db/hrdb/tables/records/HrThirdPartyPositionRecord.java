/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;

import com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyPosition;


/**
 * 第三方渠道同步的职位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrThirdPartyPositionRecord extends UpdatableRecordImpl<HrThirdPartyPositionRecord> implements Record9<Integer, UInteger, String, Short, Short, Short, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1778241366;

    /**
     * Setter for <code>hrdb.hr_third_party_position.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.position_id</code>. jobdb.job_position.id
     */
    public void setPositionId(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.position_id</code>. jobdb.job_position.id
     */
    public UInteger getPositionId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.third_part_position_id</code>. 第三方渠道编号
     */
    public void setThirdPartPositionId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.third_part_position_id</code>. 第三方渠道编号
     */
    public String getThirdPartPositionId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.channel</code>. 1=51job,2=猎聘,3=智联,4=linkedin
     */
    public void setChannel(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.channel</code>. 1=51job,2=猎聘,3=智联,4=linkedin
     */
    public Short getChannel() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.is_synchronization</code>. 是否同步:0=未同步,1=同步,2=同步中，3=同步失败
     */
    public void setIsSynchronization(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.is_synchronization</code>. 是否同步:0=未同步,1=同步,2=同步中，3=同步失败
     */
    public Short getIsSynchronization() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.is_refresh</code>. 是否刷新:0=未刷新,1=刷新,2=刷新中
     */
    public void setIsRefresh(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.is_refresh</code>. 是否刷新:0=未刷新,1=刷新,2=刷新中
     */
    public Short getIsRefresh() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.sync_time</code>. 职位同步时间
     */
    public void setSyncTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.sync_time</code>. 职位同步时间
     */
    public Timestamp getSyncTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.refresh_time</code>. 职位刷新时间
     */
    public void setRefreshTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.refresh_time</code>. 职位刷新时间
     */
    public Timestamp getRefreshTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>hrdb.hr_third_party_position.update_time</code>. 数据更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.hr_third_party_position.update_time</code>. 数据更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, UInteger, String, Short, Short, Short, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, UInteger, String, Short, Short, Short, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
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
    public HrThirdPartyPositionRecord values(Integer value1, UInteger value2, String value3, Short value4, Short value5, Short value6, Timestamp value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
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
    public HrThirdPartyPositionRecord(Integer id, UInteger positionId, String thirdPartPositionId, Short channel, Short isSynchronization, Short isRefresh, Timestamp syncTime, Timestamp refreshTime, Timestamp updateTime) {
        super(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION);

        set(0, id);
        set(1, positionId);
        set(2, thirdPartPositionId);
        set(3, channel);
        set(4, isSynchronization);
        set(5, isRefresh);
        set(6, syncTime);
        set(7, refreshTime);
        set(8, updateTime);
    }
}
