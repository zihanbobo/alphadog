/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables;


import com.moseeker.baseorm.db.talentpooldb.Keys;
import com.moseeker.baseorm.db.talentpooldb.Talentpooldb;
import com.moseeker.baseorm.db.talentpooldb.tables.records.TalentpoolCommentRecord;

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
 * 人才库人HR与标签的关系
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolComment extends TableImpl<TalentpoolCommentRecord> {

    private static final long serialVersionUID = 1333816598;

    /**
     * The reference instance of <code>talentpooldb.talentpool_comment</code>
     */
    public static final TalentpoolComment TALENTPOOL_COMMENT = new TalentpoolComment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TalentpoolCommentRecord> getRecordType() {
        return TalentpoolCommentRecord.class;
    }

    /**
     * The column <code>talentpooldb.talentpool_comment.id</code>. 主 key
     */
    public final TableField<TalentpoolCommentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主 key");

    /**
     * The column <code>talentpooldb.talentpool_comment.content</code>. 备注内容
     */
    public final TableField<TalentpoolCommentRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "备注内容");

    /**
     * The column <code>talentpooldb.talentpool_comment.hr_id</code>. HR 编号
     */
    public final TableField<TalentpoolCommentRecord, Integer> HR_ID = createField("hr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "HR 编号");

    /**
     * The column <code>talentpooldb.talentpool_comment.user_id</code>. 人才 编号
     */
    public final TableField<TalentpoolCommentRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "人才 编号");

    /**
     * The column <code>talentpooldb.talentpool_comment.create_time</code>. 创建时间
     */
    public final TableField<TalentpoolCommentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>talentpooldb.talentpool_comment.update_time</code>.
     */
    public final TableField<TalentpoolCommentRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>talentpooldb.talentpool_comment.company_id</code>.
     */
    public final TableField<TalentpoolCommentRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>talentpooldb.talentpool_comment</code> table reference
     */
    public TalentpoolComment() {
        this("talentpool_comment", null);
    }

    /**
     * Create an aliased <code>talentpooldb.talentpool_comment</code> table reference
     */
    public TalentpoolComment(String alias) {
        this(alias, TALENTPOOL_COMMENT);
    }

    private TalentpoolComment(String alias, Table<TalentpoolCommentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TalentpoolComment(String alias, Table<TalentpoolCommentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "人才库人HR与标签的关系");
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
    public Identity<TalentpoolCommentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TALENTPOOL_COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TalentpoolCommentRecord> getPrimaryKey() {
        return Keys.KEY_TALENTPOOL_COMMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TalentpoolCommentRecord>> getKeys() {
        return Arrays.<UniqueKey<TalentpoolCommentRecord>>asList(Keys.KEY_TALENTPOOL_COMMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolComment as(String alias) {
        return new TalentpoolComment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TalentpoolComment rename(String name) {
        return new TalentpoolComment(name, null);
    }
}
