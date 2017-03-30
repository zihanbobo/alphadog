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
import com.moseeker.db.candidatedb.tables.CandidateVJobPositionRecom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Candidatedb extends SchemaImpl {

    private static final long serialVersionUID = 1562947185;

    /**
     * The reference instance of <code>candidatedb</code>
     */
    public static final Candidatedb CANDIDATEDB = new Candidatedb();

    /**
     * 候选人表
     */
    public final CandidateCompany CANDIDATE_COMPANY = com.moseeker.db.candidatedb.tables.CandidateCompany.CANDIDATE_COMPANY;

    /**
     * 候选人表相关职位表
     */
    public final CandidatePosition CANDIDATE_POSITION = com.moseeker.db.candidatedb.tables.CandidatePosition.CANDIDATE_POSITION;

    /**
     * 用户分享职位访问记录
     */
    public final CandidatePositionShareRecord CANDIDATE_POSITION_SHARE_RECORD = com.moseeker.db.candidatedb.tables.CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD;

    /**
     * 候选人推荐记录表
     */
    public final CandidateRecomRecord CANDIDATE_RECOM_RECORD = com.moseeker.db.candidatedb.tables.CandidateRecomRecord.CANDIDATE_RECOM_RECORD;

    /**
     * HR对候选人备注信息信息
     */
    public final CandidateRemark CANDIDATE_REMARK = com.moseeker.db.candidatedb.tables.CandidateRemark.CANDIDATE_REMARK;

    /**
     * 链路信息表
     */
    public final CandidateShareChain CANDIDATE_SHARE_CHAIN = com.moseeker.db.candidatedb.tables.CandidateShareChain.CANDIDATE_SHARE_CHAIN;

    /**
     * HR手动添加相关职位表
     */
    public final CandidateSuggestPosition CANDIDATE_SUGGEST_POSITION = com.moseeker.db.candidatedb.tables.CandidateSuggestPosition.CANDIDATE_SUGGEST_POSITION;

    /**
     * VIEW
     */
    public final CandidateVJobPositionRecom CANDIDATE_V_JOB_POSITION_RECOM = com.moseeker.db.candidatedb.tables.CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM;

    /**
     * No further instances allowed
     */
    private Candidatedb() {
        super("candidatedb", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            CandidateCompany.CANDIDATE_COMPANY,
            CandidatePosition.CANDIDATE_POSITION,
            CandidatePositionShareRecord.CANDIDATE_POSITION_SHARE_RECORD,
            CandidateRecomRecord.CANDIDATE_RECOM_RECORD,
            CandidateRemark.CANDIDATE_REMARK,
            CandidateShareChain.CANDIDATE_SHARE_CHAIN,
            CandidateSuggestPosition.CANDIDATE_SUGGEST_POSITION,
            CandidateVJobPositionRecom.CANDIDATE_V_JOB_POSITION_RECOM);
    }
}
