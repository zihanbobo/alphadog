/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables;


import com.moseeker.baseorm.db.userdb.Keys;
import com.moseeker.baseorm.db.userdb.Userdb;
import com.moseeker.baseorm.db.userdb.tables.records.EmployeeAwardRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployeeAward extends TableImpl<EmployeeAwardRecord> {

    private static final long serialVersionUID = 1360375339;

    /**
     * The reference instance of <code>userdb.employee_award</code>
     */
    public static final EmployeeAward EMPLOYEE_AWARD = new EmployeeAward();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeeAwardRecord> getRecordType() {
        return EmployeeAwardRecord.class;
    }

    /**
     * The column <code>userdb.employee_award.id</code>.
     */
    public final TableField<EmployeeAwardRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>userdb.employee_award.company_id</code>.
     */
    public final TableField<EmployeeAwardRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>userdb.employee_award.employee_id</code>.
     */
    public final TableField<EmployeeAwardRecord, Integer> EMPLOYEE_ID = createField("employee_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>userdb.employee_award.award</code>.
     */
    public final TableField<EmployeeAwardRecord, String> AWARD = createField("award", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>userdb.employee_award.creat_time</code>.
     */
    public final TableField<EmployeeAwardRecord, Timestamp> CREAT_TIME = createField("creat_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>userdb.employee_award.update_time</code>.
     */
    public final TableField<EmployeeAwardRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>userdb.employee_award</code> table reference
     */
    public EmployeeAward() {
        this("employee_award", null);
    }

    /**
     * Create an aliased <code>userdb.employee_award</code> table reference
     */
    public EmployeeAward(String alias) {
        this(alias, EMPLOYEE_AWARD);
    }

    private EmployeeAward(String alias, Table<EmployeeAwardRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmployeeAward(String alias, Table<EmployeeAwardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Userdb.USERDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmployeeAwardRecord> getPrimaryKey() {
        return Keys.KEY_EMPLOYEE_AWARD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmployeeAwardRecord>> getKeys() {
        return Arrays.<UniqueKey<EmployeeAwardRecord>>asList(Keys.KEY_EMPLOYEE_AWARD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeAward as(String alias) {
        return new EmployeeAward(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmployeeAward rename(String name) {
        return new EmployeeAward(name, null);
    }
}