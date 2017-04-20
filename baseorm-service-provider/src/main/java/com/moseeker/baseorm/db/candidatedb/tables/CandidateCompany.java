/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.candidatedb.tables;


import com.moseeker.baseorm.db.candidatedb.Candidatedb;
import com.moseeker.baseorm.db.candidatedb.Keys;
import com.moseeker.baseorm.db.candidatedb.tables.records.CandidateCompanyRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * 候选人表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidateCompany extends TableImpl<CandidateCompanyRecord> {

	private static final long serialVersionUID = 1779392569;

	/**
	 * The reference instance of <code>candidatedb.candidate_company</code>
	 */
	public static final CandidateCompany CANDIDATE_COMPANY = new CandidateCompany();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CandidateCompanyRecord> getRecordType() {
		return CandidateCompanyRecord.class;
	}

	/**
	 * The column <code>candidatedb.candidate_company.id</code>.
	 */
	public final TableField<CandidateCompanyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>candidatedb.candidate_company.company_id</code>. hr_company.id
	 */
	public final TableField<CandidateCompanyRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "hr_company.id");

	/**
	 * The column <code>candidatedb.candidate_company.update_time</code>. 修改时间
	 */
	public final TableField<CandidateCompanyRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "修改时间");

	/**
	 * The column <code>candidatedb.candidate_company.wxuser_id</code>. user_wx_user.id  候选人绑定的user_wx_user.id，现在已经废弃。微信账号由C端账号替换，请参考sys_user_id
	 */
	public final TableField<CandidateCompanyRecord, Integer> WXUSER_ID = createField("wxuser_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "user_wx_user.id  候选人绑定的user_wx_user.id，现在已经废弃。微信账号由C端账号替换，请参考sys_user_id");

	/**
	 * The column <code>candidatedb.candidate_company.status</code>. 候选人状态，0：删除，1：正常状态
	 */
	public final TableField<CandidateCompanyRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "候选人状态，0：删除，1：正常状态");

	/**
	 * The column <code>candidatedb.candidate_company.is_recommend</code>. 是否推荐 false:未推荐，true:推荐
	 */
	public final TableField<CandidateCompanyRecord, Byte> IS_RECOMMEND = createField("is_recommend", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "是否推荐 false:未推荐，true:推荐");

	/**
	 * The column <code>candidatedb.candidate_company.name</code>. sys_user.name 姓名或微信昵称
	 */
	public final TableField<CandidateCompanyRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "sys_user.name 姓名或微信昵称");

	/**
	 * The column <code>candidatedb.candidate_company.email</code>. sys_user.email 邮箱
	 */
	public final TableField<CandidateCompanyRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "sys_user.email 邮箱");

	/**
	 * The column <code>candidatedb.candidate_company.mobile</code>. sys_user.mobile 电话
	 */
	public final TableField<CandidateCompanyRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaulted(true), this, "sys_user.mobile 电话");

	/**
	 * The column <code>candidatedb.candidate_company.nickname</code>. wx_group_user.nickname 用户昵称
	 */
	public final TableField<CandidateCompanyRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "wx_group_user.nickname 用户昵称");

	/**
	 * The column <code>candidatedb.candidate_company.headimgurl</code>. wx_group_user.headimgurl 用户头像
	 */
	public final TableField<CandidateCompanyRecord, String> HEADIMGURL = createField("headimgurl", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "wx_group_user.headimgurl 用户头像");

	/**
	 * The column <code>candidatedb.candidate_company.sys_user_id</code>. userdb.user_user.id C端账号编号，表示该候选人绑定的C端账号
	 */
	public final TableField<CandidateCompanyRecord, UInteger> SYS_USER_ID = createField("sys_user_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "userdb.user_user.id C端账号编号，表示该候选人绑定的C端账号");

	/**
	 * The column <code>candidatedb.candidate_company.click_from</code>. 来自, 0:未知, 朋友圈(timeline ) 1, 微信群(groupmessage) 2, 个人消息(singlemessage)
	 */
	public final TableField<CandidateCompanyRecord, Integer> CLICK_FROM = createField("click_from", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "来自, 0:未知, 朋友圈(timeline ) 1, 微信群(groupmessage) 2, 个人消息(singlemessage)");

	/**
	 * Create a <code>candidatedb.candidate_company</code> table reference
	 */
	public CandidateCompany() {
		this("candidate_company", null);
	}

	/**
	 * Create an aliased <code>candidatedb.candidate_company</code> table reference
	 */
	public CandidateCompany(String alias) {
		this(alias, CANDIDATE_COMPANY);
	}

	private CandidateCompany(String alias, Table<CandidateCompanyRecord> aliased) {
		this(alias, aliased, null);
	}

	private CandidateCompany(String alias, Table<CandidateCompanyRecord> aliased, Field<?>[] parameters) {
		super(alias, Candidatedb.CANDIDATEDB, aliased, parameters, "候选人表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<CandidateCompanyRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CANDIDATE_COMPANY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CandidateCompanyRecord> getPrimaryKey() {
		return Keys.KEY_CANDIDATE_COMPANY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CandidateCompanyRecord>> getKeys() {
		return Arrays.<UniqueKey<CandidateCompanyRecord>>asList(Keys.KEY_CANDIDATE_COMPANY_PRIMARY, Keys.KEY_CANDIDATE_COMPANY_UNIQUE_INDEX_COMPANY_USER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CandidateCompany as(String alias) {
		return new CandidateCompany(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CandidateCompany rename(String name) {
		return new CandidateCompany(name, null);
	}
}