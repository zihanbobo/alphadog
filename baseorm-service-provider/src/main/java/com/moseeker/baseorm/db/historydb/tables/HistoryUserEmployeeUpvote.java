/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.historydb.tables;


import com.moseeker.baseorm.db.historydb.Historydb;
import com.moseeker.baseorm.db.historydb.tables.records.HistoryUserEmployeeUpvoteRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * 员工点赞历史记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryUserEmployeeUpvote extends TableImpl<HistoryUserEmployeeUpvoteRecord> {

    private static final long serialVersionUID = -773559911;

    /**
     * The reference instance of <code>historydb.history_user_employee_upvote</code>
     */
    public static final HistoryUserEmployeeUpvote HISTORY_USER_EMPLOYEE_UPVOTE = new HistoryUserEmployeeUpvote();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HistoryUserEmployeeUpvoteRecord> getRecordType() {
        return HistoryUserEmployeeUpvoteRecord.class;
    }

    /**
     * The column <code>historydb.history_user_employee_upvote.id</code>. 主键
     */
    public final TableField<HistoryUserEmployeeUpvoteRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主键");

    /**
     * The column <code>historydb.history_user_employee_upvote.sender</code>. 点赞的人的仟寻员工编号
     */
    public final TableField<HistoryUserEmployeeUpvoteRecord, Integer> SENDER = createField("sender", org.jooq.impl.SQLDataType.INTEGER, this, "点赞的人的仟寻员工编号");

    /**
     * The column <code>historydb.history_user_employee_upvote.receiver</code>. 被点赞的人的仟寻员工编号
     */
    public final TableField<HistoryUserEmployeeUpvoteRecord, Integer> RECEIVER = createField("receiver", org.jooq.impl.SQLDataType.INTEGER, this, "被点赞的人的仟寻员工编号");

    /**
     * The column <code>historydb.history_user_employee_upvote.company_id</code>. 公司编号，用于标识哪家员工的点赞
     */
    public final TableField<HistoryUserEmployeeUpvoteRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER, this, "公司编号，用于标识哪家员工的点赞");

    /**
     * The column <code>historydb.history_user_employee_upvote.upvote_time</code>. 点赞时间
     */
    public final TableField<HistoryUserEmployeeUpvoteRecord, Timestamp> UPVOTE_TIME = createField("upvote_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "点赞时间");

    /**
     * The column <code>historydb.history_user_employee_upvote.cancel</code>. 是否可用, 0 表示 点赞，1表示取消点赞
     */
    public final TableField<HistoryUserEmployeeUpvoteRecord, Byte> CANCEL = createField("cancel", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否可用, 0 表示 点赞，1表示取消点赞");

    /**
     * The column <code>historydb.history_user_employee_upvote.cancel_time</code>. 取消时间
     */
    public final TableField<HistoryUserEmployeeUpvoteRecord, Timestamp> CANCEL_TIME = createField("cancel_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "取消时间");

    /**
     * The column <code>historydb.history_user_employee_upvote.create_time</code>. 创建时间
     */
    public final TableField<HistoryUserEmployeeUpvoteRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>historydb.history_user_employee_upvote.update_time</code>. 修改时间
     */
    public final TableField<HistoryUserEmployeeUpvoteRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * Create a <code>historydb.history_user_employee_upvote</code> table reference
     */
    public HistoryUserEmployeeUpvote() {
        this("history_user_employee_upvote", null);
    }

    /**
     * Create an aliased <code>historydb.history_user_employee_upvote</code> table reference
     */
    public HistoryUserEmployeeUpvote(String alias) {
        this(alias, HISTORY_USER_EMPLOYEE_UPVOTE);
    }

    private HistoryUserEmployeeUpvote(String alias, Table<HistoryUserEmployeeUpvoteRecord> aliased) {
        this(alias, aliased, null);
    }

    private HistoryUserEmployeeUpvote(String alias, Table<HistoryUserEmployeeUpvoteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "员工点赞历史记录");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Historydb.HISTORYDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryUserEmployeeUpvote as(String alias) {
        return new HistoryUserEmployeeUpvote(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HistoryUserEmployeeUpvote rename(String name) {
        return new HistoryUserEmployeeUpvote(name, null);
    }
}
