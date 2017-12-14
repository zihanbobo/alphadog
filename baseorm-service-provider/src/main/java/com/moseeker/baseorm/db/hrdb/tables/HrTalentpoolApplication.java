/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrTalentpoolApplicationRecord;

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
 * hr申请人才库记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrTalentpoolApplication extends TableImpl<HrTalentpoolApplicationRecord> {

    private static final long serialVersionUID = 327384522;

    /**
     * The reference instance of <code>hrdb.hr_talentpool_application</code>
     */
    public static final HrTalentpoolApplication HR_TALENTPOOL_APPLICATION = new HrTalentpoolApplication();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrTalentpoolApplicationRecord> getRecordType() {
        return HrTalentpoolApplicationRecord.class;
    }

    /**
     * The column <code>hrdb.hr_talentpool_application.id</code>.
     */
    public final TableField<HrTalentpoolApplicationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_talentpool_application.hr_id</code>. user_hr_account hr的主账号
     */
    public final TableField<HrTalentpoolApplicationRecord, Integer> HR_ID = createField("hr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "user_hr_account hr的主账号");

    /**
     * The column <code>hrdb.hr_talentpool_application.company_id</code>. 所属公司id
     */
    public final TableField<HrTalentpoolApplicationRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "所属公司id");

    /**
     * The column <code>hrdb.hr_talentpool_application.create_time</code>. 创建时间
     */
    public final TableField<HrTalentpoolApplicationRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_talentpool_application.update_time</code>. 更新时间
     */
    public final TableField<HrTalentpoolApplicationRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>hrdb.hr_talentpool_application</code> table reference
     */
    public HrTalentpoolApplication() {
        this("hr_talentpool_application", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_talentpool_application</code> table reference
     */
    public HrTalentpoolApplication(String alias) {
        this(alias, HR_TALENTPOOL_APPLICATION);
    }

    private HrTalentpoolApplication(String alias, Table<HrTalentpoolApplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrTalentpoolApplication(String alias, Table<HrTalentpoolApplicationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "hr申请人才库记录表");
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
    public Identity<HrTalentpoolApplicationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_TALENTPOOL_APPLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrTalentpoolApplicationRecord> getPrimaryKey() {
        return Keys.KEY_HR_TALENTPOOL_APPLICATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrTalentpoolApplicationRecord>> getKeys() {
        return Arrays.<UniqueKey<HrTalentpoolApplicationRecord>>asList(Keys.KEY_HR_TALENTPOOL_APPLICATION_PRIMARY, Keys.KEY_HR_TALENTPOOL_APPLICATION_HR_TALENTPOOL_APPLICATION_HR_ID_COMPANY_ID_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrTalentpoolApplication as(String alias) {
        return new HrTalentpoolApplication(alias, this);
    }

    /**
     * Rename this table
     */

    public HrTalentpoolApplication rename(String name) {
        return new HrTalentpoolApplication(name, null);
    }
}
