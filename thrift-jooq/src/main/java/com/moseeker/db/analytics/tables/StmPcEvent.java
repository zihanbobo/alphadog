/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.analytics.tables;


import com.moseeker.db.analytics.Analytics;
import com.moseeker.db.analytics.Keys;
import com.moseeker.db.analytics.tables.records.StmPcEventRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StmPcEvent extends TableImpl<StmPcEventRecord> {

	private static final long serialVersionUID = -1912596288;

	/**
	 * The reference instance of <code>analytics.stm_pc_event</code>
	 */
	public static final StmPcEvent STM_PC_EVENT = new StmPcEvent();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<StmPcEventRecord> getRecordType() {
		return StmPcEventRecord.class;
	}

	/**
	 * The column <code>analytics.stm_pc_event.id</code>. primary key
	 */
	public final TableField<StmPcEventRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "primary key");

	/**
	 * The column <code>analytics.stm_pc_event.req_type</code>. 请求类型外键
	 */
	public final TableField<StmPcEventRecord, String> REQ_TYPE = createField("req_type", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "请求类型外键");

	/**
	 * The column <code>analytics.stm_pc_event.status_code</code>. 状态码 (200.404,etc)
	 */
	public final TableField<StmPcEventRecord, Integer> STATUS_CODE = createField("status_code", org.jooq.impl.SQLDataType.INTEGER, this, "状态码 (200.404,etc)");

	/**
	 * The column <code>analytics.stm_pc_event.wechat_id</code>. 微信公共号id
	 */
	public final TableField<StmPcEventRecord, Integer> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGER, this, "微信公共号id");

	/**
	 * The column <code>analytics.stm_pc_event.res_type</code>. 返回类型外键
	 */
	public final TableField<StmPcEventRecord, String> RES_TYPE = createField("res_type", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "返回类型外键");

	/**
	 * The column <code>analytics.stm_pc_event.handler</code>. handler处理文件
	 */
	public final TableField<StmPcEventRecord, String> HANDLER = createField("handler", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "handler处理文件");

	/**
	 * The column <code>analytics.stm_pc_event.wechat_type</code>. 微信公共号类型
	 */
	public final TableField<StmPcEventRecord, Integer> WECHAT_TYPE = createField("wechat_type", org.jooq.impl.SQLDataType.INTEGER, this, "微信公共号类型");

	/**
	 * The column <code>analytics.stm_pc_event.open_id</code>. 微信绑定id
	 */
	public final TableField<StmPcEventRecord, String> OPEN_ID = createField("open_id", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "微信绑定id");

	/**
	 * The column <code>analytics.stm_pc_event.dquser_id</code>. Moseeker注册id
	 */
	public final TableField<StmPcEventRecord, String> DQUSER_ID = createField("dquser_id", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "Moseeker注册id");

	/**
	 * The column <code>analytics.stm_pc_event.viewer_id</code>. 系统分配的访问者id
	 */
	public final TableField<StmPcEventRecord, String> VIEWER_ID = createField("viewer_id", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "系统分配的访问者id");

	/**
	 * The column <code>analytics.stm_pc_event.res_content</code>. 返回内容
	 */
	public final TableField<StmPcEventRecord, String> RES_CONTENT = createField("res_content", org.jooq.impl.SQLDataType.CLOB, this, "返回内容");

	/**
	 * The column <code>analytics.stm_pc_event.referer</code>. 来源
	 */
	public final TableField<StmPcEventRecord, String> REFERER = createField("referer", org.jooq.impl.SQLDataType.CLOB, this, "来源");

	/**
	 * The column <code>analytics.stm_pc_event.req_uri</code>. 请求uri
	 */
	public final TableField<StmPcEventRecord, String> REQ_URI = createField("req_uri", org.jooq.impl.SQLDataType.VARCHAR.length(120), this, "请求uri");

	/**
	 * The column <code>analytics.stm_pc_event.req_params</code>. 请求参数
	 */
	public final TableField<StmPcEventRecord, String> REQ_PARAMS = createField("req_params", org.jooq.impl.SQLDataType.CLOB, this, "请求参数");

	/**
	 * The column <code>analytics.stm_pc_event.event</code>. 事件类型外键
	 */
	public final TableField<StmPcEventRecord, String> EVENT = createField("event", org.jooq.impl.SQLDataType.VARCHAR.length(120), this, "事件类型外键");

	/**
	 * The column <code>analytics.stm_pc_event.remote_ip</code>.
	 */
	public final TableField<StmPcEventRecord, String> REMOTE_IP = createField("remote_ip", org.jooq.impl.SQLDataType.VARCHAR.length(18), this, "");

	/**
	 * The column <code>analytics.stm_pc_event.session_id</code>. session id
	 */
	public final TableField<StmPcEventRecord, String> SESSION_ID = createField("session_id", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "session id");

	/**
	 * The column <code>analytics.stm_pc_event.sys_user_cookie</code>. 用户的cookie内容
	 */
	public final TableField<StmPcEventRecord, String> SYS_USER_COOKIE = createField("sys_user_cookie", org.jooq.impl.SQLDataType.CLOB, this, "用户的cookie内容");

	/**
	 * The column <code>analytics.stm_pc_event.useragent</code>. 客户端user agent
	 */
	public final TableField<StmPcEventRecord, String> USERAGENT = createField("useragent", org.jooq.impl.SQLDataType.CLOB, this, "客户端user agent");

	/**
	 * The column <code>analytics.stm_pc_event.create_time</code>. 日志记录创建时间
	 */
	public final TableField<StmPcEventRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "日志记录创建时间");

	/**
	 * Create a <code>analytics.stm_pc_event</code> table reference
	 */
	public StmPcEvent() {
		this("stm_pc_event", null);
	}

	/**
	 * Create an aliased <code>analytics.stm_pc_event</code> table reference
	 */
	public StmPcEvent(String alias) {
		this(alias, STM_PC_EVENT);
	}

	private StmPcEvent(String alias, Table<StmPcEventRecord> aliased) {
		this(alias, aliased, null);
	}

	private StmPcEvent(String alias, Table<StmPcEventRecord> aliased, Field<?>[] parameters) {
		super(alias, Analytics.ANALYTICS, aliased, parameters, "请求事件元数据表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<StmPcEventRecord, Integer> getIdentity() {
		return Keys.IDENTITY_STM_PC_EVENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<StmPcEventRecord> getPrimaryKey() {
		return Keys.KEY_STM_PC_EVENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<StmPcEventRecord>> getKeys() {
		return Arrays.<UniqueKey<StmPcEventRecord>>asList(Keys.KEY_STM_PC_EVENT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StmPcEvent as(String alias) {
		return new StmPcEvent(alias, this);
	}

	/**
	 * Rename this table
	 */
	public StmPcEvent rename(String name) {
		return new StmPcEvent(name, null);
	}
}
