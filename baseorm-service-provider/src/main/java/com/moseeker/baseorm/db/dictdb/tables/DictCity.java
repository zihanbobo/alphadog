/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables;


import com.moseeker.baseorm.db.dictdb.Dictdb;
import com.moseeker.baseorm.db.dictdb.Keys;
import com.moseeker.baseorm.db.dictdb.tables.records.DictCityRecord;

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
 * 城市字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictCity extends TableImpl<DictCityRecord> {

    private static final long serialVersionUID = -1623441569;

    /**
     * The reference instance of <code>dictdb.dict_city</code>
     */
    public static final DictCity DICT_CITY = new DictCity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictCityRecord> getRecordType() {
        return DictCityRecord.class;
    }

    /**
     * The column <code>dictdb.dict_city.code</code>. 字典code
     */
    public final TableField<DictCityRecord, Integer> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("000000", org.jooq.impl.SQLDataType.INTEGER)), this, "字典code");

    /**
     * The column <code>dictdb.dict_city.name</code>. 字典name
     */
    public final TableField<DictCityRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "字典name");

    /**
     * The column <code>dictdb.dict_city.level</code>. 字典level
     */
    public final TableField<DictCityRecord, Byte> LEVEL = createField("level", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "字典level");

    /**
     * The column <code>dictdb.dict_city.hot_city</code>. 热门城市 0:否 1：是
     */
    public final TableField<DictCityRecord, Byte> HOT_CITY = createField("hot_city", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "热门城市 0:否 1：是");

    /**
     * The column <code>dictdb.dict_city.ename</code>. 英文名称
     */
    public final TableField<DictCityRecord, String> ENAME = createField("ename", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "英文名称");

    /**
     * The column <code>dictdb.dict_city.is_using</code>. 正在使用 0:没在用 1:在使用
     */
    public final TableField<DictCityRecord, Byte> IS_USING = createField("is_using", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "正在使用 0:没在用 1:在使用");

    /**
     * Create a <code>dictdb.dict_city</code> table reference
     */
    public DictCity() {
        this("dict_city", null);
    }

    /**
     * Create an aliased <code>dictdb.dict_city</code> table reference
     */
    public DictCity(String alias) {
        this(alias, DICT_CITY);
    }

    private DictCity(String alias, Table<DictCityRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictCity(String alias, Table<DictCityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "城市字典表");
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
    public UniqueKey<DictCityRecord> getPrimaryKey() {
        return Keys.KEY_DICT_CITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictCityRecord>> getKeys() {
        return Arrays.<UniqueKey<DictCityRecord>>asList(Keys.KEY_DICT_CITY_PRIMARY, Keys.KEY_DICT_CITY_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCity as(String alias) {
        return new DictCity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictCity rename(String name) {
        return new DictCity(name, null);
    }
}
