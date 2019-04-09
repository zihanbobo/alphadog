/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.redpacketdb.tables;


import com.moseeker.baseorm.db.redpacketdb.Keys;
import com.moseeker.baseorm.db.redpacketdb.Redpacketdb;
import com.moseeker.baseorm.db.redpacketdb.tables.records.RedpacketWxStatusLogRecord;

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
 * 调用微信发放红包功能时所处的状态的变更记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RedpacketWxStatusLog extends TableImpl<RedpacketWxStatusLogRecord> {

    private static final long serialVersionUID = 520330776;

    /**
     * The reference instance of <code>redpacketdb.redpacket_wx_status_log</code>
     */
    public static final RedpacketWxStatusLog REDPACKET_WX_STATUS_LOG = new RedpacketWxStatusLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RedpacketWxStatusLogRecord> getRecordType() {
        return RedpacketWxStatusLogRecord.class;
    }

    /**
     * The column <code>redpacketdb.redpacket_wx_status_log.id</code>.
     */
    public final TableField<RedpacketWxStatusLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>redpacketdb.redpacket_wx_status_log.wx_status_id</code>. 调用微信发放红包功能时所处的状态的编号
     */
    public final TableField<RedpacketWxStatusLogRecord, Integer> WX_STATUS_ID = createField("wx_status_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "调用微信发放红包功能时所处的状态的编号");

    /**
     * The column <code>redpacketdb.redpacket_wx_status_log.status</code>. 红包在微信服务发放的状态。0 未发送， 1 发送中， 2：发送失败，3：重试失败，4：发送成功，5：红包退回，6：红包已经领取
     */
    public final TableField<RedpacketWxStatusLogRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "红包在微信服务发放的状态。0 未发送， 1 发送中， 2：发送失败，3：重试失败，4：发送成功，5：红包退回，6：红包已经领取");

    /**
     * The column <code>redpacketdb.redpacket_wx_status_log.return_code</code>. 返回状态码 SUCCESS/FAIL
     */
    public final TableField<RedpacketWxStatusLogRecord, String> RETURN_CODE = createField("return_code", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "返回状态码 SUCCESS/FAIL");

    /**
     * The column <code>redpacketdb.redpacket_wx_status_log.return_msg</code>. 返回信息 返回信息，如非空，为错误原因，比如：签名失败，参数格式校验错误
     */
    public final TableField<RedpacketWxStatusLogRecord, String> RETURN_MSG = createField("return_msg", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "返回信息 返回信息，如非空，为错误原因，比如：签名失败，参数格式校验错误");

    /**
     * The column <code>redpacketdb.redpacket_wx_status_log.err_code</code>. 错误代码
     */
    public final TableField<RedpacketWxStatusLogRecord, String> ERR_CODE = createField("err_code", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "错误代码");

    /**
     * The column <code>redpacketdb.redpacket_wx_status_log.err_code_des</code>. 错误代码描述
     */
    public final TableField<RedpacketWxStatusLogRecord, String> ERR_CODE_DES = createField("err_code_des", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "错误代码描述");

    /**
     * The column <code>redpacketdb.redpacket_wx_status_log.create_time</code>. 创建时间
     */
    public final TableField<RedpacketWxStatusLogRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>redpacketdb.redpacket_wx_status_log.update_time</code>. 更新时间
     */
    public final TableField<RedpacketWxStatusLogRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>redpacketdb.redpacket_wx_status_log</code> table reference
     */
    public RedpacketWxStatusLog() {
        this("redpacket_wx_status_log", null);
    }

    /**
     * Create an aliased <code>redpacketdb.redpacket_wx_status_log</code> table reference
     */
    public RedpacketWxStatusLog(String alias) {
        this(alias, REDPACKET_WX_STATUS_LOG);
    }

    private RedpacketWxStatusLog(String alias, Table<RedpacketWxStatusLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private RedpacketWxStatusLog(String alias, Table<RedpacketWxStatusLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "调用微信发放红包功能时所处的状态的变更记录");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Redpacketdb.REDPACKETDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RedpacketWxStatusLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REDPACKET_WX_STATUS_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RedpacketWxStatusLogRecord> getPrimaryKey() {
        return Keys.KEY_REDPACKET_WX_STATUS_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RedpacketWxStatusLogRecord>> getKeys() {
        return Arrays.<UniqueKey<RedpacketWxStatusLogRecord>>asList(Keys.KEY_REDPACKET_WX_STATUS_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedpacketWxStatusLog as(String alias) {
        return new RedpacketWxStatusLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RedpacketWxStatusLog rename(String name) {
        return new RedpacketWxStatusLog(name, null);
    }
}