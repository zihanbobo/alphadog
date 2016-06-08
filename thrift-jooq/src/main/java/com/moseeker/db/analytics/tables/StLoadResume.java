/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.analytics.tables;


import com.moseeker.db.analytics.Analytics;
import com.moseeker.db.analytics.Keys;
import com.moseeker.db.analytics.tables.records.StLoadResumeRecord;

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
public class StLoadResume extends TableImpl<StLoadResumeRecord> {

	private static final long serialVersionUID = -887404937;

	/**
	 * The reference instance of <code>analytics.st_load_resume</code>
	 */
	public static final StLoadResume ST_LOAD_RESUME = new StLoadResume();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<StLoadResumeRecord> getRecordType() {
		return StLoadResumeRecord.class;
	}

	/**
	 * The column <code>analytics.st_load_resume.id</code>.
	 */
	public final TableField<StLoadResumeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>analytics.st_load_resume.create_time</code>. 日志打出时间
	 */
	public final TableField<StLoadResumeRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "日志打出时间");

	/**
	 * The column <code>analytics.st_load_resume.is_success</code>. 是否导入成功
	 */
	public final TableField<StLoadResumeRecord, Byte> IS_SUCCESS = createField("is_success", org.jooq.impl.SQLDataType.TINYINT, this, "是否导入成功");

	/**
	 * The column <code>analytics.st_load_resume.way</code>. 简历来源种类：
前程无忧（51job） : “2" 
猎聘网 : “3” 
智联招聘: “4”
	 */
	public final TableField<StLoadResumeRecord, Integer> WAY = createField("way", org.jooq.impl.SQLDataType.INTEGER, this, "简历来源种类：\n前程无忧（51job） : “2\" \n猎聘网 : “3” \n智联招聘: “4”");

	/**
	 * The column <code>analytics.st_load_resume.pv</code>.
	 */
	public final TableField<StLoadResumeRecord, Integer> PV = createField("pv", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>analytics.st_load_resume.uv</code>.
	 */
	public final TableField<StLoadResumeRecord, Integer> UV = createField("uv", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>analytics.st_load_resume.top</code>. 请求最高uid
	 */
	public final TableField<StLoadResumeRecord, String> TOP = createField("top", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "请求最高uid");

	/**
	 * The column <code>analytics.st_load_resume.freq</code>. 请求最高频次
	 */
	public final TableField<StLoadResumeRecord, Integer> FREQ = createField("freq", org.jooq.impl.SQLDataType.INTEGER, this, "请求最高频次");

	/**
	 * The column <code>analytics.st_load_resume.is_authorized</code>. 认证是否成功
	 */
	public final TableField<StLoadResumeRecord, Byte> IS_AUTHORIZED = createField("is_authorized", org.jooq.impl.SQLDataType.TINYINT, this, "认证是否成功");

	/**
	 * Create a <code>analytics.st_load_resume</code> table reference
	 */
	public StLoadResume() {
		this("st_load_resume", null);
	}

	/**
	 * Create an aliased <code>analytics.st_load_resume</code> table reference
	 */
	public StLoadResume(String alias) {
		this(alias, ST_LOAD_RESUME);
	}

	private StLoadResume(String alias, Table<StLoadResumeRecord> aliased) {
		this(alias, aliased, null);
	}

	private StLoadResume(String alias, Table<StLoadResumeRecord> aliased, Field<?>[] parameters) {
		super(alias, Analytics.ANALYTICS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<StLoadResumeRecord, Integer> getIdentity() {
		return Keys.IDENTITY_ST_LOAD_RESUME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<StLoadResumeRecord> getPrimaryKey() {
		return Keys.KEY_ST_LOAD_RESUME_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<StLoadResumeRecord>> getKeys() {
		return Arrays.<UniqueKey<StLoadResumeRecord>>asList(Keys.KEY_ST_LOAD_RESUME_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StLoadResume as(String alias) {
		return new StLoadResume(alias, this);
	}

	/**
	 * Rename this table
	 */
	public StLoadResume rename(String name) {
		return new StLoadResume(name, null);
	}
}