/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.records;


import com.moseeker.baseorm.db.dictdb.tables.DictPosition;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * 职能分类字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictPositionRecord extends TableRecordImpl<DictPositionRecord> implements Record5<Integer, String, String, Integer, Byte> {

    private static final long serialVersionUID = 1515699432;

    /**
     * Setter for <code>dictdb.dict_position.code</code>. 字典code
     */
    public void setCode(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dictdb.dict_position.code</code>. 字典code
     */
    public Integer getCode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dictdb.dict_position.name</code>. 字典name
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dictdb.dict_position.name</code>. 字典name
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dictdb.dict_position.ename</code>.
     */
    public void setEname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dictdb.dict_position.ename</code>.
     */
    public String getEname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dictdb.dict_position.parent</code>. 父编码
     */
    public void setParent(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>dictdb.dict_position.parent</code>. 父编码
     */
    public Integer getParent() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>dictdb.dict_position.level</code>. 字典level
     */
    public void setLevel(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>dictdb.dict_position.level</code>. 字典level
     */
    public Byte getLevel() {
        return (Byte) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Integer, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Integer, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DictPosition.DICT_POSITION.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DictPosition.DICT_POSITION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DictPosition.DICT_POSITION.ENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DictPosition.DICT_POSITION.PARENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return DictPosition.DICT_POSITION.LEVEL;
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
    public String value3() {
        return getEname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictPositionRecord value1(Integer value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictPositionRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictPositionRecord value3(String value) {
        setEname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictPositionRecord value4(Integer value) {
        setParent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictPositionRecord value5(Byte value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictPositionRecord values(Integer value1, String value2, String value3, Integer value4, Byte value5) {
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
     * Create a detached DictPositionRecord
     */
    public DictPositionRecord() {
        super(DictPosition.DICT_POSITION);
    }

    /**
     * Create a detached, initialised DictPositionRecord
     */
    public DictPositionRecord(Integer code, String name, String ename, Integer parent, Byte level) {
        super(DictPosition.DICT_POSITION);

        set(0, code);
        set(1, name);
        set(2, ename);
        set(3, parent);
        set(4, level);
    }
}
