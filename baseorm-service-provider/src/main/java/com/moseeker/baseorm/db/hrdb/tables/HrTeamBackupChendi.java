/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.tables.records.HrTeamBackupChendiRecord;

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
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrTeamBackupChendi extends TableImpl<HrTeamBackupChendiRecord> {

    private static final long serialVersionUID = -221109869;

    /**
     * The reference instance of <code>hrdb.hr_team_backup_chendi</code>
     */
    public static final HrTeamBackupChendi HR_TEAM_BACKUP_CHENDI = new HrTeamBackupChendi();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrTeamBackupChendiRecord> getRecordType() {
        return HrTeamBackupChendiRecord.class;
    }

    /**
     * The column <code>hrdb.hr_team_backup_chendi.id</code>.
     */
    public final TableField<HrTeamBackupChendiRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.name</code>. 团队/部门名称
     */
    public final TableField<HrTeamBackupChendiRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "团队/部门名称");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.summary</code>. 职能概述
     */
    public final TableField<HrTeamBackupChendiRecord, String> SUMMARY = createField("summary", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职能概述");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.description</code>. 团队介绍
     */
    public final TableField<HrTeamBackupChendiRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(2048).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "团队介绍");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.show_order</code>. 团队显示顺序
     */
    public final TableField<HrTeamBackupChendiRecord, Integer> SHOW_ORDER = createField("show_order", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "团队显示顺序");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.jd_media</code>. 成员一天信息hr_media.id: [1, 23, 32]
     */
    public final TableField<HrTeamBackupChendiRecord, String> JD_MEDIA = createField("jd_media", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("[]", org.jooq.impl.SQLDataType.VARCHAR)), this, "成员一天信息hr_media.id: [1, 23, 32]");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.company_id</code>. 团队所在母公司
     */
    public final TableField<HrTeamBackupChendiRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "团队所在母公司");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.create_time</code>. 创建时间
     */
    public final TableField<HrTeamBackupChendiRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.update_time</code>. 更新时间
     */
    public final TableField<HrTeamBackupChendiRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.is_show</code>. 当前团队在列表等处是否显示, 0:不显示, 1:显示
     */
    public final TableField<HrTeamBackupChendiRecord, Integer> IS_SHOW = createField("is_show", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "当前团队在列表等处是否显示, 0:不显示, 1:显示");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.slogan</code>. 团队标语
     */
    public final TableField<HrTeamBackupChendiRecord, String> SLOGAN = createField("slogan", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "团队标语");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.res_id</code>. 团队主图片hr_resource.id
     */
    public final TableField<HrTeamBackupChendiRecord, Integer> RES_ID = createField("res_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "团队主图片hr_resource.id");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.team_detail</code>. 团队详情页配置hr_media.id: [1, 23, 32]
     */
    public final TableField<HrTeamBackupChendiRecord, String> TEAM_DETAIL = createField("team_detail", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.inline("[]", org.jooq.impl.SQLDataType.VARCHAR)), this, "团队详情页配置hr_media.id: [1, 23, 32]");

    /**
     * The column <code>hrdb.hr_team_backup_chendi.disable</code>. 0是正常 1是删除
     */
    public final TableField<HrTeamBackupChendiRecord, Integer> DISABLE = createField("disable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0是正常 1是删除");

    /**
     * Create a <code>hrdb.hr_team_backup_chendi</code> table reference
     */
    public HrTeamBackupChendi() {
        this("hr_team_backup_chendi", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_team_backup_chendi</code> table reference
     */
    public HrTeamBackupChendi(String alias) {
        this(alias, HR_TEAM_BACKUP_CHENDI);
    }

    private HrTeamBackupChendi(String alias, Table<HrTeamBackupChendiRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrTeamBackupChendi(String alias, Table<HrTeamBackupChendiRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public HrTeamBackupChendi as(String alias) {
        return new HrTeamBackupChendi(alias, this);
    }

    /**
     * Rename this table
     */

    public HrTeamBackupChendi rename(String name) {
        return new HrTeamBackupChendi(name, null);
    }
}
