package com.moseeker.useraccounts.service.impl.radar;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.moseeker.baseorm.dao.candidatedb.CandidatePositionDao;
import com.moseeker.baseorm.dao.candidatedb.CandidateShareChainDao;
import com.moseeker.baseorm.dao.candidatedb.CandidateTemplateShareChainDao;
import com.moseeker.baseorm.dao.hrdb.HrCompanyDao;
import com.moseeker.baseorm.dao.hrdb.HrOperationRecordDao;
import com.moseeker.baseorm.dao.hrdb.HrWxWechatDao;
import com.moseeker.baseorm.dao.jobdb.JobApplicationDao;
import com.moseeker.baseorm.dao.jobdb.JobPositionDao;
import com.moseeker.baseorm.dao.referraldb.ReferralConnectionChainDao;
import com.moseeker.baseorm.dao.referraldb.ReferralConnectionLogDao;
import com.moseeker.baseorm.dao.referraldb.ReferralLogDao;
import com.moseeker.baseorm.dao.referraldb.ReferralSeekRecommendDao;
import com.moseeker.baseorm.dao.userdb.UserEmployeeDao;
import com.moseeker.baseorm.dao.userdb.UserUserDao;
import com.moseeker.baseorm.dao.userdb.UserWxUserDao;
import com.moseeker.baseorm.db.hrdb.tables.pojos.HrOperationRecord;
import com.moseeker.baseorm.db.hrdb.tables.records.HrOperationRecordRecord;
import com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication;
import com.moseeker.baseorm.db.referraldb.tables.pojos.ReferralLog;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralConnectionChainRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralConnectionLogRecord;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralSeekRecommendRecord;
import com.moseeker.baseorm.db.userdb.tables.records.UserEmployeeRecord;
import com.moseeker.baseorm.db.userdb.tables.records.UserUserRecord;
import com.moseeker.baseorm.db.userdb.tables.records.UserWxUserRecord;
import com.moseeker.baseorm.redis.RedisClient;
import com.moseeker.common.constants.AppId;
import com.moseeker.common.constants.Constant;
import com.moseeker.common.constants.ConstantErrorCodeMessage;
import com.moseeker.common.constants.KeyIdentifier;
import com.moseeker.common.providerutils.ExceptionUtils;
import com.moseeker.entity.Constant.ApplicationSource;
import com.moseeker.entity.EmployeeEntity;
import com.moseeker.thrift.gen.common.struct.BIZException;
import com.moseeker.thrift.gen.dao.struct.candidatedb.CandidatePositionDO;
import com.moseeker.thrift.gen.dao.struct.candidatedb.CandidateShareChainDO;
import com.moseeker.thrift.gen.dao.struct.candidatedb.CandidateTemplateShareChainDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrOperationRecordDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrWxWechatDO;
import com.moseeker.thrift.gen.dao.struct.jobdb.JobApplicationDO;
import com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserUserDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserWxUserDO;
import com.moseeker.thrift.gen.referral.struct.*;
import com.moseeker.useraccounts.exception.UserAccountException;
import com.moseeker.useraccounts.service.Neo4jService;
import com.moseeker.useraccounts.service.ReferralRadarService;
import com.moseeker.useraccounts.service.constant.RadarStateEnum;
import com.moseeker.useraccounts.service.constant.ReferralProgressEnum;
import com.moseeker.useraccounts.service.constant.ReferralTypeEnum;
import com.moseeker.useraccounts.service.impl.ReferralTemplateSender;
import com.moseeker.useraccounts.service.impl.vo.RadarConnectResult;
import com.moseeker.useraccounts.service.impl.vo.RadarUserInfo;
import com.moseeker.useraccounts.utils.WxUseridEncryUtil;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author cjm
 * @date 2018-12-19 10:22
 **/
@Service
public class ReferralRadarServiceImpl implements ReferralRadarService {

    @Autowired
    private Environment env;
    @Autowired
    private UserUserDao userUserDao;
    @Autowired
    private HrCompanyDao companyDao;
    @Autowired
    private HrWxWechatDao wechatDao;
    @Autowired
    private Neo4jService neo4jService;
    @Resource(name = "cacheClient")
    private RedisClient redisClient;
    @Autowired
    private EmployeeEntity employeeEntity;
    @Autowired
    private UserWxUserDao wxUserDao;
    @Autowired
    private JobPositionDao positionDao;
    @Autowired
    private JobApplicationDao jobApplicationDao;
    @Autowired
    private UserEmployeeDao userEmployeeDao;
    @Autowired
    private ReferralTemplateSender templateHelper;
    @Autowired
    private ReferralTypeFactory referralTypeFactory;
    @Autowired
    private CandidateShareChainDao shareChainDao;
    @Autowired
    private CandidatePositionDao candidatePositionDao;
    @Autowired
    private ReferralConnectionChainDao connectionChainDao;
    @Autowired
    private ReferralConnectionLogDao connectionLogDao;
    @Autowired
    private HrOperationRecordDao hrOperationRecordDao;
    @Autowired
    private CandidateTemplateShareChainDao templateShareChainDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final Integer CHAIN_LIMIT = 4;


