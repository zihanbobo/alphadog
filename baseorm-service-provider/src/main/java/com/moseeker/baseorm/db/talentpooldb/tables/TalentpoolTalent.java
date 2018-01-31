/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables;


import com.moseeker.baseorm.db.talentpooldb.Keys;
import com.moseeker.baseorm.db.talentpooldb.Talentpooldb;
import com.moseeker.baseorm.db.talentpooldb.tables.records.TalentpoolTalentRecord;

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
 * 人才库人才表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolTalent extends TableImpl<TalentpoolTalentRecord> {

    private static final long serialVersionUID = -1300264678;

    /**
     * The reference instance of <code>talentpooldb.talentpool_talent</code>
     */
    public static final TalentpoolTalent TALENTPOOL_TALENT = new TalentpoolTalent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TalentpoolTalentRecord> getRecordType() {
        return TalentpoolTalentRecord.class;
    }

    /**
     * The column <code>talentpooldb.talentpool_talent.user_id</code>. 用户编号
     */
    public final TableField<TalentpoolTalentRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户编号");

    /**
     * The column <code>talentpooldb.talentpool_talent.company_id</code>. 公司编号
     */
    public final TableField<TalentpoolTalentRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "公司编号");

    /**
     * The column <code>talentpooldb.talentpool_talent.collect_num</code>. 收藏次数
     */
    public final TableField<TalentpoolTalentRecord, Integer> COLLECT_NUM = createField("collect_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "收藏次数");

    /**
     * The column <code>talentpooldb.talentpool_talent.public_num</code>. 公开次数
     */
    public final TableField<TalentpoolTalentRecord, Integer> PUBLIC_NUM = createField("public_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "公开次数");

    /**
     * The column <code>talentpooldb.talentpool_talent.upload</code>. 0 非上传，1上传
     */
    public final TableField<TalentpoolTalentRecord, Byte> UPLOAD = createField("upload", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0 非上传，1上传");

    /**
     * The column <code>talentpooldb.talentpool_talent.create_time</code>. 创建时间
     */
    public final TableField<TalentpoolTalentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>talentpooldb.talentpool_talent.update_time</code>.
     */
    public final TableField<TalentpoolTalentRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>talentpooldb.talentpool_talent</code> table reference
     */
    public TalentpoolTalent() {
        this("talentpool_talent", null);
    }

    /**
     * Create an aliased <code>talentpooldb.talentpool_talent</code> table reference
     */
    public TalentpoolTalent(String alias) {
        this(alias, TALENTPOOL_TALENT);
    }

    private TalentpoolTalent(String alias, Table<TalentpoolTalentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TalentpoolTalent(String alias, Table<TalentpoolTalentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "人才库人才表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Talentpooldb.TALENTPOOLDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TalentpoolTalentRecord> getPrimaryKey() {
        return Keys.KEY_TALENTPOOL_TALENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TalentpoolTalentRecord>> getKeys() {
        return Arrays.<UniqueKey<TalentpoolTalentRecord>>asList(Keys.KEY_TALENTPOOL_TALENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolTalent as(String alias) {
        return new TalentpoolTalent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TalentpoolTalent rename(String name) {
        return new TalentpoolTalent(name, null);
    }
}