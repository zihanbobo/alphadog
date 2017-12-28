/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrSuperaccountApplyRecord;

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
public class HrSuperaccountApply extends TableImpl<HrSuperaccountApplyRecord> {

    private static final long serialVersionUID = -609844031;

    /**
     * The reference instance of <code>hrdb.hr_superaccount_apply</code>
     */
    public static final HrSuperaccountApply HR_SUPERACCOUNT_APPLY = new HrSuperaccountApply();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrSuperaccountApplyRecord> getRecordType() {
        return HrSuperaccountApplyRecord.class;
    }

    /**
     * The column <code>hrdb.hr_superaccount_apply.id</code>.
     */
    public final TableField<HrSuperaccountApplyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_superaccount_apply.company_id</code>. hr_company.id
     */
    public final TableField<HrSuperaccountApplyRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "hr_company.id");

    /**
     * The column <code>hrdb.hr_superaccount_apply.licence</code>. 营业执照
     */
    public final TableField<HrSuperaccountApplyRecord, byte[]> LICENCE = createField("licence", org.jooq.impl.SQLDataType.BLOB, this, "营业执照");

    /**
     * The column <code>hrdb.hr_superaccount_apply.create_time</code>. 创建时间
     */
    public final TableField<HrSuperaccountApplyRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_superaccount_apply.update_time</code>. 修改时间
     */
    public final TableField<HrSuperaccountApplyRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>hrdb.hr_superaccount_apply.operate</code>. config_sys_administrator.id
     */
    public final TableField<HrSuperaccountApplyRecord, Integer> OPERATE = createField("operate", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "config_sys_administrator.id");

    /**
     * The column <code>hrdb.hr_superaccount_apply.status</code>. 申请状态 0表示已经通过，1表示未处理，2表示未通过
     */
    public final TableField<HrSuperaccountApplyRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "申请状态 0表示已经通过，1表示未处理，2表示未通过");

    /**
     * The column <code>hrdb.hr_superaccount_apply.message</code>. 审核留言
     */
    public final TableField<HrSuperaccountApplyRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "审核留言");

    /**
     * The column <code>hrdb.hr_superaccount_apply.child_company_id</code>. 合并的其他公司的编号：[1,2,3]
     */
    public final TableField<HrSuperaccountApplyRecord, String> CHILD_COMPANY_ID = createField("child_company_id", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "合并的其他公司的编号：[1,2,3]");

    /**
     * The column <code>hrdb.hr_superaccount_apply.migrate_time</code>. 迁移时间
     */
    public final TableField<HrSuperaccountApplyRecord, Timestamp> MIGRATE_TIME = createField("migrate_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "迁移时间");

    /**
     * The column <code>hrdb.hr_superaccount_apply.account_limit</code>. 子账号数量限制
     */
    public final TableField<HrSuperaccountApplyRecord, Integer> ACCOUNT_LIMIT = createField("account_limit", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("4", org.jooq.impl.SQLDataType.INTEGER)), this, "子账号数量限制");

    /**
     * Create a <code>hrdb.hr_superaccount_apply</code> table reference
     */
    public HrSuperaccountApply() {
        this("hr_superaccount_apply", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_superaccount_apply</code> table reference
     */
    public HrSuperaccountApply(String alias) {
        this(alias, HR_SUPERACCOUNT_APPLY);
    }

    private HrSuperaccountApply(String alias, Table<HrSuperaccountApplyRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrSuperaccountApply(String alias, Table<HrSuperaccountApplyRecord> aliased, Field<?>[] parameters) {
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
    public Identity<HrSuperaccountApplyRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_SUPERACCOUNT_APPLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrSuperaccountApplyRecord> getPrimaryKey() {
        return Keys.KEY_HR_SUPERACCOUNT_APPLY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrSuperaccountApplyRecord>> getKeys() {
        return Arrays.<UniqueKey<HrSuperaccountApplyRecord>>asList(Keys.KEY_HR_SUPERACCOUNT_APPLY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrSuperaccountApply as(String alias) {
        return new HrSuperaccountApply(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrSuperaccountApply rename(String name) {
        return new HrSuperaccountApply(name, null);
    }
}
