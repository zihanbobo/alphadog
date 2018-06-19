/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.records;


import com.moseeker.baseorm.db.configdb.tables.ConfigHbBalance;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 手动录入微信账户余额
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigHbBalanceRecord extends UpdatableRecordImpl<ConfigHbBalanceRecord> implements Record4<Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -434235394;

    /**
     * Setter for <code>configdb.config_hb_balance.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>configdb.config_hb_balance.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>configdb.config_hb_balance.balance</code>. 录入的账户余额
     */
    public void setBalance(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>configdb.config_hb_balance.balance</code>. 录入的账户余额
     */
    public Integer getBalance() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>configdb.config_hb_balance.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>configdb.config_hb_balance.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>configdb.config_hb_balance.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>configdb.config_hb_balance.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
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
    public Row4<Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ConfigHbBalance.CONFIG_HB_BALANCE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ConfigHbBalance.CONFIG_HB_BALANCE.BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ConfigHbBalance.CONFIG_HB_BALANCE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ConfigHbBalance.CONFIG_HB_BALANCE.UPDATE_TIME;
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
        return getBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigHbBalanceRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigHbBalanceRecord value2(Integer value) {
        setBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigHbBalanceRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigHbBalanceRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigHbBalanceRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4) {
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
     * Create a detached ConfigHbBalanceRecord
     */
    public ConfigHbBalanceRecord() {
        super(ConfigHbBalance.CONFIG_HB_BALANCE);
    }

    /**
     * Create a detached, initialised ConfigHbBalanceRecord
     */
    public ConfigHbBalanceRecord(Integer id, Integer balance, Timestamp createTime, Timestamp updateTime) {
        super(ConfigHbBalance.CONFIG_HB_BALANCE);

        set(0, id);
        set(1, balance);
        set(2, createTime);
        set(3, updateTime);
    }
}
