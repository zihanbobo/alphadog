/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyPosition;
import com.moseeker.baseorm.db.hrdb.tables.records.HrThirdPartyPositionRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 第三方渠道同步的职位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrThirdPartyPositionDao extends DAOImpl<HrThirdPartyPositionRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition, Integer> {

    /**
     * Create a new HrThirdPartyPositionDao without any configuration
     */
    public HrThirdPartyPositionDao() {
        super(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION, com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition.class);
    }

    /**
     * Create a new HrThirdPartyPositionDao with an attached configuration
     */
    public HrThirdPartyPositionDao(Configuration configuration) {
        super(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION, com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchById(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition fetchOneById(Integer value) {
        return fetchOne(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.ID, value);
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByPositionId(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>third_part_position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByThirdPartPositionId(String... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.THIRD_PART_POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>channel IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByChannel(Short... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.CHANNEL, values);
    }

    /**
     * Fetch records that have <code>is_synchronization IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByIsSynchronization(Short... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.IS_SYNCHRONIZATION, values);
    }

    /**
     * Fetch records that have <code>is_refresh IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByIsRefresh(Short... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.IS_REFRESH, values);
    }

    /**
     * Fetch records that have <code>sync_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchBySyncTime(Timestamp... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.SYNC_TIME, values);
    }

    /**
     * Fetch records that have <code>refresh_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByRefreshTime(Timestamp... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.REFRESH_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByAddress(String... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>occupation IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByOccupation(String... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.OCCUPATION, values);
    }

    /**
     * Fetch records that have <code>sync_fail_reason IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchBySyncFailReason(String... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.SYNC_FAIL_REASON, values);
    }

    /**
     * Fetch records that have <code>use_company_address IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByUseCompanyAddress(Short... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.USE_COMPANY_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>third_party_account_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByThirdPartyAccountId(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.THIRD_PARTY_ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>department IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByDepartment(String... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.DEPARTMENT, values);
    }

    /**
     * Fetch records that have <code>salary_month IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchBySalaryMonth(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.SALARY_MONTH, values);
    }

    /**
     * Fetch records that have <code>feedback_period IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByFeedbackPeriod(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.FEEDBACK_PERIOD, values);
    }

    /**
     * Fetch records that have <code>salary_discuss IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchBySalaryDiscuss(Short... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.SALARY_DISCUSS, values);
    }

    /**
     * Fetch records that have <code>salary_bottom IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchBySalaryBottom(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.SALARY_BOTTOM, values);
    }

    /**
     * Fetch records that have <code>salary_top IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchBySalaryTop(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.SALARY_TOP, values);
    }

    /**
     * Fetch records that have <code>practice_salary IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByPracticeSalary(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.PRACTICE_SALARY, values);
    }

    /**
     * Fetch records that have <code>practice_salary_unit IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByPracticeSalaryUnit(Byte... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.PRACTICE_SALARY_UNIT, values);
    }

    /**
     * Fetch records that have <code>practice_per_week IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByPracticePerWeek(Byte... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.PRACTICE_PER_WEEK, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByCompanyId(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>address_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByAddressId(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.ADDRESS_ID, values);
    }

    /**
     * Fetch records that have <code>department_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByDepartmentId(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.DEPARTMENT_ID, values);
    }

    /**
     * Fetch records that have <code>company_name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByCompanyName(String... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.COMPANY_NAME, values);
    }

    /**
     * Fetch records that have <code>address_name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByAddressName(String... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.ADDRESS_NAME, values);
    }

    /**
     * Fetch records that have <code>department_name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByDepartmentName(String... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.DEPARTMENT_NAME, values);
    }

    /**
     * Fetch records that have <code>count IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrThirdPartyPosition> fetchByCount(Integer... values) {
        return fetch(HrThirdPartyPosition.HR_THIRD_PARTY_POSITION.COUNT, values);
    }
}
