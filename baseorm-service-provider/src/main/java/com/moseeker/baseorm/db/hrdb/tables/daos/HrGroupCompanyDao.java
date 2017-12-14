/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrGroupCompany;
import com.moseeker.baseorm.db.hrdb.tables.records.HrGroupCompanyRecord;

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
public class HrGroupCompanyDao extends DAOImpl<HrGroupCompanyRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompany, Integer> {

    /**
     * Create a new HrGroupCompanyDao without any configuration
     */
    public HrGroupCompanyDao() {
        super(HrGroupCompany.HR_GROUP_COMPANY, com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompany.class);
    }

    /**
     * Create a new HrGroupCompanyDao with an attached configuration
     */
    public HrGroupCompanyDao(Configuration configuration) {
        super(HrGroupCompany.HR_GROUP_COMPANY, com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompany.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompany object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompany> fetchById(Integer... values) {
        return fetch(HrGroupCompany.HR_GROUP_COMPANY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompany fetchOneById(Integer value) {
        return fetchOne(HrGroupCompany.HR_GROUP_COMPANY.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompany> fetchByName(String... values) {
        return fetch(HrGroupCompany.HR_GROUP_COMPANY.NAME, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompany> fetchByCreateTime(Timestamp... values) {
        return fetch(HrGroupCompany.HR_GROUP_COMPANY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompany> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrGroupCompany.HR_GROUP_COMPANY.UPDATE_TIME, values);
    }
}
