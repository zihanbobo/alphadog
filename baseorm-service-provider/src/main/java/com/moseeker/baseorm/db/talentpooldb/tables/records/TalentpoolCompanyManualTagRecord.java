/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables.records;


import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolCompanyManualTag;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 企业手动标签
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolCompanyManualTagRecord extends UpdatableRecordImpl<TalentpoolCompanyManualTagRecord> implements Record7<Integer, Integer, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1195519836;

    /**
     * Setter for <code>talentpooldb.talentpool_company_manual_tag.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_company_manual_tag.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_company_manual_tag.company_id</code>. 公司ID
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_company_manual_tag.company_id</code>. 公司ID
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_company_manual_tag.name</code>. 标签的名称
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_company_manual_tag.name</code>. 标签的名称
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_company_manual_tag.color</code>.  标签颜色
     */
    public void setColor(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_company_manual_tag.color</code>.  标签颜色
     */
    public String getColor() {
        return (String) get(3);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_company_manual_tag.talent_num</code>. 人才数量
     */
    public void setTalentNum(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_company_manual_tag.talent_num</code>. 人才数量
     */
    public Integer getTalentNum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_company_manual_tag.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_company_manual_tag.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_company_manual_tag.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_company_manual_tag.update_time</code>.
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
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TalentpoolCompanyManualTag.TALENTPOOL_COMPANY_MANUAL_TAG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TalentpoolCompanyManualTag.TALENTPOOL_COMPANY_MANUAL_TAG.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TalentpoolCompanyManualTag.TALENTPOOL_COMPANY_MANUAL_TAG.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TalentpoolCompanyManualTag.TALENTPOOL_COMPANY_MANUAL_TAG.COLOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TalentpoolCompanyManualTag.TALENTPOOL_COMPANY_MANUAL_TAG.TALENT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TalentpoolCompanyManualTag.TALENTPOOL_COMPANY_MANUAL_TAG.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TalentpoolCompanyManualTag.TALENTPOOL_COMPANY_MANUAL_TAG.UPDATE_TIME;
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
        return getCompanyId();
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
    public String value4() {
        return getColor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTalentNum();
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
    public TalentpoolCompanyManualTagRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCompanyManualTagRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCompanyManualTagRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCompanyManualTagRecord value4(String value) {
        setColor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCompanyManualTagRecord value5(Integer value) {
        setTalentNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCompanyManualTagRecord value6(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCompanyManualTagRecord value7(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCompanyManualTagRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached TalentpoolCompanyManualTagRecord
     */
    public TalentpoolCompanyManualTagRecord() {
        super(TalentpoolCompanyManualTag.TALENTPOOL_COMPANY_MANUAL_TAG);
    }

    /**
     * Create a detached, initialised TalentpoolCompanyManualTagRecord
     */
    public TalentpoolCompanyManualTagRecord(Integer id, Integer companyId, String name, String color, Integer talentNum, Timestamp createTime, Timestamp updateTime) {
        super(TalentpoolCompanyManualTag.TALENTPOOL_COMPANY_MANUAL_TAG);

        set(0, id);
        set(1, companyId);
        set(2, name);
        set(3, color);
        set(4, talentNum);
        set(5, createTime);
        set(6, updateTime);
    }
}