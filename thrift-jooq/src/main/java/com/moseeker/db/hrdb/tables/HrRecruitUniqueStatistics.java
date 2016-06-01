/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.hrdb.tables;


import com.moseeker.db.hrdb.Hrdb;
import com.moseeker.db.hrdb.Keys;
import com.moseeker.db.hrdb.tables.records.HrRecruitUniqueStatisticsRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 招聘数据去重信息统计表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrRecruitUniqueStatistics extends TableImpl<HrRecruitUniqueStatisticsRecord> {

	private static final long serialVersionUID = -2068645327;

	/**
	 * The reference instance of <code>hrDB.hr_recruit_unique_statistics</code>
	 */
	public static final HrRecruitUniqueStatistics HR_RECRUIT_UNIQUE_STATISTICS = new HrRecruitUniqueStatistics();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HrRecruitUniqueStatisticsRecord> getRecordType() {
		return HrRecruitUniqueStatisticsRecord.class;
	}

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.id</code>. primary key
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "primary key");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.position_id</code>. hr_position.id
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "hr_position.id");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.company_id</code>. company.id
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "company.id");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.jd_uv</code>. JD 页浏览人数
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> JD_UV = createField("jd_uv", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "JD 页浏览人数");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.recom_jd_uv</code>. JD 页推荐浏览人数
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> RECOM_JD_UV = createField("recom_jd_uv", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "JD 页推荐浏览人数");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.fav_num</code>. 感兴趣的人数
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> FAV_NUM = createField("fav_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "感兴趣的人数");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.recom_fav_num</code>. 推荐感兴趣的人数
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> RECOM_FAV_NUM = createField("recom_fav_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "推荐感兴趣的人数");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.mobile_num</code>. 留手机的人数
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> MOBILE_NUM = createField("mobile_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "留手机的人数");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.recom_mobile_num</code>. 推荐感兴趣留手机的人数
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> RECOM_MOBILE_NUM = createField("recom_mobile_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "推荐感兴趣留手机的人数");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.apply_num</code>. 投递人数
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> APPLY_NUM = createField("apply_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "投递人数");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.recom_apply_num</code>. 推荐投递人数
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> RECOM_APPLY_NUM = createField("recom_apply_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "推荐投递人数");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.create_date</code>. 创建日期
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Date> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "创建日期");

	/**
	 * The column <code>hrDB.hr_recruit_unique_statistics.info_type</code>. 0: 日数据，1：周数据，2：月数据
	 */
	public final TableField<HrRecruitUniqueStatisticsRecord, Integer> INFO_TYPE = createField("info_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "0: 日数据，1：周数据，2：月数据");

	/**
	 * Create a <code>hrDB.hr_recruit_unique_statistics</code> table reference
	 */
	public HrRecruitUniqueStatistics() {
		this("hr_recruit_unique_statistics", null);
	}

	/**
	 * Create an aliased <code>hrDB.hr_recruit_unique_statistics</code> table reference
	 */
	public HrRecruitUniqueStatistics(String alias) {
		this(alias, HR_RECRUIT_UNIQUE_STATISTICS);
	}

	private HrRecruitUniqueStatistics(String alias, Table<HrRecruitUniqueStatisticsRecord> aliased) {
		this(alias, aliased, null);
	}

	private HrRecruitUniqueStatistics(String alias, Table<HrRecruitUniqueStatisticsRecord> aliased, Field<?>[] parameters) {
		super(alias, Hrdb.HRDB, aliased, parameters, "招聘数据去重信息统计表");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<HrRecruitUniqueStatisticsRecord, Integer> getIdentity() {
		return Keys.IDENTITY_HR_RECRUIT_UNIQUE_STATISTICS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<HrRecruitUniqueStatisticsRecord> getPrimaryKey() {
		return Keys.KEY_HR_RECRUIT_UNIQUE_STATISTICS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<HrRecruitUniqueStatisticsRecord>> getKeys() {
		return Arrays.<UniqueKey<HrRecruitUniqueStatisticsRecord>>asList(Keys.KEY_HR_RECRUIT_UNIQUE_STATISTICS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitUniqueStatistics as(String alias) {
		return new HrRecruitUniqueStatistics(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HrRecruitUniqueStatistics rename(String name) {
		return new HrRecruitUniqueStatistics(name, null);
	}
}
