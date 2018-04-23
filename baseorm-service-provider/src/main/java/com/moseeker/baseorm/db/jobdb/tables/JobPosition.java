/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.jobdb.tables;


import com.moseeker.baseorm.db.jobdb.Jobdb;
import com.moseeker.baseorm.db.jobdb.Keys;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPositionRecord;

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
public class JobPosition extends TableImpl<JobPositionRecord> {

    private static final long serialVersionUID = 7010626;

    /**
     * The reference instance of <code>jobdb.job_position</code>
     */
    public static final JobPosition JOB_POSITION = new JobPosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobPositionRecord> getRecordType() {
        return JobPositionRecord.class;
    }

    /**
     * The column <code>jobdb.job_position.id</code>.
     */
    public final TableField<JobPositionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jobdb.job_position.jobnumber</code>. 职位编号
     */
    public final TableField<JobPositionRecord, String> JOBNUMBER = createField("jobnumber", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职位编号");

    /**
     * The column <code>jobdb.job_position.company_id</code>. company.id
     */
    public final TableField<JobPositionRecord, Integer> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "company.id");

    /**
     * The column <code>jobdb.job_position.title</code>. 职位标题
     */
    public final TableField<JobPositionRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职位标题");

    /**
     * The column <code>jobdb.job_position.province</code>. 所在省
     */
    public final TableField<JobPositionRecord, String> PROVINCE = createField("province", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "所在省");

