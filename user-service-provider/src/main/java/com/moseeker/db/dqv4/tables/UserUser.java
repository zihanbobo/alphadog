/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.dqv4.tables;


import com.moseeker.db.dqv4.Dqv4;
import com.moseeker.db.dqv4.Keys;
import com.moseeker.db.dqv4.tables.records.UserUserRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * 用户表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserUser extends TableImpl<UserUserRecord> {

	private static final long serialVersionUID = 309751796;

	/**
	 * The reference instance of <code>dqv4.user_user</code>
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
	 * The column <code>dqv4.user_user.id</code>. 主key
	 */
	public final TableField<UserUserRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "主key");

	/**
	 * The column <code>dqv4.user_user.username</code>. 用户名，比如手机号、邮箱等
	 */
	public final TableField<UserUserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "用户名，比如手机号、邮箱等");

	/**
	 * The column <code>dqv4.user_user.password</code>. 密码
	 */
	public final TableField<UserUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "密码");

	/**
	 * The column <code>dqv4.user_user.is_disable</code>. 是否禁用，0：可用，1：禁用
	 */
	public final TableField<UserUserRecord, Byte> IS_DISABLE = createField("is_disable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "是否禁用，0：可用，1：禁用");

	/**
	 * The column <code>dqv4.user_user.rank</code>. 用户等级
	 */
	public final TableField<UserUserRecord, Integer> RANK = createField("rank", org.jooq.impl.SQLDataType.INTEGER, this, "用户等级");

	/**
	 * The column <code>dqv4.user_user.register_time</code>. 注册时间
	 */
	public final TableField<UserUserRecord, Timestamp> REGISTER_TIME = createField("register_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "注册时间");

	/**
	 * The column <code>dqv4.user_user.register_ip</code>. 注册IP
	 */
	public final TableField<UserUserRecord, String> REGISTER_IP = createField("register_ip", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "注册IP");

	/**
	 * The column <code>dqv4.user_user.last_login_time</code>. 最近登录时间
	 */
	public final TableField<UserUserRecord, Timestamp> LAST_LOGIN_TIME = createField("last_login_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最近登录时间");

	/**
	 * The column <code>dqv4.user_user.last_login_ip</code>. 最近登录IP
	 */
	public final TableField<UserUserRecord, String> LAST_LOGIN_IP = createField("last_login_ip", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "最近登录IP");

	/**
	 * The column <code>dqv4.user_user.login_count</code>. 登录次数
	 */
	public final TableField<UserUserRecord, Integer> LOGIN_COUNT = createField("login_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "登录次数");

	/**
	 * The column <code>dqv4.user_user.mobile</code>. user pass mobile registe
	 */
	public final TableField<UserUserRecord, Long> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "user pass mobile registe");

	/**
	 * The column <code>dqv4.user_user.email</code>. user pass email registe
	 */
	public final TableField<UserUserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "user pass email registe");

	/**
	 * The column <code>dqv4.user_user.activation</code>. is not activation 0:no 1:yes
	 */
	public final TableField<UserUserRecord, Byte> ACTIVATION = createField("activation", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "is not activation 0:no 1:yes");

	/**
	 * The column <code>dqv4.user_user.activation_code</code>. activation code
	 */
	public final TableField<UserUserRecord, String> ACTIVATION_CODE = createField("activation_code", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "activation code");

	/**
	 * The column <code>dqv4.user_user.token</code>.
	 */
	public final TableField<UserUserRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>dqv4.user_user.name</code>. 姓名或微信昵称
	 */
	public final TableField<UserUserRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "姓名或微信昵称");

	/**
	 * The column <code>dqv4.user_user.headimg</code>. 头像
	 */
	public final TableField<UserUserRecord, String> HEADIMG = createField("headimg", org.jooq.impl.SQLDataType.CLOB, this, "头像");

	/**
	 * The column <code>dqv4.user_user.national_code_id</code>. 国际电话区号ID
	 */
	public final TableField<UserUserRecord, Integer> NATIONAL_CODE_ID = createField("national_code_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "国际电话区号ID");

	/**
	 * The column <code>dqv4.user_user.wechat_id</code>. 注册用户来自于哪个公众号, 0:默认为来自浏览器的用户
	 */
	public final TableField<UserUserRecord, Integer> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "注册用户来自于哪个公众号, 0:默认为来自浏览器的用户");

	/**
	 * The column <code>dqv4.user_user.unionid</code>. 存储仟寻服务号的unionid
	 */
	public final TableField<UserUserRecord, String> UNIONID = createField("unionid", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "存储仟寻服务号的unionid");

	/**
	 * The column <code>dqv4.user_user.source</code>. 来源：0:手机注册 1:聚合号一键登录 2:企业号一键登录
	 */
	public final TableField<UserUserRecord, Byte> SOURCE = createField("source", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "来源：0:手机注册 1:聚合号一键登录 2:企业号一键登录");

	/**
	 * Create a <code>dqv4.user_user</code> table reference
	 */
	public UserUser() {
		this("user_user", null);
	}

	/**
	 * Create an aliased <code>dqv4.user_user</code> table reference
	 */
	public UserUser(String alias) {
		this(alias, USER_USER);
	}

	private UserUser(String alias, Table<UserUserRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserUser(String alias, Table<UserUserRecord> aliased, Field<?>[] parameters) {
		super(alias, Dqv4.DQV4, aliased, parameters, "用户表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<UserUserRecord, UInteger> getIdentity() {
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
		return Arrays.<UniqueKey<UserUserRecord>>asList(Keys.KEY_USER_USER_PRIMARY, Keys.KEY_USER_USER_UK_SYS_USER_USERNAME);
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
	public UserUser rename(String name) {
		return new UserUser(name, null);
	}
}