    @Override
    public String getRadarCards(ReferralCardInfo cardInfo) {
        logger.info("ReferralCardInfo:{}", cardInfo);
        // 获取指定时间前十分钟内的职位浏览人
        List<CandidateTemplateShareChainDO> shareChainDOS = templateShareChainDao.getRadarCards(cardInfo.getTimestamp());
        if(shareChainDOS.size() == 0){
            throw UserAccountException.REFERRAL_SHARE_CHAIN_NONEXISTS;
        }
        // 获取浏览人的userId
        Set<Integer> beRecomUserIds = shareChainDOS.stream().map(CandidateTemplateShareChainDO::getPresenteeUserId).collect(Collectors.toSet());
        // 将员工过滤掉，获取职位浏览人中非员工的userId
        getUnEmployeeUserIds(beRecomUserIds);
        if(beRecomUserIds.size() == 0){
            throw UserAccountException.REFERRAL_SHARE_CHAIN_NONEXISTS;
        }
        // 后边需要用到员工头像和昵称，在这里一并查出来
        Set<Integer> allUsers = new HashSet<>(beRecomUserIds);
        allUsers.add(cardInfo.getUserId());
        // 将过滤后的员工id对应员工信息，用于后续数据组装
        HrWxWechatDO hrWxWechatDO = wechatDao.getHrWxWechatByCompanyId(cardInfo.getCompanyId());
        List<UserWxUserDO> userUserDOS = wxUserDao.getWXUsersByUserIds(allUsers, hrWxWechatDO.getId());
        Map<Integer, UserWxUserDO> idUserMap = userUserDOS.stream().collect(Collectors.toMap(UserWxUserDO::getSysuserId, userWxUserDO->userWxUserDO));
        // 获取十分钟内转发的职位
        List<Integer> positionIds = shareChainDOS.stream().map(CandidateTemplateShareChainDO::getPositionId).distinct().collect(Collectors.toList());
        List<JobPositionDO> jobPositions = positionDao.getPositionListWithoutStatus(positionIds);
        // 将职位id和职位映射，用于后续数据组装
        Map<Integer, JobPositionDO> idPositionMap = jobPositions.stream().collect(Collectors.toMap(JobPositionDO::getId, jobPositionDO -> jobPositionDO));
        // 过滤掉员工已处理过的候选人
        List<CandidateTemplateShareChainDO> handledRecords = shareChainDOS.stream().filter(record -> (record.getType() != 0)).collect(Collectors.toList());
        // 通过职位id和userid获取职位转发记录
        List<CandidatePositionDO> candidatePositionDOS = candidatePositionDao.fetchRecentViewedByUserIdsAndPids(beRecomUserIds, positionIds);
        candidatePositionDOS = filterHandledCandidate(candidatePositionDOS, handledRecords);
        List<JSONObject> cards = new ArrayList<>();
        int startIndex = (cardInfo.getPageNumber() - 1) * cardInfo.getPageSize();
        for(int i = startIndex; i < candidatePositionDOS.size() && i < cardInfo.getPageNumber() * cardInfo.getPageSize();i++){
            CandidatePositionDO candidatePositionDO = candidatePositionDOS.get(i);
            if(candidatePositionDO != null){
                // 构造单个职位浏览人的卡片
                cards.add(doCreateCard(cardInfo, candidatePositionDO, idPositionMap.get(candidatePositionDO.getPositionId()), shareChainDOS, idUserMap));
            }
        }
        logger.info("getRadarCards:{}", JSON.toJSONString(cards));
        return JSON.toJSONString(cards);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String inviteApplication(ReferralInviteInfo inviteInfo) {
        logger.info("inviteInfo:{}", inviteInfo);
        JSONObject result = new JSONObject();
        // 先查询之前是否存在，是否已完成，如果是员工触发则生成连连看链路，遍历每个员工入库
        ReferralConnectionLogRecord connectionLogRecord = connectionLogDao.fetchChainLogRecord(inviteInfo.getUserId(), inviteInfo.getEndUserId(), inviteInfo.getPid());
        // 查询最短路径
        List<Integer> shortestChain = neo4jService.fetchShortestPath(inviteInfo.getUserId(), inviteInfo.getEndUserId(), inviteInfo.getCompanyId());
        // 只有两度和三度的情况下才会产生连连看链路
        boolean isChainLimit = shortestChain.size() >= (CHAIN_LIMIT-1) && shortestChain.size() <= CHAIN_LIMIT;
        int chainId = 0;
        if(isChainLimit && (connectionLogRecord == null || connectionLogRecord.getState() == 1)){
            // 如果之前该职位没有连接过连连看，生成一条最短链路记录
            chainId = doInsertConnection(connectionLogRecord, shortestChain, inviteInfo);
        }
        // 组装连连看链路返回数据
        Set<Integer> userIds = new HashSet<>(shortestChain);
        HrWxWechatDO hrWxWechatDO = wechatDao.getHrWxWechatByCompanyId(inviteInfo.getCompanyId());
        List<UserWxUserDO> userUserDOS = wxUserDao.getWXUsersByUserIds(userIds, hrWxWechatDO.getId());
        Map<Integer, UserWxUserDO> idUserMap = userUserDOS.stream().collect(Collectors.toMap(UserWxUserDO::getSysuserId, userWxUserDO->userWxUserDO));
        result.put("chain", doInitRadarUsers(shortestChain, idUserMap));
        // 发送消息模板
        boolean isSent = sendInviteTemplate(inviteInfo, hrWxWechatDO, userUserDOS);
        // 邀请投递后，将该候选人标记为已处理，下次该职位的候选人卡片中不再包括此人
        shareChainDao.updateTypeByIds(getUpdateCandidateIds(inviteInfo));
        templateShareChainDao.updateHandledRadarCardTypeByIds(inviteInfo, 1);
        result.put("notified", isSent ? 1 : 0);
        int degree = shortestChain.size()-1;
        result.put("degree", degree >= 0 ? degree : 0);
        result.put("chain_id", chainId);
        logger.info("inviteApplication:{}", JSON.toJSONString(result));
        return JSON.toJSONString(result);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void ignoreCurrentViewer(ReferralInviteInfo ignoreInfo) throws BIZException {
        logger.info("ignoreUserId:{}", ignoreInfo.getEndUserId());
        List<CandidateTemplateShareChainDO> shareChainDOS = templateShareChainDao.getRadarCards(ignoreInfo.getTimestamp());
        if(shareChainDOS.size() == 0){
            return;
        }
        Set<Integer> beRecomUserIds = shareChainDOS.stream().map(CandidateTemplateShareChainDO::getPresenteeUserId).collect(Collectors.toSet());
        int employeeUserId = shareChainDOS.get(0).getRootUserId();
        if(ignoreInfo.getUserId() != employeeUserId){
            throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.PROGRAM_PARAM_NOTEXIST);
        }
        beRecomUserIds.add(employeeUserId);
        if(!beRecomUserIds.contains(ignoreInfo.getEndUserId())){
            throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.PROGRAM_PARAM_NOTEXIST);
        }
        templateShareChainDao.updateTypeBySendTime(ignoreInfo, 2);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String connectRadar(ConnectRadarInfo radarInfo) {
        RadarConnectResult result = new RadarConnectResult();
        ReferralConnectionLogRecord connectionLogRecord = connectionLogDao.fetchByChainId(radarInfo.getChainId());
        if(connectionLogRecord == null){
            throw UserAccountException.REFERRAL_SHARE_CHAIN_NONEXISTS;
        }
        List<ReferralConnectionChainRecord> chainRecords = connectionChainDao.fetchChainsByRootChainId(connectionLogRecord.getRootChainId());
        checkParentId(radarInfo, chainRecords, connectionLogRecord.getRootUserId());
        Set<Integer> userIds = getChainRecordsUserIds(chainRecords);
        // 检验当前参数：recomUserId/nextUserId是否在链路中
        if(!userIds.contains(radarInfo.getNextUserId()) || !userIds.contains(radarInfo.getRecomUserId())){
            throw UserAccountException.REFERRAL_SHARE_CHAIN_NONEXISTS;
        }
        ReferralConnectionChainRecord currentRecord = getCurrentChainRecord(chainRecords, radarInfo);
        // 以下三种情况，1、当前点击人是员工，2、2度反向转给1度，3、连连看之前已完成，认为该点击人是查看连连看链接状态
        // todo 1.a-b-c-b-d 2.a-c-b-d 3.当反向时如果正向没有连接认为是新记录，如果连接了认为是查看，a-b-c可以找到parentId
        // todo 但是1.a-b-d/a-c-b-d 2.a-c-d/a-b-c-d 两种情况找不到parentId，计划根据点击人和转发人还有pid查出pid传给前端
        // todo 链路完成后，parentId = -1，当为-1时查询整个链路，此方式就可以解决 d 传其他人的问题。
        Boolean isViewer = checkClickUserIsViewer(chainRecords, radarInfo, connectionLogRecord, currentRecord);
        // 处理原链路或新增链路
        int parentId;
        if(!isViewer){
            parentId = handleExtraRecord(currentRecord, connectionLogRecord.getPositionId(), radarInfo, chainRecords);
        }else {
            parentId = getParentId(radarInfo, chainRecords);
        }
        // 修改连连看是否连接完成的状态
        chainRecords = updateConnectionInfo(radarInfo, isViewer, connectionLogRecord, chainRecords);
        // 获取排好序并包括连接状态的人脉连连看链路
        List<RadarUserInfo> userChains = getOrderedChains(userIds, chainRecords, connectionLogRecord.getCompanyId());
        // 填充员工姓名
        UserEmployeeRecord userEmployee = userEmployeeDao.getActiveEmployee(connectionLogRecord.getRootUserId(), connectionLogRecord.getCompanyId());
        if(connectionLogRecord.getState() == 1){
            parentId = -1;
        }
        fillEmployeeName(userEmployee, userChains);
        result.setParent_id(parentId);
        result.setDegree(connectionLogRecord.getDegree().intValue());
        result.setPid(connectionLogRecord.getPositionId());
        result.setState(connectionLogRecord.getState().intValue());
        result.setChain(userChains);
        logger.info("connectRadar:{}", JSON.toJSONString(result));
        return JSON.toJSONString(result);
    }

    private int getParentId(ConnectRadarInfo radarInfo, List<ReferralConnectionChainRecord> chainRecords) {
        if(radarInfo.getParentId() == -1){
            return -1;
        }
        for(ReferralConnectionChainRecord chainRecord : chainRecords){
            if(chainRecord.getRecomUserId() == radarInfo.getRecomUserId() && radarInfo.getNextUserId() == chainRecord.getNextUserId()){
                return chainRecord.getId();
            }
        }
        for(ReferralConnectionChainRecord chainRecord : chainRecords){
            if(chainRecord.getNextUserId() == radarInfo.getNextUserId() && chainRecord.getState() == 1){
                return chainRecord.getId();
            }
        }
        throw UserAccountException.REFERRAL_CHAIN_NONEXISTS;
    }

    @Override
    public String checkEmployee(CheckEmployeeInfo checkInfo) throws BIZException {
        JSONObject result = new JSONObject();
        int parentChainId = checkInfo.getParentChainId();
        int pid = checkInfo.getPid();
        int recomUserId = checkInfo.getRecomUserId();
        if(parentChainId != 0){
            CandidateShareChainDO shareChainDO = shareChainDao.getRecordById(parentChainId);
            if(shareChainDO == null){
                throw UserAccountException.REFERRAL_CHAIN_NONEXISTS;
            }
            if(shareChainDO.getPresenteeUserId() != checkInfo.getRecomUserId()){
                throw UserAccountException.REFERRAL_CHAIN_NONEXISTS;
            }
            recomUserId = shareChainDO.getRootRecomUserId();
        }
        UserEmployeeRecord employeeRecord = userEmployeeDao.getActiveEmployeeByUserId(recomUserId);
        if(employeeRecord == null){
            result.put("employee", 0);
            logger.info("起始推荐人非员工RecomUserId:{}", checkInfo.getRecomUserId());
            logger.info("checkEmployee:{}", JSON.toJSONString(result));
            return JSON.toJSONString(result);
        }
        int companyId = employeeRecord.getCompanyId();
        JobPositionDO jobPositionDO = positionDao.getJobPositionById(pid);
        if(jobPositionDO == null){
            throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.POSITION_DATA_DELETE_FAIL);
        }
        if(companyId != jobPositionDO.getCompanyId()){
            throw UserAccountException.COMPANY_DATA_EMPTY;
        }
        HrWxWechatDO hrWxWechatDO = wechatDao.getHrWxWechatByCompanyId(companyId);
        UserWxUserRecord wxUserRecord = wxUserDao.getWxUserByUserIdAndWechatId(recomUserId, hrWxWechatDO.getId());
        result.put("employee", 1);
        RadarUserInfo userInfo = new RadarUserInfo();
        userInfo.setUid(recomUserId);
        userInfo.setName(employeeRecord.getCname());
        userInfo.setAvatar(wxUserRecord.getHeadimgurl());
        result.put("user", userInfo);
        logger.info("connectRadar:{}", JSON.toJSONString(result));
        return JSON.toJSONString(result);
    }

