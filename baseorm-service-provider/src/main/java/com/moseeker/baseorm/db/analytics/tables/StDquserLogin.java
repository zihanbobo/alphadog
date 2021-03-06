/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.Keys;
import com.moseeker.baseorm.db.analytics.tables.records.StDquserLoginRecord;

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
 * 用于统计C端用户登录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StDquserLogin extends TableImpl<StDquserLoginRecord> {

    private static final long serialVersionUID = -1571329765;

    /**
     * The reference instance of <code>analytics.st_dquser_login</code>
     */
    public static final StDquserLogin ST_DQUSER_LOGIN = new StDquserLogin();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StDquserLoginRecord> getRecordType() {
        return StDquserLoginRecord.class;
    }

    /**
     * The column <code>analytics.st_dquser_login.id</code>.
     */
    public final TableField<StDquserLoginRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>analytics.st_dquser_login.create_time</code>.
     */
    public final TableField<StDquserLoginRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>analytics.st_dquser_login.sysuser_id</code>. 对应sys_user表的id
     */
    public final TableField<StDquserLoginRecord, Integer> SYSUSER_ID = createField("sysuser_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "对应sys_user表的id");

    /**
     * The column <code>analytics.st_dquser_login.wechat_id</code>. wechat_id可以用来判断微信公众号
     */
    public final TableField<StDquserLoginRecord, Integer> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "wechat_id可以用来判断微信公众号");

    /**
     * Create a <code>analytics.st_dquser_login</code> table reference
     */
    public StDquserLogin() {
        this("st_dquser_login", null);
    }

    /**
     * Create an aliased <code>analytics.st_dquser_login</code> table reference
     */
    public StDquserLogin(String alias) {
        this(alias, ST_DQUSER_LOGIN);
    }

    private StDquserLogin(String alias, Table<StDquserLoginRecord> aliased) {
        this(alias, aliased, null);
    }

    private StDquserLogin(String alias, Table<StDquserLoginRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用于统计C端用户登录");
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
    public Identity<StDquserLoginRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ST_DQUSER_LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StDquserLoginRecord> getPrimaryKey() {
        return Keys.KEY_ST_DQUSER_LOGIN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StDquserLoginRecord>> getKeys() {
        return Arrays.<UniqueKey<StDquserLoginRecord>>asList(Keys.KEY_ST_DQUSER_LOGIN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDquserLogin as(String alias) {
        return new StDquserLogin(alias, this);
    }

    /**
     * Rename this table
     */
    public StDquserLogin rename(String name) {
        return new StDquserLogin(name, null);
    }
}
