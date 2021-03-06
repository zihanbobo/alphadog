/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables;


import com.moseeker.baseorm.db.dictdb.Dictdb;
import com.moseeker.baseorm.db.dictdb.Keys;
import com.moseeker.baseorm.db.dictdb.tables.records.DictMajorRecord;

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
 * 专业字典表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictMajor extends TableImpl<DictMajorRecord> {

    private static final long serialVersionUID = 349124096;

    /**
     * The reference instance of <code>dictdb.dict_major</code>
     */
    public static final DictMajor DICT_MAJOR = new DictMajor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictMajorRecord> getRecordType() {
        return DictMajorRecord.class;
    }

    /**
     * The column <code>dictdb.dict_major.code</code>. 字典code
     */
    public final TableField<DictMajorRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.CHAR.length(6).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "字典code");

    /**
     * The column <code>dictdb.dict_major.name</code>. 字典name
     */
    public final TableField<DictMajorRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "字典name");

    /**
     * The column <code>dictdb.dict_major.level</code>. 字典level
     */
    public final TableField<DictMajorRecord, Byte> LEVEL = createField("level", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "字典level");

    /**
     * Create a <code>dictdb.dict_major</code> table reference
     */
    public DictMajor() {
        this("dict_major", null);
    }

    /**
     * Create an aliased <code>dictdb.dict_major</code> table reference
     */
    public DictMajor(String alias) {
        this(alias, DICT_MAJOR);
    }

    private DictMajor(String alias, Table<DictMajorRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictMajor(String alias, Table<DictMajorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "专业字典表");
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
    public List<UniqueKey<DictMajorRecord>> getKeys() {
        return Arrays.<UniqueKey<DictMajorRecord>>asList(Keys.KEY_DICT_MAJOR_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictMajor as(String alias) {
        return new DictMajor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictMajor rename(String name) {
        return new DictMajor(name, null);
    }
}
