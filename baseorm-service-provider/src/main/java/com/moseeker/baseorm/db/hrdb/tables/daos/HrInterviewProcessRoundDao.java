/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrInterviewProcessRound;
import com.moseeker.baseorm.db.hrdb.tables.records.HrInterviewProcessRoundRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 面试阶段表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrInterviewProcessRoundDao extends DAOImpl<HrInterviewProcessRoundRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound, Integer> {

    /**
     * Create a new HrInterviewProcessRoundDao without any configuration
     */
    public HrInterviewProcessRoundDao() {
        super(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND, com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound.class);
    }

    /**
     * Create a new HrInterviewProcessRoundDao with an attached configuration
     */
    public HrInterviewProcessRoundDao(Configuration configuration) {
        super(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND, com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound> fetchById(Integer... values) {
        return fetch(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound fetchOneById(Integer value) {
        return fetchOne(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND.ID, value);
    }

    /**
     * Fetch records that have <code>round_name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound> fetchByRoundName(String... values) {
        return fetch(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND.ROUND_NAME, values);
    }

    /**
     * Fetch records that have <code>interview_process_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound> fetchByInterviewProcessId(Integer... values) {
        return fetch(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND.INTERVIEW_PROCESS_ID, values);
    }

    /**
     * Fetch records that have <code>disabled IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound> fetchByDisabled(Integer... values) {
        return fetch(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND.DISABLED, values);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound> fetchByDeleted(Integer... values) {
        return fetch(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND.DELETED, values);
    }

    /**
     * Fetch records that have <code>round_order IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound> fetchByRoundOrder(Integer... values) {
        return fetch(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND.ROUND_ORDER, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound> fetchByCreateTime(Timestamp... values) {
        return fetch(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewProcessRound> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrInterviewProcessRound.HR_INTERVIEW_PROCESS_ROUND.UPDATE_TIME, values);
    }
}
