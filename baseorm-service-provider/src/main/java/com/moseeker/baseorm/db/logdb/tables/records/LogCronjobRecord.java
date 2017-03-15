/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.logdb.tables.records;


import com.moseeker.baseorm.db.logdb.tables.LogCronjob;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogCronjobRecord extends UpdatableRecordImpl<LogCronjobRecord> implements Record5<Integer, Integer, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = -1423844958;

    /**
     * Setter for <code>logdb.log_cronjob.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>logdb.log_cronjob.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>logdb.log_cronjob.cronjob_id</code>.
     */
    public void setCronjobId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>logdb.log_cronjob.cronjob_id</code>.
     */
    public Integer getCronjobId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>logdb.log_cronjob.start</code>. 开始时间
     */
    public void setStart(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>logdb.log_cronjob.start</code>. 开始时间
     */
    public Timestamp getStart() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>logdb.log_cronjob.end</code>. 结束时间
     */
    public void setEnd(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>logdb.log_cronjob.end</code>. 结束时间
     */
    public Timestamp getEnd() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>logdb.log_cronjob.result</code>. 运行结果 1 失败, 0 成功
     */
    public void setResult(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>logdb.log_cronjob.result</code>. 运行结果 1 失败, 0 成功
     */
    public Integer getResult() {
        return (Integer) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LogCronjob.LOG_CRONJOB.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LogCronjob.LOG_CRONJOB.CRONJOB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return LogCronjob.LOG_CRONJOB.START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return LogCronjob.LOG_CRONJOB.END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return LogCronjob.LOG_CRONJOB.RESULT;
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
        return getCronjobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getEnd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogCronjobRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogCronjobRecord value2(Integer value) {
        setCronjobId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogCronjobRecord value3(Timestamp value) {
        setStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogCronjobRecord value4(Timestamp value) {
        setEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogCronjobRecord value5(Integer value) {
        setResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogCronjobRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LogCronjobRecord
     */
    public LogCronjobRecord() {
        super(LogCronjob.LOG_CRONJOB);
    }

    /**
     * Create a detached, initialised LogCronjobRecord
     */
    public LogCronjobRecord(Integer id, Integer cronjobId, Timestamp start, Timestamp end, Integer result) {
        super(LogCronjob.LOG_CRONJOB);

        set(0, id);
        set(1, cronjobId);
        set(2, start);
        set(3, end);
        set(4, result);
    }
}
