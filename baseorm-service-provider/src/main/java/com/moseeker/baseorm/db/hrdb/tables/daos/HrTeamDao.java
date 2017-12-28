/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrTeam;
import com.moseeker.baseorm.db.hrdb.tables.records.HrTeamRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 团队表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrTeamDao extends DAOImpl<HrTeamRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam, Integer> {

    /**
     * Create a new HrTeamDao without any configuration
     */
    public HrTeamDao() {
        super(HrTeam.HR_TEAM, com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam.class);
    }

    /**
     * Create a new HrTeamDao with an attached configuration
     */
    public HrTeamDao(Configuration configuration) {
        super(HrTeam.HR_TEAM, com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchById(Integer... values) {
        return fetch(HrTeam.HR_TEAM.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam fetchOneById(Integer value) {
        return fetchOne(HrTeam.HR_TEAM.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByName(String... values) {
        return fetch(HrTeam.HR_TEAM.NAME, values);
    }

    /**
     * Fetch records that have <code>summary IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchBySummary(String... values) {
        return fetch(HrTeam.HR_TEAM.SUMMARY, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByDescription(String... values) {
        return fetch(HrTeam.HR_TEAM.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>show_order IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByShowOrder(Integer... values) {
        return fetch(HrTeam.HR_TEAM.SHOW_ORDER, values);
    }

    /**
     * Fetch records that have <code>jd_media IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByJdMedia(String... values) {
        return fetch(HrTeam.HR_TEAM.JD_MEDIA, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByCompanyId(Integer... values) {
        return fetch(HrTeam.HR_TEAM.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByCreateTime(Timestamp... values) {
        return fetch(HrTeam.HR_TEAM.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrTeam.HR_TEAM.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>is_show IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByIsShow(Integer... values) {
        return fetch(HrTeam.HR_TEAM.IS_SHOW, values);
    }

    /**
     * Fetch records that have <code>slogan IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchBySlogan(String... values) {
        return fetch(HrTeam.HR_TEAM.SLOGAN, values);
    }

    /**
     * Fetch records that have <code>res_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByResId(Integer... values) {
        return fetch(HrTeam.HR_TEAM.RES_ID, values);
    }

    /**
     * Fetch records that have <code>team_detail IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByTeamDetail(String... values) {
        return fetch(HrTeam.HR_TEAM.TEAM_DETAIL, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchByDisable(Integer... values) {
        return fetch(HrTeam.HR_TEAM.DISABLE, values);
    }

    /**
     * Fetch records that have <code>sub_title IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrTeam> fetchBySubTitle(String... values) {
        return fetch(HrTeam.HR_TEAM.SUB_TITLE, values);
    }
}
