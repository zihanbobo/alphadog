/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables.records;


import com.moseeker.baseorm.db.thirdpartydb.tables.ThirdpartyVeryeastPosition;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 最佳东方的第三方职位子表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThirdpartyVeryeastPositionRecord extends UpdatableRecordImpl<ThirdpartyVeryeastPositionRecord> implements Record16<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Short> {

    private static final long serialVersionUID = 1839550058;

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
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.accommodation</code>. 提供食宿,1:提供,2:不提供,3:可提供吃,4:可提供住,5:面议
     */
    public void setAccommodation(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.accommodation</code>. 提供食宿,1:提供,2:不提供,3:可提供吃,4:可提供住,5:面议
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
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.language_type1</code>. 语言能力类型1,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言
     */
    public void setLanguageType1(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.language_type1</code>. 语言能力类型1,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言
     */
    public Integer getLanguageType1() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.language_level1</code>. 语言能力等级1,1:较差,2:一般,3:良好,4:流利,5:精通
     */
    public void setLanguageLevel1(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.language_level1</code>. 语言能力等级1,1:较差,2:一般,3:良好,4:流利,5:精通
     */
    public Integer getLanguageLevel1() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.language_type2</code>. 语言能力类型2,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言
     */
    public void setLanguageType2(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.language_type2</code>. 语言能力类型2,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言
     */
    public Integer getLanguageType2() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.language_level2</code>. 语言能力等级2,1:较差,2:一般,3:良好,4:流利,5:精通
     */
    public void setLanguageLevel2(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.language_level2</code>. 语言能力等级2,1:较差,2:一般,3:良好,4:流利,5:精通
     */
    public Integer getLanguageLevel2() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.language_type3</code>. 语言能力类型3,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言
     */
    public void setLanguageType3(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.language_type3</code>. 语言能力类型3,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言
     */
    public Integer getLanguageType3() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.language_level3</code>. 语言能力等级3,1:较差,2:一般,3:良好,4:流利,5:精通
     */
    public void setLanguageLevel3(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.language_level3</code>. 语言能力等级3,1:较差,2:一般,3:良好,4:流利,5:精通
     */
    public Integer getLanguageLevel3() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.computer_level</code>. 计算机能力
     */
    public void setComputerLevel(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.computer_level</code>. 计算机能力
     */
    public Integer getComputerLevel() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.indate</code>. 有效期,7:7天,15:15天,30:30天,60:60天,90:90天
     */
    public void setIndate(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.indate</code>. 有效期,7:7天,15:15天,30:30天,60:60天,90:90天
     */
    public Integer getIndate() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.update_time</code>. 更新时间
     */
    public void setUpdateTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.update_time</code>. 更新时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>thirdpartydb.thirdparty_veryeast_position.status</code>. 只能状态 0 是有效 1是无效
     */
    public void setStatus(Short value) {
        set(15, value);
    }

    /**
     * Getter for <code>thirdpartydb.thirdparty_veryeast_position.status</code>. 只能状态 0 是有效 1是无效
     */
    public Short getStatus() {
        return (Short) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Short> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp, Short> valuesRow() {
        return (Row16) super.valuesRow();
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
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGE_TYPE1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGE_LEVEL1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGE_TYPE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGE_LEVEL2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGE_TYPE3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.LANGUAGE_LEVEL3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.COMPUTER_LEVEL;
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
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field16() {
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
        return getLanguageType1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLanguageLevel1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getLanguageType2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getLanguageLevel2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getLanguageType3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getLanguageLevel3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getComputerLevel();
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
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value16() {
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
        setLanguageType1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value7(Integer value) {
        setLanguageLevel1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value8(Integer value) {
        setLanguageType2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value9(Integer value) {
        setLanguageLevel2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value10(Integer value) {
        setLanguageType3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value11(Integer value) {
        setLanguageLevel3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value12(Integer value) {
        setComputerLevel(value);
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
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value15(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord value16(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPositionRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Timestamp value14, Timestamp value15, Short value16) {
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
        value16(value16);
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
    public ThirdpartyVeryeastPositionRecord(Integer id, Integer pid, Integer accommodation, Integer ageTop, Integer ageBottom, Integer languageType1, Integer languageLevel1, Integer languageType2, Integer languageLevel2, Integer languageType3, Integer languageLevel3, Integer computerLevel, Integer indate, Timestamp createTime, Timestamp updateTime, Short status) {
        super(ThirdpartyVeryeastPosition.THIRDPARTY_VERYEAST_POSITION);

        set(0, id);
        set(1, pid);
        set(2, accommodation);
        set(3, ageTop);
        set(4, ageBottom);
        set(5, languageType1);
        set(6, languageLevel1);
        set(7, languageType2);
        set(8, languageLevel2);
        set(9, languageType3);
        set(10, languageLevel3);
        set(11, computerLevel);
        set(12, indate);
        set(13, createTime);
        set(14, updateTime);
        set(15, status);
    }
}