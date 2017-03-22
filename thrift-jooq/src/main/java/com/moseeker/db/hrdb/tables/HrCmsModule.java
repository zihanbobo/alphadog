/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables;


import com.moseeker.db.hrdb.Hrdb;
import com.moseeker.db.hrdb.Keys;
import com.moseeker.db.hrdb.tables.records.HrCmsModuleRecord;

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
 * 微信端新jd内容模块配置项
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCmsModule extends TableImpl<HrCmsModuleRecord> {

	private static final long serialVersionUID = 1199289739;

	/**
	 * The reference instance of <code>hrdb.hr_cms_module</code>
	 */
	public static final HrCmsModule HR_CMS_MODULE = new HrCmsModule();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrCmsModuleRecord> getRecordType() {
		return HrCmsModuleRecord.class;
	}

	/**
	 * The column <code>hrdb.hr_cms_module.id</code>.
	 */
	public final TableField<HrCmsModuleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>hrdb.hr_cms_module.page_id</code>. hr_cms_pages.id
	 */
	public final TableField<HrCmsModuleRecord, Integer> PAGE_ID = createField("page_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "hr_cms_pages.id");

	/**
	 * The column <code>hrdb.hr_cms_module.module_name</code>. 模块名称
	 */
	public final TableField<HrCmsModuleRecord, String> MODULE_NAME = createField("module_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaulted(true), this, "模块名称");

	/**
	 * The column <code>hrdb.hr_cms_module.type</code>. 1,企业模块A 2，企业模块B，3企业模块C，4，企业模块D，5，企业模块E，6地图，7，二维码 8,团队详情9，职位详情
	 */
	public final TableField<HrCmsModuleRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "1,企业模块A 2，企业模块B，3企业模块C，4，企业模块D，5，企业模块E，6地图，7，二维码 8,团队详情9，职位详情");

	/**
	 * The column <code>hrdb.hr_cms_module.orders</code>. 顺序
	 */
	public final TableField<HrCmsModuleRecord, Integer> ORDERS = createField("orders", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "顺序");

	/**
	 * The column <code>hrdb.hr_cms_module.link</code>. 模板链接
	 */
	public final TableField<HrCmsModuleRecord, String> LINK = createField("link", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "模板链接");

	/**
	 * The column <code>hrdb.hr_cms_module.limit</code>. 限制显示数量，0为不限制
	 */
	public final TableField<HrCmsModuleRecord, Integer> LIMIT = createField("limit", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "限制显示数量，0为不限制");

	/**
	 * The column <code>hrdb.hr_cms_module.disable</code>. 状态 0 是有效 1是无效
	 */
	public final TableField<HrCmsModuleRecord, Integer> DISABLE = createField("disable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "状态 0 是有效 1是无效");

	/**
	 * The column <code>hrdb.hr_cms_module.create_time</code>.
	 */
	public final TableField<HrCmsModuleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrdb.hr_cms_module.update_time</code>.
	 */
	public final TableField<HrCmsModuleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>hrdb.hr_cms_module</code> table reference
	 */
	public HrCmsModule() {
		this("hr_cms_module", null);
	}

	/**
	 * Create an aliased <code>hrdb.hr_cms_module</code> table reference
	 */
	public HrCmsModule(String alias) {
		this(alias, HR_CMS_MODULE);
	}

	private HrCmsModule(String alias, Table<HrCmsModuleRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrCmsModule(String alias, Table<HrCmsModuleRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "微信端新jd内容模块配置项");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrCmsModuleRecord, Integer> getIdentity() {
		return Keys.IDENTITY_HR_CMS_MODULE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrCmsModuleRecord> getPrimaryKey() {
		return Keys.KEY_HR_CMS_MODULE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrCmsModuleRecord>> getKeys() {
		return Arrays.<UniqueKey<HrCmsModuleRecord>>asList(Keys.KEY_HR_CMS_MODULE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrCmsModule as(String alias) {
		return new HrCmsModule(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrCmsModule rename(String name) {
		return new HrCmsModule(name, null);
	}
}