    /**
     * The column <code>jobdb.job_position.city</code>. 所在城市，多城市使用中文逗号分割
     */
    public final TableField<JobPositionRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "所在城市，多城市使用中文逗号分割");

    /**
     * The column <code>jobdb.job_position.department</code>. 所在部门
     */
    public final TableField<JobPositionRecord, String> DEPARTMENT = createField("department", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "所在部门");

    /**
     * The column <code>jobdb.job_position.l_jobid</code>. jobid from ATS or other channel
     */
    public final TableField<JobPositionRecord, Integer> L_JOBID = createField("l_jobid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "jobid from ATS or other channel");

    /**
     * The column <code>jobdb.job_position.publish_date</code>. Default: now, set by js
     */
    public final TableField<JobPositionRecord, Timestamp> PUBLISH_DATE = createField("publish_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "Default: now, set by js");

    /**
     * The column <code>jobdb.job_position.stop_date</code>. 截止日期
     */
    public final TableField<JobPositionRecord, Timestamp> STOP_DATE = createField("stop_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "截止日期");

    /**
     * The column <code>jobdb.job_position.accountabilities</code>. Job responsibilities
     */
    public final TableField<JobPositionRecord, String> ACCOUNTABILITIES = createField("accountabilities", org.jooq.impl.SQLDataType.CLOB, this, "Job responsibilities");

    /**
     * The column <code>jobdb.job_position.experience</code>. 工作经验
     */
    public final TableField<JobPositionRecord, String> EXPERIENCE = createField("experience", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "工作经验");

    /**
     * The column <code>jobdb.job_position.requirement</code>. 职位要求
     */
    public final TableField<JobPositionRecord, String> REQUIREMENT = createField("requirement", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "职位要求");

    /**
     * The column <code>jobdb.job_position.salary</code>. 薪水
     */
    public final TableField<JobPositionRecord, String> SALARY = createField("salary", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "薪水");

    /**
     * The column <code>jobdb.job_position.language</code>. 外语要求
     */
    public final TableField<JobPositionRecord, String> LANGUAGE = createField("language", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "外语要求");

    /**
     * The column <code>jobdb.job_position.job_grade</code>. 优先级
     */
    public final TableField<JobPositionRecord, Integer> JOB_GRADE = createField("job_grade", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("10", org.jooq.impl.SQLDataType.INTEGER)), this, "优先级");

    /**
     * The column <code>jobdb.job_position.status</code>. 0 有效, 1 删除, 2 撤下
     */
    public final TableField<JobPositionRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0 有效, 1 删除, 2 撤下");

    /**
     * The column <code>jobdb.job_position.visitnum</code>.
     */
    public final TableField<JobPositionRecord, Integer> VISITNUM = createField("visitnum", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>jobdb.job_position.lastvisit</code>. openid of last visiter
     */
    public final TableField<JobPositionRecord, String> LASTVISIT = createField("lastvisit", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "openid of last visiter");

    /**
     * The column <code>jobdb.job_position.source_id</code>. 职位来源 0：Moseeker
     */
    public final TableField<JobPositionRecord, Integer> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "职位来源 0：Moseeker");

    /**
     * The column <code>jobdb.job_position.update_time</code>.
     */
    public final TableField<JobPositionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jobdb.job_position.business_group</code>. 事业群
     */
    public final TableField<JobPositionRecord, String> BUSINESS_GROUP = createField("business_group", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "事业群");

    /**
     * The column <code>jobdb.job_position.employment_type</code>. 0:全职，1：兼职：2：合同工 3:实习 9:其他
     */
    public final TableField<JobPositionRecord, Byte> EMPLOYMENT_TYPE = createField("employment_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:全职，1：兼职：2：合同工 3:实习 9:其他");

    /**
     * The column <code>jobdb.job_position.hr_email</code>. HR联系人邮箱，申请通知
     */
    public final TableField<JobPositionRecord, String> HR_EMAIL = createField("hr_email", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "HR联系人邮箱，申请通知");

    /**
     * The column <code>jobdb.job_position.benefits</code>. 职位福利
     */
    public final TableField<JobPositionRecord, String> BENEFITS = createField("benefits", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职位福利");

    /**
     * The column <code>jobdb.job_position.degree</code>. 0:无 1:大专 2:本科 3:硕士 4:MBA 5:博士 6:中专 7:高中 8: 博士后 9:初中
     */
    public final TableField<JobPositionRecord, Byte> DEGREE = createField("degree", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:无 1:大专 2:本科 3:硕士 4:MBA 5:博士 6:中专 7:高中 8: 博士后 9:初中");

    /**
     * The column <code>jobdb.job_position.feature</code>. 职位特色，多福利特色使用#分割
     */
    public final TableField<JobPositionRecord, String> FEATURE = createField("feature", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职位特色，多福利特色使用#分割");

    /**
     * The column <code>jobdb.job_position.email_notice</code>. 申请后是否给 HR 发送邮件 0:发送 1:不发送
     */
    public final TableField<JobPositionRecord, Byte> EMAIL_NOTICE = createField("email_notice", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "申请后是否给 HR 发送邮件 0:发送 1:不发送");

    /**
     * The column <code>jobdb.job_position.candidate_source</code>. 0:社招 1：校招
     */
    public final TableField<JobPositionRecord, Byte> CANDIDATE_SOURCE = createField("candidate_source", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:社招 1：校招");

    /**
     * The column <code>jobdb.job_position.occupation</code>. 职位职能
     */
    public final TableField<JobPositionRecord, String> OCCUPATION = createField("occupation", org.jooq.impl.SQLDataType.VARCHAR.length(999).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职位职能");

    /**
     * The column <code>jobdb.job_position.is_recom</code>. 是否需要推荐0：需要 1：不需要
     */
    public final TableField<JobPositionRecord, Integer> IS_RECOM = createField("is_recom", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "是否需要推荐0：需要 1：不需要");

    /**
     * The column <code>jobdb.job_position.industry</code>. 所属行业
     */
    public final TableField<JobPositionRecord, String> INDUSTRY = createField("industry", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "所属行业");

    /**
     * The column <code>jobdb.job_position.hongbao_config_id</code>.
     */
    public final TableField<JobPositionRecord, Integer> HONGBAO_CONFIG_ID = createField("hongbao_config_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>jobdb.job_position.hongbao_config_recom_id</code>.
     */
    public final TableField<JobPositionRecord, Integer> HONGBAO_CONFIG_RECOM_ID = createField("hongbao_config_recom_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>jobdb.job_position.hongbao_config_app_id</code>.
     */
    public final TableField<JobPositionRecord, Integer> HONGBAO_CONFIG_APP_ID = createField("hongbao_config_app_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>jobdb.job_position.email_resume_conf</code>. 0:允许使用email简历进行投递；1:不允许使用email简历投递
     */
    public final TableField<JobPositionRecord, Byte> EMAIL_RESUME_CONF = createField("email_resume_conf", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:允许使用email简历进行投递；1:不允许使用email简历投递");

    /**
     * The column <code>jobdb.job_position.l_PostingTargetId</code>. lumesse每一个职位会生成一个PostingTargetId,用来生成每个职位的投递邮箱地址
     */
    public final TableField<JobPositionRecord, Integer> L_POSTINGTARGETID = createField("l_PostingTargetId", org.jooq.impl.SQLDataType.INTEGER, this, "lumesse每一个职位会生成一个PostingTargetId,用来生成每个职位的投递邮箱地址");

    /**
     * The column <code>jobdb.job_position.priority</code>. 是否置顶
     */
    public final TableField<JobPositionRecord, Byte> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("10", org.jooq.impl.SQLDataType.TINYINT)), this, "是否置顶");

    /**
     * The column <code>jobdb.job_position.share_tpl_id</code>.
     */
    public final TableField<JobPositionRecord, Integer> SHARE_TPL_ID = createField("share_tpl_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jobdb.job_position.district</code>. 添加区(省市区的区)
     */
    public final TableField<JobPositionRecord, String> DISTRICT = createField("district", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "添加区(省市区的区)");

    /**
     * The column <code>jobdb.job_position.count</code>. 添加招聘人数, 0：不限
     */
    public final TableField<JobPositionRecord, Short> COUNT = createField("count", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "添加招聘人数, 0：不限");

    /**
     * The column <code>jobdb.job_position.salary_top</code>. 薪资上限（k）
     */
    public final TableField<JobPositionRecord, Integer> SALARY_TOP = createField("salary_top", org.jooq.impl.SQLDataType.INTEGER, this, "薪资上限（k）");

    /**
     * The column <code>jobdb.job_position.salary_bottom</code>. 薪资下限（k）
     */
    public final TableField<JobPositionRecord, Integer> SALARY_BOTTOM = createField("salary_bottom", org.jooq.impl.SQLDataType.INTEGER, this, "薪资下限（k）");

    /**
     * The column <code>jobdb.job_position.experience_above</code>. 及以上 1：需要， 0：不需要
     */
    public final TableField<JobPositionRecord, Byte> EXPERIENCE_ABOVE = createField("experience_above", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "及以上 1：需要， 0：不需要");

    /**
     * The column <code>jobdb.job_position.degree_above</code>. 及以上 1：需要， 0：不需要
     */
    public final TableField<JobPositionRecord, Byte> DEGREE_ABOVE = createField("degree_above", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "及以上 1：需要， 0：不需要");

    /**
     * The column <code>jobdb.job_position.management_experience</code>. 是否要求管理经验0：需要1：不需要
     */
    public final TableField<JobPositionRecord, Byte> MANAGEMENT_EXPERIENCE = createField("management_experience", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否要求管理经验0：需要1：不需要");

    /**
     * The column <code>jobdb.job_position.gender</code>. 0-&gt; female, 1-&gt;male, 2-&gt;all
     */
    public final TableField<JobPositionRecord, Byte> GENDER = createField("gender", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("2", org.jooq.impl.SQLDataType.TINYINT)), this, "0-> female, 1->male, 2->all");

    /**
     * The column <code>jobdb.job_position.publisher</code>. hr_account.id
     */
    public final TableField<JobPositionRecord, Integer> PUBLISHER = createField("publisher", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "hr_account.id");

    /**
     * The column <code>jobdb.job_position.app_cv_config_id</code>. 职位开启并配置自定义模板 hr_app_cv_conf.id
     */
    public final TableField<JobPositionRecord, Integer> APP_CV_CONFIG_ID = createField("app_cv_config_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "职位开启并配置自定义模板 hr_app_cv_conf.id");

    /**
     * The column <code>jobdb.job_position.source</code>. 0:手动创建, 1:导入, 9:ATS导入
     */
    public final TableField<JobPositionRecord, Short> SOURCE = createField("source", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "0:手动创建, 1:导入, 9:ATS导入");

    /**
     * The column <code>jobdb.job_position.hb_status</code>. 是否正参加活动：0=未参加  1=正参加点击红包活动  2=正参加被申请红包活动  3=正参加1+2红包活动
     */
    public final TableField<JobPositionRecord, Byte> HB_STATUS = createField("hb_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否正参加活动：0=未参加  1=正参加点击红包活动  2=正参加被申请红包活动  3=正参加1+2红包活动");

    /**
     * The column <code>jobdb.job_position.child_company_id</code>. hr_child_company.id
     */
    public final TableField<JobPositionRecord, Integer> CHILD_COMPANY_ID = createField("child_company_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "hr_child_company.id");

    /**
     * The column <code>jobdb.job_position.age</code>. 年龄要求, 0：无要求
     */
    public final TableField<JobPositionRecord, Byte> AGE = createField("age", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "年龄要求, 0：无要求");

    /**
     * The column <code>jobdb.job_position.major_required</code>. 专业要求
     */
    public final TableField<JobPositionRecord, String> MAJOR_REQUIRED = createField("major_required", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "专业要求");

    /**
     * The column <code>jobdb.job_position.work_address</code>. 上班地址
     */
    public final TableField<JobPositionRecord, String> WORK_ADDRESS = createField("work_address", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "上班地址");

    /**
     * The column <code>jobdb.job_position.keyword</code>. 职位关键词
     */
    public final TableField<JobPositionRecord, String> KEYWORD = createField("keyword", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "职位关键词");

    /**
     * The column <code>jobdb.job_position.reporting_to</code>. 汇报对象
     */
    public final TableField<JobPositionRecord, String> REPORTING_TO = createField("reporting_to", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "汇报对象");

    /**
     * The column <code>jobdb.job_position.is_hiring</code>. 是否急招, 1:是 0:否
     */
    public final TableField<JobPositionRecord, Byte> IS_HIRING = createField("is_hiring", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否急招, 1:是 0:否");

    /**
     * The column <code>jobdb.job_position.underlings</code>. 下属人数， 0:没有下属
     */
    public final TableField<JobPositionRecord, Byte> UNDERLINGS = createField("underlings", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "下属人数， 0:没有下属");

    /**
     * The column <code>jobdb.job_position.language_required</code>. 语言要求，1:是 0:否
     */
    public final TableField<JobPositionRecord, Byte> LANGUAGE_REQUIRED = createField("language_required", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "语言要求，1:是 0:否");

    /**
     * The column <code>jobdb.job_position.target_industry</code>. 期望人选所在行业
     */
    public final TableField<JobPositionRecord, Byte> TARGET_INDUSTRY = createField("target_industry", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "期望人选所在行业");

    /**
     * The column <code>jobdb.job_position.current_status</code>. 已经弃用，0:招募中, 1: 未发布, 2:暂停, 3:撤下, 4:关闭
     */
    public final TableField<JobPositionRecord, Byte> CURRENT_STATUS = createField("current_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "已经弃用，0:招募中, 1: 未发布, 2:暂停, 3:撤下, 4:关闭");

    /**
     * The column <code>jobdb.job_position.position_code</code>. 职能字典code, dict_position.code
     */
    public final TableField<JobPositionRecord, Integer> POSITION_CODE = createField("position_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("000000", org.jooq.impl.SQLDataType.INTEGER)), this, "职能字典code, dict_position.code");

    /**
     * The column <code>jobdb.job_position.team_id</code>. 职位所属团队
     */
    public final TableField<JobPositionRecord, Integer> TEAM_ID = createField("team_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "职位所属团队");

    /**
     * The column <code>jobdb.job_position.profile_cc_mail_enabled</code>. 简历申请是否抄送邮箱，0 否；1 是
     */
    public final TableField<JobPositionRecord, Byte> PROFILE_CC_MAIL_ENABLED = createField("profile_cc_mail_enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "简历申请是否抄送邮箱，0 否；1 是");

    /**
     * Create a <code>jobdb.job_position</code> table reference
     */
    public JobPosition() {
        this("job_position", null);
    }

    /**
     * Create an aliased <code>jobdb.job_position</code> table reference
     */
    public JobPosition(String alias) {
        this(alias, JOB_POSITION);
    }

    private JobPosition(String alias, Table<JobPositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobPosition(String alias, Table<JobPositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jobdb.JOBDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JobPositionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_JOB_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JobPositionRecord> getPrimaryKey() {
        return Keys.KEY_JOB_POSITION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobPositionRecord>> getKeys() {
        return Arrays.<UniqueKey<JobPositionRecord>>asList(Keys.KEY_JOB_POSITION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobPosition as(String alias) {
        return new JobPosition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JobPosition rename(String name) {
        return new JobPosition(name, null);
    }
}
