/**
 * This class is generated by jOOQ
 */
package com.moseeker.db.jobdb.tables;


import com.moseeker.db.jobdb.Jobdb;
import com.moseeker.db.jobdb.Keys;
import com.moseeker.db.jobdb.tables.records.JobResumeBasicRecord;

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
 * 申请简历简述表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobResumeBasic extends TableImpl<JobResumeBasicRecord> {

    private static final long serialVersionUID = 877774517;

    /**
     * The reference instance of <code>jobDB.job_resume_basic</code>
     */
    public static final JobResumeBasic JOB_RESUME_BASIC = new JobResumeBasic();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobResumeBasicRecord> getRecordType() {
        return JobResumeBasicRecord.class;
    }

    /**
     * The column <code>jobDB.job_resume_basic.id</code>. ID
     */
    public final TableField<JobResumeBasicRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "ID");

    /**
     * The column <code>jobDB.job_resume_basic.app_id</code>. 申请ID
     */
    public final TableField<JobResumeBasicRecord, Integer> APP_ID = createField("app_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "申请ID");

    /**
     * The column <code>jobDB.job_resume_basic.position_id</code>. 职位ID
     */
    public final TableField<JobResumeBasicRecord, Integer> POSITION_ID = createField("position_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "职位ID");

    /**
     * The column <code>jobDB.job_resume_basic.firstname</code>. 姓
     */
    public final TableField<JobResumeBasicRecord, String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "姓");

    /**
     * The column <code>jobDB.job_resume_basic.lastname</code>. 名
     */
    public final TableField<JobResumeBasicRecord, String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "名");

    /**
     * The column <code>jobDB.job_resume_basic.address</code>. 居住地
     */
    public final TableField<JobResumeBasicRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "居住地");

    /**
     * The column <code>jobDB.job_resume_basic.age</code>. 年龄
     */
    public final TableField<JobResumeBasicRecord, String> AGE = createField("age", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "年龄");

    /**
     * The column <code>jobDB.job_resume_basic.work_exp_years</code>. 工作年限
     */
    public final TableField<JobResumeBasicRecord, Byte> WORK_EXP_YEARS = createField("work_exp_years", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "工作年限");

    /**
     * The column <code>jobDB.job_resume_basic.job_position</code>. 工作经历-职位
     */
    public final TableField<JobResumeBasicRecord, String> JOB_POSITION = createField("job_position", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "工作经历-职位");

    /**
     * The column <code>jobDB.job_resume_basic.job_company</code>. 工作经历-公司
     */
    public final TableField<JobResumeBasicRecord, String> JOB_COMPANY = createField("job_company", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "工作经历-公司");

    /**
     * The column <code>jobDB.job_resume_basic.job_start</code>. 工作经历-开始时间
     */
    public final TableField<JobResumeBasicRecord, Timestamp> JOB_START = createField("job_start", org.jooq.impl.SQLDataType.TIMESTAMP, this, "工作经历-开始时间");

    /**
     * The column <code>jobDB.job_resume_basic.job_end</code>. 工作经历-结束时间
     */
    public final TableField<JobResumeBasicRecord, Timestamp> JOB_END = createField("job_end", org.jooq.impl.SQLDataType.TIMESTAMP, this, "工作经历-结束时间");

    /**
     * The column <code>jobDB.job_resume_basic.edu_grade</code>. 教育经历-学历
     */
    public final TableField<JobResumeBasicRecord, String> EDU_GRADE = createField("edu_grade", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "教育经历-学历");

    /**
     * The column <code>jobDB.job_resume_basic.edu_school</code>. 教育经历-学校
     */
    public final TableField<JobResumeBasicRecord, String> EDU_SCHOOL = createField("edu_school", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "教育经历-学校");

    /**
     * The column <code>jobDB.job_resume_basic.edu_start</code>. 教育经历-开始时间
     */
    public final TableField<JobResumeBasicRecord, Timestamp> EDU_START = createField("edu_start", org.jooq.impl.SQLDataType.TIMESTAMP, this, "教育经历-开始时间");

    /**
     * The column <code>jobDB.job_resume_basic.edu_end</code>. 教育经历-结束时间
     */
    public final TableField<JobResumeBasicRecord, Timestamp> EDU_END = createField("edu_end", org.jooq.impl.SQLDataType.TIMESTAMP, this, "教育经历-结束时间");

    /**
     * The column <code>jobDB.job_resume_basic.view_count</code>. 浏览次数
     */
    public final TableField<JobResumeBasicRecord, Long> VIEW_COUNT = createField("view_count", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "浏览次数");

    /**
     * The column <code>jobDB.job_resume_basic.resume_type</code>. 简历类型 0：仟寻简历，1：附件简历
     */
    public final TableField<JobResumeBasicRecord, Byte> RESUME_TYPE = createField("resume_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "简历类型 0：仟寻简历，1：附件简历");

    /**
     * The column <code>jobDB.job_resume_basic.cv_type</code>. 简历类型 0：PC简历，1：仟寻手机填写的简历，2：前程无忧 3：猎聘 4：智联 5:linkedin 13：email简历
     */
    public final TableField<JobResumeBasicRecord, Short> CV_TYPE = createField("cv_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "简历类型 0：PC简历，1：仟寻手机填写的简历，2：前程无忧 3：猎聘 4：智联 5:linkedin 13：email简历");

    /**
     * The column <code>jobDB.job_resume_basic.email_resume_status</code>. 简历状态,（0，有效；1,未收到回复邮件；2，文件格式不支持；3，附件超过10M；9，提取邮件失败）
     */
    public final TableField<JobResumeBasicRecord, Byte> EMAIL_RESUME_STATUS = createField("email_resume_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "简历状态,（0，有效；1,未收到回复邮件；2，文件格式不支持；3，附件超过10M；9，提取邮件失败）");

    /**
     * Create a <code>jobDB.job_resume_basic</code> table reference
     */
    public JobResumeBasic() {
        this("job_resume_basic", null);
    }

    /**
     * Create an aliased <code>jobDB.job_resume_basic</code> table reference
     */
    public JobResumeBasic(String alias) {
        this(alias, JOB_RESUME_BASIC);
    }

    private JobResumeBasic(String alias, Table<JobResumeBasicRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobResumeBasic(String alias, Table<JobResumeBasicRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "申请简历简述表");
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
    public Identity<JobResumeBasicRecord, Integer> getIdentity() {
        return Keys.IDENTITY_JOB_RESUME_BASIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JobResumeBasicRecord> getPrimaryKey() {
        return Keys.KEY_JOB_RESUME_BASIC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobResumeBasicRecord>> getKeys() {
        return Arrays.<UniqueKey<JobResumeBasicRecord>>asList(Keys.KEY_JOB_RESUME_BASIC_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobResumeBasic as(String alias) {
        return new JobResumeBasic(alias, this);
    }

    /**
     * Rename this table
     */
    public JobResumeBasic rename(String name) {
        return new JobResumeBasic(name, null);
    }
}
