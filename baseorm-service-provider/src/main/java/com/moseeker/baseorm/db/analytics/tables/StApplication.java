/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.Keys;
import com.moseeker.baseorm.db.analytics.tables.records.StApplicationRecord;

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
public class StApplication extends TableImpl<StApplicationRecord> {

    private static final long serialVersionUID = 1610836721;

    /**
     * The reference instance of <code>analytics.st_application</code>
     */
    public static final StApplication ST_APPLICATION = new StApplication();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StApplicationRecord> getRecordType() {
        return StApplicationRecord.class;
    }

    /**
     * The column <code>analytics.st_application.id</code>.
     */
    public final TableField<StApplicationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>analytics.st_application.create_time</code>.
     */
    public final TableField<StApplicationRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>analytics.st_application.pid</code>. 职位id,对应hr_position的id
     */
    public final TableField<StApplicationRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "职位id,对应hr_position的id");

    /**
     * The column <code>analytics.st_application.recom</code>. 推荐人openid
     */
    public final TableField<StApplicationRecord, String> RECOM = createField("recom", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "推荐人openid");

    /**
     * The column <code>analytics.st_application.remote_ip</code>.
     */
    public final TableField<StApplicationRecord, String> REMOTE_IP = createField("remote_ip", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>analytics.st_application.viewer_id</code>. viewer_id，生成的访问者id
     */
    public final TableField<StApplicationRecord, String> VIEWER_ID = createField("viewer_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "viewer_id，生成的访问者id");

    /**
     * The column <code>analytics.st_application.open_id</code>. open_id，微信openid
     */
    public final TableField<StApplicationRecord, String> OPEN_ID = createField("open_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "open_id，微信openid");

    /**
     * The column <code>analytics.st_application.dquser_id</code>. sysuser_id，sys_user表主键
     */
    public final TableField<StApplicationRecord, Integer> DQUSER_ID = createField("dquser_id", org.jooq.impl.SQLDataType.INTEGER, this, "sysuser_id，sys_user表主键");

    /**
     * The column <code>analytics.st_application.click_from</code>. 来源，0：未知，1：timeline，2：groupmessage，3,：singlemessage
     */
    public final TableField<StApplicationRecord, Integer> CLICK_FROM = createField("click_from", org.jooq.impl.SQLDataType.INTEGER, this, "来源，0：未知，1：timeline，2：groupmessage，3,：singlemessage");

    /**
     * The column <code>analytics.st_application.tj</code>. 相关职位列表带来的申请
     */
    public final TableField<StApplicationRecord, String> TJ = createField("tj", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "相关职位列表带来的申请");

    /**
     * Create a <code>analytics.st_application</code> table reference
     */
    public StApplication() {
        this("st_application", null);
    }

    /**
     * Create an aliased <code>analytics.st_application</code> table reference
     */
    public StApplication(String alias) {
        this(alias, ST_APPLICATION);
    }

    private StApplication(String alias, Table<StApplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private StApplication(String alias, Table<StApplicationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StApplicationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ST_APPLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StApplicationRecord> getPrimaryKey() {
        return Keys.KEY_ST_APPLICATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StApplicationRecord>> getKeys() {
        return Arrays.<UniqueKey<StApplicationRecord>>asList(Keys.KEY_ST_APPLICATION_PRIMARY, Keys.KEY_ST_APPLICATION_IX_UNIUQE_APPLICATION_RECORD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StApplication as(String alias) {
        return new StApplication(alias, this);
    }

    /**
     * Rename this table
     */
    public StApplication rename(String name) {
        return new StApplication(name, null);
    }
}
