/**
 * This class is generated by jOOQ
 */
package com.moseeker.servicemanager.db.configdb.tables;


import com.moseeker.servicemanager.db.configdb.Configdb;
import com.moseeker.servicemanager.db.configdb.Keys;
import com.moseeker.servicemanager.db.configdb.tables.records.CacheconfigRediskeyRecord;

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
 * redis缓存配置表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CacheconfigRediskey extends TableImpl<CacheconfigRediskeyRecord> {

	private static final long serialVersionUID = 1944860374;

	/**
	 * The reference instance of <code>configDB.cacheconfig_rediskey</code>
	 */
	public static final CacheconfigRediskey CACHECONFIG_REDISKEY = new CacheconfigRediskey();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CacheconfigRediskeyRecord> getRecordType() {
		return CacheconfigRediskeyRecord.class;
	}

	/**
	 * The column <code>configDB.cacheconfig_rediskey.id</code>.
	 */
	public final TableField<CacheconfigRediskeyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>configDB.cacheconfig_rediskey.project_appid</code>. 项目id
	 */
	public final TableField<CacheconfigRediskeyRecord, Integer> PROJECT_APPID = createField("project_appid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "项目id");

	/**
	 * The column <code>configDB.cacheconfig_rediskey.key_identifier</code>. 标识符， 大写英文字母
	 */
	public final TableField<CacheconfigRediskeyRecord, String> KEY_IDENTIFIER = createField("key_identifier", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "标识符， 大写英文字母");

	/**
	 * The column <code>configDB.cacheconfig_rediskey.pattern</code>. 格式， 形如 ip_limit_%s
	 */
	public final TableField<CacheconfigRediskeyRecord, String> PATTERN = createField("pattern", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "格式， 形如 ip_limit_%s");

	/**
	 * The column <code>configDB.cacheconfig_rediskey.json_extraparams</code>. 额外参数， 如{'maxPerHour':100}
	 */
	public final TableField<CacheconfigRediskeyRecord, String> JSON_EXTRAPARAMS = createField("json_extraparams", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "额外参数， 如{'maxPerHour':100}");

	/**
	 * The column <code>configDB.cacheconfig_rediskey.ttl</code>. 生存时间， 单位秒
	 */
	public final TableField<CacheconfigRediskeyRecord, Integer> TTL = createField("ttl", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "生存时间， 单位秒");

	/**
	 * The column <code>configDB.cacheconfig_rediskey.desc</code>. 备注， 包含json_extraparams的解释
	 */
	public final TableField<CacheconfigRediskeyRecord, String> DESC = createField("desc", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "备注， 包含json_extraparams的解释");

	/**
	 * The column <code>configDB.cacheconfig_rediskey.create_time</code>.
	 */
	public final TableField<CacheconfigRediskeyRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>configDB.cacheconfig_rediskey</code> table reference
	 */
	public CacheconfigRediskey() {
		this("cacheconfig_rediskey", null);
	}

	/**
	 * Create an aliased <code>configDB.cacheconfig_rediskey</code> table reference
	 */
	public CacheconfigRediskey(String alias) {
		this(alias, CACHECONFIG_REDISKEY);
	}

	private CacheconfigRediskey(String alias, Table<CacheconfigRediskeyRecord> aliased) {
		this(alias, aliased, null);
	}

	private CacheconfigRediskey(String alias, Table<CacheconfigRediskeyRecord> aliased, Field<?>[] parameters) {
		super(alias, Configdb.CONFIGDB, aliased, parameters, "redis缓存配置表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<CacheconfigRediskeyRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CACHECONFIG_REDISKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CacheconfigRediskeyRecord> getPrimaryKey() {
		return Keys.KEY_CACHECONFIG_REDISKEY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CacheconfigRediskeyRecord>> getKeys() {
		return Arrays.<UniqueKey<CacheconfigRediskeyRecord>>asList(Keys.KEY_CACHECONFIG_REDISKEY_PRIMARY, Keys.KEY_CACHECONFIG_REDISKEY_KEY_IDENTIFIER, Keys.KEY_CACHECONFIG_REDISKEY_PATTERN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CacheconfigRediskey as(String alias) {
		return new CacheconfigRediskey(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CacheconfigRediskey rename(String name) {
		return new CacheconfigRediskey(name, null);
	}
}
