/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables;


import com.moseeker.baseorm.db.configdb.Configdb;
import com.moseeker.baseorm.db.configdb.Keys;
import com.moseeker.baseorm.db.configdb.tables.records.ConfigAtsApplicationShowFieldRecord;

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
 * 招聘管理自定义可显示字段基表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigAtsApplicationShowField extends TableImpl<ConfigAtsApplicationShowFieldRecord> {

    private static final long serialVersionUID = 604226722;

    /**
     * The reference instance of <code>configdb.config_ats_application_show_field</code>
     */
    public static final ConfigAtsApplicationShowField CONFIG_ATS_APPLICATION_SHOW_FIELD = new ConfigAtsApplicationShowField();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConfigAtsApplicationShowFieldRecord> getRecordType() {
        return ConfigAtsApplicationShowFieldRecord.class;
    }

    /**
     * The column <code>configdb.config_ats_application_show_field.id</code>.
     */
    public final TableField<ConfigAtsApplicationShowFieldRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>configdb.config_ats_application_show_field.name</code>. 自定义的字段的名称
     */
    public final TableField<ConfigAtsApplicationShowFieldRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "自定义的字段的名称");

    /**
     * The column <code>configdb.config_ats_application_show_field.field_name</code>. 自定义字段对应数据库字段的列名
     */
    public final TableField<ConfigAtsApplicationShowFieldRecord, String> FIELD_NAME = createField("field_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "自定义字段对应数据库字段的列名");

    /**
     * The column <code>configdb.config_ats_application_show_field.company_id</code>. 公司编号
     */
    public final TableField<ConfigAtsApplicationShowFieldRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "公司编号");

    /**
     * The column <code>configdb.config_ats_application_show_field.disable</code>. 0有效 1无效 
     */
    public final TableField<ConfigAtsApplicationShowFieldRecord, Integer> DISABLE = createField("disable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0有效 1无效 ");

    /**
     * The column <code>configdb.config_ats_application_show_field.create_time</code>. 创建时间
     */
    public final TableField<ConfigAtsApplicationShowFieldRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>configdb.config_ats_application_show_field.update_time</code>. 更新时间
     */
    public final TableField<ConfigAtsApplicationShowFieldRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>configdb.config_ats_application_show_field</code> table reference
     */
    public ConfigAtsApplicationShowField() {
        this("config_ats_application_show_field", null);
    }

    /**
     * Create an aliased <code>configdb.config_ats_application_show_field</code> table reference
     */
    public ConfigAtsApplicationShowField(String alias) {
        this(alias, CONFIG_ATS_APPLICATION_SHOW_FIELD);
    }

    private ConfigAtsApplicationShowField(String alias, Table<ConfigAtsApplicationShowFieldRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConfigAtsApplicationShowField(String alias, Table<ConfigAtsApplicationShowFieldRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "招聘管理自定义可显示字段基表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Configdb.CONFIGDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ConfigAtsApplicationShowFieldRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONFIG_ATS_APPLICATION_SHOW_FIELD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ConfigAtsApplicationShowFieldRecord> getPrimaryKey() {
        return Keys.KEY_CONFIG_ATS_APPLICATION_SHOW_FIELD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ConfigAtsApplicationShowFieldRecord>> getKeys() {
        return Arrays.<UniqueKey<ConfigAtsApplicationShowFieldRecord>>asList(Keys.KEY_CONFIG_ATS_APPLICATION_SHOW_FIELD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigAtsApplicationShowField as(String alias) {
        return new ConfigAtsApplicationShowField(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConfigAtsApplicationShowField rename(String name) {
        return new ConfigAtsApplicationShowField(name, null);
    }
}
