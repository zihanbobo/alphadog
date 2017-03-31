/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dictdb.tables.records;


import com.moseeker.db.dictdb.tables.DictConstant;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 常量字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictConstantRecord extends UpdatableRecordImpl<DictConstantRecord> implements Record7<UInteger, Integer, String, Byte, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1085977981;

    /**
     * Setter for <code>dictdb.dict_constant.id</code>. 主key
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>dictdb.dict_constant.id</code>. 主key
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>dictdb.dict_constant.code</code>. 字典code
     */
    public void setCode(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>dictdb.dict_constant.code</code>. 字典code
     */
    public Integer getCode() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>dictdb.dict_constant.name</code>. 字典name
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dictdb.dict_constant.name</code>. 字典name
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dictdb.dict_constant.priority</code>. 优先级
     */
    public void setPriority(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>dictdb.dict_constant.priority</code>. 优先级
     */
    public Byte getPriority() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>dictdb.dict_constant.parent_code</code>. 父级字典code
     */
    public void setParentCode(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>dictdb.dict_constant.parent_code</code>. 父级字典code
     */
    public Integer getParentCode() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>dictdb.dict_constant.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>dictdb.dict_constant.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>dictdb.dict_constant.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>dictdb.dict_constant.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UInteger, Integer, String, Byte, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UInteger, Integer, String, Byte, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return DictConstant.DICT_CONSTANT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DictConstant.DICT_CONSTANT.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DictConstant.DICT_CONSTANT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return DictConstant.DICT_CONSTANT.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return DictConstant.DICT_CONSTANT.PARENT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return DictConstant.DICT_CONSTANT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return DictConstant.DICT_CONSTANT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCode();
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
    public Byte value4() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getParentCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictConstantRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictConstantRecord value2(Integer value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictConstantRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictConstantRecord value4(Byte value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictConstantRecord value5(Integer value) {
        setParentCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictConstantRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictConstantRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictConstantRecord values(UInteger value1, Integer value2, String value3, Byte value4, Integer value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictConstantRecord
     */
    public DictConstantRecord() {
        super(DictConstant.DICT_CONSTANT);
    }

    /**
     * Create a detached, initialised DictConstantRecord
     */
    public DictConstantRecord(UInteger id, Integer code, String name, Byte priority, Integer parentCode, Timestamp createTime, Timestamp updateTime) {
        super(DictConstant.DICT_CONSTANT);

        set(0, id);
        set(1, code);
        set(2, name);
        set(3, priority);
        set(4, parentCode);
        set(5, createTime);
        set(6, updateTime);
    }
}
