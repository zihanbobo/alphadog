/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables;


import com.moseeker.baseorm.db.jobdb.Jobdb;
import com.moseeker.baseorm.db.jobdb.Keys;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPositionExtRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 职位信息扩展表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPositionExt extends TableImpl<JobPositionExtRecord> {

    private static final long serialVersionUID = -311836751;

    /**
     * The reference instance of <code>jobdb.job_position_ext</code>
     */
    public static final JobPositionExt JOB_POSITION_EXT = new JobPositionExt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobPositionExtRecord> getRecordType() {
        return JobPositionExtRecord.class;
    }

    /**
     * The column <code>jobdb.job_position_ext.pid</code>. job_position.id
     */
    public final TableField<JobPositionExtRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "job_position.id");

    /**
     * The column <code>jobdb.job_position_ext.job_custom_id</code>. job_custom.id
     */
    public final TableField<JobPositionExtRecord, Integer> JOB_CUSTOM_ID = createField("job_custom_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "job_custom.id");

    /**
     * The column <code>jobdb.job_position_ext.create_time</code>. 创建时间
     */
    public final TableField<JobPositionExtRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>jobdb.job_position_ext.update_time</code>. 修改时间
     */
    public final TableField<JobPositionExtRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>jobdb.job_position_ext.job_occupation_id</code>. jobdb.job_occupation.id
     */
    public final TableField<JobPositionExtRecord, Integer> JOB_OCCUPATION_ID = createField("job_occupation_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "jobdb.job_occupation.id");

    /**
     * The column <code>jobdb.job_position_ext.extra</code>. SuccessFactors对接
     */
    public final TableField<JobPositionExtRecord, String> EXTRA = createField("extra", org.jooq.impl.SQLDataType.VARCHAR.length(999).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "SuccessFactors对接");

    /**
     * The column <code>jobdb.job_position_ext.alipay_job_id</code>.
     */
    public final TableField<JobPositionExtRecord, Integer> ALIPAY_JOB_ID = createField("alipay_job_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>jobdb.job_position_ext.ext</code>. 暂定给龙湖使用，存职位额外数据
     */
    public final TableField<JobPositionExtRecord, String> EXT = createField("ext", org.jooq.impl.SQLDataType.VARCHAR.length(2000), this, "暂定给龙湖使用，存职位额外数据");

    /**
     * Create a <code>jobdb.job_position_ext</code> table reference
     */
    public JobPositionExt() {
        this("job_position_ext", null);
    }

    /**
     * Create an aliased <code>jobdb.job_position_ext</code> table reference
     */
    public JobPositionExt(String alias) {
        this(alias, JOB_POSITION_EXT);
    }

    private JobPositionExt(String alias, Table<JobPositionExtRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobPositionExt(String alias, Table<JobPositionExtRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "职位信息扩展表");
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
    public UniqueKey<JobPositionExtRecord> getPrimaryKey() {
        return Keys.KEY_JOB_POSITION_EXT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobPositionExtRecord>> getKeys() {
        return Arrays.<UniqueKey<JobPositionExtRecord>>asList(Keys.KEY_JOB_POSITION_EXT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPositionExt as(String alias) {
        return new JobPositionExt(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JobPositionExt rename(String name) {
        return new JobPositionExt(name, null);
    }
}
