/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrHeadhunterOmsConfRecord;

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
 * 猎头管理OMS配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrHeadhunterOmsConf extends TableImpl<HrHeadhunterOmsConfRecord> {

    private static final long serialVersionUID = -584966747;

    /**
     * The reference instance of <code>hrdb.hr_headhunter_oms_conf</code>
     */
    public static final HrHeadhunterOmsConf HR_HEADHUNTER_OMS_CONF = new HrHeadhunterOmsConf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrHeadhunterOmsConfRecord> getRecordType() {
        return HrHeadhunterOmsConfRecord.class;
    }

    /**
     * The column <code>hrdb.hr_headhunter_oms_conf.id</code>. 主键
     */
    public final TableField<HrHeadhunterOmsConfRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主键");

    /**
     * The column <code>hrdb.hr_headhunter_oms_conf.company_id</code>. 公司ID
     */
    public final TableField<HrHeadhunterOmsConfRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "公司ID");

    /**
     * The column <code>hrdb.hr_headhunter_oms_conf.channel_count</code>. 猎头渠道数量
     */
    public final TableField<HrHeadhunterOmsConfRecord, Integer> CHANNEL_COUNT = createField("channel_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "猎头渠道数量");

    /**
     * The column <code>hrdb.hr_headhunter_oms_conf.channel_status</code>. 渠道开关，true ：开通， false：关闭
     */
    public final TableField<HrHeadhunterOmsConfRecord, Byte> CHANNEL_STATUS = createField("channel_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "渠道开关，true ：开通， false：关闭");

    /**
     * The column <code>hrdb.hr_headhunter_oms_conf.login_url</code>. 猎头登录url
     */
    public final TableField<HrHeadhunterOmsConfRecord, String> LOGIN_URL = createField("login_url", org.jooq.impl.SQLDataType.VARCHAR.length(1000), this, "猎头登录url");

    /**
     * The column <code>hrdb.hr_headhunter_oms_conf.create_time</code>. 创建时间
     */
    public final TableField<HrHeadhunterOmsConfRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_headhunter_oms_conf.update_time</code>. 更新时间
     */
    public final TableField<HrHeadhunterOmsConfRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>hrdb.hr_headhunter_oms_conf</code> table reference
     */
    public HrHeadhunterOmsConf() {
        this("hr_headhunter_oms_conf", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_headhunter_oms_conf</code> table reference
     */
    public HrHeadhunterOmsConf(String alias) {
        this(alias, HR_HEADHUNTER_OMS_CONF);
    }

    private HrHeadhunterOmsConf(String alias, Table<HrHeadhunterOmsConfRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrHeadhunterOmsConf(String alias, Table<HrHeadhunterOmsConfRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "猎头管理OMS配置表");
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
    public Identity<HrHeadhunterOmsConfRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_HEADHUNTER_OMS_CONF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrHeadhunterOmsConfRecord> getPrimaryKey() {
        return Keys.KEY_HR_HEADHUNTER_OMS_CONF_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrHeadhunterOmsConfRecord>> getKeys() {
        return Arrays.<UniqueKey<HrHeadhunterOmsConfRecord>>asList(Keys.KEY_HR_HEADHUNTER_OMS_CONF_PRIMARY, Keys.KEY_HR_HEADHUNTER_OMS_CONF_COMPANY_ID_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrHeadhunterOmsConf as(String alias) {
        return new HrHeadhunterOmsConf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrHeadhunterOmsConf rename(String name) {
        return new HrHeadhunterOmsConf(name, null);
    }
}