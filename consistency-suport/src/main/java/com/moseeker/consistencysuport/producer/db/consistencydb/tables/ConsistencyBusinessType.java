/*
 * This file is generated by jOOQ.
*/
package com.moseeker.consistencysuport.producer.db.consistencydb.tables;


import com.moseeker.consistencysuport.producer.db.consistencydb.Consistencydb;
import com.moseeker.consistencysuport.producer.db.consistencydb.Keys;
import com.moseeker.consistencysuport.producer.db.consistencydb.tables.records.ConsistencyBusinessTypeRecord;

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
 * 消息业务类型表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConsistencyBusinessType extends TableImpl<ConsistencyBusinessTypeRecord> {

    private static final long serialVersionUID = -1783733669;

    /**
     * The reference instance of <code>consistencydb.consistency_business_type</code>
     */
    public static final ConsistencyBusinessType CONSISTENCY_BUSINESS_TYPE = new ConsistencyBusinessType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConsistencyBusinessTypeRecord> getRecordType() {
        return ConsistencyBusinessTypeRecord.class;
    }

    /**
     * The column <code>consistencydb.consistency_business_type.name</code>. 业务名称，不允许重复
     */
    public final TableField<ConsistencyBusinessTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "业务名称，不允许重复");

    /**
     * The column <code>consistencydb.consistency_business_type.message_name</code>. consistency_message.name
     */
    public final TableField<ConsistencyBusinessTypeRecord, String> MESSAGE_NAME = createField("message_name", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "consistency_message.name");

    /**
     * The column <code>consistencydb.consistency_business_type.register_time</code>. 业务注册时间
     */
    public final TableField<ConsistencyBusinessTypeRecord, Timestamp> REGISTER_TIME = createField("register_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "业务注册时间");

    /**
     * The column <code>consistencydb.consistency_business_type.update_time</code>. 更新时间
     */
    public final TableField<ConsistencyBusinessTypeRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>consistencydb.consistency_business_type.last_shake_hand_time</code>. 最后握手的时间
     */
    public final TableField<ConsistencyBusinessTypeRecord, Timestamp> LAST_SHAKE_HAND_TIME = createField("last_shake_hand_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "最后握手的时间");

    /**
     * The column <code>consistencydb.consistency_business_type.receive_email</code>. 接收告警邮件通知的邮箱
     */
    public final TableField<ConsistencyBusinessTypeRecord, String> RECEIVE_EMAIL = createField("receive_email", org.jooq.impl.SQLDataType.VARCHAR.length(120).nullable(false), this, "接收告警邮件通知的邮箱");

    /**
     * The column <code>consistencydb.consistency_business_type.enable</code>. 是否是正常的数据 0：表示逻辑删除，1表示正常数据
     */
    public final TableField<ConsistencyBusinessTypeRecord, Byte> ENABLE = createField("enable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否是正常的数据 0：表示逻辑删除，1表示正常数据");

    /**
     * Create a <code>consistencydb.consistency_business_type</code> table reference
     */
    public ConsistencyBusinessType() {
        this("consistency_business_type", null);
    }

    /**
     * Create an aliased <code>consistencydb.consistency_business_type</code> table reference
     */
    public ConsistencyBusinessType(String alias) {
        this(alias, CONSISTENCY_BUSINESS_TYPE);
    }

    private ConsistencyBusinessType(String alias, Table<ConsistencyBusinessTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConsistencyBusinessType(String alias, Table<ConsistencyBusinessTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "消息业务类型表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Consistencydb.CONSISTENCYDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ConsistencyBusinessTypeRecord> getPrimaryKey() {
        return Keys.KEY_CONSISTENCY_BUSINESS_TYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ConsistencyBusinessTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<ConsistencyBusinessTypeRecord>>asList(Keys.KEY_CONSISTENCY_BUSINESS_TYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConsistencyBusinessType as(String alias) {
        return new ConsistencyBusinessType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConsistencyBusinessType rename(String name) {
        return new ConsistencyBusinessType(name, null);
    }
}
