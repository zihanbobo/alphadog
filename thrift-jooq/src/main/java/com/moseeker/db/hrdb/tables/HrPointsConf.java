/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables;


import com.moseeker.db.hrdb.Hrdb;
import com.moseeker.db.hrdb.Keys;
import com.moseeker.db.hrdb.tables.records.HrPointsConfRecord;

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
 * 雇主积分规则配置表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrPointsConf extends TableImpl<HrPointsConfRecord> {

	private static final long serialVersionUID = 2066325865;

	/**
	 * The reference instance of <code>hrDB.hr_points_conf</code>
	 */
	public static final HrPointsConf HR_POINTS_CONF = new HrPointsConf();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrPointsConfRecord> getRecordType() {
		return HrPointsConfRecord.class;
	}

	/**
	 * The column <code>hrDB.hr_points_conf.id</code>.
	 */
	public final TableField<HrPointsConfRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>hrDB.hr_points_conf.company_id</code>.
	 */
	public final TableField<HrPointsConfRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>hrDB.hr_points_conf.status_name</code>. name of status defined, if using ATS, please set it the same as ATS
	 */
	public final TableField<HrPointsConfRecord, String> STATUS_NAME = createField("status_name", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaulted(true), this, "name of status defined, if using ATS, please set it the same as ATS");

	/**
	 * The column <code>hrDB.hr_points_conf.reward</code>. 积分数量
	 */
	public final TableField<HrPointsConfRecord, Long> REWARD = createField("reward", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "积分数量");

	/**
	 * The column <code>hrDB.hr_points_conf.description</code>.
	 */
	public final TableField<HrPointsConfRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrDB.hr_points_conf.is_using</code>. 是否启用0：启用1：禁用
	 */
	public final TableField<HrPointsConfRecord, Byte> IS_USING = createField("is_using", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "是否启用0：启用1：禁用");

	/**
	 * The column <code>hrDB.hr_points_conf.order_num</code>. 优先级
	 */
	public final TableField<HrPointsConfRecord, Byte> ORDER_NUM = createField("order_num", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "优先级");

	/**
	 * The column <code>hrDB.hr_points_conf._update_time</code>.
	 */
	public final TableField<HrPointsConfRecord, Timestamp> _UPDATE_TIME = createField("_update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrDB.hr_points_conf.tag</code>.
	 */
	public final TableField<HrPointsConfRecord, String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>hrDB.hr_points_conf.is_applier_send</code>. 申请者是否发送消息模板0:发送1:不发送
	 */
	public final TableField<HrPointsConfRecord, Byte> IS_APPLIER_SEND = createField("is_applier_send", org.jooq.impl.SQLDataType.TINYINT.defaulted(true), this, "申请者是否发送消息模板0:发送1:不发送");

	/**
	 * The column <code>hrDB.hr_points_conf.applier_first</code>. 申请状态模板发送问候语
	 */
	public final TableField<HrPointsConfRecord, String> APPLIER_FIRST = createField("applier_first", org.jooq.impl.SQLDataType.VARCHAR.length(256).defaulted(true), this, "申请状态模板发送问候语");

	/**
	 * The column <code>hrDB.hr_points_conf.applier_remark</code>. 申请状态模板发送结束语
	 */
	public final TableField<HrPointsConfRecord, String> APPLIER_REMARK = createField("applier_remark", org.jooq.impl.SQLDataType.VARCHAR.length(256).defaulted(true), this, "申请状态模板发送结束语");

	/**
	 * The column <code>hrDB.hr_points_conf.is_recom_send</code>. 推荐者是否发送消息模板0:发送1:不发送
	 */
	public final TableField<HrPointsConfRecord, Byte> IS_RECOM_SEND = createField("is_recom_send", org.jooq.impl.SQLDataType.TINYINT.defaulted(true), this, "推荐者是否发送消息模板0:发送1:不发送");

	/**
	 * The column <code>hrDB.hr_points_conf.recom_first</code>. 推荐者申请状态模板发送问候语
	 */
	public final TableField<HrPointsConfRecord, String> RECOM_FIRST = createField("recom_first", org.jooq.impl.SQLDataType.VARCHAR.length(256).defaulted(true), this, "推荐者申请状态模板发送问候语");

	/**
	 * The column <code>hrDB.hr_points_conf.recom_remark</code>. 推荐者申请状态模板发送结束语
	 */
	public final TableField<HrPointsConfRecord, String> RECOM_REMARK = createField("recom_remark", org.jooq.impl.SQLDataType.VARCHAR.length(256).defaulted(true), this, "推荐者申请状态模板发送结束语");

	/**
	 * The column <code>hrDB.hr_points_conf.template_id</code>. 申请状态模板ID，hr_award_config_template.id
	 */
	public final TableField<HrPointsConfRecord, UInteger> TEMPLATE_ID = createField("template_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "申请状态模板ID，hr_award_config_template.id");

	/**
	 * Create a <code>hrDB.hr_points_conf</code> table reference
	 */
	public HrPointsConf() {
		this("hr_points_conf", null);
	}

	/**
	 * Create an aliased <code>hrDB.hr_points_conf</code> table reference
	 */
	public HrPointsConf(String alias) {
		this(alias, HR_POINTS_CONF);
	}

	private HrPointsConf(String alias, Table<HrPointsConfRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrPointsConf(String alias, Table<HrPointsConfRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "雇主积分规则配置表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrPointsConfRecord, Integer> getIdentity() {
		return Keys.IDENTITY_HR_POINTS_CONF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrPointsConfRecord> getPrimaryKey() {
		return Keys.KEY_HR_POINTS_CONF_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrPointsConfRecord>> getKeys() {
		return Arrays.<UniqueKey<HrPointsConfRecord>>asList(Keys.KEY_HR_POINTS_CONF_PRIMARY, Keys.KEY_HR_POINTS_CONF_STATUS_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrPointsConf as(String alias) {
		return new HrPointsConf(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrPointsConf rename(String name) {
		return new HrPointsConf(name, null);
	}
}
