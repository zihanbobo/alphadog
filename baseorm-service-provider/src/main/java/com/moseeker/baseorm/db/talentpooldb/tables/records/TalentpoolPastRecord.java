/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables.records;


import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolPast;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 人才库使用的曾任职务和曾任公司
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolPastRecord extends UpdatableRecordImpl<TalentpoolPastRecord> implements Record5<Integer, Integer, String, Integer, Integer> {

    private static final long serialVersionUID = -838687173;

    /**
     * Setter for <code>talentpooldb.talentpool_past.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_past.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_past.company_id</code>. 公司主键
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_past.company_id</code>. 公司主键
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_past.name</code>. 标签颜色
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_past.name</code>. 标签颜色
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_past.type</code>. 0 自定义职位 1自定义公司
     */
    public void setType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_past.type</code>. 0 自定义职位 1自定义公司
     */
    public Integer getType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_past.flag</code>. 0 企业标签 1是简历筛选规则
     */
    public void setFlag(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_past.flag</code>. 0 企业标签 1是简历筛选规则
     */
    public Integer getFlag() {
        return (Integer) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TalentpoolPast.TALENTPOOL_PAST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TalentpoolPast.TALENTPOOL_PAST.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TalentpoolPast.TALENTPOOL_PAST.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TalentpoolPast.TALENTPOOL_PAST.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TalentpoolPast.TALENTPOOL_PAST.FLAG;
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
    public Integer value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolPastRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolPastRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolPastRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolPastRecord value4(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolPastRecord value5(Integer value) {
        setFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolPastRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5) {
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
     * Create a detached TalentpoolPastRecord
     */
    public TalentpoolPastRecord() {
        super(TalentpoolPast.TALENTPOOL_PAST);
    }

    /**
     * Create a detached, initialised TalentpoolPastRecord
     */
    public TalentpoolPastRecord(Integer id, Integer companyId, String name, Integer type, Integer flag) {
        super(TalentpoolPast.TALENTPOOL_PAST);

        set(0, id);
        set(1, companyId);
        set(2, name);
        set(3, type);
        set(4, flag);
    }
}
