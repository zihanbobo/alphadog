/**
 * This class is generated by jOOQ
 */
package com.moseeker.servicemanager.db.configdb;


import com.moseeker.servicemanager.db.configdb.tables.AdminnotificationEvents;
import com.moseeker.servicemanager.db.configdb.tables.AdminnotificationGroup;
import com.moseeker.servicemanager.db.configdb.tables.AdminnotificationGroupmembers;
import com.moseeker.servicemanager.db.configdb.tables.AdminnotificationMembers;
import com.moseeker.servicemanager.db.configdb.tables.CacheconfigRediskey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Configdb extends SchemaImpl {

	private static final long serialVersionUID = 609575192;

	/**
	 * The reference instance of <code>configDB</code>
	 */
	public static final Configdb CONFIGDB = new Configdb();

	/**
	 * No further instances allowed
	 */
	private Configdb() {
		super("configDB");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			AdminnotificationEvents.ADMINNOTIFICATION_EVENTS,
			AdminnotificationGroup.ADMINNOTIFICATION_GROUP,
			AdminnotificationGroupmembers.ADMINNOTIFICATION_GROUPMEMBERS,
			AdminnotificationMembers.ADMINNOTIFICATION_MEMBERS,
			CacheconfigRediskey.CACHECONFIG_REDISKEY);
	}
}
