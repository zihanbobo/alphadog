/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.tables.records.StmGroupvPidRecord;

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
public class StmGroupvPid extends TableImpl<StmGroupvPidRecord> {

    private static final long serialVersionUID = -2126670830;

    /**
     * The reference instance of <code>analytics.stm_groupv_pid</code>
     */
    public static final StmGroupvPid STM_GROUPV_PID = new StmGroupvPid();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StmGroupvPidRecord> getRecordType() {
        return StmGroupvPidRecord.class;
    }

    /**
     * The column <code>analytics.stm_groupv_pid.id</code>.
     */
    public final TableField<StmGroupvPidRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>analytics.stm_groupv_pid.abgroup</code>.
     */
    public final TableField<StmGroupvPidRecord, Long> ABGROUP = createField("abgroup", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>analytics.stm_groupv_pid.department_id</code>.
     */
    public final TableField<StmGroupvPidRecord, Long> DEPARTMENT_ID = createField("department_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>analytics.stm_groupv_pid.pid</code>.
     */
    public final TableField<StmGroupvPidRecord, Long> PID = createField("pid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>analytics.stm_groupv_pid.wxuser_id</code>.
     */
    public final TableField<StmGroupvPidRecord, Long> WXUSER_ID = createField("wxuser_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>analytics.stm_groupv_pid.create_time</code>.
     */
    public final TableField<StmGroupvPidRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>analytics.stm_groupv_pid</code> table reference
     */
    public StmGroupvPid() {
        this("stm_groupv_pid", null);
    }

    /**
     * Create an aliased <code>analytics.stm_groupv_pid</code> table reference
     */
    public StmGroupvPid(String alias) {
        this(alias, STM_GROUPV_PID);
    }

    private StmGroupvPid(String alias, Table<StmGroupvPidRecord> aliased) {
        this(alias, aliased, null);
    }

    private StmGroupvPid(String alias, Table<StmGroupvPidRecord> aliased, Field<?>[] parameters) {
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
    public StmGroupvPid as(String alias) {
        return new StmGroupvPid(alias, this);
    }

    /**
     * Rename this table
     */
    public StmGroupvPid rename(String name) {
        return new StmGroupvPid(name, null);
    }
}