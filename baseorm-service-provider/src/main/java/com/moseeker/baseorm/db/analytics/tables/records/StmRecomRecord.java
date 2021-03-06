/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables.records;


import com.moseeker.baseorm.db.analytics.tables.StmRecom;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class StmRecomRecord extends UpdatableRecordImpl<StmRecomRecord> implements Record7<Integer, String, String, Timestamp, Integer, Integer, Integer> {

    private static final long serialVersionUID = -1797929621;

    /**
     * Setter for <code>analytics.stm_recom.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>analytics.stm_recom.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>analytics.stm_recom.recom</code>.
     */
    public void setRecom(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>analytics.stm_recom.recom</code>.
     */
    public String getRecom() {
        return (String) get(1);
    }

    /**
     * Setter for <code>analytics.stm_recom.viewer_id</code>.
     */
    public void setViewerId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>analytics.stm_recom.viewer_id</code>.
     */
    public String getViewerId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>analytics.stm_recom.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>analytics.stm_recom.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>analytics.stm_recom.click_from</code>. 来自, 0:未知, 朋友圈(timeline ) 1, 微信群(groupmessage) 2, 个人消息(singlemessage) 3
     */
    public void setClickFrom(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>analytics.stm_recom.click_from</code>. 来自, 0:未知, 朋友圈(timeline ) 1, 微信群(groupmessage) 2, 个人消息(singlemessage) 3
     */
    public Integer getClickFrom() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>analytics.stm_recom.pid</code>.
     */
    public void setPid(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>analytics.stm_recom.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>analytics.stm_recom.recom_user_id</code>. user_user.id
     */
    public void setRecomUserId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>analytics.stm_recom.recom_user_id</code>. user_user.id
     */
    public Integer getRecomUserId() {
        return (Integer) get(6);
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
    public Row7<Integer, String, String, Timestamp, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, Timestamp, Integer, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StmRecom.STM_RECOM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return StmRecom.STM_RECOM.RECOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return StmRecom.STM_RECOM.VIEWER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return StmRecom.STM_RECOM.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return StmRecom.STM_RECOM.CLICK_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return StmRecom.STM_RECOM.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return StmRecom.STM_RECOM.RECOM_USER_ID;
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
    public String value2() {
        return getRecom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getViewerId();
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
    public Integer value5() {
        return getClickFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getRecomUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmRecomRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmRecomRecord value2(String value) {
        setRecom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmRecomRecord value3(String value) {
        setViewerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmRecomRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmRecomRecord value5(Integer value) {
        setClickFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmRecomRecord value6(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmRecomRecord value7(Integer value) {
        setRecomUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmRecomRecord values(Integer value1, String value2, String value3, Timestamp value4, Integer value5, Integer value6, Integer value7) {
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
     * Create a detached StmRecomRecord
     */
    public StmRecomRecord() {
        super(StmRecom.STM_RECOM);
    }

    /**
     * Create a detached, initialised StmRecomRecord
     */
    public StmRecomRecord(Integer id, String recom, String viewerId, Timestamp createTime, Integer clickFrom, Integer pid, Integer recomUserId) {
        super(StmRecom.STM_RECOM);

        set(0, id);
        set(1, recom);
        set(2, viewerId);
        set(3, createTime);
        set(4, clickFrom);
        set(5, pid);
        set(6, recomUserId);
    }
}
