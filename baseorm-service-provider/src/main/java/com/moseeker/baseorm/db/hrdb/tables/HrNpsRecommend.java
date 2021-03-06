/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrNpsRecommendRecord;

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
 * hr推荐同行表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrNpsRecommend extends TableImpl<HrNpsRecommendRecord> {

    private static final long serialVersionUID = 1348497060;

    /**
     * The reference instance of <code>hrdb.hr_nps_recommend</code>
     */
    public static final HrNpsRecommend HR_NPS_RECOMMEND = new HrNpsRecommend();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrNpsRecommendRecord> getRecordType() {
        return HrNpsRecommendRecord.class;
    }

    /**
     * The column <code>hrdb.hr_nps_recommend.id</code>.
     */
    public final TableField<HrNpsRecommendRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>hrdb.hr_nps_recommend.hr_nps_id</code>. hr_nps调研id
     */
    public final TableField<HrNpsRecommendRecord, Integer> HR_NPS_ID = createField("hr_nps_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "hr_nps调研id");

    /**
     * The column <code>hrdb.hr_nps_recommend.username</code>. 推荐的用户
     */
    public final TableField<HrNpsRecommendRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false), this, "推荐的用户");

    /**
     * The column <code>hrdb.hr_nps_recommend.mobile</code>.  推荐的用户的手机号
     */
    public final TableField<HrNpsRecommendRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR.length(32).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, " 推荐的用户的手机号");

    /**
     * The column <code>hrdb.hr_nps_recommend.company</code>. 推荐的用户所属公司
     */
    public final TableField<HrNpsRecommendRecord, String> COMPANY = createField("company", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "推荐的用户所属公司");

    /**
     * The column <code>hrdb.hr_nps_recommend.create_time</code>. 推荐的时间
     */
    public final TableField<HrNpsRecommendRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "推荐的时间");

    /**
     * Create a <code>hrdb.hr_nps_recommend</code> table reference
     */
    public HrNpsRecommend() {
        this("hr_nps_recommend", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_nps_recommend</code> table reference
     */
    public HrNpsRecommend(String alias) {
        this(alias, HR_NPS_RECOMMEND);
    }

    private HrNpsRecommend(String alias, Table<HrNpsRecommendRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrNpsRecommend(String alias, Table<HrNpsRecommendRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "hr推荐同行表");
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
    public Identity<HrNpsRecommendRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_NPS_RECOMMEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrNpsRecommendRecord> getPrimaryKey() {
        return Keys.KEY_HR_NPS_RECOMMEND_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrNpsRecommendRecord>> getKeys() {
        return Arrays.<UniqueKey<HrNpsRecommendRecord>>asList(Keys.KEY_HR_NPS_RECOMMEND_PRIMARY, Keys.KEY_HR_NPS_RECOMMEND_HR_NPS_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrNpsRecommend as(String alias) {
        return new HrNpsRecommend(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrNpsRecommend rename(String name) {
        return new HrNpsRecommend(name, null);
    }
}
