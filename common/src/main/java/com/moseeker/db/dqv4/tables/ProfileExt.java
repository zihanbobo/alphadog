/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables;


import com.moseeker.db.dqv4.Dqv4;
import com.moseeker.db.dqv4.Keys;
import com.moseeker.db.dqv4.tables.records.ProfileExtRecord;

import java.sql.Timestamp;
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
 * 用户profile扩展表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileExt extends TableImpl<ProfileExtRecord> {

	private static final long serialVersionUID = 991939122;

	/**
	 * The reference instance of <code>dqv4.profile_ext</code>
	 */
	public static final ProfileExt PROFILE_EXT = new ProfileExt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProfileExtRecord> getRecordType() {
		return ProfileExtRecord.class;
	}

	/**
	 * The column <code>dqv4.profile_ext.profile_id</code>. profile.id
	 */
	public final TableField<ProfileExtRecord, UInteger> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "profile.id");

	/**
	 * The column <code>dqv4.profile_ext.homepage</code>. 个人主页 url
	 */
	public final TableField<ProfileExtRecord, String> HOMEPAGE = createField("homepage", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaulted(true), this, "个人主页 url");

	/**
	 * The column <code>dqv4.profile_ext.assessment</code>. 自我评价
	 */
	public final TableField<ProfileExtRecord, String> ASSESSMENT = createField("assessment", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaulted(true), this, "自我评价");

	/**
	 * The column <code>dqv4.profile_ext.interest</code>. 兴趣爱好，eg：跑步,游泳
	 */
	public final TableField<ProfileExtRecord, String> INTEREST = createField("interest", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "兴趣爱好，eg：跑步,游泳");

	/**
	 * The column <code>dqv4.profile_ext.create_time</code>. 创建时间
	 */
	public final TableField<ProfileExtRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>dqv4.profile_ext.update_time</code>. 更新时间
	 */
	public final TableField<ProfileExtRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "更新时间");

	/**
	 * Create a <code>dqv4.profile_ext</code> table reference
	 */
	public ProfileExt() {
		this("profile_ext", null);
	}

	/**
	 * Create an aliased <code>dqv4.profile_ext</code> table reference
	 */
	public ProfileExt(String alias) {
		this(alias, PROFILE_EXT);
	}

	private ProfileExt(String alias, Table<ProfileExtRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProfileExt(String alias, Table<ProfileExtRecord> aliased, Field<?>[] parameters) {
		super(alias, Dqv4.DQV4, aliased, parameters, "用户profile扩展表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProfileExtRecord> getPrimaryKey() {
		return Keys.KEY_PROFILE_EXT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProfileExtRecord>> getKeys() {
		return Arrays.<UniqueKey<ProfileExtRecord>>asList(Keys.KEY_PROFILE_EXT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileExt as(String alias) {
		return new ProfileExt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ProfileExt rename(String name) {
		return new ProfileExt(name, null);
	}
}
