/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables;


import com.moseeker.baseorm.db.userdb.Keys;
import com.moseeker.baseorm.db.userdb.Userdb;
import com.moseeker.baseorm.db.userdb.tables.records.UserHrRoleRecord;

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
 * 角色
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserHrRole extends TableImpl<UserHrRoleRecord> {

    private static final long serialVersionUID = -1833632039;

    /**
     * The reference instance of <code>userdb.user_hr_role</code>
     */
    public static final UserHrRole USER_HR_ROLE = new UserHrRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserHrRoleRecord> getRecordType() {
        return UserHrRoleRecord.class;
    }

    /**
     * The column <code>userdb.user_hr_role.role_id</code>. 角色id
     */
    public final TableField<UserHrRoleRecord, Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "角色id");

    /**
     * The column <code>userdb.user_hr_role.role_name</code>. 角色名
     */
    public final TableField<UserHrRoleRecord, String> ROLE_NAME = createField("role_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "角色名");

    /**
     * The column <code>userdb.user_hr_role.role_desc</code>. 角色描述
     */
    public final TableField<UserHrRoleRecord, String> ROLE_DESC = createField("role_desc", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "角色描述");

    /**
     * The column <code>userdb.user_hr_role.role_type</code>. 1:超级管理员 2:管理员 3:招聘负责人 4:高级用人经理 5:用人经理 6:面试官 7:自定义角色
     */
    public final TableField<UserHrRoleRecord, Byte> ROLE_TYPE = createField("role_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1:超级管理员 2:管理员 3:招聘负责人 4:高级用人经理 5:用人经理 6:面试官 7:自定义角色");

    /**
     * The column <code>userdb.user_hr_role.create_time</code>. 创建时间
     */
    public final TableField<UserHrRoleRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>userdb.user_hr_role.creator</code>. 创建人
     */
    public final TableField<UserHrRoleRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "创建人");

    /**
     * The column <code>userdb.user_hr_role.update_time</code>. 修改时间
     */
    public final TableField<UserHrRoleRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>userdb.user_hr_role.updator</code>. 修改人
     */
    public final TableField<UserHrRoleRecord, String> UPDATOR = createField("updator", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "修改人");

    /**
     * Create a <code>userdb.user_hr_role</code> table reference
     */
    public UserHrRole() {
        this("user_hr_role", null);
    }

    /**
     * Create an aliased <code>userdb.user_hr_role</code> table reference
     */
    public UserHrRole(String alias) {
        this(alias, USER_HR_ROLE);
    }

    private UserHrRole(String alias, Table<UserHrRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserHrRole(String alias, Table<UserHrRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "角色");
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
    public Identity<UserHrRoleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_HR_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserHrRoleRecord> getPrimaryKey() {
        return Keys.KEY_USER_HR_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserHrRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<UserHrRoleRecord>>asList(Keys.KEY_USER_HR_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserHrRole as(String alias) {
        return new UserHrRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserHrRole rename(String name) {
        return new UserHrRole(name, null);
    }
}
