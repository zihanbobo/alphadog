/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables;


import com.moseeker.db.hrdb.Hrdb;
import com.moseeker.db.hrdb.Keys;
import com.moseeker.db.hrdb.tables.records.HrChildCompanyRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * 子公司表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrChildCompany extends TableImpl<HrChildCompanyRecord> {

	private static final long serialVersionUID = -1637200354;

	/**
	 * The reference instance of <code>hrDB.hr_child_company</code>
	 */
	public static final HrChildCompany HR_CHILD_COMPANY = new HrChildCompany();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrChildCompanyRecord> getRecordType() {
		return HrChildCompanyRecord.class;
	}

	/**
	 * The column <code>hrDB.hr_child_company.id</code>.
	 */
	public final TableField<HrChildCompanyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>hrDB.hr_child_company.name</code>.
	 */
	public final TableField<HrChildCompanyRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>hrDB.hr_child_company.ename</code>.
	 */
	public final TableField<HrChildCompanyRecord, String> ENAME = createField("ename", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>hrDB.hr_child_company.status</code>. 0:onuse 1:unused
	 */
	public final TableField<HrChildCompanyRecord, UByte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "0:onuse 1:unused");

	/**
	 * The column <code>hrDB.hr_child_company.CEO</code>. CEO
	 */
	public final TableField<HrChildCompanyRecord, String> CEO = createField("CEO", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "CEO");

	/**
	 * The column <code>hrDB.hr_child_company.introduction</code>. introduction
	 */
	public final TableField<HrChildCompanyRecord, String> INTRODUCTION = createField("introduction", org.jooq.impl.SQLDataType.CLOB, this, "introduction");

	/**
	 * The column <code>hrDB.hr_child_company.scale</code>. people number of the company
	 */
	public final TableField<HrChildCompanyRecord, String> SCALE = createField("scale", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaulted(true), this, "people number of the company");

	/**
	 * The column <code>hrDB.hr_child_company.province</code>. province
	 */
	public final TableField<HrChildCompanyRecord, String> PROVINCE = createField("province", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "province");

	/**
	 * The column <code>hrDB.hr_child_company.city</code>. city
	 */
	public final TableField<HrChildCompanyRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "city");

	/**
	 * The column <code>hrDB.hr_child_company.address</code>. address
	 */
	public final TableField<HrChildCompanyRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "address");

	/**
	 * The column <code>hrDB.hr_child_company.property</code>. 0:国有1:三资2:集体3:私有
	 */
	public final TableField<HrChildCompanyRecord, Byte> PROPERTY = createField("property", org.jooq.impl.SQLDataType.TINYINT.defaulted(true), this, "0:国有1:三资2:集体3:私有");

	/**
	 * The column <code>hrDB.hr_child_company.business</code>. business
	 */
	public final TableField<HrChildCompanyRecord, String> BUSINESS = createField("business", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "business");

	/**
	 * The column <code>hrDB.hr_child_company.establish_time</code>. 公司成立时间
	 */
	public final TableField<HrChildCompanyRecord, String> ESTABLISH_TIME = createField("establish_time", org.jooq.impl.SQLDataType.VARCHAR.length(15).defaulted(true), this, "公司成立时间");

	/**
	 * The column <code>hrDB.hr_child_company.parent_id</code>. 上级公司
	 */
	public final TableField<HrChildCompanyRecord, UInteger> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "上级公司");

	/**
	 * The column <code>hrDB.hr_child_company.homepage</code>. company home page
	 */
	public final TableField<HrChildCompanyRecord, String> HOMEPAGE = createField("homepage", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "company home page");

	/**
	 * The column <code>hrDB.hr_child_company.company_id</code>. hr_company.id
	 */
	public final TableField<HrChildCompanyRecord, UInteger> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "hr_company.id");

	/**
	 * Create a <code>hrDB.hr_child_company</code> table reference
	 */
	public HrChildCompany() {
		this("hr_child_company", null);
	}

	/**
	 * Create an aliased <code>hrDB.hr_child_company</code> table reference
	 */
	public HrChildCompany(String alias) {
		this(alias, HR_CHILD_COMPANY);
	}

	private HrChildCompany(String alias, Table<HrChildCompanyRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrChildCompany(String alias, Table<HrChildCompanyRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "子公司表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrChildCompanyRecord, Integer> getIdentity() {
		return Keys.IDENTITY_HR_CHILD_COMPANY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrChildCompanyRecord> getPrimaryKey() {
		return Keys.KEY_HR_CHILD_COMPANY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrChildCompanyRecord>> getKeys() {
		return Arrays.<UniqueKey<HrChildCompanyRecord>>asList(Keys.KEY_HR_CHILD_COMPANY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrChildCompany as(String alias) {
		return new HrChildCompany(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrChildCompany rename(String name) {
		return new HrChildCompany(name, null);
	}
}
