/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.malldb;


import com.moseeker.baseorm.db.malldb.tables.MallGoodsInfo;
import com.moseeker.baseorm.db.malldb.tables.MallOrder;
import com.moseeker.baseorm.db.malldb.tables.MallOrderOperation;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in malldb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 商品信息表
     */
    public static final MallGoodsInfo MALL_GOODS_INFO = MallGoodsInfo.MALL_GOODS_INFO;

    /**
     * 商品申请记录
     */
    public static final MallOrder MALL_ORDER = MallOrder.MALL_ORDER;

    /**
     * 商品发放hr操作记录
     */
    public static final MallOrderOperation MALL_ORDER_OPERATION = MallOrderOperation.MALL_ORDER_OPERATION;
}
