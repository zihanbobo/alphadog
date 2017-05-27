/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.Keys;
import com.moseeker.baseorm.db.analytics.tables.records.WebImRecord;

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
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WebIm extends TableImpl<WebImRecord> {

    private static final long serialVersionUID = -1311291718;

    /**
     * The reference instance of <code>analytics.web_im</code>
     */
    public static final WebIm WEB_IM = new WebIm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WebImRecord> getRecordType() {
        return WebImRecord.class;
    }

    /**
     * The column <code>analytics.web_im.id</code>.
     */
    public final TableField<WebImRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>analytics.web_im.create_time</code>.
     */
    public final TableField<WebImRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>analytics.web_im.hr</code>. 使用IM的HR数量
     */
    public final TableField<WebImRecord, Integer> HR = createField("hr", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "使用IM的HR数量");

    /**
     * The column <code>analytics.web_im.hr_news</code>. HR发送消息数量
     */
    public final TableField<WebImRecord, Integer> HR_NEWS = createField("hr_news", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "HR发送消息数量");

    /**
     * The column <code>analytics.web_im.candidate</code>. 使用IM的求职者数量
     */
    public final TableField<WebImRecord, Integer> CANDIDATE = createField("candidate", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "使用IM的求职者数量");

    /**
     * The column <code>analytics.web_im.candidate_news</code>. 求职者发送的消息数量
     */
    public final TableField<WebImRecord, Integer> CANDIDATE_NEWS = createField("candidate_news", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "求职者发送的消息数量");

    /**
     * Create a <code>analytics.web_im</code> table reference
     */
    public WebIm() {
        this("web_im", null);
    }

    /**
     * Create an aliased <code>analytics.web_im</code> table reference
     */
    public WebIm(String alias) {
        this(alias, WEB_IM);
    }

    private WebIm(String alias, Table<WebImRecord> aliased) {
        this(alias, aliased, null);
    }

    private WebIm(String alias, Table<WebImRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Analytics.ANALYTICS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WebImRecord, Integer> getIdentity() {
        return Keys.IDENTITY_WEB_IM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WebImRecord> getPrimaryKey() {
        return Keys.KEY_WEB_IM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WebImRecord>> getKeys() {
        return Arrays.<UniqueKey<WebImRecord>>asList(Keys.KEY_WEB_IM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebIm as(String alias) {
        return new WebIm(alias, this);
    }

    /**
     * Rename this table
     */
    public WebIm rename(String name) {
        return new WebIm(name, null);
    }
}
