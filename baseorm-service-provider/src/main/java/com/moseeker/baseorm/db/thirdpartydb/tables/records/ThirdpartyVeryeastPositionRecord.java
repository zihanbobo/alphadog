/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables.records;


import com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyVeryeastPosition;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 的第三方职位子表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThirdpartyVeryeastPositionRecord extends UpdatableRecordImpl<ThirdpartyVeryeastPositionRecord> implements Record15<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Short> {

    private static final long serialVersionUID = -983635964;

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.id</code>. 主键
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.id</code>. 主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.pid</code>. 关联职位
     */
    public void setPid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.pid</code>. 关联职位
     */
    public Integer getPid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.accommodation</code>. 提供食宿
     */
    public void setAccommodation(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.accommodation</code>. 提供食宿
     */
    public Integer getAccommodation() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.age_top</code>. 年龄上限
     */
    public void setAgeTop(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.age_top</code>. 年龄上限
     */
    public Integer getAgeTop() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.age_bottom</code>. 年龄下限
     */
    public void setAgeBottom(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.age_bottom</code>. 年龄下限
     */
    public Integer getAgeBottom() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.languageType1</code>. 语言能力类型1
     */
    public void setLanguagetype1(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.languageType1</code>. 语言能力类型1
     */
    public Integer getLanguagetype1() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.languageLevel1</code>. 语言能力等级1
     */
    public void setLanguagelevel1(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.languageLevel1</code>. 语言能力等级1
     */
    public Integer getLanguagelevel1() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.languageType2</code>. 语言能力类型2
     */
    public void setLanguagetype2(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.languageType2</code>. 语言能力类型2
     */
    public Integer getLanguagetype2() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.languageLevel2</code>. 语言能力等级2
     */
    public void setLanguagelevel2(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.languageLevel2</code>. 语言能力等级2
     */
    public Integer getLanguagelevel2() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.languageType3</code>. 语言能力类型3
     */
    public void setLanguagetype3(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.languageType3</code>. 语言能力类型3
     */
    public Integer getLanguagetype3() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.languageLevel3</code>. 语言能力等级3
     */
    public void setLanguagelevel3(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.languageLevel3</code>. 语言能力等级3
     */
    public Integer getLanguagelevel3() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.computerLevel</code>. 计算机能力
     */
    public void setComputerlevel(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.computerLevel</code>. 计算机能力
     */
    public Integer getComputerlevel() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.indate</code>. 有效期
     */
    public void setIndate(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.indate</code>. 有效期
     */
    public Integer getIndate() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.createTime</code>. 创建时间
     */
    public void setCreatetime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.createTime</code>. 创建时间
     */
    public Timestamp getCreatetime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.status</code>. 只能状态 0 是有效 1是无效
     */
    public void setStatus(Short value) {
        set(14, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.status</code>. 只能状态 0 是有效 1是无效
     */
    public Short getStatus() {
        return (Short) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Short> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Short> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.ACCOMMODATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.AGE_TOP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.AGE_BOTTOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGETYPE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGELEVEL1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGETYPE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGELEVEL2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGETYPE3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGELEVEL3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.COMPUTERLEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.INDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.CREATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field15() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.STATUS;
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
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAccommodation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAgeTop();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAgeBottom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getLanguagetype1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLanguagelevel1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getLanguagetype2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getLanguagelevel2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getLanguagetype3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getLanguagelevel3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getComputerlevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getIndate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getCreatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value15() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value2(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value3(Integer value) {
        setAccommodation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value4(Integer value) {
        setAgeTop(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value5(Integer value) {
        setAgeBottom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value6(Integer value) {
        setLanguagetype1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value7(Integer value) {
        setLanguagelevel1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value8(Integer value) {
        setLanguagetype2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value9(Integer value) {
        setLanguagelevel2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value10(Integer value) {
        setLanguagetype3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value11(Integer value) {
        setLanguagelevel3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value12(Integer value) {
        setComputerlevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value13(Integer value) {
        setIndate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value14(Timestamp value) {
        setCreatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value15(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Timestamp value14, Short value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ThirdpartyVeryeastPositionRecord
     */
    public ThirdpartyVeryeastPositionRecord() {
        super(ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION);
    }

    /**
     * Create a detached, initialised ThirdpartyVeryeastPositionRecord
     */
    public ThirdpartyVeryeastPositionRecord(Integer id, Integer pid, Integer accommodation, Integer ageTop, Integer ageBottom, Integer languagetype1, Integer languagelevel1, Integer languagetype2, Integer languagelevel2, Integer languagetype3, Integer languagelevel3, Integer computerlevel, Integer indate, Timestamp createtime, Short status) {
        super(ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION);

        set(0, id);
        set(1, pid);
        set(2, accommodation);
        set(3, ageTop);
        set(4, ageBottom);
        set(5, languagetype1);
        set(6, languagelevel1);
        set(7, languagetype2);
        set(8, languagelevel2);
        set(9, languagetype3);
        set(10, languagelevel3);
        set(11, computerlevel);
        set(12, indate);
        set(13, createtime);
        set(14, status);
    }
}