    @Override
    public void saveTenMinuteCandidateShareChain(ReferralCardInfo cardInfo) {
        long flag = redisClient.setnx(AppId.APPID_ALPHADOG.getValue(), KeyIdentifier.TEN_MINUTE_TEMPLATE.toString(),
                String.valueOf(cardInfo.getUserId()), String.valueOf(cardInfo.getCompanyId()), "1");
        if(flag == 0){
            return;
        }
        logger.info("ReferralCardInfo:{}", cardInfo);
        templateHelper.sendTenMinuteTemplate(cardInfo);
    }

    @Override
    public String getProgressByOne(ReferralProgressQueryInfo progressQuery) {
        int applyId = 0;
        int progress = progressQuery.getProgress();
        JobApplication jobApplication = jobApplicationDao.fetchOneById(applyId);
        checkApplyExists(jobApplication, progressQuery);
        List<HrOperationRecordDO> hrOperationRecords = hrOperationRecordDao.getHrOperationDOByAppid(applyId);
        int factProgress = jobApplication.getAppTplId();
        JSONObject result = new JSONObject();
        if(checkIsNormal(factProgress, progress, hrOperationRecords)){
            result.put("abnormal", 0);
            return JSON.toJSONString(result);
        }
        int queryAppid = jobApplication.getAppTplId();


        int companyId = progressQuery.getCompanyId();
        int positionId = progressQuery.getPid();
        int presenteeUserId = progressQuery.getPresenteeUserId();
        int recomType = progressQuery.getRecomType();
        int userId = progressQuery.getUserId();

        return null;
    }

