/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables;


import com.moseeker.baseorm.db.historydb.Historydb;
import com.moseeker.baseorm.db.historydb.Keys;
import com.moseeker.baseorm.db.historydb.tables.records.HistoryJobApplicationStatusBeisenRecord;

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
 * 申请状态记录（ats北森）
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryJobApplicationStatusBeisen extends TableImpl<HistoryJobApplicationStatusBeisenRecord> {

    private static final long serialVersionUID = 1803563797;

    /**
     * The reference instance of <code>historydb.history_job_application_status_beisen</code>
     */
    public static final HistoryJobApplicationStatusBeisen HISTORY_JOB_APPLICATION_STATUS_BEISEN = new HistoryJobApplicationStatusBeisen();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HistoryJobApplicationStatusBeisenRecord> getRecordType() {
        return HistoryJobApplicationStatusBeisenRecord.class;
    }

    /**
     * The column <code>historydb.history_job_application_status_beisen.id</code>.
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>historydb.history_job_application_status_beisen.company_id</code>. company.id, 部门ID
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "company.id, 部门ID");

    /**
     * The column <code>historydb.history_job_application_status_beisen.applier_mobile</code>. 关注吉利微信公众账号的申请人的手机号
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, Long> APPLIER_MOBILE = createField("applier_mobile", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "关注吉利微信公众账号的申请人的手机号");

    /**
     * The column <code>historydb.history_job_application_status_beisen.applier_name</code>. 申请人真实姓名
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, String> APPLIER_NAME = createField("applier_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "申请人真实姓名");

    /**
     * The column <code>historydb.history_job_application_status_beisen.jobnumber</code>. 对应beisen投递状态中JobName中的code, 并非对应hr_position中jobnumber
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, String> JOBNUMBER = createField("jobnumber", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "对应beisen投递状态中JobName中的code, 并非对应hr_position中jobnumber");

    /**
     * The column <code>historydb.history_job_application_status_beisen.jobtitle</code>. 对应beisen投递状态中Jobname中的value，对应hr_position中title
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, String> JOBTITLE = createField("jobtitle", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "对应beisen投递状态中Jobname中的value，对应hr_position中title");

    /**
     * The column <code>historydb.history_job_application_status_beisen.phasecode</code>. 对应beisen投递状态中PhaseCode中的code
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, Integer> PHASECODE = createField("phasecode", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "对应beisen投递状态中PhaseCode中的code");

    /**
     * The column <code>historydb.history_job_application_status_beisen.phasename</code>. 对应beisen投递状态中PhaseName中的value
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, String> PHASENAME = createField("phasename", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "对应beisen投递状态中PhaseName中的value");

    /**
     * The column <code>historydb.history_job_application_status_beisen.statuscode</code>. 对应beisen投递状态中StatusCode中的code
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, Integer> STATUSCODE = createField("statuscode", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "对应beisen投递状态中StatusCode中的code");

    /**
     * The column <code>historydb.history_job_application_status_beisen.statusname</code>. 对应beisen投递状态中StatusName中的value
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, String> STATUSNAME = createField("statusname", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "对应beisen投递状态中StatusName中的value");

    /**
     * The column <code>historydb.history_job_application_status_beisen.create_time</code>.
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>historydb.history_job_application_status_beisen.update_time</code>.
     */
    public final TableField<HistoryJobApplicationStatusBeisenRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>historydb.history_job_application_status_beisen</code> table reference
     */
    public HistoryJobApplicationStatusBeisen() {
        this("history_job_application_status_beisen", null);
    }

    /**
     * Create an aliased <code>historydb.history_job_application_status_beisen</code> table reference
     */
    public HistoryJobApplicationStatusBeisen(String alias) {
        this(alias, HISTORY_JOB_APPLICATION_STATUS_BEISEN);
    }

    private HistoryJobApplicationStatusBeisen(String alias, Table<HistoryJobApplicationStatusBeisenRecord> aliased) {
        this(alias, aliased, null);
    }

    private HistoryJobApplicationStatusBeisen(String alias, Table<HistoryJobApplicationStatusBeisenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "申请状态记录（ats北森）");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Historydb.HISTORYDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HistoryJobApplicationStatusBeisenRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HISTORY_JOB_APPLICATION_STATUS_BEISEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HistoryJobApplicationStatusBeisenRecord> getPrimaryKey() {
        return Keys.KEY_HISTORY_JOB_APPLICATION_STATUS_BEISEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HistoryJobApplicationStatusBeisenRecord>> getKeys() {
        return Arrays.<UniqueKey<HistoryJobApplicationStatusBeisenRecord>>asList(Keys.KEY_HISTORY_JOB_APPLICATION_STATUS_BEISEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryJobApplicationStatusBeisen as(String alias) {
        return new HistoryJobApplicationStatusBeisen(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HistoryJobApplicationStatusBeisen rename(String name) {
        return new HistoryJobApplicationStatusBeisen(name, null);
    }
}
