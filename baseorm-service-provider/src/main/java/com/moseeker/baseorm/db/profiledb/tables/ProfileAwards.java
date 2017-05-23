/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.profiledb.tables;


import com.moseeker.baseorm.db.profiledb.Keys;
import com.moseeker.baseorm.db.profiledb.Profiledb;
import com.moseeker.baseorm.db.profiledb.tables.records.ProfileAwardsRecord;

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


/**
 * Profile的获得奖项表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileAwards extends TableImpl<ProfileAwardsRecord> {

	private static final long serialVersionUID = 1020172419;

	/**
	 * The reference instance of <code>profiledb.profile_awards</code>
	 */
	public static final ProfileAwards PROFILE_AWARDS = new ProfileAwards();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProfileAwardsRecord> getRecordType() {
		return ProfileAwardsRecord.class;
	}

	/**
	 * The column <code>profiledb.profile_awards.id</code>. 主key
	 */
	public final TableField<ProfileAwardsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主key");

	/**
	 * The column <code>profiledb.profile_awards.profile_id</code>. profile.id
	 */
	public final TableField<ProfileAwardsRecord, Integer> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "profile.id");

	/**
	 * The column <code>profiledb.profile_awards.reward_date</code>. 获奖日期 yyyy-mm-dd
	 */
	public final TableField<ProfileAwardsRecord, Date> REWARD_DATE = createField("reward_date", org.jooq.impl.SQLDataType.DATE, this, "获奖日期 yyyy-mm-dd");

	/**
	 * The column <code>profiledb.profile_awards.name</code>. 获得奖项名称
	 */
	public final TableField<ProfileAwardsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaulted(true), this, "获得奖项名称");

	/**
	 * The column <code>profiledb.profile_awards.award_winning_status</code>. 获奖身份
	 */
	public final TableField<ProfileAwardsRecord, String> AWARD_WINNING_STATUS = createField("award_winning_status", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaulted(true), this, "获奖身份");

	/**
	 * The column <code>profiledb.profile_awards.level</code>. 级别
	 */
	public final TableField<ProfileAwardsRecord, String> LEVEL = createField("level", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaulted(true), this, "级别");

	/**
	 * The column <code>profiledb.profile_awards.description</code>. 描述
	 */
	public final TableField<ProfileAwardsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaulted(true), this, "描述");

	/**
	 * The column <code>profiledb.profile_awards.create_time</code>. 创建时间
	 */
	public final TableField<ProfileAwardsRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>profiledb.profile_awards.update_time</code>. 更新时间
	 */
	public final TableField<ProfileAwardsRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "更新时间");

	/**
	 * Create a <code>profiledb.profile_awards</code> table reference
	 */
	public ProfileAwards() {
		this("profile_awards", null);
	}

	/**
	 * Create an aliased <code>profiledb.profile_awards</code> table reference
	 */
	public ProfileAwards(String alias) {
		this(alias, PROFILE_AWARDS);
	}

	private ProfileAwards(String alias, Table<ProfileAwardsRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProfileAwards(String alias, Table<ProfileAwardsRecord> aliased, Field<?>[] parameters) {
		super(alias, Profiledb.PROFILEDB, aliased, parameters, "Profile的获得奖项表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ProfileAwardsRecord, Integer> getIdentity() {
		return Keys.IDENTITY_PROFILE_AWARDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProfileAwardsRecord> getPrimaryKey() {
		return Keys.KEY_PROFILE_AWARDS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProfileAwardsRecord>> getKeys() {
		return Arrays.<UniqueKey<ProfileAwardsRecord>>asList(Keys.KEY_PROFILE_AWARDS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileAwards as(String alias) {
		return new ProfileAwards(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ProfileAwards rename(String name) {
		return new ProfileAwards(name, null);
	}
}