    private boolean checkIsNormal(int factProgress, int progress, List<HrOperationRecordDO> hrOperationRecordDOS) {
        int lastProgress = factProgress;
        if(factProgress == ReferralProgressEnum.FAILED.getProgress()){
            for(HrOperationRecordDO hrOperationRecordDO : hrOperationRecordDOS){
                if(hrOperationRecordDO.getOperateTplId() != 4){
                    lastProgress = hrOperationRecordDO.getOperateTplId();
                    break;
                }
            }
        }
        ReferralProgressEnum last = ReferralProgressEnum.getEnumByProgress(lastProgress);
        ReferralProgressEnum current = ReferralProgressEnum.getEnumByProgress(progress);
        return last.getOrder() >= current.getOrder();
    }

    private void checkApplyExists(JobApplication jobApplication, ReferralProgressQueryInfo progressQuery) {
        if(jobApplication == null){
            return;
        }
        if(jobApplication.getApplierId() != progressQuery.getUserId()){
            return;
        }
    }

    @Override
    public String getProgressBatch(ReferralProgressInfo progressInfo) throws BIZException {
        UserEmployeeRecord employeeRecord = userEmployeeDao.getActiveEmployeeByUserId(progressInfo.getUserId());
        if(employeeRecord == null){
            return "";
        }
        String queryName = progressInfo.getUsername();
        int startIndex = (progressInfo.getPageNum() - 1) * progressInfo.getPageSize();
        List<JobApplicationDO> jobApplicationDOS = jobApplicationDao.getApplyByRecomUserIdAndCompanyId(progressInfo.getUserId(), progressInfo.getCompanyId(),
                startIndex, progressInfo.getPageSize());
        List<Integer> applyIds = jobApplicationDOS.stream().map(JobApplicationDO::getId).distinct().collect(Collectors.toList());
        List<Integer> applierUserIds = jobApplicationDOS.stream().map(JobApplicationDO::getApplierId).distinct().collect(Collectors.toList());
        List<Integer> recomUserIds = jobApplicationDOS.stream().map(JobApplicationDO::getRecommenderUserId).distinct().collect(Collectors.toList());
        HrWxWechatDO hrWxWechatDO = wechatDao.getHrWxWechatByCompanyId(progressInfo.getCompanyId());
        // todo neo4j 查
//        List<Object> applierDegrees = new ArrayList<>();
        Map<String, Object> applierDegrees = new HashMap<>();
        List<Integer> applyPids = jobApplicationDOS.stream().map(JobApplicationDO::getPositionId).distinct().collect(Collectors.toList());
        Set<Integer> allUserIds = new HashSet<>();
        allUserIds.addAll(applierUserIds);
        allUserIds.addAll(recomUserIds);
        Map<Integer, UserUserRecord> allUserMap = getUserMap(allUserIds);
        Map<Integer, JobPositionDO> positionMap = getPositionIdMap(applyPids);
        Map<Integer, List<HrOperationRecordRecord>> hrOperationMap = hrOperationRecordDao.getHrOperationMapByApplyIds(applyIds);
        int progress = progressInfo.getProgress();
        List<JSONObject> result = new ArrayList<>();
        AbstractReferralTypeHandler handler;
        Map<Integer, JSONObject> referralTypeMap = new HashMap<>();
        // todo 根据推荐类型将list分开，查出认领状态，评价状态等
        for(ReferralTypeEnum referralTypeEnum : ReferralTypeEnum.values()){
            handler = referralTypeFactory.getHandlerByType(referralTypeEnum.getType());
            JSONObject referralSingleTypeMap = handler.getReferralTypeMap(employeeRecord, jobApplicationDOS);
            referralTypeMap.put(referralTypeEnum.getType(), referralSingleTypeMap);
        }

        if(StringUtils.isEmpty(queryName)){
            // todo 根据类别查全部的
            for(JobApplicationDO jobApplicationDO : jobApplicationDOS){

                ReferralTypeEnum referralTypeEnum = ReferralTypeEnum.getReferralTypeByApplySource(jobApplicationDO.getOrigin());

                handler = referralTypeFactory.getHandlerByType(referralTypeEnum.getType());

                JobPositionDO jobPositionDO = positionMap.get(jobApplicationDO.getPositionId());

                UserUserRecord applier = allUserMap.get(jobApplicationDO.getApplierId());

                List<HrOperationRecordRecord> hrOperations = hrOperationMap.get(jobApplicationDO.getId());

                JSONObject singleTypeMap = referralTypeMap.get(referralTypeEnum.getType());

                JSONObject card = handler.createApplyCard(jobApplicationDO, jobPositionDO, applier, hrOperations, singleTypeMap);

                handler.postProcessAfterCreateCard(card, applierDegrees);

                result.add(card);
            }
        }else {
            // todo 根据类别查该姓名的申请记录
            for(JobApplicationDO jobApplicationDO : jobApplicationDOS){

            }
        }
        return JSON.toJSONString(result);
    }

    private Map<Integer, UserUserRecord> getUserMap(Set<Integer> applierUserIds) {
        List<Integer> list = new ArrayList<>(applierUserIds);
        List<UserUserRecord> userUsers = userUserDao.fetchByIdList(list);
        Map<Integer, UserUserRecord> map = new HashMap<>();
        for(UserUserRecord userUserRecord : userUsers){
            map.put(userUserRecord.getId(), userUserRecord);
        }
        return map;
    }

    private Map<Integer, JobPositionDO> getPositionIdMap(List<Integer> applyPids) {
        List<JobPositionDO> jobPositions = positionDao.getPositionListWithoutStatus(applyPids);
        Map<Integer, JobPositionDO> map = new HashMap<>();
        for(JobPositionDO jobPositionDO : jobPositions){
            map.put(jobPositionDO.getId(), jobPositionDO);
        }
        return map;
    }


    private List<CandidatePositionDO> filterHandledCandidate(List<CandidatePositionDO> candidatePositionDOS, List<CandidateTemplateShareChainDO> handledRecords) {
        List<CandidatePositionDO> filteredCandidateDOs = new ArrayList<>();
        for(CandidatePositionDO candidatePositionDO : candidatePositionDOS){
            boolean flag = true;
            for(int i=0;i<handledRecords.size() && flag;i++){
                CandidateTemplateShareChainDO shareChainDO = handledRecords.get(i);
                if(candidatePositionDO.getPositionId() == shareChainDO.getPositionId()
                        && candidatePositionDO.getUserId() == shareChainDO.getPresenteeUserId()){
                    flag = false;
                }
            }
            if(flag){
                filteredCandidateDOs.add(candidatePositionDO);
            }
        }
        return filteredCandidateDOs;
    }

