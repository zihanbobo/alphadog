package com.moseeker.entity;

import com.moseeker.baseorm.constant.ReferralType;
import com.moseeker.baseorm.dao.candidatedb.CandidateRecomRecordDao;
import com.moseeker.baseorm.dao.candidatedb.CandidateShareChainDao;
import com.moseeker.baseorm.dao.historydb.HistoryUserEmployeeDao;
import com.moseeker.baseorm.dao.hrdb.HrHbConfigDao;
import com.moseeker.baseorm.dao.hrdb.HrHbPositionBindingDao;
import com.moseeker.baseorm.dao.hrdb.HrHbScratchCardDao;
import com.moseeker.baseorm.dao.hrdb.HrOperationRecordDao;
import com.moseeker.baseorm.dao.jobdb.JobApplicationDao;
import com.moseeker.baseorm.dao.jobdb.JobPositionDao;
import com.moseeker.baseorm.dao.profiledb.ProfileProfileDao;
import com.moseeker.baseorm.dao.referraldb.ReferralLogDao;
import com.moseeker.baseorm.dao.referraldb.ReferralPositionBonusStageDetailDao;
import com.moseeker.baseorm.dao.userdb.UserEmployeeDao;
import com.moseeker.baseorm.dao.userdb.UserEmployeePointsRecordDao;
import com.moseeker.baseorm.db.candidatedb.tables.records.CandidateRecomRecordRecord;
import com.moseeker.baseorm.db.hrdb.tables.pojos.HrHbItems;
import com.moseeker.baseorm.db.hrdb.tables.pojos.HrOperationRecord;
import com.moseeker.baseorm.db.hrdb.tables.records.HrHbConfigRecord;
import com.moseeker.baseorm.db.hrdb.tables.records.HrHbScratchCardRecord;
import com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication;
import com.moseeker.baseorm.db.jobdb.tables.pojos.JobPosition;
import com.moseeker.baseorm.db.jobdb.tables.records.JobApplicationRecord;
import com.moseeker.baseorm.db.profiledb.tables.records.ProfileProfileRecord;
import com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralEmployeeBonusRecord;
import com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralLog;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralPositionBonusStageDetailRecord;
import com.moseeker.baseorm.db.userdb.tables.UserEmployee;
import com.moseeker.baseorm.db.userdb.tables.records.UserEmployeeRecord;
import com.moseeker.common.annotation.iface.CounterIface;
import com.moseeker.common.constants.Constant;
import com.moseeker.common.thread.ThreadPool;
import com.moseeker.common.util.query.Query;
import com.moseeker.entity.Constant.ApplicationSource;
import com.moseeker.entity.biz.ProfileCompletenessImpl;
import com.moseeker.entity.exception.EmployeeException;
import com.moseeker.entity.pojos.BonusData;
import com.moseeker.entity.pojos.HBData;
import com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserUserDO;
import org.jooq.Record2;
import org.jooq.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/**
 * @Author: jack
 * @Date: 2018/7/18
 */
@Service
@CounterIface
public class ReferralEntity {


    @Autowired
    private HrHbConfigDao configDao;

    @Autowired
    private HrHbPositionBindingDao positionBindingDao;

    @Autowired
    private HrHbScratchCardDao scratchCardDao;

    @Autowired
    CandidateShareChainDao shareChainDao;

    @Autowired
    UserEmployeePointsRecordDao pointsRecordDao;

    @Autowired
    private ReferralLogDao referralLogDao;

    @Autowired
    private CandidateRecomRecordDao candidateRecomRecordDao;

    @Autowired
    private ProfileProfileDao profileDao;

    @Autowired
    private UserEmployeeDao employeeDao;

    @Autowired
    private HistoryUserEmployeeDao historyUserEmployeeDao;

    @Autowired
    private ProfileCompletenessImpl completeness;

    @Autowired
    private ReferralPositionBonusStageDetailDao stageDetailDao;

    @Autowired
    private JobApplicationDao applicationDao;

    @Autowired
    private JobPositionDao positionDao;

    @Autowired
    private HrOperationRecordDao operationRecordDao;

    @Autowired
    EmployeeEntity employeeEntity;

    @Autowired
    SearchengineEntity searchengineEntity;

    @Autowired
    private UserWxEntity wxEntity;

    @Autowired
    private UserAccountEntity userAccountEntity;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private ThreadPool threadPool = ThreadPool.Instance;

