/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables;


import com.moseeker.baseorm.db.userdb.Keys;
import com.moseeker.baseorm.db.userdb.Userdb;
import com.moseeker.baseorm.db.userdb.tables.records.UserUserRecord;

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
 * 用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserUser extends TableImpl<UserUserRecord> {

    private static final long serialVersionUID = -1248407221;

    /**
     * The reference instance of <code>userdb.user_user</code>
     */
    public static final UserUser USER_USER = new UserUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserUserRecord> getRecordType() {
        return UserUserRecord.class;
    }

    /**
     * The column <code>userdb.user_user.id</code>. 主key
     */
    public final TableField<UserUserRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主key");

    /**
     * The column <code>userdb.user_user.country_code</code>. 国家代码，用 于支持国际短信
     */
    public final TableField<UserUserRecord, String> COUNTRY_CODE = createField("country_code", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaultValue(org.jooq.impl.DSL.inline("86", org.jooq.impl.SQLDataType.VARCHAR)), this, "国家代码，用 于支持国际短信");

    /**
     * The column <code>userdb.user_user.username</code>. 用户名，目前存放已验证手机号或者unionid
     */
    public final TableField<UserUserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "用户名，目前存放已验证手机号或者unionid");

    /**
     * The column <code>userdb.user_user.password</code>. 密码
     */
    public final TableField<UserUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "密码");

    /**
     * The column <code>userdb.user_user.is_disable</code>. 是否禁用，0：可用，1：禁用
     */
    public final TableField<UserUserRecord, Byte> IS_DISABLE = createField("is_disable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否禁用，0：可用，1：禁用");

    /**
     * The column <code>userdb.user_user.rank</code>. 用户等级
     */
    public final TableField<UserUserRecord, Integer> RANK = createField("rank", org.jooq.impl.SQLDataType.INTEGER, this, "用户等级");

    /**
     * The column <code>userdb.user_user.register_time</code>. 注册时间
     */
    public final TableField<UserUserRecord, Timestamp> REGISTER_TIME = createField("register_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "注册时间");

    /**
     * The column <code>userdb.user_user.register_ip</code>. 注册IP
     */
    public final TableField<UserUserRecord, String> REGISTER_IP = createField("register_ip", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "注册IP");

    /**
     * The column <code>userdb.user_user.last_login_time</code>. 最近登录时间
     */
    public final TableField<UserUserRecord, Timestamp> LAST_LOGIN_TIME = createField("last_login_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最近登录时间");

    /**
     * The column <code>userdb.user_user.last_login_ip</code>. 最近登录IP
     */
    public final TableField<UserUserRecord, String> LAST_LOGIN_IP = createField("last_login_ip", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "最近登录IP");

    /**
     * The column <code>userdb.user_user.login_count</code>. 登录次数
     */
    public final TableField<UserUserRecord, Integer> LOGIN_COUNT = createField("login_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "登录次数");

    /**
     * The column <code>userdb.user_user.mobile</code>. 手机号(未验证)
     */
    public final TableField<UserUserRecord, Long> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "手机号(未验证)");

    /**
     * The column <code>userdb.user_user.email</code>. user pass email registe
     */
    public final TableField<UserUserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "user pass email registe");

    /**
     * The column <code>userdb.user_user.activation</code>. is not activation 0:no 1:yes
     */
    public final TableField<UserUserRecord, Byte> ACTIVATION = createField("activation", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "is not activation 0:no 1:yes");

    /**
     * The column <code>userdb.user_user.activation_code</code>. activation code
     */
    public final TableField<UserUserRecord, String> ACTIVATION_CODE = createField("activation_code", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "activation code");

    /**
     * The column <code>userdb.user_user.token</code>.
     */
    public final TableField<UserUserRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>userdb.user_user.name</code>. 真实姓名
     */
    public final TableField<UserUserRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "真实姓名");

    /**
     * The column <code>userdb.user_user.headimg</code>. 头像
     */
    public final TableField<UserUserRecord, String> HEADIMG = createField("headimg", org.jooq.impl.SQLDataType.CLOB, this, "头像");

    /**
     * The column <code>userdb.user_user.national_code_id</code>. 国际电话区号ID
     */
    public final TableField<UserUserRecord, Integer> NATIONAL_CODE_ID = createField("national_code_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "国际电话区号ID");

    /**
     * The column <code>userdb.user_user.wechat_id</code>. 注册用户来自于哪个公众号, 0:默认为来自浏览器的用户
     */
    public final TableField<UserUserRecord, Integer> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "注册用户来自于哪个公众号, 0:默认为来自浏览器的用户");

    /**
     * The column <code>userdb.user_user.unionid</code>. 存储仟寻服务号的unionid
     */
    public final TableField<UserUserRecord, String> UNIONID = createField("unionid", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "存储仟寻服务号的unionid");

    /**
     * The column <code>userdb.user_user.source</code>. 来源：0:手机注册 1:聚合号一键登录 2:企业号一键登录 3:微信端百度 oauth 7:PC(正常添加) 8:PC(我要投递) 9:PC(我感兴趣) 10:PC(微信扫描后手机注册) 100:简历回收自动创建, 101支付宝, 103 程序导入(和黄)，102简历上传, 104 员工主动推荐, 105 内推
     */
    public final TableField<UserUserRecord, Short> SOURCE = createField("source", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "来源：0:手机注册 1:聚合号一键登录 2:企业号一键登录 3:微信端百度 oauth 7:PC(正常添加) 8:PC(我要投递) 9:PC(我感兴趣) 10:PC(微信扫描后手机注册) 100:简历回收自动创建, 101支付宝, 103 程序导入(和黄)，102简历上传, 104 员工主动推荐, 105 内推");

    /**
     * The column <code>userdb.user_user.company</code>. 点击我感兴趣时填写的公司
     */
    public final TableField<UserUserRecord, String> COMPANY = createField("company", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "点击我感兴趣时填写的公司");

    /**
     * The column <code>userdb.user_user.position</code>. 点击我感兴趣时填写的职位
     */
    public final TableField<UserUserRecord, String> POSITION = createField("position", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "点击我感兴趣时填写的职位");

    /**
     * The column <code>userdb.user_user.parentid</code>. 合并到了新用户的id
     */
    public final TableField<UserUserRecord, Integer> PARENTID = createField("parentid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "合并到了新用户的id");

    /**
     * The column <code>userdb.user_user.nickname</code>. 用户昵称
     */
    public final TableField<UserUserRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "用户昵称");

    /**
     * The column <code>userdb.user_user.email_verified</code>. 邮箱是否认证 2:老数据 1:已认证 0:未认证
     */
    public final TableField<UserUserRecord, Byte> EMAIL_VERIFIED = createField("email_verified", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("2", org.jooq.impl.SQLDataType.TINYINT)), this, "邮箱是否认证 2:老数据 1:已认证 0:未认证");

    /**
     * The column <code>userdb.user_user.update_time</code>.
     */
    public final TableField<UserUserRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>userdb.user_user</code> table reference
     */
    public UserUser() {
        this("user_user", null);
    }

    /**
     * Create an aliased <code>userdb.user_user</code> table reference
     */
    public UserUser(String alias) {
        this(alias, USER_USER);
    }

    private UserUser(String alias, Table<UserUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserUser(String alias, Table<UserUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户表");
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
    public Identity<UserUserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserUserRecord> getPrimaryKey() {
        return Keys.KEY_USER_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserUserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserUserRecord>>asList(Keys.KEY_USER_USER_PRIMARY, Keys.KEY_USER_USER_COUNTRYCODE_USERNAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserUser as(String alias) {
        return new UserUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserUser rename(String name) {
        return new UserUser(name, null);
    }
}
