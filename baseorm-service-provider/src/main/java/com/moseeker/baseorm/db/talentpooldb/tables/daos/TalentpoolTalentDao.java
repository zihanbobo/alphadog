/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables.daos;


import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolTalent;
import com.moseeker.baseorm.db.talentpooldb.tables.records.TalentpoolTalentRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * 人才库人才表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolTalentDao extends DAOImpl<TalentpoolTalentRecord, com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent, Record2<Integer, Integer>> {

    /**
     * Create a new TalentpoolTalentDao without any configuration
     */
    public TalentpoolTalentDao() {
        super(TalentpoolTalent.TALENTPOOL_TALENT, com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent.class);
    }

    /**
     * Create a new TalentpoolTalentDao with an attached configuration
     */
    public TalentpoolTalentDao(Configuration configuration) {
        super(TalentpoolTalent.TALENTPOOL_TALENT, com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent object) {
        return compositeKeyRecord(object.getUserId(), object.getCompanyId());
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent> fetchByUserId(Integer... values) {
        return fetch(TalentpoolTalent.TALENTPOOL_TALENT.USER_ID, values);
    }

    /**
     * Fetch records that have <code>company_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent> fetchByCompanyId(Integer... values) {
        return fetch(TalentpoolTalent.TALENTPOOL_TALENT.COMPANY_ID, values);
    }

    /**
     * Fetch records that have <code>collect_num IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent> fetchByCollectNum(Integer... values) {
        return fetch(TalentpoolTalent.TALENTPOOL_TALENT.COLLECT_NUM, values);
    }

    /**
     * Fetch records that have <code>public_num IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent> fetchByPublicNum(Integer... values) {
        return fetch(TalentpoolTalent.TALENTPOOL_TALENT.PUBLIC_NUM, values);
    }

    /**
     * Fetch records that have <code>upload IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent> fetchByUpload(Byte... values) {
        return fetch(TalentpoolTalent.TALENTPOOL_TALENT.UPLOAD, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent> fetchByCreateTime(Timestamp... values) {
        return fetch(TalentpoolTalent.TALENTPOOL_TALENT.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolTalent> fetchByUpdateTime(Timestamp... values) {
        return fetch(TalentpoolTalent.TALENTPOOL_TALENT.UPDATE_TIME, values);
    }
}
