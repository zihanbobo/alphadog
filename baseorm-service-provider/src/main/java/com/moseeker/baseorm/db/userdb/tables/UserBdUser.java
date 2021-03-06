/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables;


import com.moseeker.baseorm.db.userdb.Keys;
import com.moseeker.baseorm.db.userdb.Userdb;
import com.moseeker.baseorm.db.userdb.tables.records.UserBdUserRecord;

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
 * 百度用户信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserBdUser extends TableImpl<UserBdUserRecord> {

    private static final long serialVersionUID = 2069078350;

    /**
     * The reference instance of <code>userdb.user_bd_user</code>
     */
    public static final UserBdUser USER_BD_USER = new UserBdUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserBdUserRecord> getRecordType() {
        return UserBdUserRecord.class;
    }

    /**
     * The column <code>userdb.user_bd_user.id</code>.
     */
    public final TableField<UserBdUserRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>userdb.user_bd_user.uid</code>. 百度帐号 id
     */
    public final TableField<UserBdUserRecord, Long> UID = createField("uid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "百度帐号 id");

    /**
     * The column <code>userdb.user_bd_user.user_id</code>. user_user.id, C端用户ID
     */
    public final TableField<UserBdUserRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "user_user.id, C端用户ID");

    /**
     * The column <code>userdb.user_bd_user.username</code>. 登录用户名
     */
    public final TableField<UserBdUserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "登录用户名");

    /**
     * The column <code>userdb.user_bd_user.sex</code>. 用户性别 2:未知  0:女性 1:男性
     */
    public final TableField<UserBdUserRecord, Integer> SEX = createField("sex", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("2", org.jooq.impl.SQLDataType.INTEGER)), this, "用户性别 2:未知  0:女性 1:男性");

    /**
     * The column <code>userdb.user_bd_user.headimgurl</code>. 用户头像
     */
    public final TableField<UserBdUserRecord, String> HEADIMGURL = createField("headimgurl", org.jooq.impl.SQLDataType.VARCHAR.length(512).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "用户头像");

    /**
     * The column <code>userdb.user_bd_user.create_time</code>. 创建时间
     */
    public final TableField<UserBdUserRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>userdb.user_bd_user.update_time</code>.
     */
    public final TableField<UserBdUserRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>userdb.user_bd_user</code> table reference
     */
    public UserBdUser() {
        this("user_bd_user", null);
    }

    /**
     * Create an aliased <code>userdb.user_bd_user</code> table reference
     */
    public UserBdUser(String alias) {
        this(alias, USER_BD_USER);
    }

    private UserBdUser(String alias, Table<UserBdUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserBdUser(String alias, Table<UserBdUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "百度用户信息表");
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
    public Identity<UserBdUserRecord, Long> getIdentity() {
        return Keys.IDENTITY_USER_BD_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserBdUserRecord> getPrimaryKey() {
        return Keys.KEY_USER_BD_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserBdUserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserBdUserRecord>>asList(Keys.KEY_USER_BD_USER_PRIMARY, Keys.KEY_USER_BD_USER_UID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserBdUser as(String alias) {
        return new UserBdUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserBdUser rename(String name) {
        return new UserBdUser(name, null);
    }
}
