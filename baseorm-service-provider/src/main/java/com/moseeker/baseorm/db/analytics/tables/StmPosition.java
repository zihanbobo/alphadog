/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.Keys;
import com.moseeker.baseorm.db.analytics.tables.records.StmPositionRecord;

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
public class StmPosition extends TableImpl<StmPositionRecord> {

    private static final long serialVersionUID = 1816599164;

    /**
     * The reference instance of <code>analytics.stm_position</code>
     */
    public static final StmPosition STM_POSITION = new StmPosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StmPositionRecord> getRecordType() {
        return StmPositionRecord.class;
    }

    /**
     * The column <code>analytics.stm_position.id</code>.
     */
    public final TableField<StmPositionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>analytics.stm_position.create_time</code>.
     */
    public final TableField<StmPositionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>analytics.stm_position.pid</code>.
     */
    public final TableField<StmPositionRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>analytics.stm_position.recom</code>.
     */
    public final TableField<StmPositionRecord, String> RECOM = createField("recom", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>analytics.stm_position.remote_ip</code>.
     */
    public final TableField<StmPositionRecord, String> REMOTE_IP = createField("remote_ip", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>analytics.stm_position.viewer_id</code>.
     */
    public final TableField<StmPositionRecord, String> VIEWER_ID = createField("viewer_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>analytics.stm_position.open_id</code>.
     */
    public final TableField<StmPositionRecord, String> OPEN_ID = createField("open_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>analytics.stm_position.wechat_id</code>.
     */
    public final TableField<StmPositionRecord, Integer> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>analytics.stm_position</code> table reference
     */
    public StmPosition() {
        this("stm_position", null);
    }

    /**
     * Create an aliased <code>analytics.stm_position</code> table reference
     */
    public StmPosition(String alias) {
        this(alias, STM_POSITION);
    }

    private StmPosition(String alias, Table<StmPositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private StmPosition(String alias, Table<StmPositionRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StmPositionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STM_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StmPositionRecord> getPrimaryKey() {
        return Keys.KEY_STM_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StmPositionRecord>> getKeys() {
        return Arrays.<UniqueKey<StmPositionRecord>>asList(Keys.KEY_STM_POSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StmPosition as(String alias) {
        return new StmPosition(alias, this);
    }

    /**
     * Rename this table
     */
    public StmPosition rename(String name) {
        return new StmPosition(name, null);
    }
}
