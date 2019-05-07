/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables;


import com.moseeker.baseorm.db.dictdb.Dictdb;
import com.moseeker.baseorm.db.dictdb.Keys;
import com.moseeker.baseorm.db.dictdb.tables.records.DictConstantCopy1Record;

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
public class DictConstantCopy1 extends TableImpl<DictConstantCopy1Record> {

    private static final long serialVersionUID = 947656153;

    /**
     * The reference instance of <code>dictdb.dict_constant_copy1</code>
     */
    public static final DictConstantCopy1 DICT_CONSTANT_COPY1 = new DictConstantCopy1();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictConstantCopy1Record> getRecordType() {
        return DictConstantCopy1Record.class;
    }

    /**
     * The column <code>dictdb.dict_constant_copy1.id</code>. 主key
     */
    public final TableField<DictConstantCopy1Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主key");

    /**
     * The column <code>dictdb.dict_constant_copy1.code</code>. 字典code
     */
    public final TableField<DictConstantCopy1Record, Integer> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "字典code");

    /**
     * The column <code>dictdb.dict_constant_copy1.name</code>. 字典name
     */
    public final TableField<DictConstantCopy1Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "字典name");

    /**
     * The column <code>dictdb.dict_constant_copy1.priority</code>. 优先级
     */
    public final TableField<DictConstantCopy1Record, Byte> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "优先级");

    /**
     * The column <code>dictdb.dict_constant_copy1.parent_code</code>. 父级字典code
     */
    public final TableField<DictConstantCopy1Record, Integer> PARENT_CODE = createField("parent_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "父级字典code");

    /**
     * The column <code>dictdb.dict_constant_copy1.create_time</code>.
     */
    public final TableField<DictConstantCopy1Record, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>dictdb.dict_constant_copy1.update_time</code>.
     */
    public final TableField<DictConstantCopy1Record, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>dictdb.dict_constant_copy1</code> table reference
     */
    public DictConstantCopy1() {
        this("dict_constant_copy1", null);
    }

    /**
     * Create an aliased <code>dictdb.dict_constant_copy1</code> table reference
     */
    public DictConstantCopy1(String alias) {
        this(alias, DICT_CONSTANT_COPY1);
    }

    private DictConstantCopy1(String alias, Table<DictConstantCopy1Record> aliased) {
        this(alias, aliased, null);
    }

    private DictConstantCopy1(String alias, Table<DictConstantCopy1Record> aliased, Field<?>[] parameters) {
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
    public Identity<DictConstantCopy1Record, Integer> getIdentity() {
        return Keys.IDENTITY_DICT_CONSTANT_COPY1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictConstantCopy1Record> getPrimaryKey() {
        return Keys.KEY_DICT_CONSTANT_COPY1_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictConstantCopy1Record>> getKeys() {
        return Arrays.<UniqueKey<DictConstantCopy1Record>>asList(Keys.KEY_DICT_CONSTANT_COPY1_PRIMARY, Keys.KEY_DICT_CONSTANT_COPY1_DICT_CONSTANT_TYPE_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictConstantCopy1 as(String alias) {
        return new DictConstantCopy1(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictConstantCopy1 rename(String name) {
        return new DictConstantCopy1(name, null);
    }
}
