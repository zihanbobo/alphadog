/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.profiledb.tables;


import java.sql.Date;
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
import org.jooq.types.UByte;
import org.jooq.types.UInteger;

import com.moseeker.baseorm.db.profiledb.Keys;
import com.moseeker.baseorm.db.profiledb.Profiledb;
import com.moseeker.baseorm.db.profiledb.tables.records.ProfileWorkexpRecord;


/**
 * Profile的工作经历
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileWorkexp extends TableImpl<ProfileWorkexpRecord> {

	private static final long serialVersionUID = -101008409;

	/**
	 * The reference instance of <code>profiledb.profile_workexp</code>
	 */
	public static final ProfileWorkexp PROFILE_WORKEXP = new ProfileWorkexp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProfileWorkexpRecord> getRecordType() {
		return ProfileWorkexpRecord.class;
	}

	/**
	 * The column <code>profiledb.profile_workexp.id</code>. 主key
	 */
	public final TableField<ProfileWorkexpRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "主key");

	/**
	 * The column <code>profiledb.profile_workexp.profile_id</code>. profile.id
	 */
	public final TableField<ProfileWorkexpRecord, UInteger> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "profile.id");

	/**
	 * The column <code>profiledb.profile_workexp.start</code>. 起止时间-起 yyyy-mm-dd
	 */
	public final TableField<ProfileWorkexpRecord, Date> START = createField("start", org.jooq.impl.SQLDataType.DATE, this, "起止时间-起 yyyy-mm-dd");

	/**
	 * The column <code>profiledb.profile_workexp.end</code>. 起止时间-止 yyyy-mm-dd
	 */
	public final TableField<ProfileWorkexpRecord, Date> END = createField("end", org.jooq.impl.SQLDataType.DATE, this, "起止时间-止 yyyy-mm-dd");

	/**
	 * The column <code>profiledb.profile_workexp.end_until_now</code>. 是否至今 0：否 1：是
	 */
	public final TableField<ProfileWorkexpRecord, UByte> END_UNTIL_NOW = createField("end_until_now", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "是否至今 0：否 1：是");

	/**
	 * The column <code>profiledb.profile_workexp.salary_code</code>. 薪资code
	 */
	public final TableField<ProfileWorkexpRecord, UByte> SALARY_CODE = createField("salary_code", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "薪资code");

	/**
	 * The column <code>profiledb.profile_workexp.industry_code</code>. 行业字典编码
	 */
	public final TableField<ProfileWorkexpRecord, UInteger> INDUSTRY_CODE = createField("industry_code", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "行业字典编码");

	/**
	 * The column <code>profiledb.profile_workexp.industry_name</code>. 行业名称
	 */
	public final TableField<ProfileWorkexpRecord, String> INDUSTRY_NAME = createField("industry_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "行业名称");

	/**
	 * The column <code>profiledb.profile_workexp.company_id</code>. 公司ID, hr_company.id
	 */
	public final TableField<ProfileWorkexpRecord, UInteger> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "公司ID, hr_company.id");

	/**
	 * The column <code>profiledb.profile_workexp.department_name</code>. 部门名称
	 */
	public final TableField<ProfileWorkexpRecord, String> DEPARTMENT_NAME = createField("department_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "部门名称");

	/**
	 * The column <code>profiledb.profile_workexp.position_code</code>. 职能字典编码
	 */
	public final TableField<ProfileWorkexpRecord, UInteger> POSITION_CODE = createField("position_code", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "职能字典编码");

	/**
	 * The column <code>profiledb.profile_workexp.position_name</code>. 职能字典名称
	 */
	public final TableField<ProfileWorkexpRecord, String> POSITION_NAME = createField("position_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "职能字典名称");

	/**
	 * The column <code>profiledb.profile_workexp.description</code>. 工作描述
	 */
	public final TableField<ProfileWorkexpRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaulted(true), this, "工作描述");

	/**
	 * The column <code>profiledb.profile_workexp.type</code>. 工作类型 0:没选择 1:全职 2:兼职 3:实习
	 */
	public final TableField<ProfileWorkexpRecord, UByte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "工作类型 0:没选择 1:全职 2:兼职 3:实习");

	/**
	 * The column <code>profiledb.profile_workexp.city_code</code>. 工作地点（城市），字典编码
	 */
	public final TableField<ProfileWorkexpRecord, UInteger> CITY_CODE = createField("city_code", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "工作地点（城市），字典编码");

	/**
	 * The column <code>profiledb.profile_workexp.city_name</code>. 工作地点（城市）名称
	 */
	public final TableField<ProfileWorkexpRecord, String> CITY_NAME = createField("city_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "工作地点（城市）名称");

	/**
	 * The column <code>profiledb.profile_workexp.report_to</code>. 汇报对象
	 */
	public final TableField<ProfileWorkexpRecord, String> REPORT_TO = createField("report_to", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "汇报对象");

	/**
	 * The column <code>profiledb.profile_workexp.underlings</code>. 下属人数, 0:没有下属
	 */
	public final TableField<ProfileWorkexpRecord, UInteger> UNDERLINGS = createField("underlings", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "下属人数, 0:没有下属");

	/**
	 * The column <code>profiledb.profile_workexp.reference</code>. 证明人
	 */
	public final TableField<ProfileWorkexpRecord, String> REFERENCE = createField("reference", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "证明人");

	/**
	 * The column <code>profiledb.profile_workexp.resign_reason</code>. 离职原因
	 */
	public final TableField<ProfileWorkexpRecord, String> RESIGN_REASON = createField("resign_reason", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "离职原因");

	/**
	 * The column <code>profiledb.profile_workexp.achievement</code>. 主要业绩
	 */
	public final TableField<ProfileWorkexpRecord, String> ACHIEVEMENT = createField("achievement", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaulted(true), this, "主要业绩");

	/**
	 * The column <code>profiledb.profile_workexp.create_time</code>. 创建时间
	 */
	public final TableField<ProfileWorkexpRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>profiledb.profile_workexp.update_time</code>. 更新时间
	 */
	public final TableField<ProfileWorkexpRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "更新时间");

	/**
	 * The column <code>profiledb.profile_workexp.job</code>. 所处职位
	 */
	public final TableField<ProfileWorkexpRecord, String> JOB = createField("job", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "所处职位");

	/**
	 * Create a <code>profiledb.profile_workexp</code> table reference
	 */
	public ProfileWorkexp() {
		this("profile_workexp", null);
	}

	/**
	 * Create an aliased <code>profiledb.profile_workexp</code> table reference
	 */
	public ProfileWorkexp(String alias) {
		this(alias, PROFILE_WORKEXP);
	}

	private ProfileWorkexp(String alias, Table<ProfileWorkexpRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProfileWorkexp(String alias, Table<ProfileWorkexpRecord> aliased, Field<?>[] parameters) {
		super(alias, Profiledb.PROFILEDB, aliased, parameters, "Profile的工作经历");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ProfileWorkexpRecord, UInteger> getIdentity() {
		return Keys.IDENTITY_PROFILE_WORKEXP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProfileWorkexpRecord> getPrimaryKey() {
		return Keys.KEY_PROFILE_WORKEXP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProfileWorkexpRecord>> getKeys() {
		return Arrays.<UniqueKey<ProfileWorkexpRecord>>asList(Keys.KEY_PROFILE_WORKEXP_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileWorkexp as(String alias) {
		return new ProfileWorkexp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ProfileWorkexp rename(String name) {
		return new ProfileWorkexp(name, null);
	}
}