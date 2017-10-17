/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.jobdb;


import com.moseeker.baseorm.db.jobdb.tables.JobApplication;
import com.moseeker.baseorm.db.jobdb.tables.JobCustom;
import com.moseeker.baseorm.db.jobdb.tables.JobOccupation;
import com.moseeker.baseorm.db.jobdb.tables.JobPcAdvertisement;
import com.moseeker.baseorm.db.jobdb.tables.JobPcRecommendPositionItem;
import com.moseeker.baseorm.db.jobdb.tables.JobPcRecommendPositionsModule;
import com.moseeker.baseorm.db.jobdb.tables.JobPcReported;
import com.moseeker.baseorm.db.jobdb.tables.JobPosition;
import com.moseeker.baseorm.db.jobdb.tables.JobPositionCity;
import com.moseeker.baseorm.db.jobdb.tables.JobPositionExt;
import com.moseeker.baseorm.db.jobdb.tables.JobPositionShareTplConf;
import com.moseeker.baseorm.db.jobdb.tables.JobPositionTopic;
import com.moseeker.baseorm.db.jobdb.tables.JobResumeOther;
import com.moseeker.baseorm.db.jobdb.tables.UserProfileJobapply;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in jobdb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>jobdb.job_application</code>.
     */
    public static final JobApplication JOB_APPLICATION = com.moseeker.baseorm.db.jobdb.tables.JobApplication.JOB_APPLICATION;

    /**
     * 职位自定义字段配置表
     */
    public static final JobCustom JOB_CUSTOM = com.moseeker.baseorm.db.jobdb.tables.JobCustom.JOB_CUSTOM;

    /**
     * 公司自定义职能表
     */
    public static final JobOccupation JOB_OCCUPATION = com.moseeker.baseorm.db.jobdb.tables.JobOccupation.JOB_OCCUPATION;

    /**
     * 首页广告位数据表设计
     */
    public static final JobPcAdvertisement JOB_PC_ADVERTISEMENT = com.moseeker.baseorm.db.jobdb.tables.JobPcAdvertisement.JOB_PC_ADVERTISEMENT;

    /**
     * 推荐列表数据库设计
     */
    public static final JobPcRecommendPositionsModule JOB_PC_RECOMMEND_POSITIONS_MODULE = com.moseeker.baseorm.db.jobdb.tables.JobPcRecommendPositionsModule.JOB_PC_RECOMMEND_POSITIONS_MODULE;

    /**
     * 推荐职位明细关系表
     */
    public static final JobPcRecommendPositionItem JOB_PC_RECOMMEND_POSITION_ITEM = com.moseeker.baseorm.db.jobdb.tables.JobPcRecommendPositionItem.JOB_PC_RECOMMEND_POSITION_ITEM;

    /**
     * 被举报职位数据表
     */
    public static final JobPcReported JOB_PC_REPORTED = com.moseeker.baseorm.db.jobdb.tables.JobPcReported.JOB_PC_REPORTED;

    /**
     * The table <code>jobdb.job_position</code>.
     */
    public static final JobPosition JOB_POSITION = com.moseeker.baseorm.db.jobdb.tables.JobPosition.JOB_POSITION;

    /**
     * The table <code>jobdb.job_position_city</code>.
     */
    public static final JobPositionCity JOB_POSITION_CITY = com.moseeker.baseorm.db.jobdb.tables.JobPositionCity.JOB_POSITION_CITY;

    /**
     * 职位信息扩展表
     */
    public static final JobPositionExt JOB_POSITION_EXT = com.moseeker.baseorm.db.jobdb.tables.JobPositionExt.JOB_POSITION_EXT;

    /**
     * 职位分享描述配置模板
     */
    public static final JobPositionShareTplConf JOB_POSITION_SHARE_TPL_CONF = com.moseeker.baseorm.db.jobdb.tables.JobPositionShareTplConf.JOB_POSITION_SHARE_TPL_CONF;

    /**
     * 职位主题活动关系表
     */
    public static final JobPositionTopic JOB_POSITION_TOPIC = com.moseeker.baseorm.db.jobdb.tables.JobPositionTopic.JOB_POSITION_TOPIC;

    /**
     * 自定义简历副本记录表
     */
    public static final JobResumeOther JOB_RESUME_OTHER = com.moseeker.baseorm.db.jobdb.tables.JobResumeOther.JOB_RESUME_OTHER;

    /**
     * VIEW
     */
    public static final UserProfileJobapply USER_PROFILE_JOBAPPLY = com.moseeker.baseorm.db.jobdb.tables.UserProfileJobapply.USER_PROFILE_JOBAPPLY;
}
