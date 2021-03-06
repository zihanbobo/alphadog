/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrAtsPhaseBaseEvent;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * hr阶段事件可配置选项表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAtsPhaseBaseEventRecord extends UpdatableRecordImpl<HrAtsPhaseBaseEventRecord> implements Record7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1441089991;

    /**
     * Setter for <code>hrdb.hr_ats_phase_base_event.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_phase_base_event.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_ats_phase_base_event.base_id</code>. hrdb.hr_ats_process_base.id   企业招聘流程基础类别表id

     */
    public void setBaseId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_phase_base_event.base_id</code>. hrdb.hr_ats_process_base.id   企业招聘流程基础类别表id

     */
    public Integer getBaseId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_ats_phase_base_event.event_id</code>. 事件id hrdb.hr_ats_process_event_items.id
     */
    public void setEventId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_phase_base_event.event_id</code>. 事件id hrdb.hr_ats_process_event_items.id
     */
    public Integer getEventId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_ats_phase_base_event.disable</code>. 是否有效 0有效 1无效
     */
    public void setDisable(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_phase_base_event.disable</code>. 是否有效 0有效 1无效
     */
    public Integer getDisable() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_ats_phase_base_event.company_id</code>. 公司id  hrdb.hr_company.id 若为0则表示通用
     */
    public void setCompanyId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_phase_base_event.company_id</code>. 公司id  hrdb.hr_company.id 若为0则表示通用
     */
    public Integer getCompanyId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_ats_phase_base_event.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_phase_base_event.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_ats_phase_base_event.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_phase_base_event.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT.BASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT.EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT.UPDATE_TIME;
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
        return getBaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDisable();
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
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsPhaseBaseEventRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsPhaseBaseEventRecord value2(Integer value) {
        setBaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsPhaseBaseEventRecord value3(Integer value) {
        setEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsPhaseBaseEventRecord value4(Integer value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsPhaseBaseEventRecord value5(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsPhaseBaseEventRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsPhaseBaseEventRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsPhaseBaseEventRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrAtsPhaseBaseEventRecord
     */
    public HrAtsPhaseBaseEventRecord() {
        super(HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT);
    }

    /**
     * Create a detached, initialised HrAtsPhaseBaseEventRecord
     */
    public HrAtsPhaseBaseEventRecord(Integer id, Integer baseId, Integer eventId, Integer disable, Integer companyId, Timestamp createTime, Timestamp updateTime) {
        super(HrAtsPhaseBaseEvent.HR_ATS_PHASE_BASE_EVENT);

        set(0, id);
        set(1, baseId);
        set(2, eventId);
        set(3, disable);
        set(4, companyId);
        set(5, createTime);
        set(6, updateTime);
    }
}
