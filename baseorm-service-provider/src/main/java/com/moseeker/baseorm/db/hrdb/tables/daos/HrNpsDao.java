/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrNps;
import com.moseeker.baseorm.db.hrdb.tables.records.HrNpsRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * nps打分推荐表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrNpsDao extends DAOImpl<HrNpsRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps, Integer> {

    /**
     * Create a new HrNpsDao without any configuration
     */
    public HrNpsDao() {
        super(HrNps.HR_NPS, com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps.class);
    }

    /**
     * Create a new HrNpsDao with an attached configuration
     */
    public HrNpsDao(Configuration configuration) {
        super(HrNps.HR_NPS, com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps> fetchById(Integer... values) {
        return fetch(HrNps.HR_NPS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps fetchOneById(Integer value) {
        return fetchOne(HrNps.HR_NPS.ID, value);
    }

    /**
     * Fetch records that have <code>hr_account_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps> fetchByHrAccountId(Integer... values) {
        return fetch(HrNps.HR_NPS.HR_ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>intention IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps> fetchByIntention(Byte... values) {
        return fetch(HrNps.HR_NPS.INTENTION, values);
    }

    /**
     * Fetch records that have <code>accept_contact IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps> fetchByAcceptContact(Byte... values) {
        return fetch(HrNps.HR_NPS.ACCEPT_CONTACT, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps> fetchByCreateTime(Timestamp... values) {
        return fetch(HrNps.HR_NPS.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrNps> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrNps.HR_NPS.UPDATE_TIME, values);
    }
}
