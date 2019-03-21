/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrAtsLastOperationRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * hr ats申请状态的上一个操作记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAtsLastOperationRecordRecord extends UpdatableRecordImpl<HrAtsLastOperationRecordRecord> implements Record4<Integer, Integer, Timestamp, Integer> {

    private static final long serialVersionUID = -812854655;

    /**
     * Setter for <code>hrdb.hr_ats_last_operation_record.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_last_operation_record.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_ats_last_operation_record.app_id</code>. job_application.id
     */
    public void setAppId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_last_operation_record.app_id</code>. job_application.id
     */
    public Integer getAppId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_ats_last_operation_record.opt_time</code>. 操作时间
     */
    public void setOptTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_last_operation_record.opt_time</code>. 操作时间
     */
    public Timestamp getOptTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_ats_last_operation_record.last_app_tpl_id</code>. hr_award_config_template.id
     */
    public void setLastAppTplId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_ats_last_operation_record.last_app_tpl_id</code>. hr_award_config_template.id
     */
    public Integer getLastAppTplId() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Timestamp, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Timestamp, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrAtsLastOperationRecord.HR_ATS_LAST_OPERATION_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrAtsLastOperationRecord.HR_ATS_LAST_OPERATION_RECORD.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return HrAtsLastOperationRecord.HR_ATS_LAST_OPERATION_RECORD.OPT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return HrAtsLastOperationRecord.HR_ATS_LAST_OPERATION_RECORD.LAST_APP_TPL_ID;
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
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getOptTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getLastAppTplId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsLastOperationRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsLastOperationRecordRecord value2(Integer value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsLastOperationRecordRecord value3(Timestamp value) {
        setOptTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsLastOperationRecordRecord value4(Integer value) {
        setLastAppTplId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsLastOperationRecordRecord values(Integer value1, Integer value2, Timestamp value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrAtsLastOperationRecordRecord
     */
    public HrAtsLastOperationRecordRecord() {
        super(HrAtsLastOperationRecord.HR_ATS_LAST_OPERATION_RECORD);
    }

    /**
     * Create a detached, initialised HrAtsLastOperationRecordRecord
     */
    public HrAtsLastOperationRecordRecord(Integer id, Integer appId, Timestamp optTime, Integer lastAppTplId) {
        super(HrAtsLastOperationRecord.HR_ATS_LAST_OPERATION_RECORD);

        set(0, id);
        set(1, appId);
        set(2, optTime);
        set(3, lastAppTplId);
    }
}
