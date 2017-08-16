/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.tables.records.StmButtonPidRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StmButtonPid extends TableImpl<StmButtonPidRecord> {

    private static final long serialVersionUID = 1528319254;

    /**
     * The reference instance of <code>analytics.stm_button_pid</code>
     */
    public static final StmButtonPid STM_BUTTON_PID = new StmButtonPid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StmButtonPidRecord> getRecordType() {
        return StmButtonPidRecord.class;
    }

    /**
     * The column <code>analytics.stm_button_pid.id</code>.
     */
    public final TableField<StmButtonPidRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>analytics.stm_button_pid.ab_group</code>.
     */
    public final TableField<StmButtonPidRecord, String> AB_GROUP = createField("ab_group", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>analytics.stm_button_pid.button</code>. 0：推荐朋友，1：我感兴趣，2：我要投递
     */
    public final TableField<StmButtonPidRecord, String> BUTTON = createField("button", org.jooq.impl.SQLDataType.CLOB, this, "0：推荐朋友，1：我感兴趣，2：我要投递");

    /**
     * The column <code>analytics.stm_button_pid.create_time</code>.
     */
    public final TableField<StmButtonPidRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>analytics.stm_button_pid.ip</code>.
     */
    public final TableField<StmButtonPidRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>analytics.stm_button_pid.is_recom</code>.
     */
    public final TableField<StmButtonPidRecord, Byte> IS_RECOM = createField("is_recom", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>analytics.stm_button_pid.pid</code>.
     */
    public final TableField<StmButtonPidRecord, Long> PID = createField("pid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>analytics.stm_button_pid.recom</code>.
     */
    public final TableField<StmButtonPidRecord, String> RECOM = createField("recom", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>analytics.stm_button_pid</code> table reference
     */
    public StmButtonPid() {
        this("stm_button_pid", null);
    }

    /**
     * Create an aliased <code>analytics.stm_button_pid</code> table reference
     */
    public StmButtonPid(String alias) {
        this(alias, STM_BUTTON_PID);
    }

    private StmButtonPid(String alias, Table<StmButtonPidRecord> aliased) {
        this(alias, aliased, null);
    }

    private StmButtonPid(String alias, Table<StmButtonPidRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Analytics.ANALYTICS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmButtonPid as(String alias) {
        return new StmButtonPid(alias, this);
    }

    /**
     * Rename this table
     */
    public StmButtonPid rename(String name) {
        return new StmButtonPid(name, null);
    }
}