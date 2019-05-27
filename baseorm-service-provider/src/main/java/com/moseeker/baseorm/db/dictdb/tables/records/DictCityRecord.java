/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.records;


import com.moseeker.baseorm.db.dictdb.tables.DictCity;
import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * 城市字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictCityRecord extends UpdatableRecordImpl<DictCityRecord> implements Record6<Integer, String, Byte, Byte, String, Byte> {

    private static final long serialVersionUID = 1770287837;

    /**
     * Setter for <code>dictdb.dict_city.code</code>. 字典code
     */
    public void setCode(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dictdb.dict_city.code</code>. 字典code
     */
    public Integer getCode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dictdb.dict_city.name</code>. 字典name
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dictdb.dict_city.name</code>. 字典name
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dictdb.dict_city.level</code>. 字典level
     */
    public void setLevel(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>dictdb.dict_city.level</code>. 字典level
     */
    public Byte getLevel() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>dictdb.dict_city.hot_city</code>. 热门城市 0:否 1：是
     */
    public void setHotCity(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>dictdb.dict_city.hot_city</code>. 热门城市 0:否 1：是
     */
    public Byte getHotCity() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>dictdb.dict_city.ename</code>. 英文名称
     */
    public void setEname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>dictdb.dict_city.ename</code>. 英文名称
     */
    public String getEname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dictdb.dict_city.is_using</code>. 正在使用 0:没在用 1:在使用
     */
    public void setIsUsing(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>dictdb.dict_city.is_using</code>. 正在使用 0:没在用 1:在使用
     */
    public Byte getIsUsing() {
        return (Byte) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Byte, Byte, String, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Byte, Byte, String, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DictCity.DICT_CITY.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DictCity.DICT_CITY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return DictCity.DICT_CITY.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return DictCity.DICT_CITY.HOT_CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DictCity.DICT_CITY.ENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return DictCity.DICT_CITY.IS_USING;
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
    public Byte value3() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getHotCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getIsUsing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityRecord value1(Integer value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityRecord value3(Byte value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityRecord value4(Byte value) {
        setHotCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityRecord value5(String value) {
        setEname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityRecord value6(Byte value) {
        setIsUsing(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityRecord values(Integer value1, String value2, Byte value3, Byte value4, String value5, Byte value6) {
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
     * Create a detached DictCityRecord
     */
    public DictCityRecord() {
        super(DictCity.DICT_CITY);
    }

    /**
     * Create a detached, initialised DictCityRecord
     */
    public DictCityRecord(Integer code, String name, Byte level, Byte hotCity, String ename, Byte isUsing) {
        super(DictCity.DICT_CITY);

        set(0, code);
        set(1, name);
        set(2, level);
        set(3, hotCity);
        set(4, ename);
        set(5, isUsing);
    }
}
