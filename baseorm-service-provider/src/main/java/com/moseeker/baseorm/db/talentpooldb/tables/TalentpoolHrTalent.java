/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables;


import com.moseeker.baseorm.db.talentpooldb.Keys;
import com.moseeker.baseorm.db.talentpooldb.Talentpooldb;
import com.moseeker.baseorm.db.talentpooldb.tables.records.TalentpoolHrTalentRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 人才库人收藏记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolHrTalent extends TableImpl<TalentpoolHrTalentRecord> {

    private static final long serialVersionUID = 1534723532;

    /**
     * The reference instance of <code>talentpooldb.talentpool_hr_talent</code>
     */
    public static final TalentpoolHrTalent TALENTPOOL_HR_TALENT = new TalentpoolHrTalent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TalentpoolHrTalentRecord> getRecordType() {
        return TalentpoolHrTalentRecord.class;
    }

    /**
     * The column <code>talentpooldb.talentpool_hr_talent.hr_id</code>. HR 编号
     */
    public final TableField<TalentpoolHrTalentRecord, Integer> HR_ID = createField("hr_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "HR 编号");

    /**
     * The column <code>talentpooldb.talentpool_hr_talent.user_id</code>. user_user.id,简历
     */
    public final TableField<TalentpoolHrTalentRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "user_user.id,简历");

    /**
     * The column <code>talentpooldb.talentpool_hr_talent.public</code>. 1 公开，0 不公开
     */
    public final TableField<TalentpoolHrTalentRecord, Byte> PUBLIC = createField("public", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1 公开，0 不公开");

    /**
     * The column <code>talentpooldb.talentpool_hr_talent.create_time</code>. 创建时间
     */
    public final TableField<TalentpoolHrTalentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>talentpooldb.talentpool_hr_talent.update_time</code>.
     */
    public final TableField<TalentpoolHrTalentRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>talentpooldb.talentpool_hr_talent</code> table reference
     */
    public TalentpoolHrTalent() {
        this("talentpool_hr_talent", null);
    }

    /**
     * Create an aliased <code>talentpooldb.talentpool_hr_talent</code> table reference
     */
    public TalentpoolHrTalent(String alias) {
        this(alias, TALENTPOOL_HR_TALENT);
    }

    private TalentpoolHrTalent(String alias, Table<TalentpoolHrTalentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TalentpoolHrTalent(String alias, Table<TalentpoolHrTalentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "人才库人收藏记录");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Talentpooldb.TALENTPOOLDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TalentpoolHrTalentRecord> getPrimaryKey() {
        return Keys.KEY_TALENTPOOL_HR_TALENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TalentpoolHrTalentRecord>> getKeys() {
        return Arrays.<UniqueKey<TalentpoolHrTalentRecord>>asList(Keys.KEY_TALENTPOOL_HR_TALENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TalentpoolHrTalent as(String alias) {
        return new TalentpoolHrTalent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TalentpoolHrTalent rename(String name) {
        return new TalentpoolHrTalent(name, null);
    }
}
