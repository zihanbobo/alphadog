/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrGroupCompanyRecord;

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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrGroupCompany extends TableImpl<HrGroupCompanyRecord> {

    private static final long serialVersionUID = -860101503;

    /**
     * The reference instance of <code>hrdb.hr_group_company</code>
     */
    public static final HrGroupCompany HR_GROUP_COMPANY = new HrGroupCompany();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrGroupCompanyRecord> getRecordType() {
        return HrGroupCompanyRecord.class;
    }

    /**
     * The column <code>hrdb.hr_group_company.id</code>.
     */
    public final TableField<HrGroupCompanyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_group_company.name</code>. 集团名称
     */
    public final TableField<HrGroupCompanyRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "集团名称");

    /**
     * The column <code>hrdb.hr_group_company.create_time</code>. 创建时间
     */
    public final TableField<HrGroupCompanyRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_group_company.update_time</code>. 更新时间
     */
    public final TableField<HrGroupCompanyRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>hrdb.hr_group_company</code> table reference
     */
    public HrGroupCompany() {
        this("hr_group_company", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_group_company</code> table reference
     */
    public HrGroupCompany(String alias) {
        this(alias, HR_GROUP_COMPANY);
    }

    private HrGroupCompany(String alias, Table<HrGroupCompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrGroupCompany(String alias, Table<HrGroupCompanyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public Identity<HrGroupCompanyRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_GROUP_COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrGroupCompanyRecord> getPrimaryKey() {
        return Keys.KEY_HR_GROUP_COMPANY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrGroupCompanyRecord>> getKeys() {
        return Arrays.<UniqueKey<HrGroupCompanyRecord>>asList(Keys.KEY_HR_GROUP_COMPANY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrGroupCompany as(String alias) {
        return new HrGroupCompany(alias, this);
    }

    /**
     * Rename this table
     */
    public HrGroupCompany rename(String name) {
        return new HrGroupCompany(name, null);
    }
}
