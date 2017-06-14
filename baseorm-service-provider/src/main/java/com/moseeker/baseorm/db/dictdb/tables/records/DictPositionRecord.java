/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.dictdb.tables.records;


import com.moseeker.baseorm.db.dictdb.tables.DictPosition;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 职能分类字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictPositionRecord extends UpdatableRecordImpl<DictPositionRecord> implements Record4<Integer, String, Integer, Byte> {

    private static final long serialVersionUID = 1464664404;

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
     * Setter for <code>dictdb.dict_position.parent</code>. 父编码
     */
    public void setParent(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>dictdb.dict_position.parent</code>. 父编码
     */
    public Integer getParent() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>dictdb.dict_position.level</code>. 字典level
     */
    public void setLevel(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>dictdb.dict_position.level</code>. 字典level
     */
    public Byte getLevel() {
        return (Byte) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Integer, Byte> valuesRow() {
        return (Row4) super.valuesRow();
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
    public Field<Integer> field3() {
        return DictPosition.DICT_POSITION.PARENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
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
    public Integer value3() {
        return getParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
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
    public DictPositionRecord value3(Integer value) {
        setParent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictPositionRecord value4(Byte value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictPositionRecord values(Integer value1, String value2, Integer value3, Byte value4) {
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
     * Create a detached DictPositionRecord
     */
    public DictPositionRecord() {
        super(DictPosition.DICT_POSITION);
    }

    /**
     * Create a detached, initialised DictPositionRecord
     */
    public DictPositionRecord(Integer code, String name, Integer parent, Byte level) {
        super(DictPosition.DICT_POSITION);

        set(0, code);
        set(1, name);
        set(2, parent);
        set(3, level);
    }
}
