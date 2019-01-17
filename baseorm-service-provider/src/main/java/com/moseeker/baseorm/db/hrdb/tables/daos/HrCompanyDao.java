/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrCompany;
import com.moseeker.baseorm.db.hrdb.tables.records.HrCompanyRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 公司表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyDao extends DAOImpl<HrCompanyRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany, Integer> {

    /**
     * Create a new HrCompanyDao without any configuration
     */
    public HrCompanyDao() {
        super(HrCompany.HR_COMPANY, com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany.class);
    }

    /**
     * Create a new HrCompanyDao with an attached configuration
     */
    public HrCompanyDao(Configuration configuration) {
        super(HrCompany.HR_COMPANY, com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchById(Integer... values) {
        return fetch(HrCompany.HR_COMPANY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany fetchOneById(Integer value) {
        return fetchOne(HrCompany.HR_COMPANY.ID, value);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByType(Byte... values) {
        return fetch(HrCompany.HR_COMPANY.TYPE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByName(String... values) {
        return fetch(HrCompany.HR_COMPANY.NAME, values);
    }

    /**
     * Fetch records that have <code>introduction IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByIntroduction(String... values) {
        return fetch(HrCompany.HR_COMPANY.INTRODUCTION, values);
    }

    /**
     * Fetch records that have <code>scale IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByScale(Byte... values) {
        return fetch(HrCompany.HR_COMPANY.SCALE, values);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByAddress(String... values) {
        return fetch(HrCompany.HR_COMPANY.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>property IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByProperty(Byte... values) {
        return fetch(HrCompany.HR_COMPANY.PROPERTY, values);
    }

    /**
     * Fetch records that have <code>industry IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByIndustry(String... values) {
        return fetch(HrCompany.HR_COMPANY.INDUSTRY, values);
    }

    /**
     * Fetch records that have <code>homepage IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByHomepage(String... values) {
        return fetch(HrCompany.HR_COMPANY.HOMEPAGE, values);
    }

    /**
     * Fetch records that have <code>logo IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByLogo(String... values) {
        return fetch(HrCompany.HR_COMPANY.LOGO, values);
    }

    /**
     * Fetch records that have <code>abbreviation IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByAbbreviation(String... values) {
        return fetch(HrCompany.HR_COMPANY.ABBREVIATION, values);
    }

    /**
     * Fetch records that have <code>impression IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByImpression(String... values) {
        return fetch(HrCompany.HR_COMPANY.IMPRESSION, values);
    }

    /**
     * Fetch records that have <code>banner IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByBanner(String... values) {
        return fetch(HrCompany.HR_COMPANY.BANNER, values);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByParentId(Integer... values) {
        return fetch(HrCompany.HR_COMPANY.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>hraccount_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByHraccountId(Integer... values) {
        return fetch(HrCompany.HR_COMPANY.HRACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByDisable(Byte... values) {
        return fetch(HrCompany.HR_COMPANY.DISABLE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByCreateTime(Timestamp... values) {
        return fetch(HrCompany.HR_COMPANY.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrCompany.HR_COMPANY.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchBySource(Byte... values) {
        return fetch(HrCompany.HR_COMPANY.SOURCE, values);
    }

    /**
     * Fetch records that have <code>slogan IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchBySlogan(String... values) {
        return fetch(HrCompany.HR_COMPANY.SLOGAN, values);
    }

    /**
     * Fetch records that have <code>feature IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByFeature(String... values) {
        return fetch(HrCompany.HR_COMPANY.FEATURE, values);
    }

    /**
     * Fetch records that have <code>fortune IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByFortune(Byte... values) {
        return fetch(HrCompany.HR_COMPANY.FORTUNE, values);
    }

    /**
     * Fetch records that have <code>fortune_scale IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByFortuneScale(Byte... values) {
        return fetch(HrCompany.HR_COMPANY.FORTUNE_SCALE, values);
    }

    /**
     * Fetch records that have <code>fortune_year IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrCompany> fetchByFortuneYear(Date... values) {
        return fetch(HrCompany.HR_COMPANY.FORTUNE_YEAR, values);
    }
}
