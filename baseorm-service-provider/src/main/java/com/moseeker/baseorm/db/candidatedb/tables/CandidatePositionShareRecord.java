/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.candidatedb.tables;


import com.moseeker.baseorm.db.candidatedb.Candidatedb;
import com.moseeker.baseorm.db.candidatedb.Keys;
import com.moseeker.baseorm.db.candidatedb.tables.records.CandidatePositionShareRecordRecord;

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
 * 用户分享职位访问记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CandidatePositionShareRecord extends TableImpl<CandidatePositionShareRecordRecord> {

    private static final long serialVersionUID = 1997680452;

    /**
     * The reference instance of <code>candidatedb.candidate_position_share_record</code>
     */
    public static final CandidatePositionShareRecord CANDIDATE_POSITION_SHARE_RECORD = new CandidatePositionShareRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CandidatePositionShareRecordRecord> getRecordType() {
        return CandidatePositionShareRecordRecord.class;
    }

    /**
     * The column <code>candidatedb.candidate_position_share_record.id</code>.
     */
    public final TableField<CandidatePositionShareRecordRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>candidatedb.candidate_position_share_record.wechat_id</code>. 所属公众号
     */
    public final TableField<CandidatePositionShareRecordRecord, Long> WECHAT_ID = createField("wechat_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "所属公众号");

    /**
     * The column <code>candidatedb.candidate_position_share_record.position_id</code>. position.id 分享职位ID
     */
    public final TableField<CandidatePositionShareRecordRecord, Long> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "position.id 分享职位ID");

    /**
     * The column <code>candidatedb.candidate_position_share_record.recom_id</code>. userdb.user_wx_user.id 分享用户微信ID。现在已经废弃，请参考recom_user_id字段
     */
    public final TableField<CandidatePositionShareRecordRecord, Long> RECOM_ID = createField("recom_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "userdb.user_wx_user.id 分享用户微信ID。现在已经废弃，请参考recom_user_id字段");

    /**
     * The column <code>candidatedb.candidate_position_share_record.recom_user_id</code>. userdb.user_user.id 转发者的C端账号编号
     */
    public final TableField<CandidatePositionShareRecordRecord, Integer> RECOM_USER_ID = createField("recom_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "userdb.user_user.id 转发者的C端账号编号");

    /**
     * The column <code>candidatedb.candidate_position_share_record.viewer_id</code>. userdb.user_wx_viewer.id 浏览用户ID
     */
    public final TableField<CandidatePositionShareRecordRecord, String> VIEWER_ID = createField("viewer_id", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "userdb.user_wx_viewer.id 浏览用户ID");

    /**
     * The column <code>candidatedb.candidate_position_share_record.viewer_ip</code>. 浏览用户IP
     */
    public final TableField<CandidatePositionShareRecordRecord, Long> VIEWER_IP = createField("viewer_ip", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "浏览用户IP");

    /**
     * The column <code>candidatedb.candidate_position_share_record.presentee_id</code>. 被动求职者,浏览者的微信ID，userdb.user_wx_user.id。现在已经废弃，请参考presentee_user_id
     */
    public final TableField<CandidatePositionShareRecordRecord, Long> PRESENTEE_ID = createField("presentee_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "被动求职者,浏览者的微信ID，userdb.user_wx_user.id。现在已经废弃，请参考presentee_user_id");

    /**
     * The column <code>candidatedb.candidate_position_share_record.source</code>. 来源0：企业后台1：聚合平台
     */
    public final TableField<CandidatePositionShareRecordRecord, Byte> SOURCE = createField("source", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "来源0：企业后台1：聚合平台");

    /**
     * The column <code>candidatedb.candidate_position_share_record.create_time</code>. 创建时间
     */
    public final TableField<CandidatePositionShareRecordRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>candidatedb.candidate_position_share_record.update_time</code>. 修改时间
     */
    public final TableField<CandidatePositionShareRecordRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>candidatedb.candidate_position_share_record.click_from</code>. 来自, 0:未知, 朋友圈(timeline ) 1, 微信群(groupmessage) 2, 个人消息(singlemessage) 3
     */
    public final TableField<CandidatePositionShareRecordRecord, Byte> CLICK_FROM = createField("click_from", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "来自, 0:未知, 朋友圈(timeline ) 1, 微信群(groupmessage) 2, 个人消息(singlemessage) 3");

    /**
     * The column <code>candidatedb.candidate_position_share_record.presentee_user_id</code>. userdb.user_user.id 浏览者的C端账号编号
     */
    public final TableField<CandidatePositionShareRecordRecord, Integer> PRESENTEE_USER_ID = createField("presentee_user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "userdb.user_user.id 浏览者的C端账号编号");

    /**
     * The column <code>candidatedb.candidate_position_share_record.share_chain_id</code>.
     */
    public final TableField<CandidatePositionShareRecordRecord, Integer> SHARE_CHAIN_ID = createField("share_chain_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>candidatedb.candidate_position_share_record</code> table reference
     */
    public CandidatePositionShareRecord() {
        this("candidate_position_share_record", null);
    }

    /**
     * Create an aliased <code>candidatedb.candidate_position_share_record</code> table reference
     */
    public CandidatePositionShareRecord(String alias) {
        this(alias, CANDIDATE_POSITION_SHARE_RECORD);
    }

    private CandidatePositionShareRecord(String alias, Table<CandidatePositionShareRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private CandidatePositionShareRecord(String alias, Table<CandidatePositionShareRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户分享职位访问记录");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Candidatedb.CANDIDATEDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CandidatePositionShareRecordRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CANDIDATE_POSITION_SHARE_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CandidatePositionShareRecordRecord> getPrimaryKey() {
        return Keys.KEY_CANDIDATE_POSITION_SHARE_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CandidatePositionShareRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<CandidatePositionShareRecordRecord>>asList(Keys.KEY_CANDIDATE_POSITION_SHARE_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CandidatePositionShareRecord as(String alias) {
        return new CandidatePositionShareRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CandidatePositionShareRecord rename(String name) {
        return new CandidatePositionShareRecord(name, null);
    }
}
