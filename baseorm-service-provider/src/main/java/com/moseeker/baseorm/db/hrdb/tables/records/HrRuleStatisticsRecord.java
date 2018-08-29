/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrRuleStatistics;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 微信图文传播次数统计表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrRuleStatisticsRecord extends UpdatableRecordImpl<HrRuleStatisticsRecord> implements Record7<Integer, Integer, String, Integer, Integer, Integer, Date> {

    private static final long serialVersionUID = 1271262371;

    /**
     * Setter for <code>hrdb.hr_rule_statistics.id</code>. primary key
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>hrdb.hr_rule_statistics.id</code>. primary key
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>hrdb.hr_rule_statistics.wxrule_id</code>. wx_rule.id
     */
    public void setWxruleId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hrdb.hr_rule_statistics.wxrule_id</code>. wx_rule.id
     */
    public Integer getWxruleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>hrdb.hr_rule_statistics.menu_name</code>. 菜单名称
     */
    public void setMenuName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>hrdb.hr_rule_statistics.menu_name</code>. 菜单名称
     */
    public String getMenuName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>hrdb.hr_rule_statistics.type</code>. 0: wx_rule, 1: menu
     */
    public void setType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>hrdb.hr_rule_statistics.type</code>. 0: wx_rule, 1: menu
     */
    public Integer getType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>hrdb.hr_rule_statistics.company_id</code>. company.id
     */
    public void setCompanyId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>hrdb.hr_rule_statistics.company_id</code>. company.id
     */
    public Integer getCompanyId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>hrdb.hr_rule_statistics.view_num_pv</code>. 浏览人数
     */
    public void setViewNumPv(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>hrdb.hr_rule_statistics.view_num_pv</code>. 浏览人数
     */
    public Integer getViewNumPv() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>hrdb.hr_rule_statistics.create_date</code>. 创建日期
     */
    public void setCreateDate(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>hrdb.hr_rule_statistics.create_date</code>. 创建日期
     */
    public Date getCreateDate() {
        return (Date) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, Integer, Integer, Date> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, Integer, Integer, Date> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return HrRuleStatistics.HR_RULE_STATISTICS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return HrRuleStatistics.HR_RULE_STATISTICS.WXRULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HrRuleStatistics.HR_RULE_STATISTICS.MENU_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return HrRuleStatistics.HR_RULE_STATISTICS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return HrRuleStatistics.HR_RULE_STATISTICS.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return HrRuleStatistics.HR_RULE_STATISTICS.VIEW_NUM_PV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return HrRuleStatistics.HR_RULE_STATISTICS.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getWxruleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMenuName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getViewNumPv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrRuleStatisticsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrRuleStatisticsRecord value2(Integer value) {
        setWxruleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrRuleStatisticsRecord value3(String value) {
        setMenuName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrRuleStatisticsRecord value4(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrRuleStatisticsRecord value5(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrRuleStatisticsRecord value6(Integer value) {
        setViewNumPv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrRuleStatisticsRecord value7(Date value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrRuleStatisticsRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, Integer value6, Date value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrRuleStatisticsRecord
     */
    public HrRuleStatisticsRecord() {
        super(HrRuleStatistics.HR_RULE_STATISTICS);
    }

    /**
     * Create a detached, initialised HrRuleStatisticsRecord
     */
    public HrRuleStatisticsRecord(Integer id, Integer wxruleId, String menuName, Integer type, Integer companyId, Integer viewNumPv, Date createDate) {
        super(HrRuleStatistics.HR_RULE_STATISTICS);

        set(0, id);
        set(1, wxruleId);
        set(2, menuName);
        set(3, type);
        set(4, companyId);
        set(5, viewNumPv);
        set(6, createDate);
    }
}
