/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables.daos;


import com.moseeker.baseorm.db.logdb.tables.LogHrloginRecord;
import com.moseeker.baseorm.db.logdb.tables.records.LogHrloginRecordRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * hr每日登陆/使用统计表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogHrloginRecordDao extends DAOImpl<LogHrloginRecordRecord, com.moseeker.baseorm.db.logdb.tables.pojos.LogHrloginRecord, Integer> {

    /**
     * Create a new LogHrloginRecordDao without any configuration
     */
    public LogHrloginRecordDao() {
        super(LogHrloginRecord.LOG_HRLOGIN_RECORD, com.moseeker.baseorm.db.logdb.tables.pojos.LogHrloginRecord.class);
    }

    /**
     * Create a new LogHrloginRecordDao with an attached configuration
     */
    public LogHrloginRecordDao(Configuration configuration) {
        super(LogHrloginRecord.LOG_HRLOGIN_RECORD, com.moseeker.baseorm.db.logdb.tables.pojos.LogHrloginRecord.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.logdb.tables.pojos.LogHrloginRecord object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogHrloginRecord> fetchById(Integer... values) {
        return fetch(LogHrloginRecord.LOG_HRLOGIN_RECORD.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.logdb.tables.pojos.LogHrloginRecord fetchOneById(Integer value) {
        return fetchOne(LogHrloginRecord.LOG_HRLOGIN_RECORD.ID, value);
    }

    /**
     * Fetch records that have <code>hr_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogHrloginRecord> fetchByHrId(Integer... values) {
        return fetch(LogHrloginRecord.LOG_HRLOGIN_RECORD.HR_ID, values);
    }

    /**
     * Fetch records that have <code>login_date IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogHrloginRecord> fetchByLoginDate(Date... values) {
        return fetch(LogHrloginRecord.LOG_HRLOGIN_RECORD.LOGIN_DATE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogHrloginRecord> fetchByCreateTime(Timestamp... values) {
        return fetch(LogHrloginRecord.LOG_HRLOGIN_RECORD.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.logdb.tables.pojos.LogHrloginRecord> fetchByUpdateTime(Timestamp... values) {
        return fetch(LogHrloginRecord.LOG_HRLOGIN_RECORD.UPDATE_TIME, values);
    }
}