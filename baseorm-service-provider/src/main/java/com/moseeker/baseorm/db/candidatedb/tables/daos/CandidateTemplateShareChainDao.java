/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.candidatedb.tables.daos;


import com.moseeker.baseorm.db.candidatedb.tables.CandidateTemplateShareChain;
import com.moseeker.baseorm.db.candidatedb.tables.records.CandidateTemplateShareChainRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 十分钟消息模板
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidateTemplateShareChainDao extends DAOImpl<CandidateTemplateShareChainRecord, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain, Integer> {

    /**
     * Create a new CandidateTemplateShareChainDao without any configuration
     */
    public CandidateTemplateShareChainDao() {
        super(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain.class);
    }

    /**
     * Create a new CandidateTemplateShareChainDao with an attached configuration
     */
    public CandidateTemplateShareChainDao(Configuration configuration) {
        super(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN, com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchById(Integer... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain fetchOneById(Integer value) {
        return fetchOne(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.ID, value);
    }

    /**
     * Fetch records that have <code>chain_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchByChainId(Integer... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.CHAIN_ID, values);
    }

    /**
     * Fetch records that have <code>position_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchByPositionId(Integer... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.POSITION_ID, values);
    }

    /**
     * Fetch records that have <code>root_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchByRootUserId(Integer... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.ROOT_USER_ID, values);
    }

    /**
     * Fetch records that have <code>root2_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchByRoot2UserId(Integer... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.ROOT2_USER_ID, values);
    }

    /**
     * Fetch records that have <code>recom_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchByRecomUserId(Integer... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.RECOM_USER_ID, values);
    }

    /**
     * Fetch records that have <code>presentee_user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchByPresenteeUserId(Integer... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.PRESENTEE_USER_ID, values);
    }

    /**
     * Fetch records that have <code>send_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchBySendTime(Long... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.SEND_TIME, values);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchByParentId(Integer... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>depth IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchByDepth(Integer... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.DEPTH, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchByType(Byte... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.TYPE, values);
    }

    /**
     * Fetch records that have <code>seek_referral IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.candidatedb.tables.pojos.CandidateTemplateShareChain> fetchBySeekReferral(Byte... values) {
        return fetch(CandidateTemplateShareChain.CANDIDATE_TEMPLATE_SHARE_CHAIN.SEEK_REFERRAL, values);
    }
}
