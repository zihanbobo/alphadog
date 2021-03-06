/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.candidatedb.tables;


import com.moseeker.baseorm.db.candidatedb.Candidatedb;
import com.moseeker.baseorm.db.candidatedb.Keys;
import com.moseeker.baseorm.db.candidatedb.tables.records.CandidateShareChain_0418Record;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 链路信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidateShareChain_0418 extends TableImpl<CandidateShareChain_0418Record> {

    private static final long serialVersionUID = -1220979208;

    /**
     * The reference instance of <code>candidatedb.candidate_share_chain_0418</code>
     */
    public static final CandidateShareChain_0418 CANDIDATE_SHARE_CHAIN_0418 = new CandidateShareChain_0418();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CandidateShareChain_0418Record> getRecordType() {
        return CandidateShareChain_0418Record.class;
    }

    /**
     * The column <code>candidatedb.candidate_share_chain_0418.id</code>.
     */
    public final TableField<CandidateShareChain_0418Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>candidatedb.candidate_share_chain_0418.position_id</code>.
     */
    public final TableField<CandidateShareChain_0418Record, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>candidatedb.candidate_share_chain_0418.root_recom_user_id</code>.
     */
    public final TableField<CandidateShareChain_0418Record, Integer> ROOT_RECOM_USER_ID = createField("root_recom_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>candidatedb.candidate_share_chain_0418.root2_recom_user_id</code>.
     */
    public final TableField<CandidateShareChain_0418Record, Integer> ROOT2_RECOM_USER_ID = createField("root2_recom_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>candidatedb.candidate_share_chain_0418.recom_user_id</code>.
     */
    public final TableField<CandidateShareChain_0418Record, Integer> RECOM_USER_ID = createField("recom_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>candidatedb.candidate_share_chain_0418.presentee_user_id</code>.
     */
    public final TableField<CandidateShareChain_0418Record, Integer> PRESENTEE_USER_ID = createField("presentee_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>candidatedb.candidate_share_chain_0418.depth</code>.
     */
    public final TableField<CandidateShareChain_0418Record, Integer> DEPTH = createField("depth", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>candidatedb.candidate_share_chain_0418.parent_id</code>.
     */
    public final TableField<CandidateShareChain_0418Record, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>candidatedb.candidate_share_chain_0418.click_time</code>.
     */
    public final TableField<CandidateShareChain_0418Record, Timestamp> CLICK_TIME = createField("click_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>candidatedb.candidate_share_chain_0418.create_time</code>.
     */
    public final TableField<CandidateShareChain_0418Record, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>candidatedb.candidate_share_chain_0418</code> table reference
     */
    public CandidateShareChain_0418() {
        this("candidate_share_chain_0418", null);
    }

    /**
     * Create an aliased <code>candidatedb.candidate_share_chain_0418</code> table reference
     */
    public CandidateShareChain_0418(String alias) {
        this(alias, CANDIDATE_SHARE_CHAIN_0418);
    }

    private CandidateShareChain_0418(String alias, Table<CandidateShareChain_0418Record> aliased) {
        this(alias, aliased, null);
    }

    private CandidateShareChain_0418(String alias, Table<CandidateShareChain_0418Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "链路信息表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Candidatedb.CANDIDATEDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CandidateShareChain_0418Record, Integer> getIdentity() {
        return Keys.IDENTITY_CANDIDATE_SHARE_CHAIN_0418;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CandidateShareChain_0418Record> getPrimaryKey() {
        return Keys.KEY_CANDIDATE_SHARE_CHAIN_0418_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CandidateShareChain_0418Record>> getKeys() {
        return Arrays.<UniqueKey<CandidateShareChain_0418Record>>asList(Keys.KEY_CANDIDATE_SHARE_CHAIN_0418_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidateShareChain_0418 as(String alias) {
        return new CandidateShareChain_0418(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CandidateShareChain_0418 rename(String name) {
        return new CandidateShareChain_0418(name, null);
    }
}
