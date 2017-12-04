/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables.records;


import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolHrTalent;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 人才库人收藏记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolHrTalentRecord extends UpdatableRecordImpl<TalentpoolHrTalentRecord> implements Record5<Integer, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -413631368;

    /**
     * Setter for <code>talentpooldb.talentpool_hr_talent.hr_id</code>. HR 编号
     */
    public void setHrId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_hr_talent.hr_id</code>. HR 编号
     */
    public Integer getHrId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_hr_talent.talent_id</code>. 人才编号.id,简历
     */
    public void setTalentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_hr_talent.talent_id</code>. 人才编号.id,简历
     */
    public Integer getTalentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_hr_talent.public</code>. 1 公开，0 不公开
     */
    public void setPublic(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_hr_talent.public</code>. 1 公开，0 不公开
     */
    public Byte getPublic() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_hr_talent.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_hr_talent.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_hr_talent.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_hr_talent.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TalentpoolHrTalent.TALENTPOOL_HR_TALENT.HR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TalentpoolHrTalent.TALENTPOOL_HR_TALENT.TALENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TalentpoolHrTalent.TALENTPOOL_HR_TALENT.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TalentpoolHrTalent.TALENTPOOL_HR_TALENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TalentpoolHrTalent.TALENTPOOL_HR_TALENT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getHrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getTalentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getPublic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolHrTalentRecord value1(Integer value) {
        setHrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolHrTalentRecord value2(Integer value) {
        setTalentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolHrTalentRecord value3(Byte value) {
        setPublic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolHrTalentRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolHrTalentRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolHrTalentRecord values(Integer value1, Integer value2, Byte value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached TalentpoolHrTalentRecord
     */
    public TalentpoolHrTalentRecord() {
        super(TalentpoolHrTalent.TALENTPOOL_HR_TALENT);
    }

    /**
     * Create a detached, initialised TalentpoolHrTalentRecord
     */
    public TalentpoolHrTalentRecord(Integer hrId, Integer talentId, Byte public_, Timestamp createTime, Timestamp updateTime) {
        super(TalentpoolHrTalent.TALENTPOOL_HR_TALENT);

        set(0, hrId);
        set(1, talentId);
        set(2, public_);
        set(3, createTime);
        set(4, updateTime);
    }
}
