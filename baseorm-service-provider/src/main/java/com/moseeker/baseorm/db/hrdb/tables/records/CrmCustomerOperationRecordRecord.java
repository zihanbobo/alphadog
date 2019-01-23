/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.CrmCustomerOperationRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class CrmCustomerOperationRecordRecord extends UpdatableRecordImpl<CrmCustomerOperationRecordRecord> implements Record14<Integer, Timestamp, Timestamp, String, String, String, String, String, String, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 465762400;

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.id</code>. primaryKey
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.id</code>. primaryKey
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.event_start_time</code>. 活动开始时间
     */
    public void setEventStartTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.event_start_time</code>. 活动开始时间
     */
    public Timestamp getEventStartTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.event_end_time</code>. 活动结束时间
     */
    public void setEventEndTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.event_end_time</code>. 活动结束时间
     */
    public Timestamp getEventEndTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.post_position_num</code>. 发布职位数
     */
    public void setPostPositionNum(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.post_position_num</code>. 发布职位数
     */
    public String getPostPositionNum() {
        return (String) get(3);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.read_position_num</code>. 职位浏览量
     */
    public void setReadPositionNum(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.read_position_num</code>. 职位浏览量
     */
    public String getReadPositionNum() {
        return (String) get(4);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.relay_position_num</code>. 职位转发量
     */
    public void setRelayPositionNum(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.relay_position_num</code>. 职位转发量
     */
    public String getRelayPositionNum() {
        return (String) get(5);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.post_num</code>. 投递量
     */
    public void setPostNum(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.post_num</code>. 投递量
     */
    public String getPostNum() {
        return (String) get(6);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.employee_authentication</code>. 认证员工
     */
    public void setEmployeeAuthentication(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.employee_authentication</code>. 认证员工
     */
    public String getEmployeeAuthentication() {
        return (String) get(7);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.fans_num</code>. 粉丝增长量
     */
    public void setFansNum(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.fans_num</code>. 粉丝增长量
     */
    public String getFansNum() {
        return (String) get(8);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.customerId</code>. 客户id crm_customer.id
     */
    public void setCustomerid(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.customerId</code>. 客户id crm_customer.id
     */
    public Integer getCustomerid() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.editorId</code>. 编辑者id
     */
    public void setEditorid(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.editorId</code>. 编辑者id
     */
    public Integer getEditorid() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.ver</code>. 版本号
     */
    public void setVer(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.ver</code>. 版本号
     */
    public Integer getVer() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>hrdb.crm_customer_operation_record.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>hrdb.crm_customer_operation_record.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Timestamp, Timestamp, String, String, String, String, String, String, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Timestamp, Timestamp, String, String, String, String, String, String, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.EVENT_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.EVENT_END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.POST_POSITION_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.READ_POSITION_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.RELAY_POSITION_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.POST_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.EMPLOYEE_AUTHENTICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.FANS_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.CUSTOMERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.EDITORID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.VER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD.UPDATE_TIME;
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
    public Timestamp value2() {
        return getEventStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getEventEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPostPositionNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getReadPositionNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRelayPositionNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPostNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEmployeeAuthentication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFansNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getCustomerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getEditorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getVer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value2(Timestamp value) {
        setEventStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value3(Timestamp value) {
        setEventEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value4(String value) {
        setPostPositionNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value5(String value) {
        setReadPositionNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value6(String value) {
        setRelayPositionNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value7(String value) {
        setPostNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value8(String value) {
        setEmployeeAuthentication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value9(String value) {
        setFansNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value10(Integer value) {
        setCustomerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value11(Integer value) {
        setEditorid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value12(Integer value) {
        setVer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value13(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord value14(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrmCustomerOperationRecordRecord values(Integer value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, Integer value10, Integer value11, Integer value12, Timestamp value13, Timestamp value14) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CrmCustomerOperationRecordRecord
     */
    public CrmCustomerOperationRecordRecord() {
        super(CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD);
    }

    /**
     * Create a detached, initialised CrmCustomerOperationRecordRecord
     */
    public CrmCustomerOperationRecordRecord(Integer id, Timestamp eventStartTime, Timestamp eventEndTime, String postPositionNum, String readPositionNum, String relayPositionNum, String postNum, String employeeAuthentication, String fansNum, Integer customerid, Integer editorid, Integer ver, Timestamp createTime, Timestamp updateTime) {
        super(CrmCustomerOperationRecord.CRM_CUSTOMER_OPERATION_RECORD);

        set(0, id);
        set(1, eventStartTime);
        set(2, eventEndTime);
        set(3, postPositionNum);
        set(4, readPositionNum);
        set(5, relayPositionNum);
        set(6, postNum);
        set(7, employeeAuthentication);
        set(8, fansNum);
        set(9, customerid);
        set(10, editorid);
        set(11, ver);
        set(12, createTime);
        set(13, updateTime);
    }
}
