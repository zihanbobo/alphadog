/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.profiledb.tables;


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

import com.moseeker.baseorm.db.profiledb.Keys;
import com.moseeker.baseorm.db.profiledb.Profiledb;
import com.moseeker.baseorm.db.profiledb.tables.records.ProfileImportRecord;


/**
 * 用户profile导入记录信息
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileImport extends TableImpl<ProfileImportRecord> {

	private static final long serialVersionUID = -1122497632;

	/**
	 * The reference instance of <code>profiledb.profile_import</code>
	 */
	public static final ProfileImport PROFILE_IMPORT = new ProfileImport();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProfileImportRecord> getRecordType() {
		return ProfileImportRecord.class;
	}

	/**
	 * The column <code>profiledb.profile_import.profile_id</code>. profile.id
	 */
	public final TableField<ProfileImportRecord, UInteger> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "profile.id");

	/**
	 * The column <code>profiledb.profile_import.source</code>. 来源, 0:无法识别 1:51Job 2:Liepin 3:zhilian 4:linkedin
	 */
	public final TableField<ProfileImportRecord, UByte> SOURCE = createField("source", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "来源, 0:无法识别 1:51Job 2:Liepin 3:zhilian 4:linkedin");

	/**
	 * The column <code>profiledb.profile_import.last_update_time</code>. 导入简历的最后修改时间
	 */
	public final TableField<ProfileImportRecord, Timestamp> LAST_UPDATE_TIME = createField("last_update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "导入简历的最后修改时间");

	/**
	 * The column <code>profiledb.profile_import.account_id</code>. 他系统的用户ID
	 */
	public final TableField<ProfileImportRecord, String> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "他系统的用户ID");

	/**
	 * The column <code>profiledb.profile_import.resume_id</code>. 他系统的简历ID
	 */
	public final TableField<ProfileImportRecord, String> RESUME_ID = createField("resume_id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "他系统的简历ID");

	/**
	 * The column <code>profiledb.profile_import.user_name</code>. 他系统的登陆用户名
	 */
	public final TableField<ProfileImportRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "他系统的登陆用户名");

	/**
	 * The column <code>profiledb.profile_import.create_time</code>. 创建时间
	 */
	public final TableField<ProfileImportRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>profiledb.profile_import.update_time</code>. 更新时间
	 */
	public final TableField<ProfileImportRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "更新时间");

	/**
	 * The column <code>profiledb.profile_import.data</code>. 导入数据
	 */
	public final TableField<ProfileImportRecord, String> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "导入数据");

	/**
	 * Create a <code>profiledb.profile_import</code> table reference
	 */
	public ProfileImport() {
		this("profile_import", null);
	}

	/**
	 * Create an aliased <code>profiledb.profile_import</code> table reference
	 */
	public ProfileImport(String alias) {
		this(alias, PROFILE_IMPORT);
	}

	private ProfileImport(String alias, Table<ProfileImportRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProfileImport(String alias, Table<ProfileImportRecord> aliased, Field<?>[] parameters) {
		super(alias, Profiledb.PROFILEDB, aliased, parameters, "用户profile导入记录信息");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProfileImportRecord> getPrimaryKey() {
		return Keys.KEY_PROFILE_IMPORT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProfileImportRecord>> getKeys() {
		return Arrays.<UniqueKey<ProfileImportRecord>>asList(Keys.KEY_PROFILE_IMPORT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileImport as(String alias) {
		return new ProfileImport(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ProfileImport rename(String name) {
		return new ProfileImport(name, null);
	}
}
