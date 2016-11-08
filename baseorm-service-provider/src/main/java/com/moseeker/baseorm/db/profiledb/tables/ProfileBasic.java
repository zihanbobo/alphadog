/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.profiledb.tables;


import com.moseeker.baseorm.db.profiledb.Keys;
import com.moseeker.baseorm.db.profiledb.Profiledb;
import com.moseeker.baseorm.db.profiledb.tables.records.ProfileBasicRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * 用户profile基础个人信息表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileBasic extends TableImpl<ProfileBasicRecord> {

	private static final long serialVersionUID = -1844657959;

	/**
	 * The reference instance of <code>profiledb.profile_basic</code>
	 */
	public static final ProfileBasic PROFILE_BASIC = new ProfileBasic();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProfileBasicRecord> getRecordType() {
		return ProfileBasicRecord.class;
	}

	/**
	 * The column <code>profiledb.profile_basic.profile_id</code>. profile.id
	 */
	public final TableField<ProfileBasicRecord, UInteger> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "profile.id");

	/**
	 * The column <code>profiledb.profile_basic.name</code>. 姓名
	 */
	public final TableField<ProfileBasicRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "姓名");

	/**
	 * The column <code>profiledb.profile_basic.gender</code>. 性别, dict_constant.parent_code:3109
	 */
	public final TableField<ProfileBasicRecord, UByte> GENDER = createField("gender", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "性别, dict_constant.parent_code:3109");

	/**
	 * The column <code>profiledb.profile_basic.nationality_code</code>. 国籍code，国家字典表, dict_country.id
	 */
	public final TableField<ProfileBasicRecord, Integer> NATIONALITY_CODE = createField("nationality_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "国籍code，国家字典表, dict_country.id");

	/**
	 * The column <code>profiledb.profile_basic.nationality_name</code>. 国籍名称
	 */
	public final TableField<ProfileBasicRecord, String> NATIONALITY_NAME = createField("nationality_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "国籍名称");

	/**
	 * The column <code>profiledb.profile_basic.city_code</code>. 现居住地, 城市字典
	 */
	public final TableField<ProfileBasicRecord, Integer> CITY_CODE = createField("city_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "现居住地, 城市字典");

	/**
	 * The column <code>profiledb.profile_basic.city_name</code>. 现居住地, 城市名称
	 */
	public final TableField<ProfileBasicRecord, String> CITY_NAME = createField("city_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "现居住地, 城市名称");

	/**
	 * The column <code>profiledb.profile_basic.birth</code>. 出生年月 yyyy-mm-dd
	 */
	public final TableField<ProfileBasicRecord, Date> BIRTH = createField("birth", org.jooq.impl.SQLDataType.DATE, this, "出生年月 yyyy-mm-dd");

	/**
	 * The column <code>profiledb.profile_basic.weixin</code>. 微信号
	 */
	public final TableField<ProfileBasicRecord, String> WEIXIN = createField("weixin", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "微信号");

	/**
	 * The column <code>profiledb.profile_basic.qq</code>. QQ号
	 */
	public final TableField<ProfileBasicRecord, String> QQ = createField("qq", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "QQ号");

	/**
	 * The column <code>profiledb.profile_basic.motto</code>. 座右铭
	 */
	public final TableField<ProfileBasicRecord, String> MOTTO = createField("motto", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "座右铭");

	/**
	 * The column <code>profiledb.profile_basic.self_introduction</code>. 自我介绍
	 */
	public final TableField<ProfileBasicRecord, String> SELF_INTRODUCTION = createField("self_introduction", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaulted(true), this, "自我介绍");

	/**
	 * The column <code>profiledb.profile_basic.create_time</code>. 创建时间
	 */
	public final TableField<ProfileBasicRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>profiledb.profile_basic.update_time</code>. 更新时间
	 */
	public final TableField<ProfileBasicRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "更新时间");

	/**
	 * Create a <code>profiledb.profile_basic</code> table reference
	 */
	public ProfileBasic() {
		this("profile_basic", null);
	}

	/**
	 * Create an aliased <code>profiledb.profile_basic</code> table reference
	 */
	public ProfileBasic(String alias) {
		this(alias, PROFILE_BASIC);
	}

	private ProfileBasic(String alias, Table<ProfileBasicRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProfileBasic(String alias, Table<ProfileBasicRecord> aliased, Field<?>[] parameters) {
		super(alias, Profiledb.PROFILEDB, aliased, parameters, "用户profile基础个人信息表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProfileBasicRecord> getPrimaryKey() {
		return Keys.KEY_PROFILE_BASIC_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProfileBasicRecord>> getKeys() {
		return Arrays.<UniqueKey<ProfileBasicRecord>>asList(Keys.KEY_PROFILE_BASIC_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileBasic as(String alias) {
		return new ProfileBasic(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ProfileBasic rename(String name) {
		return new ProfileBasic(name, null);
	}
}
