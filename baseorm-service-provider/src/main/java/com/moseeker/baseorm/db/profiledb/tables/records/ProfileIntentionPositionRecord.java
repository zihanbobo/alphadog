/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.profiledb.tables.records;


import com.moseeker.baseorm.db.profiledb.tables.ProfileIntentionPosition;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Profile的求职意向-职能关系表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileIntentionPositionRecord extends UpdatableRecordImpl<ProfileIntentionPositionRecord> implements Record4<UInteger, UInteger, UInteger, String> {

	private static final long serialVersionUID = 885647820;

	/**
	 * Setter for <code>profiledb.profile_intention_position.id</code>. 主key
	 */
	public void setId(UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>profiledb.profile_intention_position.id</code>. 主key
	 */
	public UInteger getId() {
		return (UInteger) getValue(0);
	}

	/**
	 * Setter for <code>profiledb.profile_intention_position.profile_intention_id</code>. profile_intention.id
	 */
	public void setProfileIntentionId(UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>profiledb.profile_intention_position.profile_intention_id</code>. profile_intention.id
	 */
	public UInteger getProfileIntentionId() {
		return (UInteger) getValue(1);
	}

	/**
	 * Setter for <code>profiledb.profile_intention_position.position_code</code>. 职能字典编码
	 */
	public void setPositionCode(UInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>profiledb.profile_intention_position.position_code</code>. 职能字典编码
	 */
	public UInteger getPositionCode() {
		return (UInteger) getValue(2);
	}

	/**
	 * Setter for <code>profiledb.profile_intention_position.position_name</code>. 职能名称
	 */
	public void setPositionName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>profiledb.profile_intention_position.position_name</code>. 职能名称
	 */
	public String getPositionName() {
		return (String) getValue(3);
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
	public Row4<UInteger, UInteger, UInteger, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UInteger, UInteger, UInteger, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field1() {
		return ProfileIntentionPosition.PROFILE_INTENTION_POSITION.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field2() {
		return ProfileIntentionPosition.PROFILE_INTENTION_POSITION.PROFILE_INTENTION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field3() {
		return ProfileIntentionPosition.PROFILE_INTENTION_POSITION.POSITION_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return ProfileIntentionPosition.PROFILE_INTENTION_POSITION.POSITION_NAME;
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
		return getProfileIntentionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value3() {
		return getPositionCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPositionName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileIntentionPositionRecord value1(UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileIntentionPositionRecord value2(UInteger value) {
		setProfileIntentionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileIntentionPositionRecord value3(UInteger value) {
		setPositionCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileIntentionPositionRecord value4(String value) {
		setPositionName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileIntentionPositionRecord values(UInteger value1, UInteger value2, UInteger value3, String value4) {
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
	 * Create a detached ProfileIntentionPositionRecord
	 */
	public ProfileIntentionPositionRecord() {
		super(ProfileIntentionPosition.PROFILE_INTENTION_POSITION);
	}

	/**
	 * Create a detached, initialised ProfileIntentionPositionRecord
	 */
	public ProfileIntentionPositionRecord(UInteger id, UInteger profileIntentionId, UInteger positionCode, String positionName) {
		super(ProfileIntentionPosition.PROFILE_INTENTION_POSITION);

		setValue(0, id);
		setValue(1, profileIntentionId);
		setValue(2, positionCode);
		setValue(3, positionName);
	}
}
