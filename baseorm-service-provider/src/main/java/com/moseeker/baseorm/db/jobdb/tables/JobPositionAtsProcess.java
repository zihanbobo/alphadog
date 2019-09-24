/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables;


import com.moseeker.baseorm.db.jobdb.Jobdb;
import com.moseeker.baseorm.db.jobdb.Keys;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPositionAtsProcessRecord;

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
 * 职位招聘流程绑定表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionAtsProcess extends TableImpl<JobPositionAtsProcessRecord> {

    private static final long serialVersionUID = -721043356;

    /**
     * The reference instance of <code>jobdb.job_position_ats_process</code>
     */
    public static final JobPositionAtsProcess JOB_POSITION_ATS_PROCESS = new JobPositionAtsProcess();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobPositionAtsProcessRecord> getRecordType() {
        return JobPositionAtsProcessRecord.class;
    }

    /**
     * The column <code>jobdb.job_position_ats_process.id</code>.
     */
    public final TableField<JobPositionAtsProcessRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jobdb.job_position_ats_process.pid</code>. 职位id  job_application.id
     */
    public final TableField<JobPositionAtsProcessRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "职位id  job_application.id");

    /**
     * The column <code>jobdb.job_position_ats_process.process_id</code>. hrdb.hr_ats_process_company.id
     */
    public final TableField<JobPositionAtsProcessRecord, Integer> PROCESS_ID = createField("process_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "hrdb.hr_ats_process_company.id");

    /**
     * The column <code>jobdb.job_position_ats_process.create_time</code>. 创建时间
     */
    public final TableField<JobPositionAtsProcessRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>jobdb.job_position_ats_process.update_time</code>.
     */
    public final TableField<JobPositionAtsProcessRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>jobdb.job_position_ats_process</code> table reference
     */
    public JobPositionAtsProcess() {
        this("job_position_ats_process", null);
    }

    /**
     * Create an aliased <code>jobdb.job_position_ats_process</code> table reference
     */
    public JobPositionAtsProcess(String alias) {
        this(alias, JOB_POSITION_ATS_PROCESS);
    }

    private JobPositionAtsProcess(String alias, Table<JobPositionAtsProcessRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobPositionAtsProcess(String alias, Table<JobPositionAtsProcessRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "职位招聘流程绑定表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jobdb.JOBDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JobPositionAtsProcessRecord, Integer> getIdentity() {
        return Keys.IDENTITY_JOB_POSITION_ATS_PROCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JobPositionAtsProcessRecord> getPrimaryKey() {
        return Keys.KEY_JOB_POSITION_ATS_PROCESS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobPositionAtsProcessRecord>> getKeys() {
        return Arrays.<UniqueKey<JobPositionAtsProcessRecord>>asList(Keys.KEY_JOB_POSITION_ATS_PROCESS_PRIMARY, Keys.KEY_JOB_POSITION_ATS_PROCESS_JOB_POSITION_ATS_PROCESS_PID_PROCESS_ID_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionAtsProcess as(String alias) {
        return new JobPositionAtsProcess(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JobPositionAtsProcess rename(String name) {
        return new JobPositionAtsProcess(name, null);
    }
}
