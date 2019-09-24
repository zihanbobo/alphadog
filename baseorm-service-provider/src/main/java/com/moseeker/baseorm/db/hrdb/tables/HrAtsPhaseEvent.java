/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrAtsPhaseEventRecord;

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
 * 企业l阶段事件挂载中间表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrAtsPhaseEvent extends TableImpl<HrAtsPhaseEventRecord> {

    private static final long serialVersionUID = 2138445386;

    /**
     * The reference instance of <code>hrdb.hr_ats_phase_event</code>
     */
    public static final HrAtsPhaseEvent HR_ATS_PHASE_EVENT = new HrAtsPhaseEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrAtsPhaseEventRecord> getRecordType() {
        return HrAtsPhaseEventRecord.class;
    }

    /**
     * The column <code>hrdb.hr_ats_phase_event.id</code>.
     */
    public final TableField<HrAtsPhaseEventRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_ats_phase_event.process_id</code>. hr_ats_process_base_item.id  流程配置项
     */
    public final TableField<HrAtsPhaseEventRecord, Integer> PROCESS_ID = createField("process_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "hr_ats_process_base_item.id  流程配置项");

    /**
     * The column <code>hrdb.hr_ats_phase_event.event_id</code>. 执行的事件id
     */
    public final TableField<HrAtsPhaseEventRecord, Integer> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "执行的事件id");

    /**
     * The column <code>hrdb.hr_ats_phase_event.event_order</code>. 事件顺序
     */
    public final TableField<HrAtsPhaseEventRecord, Integer> EVENT_ORDER = createField("event_order", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "事件顺序");

    /**
     * The column <code>hrdb.hr_ats_phase_event.other_id</code>. 配置的id 一般用于邮件模板id，常用于邮件事件当中
     */
    public final TableField<HrAtsPhaseEventRecord, Integer> OTHER_ID = createField("other_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "配置的id 一般用于邮件模板id，常用于邮件事件当中");

    /**
     * The column <code>hrdb.hr_ats_phase_event.disable</code>. 0有效 1无效
     */
    public final TableField<HrAtsPhaseEventRecord, Integer> DISABLE = createField("disable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0有效 1无效");

    /**
     * The column <code>hrdb.hr_ats_phase_event.create_time</code>. 创建时间
     */
    public final TableField<HrAtsPhaseEventRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_ats_phase_event.update_time</code>. 更新时间
     */
    public final TableField<HrAtsPhaseEventRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>hrdb.hr_ats_phase_event</code> table reference
     */
    public HrAtsPhaseEvent() {
        this("hr_ats_phase_event", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_ats_phase_event</code> table reference
     */
    public HrAtsPhaseEvent(String alias) {
        this(alias, HR_ATS_PHASE_EVENT);
    }

    private HrAtsPhaseEvent(String alias, Table<HrAtsPhaseEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrAtsPhaseEvent(String alias, Table<HrAtsPhaseEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "企业l阶段事件挂载中间表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Hrdb.HRDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HrAtsPhaseEventRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_ATS_PHASE_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrAtsPhaseEventRecord> getPrimaryKey() {
        return Keys.KEY_HR_ATS_PHASE_EVENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrAtsPhaseEventRecord>> getKeys() {
        return Arrays.<UniqueKey<HrAtsPhaseEventRecord>>asList(Keys.KEY_HR_ATS_PHASE_EVENT_PRIMARY, Keys.KEY_HR_ATS_PHASE_EVENT_HR_ATS_PHASE_EVENT_PROCESS_ID_EVENT_ID_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrAtsPhaseEvent as(String alias) {
        return new HrAtsPhaseEvent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrAtsPhaseEvent rename(String name) {
        return new HrAtsPhaseEvent(name, null);
    }
}
