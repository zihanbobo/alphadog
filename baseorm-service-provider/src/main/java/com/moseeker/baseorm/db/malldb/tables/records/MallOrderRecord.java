/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.malldb.tables.records;


import com.moseeker.baseorm.db.malldb.tables.MallOrder;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 商品申请记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MallOrderRecord extends UpdatableRecordImpl<MallOrderRecord> implements Record15<Integer, String, Integer, Integer, Integer, String, Integer, String, String, Integer, Byte, Timestamp, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1806651430;

    /**
     * Setter for <code>malldb.mall_order.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>malldb.mall_order.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>malldb.mall_order.order_id</code>. 订单id 订单号生成规则「年份后两位」+「4位月日」+「5位自增」，形如18092700001
     */
    public void setOrderId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>malldb.mall_order.order_id</code>. 订单id 订单号生成规则「年份后两位」+「4位月日」+「5位自增」，形如18092700001
     */
    public String getOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>malldb.mall_order.employee_id</code>. 员工id
     */
    public void setEmployeeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>malldb.mall_order.employee_id</code>. 员工id
     */
    public Integer getEmployeeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>malldb.mall_order.goods_id</code>. 商品id
     */
    public void setGoodsId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>malldb.mall_order.goods_id</code>. 商品id
     */
    public Integer getGoodsId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>malldb.mall_order.company_id</code>.
     */
    public void setCompanyId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>malldb.mall_order.company_id</code>.
     */
    public Integer getCompanyId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>malldb.mall_order.name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>malldb.mall_order.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>malldb.mall_order.credit</code>. 下单时兑换所需积分
     */
    public void setCredit(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>malldb.mall_order.credit</code>. 下单时兑换所需积分
     */
    public Integer getCredit() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>malldb.mall_order.title</code>. 下单时商品的标题
     */
    public void setTitle(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>malldb.mall_order.title</code>. 下单时商品的标题
     */
    public String getTitle() {
        return (String) get(7);
    }

    /**
     * Setter for <code>malldb.mall_order.pic_url</code>. 下单时商品的主图url
     */
    public void setPicUrl(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>malldb.mall_order.pic_url</code>. 下单时商品的主图url
     */
    public String getPicUrl() {
        return (String) get(8);
    }

    /**
     * Setter for <code>malldb.mall_order.count</code>. 兑换商品数量
     */
    public void setCount(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>malldb.mall_order.count</code>. 兑换商品数量
     */
    public Integer getCount() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>malldb.mall_order.state</code>. 0 未发放  1 已发放  2 已拒绝 9 在订单查询时表示全部状态的订单
     */
    public void setState(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>malldb.mall_order.state</code>. 0 未发放  1 已发放  2 已拒绝 9 在订单查询时表示全部状态的订单
     */
    public Byte getState() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>malldb.mall_order.assign_time</code>. 发放时间
     */
    public void setAssignTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>malldb.mall_order.assign_time</code>. 发放时间
     */
    public Timestamp getAssignTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>malldb.mall_order.mail_id</code>. 如需邮寄 关联到 mall_mail_address.id
     */
    public void setMailId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>malldb.mall_order.mail_id</code>. 如需邮寄 关联到 mall_mail_address.id
     */
    public Integer getMailId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>malldb.mall_order.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>malldb.mall_order.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>malldb.mall_order.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>malldb.mall_order.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Integer, Integer, Integer, String, Integer, String, String, Integer, Byte, Timestamp, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, String, Integer, Integer, Integer, String, Integer, String, String, Integer, Byte, Timestamp, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MallOrder.MALL_ORDER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MallOrder.MALL_ORDER.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return MallOrder.MALL_ORDER.EMPLOYEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MallOrder.MALL_ORDER.GOODS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MallOrder.MALL_ORDER.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MallOrder.MALL_ORDER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return MallOrder.MALL_ORDER.CREDIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MallOrder.MALL_ORDER.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MallOrder.MALL_ORDER.PIC_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return MallOrder.MALL_ORDER.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return MallOrder.MALL_ORDER.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return MallOrder.MALL_ORDER.ASSIGN_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return MallOrder.MALL_ORDER.MAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return MallOrder.MALL_ORDER.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return MallOrder.MALL_ORDER.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getGoodsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCredit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPicUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getAssignTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getMailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value2(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value3(Integer value) {
        setEmployeeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value4(Integer value) {
        setGoodsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value5(Integer value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value7(Integer value) {
        setCredit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value8(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value9(String value) {
        setPicUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value10(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value11(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value12(Timestamp value) {
        setAssignTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value13(Integer value) {
        setMailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value14(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord value15(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MallOrderRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, String value6, Integer value7, String value8, String value9, Integer value10, Byte value11, Timestamp value12, Integer value13, Timestamp value14, Timestamp value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MallOrderRecord
     */
    public MallOrderRecord() {
        super(MallOrder.MALL_ORDER);
    }

    /**
     * Create a detached, initialised MallOrderRecord
     */
    public MallOrderRecord(Integer id, String orderId, Integer employeeId, Integer goodsId, Integer companyId, String name, Integer credit, String title, String picUrl, Integer count, Byte state, Timestamp assignTime, Integer mailId, Timestamp createTime, Timestamp updateTime) {
        super(MallOrder.MALL_ORDER);

        set(0, id);
        set(1, orderId);
        set(2, employeeId);
        set(3, goodsId);
        set(4, companyId);
        set(5, name);
        set(6, credit);
        set(7, title);
        set(8, picUrl);
        set(9, count);
        set(10, state);
        set(11, assignTime);
        set(12, mailId);
        set(13, createTime);
        set(14, updateTime);
    }
}
