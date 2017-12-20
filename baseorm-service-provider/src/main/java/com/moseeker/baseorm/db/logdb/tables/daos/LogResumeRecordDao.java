/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.daos;


import com.moseeker.baseorm.db.logdb.tables.LogResumeRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogResumeRecordRecord;

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
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogResumeRecordDao extends DAOImpl<LogResumeRecordRecord, com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord, Integer> {

    /**
     * Create a new LogResumeRecordDao without any configuration
     */
    public LogResumeRecordDao() {
        super(LogResumeRecord.LOG_RESUME_RECORD, com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord.class);
    }

    /**
     * Create a new LogResumeRecordDao with an attached configuration
     */
    public LogResumeRecordDao(Configuration configuration) {
        super(LogResumeRecord.LOG_RESUME_RECORD, com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord> fetchById(Integer... values) {
        return fetch(LogResumeRecord.LOG_RESUME_RECORD.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord fetchOneById(Integer value) {
        return fetchOne(LogResumeRecord.LOG_RESUME_RECORD.ID, value);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord> fetchByUserId(Integer... values) {
        return fetch(LogResumeRecord.LOG_RESUME_RECORD.USER_ID, values);
    }

    /**
     * Fetch records that have <code>file_name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord> fetchByFileName(String... values) {
        return fetch(LogResumeRecord.LOG_RESUME_RECORD.FILE_NAME, values);
    }

    /**
     * Fetch records that have <code>error_log IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord> fetchByErrorLog(String... values) {
        return fetch(LogResumeRecord.LOG_RESUME_RECORD.ERROR_LOG, values);
    }

    /**
     * Fetch records that have <code>field_value IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord> fetchByFieldValue(String... values) {
        return fetch(LogResumeRecord.LOG_RESUME_RECORD.FIELD_VALUE, values);
    }

    /**
     * Fetch records that have <code>result_data IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord> fetchByResultData(String... values) {
        return fetch(LogResumeRecord.LOG_RESUME_RECORD.RESULT_DATA, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord> fetchByCreateTime(Timestamp... values) {
        return fetch(LogResumeRecord.LOG_RESUME_RECORD.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>uuid IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogResumeRecord> fetchByUuid(String... values) {
        return fetch(LogResumeRecord.LOG_RESUME_RECORD.UUID, values);
    }
}