    /**
     * 计算给定时间内的员工内推带来的转发次数
     * @param userIdList 用户编号
     * @param positionIdList 职位编号
     * @param lastFriday 开始时间 (大于开始时间)
     * @param currentFriday 结束时间 （小于等于结束时间）
     * @return 员工与转发次数的关系
     */
    public Map<Integer, Integer> countEmployeeForward(List<Integer> userIdList, List<Integer> positionIdList, LocalDateTime lastFriday,
                                                      LocalDateTime currentFriday) {

        Result<Record2<Integer, Integer>> result = shareChainDao.countEmployeeForward(userIdList, positionIdList,
                lastFriday, currentFriday);

        if (result != null && result.size() > 0) {


            Map<Integer, Integer> employeeForward = result
                    .stream()
                    .collect(Collectors.toMap(Record2::value1, Record2::value2));

            //重复推荐数量
            Result<Record2<Integer, Integer>> repeatRecommand = shareChainDao.countRepeatRecommend(userIdList,
                    positionIdList, lastFriday, currentFriday);
            if (repeatRecommand != null && repeatRecommand.size() > 0) {
                repeatRecommand.forEach(integerIntegerRecord2 -> {
                    if (employeeForward.get(integerIntegerRecord2.value1()) != null) {
                        employeeForward.put(integerIntegerRecord2.value1(),
                                employeeForward.get(integerIntegerRecord2.value1())
                                        - integerIntegerRecord2.value2() + 1);
                    }
                });
            }

            return employeeForward;
        } else {
            return new HashMap<>();
        }
    }

    public Map<Integer,Integer> countEmployeeAwards(List<Integer> employeeIdList, LocalDateTime lastFriday,
                                                    LocalDateTime currentFriday) {
        Result<Record2<Long, BigDecimal>> result = pointsRecordDao.countEmployeeAwards(employeeIdList, lastFriday,
                currentFriday);

        if (result != null && result.size() > 0) {
            return result
                    .stream()
                    .filter(longBigDecimalRecord2 -> longBigDecimalRecord2.value1() != null)
                    .collect(Collectors.toMap(record->record.value1().intValue(),
                    record -> record.value2().intValue()));
        } else {
            return new HashMap<>();
        }
    }

    public void logReferralOperation(int position, int applicationId, int depth, List<String> referralReasons,
                                     String mobile, UserEmployeeDO employeeDO, int presenteeUserId, byte gender, String email) {
        CandidateRecomRecordRecord recomRecordRecord = new CandidateRecomRecordRecord();
        recomRecordRecord.setPositionId(position);
        recomRecordRecord.setAppId(applicationId);
        recomRecordRecord.setDepth(depth);
        recomRecordRecord.setRecomReason(referralReasons.stream().collect(Collectors.joining(",")));
        recomRecordRecord.setMobile(mobile);
        recomRecordRecord.setPresenteeUserId(presenteeUserId);
        recomRecordRecord.setPostUserId(employeeDO.getSysuserId());
        recomRecordRecord.setGender(gender);
        recomRecordRecord.setEmail(email);
        candidateRecomRecordDao.insertIfNotExist(recomRecordRecord);
    }

    public int logReferralOperation(int employeeId, int userId, int position, ReferralType referralType)
            throws EmployeeException {

        int referralId = referralLogDao.createReferralLog(employeeId, userId, position, referralType.getValue());
        if (referralId == 0) {
            throw EmployeeException.EMPLOYEE_REPEAT_RECOMMEND;
        }
        return referralId;
    }

    public ReferralLog fetchReferralLog(int referralLogId) {
        return referralLogDao.fetchOneById(referralLogId);
    }

