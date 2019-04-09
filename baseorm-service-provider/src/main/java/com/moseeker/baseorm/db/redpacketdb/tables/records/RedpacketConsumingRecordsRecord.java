/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.redpacketdb.tables.records;


import com.moseeker.baseorm.db.redpacketdb.tables.RedpacketConsumingRecords;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 账户变更记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RedpacketConsumingRecordsRecord extends UpdatableRecordImpl<RedpacketConsumingRecordsRecord> implements Record10<Integer, Integer, Integer, Byte, Integer, String, String, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = -1969291309;

    /**
     * Setter for <code>redpacketdb.redpacket_consuming_records.id</code>. 记录编号，用于主键
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>redpacketdb.redpacket_consuming_records.id</code>. 记录编号，用于主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>redpacketdb.redpacket_consuming_records.balance_id</code>. 账户编号
     */
    public void setBalanceId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>redpacketdb.redpacket_consuming_records.balance_id</code>. 账户编号
     */
    public Integer getBalanceId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>redpacketdb.redpacket_consuming_records.amount</code>. 可用余额
     */
    public void setAmount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>redpacketdb.redpacket_consuming_records.amount</code>. 可用余额
     */
    public Integer getAmount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>redpacketdb.redpacket_consuming_records.scene</code>. 业务场景
     */
    public void setScene(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>redpacketdb.redpacket_consuming_records.scene</code>. 业务场景
     */
    public Byte getScene() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>redpacketdb.redpacket_consuming_records.business_id</code>. 业务编号
     */
    public void setBusinessId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>redpacketdb.redpacket_consuming_records.business_id</code>. 业务编号
     */
    public Integer getBusinessId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>redpacketdb.redpacket_consuming_records.bill_no</code>. 业务方编号
     */
    public void setBillNo(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>redpacketdb.redpacket_consuming_records.bill_no</code>. 业务方编号
     */
    public String getBillNo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>redpacketdb.redpacket_consuming_records.description</code>. 场景描述
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>redpacketdb.redpacket_consuming_records.description</code>. 场景描述
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>redpacketdb.redpacket_consuming_records.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>redpacketdb.redpacket_consuming_records.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>redpacketdb.redpacket_consuming_records.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>redpacketdb.redpacket_consuming_records.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>redpacketdb.redpacket_consuming_records.operation_id</code>. 操作人
     */
    public void setOperationId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>redpacketdb.redpacket_consuming_records.operation_id</code>. 操作人
     */
    public Integer getOperationId() {
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
    public Row10<Integer, Integer, Integer, Byte, Integer, String, String, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, Integer, Byte, Integer, String, String, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS.BALANCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS.SCENE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS.BUSINESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS.BILL_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS.OPERATION_ID;
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
        return getBalanceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getScene();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getBusinessId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBillNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
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
        return getOperationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord value2(Integer value) {
        setBalanceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord value3(Integer value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord value4(Byte value) {
        setScene(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord value5(Integer value) {
        setBusinessId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord value6(String value) {
        setBillNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord value10(Integer value) {
        setOperationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketConsumingRecordsRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Integer value5, String value6, String value7, Timestamp value8, Timestamp value9, Integer value10) {
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
     * Create a detached RedpacketConsumingRecordsRecord
     */
    public RedpacketConsumingRecordsRecord() {
        super(RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS);
    }

    /**
     * Create a detached, initialised RedpacketConsumingRecordsRecord
     */
    public RedpacketConsumingRecordsRecord(Integer id, Integer balanceId, Integer amount, Byte scene, Integer businessId, String billNo, String description, Timestamp createTime, Timestamp updateTime, Integer operationId) {
        super(RedpacketConsumingRecords.REDPACKET_CONSUMING_RECORDS);

        set(0, id);
        set(1, balanceId);
        set(2, amount);
        set(3, scene);
        set(4, businessId);
        set(5, billNo);
        set(6, description);
        set(7, createTime);
        set(8, updateTime);
        set(9, operationId);
    }
}