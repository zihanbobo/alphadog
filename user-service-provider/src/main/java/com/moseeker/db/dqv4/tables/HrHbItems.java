/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables;


import com.moseeker.db.dqv4.Dqv4;
import com.moseeker.db.dqv4.Keys;
import com.moseeker.db.dqv4.tables.records.HrHbItemsRecord;

import java.math.BigDecimal;
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
 * 红包记录表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrHbItems extends TableImpl<HrHbItemsRecord> {

	private static final long serialVersionUID = -1068318592;

	/**
	 * The reference instance of <code>dqv4.hr_hb_items</code>
	 */
	public static final HrHbItems HR_HB_ITEMS = new HrHbItems();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrHbItemsRecord> getRecordType() {
		return HrHbItemsRecord.class;
	}

	/**
	 * The column <code>dqv4.hr_hb_items.id</code>.
	 */
	public final TableField<HrHbItemsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dqv4.hr_hb_items.hb_config_id</code>. hr_hb_config.id
	 */
	public final TableField<HrHbItemsRecord, Integer> HB_CONFIG_ID = createField("hb_config_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "hr_hb_config.id");

	/**
	 * The column <code>dqv4.hr_hb_items.binding_id</code>. position_hb_binding.id
	 */
	public final TableField<HrHbItemsRecord, Integer> BINDING_ID = createField("binding_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "position_hb_binding.id");

	/**
	 * The column <code>dqv4.hr_hb_items.index</code>. 这条数据是第几个红包 0 < x <= 总红包数
	 */
	public final TableField<HrHbItemsRecord, Integer> INDEX = createField("index", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "这条数据是第几个红包 0 < x <= 总红包数");

	/**
	 * The column <code>dqv4.hr_hb_items.amount</code>. 红包金额
	 */
	public final TableField<HrHbItemsRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(11, 2).nullable(false).defaulted(true), this, "红包金额");

	/**
	 * The column <code>dqv4.hr_hb_items.status</code>. 0:还未送出，1:已经送出
	 */
	public final TableField<HrHbItemsRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "0:还未送出，1:已经送出");

	/**
	 * The column <code>dqv4.hr_hb_items.wxuser_id</code>. 获取红包的用户
	 */
	public final TableField<HrHbItemsRecord, Integer> WXUSER_ID = createField("wxuser_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "获取红包的用户");

	/**
	 * The column <code>dqv4.hr_hb_items.open_time</code>. 红包打开时间
	 */
	public final TableField<HrHbItemsRecord, Timestamp> OPEN_TIME = createField("open_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "红包打开时间");

	/**
	 * The column <code>dqv4.hr_hb_items.create_time</code>. 创建时间
	 */
	public final TableField<HrHbItemsRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>dqv4.hr_hb_items.update_time</code>. 更新时间
	 */
	public final TableField<HrHbItemsRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "更新时间");

	/**
	 * The column <code>dqv4.hr_hb_items.trigger_wxuser_id</code>. 触发发送红包行为时的当前用户, 即 JD 页点击者或职位申请者 wx_group_user.id
	 */
	public final TableField<HrHbItemsRecord, Integer> TRIGGER_WXUSER_ID = createField("trigger_wxuser_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "触发发送红包行为时的当前用户, 即 JD 页点击者或职位申请者 wx_group_user.id");

	/**
	 * Create a <code>dqv4.hr_hb_items</code> table reference
	 */
	public HrHbItems() {
		this("hr_hb_items", null);
	}

	/**
	 * Create an aliased <code>dqv4.hr_hb_items</code> table reference
	 */
	public HrHbItems(String alias) {
		this(alias, HR_HB_ITEMS);
	}

	private HrHbItems(String alias, Table<HrHbItemsRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrHbItems(String alias, Table<HrHbItemsRecord> aliased, Field<?>[] parameters) {
		super(alias, Dqv4.DQV4, aliased, parameters, "红包记录表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrHbItemsRecord, Integer> getIdentity() {
		return Keys.IDENTITY_HR_HB_ITEMS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrHbItemsRecord> getPrimaryKey() {
		return Keys.KEY_HR_HB_ITEMS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrHbItemsRecord>> getKeys() {
		return Arrays.<UniqueKey<HrHbItemsRecord>>asList(Keys.KEY_HR_HB_ITEMS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrHbItems as(String alias) {
		return new HrHbItems(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrHbItems rename(String name) {
		return new HrHbItems(name, null);
	}
}
