/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrAtsProcessCompanyItem;
import com.moseeker.baseorm.db.hrdb.tables.records.HrAtsProcessCompanyItemRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * ats流程企业端配置搭配表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAtsProcessCompanyItemDao extends DAOImpl<HrAtsProcessCompanyItemRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem, Integer> {

    /**
     * Create a new HrAtsProcessCompanyItemDao without any configuration
     */
    public HrAtsProcessCompanyItemDao() {
        super(HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem.class);
    }

    /**
     * Create a new HrAtsProcessCompanyItemDao with an attached configuration
     */
    public HrAtsProcessCompanyItemDao(Configuration configuration) {
        super(HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM, com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem> fetchById(Integer... values) {
        return fetch(HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem fetchOneById(Integer value) {
        return fetchOne(HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM.ID, value);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem> fetchByParentId(Integer... values) {
        return fetch(HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>item_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem> fetchByItemId(Integer... values) {
        return fetch(HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM.ITEM_ID, values);
    }

    /**
     * Fetch records that have <code>item_order IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem> fetchByItemOrder(Integer... values) {
        return fetch(HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM.ITEM_ORDER, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem> fetchByDisable(Integer... values) {
        return fetch(HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM.DISABLE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem> fetchByCreateTime(Timestamp... values) {
        return fetch(HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrAtsProcessCompanyItem> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrAtsProcessCompanyItem.HR_ATS_PROCESS_COMPANY_ITEM.UPDATE_TIME, values);
    }
}
