/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.daos;


import com.moseeker.baseorm.db.hrdb.tables.HrInterviewFeedbackResultAnswerSheet;
import com.moseeker.baseorm.db.hrdb.tables.records.HrInterviewFeedbackResultAnswerSheetRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 面试反馈结果
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrInterviewFeedbackResultAnswerSheetDao extends DAOImpl<HrInterviewFeedbackResultAnswerSheetRecord, com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet, Integer> {

    /**
     * Create a new HrInterviewFeedbackResultAnswerSheetDao without any configuration
     */
    public HrInterviewFeedbackResultAnswerSheetDao() {
        super(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET, com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet.class);
    }

    /**
     * Create a new HrInterviewFeedbackResultAnswerSheetDao with an attached configuration
     */
    public HrInterviewFeedbackResultAnswerSheetDao(Configuration configuration) {
        super(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET, com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchById(Integer... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet fetchOneById(Integer value) {
        return fetchOne(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.ID, value);
    }

    /**
     * Fetch records that have <code>interviewer_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchByInterviewerId(Integer... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.INTERVIEWER_ID, values);
    }

    /**
     * Fetch records that have <code>applier_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchByApplierId(Integer... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.APPLIER_ID, values);
    }

    /**
     * Fetch records that have <code>application_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchByApplicationId(Integer... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.APPLICATION_ID, values);
    }

    /**
     * Fetch records that have <code>interview_concrete_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchByInterviewConcreteId(Integer... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.INTERVIEW_CONCRETE_ID, values);
    }

    /**
     * Fetch records that have <code>interview_template_id IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchByInterviewTemplateId(Integer... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.INTERVIEW_TEMPLATE_ID, values);
    }

    /**
     * Fetch records that have <code>passed IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchByPassed(Integer... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.PASSED, values);
    }

    /**
     * Fetch records that have <code>evaluation IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchByEvaluation(String... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.EVALUATION, values);
    }

    /**
     * Fetch records that have <code>disable IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchByDisable(Integer... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.DISABLE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchByCreateTime(Timestamp... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.moseeker.baseorm.db.hrdb.tables.pojos.HrInterviewFeedbackResultAnswerSheet> fetchByUpdateTime(Timestamp... values) {
        return fetch(HrInterviewFeedbackResultAnswerSheet.HR_INTERVIEW_FEEDBACK_RESULT_ANSWER_SHEET.UPDATE_TIME, values);
    }
}
