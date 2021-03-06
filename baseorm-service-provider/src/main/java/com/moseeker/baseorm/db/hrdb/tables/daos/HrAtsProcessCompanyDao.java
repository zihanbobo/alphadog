/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessCompany;
import com.moseeker.baseorm.db.hrdb.tables.records.HrAtsProcessCompanyRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * ats流程企业端配置项
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAtsProcessCompanyDao extends DAOImpl<HrAtsProcessCompanyRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany, Integer> {

    /**
     * Create a new HrAtsProcessCompanyDao without any configuration
     */
    public HrAtsProcessCompanyDao() {
        super(HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany.class);
    }

    /**
     * Create a new HrAtsProcessCompanyDao with an attached configuration
     */
    public HrAtsProcessCompanyDao(Configuration configuration) {
        super(HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany> fetchById(Integer... values) {
        return fetch(HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany fetchOneById(Integer value) {
        return fetchOne(HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany> fetchByName(String... values) {
        return fetch(HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY.NAME, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany> fetchByCompanyId(Integer... values) {
        return fetch(HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany> fetchByDisable(Integer... values) {
        return fetch(HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY.DISABLE, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany> fetchByDescription(String... values) {
        return fetch(HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany> fetchByCreateTime(Timestamp... values) {
        return fetch(HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompany> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrAtsProcessCompany.HR_ATS_PROCESS_COMPANY.UPDATE_TIME, values);
    }
}
