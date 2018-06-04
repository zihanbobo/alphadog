/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables;


import com.moseeker.baseorm.db.userdb.Keys;
import com.moseeker.baseorm.db.userdb.Userdb;
import com.moseeker.baseorm.db.userdb.tables.records.UserViewedPositionRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 用户查看过的职位
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserViewedPosition extends TableImpl<UserViewedPositionRecord> {

    private static final long serialVersionUID = -203536573;

    /**
     * The reference instance of <code>userdb.user_viewed_position</code>
     */
    public static final UserViewedPosition USER_VIEWED_POSITION = new UserViewedPosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserViewedPositionRecord> getRecordType() {
        return UserViewedPositionRecord.class;
    }

    /**
     * The column <code>userdb.user_viewed_position.id</code>.
     */
    public final TableField<UserViewedPositionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>userdb.user_viewed_position.user_id</code>. 用户id
     */
    public final TableField<UserViewedPositionRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户id");

    /**
     * The column <code>userdb.user_viewed_position.position_id</code>. 职位id
     */
    public final TableField<UserViewedPositionRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "职位id");

    /**
     * The column <code>userdb.user_viewed_position.create_time</code>. 创建时间
     */
    public final TableField<UserViewedPositionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * Create a <code>userdb.user_viewed_position</code> table reference
     */
    public UserViewedPosition() {
        this("user_viewed_position", null);
    }

    /**
     * Create an aliased <code>userdb.user_viewed_position</code> table reference
     */
    public UserViewedPosition(String alias) {
        this(alias, USER_VIEWED_POSITION);
    }

    private UserViewedPosition(String alias, Table<UserViewedPositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserViewedPosition(String alias, Table<UserViewedPositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户查看过的职位");
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
    public Identity<UserViewedPositionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_VIEWED_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserViewedPositionRecord> getPrimaryKey() {
        return Keys.KEY_USER_VIEWED_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserViewedPositionRecord>> getKeys() {
        return Arrays.<UniqueKey<UserViewedPositionRecord>>asList(Keys.KEY_USER_VIEWED_POSITION_PRIMARY, Keys.KEY_USER_VIEWED_POSITION_USER_POSITION_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserViewedPosition as(String alias) {
        return new UserViewedPosition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserViewedPosition rename(String name) {
        return new UserViewedPosition(name, null);
    }
}
