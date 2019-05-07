/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables;


import com.moseeker.baseorm.db.dictdb.Dictdb;
import com.moseeker.baseorm.db.dictdb.Keys;
import com.moseeker.baseorm.db.dictdb.tables.records.DictIndustryRecord;

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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictIndustry extends TableImpl<DictIndustryRecord> {

    private static final long serialVersionUID = 1700352340;

    /**
     * The reference instance of <code>dictdb.dict_industry</code>
     */
    public static final DictIndustry DICT_INDUSTRY = new DictIndustry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictIndustryRecord> getRecordType() {
        return DictIndustryRecord.class;
    }

    /**
     * The column <code>dictdb.dict_industry.code</code>. 字典code
     */
    public final TableField<DictIndustryRecord, Integer> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "字典code");

    /**
     * The column <code>dictdb.dict_industry.name</code>. 字典name
     */
    public final TableField<DictIndustryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "字典name");

    /**
     * The column <code>dictdb.dict_industry.ename</code>.
     */
    public final TableField<DictIndustryRecord, String> ENAME = createField("ename", org.jooq.impl.SQLDataType.VARCHAR.length(99), this, "");

    /**
     * The column <code>dictdb.dict_industry.type</code>. 字典分类code
     */
    public final TableField<DictIndustryRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "字典分类code");

    /**
     * Create a <code>dictdb.dict_industry</code> table reference
     */
    public DictIndustry() {
        this("dict_industry", null);
    }

    /**
     * Create an aliased <code>dictdb.dict_industry</code> table reference
     */
    public DictIndustry(String alias) {
        this(alias, DICT_INDUSTRY);
    }

    private DictIndustry(String alias, Table<DictIndustryRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictIndustry(String alias, Table<DictIndustryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public UniqueKey<DictIndustryRecord> getPrimaryKey() {
        return Keys.KEY_DICT_INDUSTRY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictIndustryRecord>> getKeys() {
        return Arrays.<UniqueKey<DictIndustryRecord>>asList(Keys.KEY_DICT_INDUSTRY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictIndustry as(String alias) {
        return new DictIndustry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictIndustry rename(String name) {
        return new DictIndustry(name, null);
    }
}
