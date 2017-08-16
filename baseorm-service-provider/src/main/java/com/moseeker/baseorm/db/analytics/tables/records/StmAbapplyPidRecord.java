/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables.records;


import com.moseeker.baseorm.db.analytics.tables.StmAbapplyPid;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class StmAbapplyPidRecord extends TableRecordImpl<StmAbapplyPidRecord> implements Record7<Long, String, String, Timestamp, Byte, String, String> {

    private static final long serialVersionUID = 514596784;

    /**
     * Setter for <code>analytics.stm_abapply_pid.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>analytics.stm_abapply_pid.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>analytics.stm_abapply_pid.ab_group</code>.
     */
    public void setAbGroup(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>analytics.stm_abapply_pid.ab_group</code>.
     */
    public String getAbGroup() {
        return (String) get(1);
    }

    /**
     * Setter for <code>analytics.stm_abapply_pid.apply</code>. page：从我感兴趣投递，interest：从我感兴趣投递
     */
    public void setApply(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>analytics.stm_abapply_pid.apply</code>. page：从我感兴趣投递，interest：从我感兴趣投递
     */
    public String getApply() {
        return (String) get(2);
    }

    /**
     * Setter for <code>analytics.stm_abapply_pid.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>analytics.stm_abapply_pid.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>analytics.stm_abapply_pid.is_recom</code>.
     */
    public void setIsRecom(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>analytics.stm_abapply_pid.is_recom</code>.
     */
    public Byte getIsRecom() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>analytics.stm_abapply_pid.pid</code>.
     */
    public void setPid(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>analytics.stm_abapply_pid.pid</code>.
     */
    public String getPid() {
        return (String) get(5);
    }

    /**
     * Setter for <code>analytics.stm_abapply_pid.recom</code>.
     */
    public void setRecom(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>analytics.stm_abapply_pid.recom</code>.
     */
    public String getRecom() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Timestamp, Byte, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Timestamp, Byte, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return StmAbapplyPid.STM_ABAPPLY_PID.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StmAbapplyPid.STM_ABAPPLY_PID.AB_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return StmAbapplyPid.STM_ABAPPLY_PID.APPLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return StmAbapplyPid.STM_ABAPPLY_PID.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return StmAbapplyPid.STM_ABAPPLY_PID.IS_RECOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return StmAbapplyPid.STM_ABAPPLY_PID.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return StmAbapplyPid.STM_ABAPPLY_PID.RECOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAbGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getApply();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsRecom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRecom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmAbapplyPidRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmAbapplyPidRecord value2(String value) {
        setAbGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmAbapplyPidRecord value3(String value) {
        setApply(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmAbapplyPidRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmAbapplyPidRecord value5(Byte value) {
        setIsRecom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmAbapplyPidRecord value6(String value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmAbapplyPidRecord value7(String value) {
        setRecom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmAbapplyPidRecord values(Long value1, String value2, String value3, Timestamp value4, Byte value5, String value6, String value7) {
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
     * Create a detached StmAbapplyPidRecord
     */
    public StmAbapplyPidRecord() {
        super(StmAbapplyPid.STM_ABAPPLY_PID);
    }

    /**
     * Create a detached, initialised StmAbapplyPidRecord
     */
    public StmAbapplyPidRecord(Long id, String abGroup, String apply, Timestamp createTime, Byte isRecom, String pid, String recom) {
        super(StmAbapplyPid.STM_ABAPPLY_PID);

        set(0, id);
        set(1, abGroup);
        set(2, apply);
        set(3, createTime);
        set(4, isRecom);
        set(5, pid);
        set(6, recom);
    }
}