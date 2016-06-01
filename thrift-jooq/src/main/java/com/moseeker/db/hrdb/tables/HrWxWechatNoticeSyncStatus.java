/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables;


import com.moseeker.db.hrdb.Hrdb;
import com.moseeker.db.hrdb.Keys;
import com.moseeker.db.hrdb.tables.records.HrWxWechatNoticeSyncStatusRecord;

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
import org.jooq.types.UInteger;


/**
 * 微信消息通知同步状态
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxWechatNoticeSyncStatus extends TableImpl<HrWxWechatNoticeSyncStatusRecord> {

	private static final long serialVersionUID = 787351908;

	/**
	 * The reference instance of <code>hrDB.hr_wx_wechat_notice_sync_status</code>
	 */
	public static final HrWxWechatNoticeSyncStatus HR_WX_WECHAT_NOTICE_SYNC_STATUS = new HrWxWechatNoticeSyncStatus();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrWxWechatNoticeSyncStatusRecord> getRecordType() {
		return HrWxWechatNoticeSyncStatusRecord.class;
	}

	/**
	 * The column <code>hrDB.hr_wx_wechat_notice_sync_status.id</code>. 主key
	 */
	public final TableField<HrWxWechatNoticeSyncStatusRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "主key");

	/**
	 * The column <code>hrDB.hr_wx_wechat_notice_sync_status.wechat_id</code>. 所属公众号
	 */
	public final TableField<HrWxWechatNoticeSyncStatusRecord, UInteger> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "所属公众号");

	/**
	 * The column <code>hrDB.hr_wx_wechat_notice_sync_status.status</code>. 同步状态 0:成功, 1:行业修改失败, 2:模板数量超出上限, 3:接口调用失败
	 */
	public final TableField<HrWxWechatNoticeSyncStatusRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "同步状态 0:成功, 1:行业修改失败, 2:模板数量超出上限, 3:接口调用失败");

	/**
	 * The column <code>hrDB.hr_wx_wechat_notice_sync_status.count</code>. 同步状态提示应该删除信息的数量
	 */
	public final TableField<HrWxWechatNoticeSyncStatusRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "同步状态提示应该删除信息的数量");

	/**
	 * The column <code>hrDB.hr_wx_wechat_notice_sync_status.update_time</code>.
	 */
	public final TableField<HrWxWechatNoticeSyncStatusRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>hrDB.hr_wx_wechat_notice_sync_status</code> table reference
	 */
	public HrWxWechatNoticeSyncStatus() {
		this("hr_wx_wechat_notice_sync_status", null);
	}

	/**
	 * Create an aliased <code>hrDB.hr_wx_wechat_notice_sync_status</code> table reference
	 */
	public HrWxWechatNoticeSyncStatus(String alias) {
		this(alias, HR_WX_WECHAT_NOTICE_SYNC_STATUS);
	}

	private HrWxWechatNoticeSyncStatus(String alias, Table<HrWxWechatNoticeSyncStatusRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrWxWechatNoticeSyncStatus(String alias, Table<HrWxWechatNoticeSyncStatusRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "微信消息通知同步状态");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrWxWechatNoticeSyncStatusRecord, UInteger> getIdentity() {
		return Keys.IDENTITY_HR_WX_WECHAT_NOTICE_SYNC_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrWxWechatNoticeSyncStatusRecord> getPrimaryKey() {
		return Keys.KEY_HR_WX_WECHAT_NOTICE_SYNC_STATUS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrWxWechatNoticeSyncStatusRecord>> getKeys() {
		return Arrays.<UniqueKey<HrWxWechatNoticeSyncStatusRecord>>asList(Keys.KEY_HR_WX_WECHAT_NOTICE_SYNC_STATUS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxWechatNoticeSyncStatus as(String alias) {
		return new HrWxWechatNoticeSyncStatus(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrWxWechatNoticeSyncStatus rename(String name) {
		return new HrWxWechatNoticeSyncStatus(name, null);
	}
}
