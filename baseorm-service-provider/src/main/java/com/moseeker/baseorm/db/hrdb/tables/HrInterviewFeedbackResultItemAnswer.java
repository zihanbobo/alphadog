/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables;


import com.moseeker.baseorm.db.hrdb.Hrdb;
import com.moseeker.baseorm.db.hrdb.Keys;
import com.moseeker.baseorm.db.hrdb.tables.records.HrInterviewFeedbackResultItemAnswerRecord;

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
 * 面试反馈-每个反馈项的反馈结果
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrInterviewFeedbackResultItemAnswer extends TableImpl<HrInterviewFeedbackResultItemAnswerRecord> {

    private static final long serialVersionUID = 1307988841;

    /**
     * The reference instance of <code>hrdb.hr_interview_feedback_result_item_answer</code>
     */
    public static final HrInterviewFeedbackResultItemAnswer HR_INTERVIEW_FEEDBACK_RESULT_ITEM_ANSWER = new HrInterviewFeedbackResultItemAnswer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HrInterviewFeedbackResultItemAnswerRecord> getRecordType() {
        return HrInterviewFeedbackResultItemAnswerRecord.class;
    }

    /**
     * The column <code>hrdb.hr_interview_feedback_result_item_answer.id</code>. 序列ID
     */
    public final TableField<HrInterviewFeedbackResultItemAnswerRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "序列ID");

    /**
     * The column <code>hrdb.hr_interview_feedback_result_item_answer.sheet_id</code>. hr_interview_feedback_result_answer_sheet.id
     */
    public final TableField<HrInterviewFeedbackResultItemAnswerRecord, Integer> SHEET_ID = createField("sheet_id", org.jooq.impl.SQLDataType.INTEGER, this, "hr_interview_feedback_result_answer_sheet.id");

    /**
     * The column <code>hrdb.hr_interview_feedback_result_item_answer.item_id</code>. hr_interview_feedback_template_item.id
     */
    public final TableField<HrInterviewFeedbackResultItemAnswerRecord, Integer> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.INTEGER, this, "hr_interview_feedback_template_item.id");

    /**
     * The column <code>hrdb.hr_interview_feedback_result_item_answer.item_answer_values</code>. 文本/打分类型答案填文字或一个数字
  单选、多选答案填hr_interview_feedback_template_item_option.id，多个id逗号分隔
     */
    public final TableField<HrInterviewFeedbackResultItemAnswerRecord, String> ITEM_ANSWER_VALUES = createField("item_answer_values", org.jooq.impl.SQLDataType.VARCHAR.length(4000), this, "文本/打分类型答案填文字或一个数字\n  单选、多选答案填hr_interview_feedback_template_item_option.id，多个id逗号分隔");

    /**
     * The column <code>hrdb.hr_interview_feedback_result_item_answer.disable</code>. 状态：0 有效  1 无效 2 逻辑删除
     */
    public final TableField<HrInterviewFeedbackResultItemAnswerRecord, Integer> DISABLE = createField("disable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "状态：0 有效  1 无效 2 逻辑删除");

    /**
     * The column <code>hrdb.hr_interview_feedback_result_item_answer.create_time</code>. 创建时间
     */
    public final TableField<HrInterviewFeedbackResultItemAnswerRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>hrdb.hr_interview_feedback_result_item_answer.update_time</code>. 更新时间
     */
    public final TableField<HrInterviewFeedbackResultItemAnswerRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>hrdb.hr_interview_feedback_result_item_answer</code> table reference
     */
    public HrInterviewFeedbackResultItemAnswer() {
        this("hr_interview_feedback_result_item_answer", null);
    }

    /**
     * Create an aliased <code>hrdb.hr_interview_feedback_result_item_answer</code> table reference
     */
    public HrInterviewFeedbackResultItemAnswer(String alias) {
        this(alias, HR_INTERVIEW_FEEDBACK_RESULT_ITEM_ANSWER);
    }

    private HrInterviewFeedbackResultItemAnswer(String alias, Table<HrInterviewFeedbackResultItemAnswerRecord> aliased) {
        this(alias, aliased, null);
    }

    private HrInterviewFeedbackResultItemAnswer(String alias, Table<HrInterviewFeedbackResultItemAnswerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "面试反馈-每个反馈项的反馈结果");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Hrdb.HRDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HrInterviewFeedbackResultItemAnswerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_HR_INTERVIEW_FEEDBACK_RESULT_ITEM_ANSWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HrInterviewFeedbackResultItemAnswerRecord> getPrimaryKey() {
        return Keys.KEY_HR_INTERVIEW_FEEDBACK_RESULT_ITEM_ANSWER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HrInterviewFeedbackResultItemAnswerRecord>> getKeys() {
        return Arrays.<UniqueKey<HrInterviewFeedbackResultItemAnswerRecord>>asList(Keys.KEY_HR_INTERVIEW_FEEDBACK_RESULT_ITEM_ANSWER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrInterviewFeedbackResultItemAnswer as(String alias) {
        return new HrInterviewFeedbackResultItemAnswer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HrInterviewFeedbackResultItemAnswer rename(String name) {
        return new HrInterviewFeedbackResultItemAnswer(name, null);
    }
}