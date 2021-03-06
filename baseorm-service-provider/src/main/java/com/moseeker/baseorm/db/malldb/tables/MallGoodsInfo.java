/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.malldb.tables;


import com.moseeker.baseorm.db.malldb.Keys;
import com.moseeker.baseorm.db.malldb.Malldb;
import com.moseeker.baseorm.db.malldb.tables.records.MallGoodsInfoRecord;

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
 * 商品信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MallGoodsInfo extends TableImpl<MallGoodsInfoRecord> {

    private static final long serialVersionUID = 526813996;

    /**
     * The reference instance of <code>malldb.mall_goods_info</code>
     */
    public static final MallGoodsInfo MALL_GOODS_INFO = new MallGoodsInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MallGoodsInfoRecord> getRecordType() {
        return MallGoodsInfoRecord.class;
    }

    /**
     * The column <code>malldb.mall_goods_info.id</code>.
     */
    public final TableField<MallGoodsInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>malldb.mall_goods_info.company_id</code>.
     */
    public final TableField<MallGoodsInfoRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>malldb.mall_goods_info.title</code>. 商品标题，长度不超过16
     */
    public final TableField<MallGoodsInfoRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "商品标题，长度不超过16");

    /**
     * The column <code>malldb.mall_goods_info.pic_url</code>. 商品主图url
     */
    public final TableField<MallGoodsInfoRecord, String> PIC_URL = createField("pic_url", org.jooq.impl.SQLDataType.VARCHAR.length(2000).nullable(false), this, "商品主图url");

    /**
     * The column <code>malldb.mall_goods_info.credit</code>. 商品单价/积分
     */
    public final TableField<MallGoodsInfoRecord, Integer> CREDIT = createField("credit", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品单价/积分");

    /**
     * The column <code>malldb.mall_goods_info.stock</code>. 商品库存
     */
    public final TableField<MallGoodsInfoRecord, Integer> STOCK = createField("stock", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品库存");

    /**
     * The column <code>malldb.mall_goods_info.exchange_num</code>. 已兑换数量
     */
    public final TableField<MallGoodsInfoRecord, Integer> EXCHANGE_NUM = createField("exchange_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "已兑换数量");

    /**
     * The column <code>malldb.mall_goods_info.exchange_order</code>. 已兑换次数
     */
    public final TableField<MallGoodsInfoRecord, Integer> EXCHANGE_ORDER = createField("exchange_order", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "已兑换次数");

    /**
     * The column <code>malldb.mall_goods_info.detail</code>. 商品详情
     */
    public final TableField<MallGoodsInfoRecord, String> DETAIL = createField("detail", org.jooq.impl.SQLDataType.VARCHAR.length(5000).nullable(false), this, "商品详情");

    /**
     * The column <code>malldb.mall_goods_info.state</code>. 1 未上架  2 上架中 
     */
    public final TableField<MallGoodsInfoRecord, Byte> STATE = createField("state", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "1 未上架  2 上架中 ");

    /**
     * The column <code>malldb.mall_goods_info.rule</code>. 领取规则
     */
    public final TableField<MallGoodsInfoRecord, String> RULE = createField("rule", org.jooq.impl.SQLDataType.VARCHAR.length(2000).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "领取规则");

    /**
     * The column <code>malldb.mall_goods_info.create_time</code>.
     */
    public final TableField<MallGoodsInfoRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>malldb.mall_goods_info.update_time</code>.
     */
    public final TableField<MallGoodsInfoRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>malldb.mall_goods_info</code> table reference
     */
    public MallGoodsInfo() {
        this("mall_goods_info", null);
    }

    /**
     * Create an aliased <code>malldb.mall_goods_info</code> table reference
     */
    public MallGoodsInfo(String alias) {
        this(alias, MALL_GOODS_INFO);
    }

    private MallGoodsInfo(String alias, Table<MallGoodsInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private MallGoodsInfo(String alias, Table<MallGoodsInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "商品信息表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Malldb.MALLDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MallGoodsInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MALL_GOODS_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MallGoodsInfoRecord> getPrimaryKey() {
        return Keys.KEY_MALL_GOODS_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MallGoodsInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<MallGoodsInfoRecord>>asList(Keys.KEY_MALL_GOODS_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallGoodsInfo as(String alias) {
        return new MallGoodsInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MallGoodsInfo rename(String name) {
        return new MallGoodsInfo(name, null);
    }
}
