/*
 * This file is generated by jOOQ.
*/
package com.moseeker.db.analytics.tables;


import com.moseeker.db.analytics.Analytics;
import com.moseeker.db.analytics.Keys;
import com.moseeker.db.analytics.tables.records.StmWxouahRecord;

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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StmWxouah extends TableImpl<StmWxouahRecord> {

    private static final long serialVersionUID = 1109187985;

    /**
     * The reference instance of <code>analytics.stm_wxouah</code>
     */
    public static final StmWxouah STM_WXOUAH = new StmWxouah();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StmWxouahRecord> getRecordType() {
        return StmWxouahRecord.class;
    }

    /**
     * The column <code>analytics.stm_wxouah.id</code>.
     */
    public final TableField<StmWxouahRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>analytics.stm_wxouah.create_time</code>.
     */
    public final TableField<StmWxouahRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>analytics.stm_wxouah.pid</code>.
     */
    public final TableField<StmWxouahRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>analytics.stm_wxouah.wxoauth_source</code>.
     */
    public final TableField<StmWxouahRecord, Integer> WXOAUTH_SOURCE = createField("wxoauth_source", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>analytics.stm_wxouah</code> table reference
     */
    public StmWxouah() {
        this("stm_wxouah", null);
    }

    /**
     * Create an aliased <code>analytics.stm_wxouah</code> table reference
     */
    public StmWxouah(String alias) {
        this(alias, STM_WXOUAH);
    }

    private StmWxouah(String alias, Table<StmWxouahRecord> aliased) {
        this(alias, aliased, null);
    }

    private StmWxouah(String alias, Table<StmWxouahRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<StmWxouahRecord> getPrimaryKey() {
        return Keys.KEY_STM_WXOUAH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StmWxouahRecord>> getKeys() {
        return Arrays.<UniqueKey<StmWxouahRecord>>asList(Keys.KEY_STM_WXOUAH_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmWxouah as(String alias) {
        return new StmWxouah(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StmWxouah rename(String name) {
        return new StmWxouah(name, null);
    }
}