    private List<Integer> getUpdateCandidateIds(ReferralInviteInfo inviteInfo) {
        List<Integer> updateIds = new ArrayList<>();
        // 分两步，将share_chain中状态改掉，将template_share_chain状态改掉
        List<CandidateTemplateShareChainDO> templateShareChainDOS = templateShareChainDao.getRadarCards(inviteInfo.getTimestamp());
        for(CandidateTemplateShareChainDO shareChainDO : templateShareChainDOS){
            if(shareChainDO.getPresenteeUserId() == inviteInfo.getEndUserId() && shareChainDO.getPositionId() == inviteInfo.getPid()){
                updateIds.add(shareChainDO.getId());
            }
        }
        return updateIds;

    }

    private void checkParentId(ConnectRadarInfo radarInfo, List<ReferralConnectionChainRecord> chainRecords, Integer rootUserId) {
        if(radarInfo.getParentId() == 0){
            if(radarInfo.getRecomUserId() != rootUserId){
                logger.info("==========parentId为0时，链路不存在");
                throw UserAccountException.REFERRAL_SHARE_CHAIN_NONEXISTS;
            }
        }
        for(ReferralConnectionChainRecord chainRecord : chainRecords){
            if(radarInfo.getParentId() == chainRecord.getId()){
                if(radarInfo.getRecomUserId() != chainRecord.getNextUserId()){
                    throw UserAccountException.REFERRAL_SHARE_CHAIN_NONEXISTS;
                }
                break;
            }
        }
    }

    private List<ReferralConnectionChainRecord> filterNotLinkedChain(List<ReferralConnectionChainRecord> chainRecords, Byte radarState) {
        List<ReferralConnectionChainRecord> linkedRecords = chainRecords.stream().filter(record -> record.getState() == 1).collect(Collectors.toList());
        if(radarState == 1){
            return linkedRecords;
        }else {
            return chainRecords;
        }
    }

    private ReferralConnectionChainRecord getCurrentChainRecord(List<ReferralConnectionChainRecord> chainRecords, ConnectRadarInfo radarInfo) {
        ReferralConnectionChainRecord currentRecord = null;
        for(ReferralConnectionChainRecord chainRecord : chainRecords){
            if(chainRecord.getRecomUserId() == radarInfo.getRecomUserId() && radarInfo.getNextUserId() == chainRecord.getNextUserId()){
                currentRecord = chainRecord;
                break;
            }
        }
        return currentRecord;
    }

    private boolean checkClickUserIsViewer(List<ReferralConnectionChainRecord> chainRecords, ConnectRadarInfo radarInfo, ReferralConnectionLogRecord connectionLogRecord, ReferralConnectionChainRecord currentRecord) {
        if(connectionLogRecord.getState() == 1){
            return true;
        }
        if(currentRecord != null && currentRecord.getState() == 1){
            return true;
        }
        boolean isViewer = false;
        for(ReferralConnectionChainRecord chainRecord : chainRecords){
            if(chainRecord.getRecomUserId() == radarInfo.getNextUserId() && chainRecord.getNextUserId() == radarInfo.getRecomUserId()){
                //如果是反向连接，不插入新记录，认为是查看连连看的，不做数据库增删改操作
                isViewer = checkCorrectReverse(chainRecord, radarInfo, chainRecords);
                break;
            }else if(radarInfo.getNextUserId() == connectionLogRecord.getRootUserId()){
                // 如果点击人是rootuser，认为是查看连连看的，不做数据库增删改操作
                isViewer = true;
                break;
            }
        }
        return isViewer;
    }

    /**
     * 检验是否为 a-b-c-b-d或a-c-b-c-d这两种链路
     * @param
     * @author  cjm
     * @date  2018/12/23
     * @return
     */
    private boolean checkCorrectReverse(ReferralConnectionChainRecord chainRecord, ConnectRadarInfo radarInfo, List<ReferralConnectionChainRecord> chainRecords) {
        if(chainRecord.getState() == 1){
            return true;
        }
        for(ReferralConnectionChainRecord chainRecord1 : chainRecords){
            if(chainRecord1.getNextUserId() == radarInfo.getNextUserId() && chainRecord1.getRecomUserId() == radarInfo.getRecomUserId()) {
                if(chainRecord.getState() == 0 && chainRecord1.getState() == 1){
                    return true;
                }
            }
        }
        return false;
    }

    private int handleExtraRecord(ReferralConnectionChainRecord currentRecord, int positionId,
                                   ConnectRadarInfo radarInfo, List<ReferralConnectionChainRecord> chainRecords) {
        if(currentRecord == null){
            currentRecord = insertExtraRecord(radarInfo, chainRecords);
            chainRecords.add(currentRecord);
            logger.info("addConnection，userId:{}，endUserId:{}", radarInfo.getRecomUserId(), radarInfo.getNextUserId());
            try {
                neo4jService.addConnRelation(radarInfo.getRecomUserId(), radarInfo.getNextUserId(), currentRecord.getId(), positionId);
            }catch (Exception e){
                logger.error("neo4j添加关系失败，radarInfo.getRecomUserId:{}, radarInfo.getNextUserId:{}, extraRecord.getId:{}",
                        radarInfo.getRecomUserId(), radarInfo.getNextUserId(), currentRecord.getId());
            }
        }else {
            if(currentRecord.getState() != 1){
                // 已有链路，修改连接状态
                currentRecord.setState((byte)1);
                currentRecord.setParentId(radarInfo.getParentId());
                currentRecord.setClickTime(new Timestamp(System.currentTimeMillis()));
                connectionChainDao.updateRecord(currentRecord);
            }
        }
        return currentRecord.getId();
    }

    private List<ReferralConnectionChainRecord> updateConnectionInfo(ConnectRadarInfo radarInfo, Boolean isViewer, ReferralConnectionLogRecord connectionLogRecord, List<ReferralConnectionChainRecord> chainRecords) {
        // 更新连连看总链路当前状态
        boolean needUpdate = false;
        if(!isViewer){
            needUpdate = updateConnectionLogState(radarInfo, connectionLogRecord, chainRecords);
            // 如果是连连看链路连接顺序发生变化，当连接完成时，将链路之外已连接的链路设为未连接
            chainRecords = updateChangedConnectionChain(radarInfo, needUpdate, connectionLogRecord, chainRecords);
        }
        // 如果连接已完成，过滤掉连接状态不为1的连连看
        chainRecords = filterNotLinkedChain(chainRecords, connectionLogRecord.getState());
        if(needUpdate){
            if(radarInfo.getNextUserId() == connectionLogRecord.getEndUserId()){
                connectionLogRecord.setDegree((byte)chainRecords.size());
            }
            connectionLogRecord.setUpdateTime(null);
            connectionLogDao.updateRecord(connectionLogRecord);
        }
        return chainRecords;
    }

