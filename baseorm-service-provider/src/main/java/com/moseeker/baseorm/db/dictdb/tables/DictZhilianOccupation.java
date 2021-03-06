/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.dictdb.tables;


import com.moseeker.baseorm.db.dictdb.Dictdb;
import com.moseeker.baseorm.db.dictdb.Keys;
import com.moseeker.baseorm.db.dictdb.tables.records.DictZhilianOccupationRecord;

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
 * 智联的职位表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictZhilianOccupation extends TableImpl<DictZhilianOccupationRecord> {

    private static final long serialVersionUID = -1795307007;

    /**
     * The reference instance of <code>dictdb.dict_zhilian_occupation</code>
     */
    public static final DictZhilianOccupation DICT_ZHILIAN_OCCUPATION = new DictZhilianOccupation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictZhilianOccupationRecord> getRecordType() {
        return DictZhilianOccupationRecord.class;
    }

    /**
     * The column <code>dictdb.dict_zhilian_occupation.CODE</code>. 职能id
     */
    public final TableField<DictZhilianOccupationRecord, Integer> CODE = createField("CODE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "职能id");

    /**
     * The column <code>dictdb.dict_zhilian_occupation.parent_id</code>. 父Id，上一级职能的ID
     */
    public final TableField<DictZhilianOccupationRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "父Id，上一级职能的ID");

    /**
     * The column <code>dictdb.dict_zhilian_occupation.NAME</code>. 职能名称
     */
    public final TableField<DictZhilianOccupationRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职能名称");

    /**
     * The column <code>dictdb.dict_zhilian_occupation.code_other</code>. 第三方职能id
     */
    public final TableField<DictZhilianOccupationRecord, String> CODE_OTHER = createField("code_other", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "第三方职能id");

    /**
     * The column <code>dictdb.dict_zhilian_occupation.LEVEL</code>. 职能级别 1是一级2是二级依次类推
     */
    public final TableField<DictZhilianOccupationRecord, Short> LEVEL = createField("LEVEL", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "职能级别 1是一级2是二级依次类推");

    /**
     * The column <code>dictdb.dict_zhilian_occupation.STATUS</code>. 只能状态 0 是有效 1是无效
     */
    public final TableField<DictZhilianOccupationRecord, Short> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "只能状态 0 是有效 1是无效");

    /**
     * The column <code>dictdb.dict_zhilian_occupation.createTime</code>. 创建时间
     */
    public final TableField<DictZhilianOccupationRecord, Timestamp> CREATETIME = createField("createTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * Create a <code>dictdb.dict_zhilian_occupation</code> table reference
     */
    public DictZhilianOccupation() {
        this("dict_zhilian_occupation", null);
    }

    /**
     * Create an aliased <code>dictdb.dict_zhilian_occupation</code> table reference
     */
    public DictZhilianOccupation(String alias) {
        this(alias, DICT_ZHILIAN_OCCUPATION);
    }

    private DictZhilianOccupation(String alias, Table<DictZhilianOccupationRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictZhilianOccupation(String alias, Table<DictZhilianOccupationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "智联的职位表");
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
    public Identity<DictZhilianOccupationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DICT_ZHILIAN_OCCUPATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictZhilianOccupationRecord> getPrimaryKey() {
        return Keys.KEY_DICT_ZHILIAN_OCCUPATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictZhilianOccupationRecord>> getKeys() {
        return Arrays.<UniqueKey<DictZhilianOccupationRecord>>asList(Keys.KEY_DICT_ZHILIAN_OCCUPATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictZhilianOccupation as(String alias) {
        return new DictZhilianOccupation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictZhilianOccupation rename(String name) {
        return new DictZhilianOccupation(name, null);
    }
}
