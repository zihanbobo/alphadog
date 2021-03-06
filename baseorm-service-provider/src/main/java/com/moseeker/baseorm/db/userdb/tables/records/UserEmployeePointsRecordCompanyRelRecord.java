/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables.records;


import com.moseeker.baseorm.db.userdb.tables.UserEmployeePointsRecordCompanyRel;

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
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserEmployeePointsRecordCompanyRelRecord extends UpdatableRecordImpl<UserEmployeePointsRecordCompanyRelRecord> implements Record5<Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 634665364;

    /**
     * Setter for <code>userdb.user_employee_points_record_company_rel.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>userdb.user_employee_points_record_company_rel.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>userdb.user_employee_points_record_company_rel.company_id</code>. 公司ID
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>userdb.user_employee_points_record_company_rel.company_id</code>. 公司ID
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>userdb.user_employee_points_record_company_rel.employee_points_record_id</code>. 员工积分记录表ID
     */
    public void setEmployeePointsRecordId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>userdb.user_employee_points_record_company_rel.employee_points_record_id</code>. 员工积分记录表ID
     */
    public Integer getEmployeePointsRecordId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>userdb.user_employee_points_record_company_rel.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>userdb.user_employee_points_record_company_rel.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>userdb.user_employee_points_record_company_rel.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>userdb.user_employee_points_record_company_rel.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
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
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserEmployeePointsRecordCompanyRel.USER_EMPLOYEE_POINTS_RECORD_COMPANY_REL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserEmployeePointsRecordCompanyRel.USER_EMPLOYEE_POINTS_RECORD_COMPANY_REL.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserEmployeePointsRecordCompanyRel.USER_EMPLOYEE_POINTS_RECORD_COMPANY_REL.EMPLOYEE_POINTS_RECORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return UserEmployeePointsRecordCompanyRel.USER_EMPLOYEE_POINTS_RECORD_COMPANY_REL.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UserEmployeePointsRecordCompanyRel.USER_EMPLOYEE_POINTS_RECORD_COMPANY_REL.UPDATE_TIME;
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
        return getEmployeePointsRecordId();
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
    public Timestamp value5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserEmployeePointsRecordCompanyRelRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserEmployeePointsRecordCompanyRelRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserEmployeePointsRecordCompanyRelRecord value3(Integer value) {
        setEmployeePointsRecordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserEmployeePointsRecordCompanyRelRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserEmployeePointsRecordCompanyRelRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserEmployeePointsRecordCompanyRelRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached UserEmployeePointsRecordCompanyRelRecord
     */
    public UserEmployeePointsRecordCompanyRelRecord() {
        super(UserEmployeePointsRecordCompanyRel.USER_EMPLOYEE_POINTS_RECORD_COMPANY_REL);
    }

    /**
     * Create a detached, initialised UserEmployeePointsRecordCompanyRelRecord
     */
    public UserEmployeePointsRecordCompanyRelRecord(Integer id, Integer companyId, Integer employeePointsRecordId, Timestamp createTime, Timestamp updateTime) {
        super(UserEmployeePointsRecordCompanyRel.USER_EMPLOYEE_POINTS_RECORD_COMPANY_REL);

        set(0, id);
        set(1, companyId);
        set(2, employeePointsRecordId);
        set(3, createTime);
        set(4, updateTime);
    }
}
