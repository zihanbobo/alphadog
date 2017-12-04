/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb;


import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolComment;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolHrTalent;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolTag;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolTalent;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolUserTag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Talentpooldb extends SchemaImpl {

    private static final long serialVersionUID = -468748554;

    /**
     * The reference instance of <code>talentpooldb</code>
     */
    public static final Talentpooldb TALENTPOOLDB = new Talentpooldb();

    /**
     * 人才库人HR与标签的关系
     */
    public final TalentpoolComment TALENTPOOL_COMMENT = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolComment.TALENTPOOL_COMMENT;

    /**
     * 人才库人收藏记录
     */
    public final TalentpoolHrTalent TALENTPOOL_HR_TALENT = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolHrTalent.TALENTPOOL_HR_TALENT;

    /**
     * 人才库标签表
     */
    public final TalentpoolTag TALENTPOOL_TAG = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolTag.TALENTPOOL_TAG;

    /**
     * 人才库人才表
     */
    public final TalentpoolTalent TALENTPOOL_TALENT = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolTalent.TALENTPOOL_TALENT;

    /**
     * 人才库人人才与标签的关系
     */
    public final TalentpoolUserTag TALENTPOOL_USER_TAG = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolUserTag.TALENTPOOL_USER_TAG;

    /**
     * No further instances allowed
     */
    private Talentpooldb() {
        super("talentpooldb", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            TalentpoolComment.TALENTPOOL_COMMENT,
            TalentpoolHrTalent.TALENTPOOL_HR_TALENT,
            TalentpoolTag.TALENTPOOL_TAG,
            TalentpoolTalent.TALENTPOOL_TALENT,
            TalentpoolUserTag.TALENTPOOL_USER_TAG);
    }
}
