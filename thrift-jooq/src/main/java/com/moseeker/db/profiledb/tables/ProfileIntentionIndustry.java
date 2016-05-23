/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.profiledb.tables;


import com.moseeker.db.profiledb.Keys;
import com.moseeker.db.profiledb.Profiledb;
import com.moseeker.db.profiledb.tables.records.ProfileIntentionIndustryRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * Profile的求职意向-行业关系表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileIntentionIndustry extends TableImpl<ProfileIntentionIndustryRecord> {

	private static final long serialVersionUID = -1885039024;

	/**
	 * The reference instance of <code>profileDB.profile_intention_industry</code>
	 */
	public static final ProfileIntentionIndustry PROFILE_INTENTION_INDUSTRY = new ProfileIntentionIndustry();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProfileIntentionIndustryRecord> getRecordType() {
		return ProfileIntentionIndustryRecord.class;
	}

	/**
	 * The column <code>profileDB.profile_intention_industry.profile_intention_id</code>. profile_intention.id
	 */
	public final TableField<ProfileIntentionIndustryRecord, UInteger> PROFILE_INTENTION_ID = createField("profile_intention_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "profile_intention.id");

	/**
	 * The column <code>profileDB.profile_intention_industry.industry_code</code>. 行业字典编码
	 */
	public final TableField<ProfileIntentionIndustryRecord, UInteger> INDUSTRY_CODE = createField("industry_code", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "行业字典编码");

	/**
	 * The column <code>profileDB.profile_intention_industry.industry_name</code>. 行业名称
	 */
	public final TableField<ProfileIntentionIndustryRecord, String> INDUSTRY_NAME = createField("industry_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "行业名称");

	/**
	 * Create a <code>profileDB.profile_intention_industry</code> table reference
	 */
	public ProfileIntentionIndustry() {
		this("profile_intention_industry", null);
	}

	/**
	 * Create an aliased <code>profileDB.profile_intention_industry</code> table reference
	 */
	public ProfileIntentionIndustry(String alias) {
		this(alias, PROFILE_INTENTION_INDUSTRY);
	}

	private ProfileIntentionIndustry(String alias, Table<ProfileIntentionIndustryRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProfileIntentionIndustry(String alias, Table<ProfileIntentionIndustryRecord> aliased, Field<?>[] parameters) {
		super(alias, Profiledb.PROFILEDB, aliased, parameters, "Profile的求职意向-行业关系表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProfileIntentionIndustryRecord> getPrimaryKey() {
		return Keys.KEY_PROFILE_INTENTION_INDUSTRY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProfileIntentionIndustryRecord>> getKeys() {
		return Arrays.<UniqueKey<ProfileIntentionIndustryRecord>>asList(Keys.KEY_PROFILE_INTENTION_INDUSTRY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileIntentionIndustry as(String alias) {
		return new ProfileIntentionIndustry(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ProfileIntentionIndustry rename(String name) {
		return new ProfileIntentionIndustry(name, null);
	}
}
