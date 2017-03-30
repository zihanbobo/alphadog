/*
 * This file is generated by jOOQ.
*/
package com.moseeker.db.candidatedb;


import com.moseeker.db.candidatedb.tables.CandidateCompany;
import com.moseeker.db.candidatedb.tables.CandidatePosition;
import com.moseeker.db.candidatedb.tables.CandidatePositionShareRecord;
import com.moseeker.db.candidatedb.tables.CandidateRecomRecord;
import com.moseeker.db.candidatedb.tables.CandidateRemark;
import com.moseeker.db.candidatedb.tables.CandidateShareChain;
import com.moseeker.db.candidatedb.tables.CandidateSuggestPosition;
import com.moseeker.db.candidatedb.tables.records.CandidateCompanyRecord;
import com.moseeker.db.candidatedb.tables.records.CandidatePositionRecord;
import com.moseeker.db.candidatedb.tables.records.CandidatePositionShareRecordRecord;
import com.moseeker.db.candidatedb.tables.records.CandidateRecomRecordRecord;
import com.moseeker.db.candidatedb.tables.records.CandidateRemarkRecord;
import com.moseeker.db.candidatedb.tables.records.CandidateShareChainRecord;
import com.moseeker.db.candidatedb.tables.records.CandidateSuggestPositionRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>candidatedb</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CandidateCompanyRecord, Integer> IDENTITY_CANDIDATE_COMPANY = Identities0.IDENTITY_CANDIDATE_COMPANY;
    public static final Identity<CandidatePositionShareRecordRecord, Integer> IDENTITY_CANDIDATE_POSITION_SHARE_RECORD = Identities0.IDENTITY_CANDIDATE_POSITION_SHARE_RECORD;
    public static final Identity<CandidateRecomRecordRecord, Integer> IDENTITY_CANDIDATE_RECOM_RECORD = Identities0.IDENTITY_CANDIDATE_RECOM_RECORD;
    public static final Identity<CandidateRemarkRecord, Integer> IDENTITY_CANDIDATE_REMARK = Identities0.IDENTITY_CANDIDATE_REMARK;
    public static final Identity<CandidateShareChainRecord, Integer> IDENTITY_CANDIDATE_SHARE_CHAIN = Identities0.IDENTITY_CANDIDATE_SHARE_CHAIN;
    public static final Identity<CandidateSuggestPositionRecord, Integer> IDENTITY_CANDIDATE_SUGGEST_POSITION = Identities0.IDENTITY_CANDIDATE_SUGGEST_POSITION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CandidateCompanyRecord> KEY_CANDIDATE_COMPANY_PRIMARY = UniqueKeys0.KEY_CANDIDATE_COMPANY_PRIMARY;
    public static final UniqueKey<CandidateCompanyRecord> KEY_CANDIDATE_COMPANY_UNIQUE_INDEX_COMPANY_USER = UniqueKeys0.KEY_CANDIDATE_COMPANY_UNIQUE_INDEX_COMPANY_USER;
    public static final UniqueKey<CandidatePositionRecord> KEY_CANDIDATE_POSITION_PRIMARY = UniqueKeys0.KEY_CANDIDATE_POSITION_PRIMARY;
    public static final UniqueKey<CandidatePositionShareRecordRecord> KEY_CANDIDATE_POSITION_SHARE_RECORD_PRIMARY = UniqueKeys0.KEY_CANDIDATE_POSITION_SHARE_RECORD_PRIMARY;
    public static final UniqueKey<CandidateRecomRecordRecord> KEY_CANDIDATE_RECOM_RECORD_PRIMARY = UniqueKeys0.KEY_CANDIDATE_RECOM_RECORD_PRIMARY;
    public static final UniqueKey<CandidateRemarkRecord> KEY_CANDIDATE_REMARK_PRIMARY = UniqueKeys0.KEY_CANDIDATE_REMARK_PRIMARY;
    public static final UniqueKey<CandidateShareChainRecord> KEY_CANDIDATE_SHARE_CHAIN_PRIMARY = UniqueKeys0.KEY_CANDIDATE_SHARE_CHAIN_PRIMARY;
    public static final UniqueKey<CandidateSuggestPositionRecord> KEY_CANDIDATE_SUGGEST_POSITION_PRIMARY = UniqueKeys0.KEY_CANDIDATE_SUGGEST_POSITION_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<CandidateCompanyRecord, Integer> IDENTITY_CANDIDATE_COMPANY = createIdentity(CandidateCompany.CANDIDATE_COMPANY, CandidateCompany.CANDIDATE_COMPANY.ID);
        public static Identity<CandidatePositionShareRecordRecord, Integer> IDENTITY_CANDIDATE_POSITION_SHARE_RECORD = createIdentity(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD, CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.ID);
        public static Identity<CandidateRecomRecordRecord, Integer> IDENTITY_CANDIDATE_RECOM_RECORD = createIdentity(CandidateRecomRecord.CANDIDATE_RECOM_RECORD, CandidateRecomRecord.CANDIDATE_RECOM_RECORD.ID);
        public static Identity<CandidateRemarkRecord, Integer> IDENTITY_CANDIDATE_REMARK = createIdentity(CandidateRemark.CANDIDATE_REMARK, CandidateRemark.CANDIDATE_REMARK.ID);
        public static Identity<CandidateShareChainRecord, Integer> IDENTITY_CANDIDATE_SHARE_CHAIN = createIdentity(CandidateShareChain.CANDIDATE_SHARE_CHAIN, CandidateShareChain.CANDIDATE_SHARE_CHAIN.ID);
        public static Identity<CandidateSuggestPositionRecord, Integer> IDENTITY_CANDIDATE_SUGGEST_POSITION = createIdentity(CandidateSuggestPosition.CANDIDATE_SUGGEST_POSITION, CandidateSuggestPosition.CANDIDATE_SUGGEST_POSITION.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CandidateCompanyRecord> KEY_CANDIDATE_COMPANY_PRIMARY = createUniqueKey(CandidateCompany.CANDIDATE_COMPANY, "KEY_candidate_company_PRIMARY", CandidateCompany.CANDIDATE_COMPANY.ID);
        public static final UniqueKey<CandidateCompanyRecord> KEY_CANDIDATE_COMPANY_UNIQUE_INDEX_COMPANY_USER = createUniqueKey(CandidateCompany.CANDIDATE_COMPANY, "KEY_candidate_company_unique_index_company_user", CandidateCompany.CANDIDATE_COMPANY.SYS_USER_ID, CandidateCompany.CANDIDATE_COMPANY.COMPANY_ID);
        public static final UniqueKey<CandidatePositionRecord> KEY_CANDIDATE_POSITION_PRIMARY = createUniqueKey(CandidatePosition.CANDIDATE_POSITION, "KEY_candidate_position_PRIMARY", CandidatePosition.CANDIDATE_POSITION.USER_ID, CandidatePosition.CANDIDATE_POSITION.POSITION_ID);
        public static final UniqueKey<CandidatePositionShareRecordRecord> KEY_CANDIDATE_POSITION_SHARE_RECORD_PRIMARY = createUniqueKey(CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD, "KEY_candidate_position_share_record_PRIMARY", CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD.ID);
        public static final UniqueKey<CandidateRecomRecordRecord> KEY_CANDIDATE_RECOM_RECORD_PRIMARY = createUniqueKey(CandidateRecomRecord.CANDIDATE_RECOM_RECORD, "KEY_candidate_recom_record_PRIMARY", CandidateRecomRecord.CANDIDATE_RECOM_RECORD.ID);
        public static final UniqueKey<CandidateRemarkRecord> KEY_CANDIDATE_REMARK_PRIMARY = createUniqueKey(CandidateRemark.CANDIDATE_REMARK, "KEY_candidate_remark_PRIMARY", CandidateRemark.CANDIDATE_REMARK.ID);
        public static final UniqueKey<CandidateShareChainRecord> KEY_CANDIDATE_SHARE_CHAIN_PRIMARY = createUniqueKey(CandidateShareChain.CANDIDATE_SHARE_CHAIN, "KEY_candidate_share_chain_PRIMARY", CandidateShareChain.CANDIDATE_SHARE_CHAIN.ID);
        public static final UniqueKey<CandidateSuggestPositionRecord> KEY_CANDIDATE_SUGGEST_POSITION_PRIMARY = createUniqueKey(CandidateSuggestPosition.CANDIDATE_SUGGEST_POSITION, "KEY_candidate_suggest_position_PRIMARY", CandidateSuggestPosition.CANDIDATE_SUGGEST_POSITION.ID);
    }
}
