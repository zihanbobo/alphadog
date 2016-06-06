/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables;


import com.moseeker.db.hrdb.Hrdb;
import com.moseeker.db.hrdb.Keys;
import com.moseeker.db.hrdb.tables.records.HrHbPositionBindingRecord;

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
 * 红包配置和职位绑定表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrHbPositionBinding extends TableImpl<HrHbPositionBindingRecord> {

	private static final long serialVersionUID = 1851215620;

	/**
	 * The reference instance of <code>hrdb.hr_hb_position_binding</code>
	 */
	public static final HrHbPositionBinding HR_HB_POSITION_BINDING = new HrHbPositionBinding();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrHbPositionBindingRecord> getRecordType() {
		return HrHbPositionBindingRecord.class;
	}

	/**
	 * The column <code>hrdb.hr_hb_position_binding.id</code>.
	 */
	public final TableField<HrHbPositionBindingRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>hrdb.hr_hb_position_binding.hb_config_id</code>. hr_hb_config.id
	 */
	public final TableField<HrHbPositionBindingRecord, Integer> HB_CONFIG_ID = createField("hb_config_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "hr_hb_config.id");

	/**
	 * The column <code>hrdb.hr_hb_position_binding.position_id</code>. hr_position.id
	 */
	public final TableField<HrHbPositionBindingRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "hr_position.id");

	/**
	 * The column <code>hrdb.hr_hb_position_binding.trigger_way</code>. 领取条件：1=职位被转发 2=职位被申请
	 */
	public final TableField<HrHbPositionBindingRecord, Byte> TRIGGER_WAY = createField("trigger_way", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "领取条件：1=职位被转发 2=职位被申请");

	/**
	 * The column <code>hrdb.hr_hb_position_binding.total_amount</code>. 总金额
	 */
	public final TableField<HrHbPositionBindingRecord, BigDecimal> TOTAL_AMOUNT = createField("total_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false).defaulted(true), this, "总金额");

	/**
	 * The column <code>hrdb.hr_hb_position_binding.total_num</code>. 红包总数
	 */
	public final TableField<HrHbPositionBindingRecord, Integer> TOTAL_NUM = createField("total_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "红包总数");

	/**
	 * The column <code>hrdb.hr_hb_position_binding.create_time</code>. 创建时间
	 */
	public final TableField<HrHbPositionBindingRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>hrdb.hr_hb_position_binding.update_time</code>. 更新时间
	 */
	public final TableField<HrHbPositionBindingRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "更新时间");

	/**
	 * Create a <code>hrdb.hr_hb_position_binding</code> table reference
	 */
	public HrHbPositionBinding() {
		this("hr_hb_position_binding", null);
	}

	/**
	 * Create an aliased <code>hrdb.hr_hb_position_binding</code> table reference
	 */
	public HrHbPositionBinding(String alias) {
		this(alias, HR_HB_POSITION_BINDING);
	}

	private HrHbPositionBinding(String alias, Table<HrHbPositionBindingRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrHbPositionBinding(String alias, Table<HrHbPositionBindingRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "红包配置和职位绑定表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrHbPositionBindingRecord, Integer> getIdentity() {
		return Keys.IDENTITY_HR_HB_POSITION_BINDING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrHbPositionBindingRecord> getPrimaryKey() {
		return Keys.KEY_HR_HB_POSITION_BINDING_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrHbPositionBindingRecord>> getKeys() {
		return Arrays.<UniqueKey<HrHbPositionBindingRecord>>asList(Keys.KEY_HR_HB_POSITION_BINDING_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrHbPositionBinding as(String alias) {
		return new HrHbPositionBinding(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrHbPositionBinding rename(String name) {
		return new HrHbPositionBinding(name, null);
	}
}
