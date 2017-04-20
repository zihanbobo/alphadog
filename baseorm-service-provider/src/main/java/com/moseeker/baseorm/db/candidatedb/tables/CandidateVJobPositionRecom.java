/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.candidatedb.tables;


import com.moseeker.baseorm.db.candidatedb.Candidatedb;
import com.moseeker.baseorm.db.candidatedb.tables.records.CandidateVJobPositionRecomRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidateVJobPositionRecom extends TableImpl<CandidateVJobPositionRecomRecord> {

	private static final long serialVersionUID = -358141396;

	/**
	 * The reference instance of <code>candidatedb.candidate_v_job_position_recom</code>
	 */
	public static final CandidateVJobPositionRecom CANDIDATE_V_JOB_POSITION_RECOM = new CandidateVJobPositionRecom();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CandidateVJobPositionRecomRecord> getRecordType() {
		return CandidateVJobPositionRecomRecord.class;
	}

	/**
	 * The column <code>candidatedb.candidate_v_job_position_recom.position_id</code>. position.id 分享职位ID
	 */
	public final TableField<CandidateVJobPositionRecomRecord, Long> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "position.id 分享职位ID");

	/**
	 * The column <code>candidatedb.candidate_v_job_position_recom.recom_id</code>. userdb.user_wx_user.id 分享用户微信ID。现在已经废弃，请参考recom_user_id字段
	 */
	public final TableField<CandidateVJobPositionRecomRecord, Long> RECOM_ID = createField("recom_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "userdb.user_wx_user.id 分享用户微信ID。现在已经废弃，请参考recom_user_id字段");

	/**
	 * The column <code>candidatedb.candidate_v_job_position_recom.presentee_id</code>. 被动求职者,浏览者的微信ID，userdb.user_wx_user.id。现在已经废弃，请参考presentee_user_id
	 */
	public final TableField<CandidateVJobPositionRecomRecord, Long> PRESENTEE_ID = createField("presentee_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "被动求职者,浏览者的微信ID，userdb.user_wx_user.id。现在已经废弃，请参考presentee_user_id");

	/**
	 * The column <code>candidatedb.candidate_v_job_position_recom.create_time</code>. 创建时间
	 */
	public final TableField<CandidateVJobPositionRecomRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>candidatedb.candidate_v_job_position_recom.nickname</code>. 用户昵称
	 */
	public final TableField<CandidateVJobPositionRecomRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "用户昵称");

	/**
	 * Create a <code>candidatedb.candidate_v_job_position_recom</code> table reference
	 */
	public CandidateVJobPositionRecom() {
		this("candidate_v_job_position_recom", null);
	}

	/**
	 * Create an aliased <code>candidatedb.candidate_v_job_position_recom</code> table reference
	 */
	public CandidateVJobPositionRecom(String alias) {
		this(alias, CANDIDATE_V_JOB_POSITION_RECOM);
	}

	private CandidateVJobPositionRecom(String alias, Table<CandidateVJobPositionRecomRecord> aliased) {
		this(alias, aliased, null);
	}

	private CandidateVJobPositionRecom(String alias, Table<CandidateVJobPositionRecomRecord> aliased, Field<?>[] parameters) {
		super(alias, Candidatedb.CANDIDATEDB, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateVJobPositionRecom as(String alias) {
		return new CandidateVJobPositionRecom(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CandidateVJobPositionRecom rename(String name) {
		return new CandidateVJobPositionRecom(name, null);
	}
}