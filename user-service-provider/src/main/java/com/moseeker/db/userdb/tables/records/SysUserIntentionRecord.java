/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.userdb.tables.records;


import com.moseeker.db.userdb.tables.SysUserIntention;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * 用户求职意向
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysUserIntentionRecord extends TableRecordImpl<SysUserIntentionRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

	private static final long serialVersionUID = -700240653;

	/**
	 * Setter for <code>userDB.sys_user_intention.sysuser_id</code>. 用户ID
	 */
	public void setSysuserId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>userDB.sys_user_intention.sysuser_id</code>. 用户ID
	 */
	public Integer getSysuserId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>userDB.sys_user_intention.intention</code>. 求职意向
	 */
	public void setIntention(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>userDB.sys_user_intention.intention</code>. 求职意向
	 */
	public String getIntention() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>userDB.sys_user_intention.create_time</code>.
	 */
	public void setCreateTime(Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>userDB.sys_user_intention.create_time</code>.
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>userDB.sys_user_intention.update_time</code>.
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>userDB.sys_user_intention.update_time</code>.
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return SysUserIntention.SYS_USER_INTENTION.SYSUSER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SysUserIntention.SYS_USER_INTENTION.INTENTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field3() {
		return SysUserIntention.SYS_USER_INTENTION.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return SysUserIntention.SYS_USER_INTENTION.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getSysuserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getIntention();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value3() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SysUserIntentionRecord value1(Integer value) {
		setSysuserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SysUserIntentionRecord value2(String value) {
		setIntention(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SysUserIntentionRecord value3(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SysUserIntentionRecord value4(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SysUserIntentionRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
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
	 * Create a detached SysUserIntentionRecord
	 */
	public SysUserIntentionRecord() {
		super(SysUserIntention.SYS_USER_INTENTION);
	}

	/**
	 * Create a detached, initialised SysUserIntentionRecord
	 */
	public SysUserIntentionRecord(Integer sysuserId, String intention, Timestamp createTime, Timestamp updateTime) {
		super(SysUserIntention.SYS_USER_INTENTION);

		setValue(0, sysuserId);
		setValue(1, intention);
		setValue(2, createTime);
		setValue(3, updateTime);
	}
}
