/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables;


import com.moseeker.db.hrdb.Hrdb;
import com.moseeker.db.hrdb.Keys;
import com.moseeker.db.hrdb.tables.records.HrWxRuleRecord;

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
 * 微信回复规则表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxRule extends TableImpl<HrWxRuleRecord> {

	private static final long serialVersionUID = -928406190;

	/**
	 * The reference instance of <code>hrDB.hr_wx_rule</code>
	 */
	public static final HrWxRule HR_WX_RULE = new HrWxRule();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrWxRuleRecord> getRecordType() {
		return HrWxRuleRecord.class;
	}

	/**
	 * The column <code>hrDB.hr_wx_rule.id</code>.
	 */
	public final TableField<HrWxRuleRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>hrDB.hr_wx_rule.wechat_id</code>.
	 */
	public final TableField<HrWxRuleRecord, UInteger> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrDB.hr_wx_rule.cid</code>.
	 */
	public final TableField<HrWxRuleRecord, UInteger> CID = createField("cid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrDB.hr_wx_rule.name</code>.
	 */
	public final TableField<HrWxRuleRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrDB.hr_wx_rule.module</code>. 模块名称
	 */
	public final TableField<HrWxRuleRecord, String> MODULE = createField("module", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "模块名称");

	/**
	 * The column <code>hrDB.hr_wx_rule.displayorder</code>. 排序
	 */
	public final TableField<HrWxRuleRecord, UInteger> DISPLAYORDER = createField("displayorder", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "排序");

	/**
	 * The column <code>hrDB.hr_wx_rule.status</code>. 规则状态，0禁用，1启用，2置顶
	 */
	public final TableField<HrWxRuleRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "规则状态，0禁用，1启用，2置顶");

	/**
	 * The column <code>hrDB.hr_wx_rule.access_level</code>. 规则获取权限，0：所有，1：员工
	 */
	public final TableField<HrWxRuleRecord, UInteger> ACCESS_LEVEL = createField("access_level", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "规则获取权限，0：所有，1：员工");

	/**
	 * The column <code>hrDB.hr_wx_rule.keywords</code>. 关键字
	 */
	public final TableField<HrWxRuleRecord, String> KEYWORDS = createField("keywords", org.jooq.impl.SQLDataType.VARCHAR.length(3000).nullable(false).defaulted(true), this, "关键字");

	/**
	 * Create a <code>hrDB.hr_wx_rule</code> table reference
	 */
	public HrWxRule() {
		this("hr_wx_rule", null);
	}

	/**
	 * Create an aliased <code>hrDB.hr_wx_rule</code> table reference
	 */
	public HrWxRule(String alias) {
		this(alias, HR_WX_RULE);
	}

	private HrWxRule(String alias, Table<HrWxRuleRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrWxRule(String alias, Table<HrWxRuleRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "微信回复规则表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrWxRuleRecord, UInteger> getIdentity() {
		return Keys.IDENTITY_HR_WX_RULE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrWxRuleRecord> getPrimaryKey() {
		return Keys.KEY_HR_WX_RULE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrWxRuleRecord>> getKeys() {
		return Arrays.<UniqueKey<HrWxRuleRecord>>asList(Keys.KEY_HR_WX_RULE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrWxRule as(String alias) {
		return new HrWxRule(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrWxRule rename(String name) {
		return new HrWxRule(name, null);
	}
}
