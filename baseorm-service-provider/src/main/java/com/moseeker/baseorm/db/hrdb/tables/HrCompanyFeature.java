/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrCompanyFeatureRecord;

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
 * 公司福利特色
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrCompanyFeature extends TableImpl<HrCompanyFeatureRecord> {

    private static final long serialVersionUID = 221013164;

    /**
     * The reference instance of <code>hrdb.hr_company_feature</code>
     */
    public static final HrCompanyFeature HR_COMPANY_FEATURE = new HrCompanyFeature();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrCompanyFeatureRecord> getRecordType() {
        return HrCompanyFeatureRecord.class;
    }

    /**
     * The column <code>hrdb.hr_company_feature.id</code>.
     */
    public final TableField<HrCompanyFeatureRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_company_feature.company_id</code>. 公司id
     */
    public final TableField<HrCompanyFeatureRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "公司id");

    /**
     * The column <code>hrdb.hr_company_feature.feature</code>. 福利特色内容
     */
    public final TableField<HrCompanyFeatureRecord, String> FEATURE = createField("feature", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "福利特色内容");

    /**
     * The column <code>hrdb.hr_company_feature.create_time</code>. 创建时间
     */
    public final TableField<HrCompanyFeatureRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_company_feature.update_time</code>. 更新时间
     */
    public final TableField<HrCompanyFeatureRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>hrdb.hr_company_feature.disable</code>. 0:无效 1:有效
     */
    public final TableField<HrCompanyFeatureRecord, Integer> DISABLE = createField("disable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0:无效 1:有效");

    /**
     * Create a <code>hrdb.hr_company_feature</code> table reference
     */
    public HrCompanyFeature() {
        this("hr_company_feature", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_company_feature</code> table reference
     */
    public HrCompanyFeature(String alias) {
        this(alias, HR_COMPANY_FEATURE);
    }

    private HrCompanyFeature(String alias, Table<HrCompanyFeatureRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrCompanyFeature(String alias, Table<HrCompanyFeatureRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "公司福利特色");
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
    public Identity<HrCompanyFeatureRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_COMPANY_FEATURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrCompanyFeatureRecord> getPrimaryKey() {
        return Keys.KEY_HR_COMPANY_FEATURE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrCompanyFeatureRecord>> getKeys() {
        return Arrays.<UniqueKey<HrCompanyFeatureRecord>>asList(Keys.KEY_HR_COMPANY_FEATURE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrCompanyFeature as(String alias) {
        return new HrCompanyFeature(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrCompanyFeature rename(String name) {
        return new HrCompanyFeature(name, null);
    }
}