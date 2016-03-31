/**
 * This class is generated by jOOQ
 */
package com.moseeker.servicemanager.db.configdb.tables;


import com.moseeker.servicemanager.db.configdb.Configdb;
import com.moseeker.servicemanager.db.configdb.Keys;
import com.moseeker.servicemanager.db.configdb.tables.records.AdminnotificationGroupmembersRecord;

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
 * 管理员通知群组联系人
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminnotificationGroupmembers extends TableImpl<AdminnotificationGroupmembersRecord> {

	private static final long serialVersionUID = 1384683676;

	/**
	 * The reference instance of <code>configDB.adminnotification_groupmembers</code>
	 */
	public static final AdminnotificationGroupmembers ADMINNOTIFICATION_GROUPMEMBERS = new AdminnotificationGroupmembers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AdminnotificationGroupmembersRecord> getRecordType() {
		return AdminnotificationGroupmembersRecord.class;
	}

	/**
	 * The column <code>configDB.adminnotification_groupmembers.id</code>.
	 */
	public final TableField<AdminnotificationGroupmembersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>configDB.adminnotification_groupmembers.groupid</code>. 群组id
	 */
	public final TableField<AdminnotificationGroupmembersRecord, Integer> GROUPID = createField("groupid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "群组id");

	/**
	 * The column <code>configDB.adminnotification_groupmembers.memberid</code>. 联系人id
	 */
	public final TableField<AdminnotificationGroupmembersRecord, Integer> MEMBERID = createField("memberid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "联系人id");

	/**
	 * The column <code>configDB.adminnotification_groupmembers.create_time</code>.
	 */
	public final TableField<AdminnotificationGroupmembersRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>configDB.adminnotification_groupmembers</code> table reference
	 */
	public AdminnotificationGroupmembers() {
		this("adminnotification_groupmembers", null);
	}

	/**
	 * Create an aliased <code>configDB.adminnotification_groupmembers</code> table reference
	 */
	public AdminnotificationGroupmembers(String alias) {
		this(alias, ADMINNOTIFICATION_GROUPMEMBERS);
	}

	private AdminnotificationGroupmembers(String alias, Table<AdminnotificationGroupmembersRecord> aliased) {
		this(alias, aliased, null);
	}

	private AdminnotificationGroupmembers(String alias, Table<AdminnotificationGroupmembersRecord> aliased, Field<?>[] parameters) {
		super(alias, Configdb.CONFIGDB, aliased, parameters, "管理员通知群组联系人");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AdminnotificationGroupmembersRecord, Integer> getIdentity() {
		return Keys.IDENTITY_ADMINNOTIFICATION_GROUPMEMBERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AdminnotificationGroupmembersRecord> getPrimaryKey() {
		return Keys.KEY_ADMINNOTIFICATION_GROUPMEMBERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AdminnotificationGroupmembersRecord>> getKeys() {
		return Arrays.<UniqueKey<AdminnotificationGroupmembersRecord>>asList(Keys.KEY_ADMINNOTIFICATION_GROUPMEMBERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AdminnotificationGroupmembers as(String alias) {
		return new AdminnotificationGroupmembers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AdminnotificationGroupmembers rename(String name) {
		return new AdminnotificationGroupmembers(name, null);
	}
}
