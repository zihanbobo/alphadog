/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.employeedb.tables.records;


import com.moseeker.baseorm.db.employeedb.tables.EmployeeCustomDisplay;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 员工认证-自定义显示表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeCustomDisplayRecord extends UpdatableRecordImpl<EmployeeCustomDisplayRecord> implements Record10<Integer, Integer, String, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1433533938;

    /**
     * Setter for <code>employeedb.employee_custom_display.id</code>. 主键
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>employeedb.employee_custom_display.id</code>. 主键
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>employeedb.employee_custom_display.company_id</code>. 公司编号
     */
    public void setCompanyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>employeedb.employee_custom_display.company_id</code>. 公司编号
     */
    public Integer getCompanyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>employeedb.employee_custom_display.page_title</code>. 页面标题中文
     */
    public void setPageTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>employeedb.employee_custom_display.page_title</code>. 页面标题中文
     */
    public String getPageTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>employeedb.employee_custom_display.page_title_en</code>. 页面标题英文
     */
    public void setPageTitleEn(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>employeedb.employee_custom_display.page_title_en</code>. 页面标题英文
     */
    public String getPageTitleEn() {
        return (String) get(3);
    }

    /**
     * Setter for <code>employeedb.employee_custom_display.tips_title</code>. 认证提示中文
     */
    public void setTipsTitle(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>employeedb.employee_custom_display.tips_title</code>. 认证提示中文
     */
    public String getTipsTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>employeedb.employee_custom_display.tips_title_en</code>. 认证提示英文
     */
    public void setTipsTitleEn(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>employeedb.employee_custom_display.tips_title_en</code>. 认证提示英文
     */
    public String getTipsTitleEn() {
        return (String) get(5);
    }

    /**
     * Setter for <code>employeedb.employee_custom_display.description</code>. 描述中文
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>employeedb.employee_custom_display.description</code>. 描述中文
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>employeedb.employee_custom_display.description_en</code>. 描述英文
     */
    public void setDescriptionEn(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>employeedb.employee_custom_display.description_en</code>. 描述英文
     */
    public String getDescriptionEn() {
        return (String) get(7);
    }

    /**
     * Setter for <code>employeedb.employee_custom_display.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>employeedb.employee_custom_display.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>employeedb.employee_custom_display.update_time</code>. 修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>employeedb.employee_custom_display.update_time</code>. 修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, String, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Integer, String, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY.PAGE_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY.PAGE_TITLE_EN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY.TIPS_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY.TIPS_TITLE_EN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY.DESCRIPTION_EN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY.UPDATE_TIME;
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
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPageTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPageTitleEn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTipsTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTipsTitleEn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDescriptionEn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord value2(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord value3(String value) {
        setPageTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord value4(String value) {
        setPageTitleEn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord value5(String value) {
        setTipsTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord value6(String value) {
        setTipsTitleEn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord value8(String value) {
        setDescriptionEn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeCustomDisplayRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, Timestamp value9, Timestamp value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeeCustomDisplayRecord
     */
    public EmployeeCustomDisplayRecord() {
        super(EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY);
    }

    /**
     * Create a detached, initialised EmployeeCustomDisplayRecord
     */
    public EmployeeCustomDisplayRecord(Integer id, Integer companyId, String pageTitle, String pageTitleEn, String tipsTitle, String tipsTitleEn, String description, String descriptionEn, Timestamp createTime, Timestamp updateTime) {
        super(EmployeeCustomDisplay.EMPLOYEE_CUSTOM_DISPLAY);

        set(0, id);
        set(1, companyId);
        set(2, pageTitle);
        set(3, pageTitleEn);
        set(4, tipsTitle);
        set(5, tipsTitleEn);
        set(6, description);
        set(7, descriptionEn);
        set(8, createTime);
        set(9, updateTime);
    }
}