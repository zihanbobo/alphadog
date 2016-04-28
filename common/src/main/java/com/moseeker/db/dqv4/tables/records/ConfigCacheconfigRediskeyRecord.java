/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables.records;


import com.moseeker.db.dqv4.tables.ConfigCacheconfigRediskey;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ConfigCacheconfigRediskeyRecord extends UpdatableRecordImpl<ConfigCacheconfigRediskeyRecord> implements Record9<Integer, Integer, String, Byte, String, String, Integer, String, Timestamp> {

	private static final long serialVersionUID = -454696136;

	/**
	 * Setter for <code>dqv4.config_cacheconfig_rediskey.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dqv4.config_cacheconfig_rediskey.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>dqv4.config_cacheconfig_rediskey.project_appid</code>. 项目id 0 基础服务
	 */
	public void setProjectAppid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dqv4.config_cacheconfig_rediskey.project_appid</code>. 项目id 0 基础服务
	 */
	public Integer getProjectAppid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>dqv4.config_cacheconfig_rediskey.key_identifier</code>. 标识符， 大写英文字母
	 */
	public void setKeyIdentifier(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>dqv4.config_cacheconfig_rediskey.key_identifier</code>. 标识符， 大写英文字母
	 */
	public String getKeyIdentifier() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>dqv4.config_cacheconfig_rediskey.type</code>. 缓存类型 1 data  2. session 3 log
	 */
	public void setType(Byte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>dqv4.config_cacheconfig_rediskey.type</code>. 缓存类型 1 data  2. session 3 log
	 */
	public Byte getType() {
		return (Byte) getValue(3);
	}

	/**
	 * Setter for <code>dqv4.config_cacheconfig_rediskey.pattern</code>. 格式， 形如 ip_limit_%s
	 */
	public void setPattern(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>dqv4.config_cacheconfig_rediskey.pattern</code>. 格式， 形如 ip_limit_%s
	 */
	public String getPattern() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>dqv4.config_cacheconfig_rediskey.json_extraparams</code>. 额外参数， 如{'maxPerHour':100}
	 */
	public void setJsonExtraparams(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>dqv4.config_cacheconfig_rediskey.json_extraparams</code>. 额外参数， 如{'maxPerHour':100}
	 */
	public String getJsonExtraparams() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>dqv4.config_cacheconfig_rediskey.ttl</code>. 生存时间， 单位秒
	 */
	public void setTtl(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>dqv4.config_cacheconfig_rediskey.ttl</code>. 生存时间， 单位秒
	 */
	public Integer getTtl() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>dqv4.config_cacheconfig_rediskey.desc</code>. 备注， 包含json_extraparams的解释
	 */
	public void setDesc(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>dqv4.config_cacheconfig_rediskey.desc</code>. 备注， 包含json_extraparams的解释
	 */
	public String getDesc() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>dqv4.config_cacheconfig_rediskey.create_time</code>.
	 */
	public void setCreateTime(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>dqv4.config_cacheconfig_rediskey.create_time</code>.
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, String, Byte, String, String, Integer, String, Timestamp> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, String, Byte, String, String, Integer, String, Timestamp> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY.PROJECT_APPID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY.KEY_IDENTIFIER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field4() {
		return ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY.PATTERN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY.JSON_EXTRAPARAMS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY.TTL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY.DESC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getProjectAppid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getKeyIdentifier();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value4() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPattern();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getJsonExtraparams();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getTtl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getDesc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigCacheconfigRediskeyRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigCacheconfigRediskeyRecord value2(Integer value) {
		setProjectAppid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigCacheconfigRediskeyRecord value3(String value) {
		setKeyIdentifier(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigCacheconfigRediskeyRecord value4(Byte value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigCacheconfigRediskeyRecord value5(String value) {
		setPattern(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigCacheconfigRediskeyRecord value6(String value) {
		setJsonExtraparams(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigCacheconfigRediskeyRecord value7(Integer value) {
		setTtl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigCacheconfigRediskeyRecord value8(String value) {
		setDesc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigCacheconfigRediskeyRecord value9(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigCacheconfigRediskeyRecord values(Integer value1, Integer value2, String value3, Byte value4, String value5, String value6, Integer value7, String value8, Timestamp value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ConfigCacheconfigRediskeyRecord
	 */
	public ConfigCacheconfigRediskeyRecord() {
		super(ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY);
	}

	/**
	 * Create a detached, initialised ConfigCacheconfigRediskeyRecord
	 */
	public ConfigCacheconfigRediskeyRecord(Integer id, Integer projectAppid, String keyIdentifier, Byte type, String pattern, String jsonExtraparams, Integer ttl, String desc, Timestamp createTime) {
		super(ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY);

		setValue(0, id);
		setValue(1, projectAppid);
		setValue(2, keyIdentifier);
		setValue(3, type);
		setValue(4, pattern);
		setValue(5, jsonExtraparams);
		setValue(6, ttl);
		setValue(7, desc);
		setValue(8, createTime);
	}
}
