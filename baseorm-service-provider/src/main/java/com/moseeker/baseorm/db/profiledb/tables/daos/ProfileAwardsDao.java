/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.profiledb.tables.daos;


import com.moseeker.baseorm.db.profiledb.tables.ProfileAwards;
import com.moseeker.baseorm.db.profiledb.tables.records.ProfileAwardsRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * Profile的获得奖项表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfileAwardsDao extends DAOImpl<ProfileAwardsRecord, com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards, Integer> {

    /**
     * Create a new ProfileAwardsDao without any configuration
     */
    public ProfileAwardsDao() {
        super(ProfileAwards.PROFILE_AWARDS, com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards.class);
    }

    /**
     * Create a new ProfileAwardsDao with an attached configuration
     */
    public ProfileAwardsDao(Configuration configuration) {
        super(ProfileAwards.PROFILE_AWARDS, com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards> fetchById(Integer... values) {
        return fetch(ProfileAwards.PROFILE_AWARDS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards fetchOneById(Integer value) {
        return fetchOne(ProfileAwards.PROFILE_AWARDS.ID, value);
    }

    /**
     * Fetch records that have <code>profile_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards> fetchByProfileId(Integer... values) {
        return fetch(ProfileAwards.PROFILE_AWARDS.PROFILE_ID, values);
    }

    /**
     * Fetch records that have <code>reward_date IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards> fetchByRewardDate(Date... values) {
        return fetch(ProfileAwards.PROFILE_AWARDS.REWARD_DATE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards> fetchByName(String... values) {
        return fetch(ProfileAwards.PROFILE_AWARDS.NAME, values);
    }

    /**
     * Fetch records that have <code>award_winning_status IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards> fetchByAwardWinningStatus(String... values) {
        return fetch(ProfileAwards.PROFILE_AWARDS.AWARD_WINNING_STATUS, values);
    }

    /**
     * Fetch records that have <code>level IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards> fetchByLevel(String... values) {
        return fetch(ProfileAwards.PROFILE_AWARDS.LEVEL, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards> fetchByDescription(String... values) {
        return fetch(ProfileAwards.PROFILE_AWARDS.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards> fetchByCreateTime(Timestamp... values) {
        return fetch(ProfileAwards.PROFILE_AWARDS.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.profiledb.tables.pojos.ProfileAwards> fetchByUpdateTime(Timestamp... values) {
        return fetch(ProfileAwards.PROFILE_AWARDS.UPDATE_TIME, values);
    }
}
