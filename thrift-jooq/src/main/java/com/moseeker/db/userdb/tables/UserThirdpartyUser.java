/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.userdb.tables;


import com.moseeker.db.userdb.Keys;
import com.moseeker.db.userdb.Userdb;
import com.moseeker.db.userdb.tables.records.UserThirdpartyUserRecord;

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
 * 第三方关联帐号表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserThirdpartyUser extends TableImpl<UserThirdpartyUserRecord> {

    private static final long serialVersionUID = 1533374349;

    /**
     * The reference instance of <code>userdb.user_thirdparty_user</code>
     */
    public static final UserThirdpartyUser USER_THIRDPARTY_USER = new UserThirdpartyUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserThirdpartyUserRecord> getRecordType() {
        return UserThirdpartyUserRecord.class;
    }

    /**
     * The column <code>userdb.user_thirdparty_user.id</code>. 主key
     */
    public final TableField<UserThirdpartyUserRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主key");

    /**
     * The column <code>userdb.user_thirdparty_user.user_id</code>. user_user.id, C端用户ID
     */
    public final TableField<UserThirdpartyUserRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "user_user.id, C端用户ID");

    /**
     * The column <code>userdb.user_thirdparty_user.source_id</code>. 第三方平台ID，0：SF，1：Taleo，2：workday,3:51job,4:zhaopin,5,liepin
     */
    public final TableField<UserThirdpartyUserRecord, Integer> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "第三方平台ID，0：SF，1：Taleo，2：workday,3:51job,4:zhaopin,5,liepin");

    /**
     * The column <code>userdb.user_thirdparty_user.username</code>. 用户名，比如手机号、邮箱等
     */
    public final TableField<UserThirdpartyUserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "用户名，比如手机号、邮箱等");

    /**
     * The column <code>userdb.user_thirdparty_user.password</code>. 密码, AES 128位加密
     */
    public final TableField<UserThirdpartyUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "密码, AES 128位加密");

    /**
     * The column <code>userdb.user_thirdparty_user.create_time</code>. 创建时间
     */
    public final TableField<UserThirdpartyUserRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>userdb.user_thirdparty_user.update_time</code>.
     */
    public final TableField<UserThirdpartyUserRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>userdb.user_thirdparty_user</code> table reference
     */
    public UserThirdpartyUser() {
        this("user_thirdparty_user", null);
    }

    /**
     * Create an aliased <code>userdb.user_thirdparty_user</code> table reference
     */
    public UserThirdpartyUser(String alias) {
        this(alias, USER_THIRDPARTY_USER);
    }

    private UserThirdpartyUser(String alias, Table<UserThirdpartyUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserThirdpartyUser(String alias, Table<UserThirdpartyUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "第三方关联帐号表");
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
    public Identity<UserThirdpartyUserRecord, Long> getIdentity() {
        return Keys.IDENTITY_USER_THIRDPARTY_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserThirdpartyUserRecord> getPrimaryKey() {
        return Keys.KEY_USER_THIRDPARTY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserThirdpartyUserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserThirdpartyUserRecord>>asList(Keys.KEY_USER_THIRDPARTY_USER_PRIMARY, Keys.KEY_USER_THIRDPARTY_USER_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserThirdpartyUser as(String alias) {
        return new UserThirdpartyUser(alias, this);
    }

    /**
     * Rename this table
     */
    public UserThirdpartyUser rename(String name) {
        return new UserThirdpartyUser(name, null);
    }
}
