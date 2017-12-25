/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrRuleStatisticsRecord;

import java.sql.Date;
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
 * 微信图文传播次数统计表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrRuleStatistics extends TableImpl<HrRuleStatisticsRecord> {

    private static final long serialVersionUID = -1458689951;

    /**
     * The reference instance of <code>hrdb.hr_rule_statistics</code>
     */
    public static final HrRuleStatistics HR_RULE_STATISTICS = new HrRuleStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrRuleStatisticsRecord> getRecordType() {
        return HrRuleStatisticsRecord.class;
    }

    /**
     * The column <code>hrdb.hr_rule_statistics.id</code>. primary key
     */
    public final TableField<HrRuleStatisticsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "primary key");

    /**
     * The column <code>hrdb.hr_rule_statistics.wxrule_id</code>. wx_rule.id
     */
    public final TableField<HrRuleStatisticsRecord, Integer> WXRULE_ID = createField("wxrule_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "wx_rule.id");

    /**
     * The column <code>hrdb.hr_rule_statistics.menu_name</code>. 菜单名称
     */
    public final TableField<HrRuleStatisticsRecord, String> MENU_NAME = createField("menu_name", org.jooq.impl.SQLDataType.VARCHAR.length(999), this, "菜单名称");

    /**
     * The column <code>hrdb.hr_rule_statistics.type</code>. 0: wx_rule, 1: menu
     */
    public final TableField<HrRuleStatisticsRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0: wx_rule, 1: menu");

    /**
     * The column <code>hrdb.hr_rule_statistics.company_id</code>. company.id
     */
    public final TableField<HrRuleStatisticsRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "company.id");

    /**
     * The column <code>hrdb.hr_rule_statistics.view_num_pv</code>. 浏览人数
     */
    public final TableField<HrRuleStatisticsRecord, Integer> VIEW_NUM_PV = createField("view_num_pv", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "浏览人数");

    /**
     * The column <code>hrdb.hr_rule_statistics.create_date</code>. 创建日期
     */
    public final TableField<HrRuleStatisticsRecord, Date> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "创建日期");

    /**
     * Create a <code>hrdb.hr_rule_statistics</code> table reference
     */
    public HrRuleStatistics() {
        this("hr_rule_statistics", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_rule_statistics</code> table reference
     */
    public HrRuleStatistics(String alias) {
        this(alias, HR_RULE_STATISTICS);
    }

    private HrRuleStatistics(String alias, Table<HrRuleStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrRuleStatistics(String alias, Table<HrRuleStatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "微信图文传播次数统计表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Hrdb.HRDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HrRuleStatisticsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_RULE_STATISTICS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrRuleStatisticsRecord> getPrimaryKey() {
        return Keys.KEY_HR_RULE_STATISTICS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrRuleStatisticsRecord>> getKeys() {
        return Arrays.<UniqueKey<HrRuleStatisticsRecord>>asList(Keys.KEY_HR_RULE_STATISTICS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrRuleStatistics as(String alias) {
        return new HrRuleStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrRuleStatistics rename(String name) {
        return new HrRuleStatistics(name, null);
    }
}
