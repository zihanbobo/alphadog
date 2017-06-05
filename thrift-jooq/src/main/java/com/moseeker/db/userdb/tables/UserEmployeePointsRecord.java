/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.userdb.tables;


import com.moseeker.db.userdb.Keys;
import com.moseeker.db.userdb.Userdb;
import com.moseeker.db.userdb.tables.records.UserEmployeePointsRecordRecord;

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
import org.jooq.types.UInteger;


/**
 * 员工积分记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserEmployeePointsRecord extends TableImpl<UserEmployeePointsRecordRecord> {

    private static final long serialVersionUID = -337333673;

    /**
     * The reference instance of <code>userdb.user_employee_points_record</code>
     */
    public static final UserEmployeePointsRecord USER_EMPLOYEE_POINTS_RECORD = new UserEmployeePointsRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserEmployeePointsRecordRecord> getRecordType() {
        return UserEmployeePointsRecordRecord.class;
    }

    /**
     * The column <code>userdb.user_employee_points_record.id</code>.
     */
    public final TableField<UserEmployeePointsRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>userdb.user_employee_points_record.employee_id</code>. user_employee.id
     */
    public final TableField<UserEmployeePointsRecordRecord, Long> EMPLOYEE_ID = createField("employee_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "user_employee.id");

    /**
     * The column <code>userdb.user_employee_points_record.reason</code>. 积分变更说明
     */
    public final TableField<UserEmployeePointsRecordRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "积分变更说明");

    /**
     * The column <code>userdb.user_employee_points_record.award</code>. could use positive number to add rewards to user or nagetive number to minus
     */
    public final TableField<UserEmployeePointsRecordRecord, Integer> AWARD = createField("award", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "could use positive number to add rewards to user or nagetive number to minus");

    /**
     * The column <code>userdb.user_employee_points_record._create_time</code>. time stamp when record created
     */
    public final TableField<UserEmployeePointsRecordRecord, Timestamp> _CREATE_TIME = createField("_create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "time stamp when record created");

    /**
     * The column <code>userdb.user_employee_points_record.application_id</code>. job_application.id
     */
    public final TableField<UserEmployeePointsRecordRecord, Long> APPLICATION_ID = createField("application_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "job_application.id");

    /**
     * The column <code>userdb.user_employee_points_record.recom_wxuser</code>. user_wx_user.id，推荐人的微信 id
     */
    public final TableField<UserEmployeePointsRecordRecord, Long> RECOM_WXUSER = createField("recom_wxuser", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "user_wx_user.id，推荐人的微信 id");

    /**
     * The column <code>userdb.user_employee_points_record.update_time</code>. 修改时间
     */
    public final TableField<UserEmployeePointsRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>userdb.user_employee_points_record.position_id</code>. job_position.id
     */
    public final TableField<UserEmployeePointsRecordRecord, Long> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "job_position.id");

    /**
     * The column <code>userdb.user_employee_points_record.berecom_wxuser_id</code>. 已废弃
     */
    public final TableField<UserEmployeePointsRecordRecord, Long> BERECOM_WXUSER_ID = createField("berecom_wxuser_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "已废弃");

    /**
     * The column <code>userdb.user_employee_points_record.award_config_id</code>. 积分记录来源hr_points_conf.id
     */
    public final TableField<UserEmployeePointsRecordRecord, Long> AWARD_CONFIG_ID = createField("award_config_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "积分记录来源hr_points_conf.id");

    /**
     * The column <code>userdb.user_employee_points_record.recom_user_id</code>. userdb.user_user.id 推荐者的C端账号
     */
    public final TableField<UserEmployeePointsRecordRecord, UInteger> RECOM_USER_ID = createField("recom_user_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "userdb.user_user.id 推荐者的C端账号");

    /**
     * The column <code>userdb.user_employee_points_record.berecom_user_id</code>. userdb.user_user.id 被推荐者的C端账号
     */
    public final TableField<UserEmployeePointsRecordRecord, UInteger> BERECOM_USER_ID = createField("berecom_user_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "userdb.user_user.id 被推荐者的C端账号");

    /**
     * Create a <code>userdb.user_employee_points_record</code> table reference
     */
    public UserEmployeePointsRecord() {
        this("user_employee_points_record", null);
    }

    /**
     * Create an aliased <code>userdb.user_employee_points_record</code> table reference
     */
    public UserEmployeePointsRecord(String alias) {
        this(alias, USER_EMPLOYEE_POINTS_RECORD);
    }

    private UserEmployeePointsRecord(String alias, Table<UserEmployeePointsRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserEmployeePointsRecord(String alias, Table<UserEmployeePointsRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "员工积分记录表");
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
    public Identity<UserEmployeePointsRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_EMPLOYEE_POINTS_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserEmployeePointsRecordRecord> getPrimaryKey() {
        return Keys.KEY_USER_EMPLOYEE_POINTS_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserEmployeePointsRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<UserEmployeePointsRecordRecord>>asList(Keys.KEY_USER_EMPLOYEE_POINTS_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserEmployeePointsRecord as(String alias) {
        return new UserEmployeePointsRecord(alias, this);
    }

    /**
     * Rename this table
     */
    public UserEmployeePointsRecord rename(String name) {
        return new UserEmployeePointsRecord(name, null);
    }
}
