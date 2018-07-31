/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.records;


import com.moseeker.baseorm.db.dictdb.tables.DictIndustry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictIndustryRecord extends UpdatableRecordImpl<DictIndustryRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = -642181213;

    /**
     * Setter for <code>dictdb.dict_industry.code</code>. 字典code
     */
    public void setCode(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dictdb.dict_industry.code</code>. 字典code
     */
    public Integer getCode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dictdb.dict_industry.name</code>. 字典name
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dictdb.dict_industry.name</code>. 字典name
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dictdb.dict_industry.type</code>. 字典分类code
     */
    public void setType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>dictdb.dict_industry.type</code>. 字典分类code
     */
    public Integer getType() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DictIndustry.DICT_INDUSTRY.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DictIndustry.DICT_INDUSTRY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return DictIndustry.DICT_INDUSTRY.TYPE;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictIndustryRecord value1(Integer value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictIndustryRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictIndustryRecord value3(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictIndustryRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictIndustryRecord
     */
    public DictIndustryRecord() {
        super(DictIndustry.DICT_INDUSTRY);
    }

    /**
     * Create a detached, initialised DictIndustryRecord
     */
    public DictIndustryRecord(Integer code, String name, Integer type) {
        super(DictIndustry.DICT_INDUSTRY);

        set(0, code);
        set(1, name);
        set(2, type);
    }
}
