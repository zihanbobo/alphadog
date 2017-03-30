/*
 * This file is generated by jOOQ.
*/
package com.moseeker.db.analytics.tables;


import com.moseeker.db.analytics.Analytics;
import com.moseeker.db.analytics.Keys;
import com.moseeker.db.analytics.tables.records.StOfficialPuvRecord;

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
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StOfficialPuv extends TableImpl<StOfficialPuvRecord> {

    private static final long serialVersionUID = -572086538;

    /**
     * The reference instance of <code>analytics.st_official_puv</code>
     */
    public static final StOfficialPuv ST_OFFICIAL_PUV = new StOfficialPuv();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StOfficialPuvRecord> getRecordType() {
        return StOfficialPuvRecord.class;
    }

    /**
     * The column <code>analytics.st_official_puv.id</code>.
     */
    public final TableField<StOfficialPuvRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>analytics.st_official_puv.create_time</code>.
     */
    public final TableField<StOfficialPuvRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>analytics.st_official_puv.page</code>. 页面类型,index代表首页，aboutus代表关于我们，produc代表产品介绍,login_click代表登录点击,register_click代表注册点击,login代表登录页面,register代表注册页面
     */
    public final TableField<StOfficialPuvRecord, String> PAGE = createField("page", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "页面类型,index代表首页，aboutus代表关于我们，produc代表产品介绍,login_click代表登录点击,register_click代表注册点击,login代表登录页面,register代表注册页面");

    /**
     * The column <code>analytics.st_official_puv.ip_count</code>. pv
     */
    public final TableField<StOfficialPuvRecord, Integer> IP_COUNT = createField("ip_count", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "pv");

    /**
     * The column <code>analytics.st_official_puv.ip_unique</code>. uv
     */
    public final TableField<StOfficialPuvRecord, Integer> IP_UNIQUE = createField("ip_unique", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "uv");

    /**
     * The column <code>analytics.st_official_puv.ip_top</code>. 访问最高ip
     */
    public final TableField<StOfficialPuvRecord, String> IP_TOP = createField("ip_top", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "访问最高ip");

    /**
     * The column <code>analytics.st_official_puv.ip_freq</code>. 访问最高ip的频次
     */
    public final TableField<StOfficialPuvRecord, Integer> IP_FREQ = createField("ip_freq", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "访问最高ip的频次");

    /**
     * The column <code>analytics.st_official_puv.baidu_ip_count</code>. baidu来源pv
     */
    public final TableField<StOfficialPuvRecord, Integer> BAIDU_IP_COUNT = createField("baidu_ip_count", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "baidu来源pv");

    /**
     * The column <code>analytics.st_official_puv.baidu_ip_unique</code>. baidu来源uv
     */
    public final TableField<StOfficialPuvRecord, Integer> BAIDU_IP_UNIQUE = createField("baidu_ip_unique", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "baidu来源uv");

    /**
     * The column <code>analytics.st_official_puv.baidu_ip_top</code>. baidu来源最高访问ip
     */
    public final TableField<StOfficialPuvRecord, String> BAIDU_IP_TOP = createField("baidu_ip_top", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "baidu来源最高访问ip");

    /**
     * The column <code>analytics.st_official_puv.baidu_ip_freq</code>. baidu来源最高访问ip频次
     */
    public final TableField<StOfficialPuvRecord, Integer> BAIDU_IP_FREQ = createField("baidu_ip_freq", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "baidu来源最高访问ip频次");

    /**
     * Create a <code>analytics.st_official_puv</code> table reference
     */
    public StOfficialPuv() {
        this("st_official_puv", null);
    }

    /**
     * Create an aliased <code>analytics.st_official_puv</code> table reference
     */
    public StOfficialPuv(String alias) {
        this(alias, ST_OFFICIAL_PUV);
    }

    private StOfficialPuv(String alias, Table<StOfficialPuvRecord> aliased) {
        this(alias, aliased, null);
    }

    private StOfficialPuv(String alias, Table<StOfficialPuvRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StOfficialPuvRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ST_OFFICIAL_PUV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StOfficialPuvRecord> getPrimaryKey() {
        return Keys.KEY_ST_OFFICIAL_PUV_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StOfficialPuvRecord>> getKeys() {
        return Arrays.<UniqueKey<StOfficialPuvRecord>>asList(Keys.KEY_ST_OFFICIAL_PUV_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StOfficialPuv as(String alias) {
        return new StOfficialPuv(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StOfficialPuv rename(String name) {
        return new StOfficialPuv(name, null);
    }
}