    public void claimReferralCard(UserUserDO userUserDO, ReferralLog referralLog) throws EmployeeException {

        if (!referralLogDao.claim(referralLog, userUserDO.getId())) {
            throw EmployeeException.EMPLOYEE_REPEAT_CLAIM;
        }

        JobApplication application = applicationDao.getByUserIdAndPositionId(referralLog.getReferenceId(),
                referralLog.getPositionId());
        if (application != null) {

            Timestamp updateTime = new Timestamp(System.currentTimeMillis());
            applicationDao.updateIfNotExist(application.getId(), userUserDO.getId(), userUserDO.getName(),
                    ApplicationSource.EMPLOYEE_REFERRAL.andSource(application.getOrigin()), updateTime,
                    application.getPositionId());

            searchengineEntity.removeApplication(application.getApplierId(), application.getId(),
                    application.getApplierId(), application.getApplierName(), updateTime);
        }

        ProfileProfileRecord profileProfileRecord = profileDao.getProfileByUserId(userUserDO.getId());
        if (profileProfileRecord == null) {
            ProfileProfileRecord record = profileDao.getProfileByUserId(referralLog.getReferenceId());
            if (record != null) {
                if (profileDao.changUserId(record, userUserDO.getId()) > 0) {
                    completeness.reCalculateProfileCompleteness(record.getId());
                }
            }
        }

        int postUserId = 0;
        Query.QueryBuilder queryBuilder = new Query.QueryBuilder();
        Query query = queryBuilder.where(UserEmployee.USER_EMPLOYEE.ID.getName(), referralLog.getEmployeeId()).buildQuery();
        UserEmployeeDO userEmployeeDO = employeeDao.getEmployee(query);
        if (userEmployeeDO != null) {
            postUserId = userEmployeeDO.getSysuserId();
        } else {
            UserEmployeeDO userEmployeeDO1 = historyUserEmployeeDao.getData(query);
            if (userEmployeeDO1 != null) {
                postUserId = userEmployeeDO1.getSysuserId();
            }
        }
        if (postUserId > 0) {
            candidateRecomRecordDao.changePostUserId(postUserId, referralLog.getReferenceId(), userUserDO.getId());
        }
    }

    public ReferralLog fetchReferralLog(Integer employeeId, Integer positionId, int referenceId) {
        return referralLogDao.fetchByEmployeeIdReferenceIdUserId(employeeId, referenceId, positionId);
    }

    public List<Integer> fetchReferenceIdList(int userId) {
        UserEmployeeRecord employeeRecord = employeeDao.getActiveEmployeeByUserId(userId);
        if (employeeRecord != null) {
            return referralLogDao.fetchReferenceIdByEmployeeId(employeeRecord.getId());
        }
        return new ArrayList<>();
    }

