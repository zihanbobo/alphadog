/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.profiledb;


import com.moseeker.baseorm.db.profiledb.tables.ProfileAttachment;
import com.moseeker.baseorm.db.profiledb.tables.ProfileAwards;
import com.moseeker.baseorm.db.profiledb.tables.ProfileBasic;
import com.moseeker.baseorm.db.profiledb.tables.ProfileCompleteness;
import com.moseeker.baseorm.db.profiledb.tables.ProfileCredentials;
import com.moseeker.baseorm.db.profiledb.tables.ProfileEducation;
import com.moseeker.baseorm.db.profiledb.tables.ProfileImport;
import com.moseeker.baseorm.db.profiledb.tables.ProfileIntention;
import com.moseeker.baseorm.db.profiledb.tables.ProfileIntentionCity;
import com.moseeker.baseorm.db.profiledb.tables.ProfileIntentionIndustry;
import com.moseeker.baseorm.db.profiledb.tables.ProfileIntentionPosition;
import com.moseeker.baseorm.db.profiledb.tables.ProfileLanguage;
import com.moseeker.baseorm.db.profiledb.tables.ProfileOther;
import com.moseeker.baseorm.db.profiledb.tables.ProfileProfile;
import com.moseeker.baseorm.db.profiledb.tables.ProfileProjectexp;
import com.moseeker.baseorm.db.profiledb.tables.ProfileSkill;
import com.moseeker.baseorm.db.profiledb.tables.ProfileWorkexp;
import com.moseeker.baseorm.db.profiledb.tables.ProfileWorks;

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
public class Profiledb extends SchemaImpl {

    private static final long serialVersionUID = -1975342051;

    /**
     * The reference instance of <code>profiledb</code>
     */
    public static final Profiledb PROFILEDB = new Profiledb();

    /**
     * Profile的简历附件
     */
    public final ProfileAttachment PROFILE_ATTACHMENT = com.moseeker.baseorm.db.profiledb.tables.ProfileAttachment.PROFILE_ATTACHMENT;

    /**
     * Profile的获得奖项表
     */
    public final ProfileAwards PROFILE_AWARDS = com.moseeker.baseorm.db.profiledb.tables.ProfileAwards.PROFILE_AWARDS;

    /**
     * 用户profile基础个人信息表
     */
    public final ProfileBasic PROFILE_BASIC = com.moseeker.baseorm.db.profiledb.tables.ProfileBasic.PROFILE_BASIC;

    /**
     * profile各个部分完成度表
     */
    public final ProfileCompleteness PROFILE_COMPLETENESS = com.moseeker.baseorm.db.profiledb.tables.ProfileCompleteness.PROFILE_COMPLETENESS;

    /**
     * Profile的证书表
     */
    public final ProfileCredentials PROFILE_CREDENTIALS = com.moseeker.baseorm.db.profiledb.tables.ProfileCredentials.PROFILE_CREDENTIALS;

    /**
     * Profile的教育经历
     */
    public final ProfileEducation PROFILE_EDUCATION = com.moseeker.baseorm.db.profiledb.tables.ProfileEducation.PROFILE_EDUCATION;

    /**
     * 用户profile导入记录信息
     */
    public final ProfileImport PROFILE_IMPORT = com.moseeker.baseorm.db.profiledb.tables.ProfileImport.PROFILE_IMPORT;

    /**
     * Profile的求职意向
     */
    public final ProfileIntention PROFILE_INTENTION = com.moseeker.baseorm.db.profiledb.tables.ProfileIntention.PROFILE_INTENTION;

    /**
     * Profile的求职意向-期望城市关系表
     */
    public final ProfileIntentionCity PROFILE_INTENTION_CITY = com.moseeker.baseorm.db.profiledb.tables.ProfileIntentionCity.PROFILE_INTENTION_CITY;

    /**
     * Profile的求职意向-行业关系表
     */
    public final ProfileIntentionIndustry PROFILE_INTENTION_INDUSTRY = com.moseeker.baseorm.db.profiledb.tables.ProfileIntentionIndustry.PROFILE_INTENTION_INDUSTRY;

    /**
     * Profile的求职意向-职能关系表
     */
    public final ProfileIntentionPosition PROFILE_INTENTION_POSITION = com.moseeker.baseorm.db.profiledb.tables.ProfileIntentionPosition.PROFILE_INTENTION_POSITION;

    /**
     * Profile的语言
     */
    public final ProfileLanguage PROFILE_LANGUAGE = com.moseeker.baseorm.db.profiledb.tables.ProfileLanguage.PROFILE_LANGUAGE;

    /**
     * 用户profile导入记录信息
     */
    public final ProfileOther PROFILE_OTHER = com.moseeker.baseorm.db.profiledb.tables.ProfileOther.PROFILE_OTHER;

    /**
     * 用户profile表
     */
    public final ProfileProfile PROFILE_PROFILE = com.moseeker.baseorm.db.profiledb.tables.ProfileProfile.PROFILE_PROFILE;

    /**
     * Profile的项目经验
     */
    public final ProfileProjectexp PROFILE_PROJECTEXP = com.moseeker.baseorm.db.profiledb.tables.ProfileProjectexp.PROFILE_PROJECTEXP;

    /**
     * Profile的技能
     */
    public final ProfileSkill PROFILE_SKILL = com.moseeker.baseorm.db.profiledb.tables.ProfileSkill.PROFILE_SKILL;

    /**
     * Profile的工作经历
     */
    public final ProfileWorkexp PROFILE_WORKEXP = com.moseeker.baseorm.db.profiledb.tables.ProfileWorkexp.PROFILE_WORKEXP;

    /**
     * Profile的个人作品
     */
    public final ProfileWorks PROFILE_WORKS = com.moseeker.baseorm.db.profiledb.tables.ProfileWorks.PROFILE_WORKS;

    /**
     * No further instances allowed
     */
    private Profiledb() {
        super("profiledb", null);
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
            ProfileAttachment.PROFILE_ATTACHMENT,
            ProfileAwards.PROFILE_AWARDS,
            ProfileBasic.PROFILE_BASIC,
            ProfileCompleteness.PROFILE_COMPLETENESS,
            ProfileCredentials.PROFILE_CREDENTIALS,
            ProfileEducation.PROFILE_EDUCATION,
            ProfileImport.PROFILE_IMPORT,
            ProfileIntention.PROFILE_INTENTION,
            ProfileIntentionCity.PROFILE_INTENTION_CITY,
            ProfileIntentionIndustry.PROFILE_INTENTION_INDUSTRY,
            ProfileIntentionPosition.PROFILE_INTENTION_POSITION,
            ProfileLanguage.PROFILE_LANGUAGE,
            ProfileOther.PROFILE_OTHER,
            ProfileProfile.PROFILE_PROFILE,
            ProfileProjectexp.PROFILE_PROJECTEXP,
            ProfileSkill.PROFILE_SKILL,
            ProfileWorkexp.PROFILE_WORKEXP,
            ProfileWorks.PROFILE_WORKS);
    }
}
