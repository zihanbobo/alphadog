/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables;


import com.moseeker.baseorm.db.dictdb.Dictdb;
import com.moseeker.baseorm.db.dictdb.Keys;
import com.moseeker.baseorm.db.dictdb.tables.records.DictJobsdbOccupationRecord;

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
 * JobsDB的职位职能表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictJobsdbOccupation extends TableImpl<DictJobsdbOccupationRecord> {

    private static final long serialVersionUID = -573073811;

    /**
     * The reference instance of <code>dictdb.dict_jobsdb_occupation</code>
     */
    public static final DictJobsdbOccupation DICT_JOBSDB_OCCUPATION = new DictJobsdbOccupation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictJobsdbOccupationRecord> getRecordType() {
        return DictJobsdbOccupationRecord.class;
    }

    /**
     * The column <code>dictdb.dict_jobsdb_occupation.code</code>. 职能id
     */
    public final TableField<DictJobsdbOccupationRecord, Integer> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "职能id");

    /**
     * The column <code>dictdb.dict_jobsdb_occupation.parent_id</code>. 父Id，上一级职能的ID
     */
    public final TableField<DictJobsdbOccupationRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "父Id，上一级职能的ID");

    /**
     * The column <code>dictdb.dict_jobsdb_occupation.name</code>. 职能名称
     */
    public final TableField<DictJobsdbOccupationRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职能名称");

    /**
     * The column <code>dictdb.dict_jobsdb_occupation.code_other</code>. 第三方职能id
     */
    public final TableField<DictJobsdbOccupationRecord, String> CODE_OTHER = createField("code_other", org.jooq.impl.SQLDataType.VARCHAR.length(10).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "第三方职能id");

    /**
     * The column <code>dictdb.dict_jobsdb_occupation.level</code>. 职能级别 1是一级2是二级依次类推
     */
    public final TableField<DictJobsdbOccupationRecord, Short> LEVEL = createField("level", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "职能级别 1是一级2是二级依次类推");

    /**
     * The column <code>dictdb.dict_jobsdb_occupation.status</code>. 只能状态 0 是有效 1是无效
     */
    public final TableField<DictJobsdbOccupationRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "只能状态 0 是有效 1是无效");

    /**
     * The column <code>dictdb.dict_jobsdb_occupation.create_time</code>. 创建时间
     */
    public final TableField<DictJobsdbOccupationRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * Create a <code>dictdb.dict_jobsdb_occupation</code> table reference
     */
    public DictJobsdbOccupation() {
        this("dict_jobsdb_occupation", null);
    }

    /**
     * Create an aliased <code>dictdb.dict_jobsdb_occupation</code> table reference
     */
    public DictJobsdbOccupation(String alias) {
        this(alias, DICT_JOBSDB_OCCUPATION);
    }

    private DictJobsdbOccupation(String alias, Table<DictJobsdbOccupationRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictJobsdbOccupation(String alias, Table<DictJobsdbOccupationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "JobsDB的职位职能表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dictdb.DICTDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictJobsdbOccupationRecord> getPrimaryKey() {
        return Keys.KEY_DICT_JOBSDB_OCCUPATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictJobsdbOccupationRecord>> getKeys() {
        return Arrays.<UniqueKey<DictJobsdbOccupationRecord>>asList(Keys.KEY_DICT_JOBSDB_OCCUPATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictJobsdbOccupation as(String alias) {
        return new DictJobsdbOccupation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictJobsdbOccupation rename(String name) {
        return new DictJobsdbOccupation(name, null);
    }
}
