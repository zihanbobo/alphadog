/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.jobdb.tables;


import com.moseeker.db.jobdb.Jobdb;
import com.moseeker.db.jobdb.Keys;
import com.moseeker.db.jobdb.tables.records.JobApplicationConfRecord;

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
import org.jooq.types.UInteger;


/**
 * 部门申请配置表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationConf extends TableImpl<JobApplicationConfRecord> {

	private static final long serialVersionUID = -1135112639;

	/**
	 * The reference instance of <code>jobDB.job_application_conf</code>
	 */
	public static final JobApplicationConf JOB_APPLICATION_CONF = new JobApplicationConf();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JobApplicationConfRecord> getRecordType() {
		return JobApplicationConfRecord.class;
	}

	/**
	 * The column <code>jobDB.job_application_conf.id</code>.
	 */
	public final TableField<JobApplicationConfRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jobDB.job_application_conf.company_id</code>. company.id, 部门ID
	 */
	public final TableField<JobApplicationConfRecord, UInteger> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "company.id, 部门ID");

	/**
	 * The column <code>jobDB.job_application_conf.appnotice</code>. 简历投递反馈通知
	 */
	public final TableField<JobApplicationConfRecord, Integer> APPNOTICE = createField("appnotice", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "简历投递反馈通知");

	/**
	 * The column <code>jobDB.job_application_conf.appnotice_tpl</code>. 简历投递通知使用模板
	 */
	public final TableField<JobApplicationConfRecord, Integer> APPNOTICE_TPL = createField("appnotice_tpl", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "简历投递通知使用模板");

	/**
	 * The column <code>jobDB.job_application_conf.app_reply</code>. 申请提交成功回复信息
	 */
	public final TableField<JobApplicationConfRecord, String> APP_REPLY = createField("app_reply", org.jooq.impl.SQLDataType.VARCHAR.length(140).nullable(false).defaulted(true), this, "申请提交成功回复信息");

	/**
	 * The column <code>jobDB.job_application_conf.email_appnotice</code>. 0：需要，1：不需要
	 */
	public final TableField<JobApplicationConfRecord, Integer> EMAIL_APPNOTICE = createField("email_appnotice", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "0：需要，1：不需要");

	/**
	 * The column <code>jobDB.job_application_conf.email_appreply</code>. 申请邮箱回复内容html格式
	 */
	public final TableField<JobApplicationConfRecord, String> EMAIL_APPREPLY = createField("email_appreply", org.jooq.impl.SQLDataType.CLOB, this, "申请邮箱回复内容html格式");

	/**
	 * The column <code>jobDB.job_application_conf.sms_appnotice_id</code>. 短信通知ID
	 */
	public final TableField<JobApplicationConfRecord, Integer> SMS_APPNOTICE_ID = createField("sms_appnotice_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "短信通知ID");

	/**
	 * The column <code>jobDB.job_application_conf.sms_appnotice_prefix</code>. 短信通知职位前缀
	 */
	public final TableField<JobApplicationConfRecord, String> SMS_APPNOTICE_PREFIX = createField("sms_appnotice_prefix", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false).defaulted(true), this, "短信通知职位前缀");

	/**
	 * The column <code>jobDB.job_application_conf.sms_appnotice_signature</code>. 短信通知签名
	 */
	public final TableField<JobApplicationConfRecord, String> SMS_APPNOTICE_SIGNATURE = createField("sms_appnotice_signature", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false).defaulted(true), this, "短信通知签名");

	/**
	 * The column <code>jobDB.job_application_conf.sms_delay</code>. 短信通知延迟 单位： min
	 */
	public final TableField<JobApplicationConfRecord, Integer> SMS_DELAY = createField("sms_delay", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "短信通知延迟 单位： min");

	/**
	 * The column <code>jobDB.job_application_conf.forward_click_reward</code>. 转发点击奖励通知0:需要1:不需要
	 */
	public final TableField<JobApplicationConfRecord, Integer> FORWARD_CLICK_REWARD = createField("forward_click_reward", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "转发点击奖励通知0:需要1:不需要");

	/**
	 * The column <code>jobDB.job_application_conf.forward_click_reward_tpl</code>. 转发点击奖励通知模板
	 */
	public final TableField<JobApplicationConfRecord, Integer> FORWARD_CLICK_REWARD_TPL = createField("forward_click_reward_tpl", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "转发点击奖励通知模板");

	/**
	 * The column <code>jobDB.job_application_conf.forward_app_reward</code>. 转发申请奖励通知0:需要1:不需要
	 */
	public final TableField<JobApplicationConfRecord, Integer> FORWARD_APP_REWARD = createField("forward_app_reward", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "转发申请奖励通知0:需要1:不需要");

	/**
	 * The column <code>jobDB.job_application_conf.forward_app_reward_tpl</code>. 转发申请奖励通知模板
	 */
	public final TableField<JobApplicationConfRecord, Integer> FORWARD_APP_REWARD_TPL = createField("forward_app_reward_tpl", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "转发申请奖励通知模板");

	/**
	 * The column <code>jobDB.job_application_conf.email_resume_conf</code>. 0:允许使用email简历进行投递；1:不允许使用email简历投递
	 */
	public final TableField<JobApplicationConfRecord, Byte> EMAIL_RESUME_CONF = createField("email_resume_conf", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "0:允许使用email简历进行投递；1:不允许使用email简历投递");

	/**
	 * The column <code>jobDB.job_application_conf.create_time</code>.
	 */
	public final TableField<JobApplicationConfRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>jobDB.job_application_conf.update_time</code>.
	 */
	public final TableField<JobApplicationConfRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>jobDB.job_application_conf</code> table reference
	 */
	public JobApplicationConf() {
		this("job_application_conf", null);
	}

	/**
	 * Create an aliased <code>jobDB.job_application_conf</code> table reference
	 */
	public JobApplicationConf(String alias) {
		this(alias, JOB_APPLICATION_CONF);
	}

	private JobApplicationConf(String alias, Table<JobApplicationConfRecord> aliased) {
		this(alias, aliased, null);
	}

	private JobApplicationConf(String alias, Table<JobApplicationConfRecord> aliased, Field<?>[] parameters) {
		super(alias, Jobdb.JOBDB, aliased, parameters, "部门申请配置表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JobApplicationConfRecord, Integer> getIdentity() {
		return Keys.IDENTITY_JOB_APPLICATION_CONF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JobApplicationConfRecord> getPrimaryKey() {
		return Keys.KEY_JOB_APPLICATION_CONF_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JobApplicationConfRecord>> getKeys() {
		return Arrays.<UniqueKey<JobApplicationConfRecord>>asList(Keys.KEY_JOB_APPLICATION_CONF_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationConf as(String alias) {
		return new JobApplicationConf(alias, this);
	}

	/**
	 * Rename this table
	 */
	public JobApplicationConf rename(String name) {
		return new JobApplicationConf(name, null);
	}
}
