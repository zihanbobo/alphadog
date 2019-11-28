/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessNewRecord;
import com.moseeker.baseorm.db.hrdb.tables.records.HrAtsProcessNewRecordRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * ats招聘流程进度流水表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAtsProcessNewRecordDao extends DAOImpl<HrAtsProcessNewRecordRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord, Integer> {

    /**
     * Create a new HrAtsProcessNewRecordDao without any configuration
     */
    public HrAtsProcessNewRecordDao() {
        super(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord.class);
    }

    /**
     * Create a new HrAtsProcessNewRecordDao with an attached configuration
     */
    public HrAtsProcessNewRecordDao(Configuration configuration) {
        super(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchById(Integer... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord fetchOneById(Integer value) {
        return fetchOne(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.ID, value);
    }

    /**
     * Fetch records that have <code>app_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchByAppId(Integer... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.APP_ID, values);
    }

    /**
     * Fetch records that have <code>process_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchByProcessId(Integer... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.PROCESS_ID, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchByCompanyId(Integer... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>hr_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchByHrId(Integer... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.HR_ID, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchByType(Integer... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.TYPE, values);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchByContent(String... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.CONTENT, values);
    }

    /**
     * Fetch records that have <code>last_process_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchByLastProcessId(Integer... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.LAST_PROCESS_ID, values);
    }

    /**
     * Fetch records that have <code>event_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchByEventId(Integer... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.EVENT_ID, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchByCreateTime(Timestamp... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>ext_content IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessNewRecord> fetchByExtContent(String... values) {
        return fetch(HrAtsProcessNewRecord.HR_ATS_PROCESS_NEW_RECORD.EXT_CONTENT, values);
    }
}
