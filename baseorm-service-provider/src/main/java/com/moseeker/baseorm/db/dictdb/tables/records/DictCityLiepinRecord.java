/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables.records;


import com.moseeker.baseorm.db.dictdb.tables.DictCityLiepin;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class DictCityLiepinRecord extends UpdatableRecordImpl<DictCityLiepinRecord> implements Record9<Integer, String, String, String, Byte, String, String, String, String> {

    private static final long serialVersionUID = 287599010;

    /**
     * Setter for <code>dictdb.dict_city_liepin.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>dictdb.dict_city_liepin.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dictdb.dict_city_liepin.code</code>. 猎聘citycode
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>dictdb.dict_city_liepin.code</code>. 猎聘citycode
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dictdb.dict_city_liepin.cname</code>. 中文名称
     */
    public void setCname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>dictdb.dict_city_liepin.cname</code>. 中文名称
     */
    public String getCname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dictdb.dict_city_liepin.ename</code>. 英语名称
     */
    public void setEname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>dictdb.dict_city_liepin.ename</code>. 英语名称
     */
    public String getEname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dictdb.dict_city_liepin.flag</code>. 级别
     */
    public void setFlag(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>dictdb.dict_city_liepin.flag</code>. 级别
     */
    public Byte getFlag() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>dictdb.dict_city_liepin.pcode</code>. 父code
     */
    public void setPcode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>dictdb.dict_city_liepin.pcode</code>. 父code
     */
    public String getPcode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dictdb.dict_city_liepin.seouri</code>. 猎聘dictcity字段，目前没用到
     */
    public void setSeouri(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>dictdb.dict_city_liepin.seouri</code>. 猎聘dictcity字段，目前没用到
     */
    public String getSeouri() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dictdb.dict_city_liepin.shortname</code>. 简称
     */
    public void setShortname(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>dictdb.dict_city_liepin.shortname</code>. 简称
     */
    public String getShortname() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dictdb.dict_city_liepin.othercode</code>. 猎聘对应的仟寻citycode
     */
    public void setOthercode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>dictdb.dict_city_liepin.othercode</code>. 猎聘对应的仟寻citycode
     */
    public String getOthercode() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, Byte, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, Byte, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DictCityLiepin.DICT_CITY_LIEPIN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DictCityLiepin.DICT_CITY_LIEPIN.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DictCityLiepin.DICT_CITY_LIEPIN.CNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DictCityLiepin.DICT_CITY_LIEPIN.ENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return DictCityLiepin.DICT_CITY_LIEPIN.FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DictCityLiepin.DICT_CITY_LIEPIN.PCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DictCityLiepin.DICT_CITY_LIEPIN.SEOURI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DictCityLiepin.DICT_CITY_LIEPIN.SHORTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DictCityLiepin.DICT_CITY_LIEPIN.OTHERCODE;
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
    public String value2() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSeouri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getShortname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOthercode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityLiepinRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityLiepinRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityLiepinRecord value3(String value) {
        setCname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityLiepinRecord value4(String value) {
        setEname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityLiepinRecord value5(Byte value) {
        setFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityLiepinRecord value6(String value) {
        setPcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityLiepinRecord value7(String value) {
        setSeouri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityLiepinRecord value8(String value) {
        setShortname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityLiepinRecord value9(String value) {
        setOthercode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCityLiepinRecord values(Integer value1, String value2, String value3, String value4, Byte value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictCityLiepinRecord
     */
    public DictCityLiepinRecord() {
        super(DictCityLiepin.DICT_CITY_LIEPIN);
    }

    /**
     * Create a detached, initialised DictCityLiepinRecord
     */
    public DictCityLiepinRecord(Integer id, String code, String cname, String ename, Byte flag, String pcode, String seouri, String shortname, String othercode) {
        super(DictCityLiepin.DICT_CITY_LIEPIN);

        set(0, id);
        set(1, code);
        set(2, cname);
        set(3, ename);
        set(4, flag);
        set(5, pcode);
        set(6, seouri);
        set(7, shortname);
        set(8, othercode);
    }
}
