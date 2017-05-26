/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrReferralStatisticsRecord;

import java.sql.Date;
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
 * 内推统计表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrReferralStatistics extends TableImpl<HrReferralStatisticsRecord> {

    private static final long serialVersionUID = -299703401;

    /**
     * The reference instance of <code>hrdb.hr_referral_statistics</code>
     */
    public static final HrReferralStatistics HR_REFERRAL_STATISTICS = new HrReferralStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrReferralStatisticsRecord> getRecordType() {
        return HrReferralStatisticsRecord.class;
    }

    /**
     * The column <code>hrdb.hr_referral_statistics.id</code>. primary key
     */
    public final TableField<HrReferralStatisticsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "primary key");

    /**
     * The column <code>hrdb.hr_referral_statistics.position_title</code>. hr_position.title
     */
    public final TableField<HrReferralStatisticsRecord, String> POSITION_TITLE = createField("position_title", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false), this, "hr_position.title");

    /**
     * The column <code>hrdb.hr_referral_statistics.employee_name</code>. sys_employee.cname
     */
    public final TableField<HrReferralStatisticsRecord, String> EMPLOYEE_NAME = createField("employee_name", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "sys_employee.cname");

    /**
     * The column <code>hrdb.hr_referral_statistics.employee_id</code>. 推荐员工 sys.employee.id
     */
    public final TableField<HrReferralStatisticsRecord, Integer> EMPLOYEE_ID = createField("employee_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "推荐员工 sys.employee.id");

    /**
     * The column <code>hrdb.hr_referral_statistics.company_id</code>. sys_wechat.id
     */
    public final TableField<HrReferralStatisticsRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "sys_wechat.id");

    /**
     * The column <code>hrdb.hr_referral_statistics.create_date</code>. 创建时间
     */
    public final TableField<HrReferralStatisticsRecord, Date> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "创建时间");

    /**
     * The column <code>hrdb.hr_referral_statistics.recom_num</code>. 推荐浏览人次
     */
    public final TableField<HrReferralStatisticsRecord, Integer> RECOM_NUM = createField("recom_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "推荐浏览人次");

    /**
     * The column <code>hrdb.hr_referral_statistics.recom_fav_num</code>. 推荐感兴趣人次
     */
    public final TableField<HrReferralStatisticsRecord, Integer> RECOM_FAV_NUM = createField("recom_fav_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "推荐感兴趣人次");

    /**
     * The column <code>hrdb.hr_referral_statistics.recom_mobile_num</code>. 推荐留手机人次
     */
    public final TableField<HrReferralStatisticsRecord, Integer> RECOM_MOBILE_NUM = createField("recom_mobile_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "推荐留手机人次");

    /**
     * The column <code>hrdb.hr_referral_statistics.recom_apply_num</code>. 推荐投递人次
     */
    public final TableField<HrReferralStatisticsRecord, Integer> RECOM_APPLY_NUM = createField("recom_apply_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "推荐投递人次");

    /**
     * The column <code>hrdb.hr_referral_statistics.recom_after_review_num</code>. 推荐评审通过人数
     */
    public final TableField<HrReferralStatisticsRecord, Integer> RECOM_AFTER_REVIEW_NUM = createField("recom_after_review_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "推荐评审通过人数");

    /**
     * The column <code>hrdb.hr_referral_statistics.recom_after_interview_num</code>. 推荐面试通过人数
     */
    public final TableField<HrReferralStatisticsRecord, Integer> RECOM_AFTER_INTERVIEW_NUM = createField("recom_after_interview_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "推荐面试通过人数");

    /**
     * The column <code>hrdb.hr_referral_statistics.recom_on_board_num</code>. 推荐入职人数
     */
    public final TableField<HrReferralStatisticsRecord, Integer> RECOM_ON_BOARD_NUM = createField("recom_on_board_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "推荐入职人数");

    /**
     * The column <code>hrdb.hr_referral_statistics.info_type</code>. 0: 日数据，1：周数据，2：月数据
     */
    public final TableField<HrReferralStatisticsRecord, Integer> INFO_TYPE = createField("info_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0: 日数据，1：周数据，2：月数据");

    /**
     * The column <code>hrdb.hr_referral_statistics.publisher</code>.
     */
    public final TableField<HrReferralStatisticsRecord, Integer> PUBLISHER = createField("publisher", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>hrdb.hr_referral_statistics.position_id</code>. job.position_id
     */
    public final TableField<HrReferralStatisticsRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "job.position_id");

    /**
     * Create a <code>hrdb.hr_referral_statistics</code> table reference
     */
    public HrReferralStatistics() {
        this("hr_referral_statistics", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_referral_statistics</code> table reference
     */
    public HrReferralStatistics(String alias) {
        this(alias, HR_REFERRAL_STATISTICS);
    }

    private HrReferralStatistics(String alias, Table<HrReferralStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrReferralStatistics(String alias, Table<HrReferralStatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "内推统计表");
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
    public Identity<HrReferralStatisticsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_REFERRAL_STATISTICS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrReferralStatisticsRecord> getPrimaryKey() {
        return Keys.KEY_HR_REFERRAL_STATISTICS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrReferralStatisticsRecord>> getKeys() {
        return Arrays.<UniqueKey<HrReferralStatisticsRecord>>asList(Keys.KEY_HR_REFERRAL_STATISTICS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrReferralStatistics as(String alias) {
        return new HrReferralStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    public HrReferralStatistics rename(String name) {
        return new HrReferralStatistics(name, null);
    }
}
