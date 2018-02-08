/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrCmsMediaRecord;

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
 * 微信端新jd模块具体内容项
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCmsMedia extends TableImpl<HrCmsMediaRecord> {

    private static final long serialVersionUID = -1122331303;

    /**
     * The reference instance of <code>hrdb.hr_cms_media</code>
     */
    public static final HrCmsMedia HR_CMS_MEDIA = new HrCmsMedia();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrCmsMediaRecord> getRecordType() {
        return HrCmsMediaRecord.class;
    }

    /**
     * The column <code>hrdb.hr_cms_media.id</code>.
     */
    public final TableField<HrCmsMediaRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_cms_media.module_id</code>. 模块id即hr_cms_module.id
     */
    public final TableField<HrCmsMediaRecord, Integer> MODULE_ID = createField("module_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "模块id即hr_cms_module.id");

    /**
     * The column <code>hrdb.hr_cms_media.longtexts</code>. 描述
     */
    public final TableField<HrCmsMediaRecord, String> LONGTEXTS = createField("longtexts", org.jooq.impl.SQLDataType.VARCHAR.length(2048).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "描述");

    /**
     * The column <code>hrdb.hr_cms_media.attrs</code>. 扩展字段，地图存json
     */
    public final TableField<HrCmsMediaRecord, String> ATTRS = createField("attrs", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "扩展字段，地图存json");

    /**
     * The column <code>hrdb.hr_cms_media.title</code>. 模板名称
     */
    public final TableField<HrCmsMediaRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "模板名称");

    /**
     * The column <code>hrdb.hr_cms_media.sub_title</code>. 模板子名称
     */
    public final TableField<HrCmsMediaRecord, String> SUB_TITLE = createField("sub_title", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "模板子名称");

    /**
     * The column <code>hrdb.hr_cms_media.link</code>. 模板链接
     */
    public final TableField<HrCmsMediaRecord, String> LINK = createField("link", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "模板链接");

    /**
     * The column <code>hrdb.hr_cms_media.res_id</code>. 资源hr_resource.id
     */
    public final TableField<HrCmsMediaRecord, Integer> RES_ID = createField("res_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "资源hr_resource.id");

    /**
     * The column <code>hrdb.hr_cms_media.orders</code>. 顺序
     */
    public final TableField<HrCmsMediaRecord, Integer> ORDERS = createField("orders", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "顺序");

    /**
     * The column <code>hrdb.hr_cms_media.is_show</code>. 是否显示
     */
    public final TableField<HrCmsMediaRecord, Integer> IS_SHOW = createField("is_show", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "是否显示");

    /**
     * The column <code>hrdb.hr_cms_media.disable</code>. 状态 0 是有效 1是无效
     */
    public final TableField<HrCmsMediaRecord, Integer> DISABLE = createField("disable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "状态 0 是有效 1是无效");

    /**
     * The column <code>hrdb.hr_cms_media.create_time</code>.
     */
    public final TableField<HrCmsMediaRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>hrdb.hr_cms_media.update_time</code>.
     */
    public final TableField<HrCmsMediaRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>hrdb.hr_cms_media.res_attrs</code>. 素材库图片处理参数,七牛格式
     */
    public final TableField<HrCmsMediaRecord, String> RES_ATTRS = createField("res_attrs", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "素材库图片处理参数,七牛格式");

    /**
     * Create a <code>hrdb.hr_cms_media</code> table reference
     */
    public HrCmsMedia() {
        this("hr_cms_media", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_cms_media</code> table reference
     */
    public HrCmsMedia(String alias) {
        this(alias, HR_CMS_MEDIA);
    }

    private HrCmsMedia(String alias, Table<HrCmsMediaRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrCmsMedia(String alias, Table<HrCmsMediaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "微信端新jd模块具体内容项");
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
    public Identity<HrCmsMediaRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_CMS_MEDIA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrCmsMediaRecord> getPrimaryKey() {
        return Keys.KEY_HR_CMS_MEDIA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrCmsMediaRecord>> getKeys() {
        return Arrays.<UniqueKey<HrCmsMediaRecord>>asList(Keys.KEY_HR_CMS_MEDIA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCmsMedia as(String alias) {
        return new HrCmsMedia(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrCmsMedia rename(String name) {
        return new HrCmsMedia(name, null);
    }
}
