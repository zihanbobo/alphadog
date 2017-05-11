/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrWxWechat;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * 微信公众号表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxWechatRecord extends UpdatableRecordImpl<HrWxWechatRecord> {

	private static final long serialVersionUID = 1032874061;

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.id</code>.
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.id</code>.
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.company_id</code>. 所属公司id, company.id
	 */
	public void setCompanyId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.company_id</code>. 所属公司id, company.id
	 */
	public UInteger getCompanyId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.type</code>. 公众号类型, 0:订阅号, 1:服务号
	 */
	public void setType(UByte value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.type</code>. 公众号类型, 0:订阅号, 1:服务号
	 */
	public UByte getType() {
		return (UByte) getValue(2);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.signature</code>. 公众号ID匿名化
	 */
	public void setSignature(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.signature</code>. 公众号ID匿名化
	 */
	public String getSignature() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.name</code>. 名称
	 */
	public void setName(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.name</code>. 名称
	 */
	public String getName() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.alias</code>. 别名
	 */
	public void setAlias(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.alias</code>. 别名
	 */
	public String getAlias() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.username</code>. 用户名
	 */
	public void setUsername(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.username</code>. 用户名
	 */
	public String getUsername() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.password</code>. 密码
	 */
	public void setPassword(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.password</code>. 密码
	 */
	public String getPassword() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.token</code>. 开发者token
	 */
	public void setToken(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.token</code>. 开发者token
	 */
	public String getToken() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.appid</code>. 开发者appid
	 */
	public void setAppid(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.appid</code>. 开发者appid
	 */
	public String getAppid() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.secret</code>. 开发者secret
	 */
	public void setSecret(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.secret</code>. 开发者secret
	 */
	public String getSecret() {
		return (String) getValue(10);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.welcome</code>. welcome message
	 */
	public void setWelcome(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.welcome</code>. welcome message
	 */
	public Integer getWelcome() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.default</code>. default message
	 */
	public void setDefault(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.default</code>. default message
	 */
	public Integer getDefault() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.qrcode</code>. 关注公众号的二维码
	 */
	public void setQrcode(String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.qrcode</code>. 关注公众号的二维码
	 */
	public String getQrcode() {
		return (String) getValue(13);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.passive_seeker</code>. 被动求职者开关，0：开启，1：不开启
	 */
	public void setPassiveSeeker(Byte value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.passive_seeker</code>. 被动求职者开关，0：开启，1：不开启
	 */
	public Byte getPassiveSeeker() {
		return (Byte) getValue(14);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.third_oauth</code>. 授权大岂第三方平台0：未授权 1：授权了
	 */
	public void setThirdOauth(Byte value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.third_oauth</code>. 授权大岂第三方平台0：未授权 1：授权了
	 */
	public Byte getThirdOauth() {
		return (Byte) getValue(15);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.hr_register</code>. 是否启用免费雇主注册，0：不启用，1：启用
	 */
	public void setHrRegister(Byte value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.hr_register</code>. 是否启用免费雇主注册，0：不启用，1：启用
	 */
	public Byte getHrRegister() {
		return (Byte) getValue(16);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.access_token_create_time</code>. access_token最新更新时间
	 */
	public void setAccessTokenCreateTime(Integer value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.access_token_create_time</code>. access_token最新更新时间
	 */
	public Integer getAccessTokenCreateTime() {
		return (Integer) getValue(17);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.access_token_expired</code>. access_token过期时间
	 */
	public void setAccessTokenExpired(Integer value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.access_token_expired</code>. access_token过期时间
	 */
	public Integer getAccessTokenExpired() {
		return (Integer) getValue(18);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.access_token</code>. access_token
	 */
	public void setAccessToken(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.access_token</code>. access_token
	 */
	public String getAccessToken() {
		return (String) getValue(19);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.jsapi_ticket</code>. jsapi_ticket
	 */
	public void setJsapiTicket(String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.jsapi_ticket</code>. jsapi_ticket
	 */
	public String getJsapiTicket() {
		return (String) getValue(20);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.authorized</code>. 是否授权0：无关，1：授权2：解除授权
	 */
	public void setAuthorized(Byte value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.authorized</code>. 是否授权0：无关，1：授权2：解除授权
	 */
	public Byte getAuthorized() {
		return (Byte) getValue(21);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.unauthorized_time</code>. 解除授权的时间戳
	 */
	public void setUnauthorizedTime(Integer value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.unauthorized_time</code>. 解除授权的时间戳
	 */
	public Integer getUnauthorizedTime() {
		return (Integer) getValue(22);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.authorizer_refresh_token</code>. 第三方授权的刷新token，用来刷access_token
	 */
	public void setAuthorizerRefreshToken(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.authorizer_refresh_token</code>. 第三方授权的刷新token，用来刷access_token
	 */
	public String getAuthorizerRefreshToken() {
		return (String) getValue(23);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(24);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.update_time</code>. 修改时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.update_time</code>. 修改时间
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(25);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.hr_chat</code>. IM聊天开关，0：不开启，1：开启
	 */
	public void setHrChat(Byte value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.hr_chat</code>. IM聊天开关，0：不开启，1：开启
	 */
	public Byte getHrChat() {
		return (Byte) getValue(26);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.show_qx_qrcode</code>. 显示仟寻聚合号二维码, 0:不允许，1:允许
	 */
	public void setShowQxQrcode(Integer value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.show_qx_qrcode</code>. 显示仟寻聚合号二维码, 0:不允许，1:允许
	 */
	public Integer getShowQxQrcode() {
		return (Integer) getValue(27);
	}

	/**
	 * Setter for <code>hrdb.hr_wx_wechat.show_custom_theme</code>. show_custom_theme,用于表示是否可以开启企业自定义颜色配置 0是否 1是开启
	 */
	public void setShowCustomTheme(Integer value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>hrdb.hr_wx_wechat.show_custom_theme</code>. show_custom_theme,用于表示是否可以开启企业自定义颜色配置 0是否 1是开启
	 */
	public Integer getShowCustomTheme() {
		return (Integer) getValue(28);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<UInteger> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HrWxWechatRecord
	 */
	public HrWxWechatRecord() {
		super(HrWxWechat.HR_WX_WECHAT);
	}

	/**
	 * Create a detached, initialised HrWxWechatRecord
	 */
	public HrWxWechatRecord(UInteger id, UInteger companyId, UByte type, String signature, String name, String alias, String username, String password, String token, String appid, String secret, Integer welcome, Integer default_, String qrcode, Byte passiveSeeker, Byte thirdOauth, Byte hrRegister, Integer accessTokenCreateTime, Integer accessTokenExpired, String accessToken, String jsapiTicket, Byte authorized, Integer unauthorizedTime, String authorizerRefreshToken, Timestamp createTime, Timestamp updateTime, Byte hrChat, Integer showQxQrcode, Integer showCustomTheme) {
		super(HrWxWechat.HR_WX_WECHAT);

		setValue(0, id);
		setValue(1, companyId);
		setValue(2, type);
		setValue(3, signature);
		setValue(4, name);
		setValue(5, alias);
		setValue(6, username);
		setValue(7, password);
		setValue(8, token);
		setValue(9, appid);
		setValue(10, secret);
		setValue(11, welcome);
		setValue(12, default_);
		setValue(13, qrcode);
		setValue(14, passiveSeeker);
		setValue(15, thirdOauth);
		setValue(16, hrRegister);
		setValue(17, accessTokenCreateTime);
		setValue(18, accessTokenExpired);
		setValue(19, accessToken);
		setValue(20, jsapiTicket);
		setValue(21, authorized);
		setValue(22, unauthorizedTime);
		setValue(23, authorizerRefreshToken);
		setValue(24, createTime);
		setValue(25, updateTime);
		setValue(26, hrChat);
		setValue(27, showQxQrcode);
		setValue(28, showCustomTheme);
	}
}
