/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.userdb.tables;


import com.moseeker.baseorm.db.userdb.Keys;
import com.moseeker.baseorm.db.userdb.Userdb;
import com.moseeker.baseorm.db.userdb.tables.records.UserCollectPositionRecord;

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
 * 用户职位收藏
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCollectPosition extends TableImpl<UserCollectPositionRecord> {

    private static final long serialVersionUID = -1648079937;

    /**
     * The reference instance of <code>userdb.user_collect_position</code>
     */
    public static final UserCollectPosition USER_COLLECT_POSITION = new UserCollectPosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserCollectPositionRecord> getRecordType() {
        return UserCollectPositionRecord.class;
    }

    /**
     * The column <code>userdb.user_collect_position.id</code>.
     */
    public final TableField<UserCollectPositionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>userdb.user_collect_position.user_id</code>. 用户id
     */
    public final TableField<UserCollectPositionRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "用户id");

    /**
     * The column <code>userdb.user_collect_position.position_id</code>. 职位id
     */
    public final TableField<UserCollectPositionRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "职位id");

    /**
     * The column <code>userdb.user_collect_position.status</code>. 0:收藏, 1:取消收藏
     */
    public final TableField<UserCollectPositionRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0:收藏, 1:取消收藏");

    /**
     * The column <code>userdb.user_collect_position.create_time</code>. 创建时间
     */
    public final TableField<UserCollectPositionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>userdb.user_collect_position.update_time</code>. 修改时间
     */
    public final TableField<UserCollectPositionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * Create a <code>userdb.user_collect_position</code> table reference
     */
    public UserCollectPosition() {
        this("user_collect_position", null);
    }

    /**
     * Create an aliased <code>userdb.user_collect_position</code> table reference
     */
    public UserCollectPosition(String alias) {
        this(alias, USER_COLLECT_POSITION);
    }

    private UserCollectPosition(String alias, Table<UserCollectPositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserCollectPosition(String alias, Table<UserCollectPositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户职位收藏");
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
    public Identity<UserCollectPositionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_COLLECT_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserCollectPositionRecord> getPrimaryKey() {
        return Keys.KEY_USER_COLLECT_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserCollectPositionRecord>> getKeys() {
        return Arrays.<UniqueKey<UserCollectPositionRecord>>asList(Keys.KEY_USER_COLLECT_POSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCollectPosition as(String alias) {
        return new UserCollectPosition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserCollectPosition rename(String name) {
        return new UserCollectPosition(name, null);
    }
}
