/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.profiledb.tables.records;


import com.moseeker.db.profiledb.tables.ProfileCredentials;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Profile的证书表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileCredentialsRecord extends UpdatableRecordImpl<ProfileCredentialsRecord> implements Record10<UInteger, UInteger, String, String, String, String, Date, String, Timestamp, Timestamp> {

	private static final long serialVersionUID = -392523980;

	/**
	 * Setter for <code>profiledb.profile_credentials.id</code>. 主key
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>profiledb.profile_credentials.id</code>. 主key
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>profiledb.profile_credentials.profile_id</code>. profile.id
	 */
	public void setProfileId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>profiledb.profile_credentials.profile_id</code>. profile.id
	 */
	public UInteger getProfileId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>profiledb.profile_credentials.name</code>. 证书名称
	 */
	public void setName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>profiledb.profile_credentials.name</code>. 证书名称
	 */
	public String getName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>profiledb.profile_credentials.organization</code>. 证书机构
	 */
	public void setOrganization(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>profiledb.profile_credentials.organization</code>. 证书机构
	 */
	public String getOrganization() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>profiledb.profile_credentials.code</code>. 证书编码
	 */
	public void setCode(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>profiledb.profile_credentials.code</code>. 证书编码
	 */
	public String getCode() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>profiledb.profile_credentials.url</code>. 认证链接
	 */
	public void setUrl(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>profiledb.profile_credentials.url</code>. 认证链接
	 */
	public String getUrl() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>profiledb.profile_credentials.get_date</code>. 获得时间
	 */
	public void setGetDate(Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>profiledb.profile_credentials.get_date</code>. 获得时间
	 */
	public Date getGetDate() {
		return (Date) getValue(6);
	}

	/**
	 * Setter for <code>profiledb.profile_credentials.score</code>. 成绩
	 */
	public void setScore(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>profiledb.profile_credentials.score</code>. 成绩
	 */
	public String getScore() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>profiledb.profile_credentials.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>profiledb.profile_credentials.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>profiledb.profile_credentials.update_time</code>. 更新时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>profiledb.profile_credentials.update_time</code>. 更新时间
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(9);
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
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<UInteger, UInteger, String, String, String, String, Date, String, Timestamp, Timestamp> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<UInteger, UInteger, String, String, String, String, Date, String, Timestamp, Timestamp> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return ProfileCredentials.PROFILE_CREDENTIALS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return ProfileCredentials.PROFILE_CREDENTIALS.PROFILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ProfileCredentials.PROFILE_CREDENTIALS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ProfileCredentials.PROFILE_CREDENTIALS.ORGANIZATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ProfileCredentials.PROFILE_CREDENTIALS.CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return ProfileCredentials.PROFILE_CREDENTIALS.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field7() {
		return ProfileCredentials.PROFILE_CREDENTIALS.GET_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return ProfileCredentials.PROFILE_CREDENTIALS.SCORE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return ProfileCredentials.PROFILE_CREDENTIALS.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field10() {
		return ProfileCredentials.PROFILE_CREDENTIALS.UPDATE_TIME;
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
		return getProfileId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getOrganization();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value7() {
		return getGetDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getScore();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value10() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord value2(UInteger value) {
		setProfileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord value3(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord value4(String value) {
		setOrganization(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord value5(String value) {
		setCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord value6(String value) {
		setUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord value7(Date value) {
		setGetDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord value8(String value) {
		setScore(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord value9(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord value10(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileCredentialsRecord values(UInteger value1, UInteger value2, String value3, String value4, String value5, String value6, Date value7, String value8, Timestamp value9, Timestamp value10) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProfileCredentialsRecord
	 */
	public ProfileCredentialsRecord() {
		super(ProfileCredentials.PROFILE_CREDENTIALS);
	}

	/**
	 * Create a detached, initialised ProfileCredentialsRecord
	 */
	public ProfileCredentialsRecord(UInteger id, UInteger profileId, String name, String organization, String code, String url, Date getDate, String score, Timestamp createTime, Timestamp updateTime) {
		super(ProfileCredentials.PROFILE_CREDENTIALS);

		setValue(0, id);
		setValue(1, profileId);
		setValue(2, name);
		setValue(3, organization);
		setValue(4, code);
		setValue(5, url);
		setValue(6, getDate);
		setValue(7, score);
		setValue(8, createTime);
		setValue(9, updateTime);
	}
}