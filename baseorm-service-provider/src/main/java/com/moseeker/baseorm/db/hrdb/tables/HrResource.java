/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrResourceRecord;

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
 * 资源集合表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrResource extends TableImpl<HrResourceRecord> {

    private static final long serialVersionUID = 1914116144;

    /**
     * The reference instance of <code>hrdb.hr_resource</code>
     */
    public static final HrResource HR_RESOURCE = new HrResource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrResourceRecord> getRecordType() {
        return HrResourceRecord.class;
    }

    /**
     * The column <code>hrdb.hr_resource.id</code>.
     */
    public final TableField<HrResourceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_resource.res_url</code>. 资源链接
     */
    public final TableField<HrResourceRecord, String> RES_URL = createField("res_url", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "资源链接");

    /**
     * The column <code>hrdb.hr_resource.res_type</code>. 0: image  1: video
     */
    public final TableField<HrResourceRecord, Integer> RES_TYPE = createField("res_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0: image  1: video");

    /**
     * The column <code>hrdb.hr_resource.remark</code>. 备注资源
     */
    public final TableField<HrResourceRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR.length(2048).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "备注资源");

    /**
     * Create a <code>hrdb.hr_resource</code> table reference
     */
    public HrResource() {
        this("hr_resource", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_resource</code> table reference
     */
    public HrResource(String alias) {
        this(alias, HR_RESOURCE);
    }

    private HrResource(String alias, Table<HrResourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrResource(String alias, Table<HrResourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "资源集合表");
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
    public Identity<HrResourceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_RESOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrResourceRecord> getPrimaryKey() {
        return Keys.KEY_HR_RESOURCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrResourceRecord>> getKeys() {
        return Arrays.<UniqueKey<HrResourceRecord>>asList(Keys.KEY_HR_RESOURCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrResource as(String alias) {
        return new HrResource(alias, this);
    }

    /**
     * Rename this table
     */
    public HrResource rename(String name) {
        return new HrResource(name, null);
    }
}