/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrHbPositionBinding;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 红包配置和职位绑定表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrHbPositionBindingRecord extends UpdatableRecordImpl<HrHbPositionBindingRecord> implements Record8<Integer, Integer, Integer, Byte, BigDecimal, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1941290270;

    /**
     * Setter for <code>hrdb.hr_hb_position_binding.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_hb_position_binding.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_hb_position_binding.hb_config_id</code>. hr_hb_config.id
     */
    public void setHbConfigId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_hb_position_binding.hb_config_id</code>. hr_hb_config.id
     */
    public Integer getHbConfigId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_hb_position_binding.position_id</code>. hr_position.id
     */
    public void setPositionId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_hb_position_binding.position_id</code>. hr_position.id
     */
    public Integer getPositionId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_hb_position_binding.trigger_way</code>. 领取条件：1=职位被转发 2=职位被申请 3=推荐候选人初筛通过
     */
    public void setTriggerWay(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_hb_position_binding.trigger_way</code>. 领取条件：1=职位被转发 2=职位被申请 3=推荐候选人初筛通过
     */
    public Byte getTriggerWay() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_hb_position_binding.total_amount</code>. 总金额
     */
    public void setTotalAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_hb_position_binding.total_amount</code>. 总金额
     */
    public BigDecimal getTotalAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_hb_position_binding.total_num</code>. 红包总数
     */
    public void setTotalNum(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_hb_position_binding.total_num</code>. 红包总数
     */
    public Integer getTotalNum() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_hb_position_binding.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_hb_position_binding.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>hrdb.hr_hb_position_binding.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.hr_hb_position_binding.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Byte, BigDecimal, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Byte, BigDecimal, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrHbPositionBinding.HR_HB_POSITION_BINDING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrHbPositionBinding.HR_HB_POSITION_BINDING.HB_CONFIG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return HrHbPositionBinding.HR_HB_POSITION_BINDING.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return HrHbPositionBinding.HR_HB_POSITION_BINDING.TRIGGER_WAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return HrHbPositionBinding.HR_HB_POSITION_BINDING.TOTAL_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return HrHbPositionBinding.HR_HB_POSITION_BINDING.TOTAL_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return HrHbPositionBinding.HR_HB_POSITION_BINDING.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return HrHbPositionBinding.HR_HB_POSITION_BINDING.UPDATE_TIME;
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
        return getHbConfigId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPositionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getTriggerWay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getTotalAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getTotalNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHbPositionBindingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHbPositionBindingRecord value2(Integer value) {
        setHbConfigId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHbPositionBindingRecord value3(Integer value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHbPositionBindingRecord value4(Byte value) {
        setTriggerWay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHbPositionBindingRecord value5(BigDecimal value) {
        setTotalAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHbPositionBindingRecord value6(Integer value) {
        setTotalNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHbPositionBindingRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHbPositionBindingRecord value8(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHbPositionBindingRecord values(Integer value1, Integer value2, Integer value3, Byte value4, BigDecimal value5, Integer value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrHbPositionBindingRecord
     */
    public HrHbPositionBindingRecord() {
        super(HrHbPositionBinding.HR_HB_POSITION_BINDING);
    }

    /**
     * Create a detached, initialised HrHbPositionBindingRecord
     */
    public HrHbPositionBindingRecord(Integer id, Integer hbConfigId, Integer positionId, Byte triggerWay, BigDecimal totalAmount, Integer totalNum, Timestamp createTime, Timestamp updateTime) {
        super(HrHbPositionBinding.HR_HB_POSITION_BINDING);

        set(0, id);
        set(1, hbConfigId);
        set(2, positionId);
        set(3, triggerWay);
        set(4, totalAmount);
        set(5, totalNum);
        set(6, createTime);
        set(7, updateTime);
    }
}
