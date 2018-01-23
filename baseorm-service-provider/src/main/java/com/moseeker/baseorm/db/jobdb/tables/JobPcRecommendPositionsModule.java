/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables;


import com.moseeker.baseorm.db.jobdb.Jobdb;
import com.moseeker.baseorm.db.jobdb.Keys;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPcRecommendPositionsModuleRecord;

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
 * 推荐列表数据库设计
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobPcRecommendPositionsModule extends TableImpl<JobPcRecommendPositionsModuleRecord> {

    private static final long serialVersionUID = -243281223;

    /**
     * The reference instance of <code>jobdb.job_pc_recommend_positions_module</code>
     */
    public static final JobPcRecommendPositionsModule JOB_PC_RECOMMEND_POSITIONS_MODULE = new JobPcRecommendPositionsModule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobPcRecommendPositionsModuleRecord> getRecordType() {
        return JobPcRecommendPositionsModuleRecord.class;
    }

    /**
     * The column <code>jobdb.job_pc_recommend_positions_module.id</code>. 自增主键
     */
    public final TableField<JobPcRecommendPositionsModuleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "自增主键");

    /**
     * The column <code>jobdb.job_pc_recommend_positions_module.name</code>.
     */
    public final TableField<JobPcRecommendPositionsModuleRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>jobdb.job_pc_recommend_positions_module.status</code>. 是否可用：1：可用，0：不可用
     */
    public final TableField<JobPcRecommendPositionsModuleRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否可用：1：可用，0：不可用");

    /**
     * The column <code>jobdb.job_pc_recommend_positions_module.create_time</code>. 创建时间
     */
    public final TableField<JobPcRecommendPositionsModuleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>jobdb.job_pc_recommend_positions_module.update_time</code>. 更新时间
     */
    public final TableField<JobPcRecommendPositionsModuleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>jobdb.job_pc_recommend_positions_module</code> table reference
     */
    public JobPcRecommendPositionsModule() {
        this("job_pc_recommend_positions_module", null);
    }

    /**
     * Create an aliased <code>jobdb.job_pc_recommend_positions_module</code> table reference
     */
    public JobPcRecommendPositionsModule(String alias) {
        this(alias, JOB_PC_RECOMMEND_POSITIONS_MODULE);
    }

    private JobPcRecommendPositionsModule(String alias, Table<JobPcRecommendPositionsModuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobPcRecommendPositionsModule(String alias, Table<JobPcRecommendPositionsModuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "推荐列表数据库设计");
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
    public Identity<JobPcRecommendPositionsModuleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_JOB_PC_RECOMMEND_POSITIONS_MODULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JobPcRecommendPositionsModuleRecord> getPrimaryKey() {
        return Keys.KEY_JOB_PC_RECOMMEND_POSITIONS_MODULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobPcRecommendPositionsModuleRecord>> getKeys() {
        return Arrays.<UniqueKey<JobPcRecommendPositionsModuleRecord>>asList(Keys.KEY_JOB_PC_RECOMMEND_POSITIONS_MODULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPcRecommendPositionsModule as(String alias) {
        return new JobPcRecommendPositionsModule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JobPcRecommendPositionsModule rename(String name) {
        return new JobPcRecommendPositionsModule(name, null);
    }
}