    private boolean updateConnectionLogState(ConnectRadarInfo radarInfo, ReferralConnectionLogRecord connectionLogRecord, List<ReferralConnectionChainRecord> chainRecords) {
        boolean needUpdate = false;
        // 更新degree
        if(radarInfo.getNextUserId() == connectionLogRecord.getEndUserId()){
            if(connectionLogRecord.getState() != RadarStateEnum.Finished.getState()){
                needUpdate = true;
                connectionLogRecord.setState((byte) RadarStateEnum.Finished.getState());
                connectionLogRecord.setDegree((byte)chainRecords.size());
            }
        }else {
            if(connectionLogRecord.getState() != RadarStateEnum.Connecting.getState()){
                needUpdate = true;
                connectionLogRecord.setState((byte)RadarStateEnum.Connecting.getState());
            }
        }
        return needUpdate;
    }

    private List<ReferralConnectionChainRecord> updateChangedConnectionChain(ConnectRadarInfo radarInfo, boolean needUpdate,
                                                                             ReferralConnectionLogRecord connectionLogRecord,
                                                                             List<ReferralConnectionChainRecord> chainRecords) {
        int radarState = connectionLogRecord.getState();
        if(radarState != 1){
            return chainRecords;
        }
        int parentId = 0;
        // 实际的连接路径下ids
        List<Integer> factChainRecordIds = new ArrayList<>();
        for(ReferralConnectionChainRecord chainRecord : chainRecords){
            // 找出候选人所在记录
            if(connectionLogRecord.getEndUserId().equals(chainRecord.getNextUserId()) && chainRecord.getState() == 1){
                parentId = chainRecord.getParentId();
                factChainRecordIds.add(chainRecord.getId());
                break;
            }
        }
        // 连接完成后，筛选出需要显示的连连看路径
        factChainRecordIds = getChainRecordIdsByRecurrence(parentId, factChainRecordIds, chainRecords);
        // 所有已连接的记录
        List<ReferralConnectionChainRecord> linkedRecords = chainRecords.stream().filter(record -> record.getState() == 1).collect(Collectors.toList());
        List<Integer> linkedIds = linkedRecords.stream().map(ReferralConnectionChainRecord::getId).collect(Collectors.toList());
        linkedIds.removeAll(factChainRecordIds);
        if(radarInfo.getNextUserId() == connectionLogRecord.getEndUserId() && needUpdate) {
            // 如果用户点击之前连接未完成，当本次连接完成时，将链路之外已连接的链路设为未连接
            connectionChainDao.updateStateByIds(linkedIds);
        }
        List<ReferralConnectionChainRecord> factConnectionRecords = new ArrayList<>();
        for(ReferralConnectionChainRecord chainRecord : linkedRecords){
            if(factChainRecordIds.contains(chainRecord.getId())){
                factConnectionRecords.add(chainRecord);
            }
        }
        return factConnectionRecords;
    }

    private List<Integer> getChainRecordIdsByRecurrence(int parentId, List<Integer> chainRecordIds, List<ReferralConnectionChainRecord> chainRecords) {
        for(ReferralConnectionChainRecord chainRecord : chainRecords){
            if(chainRecord.getId() == parentId){
                chainRecordIds.add(chainRecord.getId());
                if(chainRecord.getParentId() == 0){
                    return chainRecordIds;
                }else {
                    return getChainRecordIdsByRecurrence(chainRecord.getParentId(), chainRecordIds, chainRecords);
                }
            }
        }
        logger.info("====================应该不会走到这");
        return chainRecordIds;
    }

    private void fillEmployeeName(UserEmployeeRecord employee, List<RadarUserInfo> userChains) {
        if(employee == null){
            throw UserAccountException.USEREMPLOYEES_EMPTY;
        }
        for(RadarUserInfo userInfo : userChains){
            if(userInfo.getUid().equals(employee.getSysuserId())){
                userInfo.setName(employee.getCname());
                break;
            }
        }
    }

    /**
     * 获取排序后的连连看链路
     *
     * @param userIds 用户id
     * @param chainRecords 连连看链路记录
     * @param companyId 公司id
     * @return 组装前端需要展示的数据
     */
    private List<RadarUserInfo> getOrderedChains(Set<Integer> userIds, List<ReferralConnectionChainRecord> chainRecords, Integer companyId) {
        HrWxWechatDO hrWxWechatDO = wechatDao.getHrWxWechatByCompanyId(companyId);
        List<UserWxUserDO> userDOS = wxUserDao.getWXUsersByUserIds(userIds, hrWxWechatDO.getId());
        List<RadarUserInfo> userChains = new ArrayList<>();
        List<ReferralConnectionChainRecord> linkedChain = getLinkedList(chainRecords);

        for(UserWxUserDO userDO : userDOS){
            RadarUserInfo userInfo = new RadarUserInfo();
            // 初始化连连看信息
            userInfo = userInfo.initFromChainsRecord(userDO, chainRecords);
            // 填充连连看排序
            userInfo = userInfo.fillNodesFromChainsRecord(userDO, chainRecords);
            userChains.add(userInfo);
        }
        return userChains;
    }

    private List<ReferralConnectionChainRecord> getLinkedList(List<ReferralConnectionChainRecord> chainRecords) {
        List<ReferralConnectionChainRecord> linkedChain = new ArrayList<>();
        for(ReferralConnectionChainRecord chainRecord : chainRecords){
            if(chainRecord.getState() == 1){
                linkedChain.add(chainRecord);
            }
        }
        return linkedChain;
    }

    private ReferralConnectionChainRecord insertExtraRecord(ConnectRadarInfo radarInfo, List<ReferralConnectionChainRecord> chainRecords) {
        Timestamp current = new Timestamp(System.currentTimeMillis());
        ReferralConnectionChainRecord newChainRecord = new ReferralConnectionChainRecord();
        newChainRecord.setRecomUserId(radarInfo.getRecomUserId());
        newChainRecord.setNextUserId(radarInfo.getNextUserId());
        newChainRecord.setParentId(radarInfo.getParentId());
        newChainRecord.setClickTime(current);
        newChainRecord.setCreateTime(current);
        newChainRecord.setUpdateTime(current);
        newChainRecord.setRootParentId(chainRecords.get(0).getRootParentId());
        newChainRecord.setState((byte)1);
        return connectionChainDao.insertRecord(newChainRecord);
    }

