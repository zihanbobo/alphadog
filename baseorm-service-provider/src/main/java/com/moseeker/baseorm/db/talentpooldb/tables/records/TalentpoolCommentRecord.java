/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables.records;


import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolComment;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 人才库人HR与标签的关系
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolCommentRecord extends UpdatableRecordImpl<TalentpoolCommentRecord> implements Record7<Integer, String, Integer, Integer, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = 2047101996;

    /**
     * Setter for <code>talentpooldb.talentpool_comment.id</code>. 主 key
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_comment.id</code>. 主 key
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_comment.content</code>. 备注内容
     */
    public void setContent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_comment.content</code>. 备注内容
     */
    public String getContent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_comment.hr_id</code>. HR 编号
     */
    public void setHrId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_comment.hr_id</code>. HR 编号
     */
    public Integer getHrId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_comment.user_id</code>. 人才 编号
     */
    public void setUserId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_comment.user_id</code>. 人才 编号
     */
    public Integer getUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_comment.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_comment.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_comment.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_comment.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>talentpooldb.talentpool_comment.company_id</code>.
     */
    public void setCompanyId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>talentpooldb.talentpool_comment.company_id</code>.
     */
    public Integer getCompanyId() {
        return (Integer) get(6);
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
    public Row7<Integer, String, Integer, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Integer, Integer, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TalentpoolComment.TALENTPOOL_COMMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TalentpoolComment.TALENTPOOL_COMMENT.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TalentpoolComment.TALENTPOOL_COMMENT.HR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TalentpoolComment.TALENTPOOL_COMMENT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TalentpoolComment.TALENTPOOL_COMMENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TalentpoolComment.TALENTPOOL_COMMENT.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TalentpoolComment.TALENTPOOL_COMMENT.COMPANY_ID;
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
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getHrId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCommentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCommentRecord value2(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCommentRecord value3(Integer value) {
        setHrId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCommentRecord value4(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCommentRecord value5(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCommentRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCommentRecord value7(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolCommentRecord values(Integer value1, String value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6, Integer value7) {
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
     * Create a detached TalentpoolCommentRecord
     */
    public TalentpoolCommentRecord() {
        super(TalentpoolComment.TALENTPOOL_COMMENT);
    }

    /**
     * Create a detached, initialised TalentpoolCommentRecord
     */
    public TalentpoolCommentRecord(Integer id, String content, Integer hrId, Integer userId, Timestamp createTime, Timestamp updateTime, Integer companyId) {
        super(TalentpoolComment.TALENTPOOL_COMMENT);

        set(0, id);
        set(1, content);
        set(2, hrId);
        set(3, userId);
        set(4, createTime);
        set(5, updateTime);
        set(6, companyId);
    }
}
