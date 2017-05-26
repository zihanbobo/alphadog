/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables.records;


import com.moseeker.baseorm.db.analytics.tables.StHrLogin;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用于统计雇主登录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StHrLoginRecord extends UpdatableRecordImpl<StHrLoginRecord> implements Record4<Integer, Timestamp, String, Integer> {

    private static final long serialVersionUID = 715868549;

    /**
     * Setter for <code>analytics.st_hr_login.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>analytics.st_hr_login.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>analytics.st_hr_login.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>analytics.st_hr_login.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>analytics.st_hr_login.employee_id</code>. 对应sys_employee表的id
     */
    public void setEmployeeId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>analytics.st_hr_login.employee_id</code>. 对应sys_employee表的id
     */
    public String getEmployeeId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>analytics.st_hr_login.department_id</code>. 所属部门id
     */
    public void setDepartmentId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>analytics.st_hr_login.department_id</code>. 所属部门id
     */
    public Integer getDepartmentId() {
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
    public Row4<Integer, Timestamp, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StHrLogin.ST_HR_LOGIN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return StHrLogin.ST_HR_LOGIN.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return StHrLogin.ST_HR_LOGIN.EMPLOYEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return StHrLogin.ST_HR_LOGIN.DEPARTMENT_ID;
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
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDepartmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StHrLoginRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StHrLoginRecord value2(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StHrLoginRecord value3(String value) {
        setEmployeeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StHrLoginRecord value4(Integer value) {
        setDepartmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StHrLoginRecord values(Integer value1, Timestamp value2, String value3, Integer value4) {
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
     * Create a detached StHrLoginRecord
     */
    public StHrLoginRecord() {
        super(StHrLogin.ST_HR_LOGIN);
    }

    /**
     * Create a detached, initialised StHrLoginRecord
     */
    public StHrLoginRecord(Integer id, Timestamp createTime, String employeeId, Integer departmentId) {
        super(StHrLogin.ST_HR_LOGIN);

        set(0, id);
        set(1, createTime);
        set(2, employeeId);
        set(3, departmentId);
    }
}