    private Set<Integer> getChainRecordsUserIds(List<ReferralConnectionChainRecord> chainRecords) {
        Set<Integer> userIds = chainRecords.stream().map(ReferralConnectionChainRecord::getRecomUserId).collect(Collectors.toSet());
        userIds.addAll(chainRecords.stream().map(ReferralConnectionChainRecord::getNextUserId).collect(Collectors.toSet()));
        return userIds;
    }

    private List<RadarUserInfo> doInitRadarUsers(List<Integer> shortestChain, Map<Integer, UserWxUserDO> idUserMap) {
        // 最短路径的userChains信息
        List<RadarUserInfo> userChains = new ArrayList<>();
        for(Integer userId : shortestChain){
            RadarUserInfo userInfo = new RadarUserInfo();
            userChains.add(userInfo.initFromUserWxUser(idUserMap.get(userId)));
        }
        return userChains;
    }

    private int doInsertConnection(ReferralConnectionLogRecord connectionLogRecord, List<Integer> shortestChain, ReferralInviteInfo inviteInfo) {
        if(connectionLogRecord == null){
            // 插入连连看链路记录
            int rootParentId = doCreateConnectionChainRecords(shortestChain);
            // 反填后入库
            connectionLogRecord = doCreateConnectionLogRecord(rootParentId, inviteInfo, shortestChain.size());
        }
        return connectionLogRecord.getId();
    }

    private void fillParentChainId(List<ReferralConnectionChainRecord> connectionChainRecords, int rootParentId) {
        for(int i=0;i<connectionChainRecords.size();i++){
            ReferralConnectionChainRecord connectionChainRecord = connectionChainRecords.get(i);
            int parentId;
            if(i == 0){
                parentId = 0;
                connectionChainRecord.setRootParentId(connectionChainRecord.getId());
                connectionChainRecord.setParentId(parentId);
                continue;
            }
            parentId = connectionChainRecords.get(i-1).getId();
            connectionChainRecord.setRootParentId(rootParentId);
            connectionChainRecord.setParentId(parentId);
        }
    }

    private int doCreateConnectionChainRecords(List<Integer> shortestChain) {
        Timestamp current = new Timestamp(System.currentTimeMillis());
        List<ReferralConnectionChainRecord> connectionChainRecords = new ArrayList<>();
        for(int i=0;i<shortestChain.size()-1;i++){
            ReferralConnectionChainRecord connectionChainRecord = new ReferralConnectionChainRecord();
            connectionChainRecord.setNextUserId(shortestChain.get(i+1));
            connectionChainRecord.setRecomUserId(shortestChain.get(i));
            // 这里要保证一条链路生成时间是相同的，在连连看连接时需要获取该原始路径
            connectionChainRecord.setCreateTime(current);
            connectionChainRecord.setUpdateTime(current);
            connectionChainRecords.add(connectionChainRecord);
        }
        connectionChainRecords = connectionChainDao.insertRecords(connectionChainRecords);
        int rootParentId = connectionChainRecords.get(0).getId();
        // 填充parentId, rootParentId
        fillParentChainId(connectionChainRecords, rootParentId);
        connectionChainDao.updateRecords(connectionChainRecords);
        return rootParentId;
    }

    private ReferralConnectionLogRecord doCreateConnectionLogRecord(int rootChainId, ReferralInviteInfo inviteInfo, int degree) {
        ReferralConnectionLogRecord connectionLogRecord = new ReferralConnectionLogRecord();
        connectionLogRecord.setRootChainId(rootChainId);
        connectionLogRecord.setRootUserId(inviteInfo.getUserId());
        connectionLogRecord.setPositionId(inviteInfo.getPid());
        connectionLogRecord.setEndUserId(inviteInfo.getEndUserId());
        connectionLogRecord.setCompanyId(inviteInfo.getCompanyId());
        connectionLogRecord.setState((byte)0);
        connectionLogRecord.setDegree((byte)(degree - 1));
        connectionLogRecord = connectionLogDao.insertRecord(connectionLogRecord);
        return connectionLogRecord;
    }

    /**
     * 邀请投递发送消息模板
     * @param  inviteInfo 邀请投递相关参数
     * @param hrWxWechatDO 微信号
     * @author  cjm
     * @date  2018/12/13
     * @return  是否发送成功
     */
    private boolean sendInviteTemplate(ReferralInviteInfo inviteInfo, HrWxWechatDO hrWxWechatDO, List<UserWxUserDO> userWxUserDOS) {
        try{
            UserWxUserDO userWxUserDO = getWxUser(inviteInfo.getEndUserId(), userWxUserDOS);
            if(userWxUserDO == null){
                return false;
            }
            UserEmployeeDO employee = employeeEntity.getCompanyEmployee(inviteInfo.getUserId(), inviteInfo.getCompanyId());
            JobPositionDO jobPosition = positionDao.getJobPositionById(inviteInfo.getPid());
            HrCompanyDO hrCompanyDO = companyDao.getCompanyById(inviteInfo.getCompanyId());
            JSONObject inviteTemplateVO = initInviteTemplateVO(jobPosition, hrCompanyDO, employee);
            String redirectUrl = env.getProperty("template.redirect.url.invite").replace("{}", String.valueOf(inviteInfo.getPid()))
                    + "?wechat_signature=" + hrWxWechatDO.getSignature() + "&recom=" + WxUseridEncryUtil.encry(employee.getSysuserId(), 10) + "&psc=0";
            String requestUrl = env.getProperty("message.template.delivery.url").replace("{}", hrWxWechatDO.getAccessToken());
            Map<String, Object> response = templateHelper.sendTemplate(hrWxWechatDO, userWxUserDO.getOpenid(), inviteTemplateVO, requestUrl, redirectUrl);
            return "0".equals(String.valueOf(response.get("errcode")));
        }catch (Exception e){
            logger.info("发送邀请模板消息errmsg:{}", e.getMessage());
        }
        return false;
    }

    private UserWxUserDO getWxUser(int endUserId, List<UserWxUserDO> userWxUserDOS) {
        for(UserWxUserDO userWxUserDO : userWxUserDOS){
            if(userWxUserDO.getSysuserId() == endUserId){
                return userWxUserDO;
            }
        }
        return null;
    }

