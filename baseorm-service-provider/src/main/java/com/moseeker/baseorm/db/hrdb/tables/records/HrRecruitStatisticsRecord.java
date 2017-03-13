/**
 * This class is generated by jOOQ
 */
package com.moseeker.baseorm.db.hrdb.tables.records;


import com.moseeker.baseorm.db.hrdb.tables.HrRecruitStatistics;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 招聘数据次数统计表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrRecruitStatisticsRecord extends UpdatableRecordImpl<HrRecruitStatisticsRecord> implements Record20<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Date, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> {

	private static final long serialVersionUID = 1830246708;

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.id</code>. primary key
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.id</code>. primary key
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.position_id</code>. hr_position.id
	 */
	public void setPositionId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.position_id</code>. hr_position.id
	 */
	public Integer getPositionId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.company_id</code>. company.id
	 */
	public void setCompanyId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.company_id</code>. company.id
	 */
	public Integer getCompanyId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.jd_pv</code>. JD 页浏览次数
	 */
	public void setJdPv(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.jd_pv</code>. JD 页浏览次数
	 */
	public Integer getJdPv() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.recom_jd_pv</code>. JD 页推荐浏览次数
	 */
	public void setRecomJdPv(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.recom_jd_pv</code>. JD 页推荐浏览次数
	 */
	public Integer getRecomJdPv() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.fav_num</code>. 感兴趣的次数
	 */
	public void setFavNum(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.fav_num</code>. 感兴趣的次数
	 */
	public Integer getFavNum() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.recom_fav_num</code>. 推荐感兴趣的次数
	 */
	public void setRecomFavNum(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.recom_fav_num</code>. 推荐感兴趣的次数
	 */
	public Integer getRecomFavNum() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.apply_num</code>. 投递次数
	 */
	public void setApplyNum(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.apply_num</code>. 投递次数
	 */
	public Integer getApplyNum() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.recom_apply_num</code>. 推荐投递次数
	 */
	public void setRecomApplyNum(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.recom_apply_num</code>. 推荐投递次数
	 */
	public Integer getRecomApplyNum() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.create_date</code>. 创建日期
	 */
	public void setCreateDate(Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.create_date</code>. 创建日期
	 */
	public Date getCreateDate() {
		return (Date) getValue(9);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.after_review_num</code>. 评审通过人数
	 */
	public void setAfterReviewNum(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.after_review_num</code>. 评审通过人数
	 */
	public Integer getAfterReviewNum() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.recom_after_review_num</code>. 推荐评审通过人数
	 */
	public void setRecomAfterReviewNum(Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.recom_after_review_num</code>. 推荐评审通过人数
	 */
	public Integer getRecomAfterReviewNum() {
		return (Integer) getValue(11);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.after_interview_num</code>. 面试通过人数
	 */
	public void setAfterInterviewNum(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.after_interview_num</code>. 面试通过人数
	 */
	public Integer getAfterInterviewNum() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.recom_after_interview_num</code>. 推荐面试通过人数
	 */
	public void setRecomAfterInterviewNum(Integer value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.recom_after_interview_num</code>. 推荐面试通过人数
	 */
	public Integer getRecomAfterInterviewNum() {
		return (Integer) getValue(13);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.on_board_num</code>. 入职人数
	 */
	public void setOnBoardNum(Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.on_board_num</code>. 入职人数
	 */
	public Integer getOnBoardNum() {
		return (Integer) getValue(14);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.recom_on_board_num</code>. 推荐入职人数
	 */
	public void setRecomOnBoardNum(Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.recom_on_board_num</code>. 推荐入职人数
	 */
	public Integer getRecomOnBoardNum() {
		return (Integer) getValue(15);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.not_viewed_num</code>. 简历未查阅人数
	 */
	public void setNotViewedNum(Integer value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.not_viewed_num</code>. 简历未查阅人数
	 */
	public Integer getNotViewedNum() {
		return (Integer) getValue(16);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.recom_not_viewed_num</code>. 推荐未查阅人数
	 */
	public void setRecomNotViewedNum(Integer value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.recom_not_viewed_num</code>. 推荐未查阅人数
	 */
	public Integer getRecomNotViewedNum() {
		return (Integer) getValue(17);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.not_qualified_num</code>. 简历不匹配人数
	 */
	public void setNotQualifiedNum(Integer value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.not_qualified_num</code>. 简历不匹配人数
	 */
	public Integer getNotQualifiedNum() {
		return (Integer) getValue(18);
	}

	/**
	 * Setter for <code>hrdb.hr_recruit_statistics.recom_not_qualified_num</code>. 推荐简历不匹配人数
	 */
	public void setRecomNotQualifiedNum(Integer value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>hrdb.hr_recruit_statistics.recom_not_qualified_num</code>. 推荐简历不匹配人数
	 */
	public Integer getRecomNotQualifiedNum() {
		return (Integer) getValue(19);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record20 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row20<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Date, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
		return (Row20) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row20<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Date, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
		return (Row20) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.POSITION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.COMPANY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.JD_PV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.RECOM_JD_PV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.FAV_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.RECOM_FAV_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.APPLY_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.RECOM_APPLY_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field10() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.CREATE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.AFTER_REVIEW_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field12() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.RECOM_AFTER_REVIEW_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.AFTER_INTERVIEW_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field14() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.RECOM_AFTER_INTERVIEW_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field15() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.ON_BOARD_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field16() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.RECOM_ON_BOARD_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field17() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.NOT_VIEWED_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field18() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.RECOM_NOT_VIEWED_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field19() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.NOT_QUALIFIED_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field20() {
		return HrRecruitStatistics.HR_RECRUIT_STATISTICS.RECOM_NOT_QUALIFIED_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getPositionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getCompanyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getJdPv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getRecomJdPv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getFavNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getRecomFavNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getApplyNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getRecomApplyNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value10() {
		return getCreateDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getAfterReviewNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value12() {
		return getRecomAfterReviewNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getAfterInterviewNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value14() {
		return getRecomAfterInterviewNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value15() {
		return getOnBoardNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value16() {
		return getRecomOnBoardNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value17() {
		return getNotViewedNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value18() {
		return getRecomNotViewedNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value19() {
		return getNotQualifiedNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value20() {
		return getRecomNotQualifiedNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value2(Integer value) {
		setPositionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value3(Integer value) {
		setCompanyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value4(Integer value) {
		setJdPv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value5(Integer value) {
		setRecomJdPv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value6(Integer value) {
		setFavNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value7(Integer value) {
		setRecomFavNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value8(Integer value) {
		setApplyNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value9(Integer value) {
		setRecomApplyNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value10(Date value) {
		setCreateDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value11(Integer value) {
		setAfterReviewNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value12(Integer value) {
		setRecomAfterReviewNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value13(Integer value) {
		setAfterInterviewNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value14(Integer value) {
		setRecomAfterInterviewNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value15(Integer value) {
		setOnBoardNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value16(Integer value) {
		setRecomOnBoardNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value17(Integer value) {
		setNotViewedNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value18(Integer value) {
		setRecomNotViewedNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value19(Integer value) {
		setNotQualifiedNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord value20(Integer value) {
		setRecomNotQualifiedNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HrRecruitStatisticsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Date value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15, Integer value16, Integer value17, Integer value18, Integer value19, Integer value20) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		value17(value17);
		value18(value18);
		value19(value19);
		value20(value20);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HrRecruitStatisticsRecord
	 */
	public HrRecruitStatisticsRecord() {
		super(HrRecruitStatistics.HR_RECRUIT_STATISTICS);
	}

	/**
	 * Create a detached, initialised HrRecruitStatisticsRecord
	 */
	public HrRecruitStatisticsRecord(Integer id, Integer positionId, Integer companyId, Integer jdPv, Integer recomJdPv, Integer favNum, Integer recomFavNum, Integer applyNum, Integer recomApplyNum, Date createDate, Integer afterReviewNum, Integer recomAfterReviewNum, Integer afterInterviewNum, Integer recomAfterInterviewNum, Integer onBoardNum, Integer recomOnBoardNum, Integer notViewedNum, Integer recomNotViewedNum, Integer notQualifiedNum, Integer recomNotQualifiedNum) {
		super(HrRecruitStatistics.HR_RECRUIT_STATISTICS);

		setValue(0, id);
		setValue(1, positionId);
		setValue(2, companyId);
		setValue(3, jdPv);
		setValue(4, recomJdPv);
		setValue(5, favNum);
		setValue(6, recomFavNum);
		setValue(7, applyNum);
		setValue(8, recomApplyNum);
		setValue(9, createDate);
		setValue(10, afterReviewNum);
		setValue(11, recomAfterReviewNum);
		setValue(12, afterInterviewNum);
		setValue(13, recomAfterInterviewNum);
		setValue(14, onBoardNum);
		setValue(15, recomOnBoardNum);
		setValue(16, notViewedNum);
		setValue(17, recomNotViewedNum);
		setValue(18, notQualifiedNum);
		setValue(19, recomNotQualifiedNum);
	}
}
