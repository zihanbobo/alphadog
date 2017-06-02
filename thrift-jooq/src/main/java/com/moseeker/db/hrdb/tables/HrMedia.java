/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables;


import com.moseeker.db.hrdb.Hrdb;
import com.moseeker.db.hrdb.Keys;
import com.moseeker.db.hrdb.tables.records.HrMediaRecord;

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
 * 模板媒体表，存储模板渲染的媒体信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrMedia extends TableImpl<HrMediaRecord> {

    private static final long serialVersionUID = 349194181;

    /**
     * The reference instance of <code>hrdb.hr_media</code>
     */
    public static final HrMedia HR_MEDIA = new HrMedia();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrMediaRecord> getRecordType() {
        return HrMediaRecord.class;
    }

    /**
     * The column <code>hrdb.hr_media.id</code>.
     */
    public final TableField<HrMediaRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_media.longtext</code>. 描述
     */
    public final TableField<HrMediaRecord, String> LONGTEXT = createField("longtext", org.jooq.impl.SQLDataType.VARCHAR.length(2048).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "描述");

    /**
     * The column <code>hrdb.hr_media.attrs</code>. 客户属性，可选 字段
     */
    public final TableField<HrMediaRecord, String> ATTRS = createField("attrs", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "客户属性，可选 字段");

    /**
     * The column <code>hrdb.hr_media.title</code>. 模板名称
     */
    public final TableField<HrMediaRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "模板名称");

    /**
     * The column <code>hrdb.hr_media.sub_title</code>. 模板子名称
     */
    public final TableField<HrMediaRecord, String> SUB_TITLE = createField("sub_title", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "模板子名称");

    /**
     * The column <code>hrdb.hr_media.link</code>. 模板链接
     */
    public final TableField<HrMediaRecord, String> LINK = createField("link", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "模板链接");

    /**
     * The column <code>hrdb.hr_media.res_id</code>. 资源hr_resource.id
     */
    public final TableField<HrMediaRecord, Integer> RES_ID = createField("res_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "资源hr_resource.id");

    /**
     * Create a <code>hrdb.hr_media</code> table reference
     */
    public HrMedia() {
        this("hr_media", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_media</code> table reference
     */
    public HrMedia(String alias) {
        this(alias, HR_MEDIA);
    }

    private HrMedia(String alias, Table<HrMediaRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrMedia(String alias, Table<HrMediaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "模板媒体表，存储模板渲染的媒体信息");
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
    public Identity<HrMediaRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_MEDIA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrMediaRecord> getPrimaryKey() {
        return Keys.KEY_HR_MEDIA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrMediaRecord>> getKeys() {
        return Arrays.<UniqueKey<HrMediaRecord>>asList(Keys.KEY_HR_MEDIA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrMedia as(String alias) {
        return new HrMedia(alias, this);
    }

    /**
     * Rename this table
     */
    public HrMedia rename(String name) {
        return new HrMedia(name, null);
    }
}
