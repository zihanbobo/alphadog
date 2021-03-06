/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.logdb.tables;


import com.moseeker.baseorm.db.logdb.Keys;
import com.moseeker.baseorm.db.logdb.Logdb;
import com.moseeker.baseorm.db.logdb.tables.records.LogAiRecomRecord;

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
 * 智能画像日志表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LogAiRecom extends TableImpl<LogAiRecomRecord> {

    private static final long serialVersionUID = 1524205969;

    /**
     * The reference instance of <code>logdb.log_ai_recom</code>
     */
    public static final LogAiRecom LOG_AI_RECOM = new LogAiRecom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LogAiRecomRecord> getRecordType() {
        return LogAiRecomRecord.class;
    }

    /**
     * The column <code>logdb.log_ai_recom.id</code>.
     */
    public final TableField<LogAiRecomRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>logdb.log_ai_recom.user_id</code>. user_user.id
     */
    public final TableField<LogAiRecomRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "user_user.id");

    /**
     * The column <code>logdb.log_ai_recom.company_id</code>. hr_company.id
     */
    public final TableField<LogAiRecomRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "hr_company.id");

    /**
     * The column <code>logdb.log_ai_recom.action</code>. 发送行为，这里发送职位时的职位id
     */
    public final TableField<LogAiRecomRecord, String> ACTION = createField("action", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "发送行为，这里发送职位时的职位id");

    /**
     * The column <code>logdb.log_ai_recom.type</code>. type=1粉丝简历完善
type=2粉丝职位推荐
type=3员工职位推荐
type=4员工简历完善
     */
    public final TableField<LogAiRecomRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "type=1粉丝简历完善\ntype=2粉丝职位推荐\ntype=3员工职位推荐\ntype=4员工简历完善");

    /**
     * The column <code>logdb.log_ai_recom.send_time</code>.
     */
    public final TableField<LogAiRecomRecord, Timestamp> SEND_TIME = createField("send_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>logdb.log_ai_recom.md_code</code>.
     */
    public final TableField<LogAiRecomRecord, String> MD_CODE = createField("md_code", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>logdb.log_ai_recom.algorithm_name</code>.
     */
    public final TableField<LogAiRecomRecord, String> ALGORITHM_NAME = createField("algorithm_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>logdb.log_ai_recom.wx_id</code>.
     */
    public final TableField<LogAiRecomRecord, Integer> WX_ID = createField("wx_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>logdb.log_ai_recom.is_send</code>.
     */
    public final TableField<LogAiRecomRecord, Byte> IS_SEND = createField("is_send", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>logdb.log_ai_recom</code> table reference
     */
    public LogAiRecom() {
        this("log_ai_recom", null);
    }

    /**
     * Create an aliased <code>logdb.log_ai_recom</code> table reference
     */
    public LogAiRecom(String alias) {
        this(alias, LOG_AI_RECOM);
    }

    private LogAiRecom(String alias, Table<LogAiRecomRecord> aliased) {
        this(alias, aliased, null);
    }

    private LogAiRecom(String alias, Table<LogAiRecomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "智能画像日志表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Logdb.LOGDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LogAiRecomRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOG_AI_RECOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LogAiRecomRecord> getPrimaryKey() {
        return Keys.KEY_LOG_AI_RECOM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LogAiRecomRecord>> getKeys() {
        return Arrays.<UniqueKey<LogAiRecomRecord>>asList(Keys.KEY_LOG_AI_RECOM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LogAiRecom as(String alias) {
        return new LogAiRecom(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LogAiRecom rename(String name) {
        return new LogAiRecom(name, null);
    }
}
