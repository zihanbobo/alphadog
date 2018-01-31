/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb.tables.daos;


import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolHrTalent;
import com.moseeker.baseorm.db.talentpooldb.tables.records.TalentpoolHrTalentRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * 人才库人收藏记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TalentpoolHrTalentDao extends DAOImpl<TalentpoolHrTalentRecord, com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolHrTalent, Record2<Integer, Integer>> {

    /**
     * Create a new TalentpoolHrTalentDao without any configuration
     */
    public TalentpoolHrTalentDao() {
        super(TalentpoolHrTalent.TALENTPOOL_HR_TALENT, com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolHrTalent.class);
    }

    /**
     * Create a new TalentpoolHrTalentDao with an attached configuration
     */
    public TalentpoolHrTalentDao(Configuration configuration) {
        super(TalentpoolHrTalent.TALENTPOOL_HR_TALENT, com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolHrTalent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolHrTalent object) {
        return compositeKeyRecord(object.getHrId(), object.getUserId());
    }

    /**
     * Fetch records that have <code>hr_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolHrTalent> fetchByHrId(Integer... values) {
        return fetch(TalentpoolHrTalent.TALENTPOOL_HR_TALENT.HR_ID, values);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolHrTalent> fetchByUserId(Integer... values) {
        return fetch(TalentpoolHrTalent.TALENTPOOL_HR_TALENT.USER_ID, values);
    }

    /**
     * Fetch records that have <code>public IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolHrTalent> fetchByPublic(Byte... values) {
        return fetch(TalentpoolHrTalent.TALENTPOOL_HR_TALENT.PUBLIC, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolHrTalent> fetchByCreateTime(Timestamp... values) {
        return fetch(TalentpoolHrTalent.TALENTPOOL_HR_TALENT.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.talentpooldb.tables.pojos.TalentpoolHrTalent> fetchByUpdateTime(Timestamp... values) {
        return fetch(TalentpoolHrTalent.TALENTPOOL_HR_TALENT.UPDATE_TIME, values);
    }
}