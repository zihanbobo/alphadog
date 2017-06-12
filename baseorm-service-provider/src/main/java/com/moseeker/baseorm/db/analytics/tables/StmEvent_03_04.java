/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.Keys;
import com.moseeker.baseorm.db.analytics.tables.records.StmEvent_03_04Record;

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
 * 请求事件元数据表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StmEvent_03_04 extends TableImpl<StmEvent_03_04Record> {

    private static final long serialVersionUID = -1657397322;

    /**
     * The reference instance of <code>analytics.stm_event_03_04</code>
     */
    public static final StmEvent_03_04 STM_EVENT_03_04 = new StmEvent_03_04();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StmEvent_03_04Record> getRecordType() {
        return StmEvent_03_04Record.class;
    }

    /**
     * The column <code>analytics.stm_event_03_04.id</code>.
     */
    public final TableField<StmEvent_03_04Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>analytics.stm_event_03_04.req_type_id</code>. 请求类型外键
     */
    public final TableField<StmEvent_03_04Record, Integer> REQ_TYPE_ID = createField("req_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "请求类型外键");

    /**
     * The column <code>analytics.stm_event_03_04.status_code</code>. 状态码 (200.404,etc)
     */
    public final TableField<StmEvent_03_04Record, Integer> STATUS_CODE = createField("status_code", org.jooq.impl.SQLDataType.INTEGER, this, "状态码 (200.404,etc)");

    /**
     * The column <code>analytics.stm_event_03_04.wechat_id</code>. 微信公共号id
     */
    public final TableField<StmEvent_03_04Record, Integer> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGER, this, "微信公共号id");

    /**
     * The column <code>analytics.stm_event_03_04.res_type_id</code>. 返回类型外键
     */
    public final TableField<StmEvent_03_04Record, Integer> RES_TYPE_ID = createField("res_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "返回类型外键");

    /**
     * The column <code>analytics.stm_event_03_04.handler</code>. handler处理文件
     */
    public final TableField<StmEvent_03_04Record, String> HANDLER = createField("handler", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "handler处理文件");

    /**
     * The column <code>analytics.stm_event_03_04.wechat_type</code>. 微信公共号类型
     */
    public final TableField<StmEvent_03_04Record, Integer> WECHAT_TYPE = createField("wechat_type", org.jooq.impl.SQLDataType.INTEGER, this, "微信公共号类型");

    /**
     * The column <code>analytics.stm_event_03_04.open_id</code>. 微信绑定id
     */
    public final TableField<StmEvent_03_04Record, String> OPEN_ID = createField("open_id", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "微信绑定id");

    /**
     * The column <code>analytics.stm_event_03_04.dquser_id</code>. Moseeker注册id
     */
    public final TableField<StmEvent_03_04Record, String> DQUSER_ID = createField("dquser_id", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "Moseeker注册id");

    /**
     * The column <code>analytics.stm_event_03_04.viewer_id</code>. 系统分配的访问者id
     */
    public final TableField<StmEvent_03_04Record, String> VIEWER_ID = createField("viewer_id", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "系统分配的访问者id");

    /**
     * The column <code>analytics.stm_event_03_04.res_content</code>. 返回内容
     */
    public final TableField<StmEvent_03_04Record, String> RES_CONTENT = createField("res_content", org.jooq.impl.SQLDataType.CLOB, this, "返回内容");

    /**
     * The column <code>analytics.stm_event_03_04.req_uri</code>. 请求uri
     */
    public final TableField<StmEvent_03_04Record, String> REQ_URI = createField("req_uri", org.jooq.impl.SQLDataType.VARCHAR.length(120), this, "请求uri");

    /**
     * The column <code>analytics.stm_event_03_04.req_params</code>. 请求参数
     */
    public final TableField<StmEvent_03_04Record, String> REQ_PARAMS = createField("req_params", org.jooq.impl.SQLDataType.CLOB, this, "请求参数");

    /**
     * The column <code>analytics.stm_event_03_04.event_id</code>. 事件类型外键
     */
    public final TableField<StmEvent_03_04Record, Integer> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.INTEGER, this, "事件类型外键");

    /**
     * The column <code>analytics.stm_event_03_04.remote_ip</code>.
     */
    public final TableField<StmEvent_03_04Record, String> REMOTE_IP = createField("remote_ip", org.jooq.impl.SQLDataType.VARCHAR.length(18), this, "");

    /**
     * The column <code>analytics.stm_event_03_04.session_id</code>. session id
     */
    public final TableField<StmEvent_03_04Record, String> SESSION_ID = createField("session_id", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "session id");

    /**
     * The column <code>analytics.stm_event_03_04.sys_user_cookie</code>. 用户的cookie内容
     */
    public final TableField<StmEvent_03_04Record, String> SYS_USER_COOKIE = createField("sys_user_cookie", org.jooq.impl.SQLDataType.CLOB, this, "用户的cookie内容");

    /**
     * The column <code>analytics.stm_event_03_04.useragent</code>. 客户端user agent
     */
    public final TableField<StmEvent_03_04Record, String> USERAGENT = createField("useragent", org.jooq.impl.SQLDataType.CLOB, this, "客户端user agent");

    /**
     * The column <code>analytics.stm_event_03_04.create_time</code>. 日志记录创建时间
     */
    public final TableField<StmEvent_03_04Record, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "日志记录创建时间");

    /**
     * Create a <code>analytics.stm_event_03_04</code> table reference
     */
    public StmEvent_03_04() {
        this("stm_event_03_04", null);
    }

    /**
     * Create an aliased <code>analytics.stm_event_03_04</code> table reference
     */
    public StmEvent_03_04(String alias) {
        this(alias, STM_EVENT_03_04);
    }

    private StmEvent_03_04(String alias, Table<StmEvent_03_04Record> aliased) {
        this(alias, aliased, null);
    }

    private StmEvent_03_04(String alias, Table<StmEvent_03_04Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "请求事件元数据表");
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
    public Identity<StmEvent_03_04Record, Integer> getIdentity() {
        return Keys.IDENTITY_STM_EVENT_03_04;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StmEvent_03_04Record> getPrimaryKey() {
        return Keys.KEY_STM_EVENT_03_04_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StmEvent_03_04Record>> getKeys() {
        return Arrays.<UniqueKey<StmEvent_03_04Record>>asList(Keys.KEY_STM_EVENT_03_04_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmEvent_03_04 as(String alias) {
        return new StmEvent_03_04(alias, this);
    }

    /**
     * Rename this table
     */
    public StmEvent_03_04 rename(String name) {
        return new StmEvent_03_04(name, null);
    }
}
