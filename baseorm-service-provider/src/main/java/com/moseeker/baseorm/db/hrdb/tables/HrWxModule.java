/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrWxModuleRecord;

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
import org.jooq.types.UByte;


/**
 * 微信模块表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxModule extends TableImpl<HrWxModuleRecord> {

    private static final long serialVersionUID = 1802738567;

    /**
     * The reference instance of <code>hrdb.hr_wx_module</code>
     */
    public static final HrWxModule HR_WX_MODULE = new HrWxModule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrWxModuleRecord> getRecordType() {
        return HrWxModuleRecord.class;
    }

    /**
     * The column <code>hrdb.hr_wx_module.id</code>.
     */
    public final TableField<HrWxModuleRecord, UByte> ID = createField("id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_wx_module.name</code>. 标识
     */
    public final TableField<HrWxModuleRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "标识");

    /**
     * The column <code>hrdb.hr_wx_module.title</code>. 名称
     */
    public final TableField<HrWxModuleRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "名称");

    /**
     * The column <code>hrdb.hr_wx_module.version</code>. 版本
     */
    public final TableField<HrWxModuleRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "版本");

    /**
     * The column <code>hrdb.hr_wx_module.ability</code>. 功能描述
     */
    public final TableField<HrWxModuleRecord, String> ABILITY = createField("ability", org.jooq.impl.SQLDataType.VARCHAR.length(500).nullable(false), this, "功能描述");

    /**
     * The column <code>hrdb.hr_wx_module.description</code>. 介绍
     */
    public final TableField<HrWxModuleRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false), this, "介绍");

    /**
     * The column <code>hrdb.hr_wx_module.author</code>. 作者
     */
    public final TableField<HrWxModuleRecord, String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "作者");

    /**
     * The column <code>hrdb.hr_wx_module.url</code>. 发布页面
     */
    public final TableField<HrWxModuleRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "发布页面");

    /**
     * The column <code>hrdb.hr_wx_module.settings</code>. 扩展设置项
     */
    public final TableField<HrWxModuleRecord, Byte> SETTINGS = createField("settings", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "扩展设置项");

    /**
     * The column <code>hrdb.hr_wx_module.subscribes</code>. 订阅的消息类型
     */
    public final TableField<HrWxModuleRecord, String> SUBSCRIBES = createField("subscribes", org.jooq.impl.SQLDataType.VARCHAR.length(500).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "订阅的消息类型");

    /**
     * The column <code>hrdb.hr_wx_module.handles</code>. 能够直接处理的消息类型
     */
    public final TableField<HrWxModuleRecord, String> HANDLES = createField("handles", org.jooq.impl.SQLDataType.VARCHAR.length(500).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "能够直接处理的消息类型");

    /**
     * The column <code>hrdb.hr_wx_module.isrulefields</code>. 是否有规则嵌入项
     */
    public final TableField<HrWxModuleRecord, Byte> ISRULEFIELDS = createField("isrulefields", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否有规则嵌入项");

    /**
     * The column <code>hrdb.hr_wx_module.home</code>. 是否微站首页嵌入
     */
    public final TableField<HrWxModuleRecord, Byte> HOME = createField("home", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否微站首页嵌入");

    /**
     * The column <code>hrdb.hr_wx_module.issystem</code>. 是否是系统模块
     */
    public final TableField<HrWxModuleRecord, UByte> ISSYSTEM = createField("issystem", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "是否是系统模块");

    /**
     * The column <code>hrdb.hr_wx_module.options</code>. 扩展功能导航项
     */
    public final TableField<HrWxModuleRecord, String> OPTIONS = createField("options", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "扩展功能导航项");

    /**
     * The column <code>hrdb.hr_wx_module.profile</code>. 是否个人中心嵌入
     */
    public final TableField<HrWxModuleRecord, Byte> PROFILE = createField("profile", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否个人中心嵌入");

    /**
     * The column <code>hrdb.hr_wx_module.site_menus</code>. 微站功能扩展导航项
     */
    public final TableField<HrWxModuleRecord, String> SITE_MENUS = createField("site_menus", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微站功能扩展导航项");

    /**
     * The column <code>hrdb.hr_wx_module.platform_menus</code>. 微站功能扩展导航项
     */
    public final TableField<HrWxModuleRecord, String> PLATFORM_MENUS = createField("platform_menus", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "微站功能扩展导航项");

    /**
     * Create a <code>hrdb.hr_wx_module</code> table reference
     */
    public HrWxModule() {
        this("hr_wx_module", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_wx_module</code> table reference
     */
    public HrWxModule(String alias) {
        this(alias, HR_WX_MODULE);
    }

    private HrWxModule(String alias, Table<HrWxModuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrWxModule(String alias, Table<HrWxModuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "微信模块表");
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
    public Identity<HrWxModuleRecord, UByte> getIdentity() {
        return Keys.IDENTITY_HR_WX_MODULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrWxModuleRecord> getPrimaryKey() {
        return Keys.KEY_HR_WX_MODULE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrWxModuleRecord>> getKeys() {
        return Arrays.<UniqueKey<HrWxModuleRecord>>asList(Keys.KEY_HR_WX_MODULE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxModule as(String alias) {
        return new HrWxModule(alias, this);
    }

    /**
     * Rename this table
     */
    public HrWxModule rename(String name) {
        return new HrWxModule(name, null);
    }
}
