/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrWxHrChatRecord;

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
import org.jooq.types.UInteger;


/**
 * IM聊天
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxHrChat extends TableImpl<HrWxHrChatRecord> {

    private static final long serialVersionUID = -686617411;

    /**
     * The reference instance of <code>hrdb.hr_wx_hr_chat</code>
     */
    public static final HrWxHrChat HR_WX_HR_CHAT = new HrWxHrChat();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrWxHrChatRecord> getRecordType() {
        return HrWxHrChatRecord.class;
    }

    /**
     * The column <code>hrdb.hr_wx_hr_chat.id</code>. ID
     */
    public final TableField<HrWxHrChatRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "ID");

    /**
     * The column <code>hrdb.hr_wx_hr_chat.chatlist_id</code>. wx_hr_chat_list.id
     */
    public final TableField<HrWxHrChatRecord, Integer> CHATLIST_ID = createField("chatlist_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "wx_hr_chat_list.id");

    /**
     * The column <code>hrdb.hr_wx_hr_chat.content</code>. 聊天内容
     */
    public final TableField<HrWxHrChatRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "聊天内容");

    /**
     * The column <code>hrdb.hr_wx_hr_chat.pid</code>. hr_position.id
     */
    public final TableField<HrWxHrChatRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "hr_position.id");

    /**
     * The column <code>hrdb.hr_wx_hr_chat.speaker</code>. 状态，0：求职者，1：HR
     */
    public final TableField<HrWxHrChatRecord, Byte> SPEAKER = createField("speaker", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "状态，0：求职者，1：HR");

    /**
     * The column <code>hrdb.hr_wx_hr_chat.status</code>. 状态，0：有效，1：无效
     */
    public final TableField<HrWxHrChatRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "状态，0：有效，1：无效");

    /**
     * The column <code>hrdb.hr_wx_hr_chat.create_time</code>. 创建时间
     */
    public final TableField<HrWxHrChatRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * Create a <code>hrdb.hr_wx_hr_chat</code> table reference
     */
    public HrWxHrChat() {
        this("hr_wx_hr_chat", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_wx_hr_chat</code> table reference
     */
    public HrWxHrChat(String alias) {
        this(alias, HR_WX_HR_CHAT);
    }

    private HrWxHrChat(String alias, Table<HrWxHrChatRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrWxHrChat(String alias, Table<HrWxHrChatRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "IM聊天");
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
    public Identity<HrWxHrChatRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_HR_WX_HR_CHAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrWxHrChatRecord> getPrimaryKey() {
        return Keys.KEY_HR_WX_HR_CHAT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrWxHrChatRecord>> getKeys() {
        return Arrays.<UniqueKey<HrWxHrChatRecord>>asList(Keys.KEY_HR_WX_HR_CHAT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrWxHrChat as(String alias) {
        return new HrWxHrChat(alias, this);
    }

    /**
     * Rename this table
     */
    public HrWxHrChat rename(String name) {
        return new HrWxHrChat(name, null);
    }
}