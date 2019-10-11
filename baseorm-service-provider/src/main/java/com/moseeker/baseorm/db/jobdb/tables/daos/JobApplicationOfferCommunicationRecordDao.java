/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.daos;


import com.moseeker.baseorm.db.jobdb.tables.JobApplicationOfferCommunicationRecord;
import com.moseeker.baseorm.db.jobdb.tables.records.JobApplicationOfferCommunicationRecordRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationOfferCommunicationRecordDao extends DAOImpl<JobApplicationOfferCommunicationRecordRecord, com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord, Integer> {

    /**
     * Create a new JobApplicationOfferCommunicationRecordDao without any configuration
     */
    public JobApplicationOfferCommunicationRecordDao() {
        super(JobApplicationOfferCommunicationRecord.JOB_APPLICATION_OFFER_COMMUNICATION_RECORD, com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord.class);
    }

    /**
     * Create a new JobApplicationOfferCommunicationRecordDao with an attached configuration
     */
    public JobApplicationOfferCommunicationRecordDao(Configuration configuration) {
        super(JobApplicationOfferCommunicationRecord.JOB_APPLICATION_OFFER_COMMUNICATION_RECORD, com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord> fetchById(Integer... values) {
        return fetch(JobApplicationOfferCommunicationRecord.JOB_APPLICATION_OFFER_COMMUNICATION_RECORD.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord fetchOneById(Integer value) {
        return fetchOne(JobApplicationOfferCommunicationRecord.JOB_APPLICATION_OFFER_COMMUNICATION_RECORD.ID, value);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord> fetchByContent(String... values) {
        return fetch(JobApplicationOfferCommunicationRecord.JOB_APPLICATION_OFFER_COMMUNICATION_RECORD.CONTENT, values);
    }

    /**
     * Fetch records that have <code>creator_type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord> fetchByCreatorType(Byte... values) {
        return fetch(JobApplicationOfferCommunicationRecord.JOB_APPLICATION_OFFER_COMMUNICATION_RECORD.CREATOR_TYPE, values);
    }

    /**
     * Fetch records that have <code>creator_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord> fetchByCreatorId(Integer... values) {
        return fetch(JobApplicationOfferCommunicationRecord.JOB_APPLICATION_OFFER_COMMUNICATION_RECORD.CREATOR_ID, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord> fetchByCreateTime(Timestamp... values) {
        return fetch(JobApplicationOfferCommunicationRecord.JOB_APPLICATION_OFFER_COMMUNICATION_RECORD.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplicationOfferCommunicationRecord> fetchByUpdateTime(Timestamp... values) {
        return fetch(JobApplicationOfferCommunicationRecord.JOB_APPLICATION_OFFER_COMMUNICATION_RECORD.UPDATE_TIME, values);
    }
}
