/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.configdb.tables;


import com.moseeker.baseorm.db.configdb.Configdb;
import com.moseeker.baseorm.db.configdb.Keys;
import com.moseeker.baseorm.db.configdb.tables.records.ConfigCacheconfigRediskeyRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
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
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigCacheconfigRediskey extends TableImpl<ConfigCacheconfigRediskeyRecord> {

    private static final long serialVersionUID = -1611458752;

    /**
     * The reference instance of <code>configdb.config_cacheconfig_rediskey</code>
     */
    public static final ConfigCacheconfigRediskey CONFIG_CACHECONFIG_REDISKEY = new ConfigCacheconfigRediskey();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConfigCacheconfigRediskeyRecord> getRecordType() {
        return ConfigCacheconfigRediskeyRecord.class;
    }

    /**
     * The column <code>configdb.config_cacheconfig_rediskey.id</code>.
     */
    public final TableField<ConfigCacheconfigRediskeyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>configdb.config_cacheconfig_rediskey.project_appid</code>. 项目id 0 基础服务
     */
    public final TableField<ConfigCacheconfigRediskeyRecord, Integer> PROJECT_APPID = createField("project_appid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "项目id 0 基础服务");

    /**
     * The column <code>configdb.config_cacheconfig_rediskey.key_identifier</code>. 标识符， 大写英文字母
     */
    public final TableField<ConfigCacheconfigRediskeyRecord, String> KEY_IDENTIFIER = createField("key_identifier", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "标识符， 大写英文字母");

    /**
     * The column <code>configdb.config_cacheconfig_rediskey.type</code>. 缓存类型 1:data, 2:session, 3:log, 4:mq
     */
    public final TableField<ConfigCacheconfigRediskeyRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "缓存类型 1:data, 2:session, 3:log, 4:mq");

    /**
     * The column <code>configdb.config_cacheconfig_rediskey.pattern</code>. 格式， 形如 ip_limit_%s
     */
    public final TableField<ConfigCacheconfigRediskeyRecord, String> PATTERN = createField("pattern", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "格式， 形如 ip_limit_%s");

    /**
     * The column <code>configdb.config_cacheconfig_rediskey.json_extraparams</code>. 额外参数， 如{'maxPerHour':100}
     */
    public final TableField<ConfigCacheconfigRediskeyRecord, String> JSON_EXTRAPARAMS = createField("json_extraparams", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "额外参数， 如{'maxPerHour':100}");

    /**
     * The column <code>configdb.config_cacheconfig_rediskey.ttl</code>. 生存时间， 单位秒
     */
    public final TableField<ConfigCacheconfigRediskeyRecord, Integer> TTL = createField("ttl", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "生存时间， 单位秒");

    /**
     * The column <code>configdb.config_cacheconfig_rediskey.desc</code>. 备注， 包含json_extraparams的解释
     */
    public final TableField<ConfigCacheconfigRediskeyRecord, String> DESC = createField("desc", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "备注， 包含json_extraparams的解释");

    /**
     * The column <code>configdb.config_cacheconfig_rediskey.create_time</code>.
     */
    public final TableField<ConfigCacheconfigRediskeyRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>configdb.config_cacheconfig_rediskey</code> table reference
     */
    public ConfigCacheconfigRediskey() {
        this("config_cacheconfig_rediskey", null);
    }

    /**
     * Create an aliased <code>configdb.config_cacheconfig_rediskey</code> table reference
     */
    public ConfigCacheconfigRediskey(String alias) {
        this(alias, CONFIG_CACHECONFIG_REDISKEY);
    }

    private ConfigCacheconfigRediskey(String alias, Table<ConfigCacheconfigRediskeyRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConfigCacheconfigRediskey(String alias, Table<ConfigCacheconfigRediskeyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "redis缓存配置表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Configdb.CONFIGDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ConfigCacheconfigRediskeyRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONFIG_CACHECONFIG_REDISKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ConfigCacheconfigRediskeyRecord> getPrimaryKey() {
        return Keys.KEY_CONFIG_CACHECONFIG_REDISKEY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ConfigCacheconfigRediskeyRecord>> getKeys() {
        return Arrays.<UniqueKey<ConfigCacheconfigRediskeyRecord>>asList(Keys.KEY_CONFIG_CACHECONFIG_REDISKEY_PRIMARY, Keys.KEY_CONFIG_CACHECONFIG_REDISKEY_KEY_IDENTIFIER, Keys.KEY_CONFIG_CACHECONFIG_REDISKEY_PATTERN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigCacheconfigRediskey as(String alias) {
        return new ConfigCacheconfigRediskey(alias, this);
    }

    /**
     * Rename this table
     */
    public ConfigCacheconfigRediskey rename(String name) {
        return new ConfigCacheconfigRediskey(name, null);
    }
}