/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrAppExportFieldsRecord;

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
 * 自定义简历模板导出字段表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAppExportFields extends TableImpl<HrAppExportFieldsRecord> {

    private static final long serialVersionUID = -1569312684;

    /**
     * The reference instance of <code>hrdb.hr_app_export_fields</code>
     */
    public static final HrAppExportFields HR_APP_EXPORT_FIELDS = new HrAppExportFields();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrAppExportFieldsRecord> getRecordType() {
        return HrAppExportFieldsRecord.class;
    }

    /**
     * The column <code>hrdb.hr_app_export_fields.id</code>.
     */
    public final TableField<HrAppExportFieldsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_app_export_fields.field_name</code>. 属性含义
     */
    public final TableField<HrAppExportFieldsRecord, String> FIELD_NAME = createField("field_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "属性含义");

    /**
     * The column <code>hrdb.hr_app_export_fields.field_title</code>. 属性标题
     */
    public final TableField<HrAppExportFieldsRecord, String> FIELD_TITLE = createField("field_title", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "属性标题");

    /**
     * The column <code>hrdb.hr_app_export_fields.display_order</code>. 页面展示顺序
     */
    public final TableField<HrAppExportFieldsRecord, Integer> DISPLAY_ORDER = createField("display_order", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "页面展示顺序");

    /**
     * The column <code>hrdb.hr_app_export_fields.selected</code>. 是否选中;0: 未选中, 1: 选中
     */
    public final TableField<HrAppExportFieldsRecord, Integer> SELECTED = createField("selected", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否选中;0: 未选中, 1: 选中");

    /**
     * The column <code>hrdb.hr_app_export_fields.showed</code>. 默认隐藏;0: 隐藏, 1: 显示
     */
    public final TableField<HrAppExportFieldsRecord, Integer> SHOWED = createField("showed", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "默认隐藏;0: 隐藏, 1: 显示");

    /**
     * The column <code>hrdb.hr_app_export_fields.sample</code>. 示例
     */
    public final TableField<HrAppExportFieldsRecord, String> SAMPLE = createField("sample", org.jooq.impl.SQLDataType.VARCHAR.length(500).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "示例");

    /**
     * Create a <code>hrdb.hr_app_export_fields</code> table reference
     */
    public HrAppExportFields() {
        this("hr_app_export_fields", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_app_export_fields</code> table reference
     */
    public HrAppExportFields(String alias) {
        this(alias, HR_APP_EXPORT_FIELDS);
    }

    private HrAppExportFields(String alias, Table<HrAppExportFieldsRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrAppExportFields(String alias, Table<HrAppExportFieldsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "自定义简历模板导出字段表");
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
    public Identity<HrAppExportFieldsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_APP_EXPORT_FIELDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrAppExportFieldsRecord> getPrimaryKey() {
        return Keys.KEY_HR_APP_EXPORT_FIELDS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrAppExportFieldsRecord>> getKeys() {
        return Arrays.<UniqueKey<HrAppExportFieldsRecord>>asList(Keys.KEY_HR_APP_EXPORT_FIELDS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAppExportFields as(String alias) {
        return new HrAppExportFields(alias, this);
    }

    /**
     * Rename this table
     */
    public HrAppExportFields rename(String name) {
        return new HrAppExportFields(name, null);
    }
}
