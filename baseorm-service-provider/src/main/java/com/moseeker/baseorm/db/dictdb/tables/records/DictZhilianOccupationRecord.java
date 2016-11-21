/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.dictdb.tables.records;


import com.moseeker.baseorm.db.dictdb.tables.DictZhilianOccupation;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictZhilianOccupationRecord extends UpdatableRecordImpl<DictZhilianOccupationRecord> implements Record6<UInteger, UInteger, String, UShort, UShort, Timestamp> {

    private static final long serialVersionUID = 2063137842;

    /**
     * Setter for <code>dictdb.dict_zhilian_occupation.id</code>. 职能id
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>dictdb.dict_zhilian_occupation.id</code>. 职能id
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>dictdb.dict_zhilian_occupation.parientId</code>. 父Id，上一级职能的ID
     */
    public void setParientid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>dictdb.dict_zhilian_occupation.parientId</code>. 父Id，上一级职能的ID
     */
    public UInteger getParientid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>dictdb.dict_zhilian_occupation.name</code>. 职能名称
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dictdb.dict_zhilian_occupation.name</code>. 职能名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dictdb.dict_zhilian_occupation.level</code>. 职能级别 1是一级2是
     */
    public void setLevel(UShort value) {
        set(3, value);
    }

    /**
     * Getter for <code>dictdb.dict_zhilian_occupation.level</code>. 职能级别 1是一级2是
     */
    public UShort getLevel() {
        return (UShort) get(3);
    }

    /**
     * Setter for <code>dictdb.dict_zhilian_occupation.status</code>. 只能状态 0 是无效 1是有效
     */
    public void setStatus(UShort value) {
        set(4, value);
    }

    /**
     * Getter for <code>dictdb.dict_zhilian_occupation.status</code>. 只能状态 0 是无效 1是有效
     */
    public UShort getStatus() {
        return (UShort) get(4);
    }

    /**
     * Setter for <code>dictdb.dict_zhilian_occupation.createTime</code>. 创建时间
     */
    public void setCreatetime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>dictdb.dict_zhilian_occupation.createTime</code>. 创建时间
     */
    public Timestamp getCreatetime() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, UInteger, String, UShort, UShort, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UInteger, UInteger, String, UShort, UShort, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION.PARIENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field4() {
        return DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field5() {
        return DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION.CREATETIME;
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
    public UInteger value2() {
        return getParientid();
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
    public UShort value4() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictZhilianOccupationRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictZhilianOccupationRecord value2(UInteger value) {
        setParientid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictZhilianOccupationRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictZhilianOccupationRecord value4(UShort value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictZhilianOccupationRecord value5(UShort value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictZhilianOccupationRecord value6(Timestamp value) {
        setCreatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictZhilianOccupationRecord values(UInteger value1, UInteger value2, String value3, UShort value4, UShort value5, Timestamp value6) {
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
     * Create a detached DictZhilianOccupationRecord
     */
    public DictZhilianOccupationRecord() {
        super(DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION);
    }

    /**
     * Create a detached, initialised DictZhilianOccupationRecord
     */
    public DictZhilianOccupationRecord(UInteger id, UInteger parientid, String name, UShort level, UShort status, Timestamp createtime) {
        super(DictZhilianOccupation.DICT_ZHILIAN_OCCUPATION);

        set(0, id);
        set(1, parientid);
        set(2, name);
        set(3, level);
        set(4, status);
        set(5, createtime);
    }
}
