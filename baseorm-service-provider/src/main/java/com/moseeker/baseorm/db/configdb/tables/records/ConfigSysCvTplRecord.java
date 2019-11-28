/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables.records;


import com.moseeker.baseorm.db.configdb.tables.ConfigSysCvTpl;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 简历模板库
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigSysCvTplRecord extends UpdatableRecordImpl<ConfigSysCvTplRecord> implements Record18<Integer, String, String, String, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer, String, String, Integer, Integer, String, String, String> {

    private static final long serialVersionUID = 1509840649;

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.field_name</code>. 属性含义
     */
    public void setFieldName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.field_name</code>. 属性含义
     */
    public String getFieldName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.field_title</code>.
     */
    public void setFieldTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.field_title</code>.
     */
    public String getFieldTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.field_type</code>. 属性类型 -1:不显示 0:短文本,1:长文本,2:多选,3:单选,4:长tag,5:tag:,6:时间,7:img,8:复合字段-单条,9:复合字段-多条,10:下拉列表, 12 手机号带国际区号 101:城市选择控件(单选), 102:国家选择控件,103:行业选择控件,104:学校选择控件,105:火箭专业选择控件,
106:城市选择控件(多选),107:二级行业选择控件,108:玛氏专业,109:综合管理培训生项目,110:职能管理培训生项目
     */
    public void setFieldType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.field_type</code>. 属性类型 -1:不显示 0:短文本,1:长文本,2:多选,3:单选,4:长tag,5:tag:,6:时间,7:img,8:复合字段-单条,9:复合字段-多条,10:下拉列表, 12 手机号带国际区号 101:城市选择控件(单选), 102:国家选择控件,103:行业选择控件,104:学校选择控件,105:火箭专业选择控件,
106:城市选择控件(多选),107:二级行业选择控件,108:玛氏专业,109:综合管理培训生项目,110:职能管理培训生项目
     */
    public String getFieldType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.priority</code>. 排序字段
     */
    public void setPriority(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.priority</code>. 排序字段
     */
    public Integer getPriority() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.is_basic</code>. 属性类型 0：常用字段 1：校招常用 2：蓝领常用
     */
    public void setIsBasic(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.is_basic</code>. 属性类型 0：常用字段 1：校招常用 2：蓝领常用
     */
    public Integer getIsBasic() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.disable</code>. 是否禁用 0：可用1：不可用
     */
    public void setDisable(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.disable</code>. 是否禁用 0：可用1：不可用
     */
    public Integer getDisable() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.company_id</code>. 所属公司。如果是私有属性，则存在所属公司部门编号；如果不是则为0
     */
    public void setCompanyId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.company_id</code>. 所属公司。如果是私有属性，则存在所属公司部门编号；如果不是则为0
     */
    public Integer getCompanyId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.required</code>. 是否必填项 0：必填项 1：选填项
     */
    public void setRequired(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.required</code>. 是否必填项 0：必填项 1：选填项
     */
    public Integer getRequired() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.field_description</code>. 雇主平台页面显示值
     */
    public void setFieldDescription(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.field_description</code>. 雇主平台页面显示值
     */
    public String getFieldDescription() {
        return (String) get(11);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.map</code>. 与profile的映射关系
     */
    public void setMap(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.map</code>. 与profile的映射关系
     */
    public String getMap() {
        return (String) get(12);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.constant_parent_code</code>.
     */
    public void setConstantParentCode(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.constant_parent_code</code>.
     */
    public Integer getConstantParentCode() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.parent_id</code>. 复合字段关联
     */
    public void setParentId(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.parent_id</code>. 复合字段关联
     */
    public Integer getParentId() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.validate_re</code>. 数据校验规则（正则）
     */
    public void setValidateRe(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.validate_re</code>. 数据校验规则（正则）
     */
    public String getValidateRe() {
        return (String) get(15);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.error_msg</code>. 错误提示
     */
    public void setErrorMsg(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.error_msg</code>. 错误提示
     */
    public String getErrorMsg() {
        return (String) get(16);
    }

    /**
     * Setter for <code>configdb.config_sys_cv_tpl.field_value</code>. 微信端页面标签默认值
     */
    public void setFieldValue(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>configdb.config_sys_cv_tpl.field_value</code>. 微信端页面标签默认值
     */
    public String getFieldValue() {
        return (String) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, String, String, String, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer, String, String, Integer, Integer, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, String, String, String, Integer, Integer, Timestamp, Timestamp, Integer, Integer, Integer, String, String, Integer, Integer, String, String, String> valuesRow() {
        return (Row18) super.valuesRow();
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
    public Field<String> field4() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.IS_BASIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.DISABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.REQUIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.CONSTANT_PARENT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.VALIDATE_RE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.ERROR_MSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return ConfigSysCvTpl.CONFIG_SYS_CV_TPL.FIELD_VALUE;
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
    public String value4() {
        return getFieldType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIsBasic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getDisable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getRequired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getFieldDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getMap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getConstantParentCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getValidateRe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getErrorMsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getFieldValue();
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
    public ConfigSysCvTplRecord value4(String value) {
        setFieldType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value5(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value6(Integer value) {
        setIsBasic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value7(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value8(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value9(Integer value) {
        setDisable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value10(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value11(Integer value) {
        setRequired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value12(String value) {
        setFieldDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value13(String value) {
        setMap(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value14(Integer value) {
        setConstantParentCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value15(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value16(String value) {
        setValidateRe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value17(String value) {
        setErrorMsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord value18(String value) {
        setFieldValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTplRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6, Timestamp value7, Timestamp value8, Integer value9, Integer value10, Integer value11, String value12, String value13, Integer value14, Integer value15, String value16, String value17, String value18) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
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
    public ConfigSysCvTplRecord(Integer id, String fieldName, String fieldTitle, String fieldType, Integer priority, Integer isBasic, Timestamp createTime, Timestamp updateTime, Integer disable, Integer companyId, Integer required, String fieldDescription, String map, Integer constantParentCode, Integer parentId, String validateRe, String errorMsg, String fieldValue) {
        super(ConfigSysCvTpl.CONFIG_SYS_CV_TPL);

        set(0, id);
        set(1, fieldName);
        set(2, fieldTitle);
        set(3, fieldType);
        set(4, priority);
        set(5, isBasic);
        set(6, createTime);
        set(7, updateTime);
        set(8, disable);
        set(9, companyId);
        set(10, required);
        set(11, fieldDescription);
        set(12, map);
        set(13, constantParentCode);
        set(14, parentId);
        set(15, validateRe);
        set(16, errorMsg);
        set(17, fieldValue);
    }
}