    private JSONObject initInviteTemplateVO(JobPositionDO jobPosition, HrCompanyDO hrCompanyDO, UserEmployeeDO employee) {
        JSONObject inviteTemplateVO = new JSONObject();
        DateTime dateTime = DateTime.now();
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String current = dateFormat.format(dateTime.toDate());
        String title = "内推大使【%s】邀请您投递简历，不要错过这个内推机会哦~";
        String templateTile = String.format(title, employee.getCname());
        inviteTemplateVO.put("first", templateTile);
        inviteTemplateVO.put("keyWord1", jobPosition.getTitle());
        inviteTemplateVO.put("keyWord2", hrCompanyDO.getName());
        inviteTemplateVO.put("keyWord3", current);
        inviteTemplateVO.put("remark", "点击查看职位详情并投递简历");
        inviteTemplateVO.put("templateId", Constant.REFERRAL_INVITE_APPLICATION);
        return inviteTemplateVO;
    }



    private void getUnEmployeeUserIds(Set<Integer> beRecomUserIds) {
        // 查找浏览人中的员工
        List<UserEmployeeDO> userEmployeeDOS = userEmployeeDao.getUserEmployeeForidList(beRecomUserIds);
        // 获取员工的userId
        Set<Integer> userEmployeeIds = userEmployeeDOS.stream().map(UserEmployeeDO::getId).collect(Collectors.toSet());
        // 将员工过滤掉
        beRecomUserIds.removeAll(userEmployeeIds);
    }

    private JSONObject doCreateCard(ReferralCardInfo cardInfo, CandidatePositionDO candidatePositionDO, JobPositionDO jobPosition,
                                    List<CandidateTemplateShareChainDO> shareChainDOS, Map<Integer, UserWxUserDO> idUserMap) {
        JSONObject card = new JSONObject();
        // 查找来自【】转发
        int recomUser = getRecomUser(candidatePositionDO, jobPosition, shareChainDOS);
        // 组装该粉丝信息
        RadarUserInfo user = doInitUser(idUserMap, cardInfo.getUserId(), candidatePositionDO.getUserId(), cardInfo.getCompanyId());
        List<RadarUserInfo> chain = new ArrayList<>();
        // 链路第一个放员工信息
        chain.add(doInitEmployee(idUserMap, cardInfo));
        // 递归找到转发链路的所有被推荐人id
        List<Integer> chainBeRecomIds = getChainIdsByRecurrence(shareChainDOS, cardInfo, candidatePositionDO);
        for(Integer beRecomId : chainBeRecomIds){
            UserWxUserDO userWxUserDO = idUserMap.get(beRecomId);
            if(chain.size() == CHAIN_LIMIT){
                chain.add(user);
                break;
            }
            // 链路中的用户信息
            RadarUserInfo userInfo = new RadarUserInfo();
            chain.add(userInfo.initFromUserWxUser(userWxUserDO));
            // 如果链路人数不到限制时，已经触及到邀请的粉丝，则退出循环
            if(beRecomId == candidatePositionDO.getUserId()){
                break;
            }
        }
        card.put("position", doInitPosition(jobPosition, candidatePositionDO));
        card.put("user", user);
        card.put("recom_user", idUserMap.get(recomUser).getNickname());
        card.put("chain", chain);
        return card;
    }

    private List<Integer> getChainIdsByRecurrence(List<CandidateTemplateShareChainDO> shareChainDOS, ReferralCardInfo cardInfo, CandidatePositionDO candidatePositionDO) {
        List<Integer> chainBeRecomIds = new ArrayList<>();
        int parentId = 0;
        int depth = 0;
        int presenteeUserId = 0;
        for(CandidateTemplateShareChainDO shareChainDO : shareChainDOS){
            if(shareChainDO.getRootUserId() == cardInfo.getUserId() && shareChainDO.getPresenteeUserId() == candidatePositionDO.getUserId()
                && shareChainDO.getPositionId() == candidatePositionDO.getPositionId()){
                presenteeUserId = shareChainDO.getPresenteeUserId();
                if(depth < shareChainDO.getDepth()) {
                    depth = shareChainDO.getDepth();
                    parentId = shareChainDO.getParentId();
                }
            }
        }
        chainBeRecomIds.add(presenteeUserId);
        chainBeRecomIds = getChainIdsByRecurrence(parentId, chainBeRecomIds, shareChainDOS);
        // 由于是反向查找的，需要倒序将degree小的放前边
        Collections.reverse(chainBeRecomIds);
        return chainBeRecomIds;
    }

    private List<Integer> getChainIdsByRecurrence(int parentId, List<Integer> chainIds, List<CandidateTemplateShareChainDO> shareChainDOS) {
        for(CandidateTemplateShareChainDO shareChainDO : shareChainDOS){
            if(shareChainDO.getId() == parentId){
                chainIds.add(shareChainDO.getPresenteeUserId());
                if(shareChainDO.getParentId() == 0){
                    return chainIds;
                }else {
                    return getChainIdsByRecurrence(shareChainDO.getParentId(), chainIds, shareChainDOS);
                }
            }
        }
        return chainIds;
    }

    private int getRecomUser(CandidatePositionDO candidatePosition, JobPositionDO jobPosition, List<CandidateTemplateShareChainDO> shareChainDOS) {
        int userId = 0;
            for(CandidateTemplateShareChainDO shareChainDO : shareChainDOS){
            if(shareChainDO.getPresenteeUserId() == candidatePosition.getUserId() && jobPosition.getId() == shareChainDO.getPositionId()){
                userId = shareChainDO.getRecomUserId();
            }
        }
        return userId;
    }

    private RadarUserInfo doInitEmployee(Map<Integer, UserWxUserDO> idUserMap, ReferralCardInfo cardInfo) {
        RadarUserInfo employee = new RadarUserInfo();
        UserWxUserDO wxUserDO = idUserMap.get(cardInfo.getUserId());
        return employee.initFromUserWxUser(wxUserDO);
    }

    /**
     * 组装链路结束的用户信息
     * @author  cjm
     * @date  2018/12/10
     * @return JSONObject
     */
    private RadarUserInfo doInitUser(Map<Integer, UserWxUserDO> idUserMap, int rootUserId, int endUserId, int companyId) {
        RadarUserInfo user = new RadarUserInfo();
        UserWxUserDO userWxUserDO = idUserMap.get(endUserId);
        user.initFromUserWxUser(userWxUserDO);
        List<Integer> shortestChain = neo4jService.fetchShortestPath(rootUserId, endUserId, companyId);
        user.setDegree(shortestChain.size()-1);
        return user;
    }

    private JSONObject doInitPosition(JobPositionDO jobPosition, CandidatePositionDO candidatePositionDO) {
        JSONObject position = new JSONObject();
        position.put("title", jobPosition.getTitle());
        position.put("pid", jobPosition.getId());
        position.put("pv", candidatePositionDO.getViewNumber());
        return position;
    }
}
