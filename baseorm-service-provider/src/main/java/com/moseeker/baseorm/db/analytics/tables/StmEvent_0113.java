/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.tables.records.StmEvent_0113Record;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class StmEvent_0113 extends TableImpl<StmEvent_0113Record> {

    private static final long serialVersionUID = -1460847658;

    /**
     * The reference instance of <code>analytics.stm_event_0113</code>
     */
    public static final StmEvent_0113 STM_EVENT_0113 = new StmEvent_0113();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StmEvent_0113Record> getRecordType() {
        return StmEvent_0113Record.class;
    }

    /**
     * The column <code>analytics.stm_event_0113.req_type_id</code>. 请求类型外键
     */
    public final TableField<StmEvent_0113Record, Integer> REQ_TYPE_ID = createField("req_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "请求类型外键");

    /**
     * The column <code>analytics.stm_event_0113.status_code</code>. 状态码 (200.404,etc)
     */
    public final TableField<StmEvent_0113Record, Integer> STATUS_CODE = createField("status_code", org.jooq.impl.SQLDataType.INTEGER, this, "状态码 (200.404,etc)");

    /**
     * The column <code>analytics.stm_event_0113.wechat_id</code>. 微信公共号id
     */
    public final TableField<StmEvent_0113Record, Integer> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGER, this, "微信公共号id");

    /**
     * The column <code>analytics.stm_event_0113.res_type_id</code>. 返回类型外键
     */
    public final TableField<StmEvent_0113Record, Integer> RES_TYPE_ID = createField("res_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "返回类型外键");

    /**
     * The column <code>analytics.stm_event_0113.handler</code>. handler处理文件
     */
    public final TableField<StmEvent_0113Record, String> HANDLER = createField("handler", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "handler处理文件");

    /**
     * The column <code>analytics.stm_event_0113.wechat_type</code>. 微信公共号类型
     */
    public final TableField<StmEvent_0113Record, Integer> WECHAT_TYPE = createField("wechat_type", org.jooq.impl.SQLDataType.INTEGER, this, "微信公共号类型");

    /**
     * The column <code>analytics.stm_event_0113.open_id</code>. 微信绑定id
     */
    public final TableField<StmEvent_0113Record, String> OPEN_ID = createField("open_id", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "微信绑定id");

    /**
     * The column <code>analytics.stm_event_0113.dquser_id</code>. Moseeker注册id
     */
    public final TableField<StmEvent_0113Record, String> DQUSER_ID = createField("dquser_id", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "Moseeker注册id");

    /**
     * The column <code>analytics.stm_event_0113.viewer_id</code>. 系统分配的访问者id
     */
    public final TableField<StmEvent_0113Record, String> VIEWER_ID = createField("viewer_id", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "系统分配的访问者id");

    /**
     * The column <code>analytics.stm_event_0113.res_content</code>. 返回内容
     */
    public final TableField<StmEvent_0113Record, String> RES_CONTENT = createField("res_content", org.jooq.impl.SQLDataType.CLOB, this, "返回内容");

    /**
     * The column <code>analytics.stm_event_0113.req_uri</code>. 请求uri
     */
    public final TableField<StmEvent_0113Record, String> REQ_URI = createField("req_uri", org.jooq.impl.SQLDataType.VARCHAR.length(120), this, "请求uri");

    /**
     * The column <code>analytics.stm_event_0113.req_params</code>. 请求参数
     */
    public final TableField<StmEvent_0113Record, String> REQ_PARAMS = createField("req_params", org.jooq.impl.SQLDataType.CLOB, this, "请求参数");

    /**
     * The column <code>analytics.stm_event_0113.event_id</code>. 事件类型外键
     */
    public final TableField<StmEvent_0113Record, Integer> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.INTEGER, this, "事件类型外键");

    /**
     * The column <code>analytics.stm_event_0113.remote_ip</code>.
     */
    public final TableField<StmEvent_0113Record, String> REMOTE_IP = createField("remote_ip", org.jooq.impl.SQLDataType.VARCHAR.length(18), this, "");

    /**
     * The column <code>analytics.stm_event_0113.session_id</code>. session id
     */
    public final TableField<StmEvent_0113Record, String> SESSION_ID = createField("session_id", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "session id");

    /**
     * The column <code>analytics.stm_event_0113.sys_user_cookie</code>. 用户的cookie内容
     */
    public final TableField<StmEvent_0113Record, String> SYS_USER_COOKIE = createField("sys_user_cookie", org.jooq.impl.SQLDataType.CLOB, this, "用户的cookie内容");

    /**
     * The column <code>analytics.stm_event_0113.useragent</code>. 客户端user agent
     */
    public final TableField<StmEvent_0113Record, String> USERAGENT = createField("useragent", org.jooq.impl.SQLDataType.CLOB, this, "客户端user agent");

    /**
     * The column <code>analytics.stm_event_0113.create_time</code>. 日志记录创建时间
     */
    public final TableField<StmEvent_0113Record, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "日志记录创建时间");

    /**
     * Create a <code>analytics.stm_event_0113</code> table reference
     */
    public StmEvent_0113() {
        this("stm_event_0113", null);
    }

    /**
     * Create an aliased <code>analytics.stm_event_0113</code> table reference
     */
    public StmEvent_0113(String alias) {
        this(alias, STM_EVENT_0113);
    }

    private StmEvent_0113(String alias, Table<StmEvent_0113Record> aliased) {
        this(alias, aliased, null);
    }

    private StmEvent_0113(String alias, Table<StmEvent_0113Record> aliased, Field<?>[] parameters) {
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
    public StmEvent_0113 as(String alias) {
        return new StmEvent_0113(alias, this);
    }

    /**
     * Rename this table
     */
    public StmEvent_0113 rename(String name) {
        return new StmEvent_0113(name, null);
    }
}
