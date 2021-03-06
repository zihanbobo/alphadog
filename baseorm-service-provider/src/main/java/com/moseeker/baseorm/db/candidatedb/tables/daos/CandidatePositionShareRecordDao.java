/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.candidatedb.tables.daos;


import com.moseeker.baseorm.db.candidatedb.tables.CandidatePositionShareRecord;
import com.moseeker.baseorm.db.candidatedb.tables.records.CandidatePositionShareRecordRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 用户分享职位访问记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidatePositionShareRecordDao extends DAOImpl<CandidatePositionShareRecordRecord, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord, Integer> {

    /**
     * Create a new CandidatePositionShareRecordDao without any configuration
     */
    public CandidatePositionShareRecordDao() {
        super(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord.class);
    }

    /**
     * Create a new CandidatePositionShareRecordDao with an attached configuration
     */
    public CandidatePositionShareRecordDao(Configuration configuration) {
        super(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchById(Integer... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord fetchOneById(Integer value) {
        return fetchOne(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.ID, value);
    }

    /**
     * Fetch records that have <code>wechat_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByWechatId(Long... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.WECHAT_ID, values);
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByPositionId(Long... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>recom_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByRecomId(Long... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.RECOM_ID, values);
    }

    /**
     * Fetch records that have <code>recom_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByRecomUserId(Integer... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.RECOM_USER_ID, values);
    }

    /**
     * Fetch records that have <code>viewer_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByViewerId(String... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.VIEWER_ID, values);
    }

    /**
     * Fetch records that have <code>viewer_ip IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByViewerIp(Long... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.VIEWER_IP, values);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchBySource(Byte... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.SOURCE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByCreateTime(Timestamp... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByUpdateTime(Timestamp... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>presentee_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByPresenteeId(Long... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.PRESENTEE_ID, values);
    }

    /**
     * Fetch records that have <code>click_from IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByClickFrom(Byte... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.CLICK_FROM, values);
    }

    /**
     * Fetch records that have <code>presentee_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePositionShareRecord> fetchByPresenteeUserId(Integer... values) {
        return fetch(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.PRESENTEE_USER_ID, values);
    }
}
