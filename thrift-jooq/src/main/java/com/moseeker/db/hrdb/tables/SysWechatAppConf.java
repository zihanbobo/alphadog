/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables;


import com.moseeker.db.hrdb.Hrdb;
import com.moseeker.db.hrdb.tables.records.SysWechatAppConfRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysWechatAppConf extends TableImpl<SysWechatAppConfRecord> {

	private static final long serialVersionUID = -1245325191;

	/**
	 * The reference instance of <code>hrdb.sys_wechat_app_conf</code>
	 */
	public static final SysWechatAppConf SYS_WECHAT_APP_CONF = new SysWechatAppConf();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<SysWechatAppConfRecord> getRecordType() {
		return SysWechatAppConfRecord.class;
	}

	/**
	 * The column <code>hrdb.sys_wechat_app_conf.id</code>.
	 */
	public final TableField<SysWechatAppConfRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrdb.sys_wechat_app_conf.wechat_id</code>. 公众号ID
	 */
	public final TableField<SysWechatAppConfRecord, Integer> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "公众号ID");

	/**
	 * The column <code>hrdb.sys_wechat_app_conf.app_tpl_id</code>. 申请字段ID
	 */
	public final TableField<SysWechatAppConfRecord, Integer> APP_TPL_ID = createField("app_tpl_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "申请字段ID");

	/**
	 * The column <code>hrdb.sys_wechat_app_conf.display</code>. 是否显示0：是，1：否
	 */
	public final TableField<SysWechatAppConfRecord, Byte> DISPLAY = createField("display", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "是否显示0：是，1：否");

	/**
	 * The column <code>hrdb.sys_wechat_app_conf.required</code>. 是否必填0：是，1：否
	 */
	public final TableField<SysWechatAppConfRecord, Byte> REQUIRED = createField("required", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "是否必填0：是，1：否");

	/**
	 * The column <code>hrdb.sys_wechat_app_conf.priority</code>. 排序
	 */
	public final TableField<SysWechatAppConfRecord, Byte> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "排序");

	/**
	 * The column <code>hrdb.sys_wechat_app_conf.chname</code>. 申请字段显示名称
	 */
	public final TableField<SysWechatAppConfRecord, String> CHNAME = createField("chname", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaulted(true), this, "申请字段显示名称");

	/**
	 * The column <code>hrdb.sys_wechat_app_conf.entitle</code>. 字段英文名称
	 */
	public final TableField<SysWechatAppConfRecord, String> ENTITLE = createField("entitle", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false).defaulted(true), this, "字段英文名称");

	/**
	 * Create a <code>hrdb.sys_wechat_app_conf</code> table reference
	 */
	public SysWechatAppConf() {
		this("sys_wechat_app_conf", null);
	}

	/**
	 * Create an aliased <code>hrdb.sys_wechat_app_conf</code> table reference
	 */
	public SysWechatAppConf(String alias) {
		this(alias, SYS_WECHAT_APP_CONF);
	}

	private SysWechatAppConf(String alias, Table<SysWechatAppConfRecord> aliased) {
		this(alias, aliased, null);
	}

	private SysWechatAppConf(String alias, Table<SysWechatAppConfRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SysWechatAppConf as(String alias) {
		return new SysWechatAppConf(alias, this);
	}

	/**
	 * Rename this table
	 */
	public SysWechatAppConf rename(String name) {
		return new SysWechatAppConf(name, null);
	}
}
