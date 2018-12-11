/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.referraldb.tables.records;


import com.moseeker.baseorm.db.referraldb.tables.HrImporterMonitor;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 企业用户导入数据异步处理监控操作表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrImporterMonitorRecord extends UpdatableRecordImpl<HrImporterMonitorRecord> implements Record11<Integer, Integer, Integer, Byte, String, Short, String, Timestamp, Timestamp, String, Byte> {

    private static final long serialVersionUID = -1699976291;

    /**
     * Setter for <code>referraldb.hr_importer_monitor.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>referraldb.hr_importer_monitor.company_id</code>. 公司ID，hr_company.id
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.company_id</code>. 公司ID，hr_company.id
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>referraldb.hr_importer_monitor.hraccount_id</code>. hr_account.id 账号编号
     */
    public void setHraccountId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.hraccount_id</code>. hr_account.id 账号编号
     */
    public Integer getHraccountId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>referraldb.hr_importer_monitor.type</code>. 要导入的表：0：user_employee 1: job_position 2:hr_company
     */
    public void setType(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.type</code>. 要导入的表：0：user_employee 1: job_position 2:hr_company
     */
    public Byte getType() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>referraldb.hr_importer_monitor.file</code>. 导入文件的绝对路径
     */
    public void setFile(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.file</code>. 导入文件的绝对路径
     */
    public String getFile() {
        return (String) get(4);
    }

    /**
     * Setter for <code>referraldb.hr_importer_monitor.status</code>. 0：待处理 1：处理失败 2：处理成功
     */
    public void setStatus(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.status</code>. 0：待处理 1：处理失败 2：处理成功
     */
    public Short getStatus() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>referraldb.hr_importer_monitor.message</code>. 操作提示信息
     */
    public void setMessage(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.message</code>. 操作提示信息
     */
    public String getMessage() {
        return (String) get(6);
    }

    /**
     * Setter for <code>referraldb.hr_importer_monitor.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>referraldb.hr_importer_monitor.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>referraldb.hr_importer_monitor.name</code>. 导入的文件名
     */
    public void setName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.name</code>. 导入的文件名
     */
    public String getName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>referraldb.hr_importer_monitor.sys</code>. 1:mp, 2:hr
     */
    public void setSys(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>referraldb.hr_importer_monitor.sys</code>. 1:mp, 2:hr
     */
    public Byte getSys() {
        return (Byte) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, Byte, String, Short, String, Timestamp, Timestamp, String, Byte> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, Byte, String, Short, String, Timestamp, Timestamp, String, Byte> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.HRACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return HrImporterMonitor.HR_IMPORTER_MONITOR.SYS;
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
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getHraccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMessage();
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
    public String value10() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getSys();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value3(Integer value) {
        setHraccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value4(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value5(String value) {
        setFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value6(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value7(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value10(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord value11(Byte value) {
        setSys(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrImporterMonitorRecord values(Integer value1, Integer value2, Integer value3, Byte value4, String value5, Short value6, String value7, Timestamp value8, Timestamp value9, String value10, Byte value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrImporterMonitorRecord
     */
    public HrImporterMonitorRecord() {
        super(HrImporterMonitor.HR_IMPORTER_MONITOR);
    }

    /**
     * Create a detached, initialised HrImporterMonitorRecord
     */
    public HrImporterMonitorRecord(Integer id, Integer companyId, Integer hraccountId, Byte type, String file, Short status, String message, Timestamp createTime, Timestamp updateTime, String name, Byte sys) {
        super(HrImporterMonitor.HR_IMPORTER_MONITOR);

        set(0, id);
        set(1, companyId);
        set(2, hraccountId);
        set(3, type);
        set(4, file);
        set(5, status);
        set(6, message);
        set(7, createTime);
        set(8, updateTime);
        set(9, name);
        set(10, sys);
    }
}
