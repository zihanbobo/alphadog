/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.userdb.tables.records;


import com.moseeker.db.userdb.tables.UserSettings;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * 用户设置表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserSettingsRecord extends UpdatableRecordImpl<UserSettingsRecord> implements Record4<UInteger, UInteger, String, UByte> {

	private static final long serialVersionUID = 598869645;

	/**
	 * Setter for <code>userdb.user_settings.id</code>. 主key
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>userdb.user_settings.id</code>. 主key
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>userdb.user_settings.user_id</code>. user_user.id, 用户id
	 */
	public void setUserId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>userdb.user_settings.user_id</code>. user_user.id, 用户id
	 */
	public UInteger getUserId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>userdb.user_settings.banner_url</code>. profile banner 的qiniu 相对url
	 */
	public void setBannerUrl(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>userdb.user_settings.banner_url</code>. profile banner 的qiniu 相对url
	 */
	public String getBannerUrl() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>userdb.user_settings.privacy_policy</code>. 0:公开, 10:仅对hr公开, 20:完全保密
	 */
	public void setPrivacyPolicy(UByte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>userdb.user_settings.privacy_policy</code>. 0:公开, 10:仅对hr公开, 20:完全保密
	 */
	public UByte getPrivacyPolicy() {
		return (UByte) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UInteger, UInteger, String, UByte> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UInteger, UInteger, String, UByte> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return UserSettings.USER_SETTINGS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return UserSettings.USER_SETTINGS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return UserSettings.USER_SETTINGS.BANNER_URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UByte> field4() {
		return UserSettings.USER_SETTINGS.PRIVACY_POLICY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value2() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getBannerUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UByte value4() {
		return getPrivacyPolicy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSettingsRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSettingsRecord value2(UInteger value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSettingsRecord value3(String value) {
		setBannerUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSettingsRecord value4(UByte value) {
		setPrivacyPolicy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSettingsRecord values(UInteger value1, UInteger value2, String value3, UByte value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserSettingsRecord
	 */
	public UserSettingsRecord() {
		super(UserSettings.USER_SETTINGS);
	}

	/**
	 * Create a detached, initialised UserSettingsRecord
	 */
	public UserSettingsRecord(UInteger id, UInteger userId, String bannerUrl, UByte privacyPolicy) {
		super(UserSettings.USER_SETTINGS);

		setValue(0, id);
		setValue(1, userId);
		setValue(2, bannerUrl);
		setValue(3, privacyPolicy);
	}
}