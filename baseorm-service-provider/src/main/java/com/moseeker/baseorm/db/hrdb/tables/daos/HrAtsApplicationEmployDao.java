/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrAtsApplicationEmploy;
import com.moseeker.baseorm.db.hrdb.tables.records.HrAtsApplicationEmployRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 新MoAts流程录用表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAtsApplicationEmployDao extends DAOImpl<HrAtsApplicationEmployRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy, Integer> {

    /**
     * Create a new HrAtsApplicationEmployDao without any configuration
     */
    public HrAtsApplicationEmployDao() {
        super(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy.class);
    }

    /**
     * Create a new HrAtsApplicationEmployDao with an attached configuration
     */
    public HrAtsApplicationEmployDao(Configuration configuration) {
        super(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy> fetchById(Integer... values) {
        return fetch(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy fetchOneById(Integer value) {
        return fetchOne(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.ID, value);
    }

    /**
     * Fetch records that have <code>application_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy> fetchByApplicationId(Integer... values) {
        return fetch(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.APPLICATION_ID, values);
    }

    /**
     * Fetch records that have <code>hr_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy> fetchByHrId(Integer... values) {
        return fetch(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.HR_ID, values);
    }

    /**
     * Fetch records that have <code>expect_employ_date IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy> fetchByExpectEmployDate(Date... values) {
        return fetch(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.EXPECT_EMPLOY_DATE, values);
    }

    /**
     * Fetch records that have <code>employ_date IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy> fetchByEmployDate(Date... values) {
        return fetch(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.EMPLOY_DATE, values);
    }

    /**
     * Fetch records that have <code>employ_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy> fetchByEmployStatus(Integer... values) {
        return fetch(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.EMPLOY_STATUS, values);
    }

    /**
     * Fetch records that have <code>reason IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy> fetchByReason(String... values) {
        return fetch(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.REASON, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy> fetchByDisable(Integer... values) {
        return fetch(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.DISABLE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy> fetchByCreateTime(Timestamp... values) {
        return fetch(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsApplicationEmploy> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrAtsApplicationEmploy.HR_ATS_APPLICATION_EMPLOY.UPDATE_TIME, values);
    }
}
