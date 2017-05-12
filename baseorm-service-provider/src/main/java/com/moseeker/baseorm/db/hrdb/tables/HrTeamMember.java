/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrTeamMemberRecord;

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
public class HrTeamMember extends TableImpl<HrTeamMemberRecord> {

	private static final long serialVersionUID = 968942959;

	/**
	 * The reference instance of <code>hrdb.hr_team_member</code>
	 */
	public static final HrTeamMember HR_TEAM_MEMBER = new HrTeamMember();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrTeamMemberRecord> getRecordType() {
		return HrTeamMemberRecord.class;
	}

	/**
	 * The column <code>hrdb.hr_team_member.id</code>.
	 */
	public final TableField<HrTeamMemberRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>hrdb.hr_team_member.name</code>. 成员名称
	 */
	public final TableField<HrTeamMemberRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaulted(true), this, "成员名称");

	/**
	 * The column <code>hrdb.hr_team_member.title</code>. 成员职称
	 */
	public final TableField<HrTeamMemberRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaulted(true), this, "成员职称");

	/**
	 * The column <code>hrdb.hr_team_member.description</code>. 成员描述
	 */
	public final TableField<HrTeamMemberRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(2048).nullable(false).defaulted(true), this, "成员描述");

	/**
	 * The column <code>hrdb.hr_team_member.team_id</code>. 成员所属团队
	 */
	public final TableField<HrTeamMemberRecord, Integer> TEAM_ID = createField("team_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "成员所属团队");

	/**
	 * The column <code>hrdb.hr_team_member.user_id</code>. 成员对应用户
	 */
	public final TableField<HrTeamMemberRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "成员对应用户");

	/**
	 * The column <code>hrdb.hr_team_member.create_time</code>. 创建时间
	 */
	public final TableField<HrTeamMemberRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>hrdb.hr_team_member.update_time</code>. 更新时间
	 */
	public final TableField<HrTeamMemberRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "更新时间");

	/**
	 * The column <code>hrdb.hr_team_member.res_id</code>. 成员头像hr_resource.id
	 */
	public final TableField<HrTeamMemberRecord, Integer> RES_ID = createField("res_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "成员头像hr_resource.id");

	/**
	 * The column <code>hrdb.hr_team_member.disable</code>. 0是正常1是删除
	 */
	public final TableField<HrTeamMemberRecord, Integer> DISABLE = createField("disable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "0是正常1是删除");

	/**
	 * Create a <code>hrdb.hr_team_member</code> table reference
	 */
	public HrTeamMember() {
		this("hr_team_member", null);
	}

	/**
	 * Create an aliased <code>hrdb.hr_team_member</code> table reference
	 */
	public HrTeamMember(String alias) {
		this(alias, HR_TEAM_MEMBER);
	}

	private HrTeamMember(String alias, Table<HrTeamMemberRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrTeamMember(String alias, Table<HrTeamMemberRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "团队成员信息");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrTeamMemberRecord, Integer> getIdentity() {
		return Keys.IDENTITY_HR_TEAM_MEMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrTeamMemberRecord> getPrimaryKey() {
		return Keys.KEY_HR_TEAM_MEMBER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrTeamMemberRecord>> getKeys() {
		return Arrays.<UniqueKey<HrTeamMemberRecord>>asList(Keys.KEY_HR_TEAM_MEMBER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrTeamMember as(String alias) {
		return new HrTeamMember(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrTeamMember rename(String name) {
		return new HrTeamMember(name, null);
	}
}
