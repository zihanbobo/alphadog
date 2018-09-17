/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables;


import com.moseeker.baseorm.db.historydb.Historydb;
import com.moseeker.baseorm.db.historydb.Keys;
import com.moseeker.baseorm.db.historydb.tables.records.ConfigSysCvTplRecord;

import java.sql.Timestamp;
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
public class ConfigSysCvTpl extends TableImpl<ConfigSysCvTplRecord> {

    private static final long serialVersionUID = -554009382;

    /**
     * The reference instance of <code>historydb.config_sys_cv_tpl</code>
     */
    public static final ConfigSysCvTpl CONFIG_SYS_CV_TPL = new ConfigSysCvTpl();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConfigSysCvTplRecord> getRecordType() {
        return ConfigSysCvTplRecord.class;
    }

    /**
     * The column <code>historydb.config_sys_cv_tpl.id</code>.
     */
    public final TableField<ConfigSysCvTplRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>historydb.config_sys_cv_tpl.field_name</code>. 属性含义
     */
    public final TableField<ConfigSysCvTplRecord, String> FIELD_NAME = createField("field_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "属性含义");

    /**
     * The column <code>historydb.config_sys_cv_tpl.field_title</code>. 属性标题
     */
    public final TableField<ConfigSysCvTplRecord, String> FIELD_TITLE = createField("field_title", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "属性标题");

    /**
     * The column <code>historydb.config_sys_cv_tpl.field_type</code>. 属性类型 0:短文本, 1:长文本,  2:多选, 3:单选, 4:长tag, 5:tag:, 6:时间, 7:img, 8:复合字段-单条, 9:复合字段-多条,10:下拉列表, 11:数字输入框(用于校验) 12:城市选择控件 13:英文文本
     */
    public final TableField<ConfigSysCvTplRecord, Integer> FIELD_TYPE = createField("field_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "属性类型 0:短文本, 1:长文本,  2:多选, 3:单选, 4:长tag, 5:tag:, 6:时间, 7:img, 8:复合字段-单条, 9:复合字段-多条,10:下拉列表, 11:数字输入框(用于校验) 12:城市选择控件 13:英文文本");

    /**
     * The column <code>historydb.config_sys_cv_tpl.field_value</code>. 微信端页面标签默认值
     */
    public final TableField<ConfigSysCvTplRecord, String> FIELD_VALUE = createField("field_value", org.jooq.impl.SQLDataType.VARCHAR.length(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微信端页面标签默认值");

    /**
     * The column <code>historydb.config_sys_cv_tpl.priority</code>. 排序字段
     */
    public final TableField<ConfigSysCvTplRecord, Integer> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "排序字段");

    /**
     * The column <code>historydb.config_sys_cv_tpl.is_basic</code>. 属性类型 0：常用字段 1：校招常用 2：蓝领常用
     */
    public final TableField<ConfigSysCvTplRecord, Integer> IS_BASIC = createField("is_basic", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "属性类型 0：常用字段 1：校招常用 2：蓝领常用");

    /**
     * The column <code>historydb.config_sys_cv_tpl.create_time</code>.
     */
    public final TableField<ConfigSysCvTplRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>historydb.config_sys_cv_tpl.update_time</code>.
     */
    public final TableField<ConfigSysCvTplRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>historydb.config_sys_cv_tpl.disable</code>. 是否禁用 0：可用1：不可用
     */
    public final TableField<ConfigSysCvTplRecord, Integer> DISABLE = createField("disable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否禁用 0：可用1：不可用");

    /**
     * The column <code>historydb.config_sys_cv_tpl.company_id</code>. 所属公司。如果是私有属性，则存在所属公司部门编号；如果不是则为0
     */
    public final TableField<ConfigSysCvTplRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "所属公司。如果是私有属性，则存在所属公司部门编号；如果不是则为0");

    /**
     * The column <code>historydb.config_sys_cv_tpl.required</code>. 是否必填项 0：必填项 1：选填项
     */
    public final TableField<ConfigSysCvTplRecord, Integer> REQUIRED = createField("required", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否必填项 0：必填项 1：选填项");

    /**
     * The column <code>historydb.config_sys_cv_tpl.field_description</code>. 雇主平台页面显示值
     */
    public final TableField<ConfigSysCvTplRecord, String> FIELD_DESCRIPTION = createField("field_description", org.jooq.impl.SQLDataType.VARCHAR.length(500).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "雇主平台页面显示值");

    /**
     * The column <code>historydb.config_sys_cv_tpl.map</code>. 与profile的映射关系
     */
    public final TableField<ConfigSysCvTplRecord, String> MAP = createField("map", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "与profile的映射关系");

    /**
     * Create a <code>historydb.config_sys_cv_tpl</code> table reference
     */
    public ConfigSysCvTpl() {
        this("config_sys_cv_tpl", null);
    }

    /**
     * Create an aliased <code>historydb.config_sys_cv_tpl</code> table reference
     */
    public ConfigSysCvTpl(String alias) {
        this(alias, CONFIG_SYS_CV_TPL);
    }

    private ConfigSysCvTpl(String alias, Table<ConfigSysCvTplRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConfigSysCvTpl(String alias, Table<ConfigSysCvTplRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "简历模板库");
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
    public Identity<ConfigSysCvTplRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONFIG_SYS_CV_TPL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ConfigSysCvTplRecord> getPrimaryKey() {
        return Keys.KEY_CONFIG_SYS_CV_TPL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ConfigSysCvTplRecord>> getKeys() {
        return Arrays.<UniqueKey<ConfigSysCvTplRecord>>asList(Keys.KEY_CONFIG_SYS_CV_TPL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigSysCvTpl as(String alias) {
        return new ConfigSysCvTpl(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConfigSysCvTpl rename(String name) {
        return new ConfigSysCvTpl(name, null);
    }
}
