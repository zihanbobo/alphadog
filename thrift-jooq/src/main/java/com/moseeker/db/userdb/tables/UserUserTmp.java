/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.userdb.tables;


import com.moseeker.db.userdb.Keys;
import com.moseeker.db.userdb.Userdb;
import com.moseeker.db.userdb.tables.records.UserUserTmpRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserUserTmp extends TableImpl<UserUserTmpRecord> {

	private static final long serialVersionUID = 1381433195;

	/**
	 * The reference instance of <code>userdb.user_user_tmp</code>
	 */
	public static final UserUserTmp USER_USER_TMP = new UserUserTmp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserUserTmpRecord> getRecordType() {
		return UserUserTmpRecord.class;
	}

	/**
	 * The column <code>userdb.user_user_tmp.id</code>. 主key
	 */
	public final TableField<UserUserTmpRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "主key");

	/**
	 * The column <code>userdb.user_user_tmp.username</code>. 用户名，比如手机号、邮箱等
	 */
	public final TableField<UserUserTmpRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "用户名，比如手机号、邮箱等");

	/**
	 * The column <code>userdb.user_user_tmp.password</code>. 密码
	 */
	public final TableField<UserUserTmpRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "密码");

	/**
	 * The column <code>userdb.user_user_tmp.is_disable</code>. 是否禁用，0：可用，1：禁用
	 */
	public final TableField<UserUserTmpRecord, Byte> IS_DISABLE = createField("is_disable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "是否禁用，0：可用，1：禁用");

	/**
	 * The column <code>userdb.user_user_tmp.rank</code>. 用户等级
	 */
	public final TableField<UserUserTmpRecord, Integer> RANK = createField("rank", org.jooq.impl.SQLDataType.INTEGER, this, "用户等级");

	/**
	 * The column <code>userdb.user_user_tmp.register_time</code>. 注册时间
	 */
	public final TableField<UserUserTmpRecord, Timestamp> REGISTER_TIME = createField("register_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "注册时间");

	/**
	 * The column <code>userdb.user_user_tmp.register_ip</code>. 注册IP
	 */
	public final TableField<UserUserTmpRecord, String> REGISTER_IP = createField("register_ip", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "注册IP");

	/**
	 * The column <code>userdb.user_user_tmp.last_login_time</code>. 最近登录时间
	 */
	public final TableField<UserUserTmpRecord, Timestamp> LAST_LOGIN_TIME = createField("last_login_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最近登录时间");

	/**
	 * The column <code>userdb.user_user_tmp.last_login_ip</code>. 最近登录IP
	 */
	public final TableField<UserUserTmpRecord, String> LAST_LOGIN_IP = createField("last_login_ip", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "最近登录IP");

	/**
	 * The column <code>userdb.user_user_tmp.login_count</code>. 登录次数
	 */
	public final TableField<UserUserTmpRecord, Integer> LOGIN_COUNT = createField("login_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "登录次数");

	/**
	 * The column <code>userdb.user_user_tmp.mobile</code>. user pass mobile registe
	 */
	public final TableField<UserUserTmpRecord, Long> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "user pass mobile registe");

	/**
	 * The column <code>userdb.user_user_tmp.email</code>. user pass email registe
	 */
	public final TableField<UserUserTmpRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "user pass email registe");

	/**
	 * The column <code>userdb.user_user_tmp.activation</code>. is not activation 0:no 1:yes
	 */
	public final TableField<UserUserTmpRecord, Byte> ACTIVATION = createField("activation", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "is not activation 0:no 1:yes");

	/**
	 * The column <code>userdb.user_user_tmp.activation_code</code>. activation code
	 */
	public final TableField<UserUserTmpRecord, String> ACTIVATION_CODE = createField("activation_code", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "activation code");

	/**
	 * The column <code>userdb.user_user_tmp.token</code>.
	 */
	public final TableField<UserUserTmpRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>userdb.user_user_tmp.name</code>. 真实姓名
	 */
	public final TableField<UserUserTmpRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "真实姓名");

	/**
	 * The column <code>userdb.user_user_tmp.headimg</code>. 头像
	 */
	public final TableField<UserUserTmpRecord, String> HEADIMG = createField("headimg", org.jooq.impl.SQLDataType.CLOB, this, "头像");

	/**
	 * The column <code>userdb.user_user_tmp.national_code_id</code>. 国际电话区号ID
	 */
	public final TableField<UserUserTmpRecord, Integer> NATIONAL_CODE_ID = createField("national_code_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "国际电话区号ID");

	/**
	 * The column <code>userdb.user_user_tmp.wechat_id</code>. 注册用户来自于哪个公众号, 0:默认为来自浏览器的用户
	 */
	public final TableField<UserUserTmpRecord, Integer> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "注册用户来自于哪个公众号, 0:默认为来自浏览器的用户");

	/**
	 * The column <code>userdb.user_user_tmp.unionid</code>. 存储仟寻服务号的unionid
	 */
	public final TableField<UserUserTmpRecord, String> UNIONID = createField("unionid", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "存储仟寻服务号的unionid");

	/**
	 * The column <code>userdb.user_user_tmp.source</code>. 来源：0:手机注册 1:聚合号一键登录 2:企业号一键登录
	 */
	public final TableField<UserUserTmpRecord, Byte> SOURCE = createField("source", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "来源：0:手机注册 1:聚合号一键登录 2:企业号一键登录");

	/**
	 * The column <code>userdb.user_user_tmp.company</code>. 点击我感兴趣时填写的公司
	 */
	public final TableField<UserUserTmpRecord, String> COMPANY = createField("company", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "点击我感兴趣时填写的公司");

	/**
	 * The column <code>userdb.user_user_tmp.position</code>. 点击我感兴趣时填写的职位
	 */
	public final TableField<UserUserTmpRecord, String> POSITION = createField("position", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "点击我感兴趣时填写的职位");

	/**
	 * The column <code>userdb.user_user_tmp.parentid</code>. 合并到了新用户的id
	 */
	public final TableField<UserUserTmpRecord, UInteger> PARENTID = createField("parentid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "合并到了新用户的id");

	/**
	 * The column <code>userdb.user_user_tmp.nickname</code>. 用户昵称
	 */
	public final TableField<UserUserTmpRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this, "用户昵称");

	/**
	 * Create a <code>userdb.user_user_tmp</code> table reference
	 */
	public UserUserTmp() {
		this("user_user_tmp", null);
	}

	/**
	 * Create an aliased <code>userdb.user_user_tmp</code> table reference
	 */
	public UserUserTmp(String alias) {
		this(alias, USER_USER_TMP);
	}

	private UserUserTmp(String alias, Table<UserUserTmpRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserUserTmp(String alias, Table<UserUserTmpRecord> aliased, Field<?>[] parameters) {
		super(alias, Userdb.USERDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<UserUserTmpRecord> getPrimaryKey() {
		return Keys.KEY_USER_USER_TMP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<UserUserTmpRecord>> getKeys() {
		return Arrays.<UniqueKey<UserUserTmpRecord>>asList(Keys.KEY_USER_USER_TMP_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserUserTmp as(String alias) {
		return new UserUserTmp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public UserUserTmp rename(String name) {
		return new UserUserTmp(name, null);
	}
}
