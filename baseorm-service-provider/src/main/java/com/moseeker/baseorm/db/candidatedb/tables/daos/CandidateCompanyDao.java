/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.candidatedb.tables.daos;


import com.moseeker.baseorm.db.candidatedb.tables.CandidateCompany;
import com.moseeker.baseorm.db.candidatedb.tables.records.CandidateCompanyRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 候选人表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidateCompanyDao extends DAOImpl<CandidateCompanyRecord, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany, Integer> {

    /**
     * Create a new CandidateCompanyDao without any configuration
     */
    public CandidateCompanyDao() {
        super(CandidateCompany.CANDIDATE_COMPANY, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany.class);
    }

    /**
     * Create a new CandidateCompanyDao with an attached configuration
     */
    public CandidateCompanyDao(Configuration configuration) {
        super(CandidateCompany.CANDIDATE_COMPANY, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchById(Integer... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany fetchOneById(Integer value) {
        return fetchOne(CandidateCompany.CANDIDATE_COMPANY.ID, value);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByCompanyId(Integer... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByUpdateTime(Timestamp... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>wxuser_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByWxuserId(Integer... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.WXUSER_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByStatus(Integer... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.STATUS, values);
    }

    /**
     * Fetch records that have <code>is_recommend IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByIsRecommend(Byte... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.IS_RECOMMEND, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByName(String... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.NAME, values);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByEmail(String... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.EMAIL, values);
    }

    /**
     * Fetch records that have <code>mobile IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByMobile(String... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.MOBILE, values);
    }

    /**
     * Fetch records that have <code>nickname IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByNickname(String... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.NICKNAME, values);
    }

    /**
     * Fetch records that have <code>headimgurl IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByHeadimgurl(String... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.HEADIMGURL, values);
    }

    /**
     * Fetch records that have <code>sys_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchBySysUserId(Integer... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.SYS_USER_ID, values);
    }

    /**
     * Fetch records that have <code>click_from IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByClickFrom(Integer... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.CLICK_FROM, values);
    }

    /**
     * Fetch records that have <code>position_wx_layer_qrcode IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByPositionWxLayerQrcode(Byte... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.POSITION_WX_LAYER_QRCODE, values);
    }

    /**
     * Fetch records that have <code>position_wx_layer_profile IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateCompany> fetchByPositionWxLayerProfile(Byte... values) {
        return fetch(CandidateCompany.CANDIDATE_COMPANY.POSITION_WX_LAYER_PROFILE, values);
    }
}
