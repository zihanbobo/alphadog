/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.dictdb.tables.records;


import com.moseeker.baseorm.db.dictdb.tables.DictMajor;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * 专业字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictMajorRecord extends TableRecordImpl<DictMajorRecord> implements Record3<String, String, Byte> {

    private static final long serialVersionUID = 1424339165;

    /**
     * Setter for <code>dictdb.dict_major.code</code>. 字典code
     */
    public void setCode(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>dictdb.dict_major.code</code>. 字典code
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dictdb.dict_major.name</code>. 字典name
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dictdb.dict_major.name</code>. 字典name
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dictdb.dict_major.level</code>. 字典level
     */
    public void setLevel(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>dictdb.dict_major.level</code>. 字典level
     */
    public Byte getLevel() {
        return (Byte) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Byte> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Byte> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DictMajor.DICT_MAJOR.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DictMajor.DICT_MAJOR.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return DictMajor.DICT_MAJOR.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
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
    public Byte value3() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictMajorRecord value1(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictMajorRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictMajorRecord value3(Byte value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictMajorRecord values(String value1, String value2, Byte value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictMajorRecord
     */
    public DictMajorRecord() {
        super(DictMajor.DICT_MAJOR);
    }

    /**
     * Create a detached, initialised DictMajorRecord
     */
    public DictMajorRecord(String code, String name, Byte level) {
        super(DictMajor.DICT_MAJOR);

        set(0, code);
        set(1, name);
        set(2, level);
    }
}
