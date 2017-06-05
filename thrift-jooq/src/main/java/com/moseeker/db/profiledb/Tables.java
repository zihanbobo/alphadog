/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.profiledb;


import com.moseeker.db.profiledb.tables.ProfileAttachment;
import com.moseeker.db.profiledb.tables.ProfileAwards;
import com.moseeker.db.profiledb.tables.ProfileBasic;
import com.moseeker.db.profiledb.tables.ProfileCompleteness;
import com.moseeker.db.profiledb.tables.ProfileCredentials;
import com.moseeker.db.profiledb.tables.ProfileEducation;
import com.moseeker.db.profiledb.tables.ProfileImport;
import com.moseeker.db.profiledb.tables.ProfileImportBk;
import com.moseeker.db.profiledb.tables.ProfileIntention;
import com.moseeker.db.profiledb.tables.ProfileIntentionCity;
import com.moseeker.db.profiledb.tables.ProfileIntentionIndustry;
import com.moseeker.db.profiledb.tables.ProfileIntentionPosition;
import com.moseeker.db.profiledb.tables.ProfileLanguage;
import com.moseeker.db.profiledb.tables.ProfileOther;
import com.moseeker.db.profiledb.tables.ProfileProfile;
import com.moseeker.db.profiledb.tables.ProfileProfileBk;
import com.moseeker.db.profiledb.tables.ProfileProjectexp;
import com.moseeker.db.profiledb.tables.ProfileSkill;
import com.moseeker.db.profiledb.tables.ProfileWorkexp;
import com.moseeker.db.profiledb.tables.ProfileWorks;
import com.moseeker.db.profiledb.tables.SchemaMigrations;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in profiledb
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * Profile的简历附件
	 */
	public static final ProfileAttachment PROFILE_ATTACHMENT = com.moseeker.db.profiledb.tables.ProfileAttachment.PROFILE_ATTACHMENT;

	/**
	 * Profile的获得奖项表
	 */
	public static final ProfileAwards PROFILE_AWARDS = com.moseeker.db.profiledb.tables.ProfileAwards.PROFILE_AWARDS;

	/**
	 * 用户profile基础个人信息表
	 */
	public static final ProfileBasic PROFILE_BASIC = com.moseeker.db.profiledb.tables.ProfileBasic.PROFILE_BASIC;

	/**
	 * profile各个部分完成度表
	 */
	public static final ProfileCompleteness PROFILE_COMPLETENESS = com.moseeker.db.profiledb.tables.ProfileCompleteness.PROFILE_COMPLETENESS;

	/**
	 * Profile的证书表
	 */
	public static final ProfileCredentials PROFILE_CREDENTIALS = com.moseeker.db.profiledb.tables.ProfileCredentials.PROFILE_CREDENTIALS;

	/**
	 * Profile的教育经历
	 */
	public static final ProfileEducation PROFILE_EDUCATION = com.moseeker.db.profiledb.tables.ProfileEducation.PROFILE_EDUCATION;

	/**
	 * 用户profile导入记录信息
	 */
	public static final ProfileImport PROFILE_IMPORT = com.moseeker.db.profiledb.tables.ProfileImport.PROFILE_IMPORT;

	/**
	 * 用户profile导入记录信息
	 */
	public static final ProfileImportBk PROFILE_IMPORT_BK = com.moseeker.db.profiledb.tables.ProfileImportBk.PROFILE_IMPORT_BK;

	/**
	 * Profile的求职意向
	 */
	public static final ProfileIntention PROFILE_INTENTION = com.moseeker.db.profiledb.tables.ProfileIntention.PROFILE_INTENTION;

	/**
	 * Profile的求职意向-期望城市关系表
	 */
	public static final ProfileIntentionCity PROFILE_INTENTION_CITY = com.moseeker.db.profiledb.tables.ProfileIntentionCity.PROFILE_INTENTION_CITY;

	/**
	 * Profile的求职意向-行业关系表
	 */
	public static final ProfileIntentionIndustry PROFILE_INTENTION_INDUSTRY = com.moseeker.db.profiledb.tables.ProfileIntentionIndustry.PROFILE_INTENTION_INDUSTRY;

	/**
	 * Profile的求职意向-职能关系表
	 */
	public static final ProfileIntentionPosition PROFILE_INTENTION_POSITION = com.moseeker.db.profiledb.tables.ProfileIntentionPosition.PROFILE_INTENTION_POSITION;

	/**
	 * Profile的语言
	 */
	public static final ProfileLanguage PROFILE_LANGUAGE = com.moseeker.db.profiledb.tables.ProfileLanguage.PROFILE_LANGUAGE;

	/**
	 * 用户profile导入记录信息
	 */
	public static final ProfileOther PROFILE_OTHER = com.moseeker.db.profiledb.tables.ProfileOther.PROFILE_OTHER;

	/**
	 * 用户profile表
	 */
	public static final ProfileProfile PROFILE_PROFILE = com.moseeker.db.profiledb.tables.ProfileProfile.PROFILE_PROFILE;

	/**
	 * 用户profile表
	 */
	public static final ProfileProfileBk PROFILE_PROFILE_BK = com.moseeker.db.profiledb.tables.ProfileProfileBk.PROFILE_PROFILE_BK;

	/**
	 * Profile的项目经验
	 */
	public static final ProfileProjectexp PROFILE_PROJECTEXP = com.moseeker.db.profiledb.tables.ProfileProjectexp.PROFILE_PROJECTEXP;

	/**
	 * Profile的技能
	 */
	public static final ProfileSkill PROFILE_SKILL = com.moseeker.db.profiledb.tables.ProfileSkill.PROFILE_SKILL;

	/**
	 * Profile的工作经历
	 */
	public static final ProfileWorkexp PROFILE_WORKEXP = com.moseeker.db.profiledb.tables.ProfileWorkexp.PROFILE_WORKEXP;

	/**
	 * Profile的个人作品
	 */
	public static final ProfileWorks PROFILE_WORKS = com.moseeker.db.profiledb.tables.ProfileWorks.PROFILE_WORKS;

	/**
	 * The table profiledb.schema_migrations
	 */
	public static final SchemaMigrations SCHEMA_MIGRATIONS = com.moseeker.db.profiledb.tables.SchemaMigrations.SCHEMA_MIGRATIONS;
}
