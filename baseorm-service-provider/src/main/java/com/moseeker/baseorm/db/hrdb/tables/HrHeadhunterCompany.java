/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrHeadhunterCompanyRecord;

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
 * 猎头公司表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrHeadhunterCompany extends TableImpl<HrHeadhunterCompanyRecord> {

    private static final long serialVersionUID = -796005781;

    /**
     * The reference instance of <code>hrdb.hr_headhunter_company</code>
     */
    public static final HrHeadhunterCompany HR_HEADHUNTER_COMPANY = new HrHeadhunterCompany();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrHeadhunterCompanyRecord> getRecordType() {
        return HrHeadhunterCompanyRecord.class;
    }

    /**
     * The column <code>hrdb.hr_headhunter_company.id</code>. 主键
     */
    public final TableField<HrHeadhunterCompanyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主键");

    /**
     * The column <code>hrdb.hr_headhunter_company.name</code>. 猎头公司名称
     */
    public final TableField<HrHeadhunterCompanyRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "猎头公司名称");

    /**
     * The column <code>hrdb.hr_headhunter_company.short_name</code>. 猎头公司简称
     */
    public final TableField<HrHeadhunterCompanyRecord, String> SHORT_NAME = createField("short_name", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "猎头公司简称");

    /**
     * The column <code>hrdb.hr_headhunter_company.company_id</code>. 公司id
     */
    public final TableField<HrHeadhunterCompanyRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "公司id");

    /**
     * The column <code>hrdb.hr_headhunter_company.create_time</code>. 创建时间
     */
    public final TableField<HrHeadhunterCompanyRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_headhunter_company.update_time</code>. 更新时间
     */
    public final TableField<HrHeadhunterCompanyRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>hrdb.hr_headhunter_company</code> table reference
     */
    public HrHeadhunterCompany() {
        this("hr_headhunter_company", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_headhunter_company</code> table reference
     */
    public HrHeadhunterCompany(String alias) {
        this(alias, HR_HEADHUNTER_COMPANY);
    }

    private HrHeadhunterCompany(String alias, Table<HrHeadhunterCompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrHeadhunterCompany(String alias, Table<HrHeadhunterCompanyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "猎头公司表");
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
    public Identity<HrHeadhunterCompanyRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_HEADHUNTER_COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrHeadhunterCompanyRecord> getPrimaryKey() {
        return Keys.KEY_HR_HEADHUNTER_COMPANY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrHeadhunterCompanyRecord>> getKeys() {
        return Arrays.<UniqueKey<HrHeadhunterCompanyRecord>>asList(Keys.KEY_HR_HEADHUNTER_COMPANY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHeadhunterCompany as(String alias) {
        return new HrHeadhunterCompany(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrHeadhunterCompany rename(String name) {
        return new HrHeadhunterCompany(name, null);
    }
}