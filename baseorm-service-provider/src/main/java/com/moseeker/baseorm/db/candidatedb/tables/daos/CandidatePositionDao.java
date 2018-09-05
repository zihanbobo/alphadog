/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.candidatedb.tables.daos;


import com.moseeker.baseorm.db.candidatedb.tables.CandidatePosition;
import com.moseeker.baseorm.db.candidatedb.tables.records.CandidatePositionRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * 候选人表相关职位表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidatePositionDao extends DAOImpl<CandidatePositionRecord, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition, Record2<Integer, Integer>> {

    /**
     * Create a new CandidatePositionDao without any configuration
     */
    public CandidatePositionDao() {
        super(CandidatePosition.CANDIDATE_POSITION, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition.class);
    }

    /**
     * Create a new CandidatePositionDao with an attached configuration
     */
    public CandidatePositionDao(Configuration configuration) {
        super(CandidatePosition.CANDIDATE_POSITION, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition object) {
        return compositeKeyRecord(object.getUserId(), object.getPositionId());
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition> fetchByPositionId(Integer... values) {
        return fetch(CandidatePosition.CANDIDATE_POSITION.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition> fetchByUpdateTime(Timestamp... values) {
        return fetch(CandidatePosition.CANDIDATE_POSITION.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>wxuser_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition> fetchByWxuserId(Integer... values) {
        return fetch(CandidatePosition.CANDIDATE_POSITION.WXUSER_ID, values);
    }

    /**
     * Fetch records that have <code>is_interested IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition> fetchByIsInterested(Byte... values) {
        return fetch(CandidatePosition.CANDIDATE_POSITION.IS_INTERESTED, values);
    }

    /**
     * Fetch records that have <code>candidate_company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition> fetchByCandidateCompanyId(Integer... values) {
        return fetch(CandidatePosition.CANDIDATE_POSITION.CANDIDATE_COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>view_number IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition> fetchByViewNumber(Integer... values) {
        return fetch(CandidatePosition.CANDIDATE_POSITION.VIEW_NUMBER, values);
    }

    /**
     * Fetch records that have <code>shared_from_employee IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition> fetchBySharedFromEmployee(Byte... values) {
        return fetch(CandidatePosition.CANDIDATE_POSITION.SHARED_FROM_EMPLOYEE, values);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidatePosition> fetchByUserId(Integer... values) {
        return fetch(CandidatePosition.CANDIDATE_POSITION.USER_ID, values);
    }
}