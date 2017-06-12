/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.Keys;
import com.moseeker.baseorm.db.analytics.tables.records.StTjRecord;

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
 * 记录推荐结果的点击信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StTj extends TableImpl<StTjRecord> {

    private static final long serialVersionUID = -1230051252;

    /**
     * The reference instance of <code>analytics.st_tj</code>
     */
    public static final StTj ST_TJ = new StTj();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StTjRecord> getRecordType() {
        return StTjRecord.class;
    }

    /**
     * The column <code>analytics.st_tj.id</code>.
     */
    public final TableField<StTjRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>analytics.st_tj.create_time</code>.
     */
    public final TableField<StTjRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>analytics.st_tj.pid</code>. 职位id,对应hr_position的id
     */
    public final TableField<StTjRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "职位id,对应hr_position的id");

    /**
     * The column <code>analytics.st_tj.tj</code>. 推荐类型,当前只有plist
     */
    public final TableField<StTjRecord, String> TJ = createField("tj", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "推荐类型,当前只有plist");

    /**
     * The column <code>analytics.st_tj.remote_ip</code>.
     */
    public final TableField<StTjRecord, String> REMOTE_IP = createField("remote_ip", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>analytics.st_tj.viewer_id</code>. viewer_id，生成的访问者id
     */
    public final TableField<StTjRecord, String> VIEWER_ID = createField("viewer_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "viewer_id，生成的访问者id");

    /**
     * Create a <code>analytics.st_tj</code> table reference
     */
    public StTj() {
        this("st_tj", null);
    }

    /**
     * Create an aliased <code>analytics.st_tj</code> table reference
     */
    public StTj(String alias) {
        this(alias, ST_TJ);
    }

    private StTj(String alias, Table<StTjRecord> aliased) {
        this(alias, aliased, null);
    }

    private StTj(String alias, Table<StTjRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "记录推荐结果的点击信息");
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
    public Identity<StTjRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ST_TJ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StTjRecord> getPrimaryKey() {
        return Keys.KEY_ST_TJ_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StTjRecord>> getKeys() {
        return Arrays.<UniqueKey<StTjRecord>>asList(Keys.KEY_ST_TJ_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StTj as(String alias) {
        return new StTj(alias, this);
    }

    /**
     * Rename this table
     */
    public StTj rename(String name) {
        return new StTj(name, null);
    }
}
