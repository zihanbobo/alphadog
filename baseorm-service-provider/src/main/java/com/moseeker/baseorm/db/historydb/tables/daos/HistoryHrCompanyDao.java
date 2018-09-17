/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.daos;


import com.moseeker.baseorm.db.historydb.tables.HistoryHrCompany;
import com.moseeker.baseorm.db.historydb.tables.records.HistoryHrCompanyRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 公司表归档表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryHrCompanyDao extends DAOImpl<HistoryHrCompanyRecord, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany, Integer> {

    /**
     * Create a new HistoryHrCompanyDao without any configuration
     */
    public HistoryHrCompanyDao() {
        super(HistoryHrCompany.HISTORY_HR_COMPANY, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany.class);
    }

    /**
     * Create a new HistoryHrCompanyDao with an attached configuration
     */
    public HistoryHrCompanyDao(Configuration configuration) {
        super(HistoryHrCompany.HISTORY_HR_COMPANY, com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchById(Integer... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany fetchOneById(Integer value) {
        return fetchOne(HistoryHrCompany.HISTORY_HR_COMPANY.ID, value);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByType(Byte... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.TYPE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByName(String... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.NAME, values);
    }

    /**
     * Fetch records that have <code>introduction IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByIntroduction(String... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.INTRODUCTION, values);
    }

    /**
     * Fetch records that have <code>scale IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByScale(Byte... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.SCALE, values);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByAddress(String... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>property IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByProperty(Byte... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.PROPERTY, values);
    }

    /**
     * Fetch records that have <code>industry IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByIndustry(String... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.INDUSTRY, values);
    }

    /**
     * Fetch records that have <code>homepage IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByHomepage(String... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.HOMEPAGE, values);
    }

    /**
     * Fetch records that have <code>logo IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByLogo(String... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.LOGO, values);
    }

    /**
     * Fetch records that have <code>abbreviation IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByAbbreviation(String... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.ABBREVIATION, values);
    }

    /**
     * Fetch records that have <code>impression IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByImpression(String... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.IMPRESSION, values);
    }

    /**
     * Fetch records that have <code>banner IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByBanner(String... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.BANNER, values);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByParentId(Integer... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>hraccount_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByHraccountId(Integer... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.HRACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByDisable(Byte... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.DISABLE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByCreateTime(Timestamp... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchByUpdateTime(Timestamp... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.historydb.tables.pojos.HistoryHrCompany> fetchBySource(Byte... values) {
        return fetch(HistoryHrCompany.HISTORY_HR_COMPANY.SOURCE, values);
    }
}
