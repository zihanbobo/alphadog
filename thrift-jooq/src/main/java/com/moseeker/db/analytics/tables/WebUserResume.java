/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.analytics.tables;


import com.moseeker.db.analytics.Analytics;
import com.moseeker.db.analytics.Keys;
import com.moseeker.db.analytics.tables.records.WebUserResumeRecord;

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
public class WebUserResume extends TableImpl<WebUserResumeRecord> {

	private static final long serialVersionUID = 1315005663;

	/**
	 * The reference instance of <code>analytics.web_user_resume</code>
	 */
	public static final WebUserResume WEB_USER_RESUME = new WebUserResume();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<WebUserResumeRecord> getRecordType() {
		return WebUserResumeRecord.class;
	}

	/**
	 * The column <code>analytics.web_user_resume.id</code>.
	 */
	public final TableField<WebUserResumeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>analytics.web_user_resume.create_time</code>.
	 */
	public final TableField<WebUserResumeRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>analytics.web_user_resume.openid</code>.
	 */
	public final TableField<WebUserResumeRecord, Integer> OPENID = createField("openid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>analytics.web_user_resume.user</code>.
	 */
	public final TableField<WebUserResumeRecord, Integer> USER = createField("user", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>analytics.web_user_resume.resume</code>.
	 */
	public final TableField<WebUserResumeRecord, Integer> RESUME = createField("resume", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>analytics.web_user_resume.phone</code>.
	 */
	public final TableField<WebUserResumeRecord, Integer> PHONE = createField("phone", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>analytics.web_user_resume.has_phone</code>. 是否有手机
	 */
	public final TableField<WebUserResumeRecord, Integer> HAS_PHONE = createField("has_phone", org.jooq.impl.SQLDataType.INTEGER, this, "是否有手机");

	/**
	 * Create a <code>analytics.web_user_resume</code> table reference
	 */
	public WebUserResume() {
		this("web_user_resume", null);
	}

	/**
	 * Create an aliased <code>analytics.web_user_resume</code> table reference
	 */
	public WebUserResume(String alias) {
		this(alias, WEB_USER_RESUME);
	}

	private WebUserResume(String alias, Table<WebUserResumeRecord> aliased) {
		this(alias, aliased, null);
	}

	private WebUserResume(String alias, Table<WebUserResumeRecord> aliased, Field<?>[] parameters) {
		super(alias, Analytics.ANALYTICS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<WebUserResumeRecord, Integer> getIdentity() {
		return Keys.IDENTITY_WEB_USER_RESUME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<WebUserResumeRecord> getPrimaryKey() {
		return Keys.KEY_WEB_USER_RESUME_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<WebUserResumeRecord>> getKeys() {
		return Arrays.<UniqueKey<WebUserResumeRecord>>asList(Keys.KEY_WEB_USER_RESUME_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebUserResume as(String alias) {
		return new WebUserResume(alias, this);
	}

	/**
	 * Rename this table
	 */
	public WebUserResume rename(String name) {
		return new WebUserResume(name, null);
	}
}
