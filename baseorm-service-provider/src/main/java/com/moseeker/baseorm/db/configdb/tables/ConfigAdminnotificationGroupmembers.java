/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb.tables;


import com.moseeker.baseorm.db.configdb.Configdb;
import com.moseeker.baseorm.db.configdb.Keys;
import com.moseeker.baseorm.db.configdb.tables.records.ConfigAdminnotificationGroupmembersRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
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
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigAdminnotificationGroupmembers extends TableImpl<ConfigAdminnotificationGroupmembersRecord> {

    private static final long serialVersionUID = 1146907850;

    /**
     * The reference instance of <code>configdb.config_adminnotification_groupmembers</code>
     */
    public static final ConfigAdminnotificationGroupmembers CONFIG_ADMINNOTIFICATION_GROUPMEMBERS = new ConfigAdminnotificationGroupmembers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConfigAdminnotificationGroupmembersRecord> getRecordType() {
        return ConfigAdminnotificationGroupmembersRecord.class;
    }

    /**
     * The column <code>configdb.config_adminnotification_groupmembers.id</code>.
     */
    public final TableField<ConfigAdminnotificationGroupmembersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>configdb.config_adminnotification_groupmembers.groupid</code>. 群组id
     */
    public final TableField<ConfigAdminnotificationGroupmembersRecord, Integer> GROUPID = createField("groupid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "群组id");

    /**
     * The column <code>configdb.config_adminnotification_groupmembers.memberid</code>. 联系人id
     */
    public final TableField<ConfigAdminnotificationGroupmembersRecord, Integer> MEMBERID = createField("memberid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "联系人id");

    /**
     * The column <code>configdb.config_adminnotification_groupmembers.create_time</code>.
     */
    public final TableField<ConfigAdminnotificationGroupmembersRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>configdb.config_adminnotification_groupmembers</code> table reference
     */
    public ConfigAdminnotificationGroupmembers() {
        this("config_adminnotification_groupmembers", null);
    }

    /**
     * Create an aliased <code>configdb.config_adminnotification_groupmembers</code> table reference
     */
    public ConfigAdminnotificationGroupmembers(String alias) {
        this(alias, CONFIG_ADMINNOTIFICATION_GROUPMEMBERS);
    }

    private ConfigAdminnotificationGroupmembers(String alias, Table<ConfigAdminnotificationGroupmembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConfigAdminnotificationGroupmembers(String alias, Table<ConfigAdminnotificationGroupmembersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "管理员通知群组联系人");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Configdb.CONFIGDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ConfigAdminnotificationGroupmembersRecord> getPrimaryKey() {
        return Keys.KEY_CONFIG_ADMINNOTIFICATION_GROUPMEMBERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ConfigAdminnotificationGroupmembersRecord>> getKeys() {
        return Arrays.<UniqueKey<ConfigAdminnotificationGroupmembersRecord>>asList(Keys.KEY_CONFIG_ADMINNOTIFICATION_GROUPMEMBERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigAdminnotificationGroupmembers as(String alias) {
        return new ConfigAdminnotificationGroupmembers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConfigAdminnotificationGroupmembers rename(String name) {
        return new ConfigAdminnotificationGroupmembers(name, null);
    }
}
