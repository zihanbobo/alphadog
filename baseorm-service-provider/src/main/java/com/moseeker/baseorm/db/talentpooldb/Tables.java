/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.talentpooldb;


import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolApplication;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolComment;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolCompanyTag;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolCompanyTagUser;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolEmail;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolExecute;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolHrTalent;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolPast;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolProfileFilter;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolProfileFilterExecute;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolProfileMove;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolProfileMoveDetail;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolTag;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolTalent;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolUpload;
import com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolUserTag;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in talentpooldb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * hr申请人才库记录表
     */
    public static final TalentpoolApplication TALENTPOOL_APPLICATION = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolApplication.TALENTPOOL_APPLICATION;

    /**
     * 人才库人HR与备注的关系
     */
    public static final TalentpoolComment TALENTPOOL_COMMENT = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolComment.TALENTPOOL_COMMENT;

    /**
     * 企业标签表
     */
    public static final TalentpoolCompanyTag TALENTPOOL_COMPANY_TAG = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolCompanyTag.TALENTPOOL_COMPANY_TAG;

    /**
     * 企业标签和人才关系表
     */
    public static final TalentpoolCompanyTagUser TALENTPOOL_COMPANY_TAG_USER = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolCompanyTagUser.TALENTPOOL_COMPANY_TAG_USER;

    /**
     * 人才库邮件模板表
     */
    public static final TalentpoolEmail TALENTPOOL_EMAIL = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolEmail.TALENTPOOL_EMAIL;

    /**
     * 具体执行规则配置表
     */
    public static final TalentpoolExecute TALENTPOOL_EXECUTE = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolExecute.TALENTPOOL_EXECUTE;

    /**
     * 人才库人收藏记录
     */
    public static final TalentpoolHrTalent TALENTPOOL_HR_TALENT = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolHrTalent.TALENTPOOL_HR_TALENT;

    /**
     * 人才库使用的曾任职务和曾任公司
     */
    public static final TalentpoolPast TALENTPOOL_PAST = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolPast.TALENTPOOL_PAST;

    /**
     * 简历筛选表
     */
    public static final TalentpoolProfileFilter TALENTPOOL_PROFILE_FILTER = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolProfileFilter.TALENTPOOL_PROFILE_FILTER;

    /**
     * 简历筛选项执行表
     */
    public static final TalentpoolProfileFilterExecute TALENTPOOL_PROFILE_FILTER_EXECUTE = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolProfileFilterExecute.TALENTPOOL_PROFILE_FILTER_EXECUTE;

    /**
     * 简历搬家操作记录表
     */
    public static final TalentpoolProfileMove TALENTPOOL_PROFILE_MOVE = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolProfileMove.TALENTPOOL_PROFILE_MOVE;

    /**
     * 凡是记录在该表的手机号对应的简历都是已成功入库的简历搬家简历，
但是如果简历搬家失败时根据status字段标记出哪些简历是搬家失败的，下次搬家时不会因为重新合并一次导致数据不准确
     */
    public static final TalentpoolProfileMoveDetail TALENTPOOL_PROFILE_MOVE_DETAIL = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolProfileMoveDetail.TALENTPOOL_PROFILE_MOVE_DETAIL;

    /**
     * 人才库标签表
     */
    public static final TalentpoolTag TALENTPOOL_TAG = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolTag.TALENTPOOL_TAG;

    /**
     * 人才库人才表
     */
    public static final TalentpoolTalent TALENTPOOL_TALENT = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolTalent.TALENTPOOL_TALENT;

    /**
     * 人才库简历上传记录表
     */
    public static final TalentpoolUpload TALENTPOOL_UPLOAD = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolUpload.TALENTPOOL_UPLOAD;

    /**
     * 人才标签表
     */
    public static final TalentpoolUserTag TALENTPOOL_USER_TAG = com.moseeker.baseorm.db.talentpooldb.tables.TalentpoolUserTag.TALENTPOOL_USER_TAG;
}
