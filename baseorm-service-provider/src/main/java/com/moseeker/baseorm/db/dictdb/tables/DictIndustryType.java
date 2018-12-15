/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables;


import com.moseeker.baseorm.db.dictdb.Dictdb;
import com.moseeker.baseorm.db.dictdb.Keys;
import com.moseeker.baseorm.db.dictdb.tables.records.DictIndustryTypeRecord;

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
 * 行业一级分类字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictIndustryType extends TableImpl<DictIndustryTypeRecord> {

    private static final long serialVersionUID = 1897604405;

    /**
     * The reference instance of <code>dictdb.dict_industry_type</code>
     */
    public static final DictIndustryType DICT_INDUSTRY_TYPE = new DictIndustryType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictIndustryTypeRecord> getRecordType() {
        return DictIndustryTypeRecord.class;
    }

    /**
     * The column <code>dictdb.dict_industry_type.code</code>. 字典code
     */
    public final TableField<DictIndustryTypeRecord, Integer> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "字典code");

    /**
     * The column <code>dictdb.dict_industry_type.name</code>. 字典name
     */
    public final TableField<DictIndustryTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "字典name");

    /**
     * The column <code>dictdb.dict_industry_type.company_img</code>. 行业背景图，公司背景
     */
    public final TableField<DictIndustryTypeRecord, String> COMPANY_IMG = createField("company_img", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "行业背景图，公司背景");

    /**
     * The column <code>dictdb.dict_industry_type.job_img</code>. 行业背景图，职位背景
     */
    public final TableField<DictIndustryTypeRecord, String> JOB_IMG = createField("job_img", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "行业背景图，职位背景");

    /**
     * The column <code>dictdb.dict_industry_type.team_img</code>. 行业背景图，团队背景
     */
    public final TableField<DictIndustryTypeRecord, String> TEAM_IMG = createField("team_img", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "行业背景图，团队背景");

    /**
     * The column <code>dictdb.dict_industry_type.pc_img</code>. 行业背景图，pc背景
     */
    public final TableField<DictIndustryTypeRecord, String> PC_IMG = createField("pc_img", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "行业背景图，pc背景");

    /**
     * Create a <code>dictdb.dict_industry_type</code> table reference
     */
    public DictIndustryType() {
        this("dict_industry_type", null);
    }

    /**
     * Create an aliased <code>dictdb.dict_industry_type</code> table reference
     */
    public DictIndustryType(String alias) {
        this(alias, DICT_INDUSTRY_TYPE);
    }

    private DictIndustryType(String alias, Table<DictIndustryTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictIndustryType(String alias, Table<DictIndustryTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "行业一级分类字典表");
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
    public UniqueKey<DictIndustryTypeRecord> getPrimaryKey() {
        return Keys.KEY_DICT_INDUSTRY_TYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictIndustryTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<DictIndustryTypeRecord>>asList(Keys.KEY_DICT_INDUSTRY_TYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictIndustryType as(String alias) {
        return new DictIndustryType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictIndustryType rename(String name) {
        return new DictIndustryType(name, null);
    }
}
