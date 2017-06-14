/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.candidatedb.tables.records;


import com.moseeker.baseorm.db.candidatedb.tables.CandidateVJobPositionRecom;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidateVJobPositionRecomRecord extends TableRecordImpl<CandidateVJobPositionRecomRecord> implements Record5<Long, Integer, Integer, Timestamp, String> {

    private static final long serialVersionUID = 1716262673;

    /**
     * Setter for <code>candidatedb.candidate_v_job_position_recom.position_id</code>. position.id 分享职位ID
     */
    public void setPositionId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>candidatedb.candidate_v_job_position_recom.position_id</code>. position.id 分享职位ID
     */
    public Long getPositionId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>candidatedb.candidate_v_job_position_recom.recom_id</code>. userdb.user_user.id 转发者的C端账号编号
     */
    public void setRecomId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>candidatedb.candidate_v_job_position_recom.recom_id</code>. userdb.user_user.id 转发者的C端账号编号
     */
    public Integer getRecomId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>candidatedb.candidate_v_job_position_recom.presentee_id</code>. userdb.user_user.id 浏览者的C端账号编号
     */
    public void setPresenteeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>candidatedb.candidate_v_job_position_recom.presentee_id</code>. userdb.user_user.id 浏览者的C端账号编号
     */
    public Integer getPresenteeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>candidatedb.candidate_v_job_position_recom.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>candidatedb.candidate_v_job_position_recom.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>candidatedb.candidate_v_job_position_recom.nickname</code>. 用户昵称
     */
    public void setNickname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>candidatedb.candidate_v_job_position_recom.nickname</code>. 用户昵称
     */
    public String getNickname() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Integer, Integer, Timestamp, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Integer, Integer, Timestamp, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM.POSITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM.RECOM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM.PRESENTEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getPositionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRecomId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPresenteeId();
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
    public String value5() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateVJobPositionRecomRecord value1(Long value) {
        setPositionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateVJobPositionRecomRecord value2(Integer value) {
        setRecomId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateVJobPositionRecomRecord value3(Integer value) {
        setPresenteeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateVJobPositionRecomRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateVJobPositionRecomRecord value5(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateVJobPositionRecomRecord values(Long value1, Integer value2, Integer value3, Timestamp value4, String value5) {
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
     * Create a detached CandidateVJobPositionRecomRecord
     */
    public CandidateVJobPositionRecomRecord() {
        super(CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM);
    }

    /**
     * Create a detached, initialised CandidateVJobPositionRecomRecord
     */
    public CandidateVJobPositionRecomRecord(Long positionId, Integer recomId, Integer presenteeId, Timestamp createTime, String nickname) {
        super(CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM);

        set(0, positionId);
        set(1, recomId);
        set(2, presenteeId);
        set(3, createTime);
        set(4, nickname);
    }
}
