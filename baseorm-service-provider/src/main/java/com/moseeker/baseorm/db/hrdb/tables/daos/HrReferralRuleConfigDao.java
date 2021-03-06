/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrReferralRuleConfig;
import com.moseeker.baseorm.db.hrdb.tables.records.HrReferralRuleConfigRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * HR内推管理员工直接内推方式配置
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrReferralRuleConfigDao extends DAOImpl<HrReferralRuleConfigRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig, Integer> {

    /**
     * Create a new HrReferralRuleConfigDao without any configuration
     */
    public HrReferralRuleConfigDao() {
        super(HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG, com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig.class);
    }

    /**
     * Create a new HrReferralRuleConfigDao with an attached configuration
     */
    public HrReferralRuleConfigDao(Configuration configuration) {
        super(HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG, com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig> fetchById(Integer... values) {
        return fetch(HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig fetchOneById(Integer value) {
        return fetchOne(HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG.ID, value);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig> fetchByCompanyId(Integer... values) {
        return fetch(HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig> fetchByType(Byte... values) {
        return fetch(HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG.TYPE, values);
    }

    /**
     * Fetch records that have <code>switch IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig> fetchBySwitch(Byte... values) {
        return fetch(HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG.SWITCH, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig> fetchByCreateTime(Timestamp... values) {
        return fetch(HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrReferralRuleConfig> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrReferralRuleConfig.HR_REFERRAL_RULE_CONFIG.UPDATE_TIME, values);
    }
}
