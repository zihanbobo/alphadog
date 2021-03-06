/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.records;


import com.moseeker.baseorm.db.dictdb.tables.Dict_58jobOccupation;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 58职能表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dict_58jobOccupationRecord extends UpdatableRecordImpl<Dict_58jobOccupationRecord> implements Record6<Integer, String, String, String, Short, Short> {

    private static final long serialVersionUID = 1874328762;

    /**
     * Setter for <code>dictdb.dict_58job_occupation.code</code>.
     */
    public void setCode(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dictdb.dict_58job_occupation.code</code>.
     */
    public Integer getCode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dictdb.dict_58job_occupation.parent_id</code>. 职能code
     */
    public void setParentId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dictdb.dict_58job_occupation.parent_id</code>. 职能code
     */
    public String getParentId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dictdb.dict_58job_occupation.name</code>. 职能名称
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dictdb.dict_58job_occupation.name</code>. 职能名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dictdb.dict_58job_occupation.code_other</code>.
     */
    public void setCodeOther(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>dictdb.dict_58job_occupation.code_other</code>.
     */
    public String getCodeOther() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dictdb.dict_58job_occupation.level</code>. 职能级别 1是一级2是二级依次类推
     */
    public void setLevel(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>dictdb.dict_58job_occupation.level</code>. 职能级别 1是一级2是二级依次类推
     */
    public Short getLevel() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>dictdb.dict_58job_occupation.status</code>.
     */
    public void setStatus(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>dictdb.dict_58job_occupation.status</code>.
     */
    public Short getStatus() {
        return (Short) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Short, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Short, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Dict_58jobOccupation.DICT_58JOB_OCCUPATION.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Dict_58jobOccupation.DICT_58JOB_OCCUPATION.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Dict_58jobOccupation.DICT_58JOB_OCCUPATION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Dict_58jobOccupation.DICT_58JOB_OCCUPATION.CODE_OTHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Dict_58jobOccupation.DICT_58JOB_OCCUPATION.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Dict_58jobOccupation.DICT_58JOB_OCCUPATION.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCodeOther();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getLevel();
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
    public Dict_58jobOccupationRecord value1(Integer value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dict_58jobOccupationRecord value2(String value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dict_58jobOccupationRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dict_58jobOccupationRecord value4(String value) {
        setCodeOther(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dict_58jobOccupationRecord value5(Short value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dict_58jobOccupationRecord value6(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dict_58jobOccupationRecord values(Integer value1, String value2, String value3, String value4, Short value5, Short value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Dict_58jobOccupationRecord
     */
    public Dict_58jobOccupationRecord() {
        super(Dict_58jobOccupation.DICT_58JOB_OCCUPATION);
    }

    /**
     * Create a detached, initialised Dict_58jobOccupationRecord
     */
    public Dict_58jobOccupationRecord(Integer code, String parentId, String name, String codeOther, Short level, Short status) {
        super(Dict_58jobOccupation.DICT_58JOB_OCCUPATION);

        set(0, code);
        set(1, parentId);
        set(2, name);
        set(3, codeOther);
        set(4, level);
        set(5, status);
    }
}
