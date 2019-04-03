/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables.daos;


import com.moseeker.baseorm.db.jobdb.tables.JobPositionJob58Mapping;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPositionJob58MappingRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 58同城职位映射表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionJob58MappingDao extends DAOImpl<JobPositionJob58MappingRecord, com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping, Integer> {

    /**
     * Create a new JobPositionJob58MappingDao without any configuration
     */
    public JobPositionJob58MappingDao() {
        super(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING, com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping.class);
    }

    /**
     * Create a new JobPositionJob58MappingDao with an attached configuration
     */
    public JobPositionJob58MappingDao(Configuration configuration) {
        super(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING, com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping> fetchById(Integer... values) {
        return fetch(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping fetchOneById(Integer value) {
        return fetchOne(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.ID, value);
    }

    /**
     * Fetch records that have <code>info_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping> fetchByInfoId(String... values) {
        return fetch(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.INFO_ID, values);
    }

    /**
     * Fetch a unique record that has <code>info_id = value</code>
     */
    public com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping fetchOneByInfoId(String value) {
        return fetchOne(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.INFO_ID, value);
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping> fetchByPositionId(Integer... values) {
        return fetch(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping> fetchByUrl(String... values) {
        return fetch(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.URL, values);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping> fetchByState(Byte... values) {
        return fetch(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.STATE, values);
    }

    /**
     * Fetch records that have <code>open_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping> fetchByOpenId(String... values) {
        return fetch(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.OPEN_ID, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping> fetchByCreateTime(Timestamp... values) {
        return fetch(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.jobdb.tables.pojos.JobPositionJob58Mapping> fetchByUpdateTime(Timestamp... values) {
        return fetch(JobPositionJob58Mapping.JOB_POSITION_JOB58_MAPPING.UPDATE_TIME, values);
    }
}
