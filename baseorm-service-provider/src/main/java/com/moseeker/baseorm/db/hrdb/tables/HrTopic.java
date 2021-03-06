/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrTopicRecord;

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
 * 雇主主题活动表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrTopic extends TableImpl<HrTopicRecord> {

    private static final long serialVersionUID = 1066236288;

    /**
     * The reference instance of <code>hrdb.hr_topic</code>
     */
    public static final HrTopic HR_TOPIC = new HrTopic();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrTopicRecord> getRecordType() {
        return HrTopicRecord.class;
    }

    /**
     * The column <code>hrdb.hr_topic.id</code>.
     */
    public final TableField<HrTopicRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_topic.company_id</code>. company.id, 部门ID
     */
    public final TableField<HrTopicRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "company.id, 部门ID");

    /**
     * The column <code>hrdb.hr_topic.share_title</code>. 分享标题
     */
    public final TableField<HrTopicRecord, String> SHARE_TITLE = createField("share_title", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "分享标题");

    /**
     * The column <code>hrdb.hr_topic.share_logo</code>. 分享LOGO的相对路径
     */
    public final TableField<HrTopicRecord, String> SHARE_LOGO = createField("share_logo", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "分享LOGO的相对路径");

    /**
     * The column <code>hrdb.hr_topic.share_description</code>. 分享描述
     */
    public final TableField<HrTopicRecord, String> SHARE_DESCRIPTION = createField("share_description", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "分享描述");

    /**
     * The column <code>hrdb.hr_topic.style_id</code>. config_sys_h5_style_tpl.id， 样式Id
     */
    public final TableField<HrTopicRecord, Integer> STYLE_ID = createField("style_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "config_sys_h5_style_tpl.id， 样式Id");

    /**
     * The column <code>hrdb.hr_topic.creator</code>. hr_account.id
     */
    public final TableField<HrTopicRecord, Integer> CREATOR = createField("creator", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "hr_account.id");

    /**
     * The column <code>hrdb.hr_topic.disable</code>. 是否有效  0：有效 1：无效
     */
    public final TableField<HrTopicRecord, Byte> DISABLE = createField("disable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否有效  0：有效 1：无效");

    /**
     * The column <code>hrdb.hr_topic.create_time</code>.
     */
    public final TableField<HrTopicRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>hrdb.hr_topic.update_time</code>.
     */
    public final TableField<HrTopicRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>hrdb.hr_topic</code> table reference
     */
    public HrTopic() {
        this("hr_topic", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_topic</code> table reference
     */
    public HrTopic(String alias) {
        this(alias, HR_TOPIC);
    }

    private HrTopic(String alias, Table<HrTopicRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrTopic(String alias, Table<HrTopicRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "雇主主题活动表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Hrdb.HRDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HrTopicRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_TOPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrTopicRecord> getPrimaryKey() {
        return Keys.KEY_HR_TOPIC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrTopicRecord>> getKeys() {
        return Arrays.<UniqueKey<HrTopicRecord>>asList(Keys.KEY_HR_TOPIC_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrTopic as(String alias) {
        return new HrTopic(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrTopic rename(String name) {
        return new HrTopic(name, null);
    }
}
