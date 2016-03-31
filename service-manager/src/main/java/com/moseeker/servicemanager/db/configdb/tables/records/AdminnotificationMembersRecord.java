/**
 * This class is generated by jOOQ
 */
package com.moseeker.servicemanager.db.configdb.tables.records;


import com.moseeker.servicemanager.db.configdb.tables.AdminnotificationMembers;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 管理员通知联系人
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminnotificationMembersRecord extends UpdatableRecordImpl<AdminnotificationMembersRecord> implements Record7<Integer, String, String, String, String, Byte, Timestamp> {

	private static final long serialVersionUID = -1222674668;

	/**
	 * Setter for <code>configDB.adminnotification_members.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>configDB.adminnotification_members.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>configDB.adminnotification_members.name</code>. 姓名
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>configDB.adminnotification_members.name</code>. 姓名
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>configDB.adminnotification_members.mobilephone</code>. 接收通知的手机
	 */
	public void setMobilephone(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>configDB.adminnotification_members.mobilephone</code>. 接收通知的手机
	 */
	public String getMobilephone() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>configDB.adminnotification_members.wechatopenid</code>. 接收通知的微信openid
	 */
	public void setWechatopenid(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>configDB.adminnotification_members.wechatopenid</code>. 接收通知的微信openid
	 */
	public String getWechatopenid() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>configDB.adminnotification_members.email</code>. 接收通知的email
	 */
	public void setEmail(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>configDB.adminnotification_members.email</code>. 接收通知的email
	 */
	public String getEmail() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>configDB.adminnotification_members.status</code>. 1 有效 0 无效
	 */
	public void setStatus(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>configDB.adminnotification_members.status</code>. 1 有效 0 无效
	 */
	public Byte getStatus() {
		return (Byte) getValue(5);
	}

	/**
	 * Setter for <code>configDB.adminnotification_members.create_time</code>.
	 */
	public void setCreateTime(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>configDB.adminnotification_members.create_time</code>.
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, String, String, String, String, Byte, Timestamp> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, String, String, String, String, Byte, Timestamp> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return AdminnotificationMembers.ADMINNOTIFICATION_MEMBERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return AdminnotificationMembers.ADMINNOTIFICATION_MEMBERS.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return AdminnotificationMembers.ADMINNOTIFICATION_MEMBERS.MOBILEPHONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return AdminnotificationMembers.ADMINNOTIFICATION_MEMBERS.WECHATOPENID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return AdminnotificationMembers.ADMINNOTIFICATION_MEMBERS.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field6() {
		return AdminnotificationMembers.ADMINNOTIFICATION_MEMBERS.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return AdminnotificationMembers.ADMINNOTIFICATION_MEMBERS.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getMobilephone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getWechatopenid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value6() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AdminnotificationMembersRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AdminnotificationMembersRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AdminnotificationMembersRecord value3(String value) {
		setMobilephone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AdminnotificationMembersRecord value4(String value) {
		setWechatopenid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AdminnotificationMembersRecord value5(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AdminnotificationMembersRecord value6(Byte value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AdminnotificationMembersRecord value7(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AdminnotificationMembersRecord values(Integer value1, String value2, String value3, String value4, String value5, Byte value6, Timestamp value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AdminnotificationMembersRecord
	 */
	public AdminnotificationMembersRecord() {
		super(AdminnotificationMembers.ADMINNOTIFICATION_MEMBERS);
	}

	/**
	 * Create a detached, initialised AdminnotificationMembersRecord
	 */
	public AdminnotificationMembersRecord(Integer id, String name, String mobilephone, String wechatopenid, String email, Byte status, Timestamp createTime) {
		super(AdminnotificationMembers.ADMINNOTIFICATION_MEMBERS);

		setValue(0, id);
		setValue(1, name);
		setValue(2, mobilephone);
		setValue(3, wechatopenid);
		setValue(4, email);
		setValue(5, status);
		setValue(6, createTime);
	}
}
