/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables;


import com.moseeker.db.dqv4.Dqv4;
import com.moseeker.db.dqv4.Keys;
import com.moseeker.db.dqv4.tables.records.ConfigAtsSourceRecord;

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
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigAtsSource extends TableImpl<ConfigAtsSourceRecord> {

	private static final long serialVersionUID = 844782735;

	/**
	 * The reference instance of <code>dqv4.config_ats_source</code>
	 */
	public static final ConfigAtsSource CONFIG_ATS_SOURCE = new ConfigAtsSource();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ConfigAtsSourceRecord> getRecordType() {
		return ConfigAtsSourceRecord.class;
	}

	/**
	 * The column <code>dqv4.config_ats_source.id</code>.
	 */
	public final TableField<ConfigAtsSourceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dqv4.config_ats_source.name</code>. Name
	 */
	public final TableField<ConfigAtsSourceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false).defaulted(true), this, "Name");

	/**
	 * The column <code>dqv4.config_ats_source.type</code>. 1:WSDL
	 */
	public final TableField<ConfigAtsSourceRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "1:WSDL");

	/**
	 * The column <code>dqv4.config_ats_source.url</code>. net url for webservice or other method
	 */
	public final TableField<ConfigAtsSourceRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaulted(true), this, "net url for webservice or other method");

	/**
	 * The column <code>dqv4.config_ats_source.fullname</code>.
	 */
	public final TableField<ConfigAtsSourceRecord, String> FULLNAME = createField("fullname", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>dqv4.config_ats_source.ftp_address</code>. 存放ftp文件
	 */
	public final TableField<ConfigAtsSourceRecord, String> FTP_ADDRESS = createField("ftp_address", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false), this, "存放ftp文件");

	/**
	 * The column <code>dqv4.config_ats_source.username</code>. ATS 用户名
	 */
	public final TableField<ConfigAtsSourceRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(50).defaulted(true), this, "ATS 用户名");

	/**
	 * The column <code>dqv4.config_ats_source.password</code>. ATS 密码
	 */
	public final TableField<ConfigAtsSourceRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(50).defaulted(true), this, "ATS 密码");

	/**
	 * The column <code>dqv4.config_ats_source.apikey</code>. ATS API KEY
	 */
	public final TableField<ConfigAtsSourceRecord, String> APIKEY = createField("apikey", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaulted(true), this, "ATS API KEY");

	/**
	 * The column <code>dqv4.config_ats_source.department_id</code>.
	 */
	public final TableField<ConfigAtsSourceRecord, Integer> DEPARTMENT_ID = createField("department_id", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");

	/**
	 * The column <code>dqv4.config_ats_source.kenexa_id</code>. kenexa的sender id
	 */
	public final TableField<ConfigAtsSourceRecord, String> KENEXA_ID = createField("kenexa_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).defaulted(true), this, "kenexa的sender id");

	/**
	 * The column <code>dqv4.config_ats_source.kenexa_cridential</code>. kenexa的sender cridential
	 */
	public final TableField<ConfigAtsSourceRecord, String> KENEXA_CRIDENTIAL = createField("kenexa_cridential", org.jooq.impl.SQLDataType.VARCHAR.length(32).defaulted(true), this, "kenexa的sender cridential");

	/**
	 * Create a <code>dqv4.config_ats_source</code> table reference
	 */
	public ConfigAtsSource() {
		this("config_ats_source", null);
	}

	/**
	 * Create an aliased <code>dqv4.config_ats_source</code> table reference
	 */
	public ConfigAtsSource(String alias) {
		this(alias, CONFIG_ATS_SOURCE);
	}

	private ConfigAtsSource(String alias, Table<ConfigAtsSourceRecord> aliased) {
		this(alias, aliased, null);
	}

	private ConfigAtsSource(String alias, Table<ConfigAtsSourceRecord> aliased, Field<?>[] parameters) {
		super(alias, Dqv4.DQV4, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ConfigAtsSourceRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CONFIG_ATS_SOURCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ConfigAtsSourceRecord> getPrimaryKey() {
		return Keys.KEY_CONFIG_ATS_SOURCE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ConfigAtsSourceRecord>> getKeys() {
		return Arrays.<UniqueKey<ConfigAtsSourceRecord>>asList(Keys.KEY_CONFIG_ATS_SOURCE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConfigAtsSource as(String alias) {
		return new ConfigAtsSource(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ConfigAtsSource rename(String name) {
		return new ConfigAtsSource(name, null);
	}
}
