/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables.records;


import com.moseeker.baseorm.db.historydb.tables.ConfigSysCvTpl;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 简历模板库
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigSysCvTplRecord extends UpdatableRecordImpl<ConfigSysCvTplRecord> implements Record14<Integer, String, String, Integer, String, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer, String, String> {

    private static final long serialVersionUID = 1399349068;

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.field_name</code>. 属性含义
     */
    public void setFieldName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.field_name</code>. 属性含义
     */
    public String getFieldName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.field_title</code>. 属性标题
     */
    public void setFieldTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.field_title</code>. 属性标题
     */
    public String getFieldTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.field_type</code>. 属性类型 0:短文本, 1:长文本,  2:多选, 3:单选, 4:长tag, 5:tag:, 6:时间, 7:img, 8:复合字段-单条, 9:复合字段-多条,10:下拉列表, 11:数字输入框(用于校验) 12:城市选择控件 13:英文文本
     */
    public void setFieldType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.field_type</code>. 属性类型 0:短文本, 1:长文本,  2:多选, 3:单选, 4:长tag, 5:tag:, 6:时间, 7:img, 8:复合字段-单条, 9:复合字段-多条,10:下拉列表, 11:数字输入框(用于校验) 12:城市选择控件 13:英文文本
     */
    public Integer getFieldType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.field_value</code>. 微信端页面标签默认值
     */
    public void setFieldValue(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.field_value</code>. 微信端页面标签默认值
     */
    public String getFieldValue() {
        return (String) get(4);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.priority</code>. 排序字段
     */
    public void setPriority(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.priority</code>. 排序字段
     */
    public Integer getPriority() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.is_basic</code>. 属性类型 0：常用字段 1：校招常用 2：蓝领常用
     */
    public void setIsBasic(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.is_basic</code>. 属性类型 0：常用字段 1：校招常用 2：蓝领常用
     */
    public Integer getIsBasic() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.disable</code>. 是否禁用 0：可用1：不可用
     */
    public void setDisable(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.disable</code>. 是否禁用 0：可用1：不可用
     */
    public Integer getDisable() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.company_id</code>. 所属公司。如果是私有属性，则存在所属公司部门编号；如果不是则为0
     */
    public void setCompanyId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.company_id</code>. 所属公司。如果是私有属性，则存在所属公司部门编号；如果不是则为0
     */
    public Integer getCompanyId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.required</code>. 是否必填项 0：必填项 1：选填项
     */
    public void setRequired(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.required</code>. 是否必填项 0：必填项 1：选填项
     */
    public Integer getRequired() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.field_description</code>. 雇主平台页面显示值
     */
    public void setFieldDescription(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.field_description</code>. 雇主平台页面显示值
     */
    public String getFieldDescription() {
        return (String) get(12);
    }

    /**
     * Setter for <code>historydb.config_sys_cv_tpl.map</code>. 与profile的映射关系
     */
    public void setMap(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>historydb.config_sys_cv_tpl.map</code>. 与profile的映射关系
     */
    public String getMap() {
        return (String) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, Integer, String, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, Integer, String, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.IS_BASIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.REQUIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.MAP;
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
    public String value2() {
        return getFieldName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFieldTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getFieldType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFieldValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getIsBasic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getRequired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getFieldDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getMap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value2(String value) {
        setFieldName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value3(String value) {
        setFieldTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value4(Integer value) {
        setFieldType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value5(String value) {
        setFieldValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value6(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value7(Integer value) {
        setIsBasic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value9(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value10(Integer value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value11(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value12(Integer value) {
        setRequired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value13(String value) {
        setFieldDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value14(String value) {
        setMap(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord values(Integer value1, String value2, String value3, Integer value4, String value5, Integer value6, Integer value7, Timestamp value8, Timestamp value9, Integer value10, Integer value11, Integer value12, String value13, String value14) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConfigSysCvTplRecord
     */
    public ConfigSysCvTplRecord() {
        super(ConfigSysCvTpl.CONFIG_SYS_CV_TPL);
    }

    /**
     * Create a detached, initialised ConfigSysCvTplRecord
     */
    public ConfigSysCvTplRecord(Integer id, String fieldName, String fieldTitle, Integer fieldType, String fieldValue, Integer priority, Integer isBasic, Timestamp createTime, Timestamp updateTime, Integer disable, Integer companyId, Integer required, String fieldDescription, String map) {
        super(ConfigSysCvTpl.CONFIG_SYS_CV_TPL);

        set(0, id);
        set(1, fieldName);
        set(2, fieldTitle);
        set(3, fieldType);
        set(4, fieldValue);
        set(5, priority);
        set(6, isBasic);
        set(7, createTime);
        set(8, updateTime);
        set(9, disable);
        set(10, companyId);
        set(11, required);
        set(12, fieldDescription);
        set(13, map);
    }
}