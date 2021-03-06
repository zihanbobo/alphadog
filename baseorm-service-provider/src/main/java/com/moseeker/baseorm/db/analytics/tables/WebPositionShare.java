/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.analytics.tables;


import com.moseeker.baseorm.db.analytics.Analytics;
import com.moseeker.baseorm.db.analytics.Keys;
import com.moseeker.baseorm.db.analytics.tables.records.WebPositionShareRecord;

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
 * 转发效果统计表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WebPositionShare extends TableImpl<WebPositionShareRecord> {

    private static final long serialVersionUID = 545334370;

    /**
     * The reference instance of <code>analytics.web_position_share</code>
     */
    public static final WebPositionShare WEB_POSITION_SHARE = new WebPositionShare();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WebPositionShareRecord> getRecordType() {
        return WebPositionShareRecord.class;
    }

    /**
     * The column <code>analytics.web_position_share.id</code>. primary key
     */
    public final TableField<WebPositionShareRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "primary key");

    /**
     * The column <code>analytics.web_position_share.company_id</code>. 公司ID, sys_company.id
     */
    public final TableField<WebPositionShareRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "公司ID, sys_company.id");

    /**
     * The column <code>analytics.web_position_share.pv</code>. page view
     */
    public final TableField<WebPositionShareRecord, Integer> PV = createField("pv", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "page view");

    /**
     * The column <code>analytics.web_position_share.uv</code>. user view
     */
    public final TableField<WebPositionShareRecord, Integer> UV = createField("uv", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "user view");

    /**
     * The column <code>analytics.web_position_share.application</code>. 申请量
     */
    public final TableField<WebPositionShareRecord, Integer> APPLICATION = createField("application", org.jooq.impl.SQLDataType.INTEGER, this, "申请量");

    /**
     * The column <code>analytics.web_position_share.share_pv</code>. 转发产生的pv
     */
    public final TableField<WebPositionShareRecord, Integer> SHARE_PV = createField("share_pv", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "转发产生的pv");

    /**
     * The column <code>analytics.web_position_share.employee_spv</code>. 员工转发产生的pv
     */
    public final TableField<WebPositionShareRecord, Integer> EMPLOYEE_SPV = createField("employee_spv", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "员工转发产生的pv");

    /**
     * The column <code>analytics.web_position_share.share_uv</code>. 转发产生的uv
     */
    public final TableField<WebPositionShareRecord, Integer> SHARE_UV = createField("share_uv", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "转发产生的uv");

    /**
     * The column <code>analytics.web_position_share.employee_suv</code>. 员工转发产生的uv
     */
    public final TableField<WebPositionShareRecord, Integer> EMPLOYEE_SUV = createField("employee_suv", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "员工转发产生的uv");

    /**
     * The column <code>analytics.web_position_share.share_application</code>. 推荐产生的申请量
     */
    public final TableField<WebPositionShareRecord, Integer> SHARE_APPLICATION = createField("share_application", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "推荐产生的申请量");

    /**
     * The column <code>analytics.web_position_share.employee_sapplication</code>. 员工推荐产生的申请量
     */
    public final TableField<WebPositionShareRecord, Integer> EMPLOYEE_SAPPLICATION = createField("employee_sapplication", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "员工推荐产生的申请量");

    /**
     * The column <code>analytics.web_position_share.share_appuser</code>. 推荐产生的申请人
     */
    public final TableField<WebPositionShareRecord, Integer> SHARE_APPUSER = createField("share_appuser", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "推荐产生的申请人");

    /**
     * The column <code>analytics.web_position_share.employee_sappuser</code>. 员工推荐产生的申请人
     */
    public final TableField<WebPositionShareRecord, Integer> EMPLOYEE_SAPPUSER = createField("employee_sappuser", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "员工推荐产生的申请人");

    /**
     * The column <code>analytics.web_position_share.create_time</code>.
     */
    public final TableField<WebPositionShareRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>analytics.web_position_share</code> table reference
     */
    public WebPositionShare() {
        this("web_position_share", null);
    }

    /**
     * Create an aliased <code>analytics.web_position_share</code> table reference
     */
    public WebPositionShare(String alias) {
        this(alias, WEB_POSITION_SHARE);
    }

    private WebPositionShare(String alias, Table<WebPositionShareRecord> aliased) {
        this(alias, aliased, null);
    }

    private WebPositionShare(String alias, Table<WebPositionShareRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "转发效果统计表");
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
    public Identity<WebPositionShareRecord, Integer> getIdentity() {
        return Keys.IDENTITY_WEB_POSITION_SHARE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WebPositionShareRecord> getPrimaryKey() {
        return Keys.KEY_WEB_POSITION_SHARE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WebPositionShareRecord>> getKeys() {
        return Arrays.<UniqueKey<WebPositionShareRecord>>asList(Keys.KEY_WEB_POSITION_SHARE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebPositionShare as(String alias) {
        return new WebPositionShare(alias, this);
    }

    /**
     * Rename this table
     */
    public WebPositionShare rename(String name) {
        return new WebPositionShare(name, null);
    }
}
