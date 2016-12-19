/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.jobdb.tables;


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

import com.moseeker.baseorm.db.jobdb.Jobdb;
import com.moseeker.baseorm.db.jobdb.Keys;
import com.moseeker.baseorm.db.jobdb.tables.records.JobApplicationStatusBeisenRecord;


/**
 * 申请状态记录（ats北森）
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobApplicationStatusBeisen extends TableImpl<JobApplicationStatusBeisenRecord> {

	private static final long serialVersionUID = -1533398920;

	/**
	 * The reference instance of <code>jobdb.job_application_status_beisen</code>
	 */
	public static final JobApplicationStatusBeisen JOB_APPLICATION_STATUS_BEISEN = new JobApplicationStatusBeisen();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JobApplicationStatusBeisenRecord> getRecordType() {
		return JobApplicationStatusBeisenRecord.class;
	}

	/**
	 * The column <code>jobdb.job_application_status_beisen.id</code>.
	 */
	public final TableField<JobApplicationStatusBeisenRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jobdb.job_application_status_beisen.company_id</code>. company.id, 部门ID
	 */
	public final TableField<JobApplicationStatusBeisenRecord, UInteger> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "company.id, 部门ID");

	/**
	 * The column <code>jobdb.job_application_status_beisen.applier_mobile</code>. 关注吉利微信公众账号的申请人的手机号
	 */
	public final TableField<JobApplicationStatusBeisenRecord, Long> APPLIER_MOBILE = createField("applier_mobile", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "关注吉利微信公众账号的申请人的手机号");

	/**
	 * The column <code>jobdb.job_application_status_beisen.applier_name</code>. 申请人真实姓名
	 */
	public final TableField<JobApplicationStatusBeisenRecord, String> APPLIER_NAME = createField("applier_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "申请人真实姓名");

	/**
	 * The column <code>jobdb.job_application_status_beisen.jobnumber</code>. 对应beisen投递状态中JobName中的code, 并非对应hr_position中jobnumber
	 */
	public final TableField<JobApplicationStatusBeisenRecord, String> JOBNUMBER = createField("jobnumber", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false).defaulted(true), this, "对应beisen投递状态中JobName中的code, 并非对应hr_position中jobnumber");

	/**
	 * The column <code>jobdb.job_application_status_beisen.jobtitle</code>. 对应beisen投递状态中Jobname中的value，对应hr_position中title
	 */
	public final TableField<JobApplicationStatusBeisenRecord, String> JOBTITLE = createField("jobtitle", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaulted(true), this, "对应beisen投递状态中Jobname中的value，对应hr_position中title");

	/**
	 * The column <code>jobdb.job_application_status_beisen.phasecode</code>. 对应beisen投递状态中PhaseCode中的code
	 */
	public final TableField<JobApplicationStatusBeisenRecord, Integer> PHASECODE = createField("phasecode", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "对应beisen投递状态中PhaseCode中的code");

	/**
	 * The column <code>jobdb.job_application_status_beisen.phasename</code>. 对应beisen投递状态中PhaseName中的value
	 */
	public final TableField<JobApplicationStatusBeisenRecord, String> PHASENAME = createField("phasename", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaulted(true), this, "对应beisen投递状态中PhaseName中的value");

	/**
	 * The column <code>jobdb.job_application_status_beisen.statuscode</code>. 对应beisen投递状态中StatusCode中的code
	 */
	public final TableField<JobApplicationStatusBeisenRecord, Integer> STATUSCODE = createField("statuscode", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "对应beisen投递状态中StatusCode中的code");

	/**
	 * The column <code>jobdb.job_application_status_beisen.statusname</code>. 对应beisen投递状态中StatusName中的value
	 */
	public final TableField<JobApplicationStatusBeisenRecord, String> STATUSNAME = createField("statusname", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaulted(true), this, "对应beisen投递状态中StatusName中的value");

	/**
	 * The column <code>jobdb.job_application_status_beisen.create_time</code>.
	 */
	public final TableField<JobApplicationStatusBeisenRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>jobdb.job_application_status_beisen.update_time</code>.
	 */
	public final TableField<JobApplicationStatusBeisenRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>jobdb.job_application_status_beisen</code> table reference
	 */
	public JobApplicationStatusBeisen() {
		this("job_application_status_beisen", null);
	}

	/**
	 * Create an aliased <code>jobdb.job_application_status_beisen</code> table reference
	 */
	public JobApplicationStatusBeisen(String alias) {
		this(alias, JOB_APPLICATION_STATUS_BEISEN);
	}

	private JobApplicationStatusBeisen(String alias, Table<JobApplicationStatusBeisenRecord> aliased) {
		this(alias, aliased, null);
	}

	private JobApplicationStatusBeisen(String alias, Table<JobApplicationStatusBeisenRecord> aliased, Field<?>[] parameters) {
		super(alias, Jobdb.JOBDB, aliased, parameters, "申请状态记录（ats北森）");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JobApplicationStatusBeisenRecord, Integer> getIdentity() {
		return Keys.IDENTITY_JOB_APPLICATION_STATUS_BEISEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JobApplicationStatusBeisenRecord> getPrimaryKey() {
		return Keys.KEY_JOB_APPLICATION_STATUS_BEISEN_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JobApplicationStatusBeisenRecord>> getKeys() {
		return Arrays.<UniqueKey<JobApplicationStatusBeisenRecord>>asList(Keys.KEY_JOB_APPLICATION_STATUS_BEISEN_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JobApplicationStatusBeisen as(String alias) {
		return new JobApplicationStatusBeisen(alias, this);
	}

	/**
	 * Rename this table
	 */
	public JobApplicationStatusBeisen rename(String name) {
		return new JobApplicationStatusBeisen(name, null);
	}
}
