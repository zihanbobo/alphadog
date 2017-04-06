/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables.records;


import com.moseeker.db.hrdb.tables.HrTeamMember;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 团队成员信息
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrTeamMemberRecord extends UpdatableRecordImpl<HrTeamMemberRecord> implements Record9<Integer, String, String, String, Integer, Integer, Timestamp, Timestamp, Integer> {

	private static final long serialVersionUID = -1656977755;

	/**
	 * Setter for <code>hrdb.hr_team_member.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hrdb.hr_team_member.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>hrdb.hr_team_member.name</code>. 成员名称
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hrdb.hr_team_member.name</code>. 成员名称
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>hrdb.hr_team_member.title</code>. 成员职称
	 */
	public void setTitle(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hrdb.hr_team_member.title</code>. 成员职称
	 */
	public String getTitle() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>hrdb.hr_team_member.description</code>. 成员描述
	 */
	public void setDescription(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hrdb.hr_team_member.description</code>. 成员描述
	 */
	public String getDescription() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>hrdb.hr_team_member.team_id</code>. 成员所属团队
	 */
	public void setTeamId(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>hrdb.hr_team_member.team_id</code>. 成员所属团队
	 */
	public Integer getTeamId() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>hrdb.hr_team_member.user_id</code>. 成员对应用户
	 */
	public void setUserId(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>hrdb.hr_team_member.user_id</code>. 成员对应用户
	 */
	public Integer getUserId() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>hrdb.hr_team_member.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>hrdb.hr_team_member.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(6);
	}

	/**
	 * Setter for <code>hrdb.hr_team_member.update_time</code>. 更新时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>hrdb.hr_team_member.update_time</code>. 更新时间
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>hrdb.hr_team_member.res_id</code>. 成员头像hr_resource.id
	 */
	public void setResId(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>hrdb.hr_team_member.res_id</code>. 成员头像hr_resource.id
	 */
	public Integer getResId() {
		return (Integer) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, String, String, String, Integer, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, String, String, String, Integer, Integer, Timestamp, Timestamp, Integer> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return HrTeamMember.HR_TEAM_MEMBER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return HrTeamMember.HR_TEAM_MEMBER.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return HrTeamMember.HR_TEAM_MEMBER.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return HrTeamMember.HR_TEAM_MEMBER.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return HrTeamMember.HR_TEAM_MEMBER.TEAM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return HrTeamMember.HR_TEAM_MEMBER.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return HrTeamMember.HR_TEAM_MEMBER.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return HrTeamMember.HR_TEAM_MEMBER.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return HrTeamMember.HR_TEAM_MEMBER.RES_ID;
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
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getTeamId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getUserId();
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
	public Timestamp value8() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getResId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMemberRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMemberRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMemberRecord value3(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMemberRecord value4(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMemberRecord value5(Integer value) {
		setTeamId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMemberRecord value6(Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMemberRecord value7(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMemberRecord value8(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMemberRecord value9(Integer value) {
		setResId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMemberRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6, Timestamp value7, Timestamp value8, Integer value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HrTeamMemberRecord
	 */
	public HrTeamMemberRecord() {
		super(HrTeamMember.HR_TEAM_MEMBER);
	}

	/**
	 * Create a detached, initialised HrTeamMemberRecord
	 */
	public HrTeamMemberRecord(Integer id, String name, String title, String description, Integer teamId, Integer userId, Timestamp createTime, Timestamp updateTime, Integer resId) {
		super(HrTeamMember.HR_TEAM_MEMBER);

		setValue(0, id);
		setValue(1, name);
		setValue(2, title);
		setValue(3, description);
		setValue(4, teamId);
		setValue(5, userId);
		setValue(6, createTime);
		setValue(7, updateTime);
		setValue(8, resId);
	}
}
