/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.Keys;
import com.moseeker.baseorm.db.analytics.tables.records.StHrLoginRecord;

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
 * 用于统计雇主登录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StHrLogin extends TableImpl<StHrLoginRecord> {

    private static final long serialVersionUID = 289429326;

    /**
     * The reference instance of <code>analytics.st_hr_login</code>
     */
    public static final StHrLogin ST_HR_LOGIN = new StHrLogin();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StHrLoginRecord> getRecordType() {
        return StHrLoginRecord.class;
    }

    /**
     * The column <code>analytics.st_hr_login.id</code>.
     */
    public final TableField<StHrLoginRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>analytics.st_hr_login.create_time</code>.
     */
    public final TableField<StHrLoginRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>analytics.st_hr_login.employee_id</code>. 对应sys_employee表的id
     */
    public final TableField<StHrLoginRecord, String> EMPLOYEE_ID = createField("employee_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "对应sys_employee表的id");

    /**
     * The column <code>analytics.st_hr_login.department_id</code>. 所属部门id
     */
    public final TableField<StHrLoginRecord, Integer> DEPARTMENT_ID = createField("department_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "所属部门id");

    /**
     * Create a <code>analytics.st_hr_login</code> table reference
     */
    public StHrLogin() {
        this("st_hr_login", null);
    }

    /**
     * Create an aliased <code>analytics.st_hr_login</code> table reference
     */
    public StHrLogin(String alias) {
        this(alias, ST_HR_LOGIN);
    }

    private StHrLogin(String alias, Table<StHrLoginRecord> aliased) {
        this(alias, aliased, null);
    }

    private StHrLogin(String alias, Table<StHrLoginRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用于统计雇主登录");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Analytics.ANALYTICS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StHrLoginRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ST_HR_LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StHrLoginRecord> getPrimaryKey() {
        return Keys.KEY_ST_HR_LOGIN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StHrLoginRecord>> getKeys() {
        return Arrays.<UniqueKey<StHrLoginRecord>>asList(Keys.KEY_ST_HR_LOGIN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StHrLogin as(String alias) {
        return new StHrLogin(alias, this);
    }

    /**
     * Rename this table
     */
    public StHrLogin rename(String name) {
        return new StHrLogin(name, null);
    }
}
