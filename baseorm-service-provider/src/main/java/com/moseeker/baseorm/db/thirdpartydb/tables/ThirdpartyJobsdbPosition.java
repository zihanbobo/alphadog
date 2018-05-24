/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables;


import com.moseeker.baseorm.db.thirdpartydb.Keys;
import com.moseeker.baseorm.db.thirdpartydb.Thirdpartydb;
import com.moseeker.baseorm.db.thirdpartydb.tables.records.ThirdpartyJobsdbPositionRecord;

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
 * JobsDB的第三方职位子表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThirdpartyJobsdbPosition extends TableImpl<ThirdpartyJobsdbPositionRecord> {

    private static final long serialVersionUID = -517805694;

    /**
     * The reference instance of <code>thirdpartydb.thirdparty_jobsdb_position</code>
     */
    public static final ThirdpartyJobsdbPosition THIRDPARTY_JOBSDB_POSITION = new ThirdpartyJobsdbPosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThirdpartyJobsdbPositionRecord> getRecordType() {
        return ThirdpartyJobsdbPositionRecord.class;
    }

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.id</code>. 主键
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主键");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.pid</code>. 第三方职位表ID，hrdb.hr_thid_party_position的id
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "第三方职位表ID，hrdb.hr_thid_party_position的id");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.summary1</code>. 总结1
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, String> SUMMARY1 = createField("summary1", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "总结1");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.summary2</code>. 总结2
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, String> SUMMARY2 = createField("summary2", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "总结2");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.summary3</code>. 总结3
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, String> SUMMARY3 = createField("summary3", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "总结3");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.occupation_ext1</code>. 额外职能1
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, String> OCCUPATION_EXT1 = createField("occupation_ext1", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "额外职能1");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.occupation_ext2</code>. 额外职能2
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, String> OCCUPATION_EXT2 = createField("occupation_ext2", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "额外职能2");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.child_address_id</code>. 子地址code
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, String> CHILD_ADDRESS_ID = createField("child_address_id", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "子地址code");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.child_address_name</code>. 子地址名称
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, String> CHILD_ADDRESS_NAME = createField("child_address_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "子地址名称");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.create_time</code>. 创建时间
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.update_time</code>. 更新时间
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.status</code>. 只能状态 0 是有效 1是无效
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "只能状态 0 是有效 1是无效");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.career_level</code>. jobsdb选填字段，Career level
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, Integer> CAREER_LEVEL = createField("career_level", org.jooq.impl.SQLDataType.INTEGER, this, "jobsdb选填字段，Career level");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.education_level</code>. jobsdb选填字段，Minimum education level
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, Integer> EDUCATION_LEVEL = createField("education_level", org.jooq.impl.SQLDataType.INTEGER, this, "jobsdb选填字段，Minimum education level");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.experience</code>. jobsdb选填字段，Minimum years of experience
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, Integer> EXPERIENCE = createField("experience", org.jooq.impl.SQLDataType.INTEGER, this, "jobsdb选填字段，Minimum years of experience");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.keyword</code>. jobsdb选填字段，keyword
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, String> KEYWORD = createField("keyword", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "jobsdb选填字段，keyword");

    /**
     * The column <code>thirdpartydb.thirdparty_jobsdb_position.salary_type</code>. 薪资类型，Monthly：1、Hourly：2
     */
    public final TableField<ThirdpartyJobsdbPositionRecord, Integer> SALARY_TYPE = createField("salary_type", org.jooq.impl.SQLDataType.INTEGER, this, "薪资类型，Monthly：1、Hourly：2");

    /**
     * Create a <code>thirdpartydb.thirdparty_jobsdb_position</code> table reference
     */
    public ThirdpartyJobsdbPosition() {
        this("thirdparty_jobsdb_position", null);
    }

    /**
     * Create an aliased <code>thirdpartydb.thirdparty_jobsdb_position</code> table reference
     */
    public ThirdpartyJobsdbPosition(String alias) {
        this(alias, THIRDPARTY_JOBSDB_POSITION);
    }

    private ThirdpartyJobsdbPosition(String alias, Table<ThirdpartyJobsdbPositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ThirdpartyJobsdbPosition(String alias, Table<ThirdpartyJobsdbPositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "JobsDB的第三方职位子表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Thirdpartydb.THIRDPARTYDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ThirdpartyJobsdbPositionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_THIRDPARTY_JOBSDB_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ThirdpartyJobsdbPositionRecord> getPrimaryKey() {
        return Keys.KEY_THIRDPARTY_JOBSDB_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ThirdpartyJobsdbPositionRecord>> getKeys() {
        return Arrays.<UniqueKey<ThirdpartyJobsdbPositionRecord>>asList(Keys.KEY_THIRDPARTY_JOBSDB_POSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyJobsdbPosition as(String alias) {
        return new ThirdpartyJobsdbPosition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ThirdpartyJobsdbPosition rename(String name) {
        return new ThirdpartyJobsdbPosition(name, null);
    }
}
