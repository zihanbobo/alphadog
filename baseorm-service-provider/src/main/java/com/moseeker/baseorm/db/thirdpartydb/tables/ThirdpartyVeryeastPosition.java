/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.thirdpartydb.tables;


import com.moseeker.baseorm.db.thirdpartydb.Keys;
import com.moseeker.baseorm.db.thirdpartydb.Thirdpartydb;
import com.moseeker.baseorm.db.thirdpartydb.tables.records.ThirdpartyVeryeastPositionRecord;

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
 * 最佳东方的第三方职位子表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ThirdpartyVeryeastPosition extends TableImpl<ThirdpartyVeryeastPositionRecord> {

    private static final long serialVersionUID = -1482271286;

    /**
     * The reference instance of <code>thirdpartydb.thirdparty_veryeast_position</code>
     */
    public static final ThirdpartyVeryeastPosition THIRDPARTY_VERYEAST_POSITION = new ThirdpartyVeryeastPosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThirdpartyVeryeastPositionRecord> getRecordType() {
        return ThirdpartyVeryeastPositionRecord.class;
    }

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.id</code>. 主键
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "主键");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.pid</code>. 关联职位
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "关联职位");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.accommodation</code>. 提供食宿,1:提供,2:不提供,3:可提供吃,4:可提供住,5:面议
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> ACCOMMODATION = createField("accommodation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "提供食宿,1:提供,2:不提供,3:可提供吃,4:可提供住,5:面议");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.age_top</code>. 年龄上限
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> AGE_TOP = createField("age_top", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "年龄上限");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.age_bottom</code>. 年龄下限
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> AGE_BOTTOM = createField("age_bottom", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "年龄下限");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.language_type1</code>. 语言能力类型1,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> LANGUAGE_TYPE1 = createField("language_type1", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "语言能力类型1,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.language_level1</code>. 语言能力等级1,1:较差,2:一般,3:良好,4:流利,5:精通
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> LANGUAGE_LEVEL1 = createField("language_level1", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "语言能力等级1,1:较差,2:一般,3:良好,4:流利,5:精通");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.language_type2</code>. 语言能力类型2,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> LANGUAGE_TYPE2 = createField("language_type2", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "语言能力类型2,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.language_level2</code>. 语言能力等级2,1:较差,2:一般,3:良好,4:流利,5:精通
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> LANGUAGE_LEVEL2 = createField("language_level2", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "语言能力等级2,1:较差,2:一般,3:良好,4:流利,5:精通");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.language_type3</code>. 语言能力类型3,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> LANGUAGE_TYPE3 = createField("language_type3", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "语言能力类型3,1:英语,2:日语,3:法语,4:德语,5:俄语,6:西班牙语,7:韩语,8:阿拉伯语,9:葡萄牙语,10:意大利语,11:中国普通话,12:粤语,13:上海话,14:闽南话,15:其它,16:北方方言,17:吴方言,18:湘方言,19:赣方言,20:客家方言");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.language_level3</code>. 语言能力等级3,1:较差,2:一般,3:良好,4:流利,5:精通
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> LANGUAGE_LEVEL3 = createField("language_level3", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "语言能力等级3,1:较差,2:一般,3:良好,4:流利,5:精通");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.computer_level</code>. 计算机能力
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> COMPUTER_LEVEL = createField("computer_level", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "计算机能力");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.indate</code>. 有效期,7:7天,15:15天,30:30天,60:60天,90:90天
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Integer> INDATE = createField("indate", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "有效期,7:7天,15:15天,30:30天,60:60天,90:90天");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.create_time</code>. 创建时间
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.update_time</code>. 更新时间
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * The column <code>thirdpartydb.thirdparty_veryeast_position.status</code>. 只能状态 0 是有效 1是无效
     */
    public final TableField<ThirdpartyVeryeastPositionRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "只能状态 0 是有效 1是无效");

    /**
     * Create a <code>thirdpartydb.thirdparty_veryeast_position</code> table reference
     */
    public ThirdpartyVeryeastPosition() {
        this("thirdparty_veryeast_position", null);
    }

    /**
     * Create an aliased <code>thirdpartydb.thirdparty_veryeast_position</code> table reference
     */
    public ThirdpartyVeryeastPosition(String alias) {
        this(alias, THIRDPARTY_VERYEAST_POSITION);
    }

    private ThirdpartyVeryeastPosition(String alias, Table<ThirdpartyVeryeastPositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ThirdpartyVeryeastPosition(String alias, Table<ThirdpartyVeryeastPositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "最佳东方的第三方职位子表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Thirdpartydb.THIRDPARTYDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ThirdpartyVeryeastPositionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_THIRDPARTY_VERYEAST_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ThirdpartyVeryeastPositionRecord> getPrimaryKey() {
        return Keys.KEY_THIRDPARTY_VERYEAST_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ThirdpartyVeryeastPositionRecord>> getKeys() {
        return Arrays.<UniqueKey<ThirdpartyVeryeastPositionRecord>>asList(Keys.KEY_THIRDPARTY_VERYEAST_POSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ThirdpartyVeryeastPosition as(String alias) {
        return new ThirdpartyVeryeastPosition(alias, this);
    }

    /**
     * Rename this table
     */
    public ThirdpartyVeryeastPosition rename(String name) {
        return new ThirdpartyVeryeastPosition(name, null);
    }
}
