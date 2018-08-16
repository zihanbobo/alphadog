/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrGroupCompanyRel;
import com.moseeker.baseorm.db.hrdb.tables.records.HrGroupCompanyRelRecord;

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
public class HrGroupCompanyRelDao extends DAOImpl<HrGroupCompanyRelRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompanyRel, Integer> {

    /**
     * Create a new HrGroupCompanyRelDao without any configuration
     */
    public HrGroupCompanyRelDao() {
        super(HrGroupCompanyRel.HR_GROUP_COMPANY_REL, com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompanyRel.class);
    }

    /**
     * Create a new HrGroupCompanyRelDao with an attached configuration
     */
    public HrGroupCompanyRelDao(Configuration configuration) {
        super(HrGroupCompanyRel.HR_GROUP_COMPANY_REL, com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompanyRel.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompanyRel object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompanyRel> fetchById(Integer... values) {
        return fetch(HrGroupCompanyRel.HR_GROUP_COMPANY_REL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompanyRel fetchOneById(Integer value) {
        return fetchOne(HrGroupCompanyRel.HR_GROUP_COMPANY_REL.ID, value);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompanyRel> fetchByCompanyId(Integer... values) {
        return fetch(HrGroupCompanyRel.HR_GROUP_COMPANY_REL.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>group_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompanyRel> fetchByGroupId(Integer... values) {
        return fetch(HrGroupCompanyRel.HR_GROUP_COMPANY_REL.GROUP_ID, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompanyRel> fetchByCreateTime(Timestamp... values) {
        return fetch(HrGroupCompanyRel.HR_GROUP_COMPANY_REL.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrGroupCompanyRel> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrGroupCompanyRel.HR_GROUP_COMPANY_REL.UPDATE_TIME, values);
    }
}
