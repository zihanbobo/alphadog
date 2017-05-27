/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.userdb.tables;


import com.moseeker.baseorm.db.userdb.Userdb;
import com.moseeker.baseorm.db.userdb.tables.records.UserIntentionRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * 用户求职意向
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserIntention extends TableImpl<UserIntentionRecord> {

    private static final long serialVersionUID = -1961479114;

    /**
     * The reference instance of <code>userdb.user_intention</code>
     */
    public static final UserIntention USER_INTENTION = new UserIntention();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserIntentionRecord> getRecordType() {
        return UserIntentionRecord.class;
    }

    /**
     * The column <code>userdb.user_intention.sysuser_id</code>. 用户ID
     */
    public final TableField<UserIntentionRecord, Integer> SYSUSER_ID = createField("sysuser_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "用户ID");

    /**
     * The column <code>userdb.user_intention.intention</code>. 求职意向
     */
    public final TableField<UserIntentionRecord, String> INTENTION = createField("intention", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "求职意向");

    /**
     * The column <code>userdb.user_intention.create_time</code>.
     */
    public final TableField<UserIntentionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>userdb.user_intention.update_time</code>.
     */
    public final TableField<UserIntentionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>userdb.user_intention</code> table reference
     */
    public UserIntention() {
        this("user_intention", null);
    }

    /**
     * Create an aliased <code>userdb.user_intention</code> table reference
     */
    public UserIntention(String alias) {
        this(alias, USER_INTENTION);
    }

    private UserIntention(String alias, Table<UserIntentionRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserIntention(String alias, Table<UserIntentionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户求职意向");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Userdb.USERDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserIntention as(String alias) {
        return new UserIntention(alias, this);
    }

    /**
     * Rename this table
     */
    public UserIntention rename(String name) {
        return new UserIntention(name, null);
    }
}
