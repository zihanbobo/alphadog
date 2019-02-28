/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.records;


import com.moseeker.baseorm.db.referraldb.tables.ReferralEmployeeBonusRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ReferralEmployeeBonusRecordRecord extends UpdatableRecordImpl<ReferralEmployeeBonusRecordRecord> implements Record10<Integer, Integer, Integer, Integer, Integer, Byte, Timestamp, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = -946576565;

    /**
     * Setter for <code>referraldb.referral_employee_bonus_record.id</code>. 序列ID
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>referraldb.referral_employee_bonus_record.id</code>. 序列ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>referraldb.referral_employee_bonus_record.employee_id</code>. 员工ID
     */
    public void setEmployeeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>referraldb.referral_employee_bonus_record.employee_id</code>. 员工ID
     */
    public Integer getEmployeeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>referraldb.referral_employee_bonus_record.application_id</code>. 申请ID
     */
    public void setApplicationId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>referraldb.referral_employee_bonus_record.application_id</code>. 申请ID
     */
    public Integer getApplicationId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>referraldb.referral_employee_bonus_record.bonus_stage_detail_id</code>. 奖金节点ID
     */
    public void setBonusStageDetailId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>referraldb.referral_employee_bonus_record.bonus_stage_detail_id</code>. 奖金节点ID
     */
    public Integer getBonusStageDetailId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>referraldb.referral_employee_bonus_record.bonus</code>. 奖金 有正负值 单位 分
     */
    public void setBonus(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>referraldb.referral_employee_bonus_record.bonus</code>. 奖金 有正负值 单位 分
     */
    public Integer getBonus() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>referraldb.referral_employee_bonus_record.claim</code>. 是否已领取 1 是 0 否
     */
    public void setClaim(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>referraldb.referral_employee_bonus_record.claim</code>. 是否已领取 1 是 0 否
     */
    public Byte getClaim() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>referraldb.referral_employee_bonus_record.claim_time</code>. 领取时间
     */
    public void setClaimTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>referraldb.referral_employee_bonus_record.claim_time</code>. 领取时间
     */
    public Timestamp getClaimTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>referraldb.referral_employee_bonus_record.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>referraldb.referral_employee_bonus_record.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>referraldb.referral_employee_bonus_record.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>referraldb.referral_employee_bonus_record.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>referraldb.referral_employee_bonus_record.disable</code>. 记录是否可用 0 可用 1 不可用
     */
    public void setDisable(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>referraldb.referral_employee_bonus_record.disable</code>. 记录是否可用 0 可用 1 不可用
     */
    public Integer getDisable() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Integer, Integer, Byte, Timestamp, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Integer, Integer, Byte, Timestamp, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.EMPLOYEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.APPLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.BONUS_STAGE_DETAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.BONUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.CLAIM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.CLAIM_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD.DISABLE;
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
        return getEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBonusStageDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getBonus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getClaim();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getClaimTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
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
    public Integer value10() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord value2(Integer value) {
        setEmployeeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord value3(Integer value) {
        setApplicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord value4(Integer value) {
        setBonusStageDetailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord value5(Integer value) {
        setBonus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord value6(Byte value) {
        setClaim(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord value7(Timestamp value) {
        setClaimTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord value10(Integer value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferralEmployeeBonusRecordRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Byte value6, Timestamp value7, Timestamp value8, Timestamp value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReferralEmployeeBonusRecordRecord
     */
    public ReferralEmployeeBonusRecordRecord() {
        super(ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD);
    }

    /**
     * Create a detached, initialised ReferralEmployeeBonusRecordRecord
     */
    public ReferralEmployeeBonusRecordRecord(Integer id, Integer employeeId, Integer applicationId, Integer bonusStageDetailId, Integer bonus, Byte claim, Timestamp claimTime, Timestamp createTime, Timestamp updateTime, Integer disable) {
        super(ReferralEmployeeBonusRecord.REFERRAL_EMPLOYEE_BONUS_RECORD);

        set(0, id);
        set(1, employeeId);
        set(2, applicationId);
        set(3, bonusStageDetailId);
        set(4, bonus);
        set(5, claim);
        set(6, claimTime);
        set(7, createTime);
        set(8, updateTime);
        set(9, disable);
    }
}
