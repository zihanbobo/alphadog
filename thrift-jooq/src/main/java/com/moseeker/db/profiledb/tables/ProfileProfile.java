/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.profiledb.tables;


import com.moseeker.db.profiledb.Keys;
import com.moseeker.db.profiledb.Profiledb;
import com.moseeker.db.profiledb.tables.records.ProfileProfileRecord;

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


/**
 * 用户profile表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileProfile extends TableImpl<ProfileProfileRecord> {

	private static final long serialVersionUID = 793238873;

	/**
	 * The reference instance of <code>profiledb.profile_profile</code>
	 */
	public static final ProfileProfile PROFILE_PROFILE = new ProfileProfile();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProfileProfileRecord> getRecordType() {
		return ProfileProfileRecord.class;
	}

	/**
	 * The column <code>profiledb.profile_profile.id</code>. 主key
	 */
	public final TableField<ProfileProfileRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "主key");

	/**
	 * The column <code>profiledb.profile_profile.uuid</code>. profile的uuid标识,与主键一一对应
	 */
	public final TableField<ProfileProfileRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "profile的uuid标识,与主键一一对应");

	/**
	 * The column <code>profiledb.profile_profile.lang</code>. profile语言 1:chinese 2:english
	 */
	public final TableField<ProfileProfileRecord, UByte> LANG = createField("lang", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "profile语言 1:chinese 2:english");

	/**
	 * The column <code>profiledb.profile_profile.source</code>. Profile的创建来源, 0:未知, 或者mongo合并来的 1:微信企业端(正常), 2:微信企业端(我要投递), 3:微信企业端(我感兴趣), 4:微信聚合端(正常), 5:微信聚合端(我要投递), 6:微信聚合端(我感兴趣), 100:微信企业端Email申请, 101:微信聚合端Email申请, 150:微信企业端导入, 151:微信聚合端导入, 152:PC导入, 200:PC(正常添加) 201:PC(我要投递) 202: PC(我感兴趣)
	 */
	public final TableField<ProfileProfileRecord, UInteger> SOURCE = createField("source", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "Profile的创建来源, 0:未知, 或者mongo合并来的 1:微信企业端(正常), 2:微信企业端(我要投递), 3:微信企业端(我感兴趣), 4:微信聚合端(正常), 5:微信聚合端(我要投递), 6:微信聚合端(我感兴趣), 100:微信企业端Email申请, 101:微信聚合端Email申请, 150:微信企业端导入, 151:微信聚合端导入, 152:PC导入, 200:PC(正常添加) 201:PC(我要投递) 202: PC(我感兴趣)");

	/**
	 * The column <code>profiledb.profile_profile.completeness</code>. Profile完整度
	 */
	public final TableField<ProfileProfileRecord, UByte> COMPLETENESS = createField("completeness", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "Profile完整度");

	/**
	 * The column <code>profiledb.profile_profile.user_id</code>. 用户ID
	 */
	public final TableField<ProfileProfileRecord, UInteger> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "用户ID");

	/**
	 * The column <code>profiledb.profile_profile.disable</code>. 是否有效，0：无效 1：有效
	 */
	public final TableField<ProfileProfileRecord, UByte> DISABLE = createField("disable", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "是否有效，0：无效 1：有效");

	/**
	 * The column <code>profiledb.profile_profile.create_time</code>. 创建时间
	 */
	public final TableField<ProfileProfileRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>profiledb.profile_profile.update_time</code>. 更新时间
	 */
	public final TableField<ProfileProfileRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "更新时间");

	/**
	 * The column <code>profiledb.profile_profile.origin</code>. 简历来源二进制数值,1表示维系企业端（正常），10表示微信企业端(我要投递)，100表示微信企业端(我感兴趣)，1000表示微信企业端(我感兴趣)，10000表示微信聚合端(正常)，100000表示微信聚合端(我要投递)，1000000表示微信聚合端(我感兴趣)，1000000表示微信企业端Email申请，100000000表示微信聚合端Email申请，1000000000表示微信企业端导入，10000000000表示微信聚合端导入，10000000000表示PC导入，100000000000表示PC(正常添加)，1000000000000表示PC(我要投递)，10000000000000表示PC(我感兴趣)，1000000000000000表示51job，10000000000000000表示智联
	 */
	public final TableField<ProfileProfileRecord, String> ORIGIN = createField("origin", org.jooq.impl.SQLDataType.VARCHAR.length(20).defaulted(true), this, "简历来源二进制数值,1表示维系企业端（正常），10表示微信企业端(我要投递)，100表示微信企业端(我感兴趣)，1000表示微信企业端(我感兴趣)，10000表示微信聚合端(正常)，100000表示微信聚合端(我要投递)，1000000表示微信聚合端(我感兴趣)，1000000表示微信企业端Email申请，100000000表示微信聚合端Email申请，1000000000表示微信企业端导入，10000000000表示微信聚合端导入，10000000000表示PC导入，100000000000表示PC(正常添加)，1000000000000表示PC(我要投递)，10000000000000表示PC(我感兴趣)，1000000000000000表示51job，10000000000000000表示智联");

	/**
	 * Create a <code>profiledb.profile_profile</code> table reference
	 */
	public ProfileProfile() {
		this("profile_profile", null);
	}

	/**
	 * Create an aliased <code>profiledb.profile_profile</code> table reference
	 */
	public ProfileProfile(String alias) {
		this(alias, PROFILE_PROFILE);
	}

	private ProfileProfile(String alias, Table<ProfileProfileRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProfileProfile(String alias, Table<ProfileProfileRecord> aliased, Field<?>[] parameters) {
		super(alias, Profiledb.PROFILEDB, aliased, parameters, "用户profile表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ProfileProfileRecord, UInteger> getIdentity() {
		return Keys.IDENTITY_PROFILE_PROFILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProfileProfileRecord> getPrimaryKey() {
		return Keys.KEY_PROFILE_PROFILE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProfileProfileRecord>> getKeys() {
		return Arrays.<UniqueKey<ProfileProfileRecord>>asList(Keys.KEY_PROFILE_PROFILE_PRIMARY, Keys.KEY_PROFILE_PROFILE_UK_PROFILE_USERID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileProfile as(String alias) {
		return new ProfileProfile(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ProfileProfile rename(String name) {
		return new ProfileProfile(name, null);
	}
}
