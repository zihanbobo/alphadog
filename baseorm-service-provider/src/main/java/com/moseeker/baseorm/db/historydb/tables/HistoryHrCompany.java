/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.historydb.tables;


import com.moseeker.baseorm.db.historydb.Historydb;
import com.moseeker.baseorm.db.historydb.Keys;
import com.moseeker.baseorm.db.historydb.tables.records.HistoryHrCompanyRecord;

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
 * 公司表归档表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryHrCompany extends TableImpl<HistoryHrCompanyRecord> {

    private static final long serialVersionUID = -1571375164;

    /**
     * The reference instance of <code>historydb.history_hr_company</code>
     */
    public static final HistoryHrCompany HISTORY_HR_COMPANY = new HistoryHrCompany();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HistoryHrCompanyRecord> getRecordType() {
        return HistoryHrCompanyRecord.class;
    }

    /**
     * The column <code>historydb.history_hr_company.id</code>.
     */
    public final TableField<HistoryHrCompanyRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>historydb.history_hr_company.type</code>. 公司区分(其它:2,免费用户:1,企业用户:0)
     */
    public final TableField<HistoryHrCompanyRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "公司区分(其它:2,免费用户:1,企业用户:0)");

    /**
     * The column <code>historydb.history_hr_company.name</code>. 公司注册名称
     */
    public final TableField<HistoryHrCompanyRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "公司注册名称");

    /**
     * The column <code>historydb.history_hr_company.introduction</code>. 公司介绍
     */
    public final TableField<HistoryHrCompanyRecord, String> INTRODUCTION = createField("introduction", org.jooq.impl.SQLDataType.CLOB, this, "公司介绍");

    /**
     * The column <code>historydb.history_hr_company.scale</code>. 公司规模, dict_constant.parent_code=1102
     */
    public final TableField<HistoryHrCompanyRecord, Byte> SCALE = createField("scale", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "公司规模, dict_constant.parent_code=1102");

    /**
     * The column <code>historydb.history_hr_company.address</code>. 公司地址
     */
    public final TableField<HistoryHrCompanyRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "公司地址");

    /**
     * The column <code>historydb.history_hr_company.property</code>. 公司性质 0:没选择 1:国有 2:三资 3:集体 4:私有
     */
    public final TableField<HistoryHrCompanyRecord, Byte> PROPERTY = createField("property", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "公司性质 0:没选择 1:国有 2:三资 3:集体 4:私有");

    /**
     * The column <code>historydb.history_hr_company.industry</code>. 所属行业
     */
    public final TableField<HistoryHrCompanyRecord, String> INDUSTRY = createField("industry", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "所属行业");

    /**
     * The column <code>historydb.history_hr_company.homepage</code>. 公司主页
     */
    public final TableField<HistoryHrCompanyRecord, String> HOMEPAGE = createField("homepage", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "公司主页");

    /**
     * The column <code>historydb.history_hr_company.logo</code>. 公司logo的网络cdn地址
     */
    public final TableField<HistoryHrCompanyRecord, String> LOGO = createField("logo", org.jooq.impl.SQLDataType.CLOB, this, "公司logo的网络cdn地址");

    /**
     * The column <code>historydb.history_hr_company.abbreviation</code>. 公司简称
     */
    public final TableField<HistoryHrCompanyRecord, String> ABBREVIATION = createField("abbreviation", org.jooq.impl.SQLDataType.VARCHAR.length(99).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "公司简称");

    /**
     * The column <code>historydb.history_hr_company.impression</code>. json格式的企业印象
     */
    public final TableField<HistoryHrCompanyRecord, String> IMPRESSION = createField("impression", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "json格式的企业印象");

    /**
     * The column <code>historydb.history_hr_company.banner</code>. json格式的企业banner
     */
    public final TableField<HistoryHrCompanyRecord, String> BANNER = createField("banner", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "json格式的企业banner");

    /**
     * The column <code>historydb.history_hr_company.parent_id</code>. 上级公司
     */
    public final TableField<HistoryHrCompanyRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "上级公司");

    /**
     * The column <code>historydb.history_hr_company.hraccount_id</code>. 公司联系人, hr_account.id
     */
    public final TableField<HistoryHrCompanyRecord, Integer> HRACCOUNT_ID = createField("hraccount_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "公司联系人, hr_account.id");

    /**
     * The column <code>historydb.history_hr_company.disable</code>. 0:无效 1:有效, 删除子公司使用， 母公司目前没有禁用功能
     */
    public final TableField<HistoryHrCompanyRecord, Byte> DISABLE = createField("disable", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "0:无效 1:有效, 删除子公司使用， 母公司目前没有禁用功能");

    /**
     * The column <code>historydb.history_hr_company.create_time</code>. 创建时间
     */
    public final TableField<HistoryHrCompanyRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>historydb.history_hr_company.update_time</code>. 更新时间
     */
    public final TableField<HistoryHrCompanyRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>historydb.history_hr_company.source</code>. 添加来源 {"0":"hr系统", "9":"profile添加"}
     */
    public final TableField<HistoryHrCompanyRecord, Byte> SOURCE = createField("source", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "添加来源 {\"0\":\"hr系统\", \"9\":\"profile添加\"}");

    /**
     * Create a <code>historydb.history_hr_company</code> table reference
     */
    public HistoryHrCompany() {
        this("history_hr_company", null);
    }

    /**
     * Create an aliased <code>historydb.history_hr_company</code> table reference
     */
    public HistoryHrCompany(String alias) {
        this(alias, HISTORY_HR_COMPANY);
    }

    private HistoryHrCompany(String alias, Table<HistoryHrCompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private HistoryHrCompany(String alias, Table<HistoryHrCompanyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "公司表归档表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Historydb.HISTORYDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HistoryHrCompanyRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HISTORY_HR_COMPANY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HistoryHrCompanyRecord> getPrimaryKey() {
        return Keys.KEY_HISTORY_HR_COMPANY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HistoryHrCompanyRecord>> getKeys() {
        return Arrays.<UniqueKey<HistoryHrCompanyRecord>>asList(Keys.KEY_HISTORY_HR_COMPANY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HistoryHrCompany as(String alias) {
        return new HistoryHrCompany(alias, this);
    }

    /**
     * Rename this table
     */
    public HistoryHrCompany rename(String name) {
        return new HistoryHrCompany(name, null);
    }
}