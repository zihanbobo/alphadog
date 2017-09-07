/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrGroupCompanyRelRecord;

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
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrGroupCompanyRel extends TableImpl<HrGroupCompanyRelRecord> {

    private static final long serialVersionUID = 609025105;

    /**
     * The reference instance of <code>hrdb.hr_group_company_rel</code>
     */
    public static final HrGroupCompanyRel HR_GROUP_COMPANY_REL = new HrGroupCompanyRel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrGroupCompanyRelRecord> getRecordType() {
        return HrGroupCompanyRelRecord.class;
    }

    /**
     * The column <code>hrdb.hr_group_company_rel.id</code>.
     */
    public final TableField<HrGroupCompanyRelRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_group_company_rel.company_id</code>. 公司ID
     */
    public final TableField<HrGroupCompanyRelRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER, this, "公司ID");

    /**
     * The column <code>hrdb.hr_group_company_rel.group_id</code>. 集团ID
     */
    public final TableField<HrGroupCompanyRelRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER, this, "集团ID");

    /**
     * The column <code>hrdb.hr_group_company_rel.create_time</code>.
     */
    public final TableField<HrGroupCompanyRelRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>hrdb.hr_group_company_rel.update_time</code>.
     */
    public final TableField<HrGroupCompanyRelRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>hrdb.hr_group_company_rel</code> table reference
     */
    public HrGroupCompanyRel() {
        this("hr_group_company_rel", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_group_company_rel</code> table reference
     */
    public HrGroupCompanyRel(String alias) {
        this(alias, HR_GROUP_COMPANY_REL);
    }

    private HrGroupCompanyRel(String alias, Table<HrGroupCompanyRelRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrGroupCompanyRel(String alias, Table<HrGroupCompanyRelRecord> aliased, Field<?>[] parameters) {
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
    public Identity<HrGroupCompanyRelRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_GROUP_COMPANY_REL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrGroupCompanyRelRecord> getPrimaryKey() {
        return Keys.KEY_HR_GROUP_COMPANY_REL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrGroupCompanyRelRecord>> getKeys() {
        return Arrays.<UniqueKey<HrGroupCompanyRelRecord>>asList(Keys.KEY_HR_GROUP_COMPANY_REL_PRIMARY, Keys.KEY_HR_GROUP_COMPANY_REL_COMPANY_ID, Keys.KEY_HR_GROUP_COMPANY_REL_COMPANY_ID_2, Keys.KEY_HR_GROUP_COMPANY_REL_COMPANY_ID_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrGroupCompanyRel as(String alias) {
        return new HrGroupCompanyRel(alias, this);
    }

    /**
     * Rename this table
     */
    public HrGroupCompanyRel rename(String name) {
        return new HrGroupCompanyRel(name, null);
    }
}