    /**
     * 查找个人中心红包列表所需的数据
     * @param itemsRecords 红包记录
     * @return 数据对象
     */
    public HBData fetchHBData(List<HrHbItems> itemsRecords) {
        HBData data = new HBData();
        //查找职位title
        List<Integer> positionBindingIdList = itemsRecords.stream().map(HrHbItems::getBindingId).collect(Collectors.toList());
        Future<List<Record2<Integer, String>>> titleFuture = threadPool.startTast(() -> positionBindingDao.fetchPositionTitle(positionBindingIdList));

        //查找候选人姓名
        List<Integer> triggerWxUserIdList = itemsRecords.stream().map(HrHbItems::getTriggerWxuserId).collect(Collectors.toList());
        Future<Map<Integer, String>> candidateNamesFuture = threadPool.startTast(() -> wxEntity.fetchUserNamesByWxUserIdList(triggerWxUserIdList));

        //查找刮刮卡cardno
        List<Integer> itemIdList = itemsRecords.stream().map(HrHbItems::getId).collect(Collectors.toList());
        Future<List<HrHbScratchCardRecord>> cardNoFuture = threadPool.startTast(() -> scratchCardDao.fetchCardNosByItemIdList(itemIdList));

        //查找红包类型
        List<Integer> configIdList = itemsRecords.stream().map(HrHbItems::getHbConfigId).distinct().collect(Collectors.toList());
        Future<List<HrHbConfigRecord>> configListFuture = threadPool.startTast(() -> configDao.fetchByIdList(configIdList));

        Map<Integer, String> titleMap = new HashMap<>();
        try {
            List<Record2<Integer, String>> titleList = titleFuture.get();
            if (titleList != null && titleList.size() > 0) {
                titleList.forEach(integerStringRecord2 -> {
                    titleMap.put(integerStringRecord2.value1(), integerStringRecord2.value2());
                });
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        data.setTitleMap(titleMap);

        Map<Integer, String> candidateNameMap = new HashMap<>();
        try {
            candidateNameMap = candidateNamesFuture.get();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        data.setCandidateNameMap(candidateNameMap);

        Map<Integer, HrHbScratchCardRecord> cardNoMap = new HashMap<>();
        try {
            List<HrHbScratchCardRecord> cardNoList = cardNoFuture.get();
            if (cardNoList != null && cardNoList.size() > 0) {
                for (HrHbScratchCardRecord record2 : cardNoList) {
                    cardNoMap.put(record2.getHbItemId(), record2);
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        data.setCardNoMap(cardNoMap);

        Map<Integer, HrHbConfigRecord> configMap = new HashMap<>();
        try {
            List<HrHbConfigRecord> configRecordList= configListFuture.get();
            if (configRecordList != null && configRecordList.size() > 0) {
                configRecordList.forEach(hrHbConfigRecord -> {
                    configMap.put(hrHbConfigRecord.getId(), hrHbConfigRecord);
                });
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        data.setConfigMap(configMap);

        return data;
    }

    public BonusData fetchBonusData(List<ReferralEmployeeBonusRecord> referralEmployeeBonusRecordList) {
        BonusData bonusData = new BonusData();

        List<Integer> applicationIdList = referralEmployeeBonusRecordList
                .stream()
                .map(ReferralEmployeeBonusRecord::getApplicationId)
                .collect(Collectors.toList());
        List<JobApplicationRecord> applicationRecordList = applicationDao.fetchByIdList(applicationIdList);

        if (applicationRecordList != null && applicationRecordList.size() > 0) {

            List<Integer> applierIdList = applicationRecordList
                    .stream()
                    .map(JobApplicationRecord::getApplierId)
                    .collect(Collectors.toList());
            Future<Map<Integer, String>> candidateNameFuture = threadPool
                    .startTast(() -> userAccountEntity.fetchUserName(applierIdList));

            List<Integer> positionIdList = applicationRecordList
                    .stream()
                    .map(JobApplicationRecord::getPositionId)
                    .collect(Collectors.toList());
            Future<List<JobPosition>> positionTitleFuture = threadPool
                    .startTast(() -> positionDao.fetchPosition(positionIdList));

            List<Integer> appIdList = applicationRecordList
                    .stream()
                    .map(JobApplicationRecord::getId)
                    .collect(Collectors.toList());
            Future<List<HrOperationRecord>> hiredFuture = threadPool
                    .startTast(()
                            -> operationRecordDao.fetchLastOperationByAppIdListAndSate(appIdList,
                            Constant.RECRUIT_STATUS_HIRED));

            try {
                Map<Integer, String> candidateMap = new HashMap<>();
                Map<Integer, String> userNameMap = candidateNameFuture.get();
                userNameMap.forEach((key, value) -> {
                    Optional<JobApplicationRecord> optional = applicationRecordList
                            .stream()
                            .filter(jobApplicationRecord -> jobApplicationRecord.getApplierId().equals(key))
                            .findAny();
                    if (optional.isPresent()) {
                        candidateMap.put(optional.get().getId(), value);
                    }
                });
                bonusData.setCandidateMap(candidateMap);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }

            Map<Integer, String> positionTitleMap = new HashMap<>();
            try {
                List<JobPosition> positionList = positionTitleFuture.get();
                if (positionIdList != null && positionList.size() > 0) {
                    applicationRecordList.forEach(jobApplicationRecord -> {
                        Optional<JobPosition> positionOptional = positionList
                                .stream()
                                .filter(jobPosition -> jobPosition.getId().equals(jobApplicationRecord.getPositionId()))
                                .findAny();
                        if (positionOptional.isPresent()) {
                            positionTitleMap.put(jobApplicationRecord.getId(), positionOptional.get().getTitle());
                        }
                    });
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
            bonusData.setPositionTitleMap(positionTitleMap);

            Map<Integer, Long> employmentDateMap = new HashMap<>();
            try {
                List<HrOperationRecord> operationRecordList = hiredFuture.get();
                if (operationRecordList != null && operationRecordList.size() > 0) {
                    operationRecordList.forEach(operation -> {
                        employmentDateMap.put(operation.getAppId().intValue(), operation.getOptTime().getTime());
                    });
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
            bonusData.setEmploymentDateMap(employmentDateMap);
        }

        List<Integer> stageIdList = referralEmployeeBonusRecordList
                .stream()
                .map(ReferralEmployeeBonusRecord::getBonusStageDetailId)
                .collect(Collectors.toList());

        Future<List<ReferralPositionBonusStageDetailRecord>> stageDetailFuture = threadPool
                .startTast(() -> stageDetailDao.fetchByIdList(stageIdList));
        Map<Integer, ReferralPositionBonusStageDetailRecord> stageDetailRecordMap = new HashMap<>();
        try {
            List<ReferralPositionBonusStageDetailRecord> stageDetailRecordList = stageDetailFuture.get();
            if (stageDetailRecordList != null && stageDetailRecordList.size() > 0) {
                stageDetailRecordList
                        .forEach(referralPositionBonusStageDetailRecord
                                -> stageDetailRecordMap
                                .put(referralPositionBonusStageDetailRecord.getId(),
                                        referralPositionBonusStageDetailRecord));
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        bonusData.setStageDetailMap(stageDetailRecordMap);

        return bonusData;
    }
}
