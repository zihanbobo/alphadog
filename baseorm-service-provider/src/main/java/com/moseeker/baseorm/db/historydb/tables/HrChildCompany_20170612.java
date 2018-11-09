/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables;


import com.moseeker.baseorm.db.historydb.Historydb;
import com.moseeker.baseorm.db.historydb.Keys;
import com.moseeker.baseorm.db.historydb.tables.records.HrChildCompany_20170612Record;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 子公司表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrChildCompany_20170612 extends TableImpl<HrChildCompany_20170612Record> {

    private static final long serialVersionUID = -1343008273;

    /**
     * The reference instance of <code>historydb.hr_child_company_20170612</code>
     */
    public static final HrChildCompany_20170612 HR_CHILD_COMPANY_20170612 = new HrChildCompany_20170612();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrChildCompany_20170612Record> getRecordType() {
        return HrChildCompany_20170612Record.class;
    }

    /**
     * The column <code>historydb.hr_child_company_20170612.id</code>.
     */
    public final TableField<HrChildCompany_20170612Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>historydb.hr_child_company_20170612.name</code>.
     */
    public final TableField<HrChildCompany_20170612Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>historydb.hr_child_company_20170612.ename</code>.
     */
    public final TableField<HrChildCompany_20170612Record, String> ENAME = createField("ename", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>historydb.hr_child_company_20170612.status</code>. 0:onuse 1:unused
     */
    public final TableField<HrChildCompany_20170612Record, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:onuse 1:unused");

    /**
     * The column <code>historydb.hr_child_company_20170612.CEO</code>. CEO
     */
    public final TableField<HrChildCompany_20170612Record, String> CEO = createField("CEO", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "CEO");

    /**
     * The column <code>historydb.hr_child_company_20170612.introduction</code>. introduction
     */
    public final TableField<HrChildCompany_20170612Record, String> INTRODUCTION = createField("introduction", org.jooq.impl.SQLDataType.CLOB, this, "introduction");

    /**
     * The column <code>historydb.hr_child_company_20170612.scale</code>. people number of the company
     */
    public final TableField<HrChildCompany_20170612Record, String> SCALE = createField("scale", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "people number of the company");

    /**
     * The column <code>historydb.hr_child_company_20170612.province</code>. province
     */
    public final TableField<HrChildCompany_20170612Record, String> PROVINCE = createField("province", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "province");

    /**
     * The column <code>historydb.hr_child_company_20170612.city</code>. city
     */
    public final TableField<HrChildCompany_20170612Record, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "city");

    /**
     * The column <code>historydb.hr_child_company_20170612.address</code>. address
     */
    public final TableField<HrChildCompany_20170612Record, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "address");

    /**
     * The column <code>historydb.hr_child_company_20170612.property</code>. 0:国有1:三资2:集体3:私有
     */
    public final TableField<HrChildCompany_20170612Record, Byte> PROPERTY = createField("property", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:国有1:三资2:集体3:私有");

    /**
     * The column <code>historydb.hr_child_company_20170612.business</code>. business
     */
    public final TableField<HrChildCompany_20170612Record, String> BUSINESS = createField("business", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "business");

    /**
     * The column <code>historydb.hr_child_company_20170612.establish_time</code>. 公司成立时间
     */
    public final TableField<HrChildCompany_20170612Record, String> ESTABLISH_TIME = createField("establish_time", org.jooq.impl.SQLDataType.VARCHAR.length(15).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "公司成立时间");

    /**
     * The column <code>historydb.hr_child_company_20170612.parent_id</code>. 上级公司
     */
    public final TableField<HrChildCompany_20170612Record, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "上级公司");

    /**
     * The column <code>historydb.hr_child_company_20170612.homepage</code>. company home page
     */
    public final TableField<HrChildCompany_20170612Record, String> HOMEPAGE = createField("homepage", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "company home page");

    /**
     * The column <code>historydb.hr_child_company_20170612.company_id</code>. hr_company.id
     */
    public final TableField<HrChildCompany_20170612Record, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "hr_company.id");

    /**
     * Create a <code>historydb.hr_child_company_20170612</code> table reference
     */
    public HrChildCompany_20170612() {
        this("hr_child_company_20170612", null);
    }

    /**
     * Create an aliased <code>historydb.hr_child_company_20170612</code> table reference
     */
    public HrChildCompany_20170612(String alias) {
        this(alias, HR_CHILD_COMPANY_20170612);
    }

    private HrChildCompany_20170612(String alias, Table<HrChildCompany_20170612Record> aliased) {
        this(alias, aliased, null);
    }

    private HrChildCompany_20170612(String alias, Table<HrChildCompany_20170612Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "子公司表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Historydb.HISTORYDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HrChildCompany_20170612Record, Integer> getIdentity() {
        return Keys.IDENTITY_HR_CHILD_COMPANY_20170612;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrChildCompany_20170612Record> getPrimaryKey() {
        return Keys.KEY_HR_CHILD_COMPANY_20170612_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrChildCompany_20170612Record>> getKeys() {
        return Arrays.<UniqueKey<HrChildCompany_20170612Record>>asList(Keys.KEY_HR_CHILD_COMPANY_20170612_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrChildCompany_20170612 as(String alias) {
        return new HrChildCompany_20170612(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrChildCompany_20170612 rename(String name) {
        return new HrChildCompany_20170612(name, null);
    }
}