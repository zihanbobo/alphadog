package com.moseeker.useraccounts.service.impl.radar;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.moseeker.baseorm.dao.candidatedb.CandidatePositionDao;
import com.moseeker.baseorm.dao.candidatedb.CandidatePositionShareRecordDao;
import com.moseeker.baseorm.dao.candidatedb.CandidateShareChainDao;
import com.moseeker.baseorm.dao.candidatedb.CandidateTemplateShareChainDao;
import com.moseeker.baseorm.dao.hrdb.HrCompanyDao;
import com.moseeker.baseorm.dao.hrdb.HrOperationRecordDao;
import com.moseeker.baseorm.dao.hrdb.HrWxWechatDao;
import com.moseeker.baseorm.dao.jobdb.JobApplicationDao;
import com.moseeker.baseorm.dao.jobdb.JobPositionDao;
import com.moseeker.baseorm.dao.referraldb.ReferralConnectionChainDao;
import com.moseeker.baseorm.dao.referraldb.ReferralConnectionLogDao;
import com.moseeker.baseorm.dao.userdb.UserEmployeeDao;
import com.moseeker.baseorm.dao.userdb.UserUserDao;
import com.moseeker.baseorm.dao.userdb.UserWxUserDao;
import com.moseeker.baseorm.db.hrdb.tables.records.HrOperationRecordRecord;
import com.moseeker.baseorm.db.jobdb.tables.pojos.JobApplication;
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
import com.moseeker.entity.EmployeeEntity;
import com.moseeker.entity.biz.RadarUtils;
import com.moseeker.thrift.gen.common.struct.BIZException;
import com.moseeker.thrift.gen.dao.struct.candidatedb.CandidatePositionDO;
import com.moseeker.thrift.gen.dao.struct.candidatedb.CandidatePositionShareRecordDO;
import com.moseeker.thrift.gen.dao.struct.candidatedb.CandidateShareChainDO;
import com.moseeker.thrift.gen.dao.struct.candidatedb.CandidateTemplateShareChainDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO;
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
import com.moseeker.useraccounts.pojo.neo4j.UserDepthVO;
import com.moseeker.useraccounts.service.impl.vo.RadarConnectResult;
import com.moseeker.entity.pojos.RadarUserInfo;
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
import java.util.regex.Pattern;
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
    @Autowired
    protected CandidatePositionShareRecordDao positionShareRecordDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final Integer CHAIN_LIMIT = 4;

    private Pattern chinese = Pattern.compile("[\u4e00-\u9fa5]");


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
        // 本批卡片展示的候选人useIds
        List<CandidatePositionShareRecordDO> positionShareRecordDOS = getPositionShareRecordDOS(startIndex, cardInfo, candidatePositionDOS, shareChainDOS);
        List<UserDepthVO> userDepthVOS = getEndUserDegrees(candidatePositionDOS, cardInfo);
        for(int i = startIndex; i < candidatePositionDOS.size() && i < cardInfo.getPageNumber() * cardInfo.getPageSize();i++){
            CandidatePositionDO candidatePositionDO = candidatePositionDOS.get(i);
            if(candidatePositionDO != null){
                // 构造单个职位浏览人的卡片
                JSONObject card = new JSONObject();
                // 候选人信息
                RadarUserInfo user = doInitUser(idUserMap, candidatePositionDO.getUserId(), userDepthVOS);
                // 转发链路
                List<RadarUserInfo> chain = doInitRadarCardChains(idUserMap, cardInfo, candidatePositionDO, user, shareChainDOS);
                // 候选人浏览职位信息
                JSONObject position = doInitPosition(idPositionMap.get(candidatePositionDO.getPositionId()), candidatePositionDO);
                // 卡片类型相关信息
                JSONObject recomInfo = doInitRecomInfo(candidatePositionDO.getUserId(), candidatePositionDO.getPositionId(), shareChainDOS, idUserMap, positionShareRecordDOS);
                card.put("position", position);
                card.put("recom", recomInfo);
                card.put("user", user);
                card.put("chain", chain);
                cards.add(card);
            }
        }
        logger.info("getRadarCards:{}", JSON.toJSONString(cards));
        return JSON.toJSONString(cards, SerializerFeature.DisableCircularReferenceDetect);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String inviteApplication(ReferralInviteInfo inviteInfo) throws BIZException {
        logger.info("inviteInfo:{}", inviteInfo);
        JobPositionDO jobPositionDO = checkCorrectEmployee(inviteInfo);
        JSONObject result = new JSONObject();
        // 先查询之前是否存在，是否已完成，如果是员工触发则生成连连看链路，遍历每个员工入库
        ReferralConnectionLogRecord connectionLogRecord = connectionLogDao.fetchChainLogRecord(inviteInfo.getUserId(), inviteInfo.getEndUserId(), inviteInfo.getPid());
        // 查询最短路径
        List<Integer> shortestChain = neo4jService.fetchShortestPath(inviteInfo.getUserId(), inviteInfo.getEndUserId(), inviteInfo.getCompanyId());
        // 只有两度和三度的情况下才会产生连连看链路
        boolean isChainLimit = shortestChain.size() >= (CHAIN_LIMIT-1) && shortestChain.size() <= CHAIN_LIMIT;
        int chainId = 0;
        if(isChainLimit){
            // 如果之前该职位没有连接过连连看，生成一条最短链路记录
            chainId = doInsertConnection(connectionLogRecord, shortestChain, inviteInfo);
        }
        // 组装连连看链路返回数据
        Set<Integer> userIds = new HashSet<>(shortestChain);
        HrWxWechatDO hrWxWechatDO = wechatDao.getHrWxWechatByCompanyId(jobPositionDO.getCompanyId());
        List<UserWxUserDO> userUserDOS = wxUserDao.getWXUsersByUserIds(userIds, hrWxWechatDO.getId());
        Map<Integer, UserWxUserDO> idUserMap = userUserDOS.stream().collect(Collectors.toMap(UserWxUserDO::getSysuserId, userWxUserDO->userWxUserDO));
        result.put("chain", doInitRadarUsers(shortestChain, idUserMap));
        // 发送消息模板
        boolean isSent = sendInviteTemplate(inviteInfo, hrWxWechatDO, userUserDOS);
        // 邀请投递后，将该候选人标记为已处理，下次该职位的候选人卡片中不再包括此人
        CandidateShareChainDO candidateShareChainDO = shareChainDao.getLastOneByRootAndPresenteeAndPid(
                inviteInfo.getUserId(), inviteInfo.getEndUserId(), inviteInfo.getPid());
        shareChainDao.updateTypeById(candidateShareChainDO.getId());
        // type = 3 推荐ta
        templateShareChainDao.updateHandledRadarCardType(inviteInfo.getUserId(), inviteInfo.getEndUserId(), inviteInfo.getPid(),1);
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
        checkCorrectEmployee(ignoreInfo);
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

    /**
     * 该方法目前也提供其他地方复用，用于显示连连看进度，参数需满足以下条件作为查看者才可执行
     *	"recom_user_id":5283788, recomUser和nextUser都传员工userId, parentId 传-1
     * 	"chain_id":14,
     * 	"next_user_id":5283788,
     * 	"parent_id":0
     * @param radarInfo 连接人脉雷达的参数
     * @return RadarConnectResult 连连看结果
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public RadarConnectResult connectRadar(ConnectRadarInfo radarInfo) {
        long start = System.currentTimeMillis();
        RadarConnectResult result = new RadarConnectResult();
        ReferralConnectionLogRecord connectionLogRecord = connectionLogDao.fetchByChainId(radarInfo.getChainId());
        if(connectionLogRecord == null){
            throw UserAccountException.REFERRAL_CONNECTION_NONEXISTS;
        }
        List<ReferralConnectionChainRecord> originChainRecords = connectionChainDao.fetchChainsByRootChainId(connectionLogRecord.getRootChainId());
        List<ReferralConnectionChainRecord> chainRecords = originChainRecords.stream().filter(record -> record.getState() != 2).collect(Collectors.toList());
        Set<Integer> enableViewer = getChainRecordsUserIds(originChainRecords);
        ReferralConnectionChainRecord currentRecord = getCurrentChainRecord(chainRecords, radarInfo);
        // 以下三种情况，1、当前点击人是员工，2、2度反向转给1度，3、连连看之前已完成，认为该点击人是查看连连看链接状态
        boolean isViewer = checkClickUserIsViewer(chainRecords, radarInfo, connectionLogRecord, currentRecord);
        // 处理原链路或新增链路
        int parentId = radarInfo.getParentId();
        if(!isViewer){
            parentId = handleExtraRecord(currentRecord, radarInfo, chainRecords, connectionLogRecord);
        }else {
            parentId = getParentId(parentId, radarInfo, chainRecords);
        }
        // 修改连连看是否连接完成的状态
        chainRecords = updateConnectionInfo(radarInfo, isViewer, connectionLogRecord, chainRecords);

        Set<Integer> userIds = getChainRecordsUserIds(chainRecords);
        // 获取排好序并包括连接状态的人脉连连看链路
        List<RadarUserInfo> userChains = getOrderedChains(userIds, chainRecords, connectionLogRecord.getCompanyId());
        // 填充员工姓名
        UserEmployeeRecord userEmployee = userEmployeeDao.getActiveEmployee(connectionLogRecord.getRootUserId(), connectionLogRecord.getCompanyId());
        fillEmployeeName(userEmployee, userChains);
        result.setParent_id(parentId);
        result.setDegree(userChains.size()-1);
        result.setPid(connectionLogRecord.getPositionId());
        result.setState(connectionLogRecord.getState().intValue());
        result.setChain(userChains);
        result.setEnable_viewer(enableViewer);
        logger.info("connectRadar:{}", JSON.toJSONString(result));
        long end = System.currentTimeMillis();
        logger.info("连连看时长:{}", end - start);
        return result;
    }

    @Override
    public String checkEmployee(CheckEmployeeInfo checkInfo) throws BIZException {
        JSONObject result = new JSONObject();
        int recomUserId = checkInfo.getRecomUserId();
        // 获取rootUserId
        if(checkInfo.getParentChainId() != 0 && checkInfo.getParentChainId() != -1){
            CandidateShareChainDO shareChainDO = shareChainDao.getRecordById(checkInfo.getParentChainId());
            if(shareChainDO == null){
                throw UserAccountException.REFERRAL_CHAIN_NONEXISTS;
            }
            if(shareChainDO.getPresenteeUserId() != checkInfo.getRecomUserId()){
                throw UserAccountException.REFERRAL_CHAIN_NONEXISTS;
            }
            recomUserId = shareChainDO.getRootRecomUserId();
        }
        JobPositionDO jobPositionDO = positionDao.getJobPositionById(checkInfo.getPid());
        if(jobPositionDO == null){
            throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.POSITION_DATA_DELETE_FAIL);
        }
        if(!employeeEntity.isEmployee(recomUserId, jobPositionDO.getCompanyId())){
            result.put("employee", 0);
            logger.info("起始推荐人非员工RecomUserId:{}", checkInfo.getRecomUserId());
            return JSON.toJSONString(result);
        }
        if(employeeEntity.isEmployee(checkInfo.getPresenteeUserId(), jobPositionDO.getCompanyId())){
            result.put("employee", 0);
            logger.info("点击人:{}和推荐人:{}是同一集团公司下的员工", recomUserId, checkInfo.getPresenteeUserId());
            return JSON.toJSONString(result);
        }
        UserEmployeeRecord recomUser = userEmployeeDao.getActiveEmployeeByUserId(recomUserId);
        HrWxWechatDO hrWxWechatDO = wechatDao.getHrWxWechatByCompanyId(jobPositionDO.getCompanyId());
        UserWxUserRecord wxUserRecord = wxUserDao.getWxUserByUserIdAndWechatId(recomUserId, hrWxWechatDO.getId());
        result.put("employee", 1);
        RadarUserInfo userInfo = new RadarUserInfo();
        userInfo.setUid(recomUserId);
        userInfo.setName(recomUser.getCname());
        userInfo.setAvatar(wxUserRecord.getHeadimgurl());
        result.put("user", userInfo);
        logger.info("checkEmployee:{}", JSON.toJSONString(result));
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
    public String getProgressByOne(ReferralProgressQueryInfo progressQuery) throws BIZException {
        logger.info("progressQuery:{}", progressQuery);
        JobApplication jobApplication = jobApplicationDao.fetchOneById(progressQuery.getApplyId());
        checkApplyExists(jobApplication, progressQuery);
        List<HrOperationRecordRecord> hrOperationRecords = hrOperationRecordDao.getHrOperationRecordByAppid(progressQuery.getApplyId());
        HrWxWechatDO hrWxWechatDO = wechatDao.getHrWxWechatByCompanyId(progressQuery.getCompanyId());
        UserWxUserRecord userWxUserDO = wxUserDao.getWxUserByUserIdAndWechatId(progressQuery.getUserId(), hrWxWechatDO.getId());
        JobPositionDO jobPositionDO = positionDao.getJobPositionById(jobApplication.getPositionId());
        UserUserDO userUserDO = userUserDao.getUser(progressQuery.getUserId());
        int factProgress = jobApplication.getAppTplId();
        JSONObject result = new JSONObject();
        if(!checkIsNormal(factProgress, progressQuery.getProgress(), hrOperationRecords)){
            result.put("abnormal", 1);
            return JSON.toJSONString(result);
        }
        int queryOptId = jobApplication.getAppTplId();
        ReferralProgressEnum current;
        boolean refuse = false;
        if(queryOptId == ReferralProgressEnum.FAILED.getProgress()){
            refuse = true;
            queryOptId = getLastProgress(queryOptId, hrOperationRecords);
        }
        current = ReferralProgressEnum.getEnumByProgress(queryOptId);
        JSONArray progressJson = doInitProgressJson(current, hrOperationRecords, refuse);
        result.put("progress", progressJson);
        result.put("abnormal", 0);
        result.put("encourage", getEncourageByProgress(factProgress));
        result.put("avatar", userWxUserDO.getHeadimgurl());
        result.put("name", handleCandidateName(userUserDO.getName(), progressQuery.getPresenteeUserId(),
                jobApplication.getRecommenderUserId(), jobApplication.getApplierId()));
        result.put("title", jobPositionDO.getTitle());
        logger.info("result:{}", result);
        return JSON.toJSONString(result);
    }

    @Override
    public String getProgressBatch(ReferralProgressInfo progressInfo) throws BIZException {
        UserEmployeeRecord employeeRecord = userEmployeeDao.getActiveEmployeeByUserId(progressInfo.getUserId());
        if(employeeRecord == null){
            throw UserAccountException.USEREMPLOYEES_EMPTY;
        }
        List<JobApplicationDO> jobApplicationDOS = getQueryJobApplications(progressInfo);
        if(jobApplicationDOS == null || jobApplicationDOS.size() == 0){
            return "";
        }
        List<Integer> applyIds = jobApplicationDOS.stream().map(JobApplicationDO::getId).distinct().collect(Collectors.toList());
        List<Integer> applierUserIds = jobApplicationDOS.stream().map(JobApplicationDO::getApplierId).distinct().collect(Collectors.toList());
        List<Integer> recomUserIds = jobApplicationDOS.stream().map(JobApplicationDO::getRecommenderUserId).distinct().collect(Collectors.toList());
        // neo4j 查
        List<UserDepthVO> applierDegrees = neo4jService.fetchDepthUserList(progressInfo.getUserId(), progressInfo.getCompanyId(), applierUserIds);
        List<Integer> applyPids = jobApplicationDOS.stream().map(JobApplicationDO::getPositionId).distinct().collect(Collectors.toList());
        Set<Integer> allUserIds = new HashSet<>();
        allUserIds.addAll(applierUserIds);
        allUserIds.addAll(recomUserIds);
        Map<Integer, UserUserRecord> allUserMap = getUserMap(allUserIds);
        Map<Integer, JobPositionDO> positionMap = getPositionIdMap(applyPids);
        Map<Integer, List<HrOperationRecordRecord>> hrOperationMap = hrOperationRecordDao.getHrOperationMapByApplyIds(applyIds);

        List<JSONObject> result = new ArrayList<>();
        AbstractReferralTypeHandler handler;
        Map<Integer, JSONObject> referralTypeMap = new HashMap<>(1 >> 4);
        for(ReferralTypeEnum referralTypeEnum : ReferralTypeEnum.values()){
            handler = referralTypeFactory.getHandlerByType(referralTypeEnum.getType());
            JSONObject referralSingleTypeMap = handler.getReferralTypeMap(employeeRecord, jobApplicationDOS, applierDegrees);
            referralTypeMap.put(referralTypeEnum.getType(), referralSingleTypeMap);
        }
        for(JobApplicationDO jobApplicationDO : jobApplicationDOS){

            ReferralTypeEnum referralTypeEnum = ReferralTypeEnum.getReferralTypeByApplySource(jobApplicationDO.getOrigin());

            handler = referralTypeFactory.getHandlerByType(referralTypeEnum.getType());

            JobPositionDO jobPositionDO = positionMap.get(jobApplicationDO.getPositionId());

            UserUserRecord applier = allUserMap.get(jobApplicationDO.getApplierId());

            List<HrOperationRecordRecord> hrOperations = hrOperationMap.get(jobApplicationDO.getId());

            JSONObject singleTypeMap = referralTypeMap.get(referralTypeEnum.getType());

            JSONObject card = handler.createApplyCard(jobApplicationDO, jobPositionDO, applier, hrOperations, singleTypeMap);

            handler.postProcessAfterCreateCard(card, jobApplicationDO, applierDegrees);

            result.add(card);
        }
        logger.info("getProgressBatch:{}", result);
        return JSON.toJSONString(result);
    }

    @Override
    public void updateShareChainHandleType(ReferralSeekRecommendRecord record, int type) {
        int presenteeUserId = record.getPresenteeId();
        int rootUserId = record.getPostUserId();
        int positionId = record.getPositionId();
        CandidateShareChainDO candidateShareChainDO = shareChainDao.getLastOneByRootAndPresenteeAndPid(rootUserId, presenteeUserId, positionId);
        shareChainDao.updateTypeById(candidateShareChainDO.getId());
        // type = 3 推荐ta
        templateShareChainDao.updateHandledRadarCardType(rootUserId, presenteeUserId, positionId, 3);
    }

    @Override
    public void updateCandidateShareChainTemlate(ReferralSeekRecommendRecord record) {
        CandidateShareChainDO candidateShareChainDO = shareChainDao.getLastOneByRootAndPresenteeAndPid(
                record.getPostUserId(), record.getPresenteeId(), record.getPositionId());
        logger.info("candidateShareChainDO:{}", candidateShareChainDO);
        templateShareChainDao.updateRadarCardSeekRecomByChainId(candidateShareChainDO.getId(), record.getId());
    }

    @Override
    public String progressQueryKeyword(ReferralProgressInfo progressInfo) {
        UserEmployeeRecord employeeRecord = userEmployeeDao.getActiveEmployeeByUserId(progressInfo.getUserId());
        if(employeeRecord == null){
            throw UserAccountException.USEREMPLOYEES_EMPTY;
        }
        int progress = progressInfo.getProgress();
        List<JobApplicationDO> jobApplicationDOS;
        List<Integer> progressList = new ArrayList<>();
        progressList.add(progress);
        // 目前有四种操作对应已投递状态 1 被推荐人投递简历 6 hr查看简历 15 员工主动投递简历 16 候选人联系内推投递简历
        if(progress == 1){
            initApplyProgressList(progressList);
        }
        if(progress == 0){
            jobApplicationDOS = jobApplicationDao.getApplyByRecomUserIdAndCompanyId(progressInfo.getUserId(), progressInfo.getCompanyId(),
                    0, 0, false);
        }else {
            jobApplicationDOS = jobApplicationDao.getApplyByRecomUserIdAndCompanyId(progressInfo.getUserId(), progressInfo.getCompanyId(),
                    0, 0, progressList, false);
        }
        List<Integer> applierUserIds = jobApplicationDOS.stream().map(JobApplicationDO::getApplierId).distinct().collect(Collectors.toList());
        List<UserUserRecord> userUsers = userUserDao.fetchByIdList(applierUserIds);
        Set<String> names = userUsers.stream().map(UserUserRecord::getName).collect(Collectors.toSet());
        Set<String> result = new HashSet<>();
        for(String name : names){
            if(name.contains(progressInfo.getKeyword())){
                result.add(name);
            }
        }
        return JSON.toJSONString(result);
    }

    private int getParentId(int parentId, ConnectRadarInfo radarInfo, List<ReferralConnectionChainRecord> chainRecords) {
        for(ReferralConnectionChainRecord chainRecord : chainRecords){
            if(radarInfo.getRecomUserId() == chainRecord.getRecomUserId() && radarInfo.getNextUserId() == chainRecord.getNextUserId()){
                return chainRecord.getId();
            }
        }
        return parentId;
    }

    private JobPositionDO checkCorrectEmployee(ReferralInviteInfo inviteInfo) throws BIZException {
        JobPositionDO jobPositionDO = positionDao.getJobPositionById(inviteInfo.getPid());
        if(jobPositionDO == null){
            throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.POSITION_DATA_DELETE_FAIL);
        }
        if(!employeeEntity.isEmployee(inviteInfo.getUserId(), jobPositionDO.getCompanyId())){
            throw UserAccountException.EMPLOYEE_COMPANY_UNMATCH;
        }
        return jobPositionDO;
    }

    private void initApplyProgressList(List<Integer> progressList) {
        progressList.add(6);
        progressList.add(15);
        progressList.add(16);
    }

    private List<JobApplicationDO> getQueryJobApplications(ReferralProgressInfo progressInfo) {
        List<JobApplicationDO> jobApplicationDOS;
        String queryName = progressInfo.getKeyword();
        int startIndex = (progressInfo.getPageNum() - 1) * progressInfo.getPageSize();
        int progress = progressInfo.getProgress();
        List<Integer> progressList = new ArrayList<>();
        progressList.add(progress);
        // 目前有四种操作对应已投递状态 1 被推荐人投递简历 6 hr查看简历 15 员工主动投递简历 16 候选人联系内推投递简历
        if(progress == 1){
            initApplyProgressList(progressList);
        }
        if(StringUtils.isEmpty(queryName)){
            if(progress == 0){
                jobApplicationDOS = jobApplicationDao.getApplyByRecomUserIdAndCompanyId(progressInfo.getUserId(), progressInfo.getCompanyId(),
                        startIndex, progressInfo.getPageSize(), true);
            }else {
                jobApplicationDOS = jobApplicationDao.getApplyByRecomUserIdAndCompanyId(progressInfo.getUserId(), progressInfo.getCompanyId(),
                        startIndex, progressInfo.getPageSize(), progressList, true);
            }
        }else {
            List<UserUserRecord> queryNameRecords = userUserDao.fetchByName(queryName);
            List<Integer> queryNameIds = queryNameRecords.stream().map(UserUserRecord::getId).collect(Collectors.toList());
            if(progress == 0){
                jobApplicationDOS = jobApplicationDao.getApplyByRecomUserIdAndCompanyId(progressInfo.getUserId(), progressInfo.getCompanyId(),
                        queryNameIds, startIndex, progressInfo.getPageSize());
            }else {
                jobApplicationDOS = jobApplicationDao.getApplyByRecomUserIdAndCompanyId(progressInfo.getUserId(), progressInfo.getCompanyId(),
                        queryNameIds, startIndex, progressInfo.getPageSize(), progressList);
            }
        }
        return jobApplicationDOS;
    }

    private List<RadarUserInfo> doInitRadarCardChains(Map<Integer, UserWxUserDO> idUserMap, ReferralCardInfo cardInfo,
                                                      CandidatePositionDO candidatePositionDO, RadarUserInfo user,
                                                      List<CandidateTemplateShareChainDO> shareChainDOS) {
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
        return chain;
    }

    private List<UserDepthVO> getEndUserDegrees(List<CandidatePositionDO> candidatePositionDOS, ReferralCardInfo cardInfo) {
        List<Integer> endUserIds = new ArrayList<>();
        int startIndex = (cardInfo.getPageNumber() - 1) * cardInfo.getPageSize();
        for(int i = startIndex; i < candidatePositionDOS.size() && i < cardInfo.getPageNumber() * cardInfo.getPageSize();i++){
            CandidatePositionDO candidatePositionDO = candidatePositionDOS.get(i);
            if(candidatePositionDO != null){
                // 构造单个职位浏览人的卡片
                endUserIds.add(candidatePositionDO.getUserId());
            }
        }
        List<UserDepthVO> userDepthVOS = new ArrayList<>();
        if(endUserIds.size() > 0){
            userDepthVOS = neo4jService.fetchDepthUserList(cardInfo.getUserId(), cardInfo.getCompanyId(), endUserIds);
        }
        return userDepthVOS;
    }

    private List<CandidatePositionShareRecordDO> getPositionShareRecordDOS(int startIndex, ReferralCardInfo cardInfo, List<CandidatePositionDO> candidatePositionDOS, List<CandidateTemplateShareChainDO> shareChainDOS) {
        Set<Integer> shareChainIds = new HashSet<>();
        for(int i = startIndex; i < candidatePositionDOS.size() && i < cardInfo.getPageNumber() * cardInfo.getPageSize();i++){
            CandidatePositionDO candidatePositionDO = candidatePositionDOS.get(i);
            boolean flag = true;
            for(int j=0;j<shareChainDOS.size()&&flag;j++){
                CandidateTemplateShareChainDO shareChainDO = shareChainDOS.get(j);
                if(shareChainDO.getRoot2UserId() != 0
                        && shareChainDO.getPositionId() == candidatePositionDO.getPositionId()
                        && shareChainDO.getPresenteeUserId() == candidatePositionDO.getUserId()){
                    shareChainIds.add(shareChainDO.getChainId());
                    flag = false;
                }
            }
        }
        return positionShareRecordDao.fetchPositionShareByShareChainIds(shareChainIds);
    }


    private Map<Integer, UserUserRecord> getUserMap(Set<Integer> applierUserIds) {
        List<Integer> list = new ArrayList<>(applierUserIds);
        List<UserUserRecord> userUsers = userUserDao.fetchByIdList(list);
        Map<Integer, UserUserRecord> map = new HashMap<>(1>>4);
        for(UserUserRecord userUserRecord : userUsers){
            map.put(userUserRecord.getId(), userUserRecord);
        }
        return map;
    }

    private Map<Integer, JobPositionDO> getPositionIdMap(List<Integer> applyPids) {
        List<JobPositionDO> jobPositions = positionDao.getPositionListWithoutStatus(applyPids);
        Map<Integer, JobPositionDO> map = new HashMap<>(1 >> 5);
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
        int parentId = radarInfo.getParentId();
        if(parentId == 0){
            // parentId
            if(radarInfo.getRecomUserId() != connectionLogRecord.getRootUserId()){
                logger.info("==========parentId为0时，链路不存在");
                return true;
            }
        }
        if(radarInfo.getNextUserId() == connectionLogRecord.getRootUserId()) {
            // 如果点击人是rootuser，认为是查看连连看的
            return true;
        }
        if(connectionLogRecord.getState() == 1){
            // 如果连连看已完成，认为是查看连连看的
            return true;
        }
        if(currentRecord != null && currentRecord.getState() == 1){
            // 如果当前链路已连接
            return true;
        }
        Set<Integer> userIds = getChainRecordsUserIds(chainRecords);
        // 检验当前参数：recomUserId/nextUserId是否在链路中
        if(!userIds.contains(radarInfo.getNextUserId()) || !userIds.contains(radarInfo.getRecomUserId())){
            return true;
        }
        boolean isViewer = false;
        for(ReferralConnectionChainRecord chainRecord : chainRecords){
            if(chainRecord.getNextUserId() == radarInfo.getNextUserId() && chainRecord.getState() == 1){
                // 如果此次点击人已存在其他已连接的链路，则认为此次点击是查看连连看的
                isViewer = true;
                break;
            }else if(chainRecord.getRecomUserId() == radarInfo.getNextUserId() && chainRecord.getNextUserId() == radarInfo.getRecomUserId()){
                //如果是反向连接，不插入新记录，认为是查看连连看的
                isViewer = true;
                break;
            }
            if(parentId != 0 && chainRecord.getId() == parentId && chainRecord.getState() != 1){
                // 如果父链路id不为零并且连接状态为未连接，该状态可能是恶意请求从链路中某一人发起连接，此时认为是查看连连看
                isViewer = true;
                break;
            }
        }
        return isViewer;
    }

    private int handleExtraRecord(ReferralConnectionChainRecord currentRecord, ConnectRadarInfo radarInfo,
                                  List<ReferralConnectionChainRecord> chainRecords, ReferralConnectionLogRecord connectionLogRecord) {
        int rootParentId = connectionLogRecord.getRootChainId();
        int rootUserId = connectionLogRecord.getRootUserId();
        if(radarInfo.getRecomUserId() == rootUserId){
            radarInfo.setParentId(0);
        }
        checkParentId(radarInfo, chainRecords);
        if(currentRecord == null){
            currentRecord = insertExtraRecord(radarInfo, rootParentId);
            chainRecords.add(currentRecord);
            logger.info("addConnection，userId:{}，endUserId:{}", radarInfo.getRecomUserId(), radarInfo.getNextUserId());
            try {
                neo4jService.addConnRelation(radarInfo.getRecomUserId(), radarInfo.getNextUserId(), currentRecord.getId(), connectionLogRecord.getPositionId());
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

    private void checkParentId(ConnectRadarInfo radarInfo, List<ReferralConnectionChainRecord> chainRecords) {
        if(radarInfo.getParentId() == 0){
            return;
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

    private List<ReferralConnectionChainRecord> updateConnectionInfo(ConnectRadarInfo radarInfo, Boolean isViewer, ReferralConnectionLogRecord connectionLogRecord,
                                                                     List<ReferralConnectionChainRecord> chainRecords) {
        // 更新连连看总链路当前状态
        boolean needUpdateLog = false;
        if(!isViewer){
            needUpdateLog = updateConnectionLogState(radarInfo, connectionLogRecord);
            // 根据指定规则过滤链路
            chainRecords = filterChain(connectionLogRecord.getRootUserId(), radarInfo, chainRecords);
        }
        if(needUpdateLog){
            connectionLogRecord.setUpdateTime(null);
            connectionLogDao.updateRecord(connectionLogRecord);
        }
        return chainRecords;
    }

    private List<ReferralConnectionChainRecord> filterChain(int rootUserId, ConnectRadarInfo radarInfo, List<ReferralConnectionChainRecord> chainRecords) {
        List<ReferralConnectionChainRecord> newChains = new ArrayList<>();
        List<ReferralConnectionChainRecord> updateChains = new ArrayList<>();
        List<Integer> allUserIds = new ArrayList<>();
        List<Integer> newUserIds = new ArrayList<>();
        allUserIds.add(rootUserId);
        chainRecords = RadarUtils.getOrderedChainRecords(chainRecords);
        for (ReferralConnectionChainRecord chainRecord : chainRecords) {
            addIfNotExist(allUserIds, chainRecord.getNextUserId());
        }
        boolean flag = false;
        for(Integer userId : allUserIds){
            if(userId != radarInfo.getRecomUserId()){
                if(!flag){
                    addIfNotExist(newUserIds, userId);
                }
            }else {
                addIfNotExist(newUserIds, userId);
                flag = true;
            }
            if(flag && userId == radarInfo.getNextUserId()){
                addIfNotExist(newUserIds, userId);
                flag = false;
            }
        }
        int parentId = 0;
        for(int i=0;i<newUserIds.size()-1;i++){
            for(ReferralConnectionChainRecord chainRecord : chainRecords){
                if(chainRecord.getRecomUserId().intValue() == newUserIds.get(i) && chainRecord.getNextUserId().intValue() == newUserIds.get(i + 1)){
                    chainRecord.setParentId(parentId);
                    newChains.add(chainRecord);
                    parentId = chainRecord.getId();
                    updateChains.add(chainRecord);
                }
            }

        }
        for(ReferralConnectionChainRecord origin : chainRecords){
            boolean unExist = true;
            for(int i=0;i<newChains.size()&&unExist;i++){
                ReferralConnectionChainRecord chainRecord = newChains.get(i);
                if(chainRecord.getNextUserId().intValue() == origin.getNextUserId()
                        && chainRecord.getRecomUserId().intValue() == origin.getRecomUserId()){
                    unExist = false;
                }
            }
            if(unExist){
                origin.setState((byte)2);
                origin.setUpdateTime(null);
                updateChains.add(origin);
            }
        }
        connectionChainDao.updateRecords(updateChains);
        return newChains;
    }

    private void addIfNotExist(List<Integer> newUserIds, Integer userId) {
        if(!newUserIds.contains(userId)){
            newUserIds.add(userId);
        }
    }


    private boolean updateConnectionLogState(ConnectRadarInfo radarInfo, ReferralConnectionLogRecord connectionLogRecord) {
        boolean needUpdate = false;
        // 更新degree
        if(radarInfo.getNextUserId() == connectionLogRecord.getEndUserId()){
            if(connectionLogRecord.getState() != RadarStateEnum.Finished.getState()){
                needUpdate = true;
                connectionLogRecord.setState((byte) RadarStateEnum.Finished.getState());
            }
        }else {
            if(connectionLogRecord.getState() != RadarStateEnum.Connecting.getState()){
                needUpdate = true;
                connectionLogRecord.setState((byte)RadarStateEnum.Connecting.getState());
            }
        }
        return needUpdate;
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
        for(UserWxUserDO userDO : userDOS){
            RadarUserInfo userInfo = new RadarUserInfo();
            // 初始化连连看信息
            userInfo = userInfo.initFromChainsRecord(userDO, chainRecords);
            // 填充连连看排序
            userInfo = userInfo.fillNodesFromChainsRecord(userDO, chainRecords);
            userChains.add(userInfo.getDegree(), userInfo);
        }
        Collections.sort(userChains);
        return userChains;
    }

    private ReferralConnectionChainRecord insertExtraRecord(ConnectRadarInfo radarInfo, int rootParentId) {
        Timestamp current = new Timestamp(System.currentTimeMillis());
        ReferralConnectionChainRecord newChainRecord = new ReferralConnectionChainRecord();
        newChainRecord.setRecomUserId(radarInfo.getRecomUserId());
        newChainRecord.setNextUserId(radarInfo.getNextUserId());
        newChainRecord.setParentId(radarInfo.getParentId());
        newChainRecord.setClickTime(current);
        newChainRecord.setCreateTime(current);
        newChainRecord.setUpdateTime(current);
        newChainRecord.setRootParentId(rootParentId);
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
            connectionLogRecord = doCreateConnectionLogRecord(rootParentId, inviteInfo);
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

    private ReferralConnectionLogRecord doCreateConnectionLogRecord(int rootChainId, ReferralInviteInfo inviteInfo) {
        ReferralConnectionLogRecord connectionLogRecord = new ReferralConnectionLogRecord();
        connectionLogRecord.setRootChainId(rootChainId);
        connectionLogRecord.setRootUserId(inviteInfo.getUserId());
        connectionLogRecord.setPositionId(inviteInfo.getPid());
        connectionLogRecord.setEndUserId(inviteInfo.getEndUserId());
        connectionLogRecord.setCompanyId(inviteInfo.getCompanyId());
        connectionLogRecord.setState((byte)0);
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
        String title = "内推大使【%s】邀请您投递简历，不要错过这个内推机会哦~\n";
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

    private JSONObject doInitRecomInfo(int endUserId, int positionId, List<CandidateTemplateShareChainDO> shareChainDOS,
                                       Map<Integer, UserWxUserDO> idUserMap, List<CandidatePositionShareRecordDO> positionShareRecordDOS) {
        // 查找来自【】转发
        int recomUser = 0;
        JSONObject recomInfo = new JSONObject();
        int shareChainId = 0;
        for(CandidateTemplateShareChainDO shareChainDO : shareChainDOS){
            if(shareChainDO.getPresenteeUserId() == endUserId && positionId == shareChainDO.getPositionId() && shareChainDO.getRoot2UserId() != 0){
                recomUser = shareChainDO.getRoot2UserId();
                shareChainId = shareChainDO.getChainId();
            }
        }
        if(recomUser != 0){
            boolean isFromWxGroup = false;
            for(CandidatePositionShareRecordDO positionShareRecordDO : positionShareRecordDOS){
                if(positionShareRecordDO.getShareChainId() == shareChainId){
                    isFromWxGroup = positionShareRecordDO.getClickFrom() == 1;
                }
            }
            recomInfo.put("nickname", idUserMap.get(recomUser).getNickname());
            recomInfo.put("from_wx_group", isFromWxGroup ? 1 : 0);
        }
        // 查找卡片推荐类型是 邀请投递 还是 推荐TA
        int type = 0;
        int seekReferralId = 0;
        for(CandidateTemplateShareChainDO shareChainDO : shareChainDOS){
            if(shareChainDO.getPositionId() == positionId && shareChainDO.getPresenteeUserId() == endUserId){
                if(shareChainDO.getSeekReferralId() != 0){
                    type = 1;
                    seekReferralId = shareChainDO.getSeekReferralId();
                    break;
                }
            }
        }
        recomInfo.put("type", type);
        recomInfo.put("referral_id", seekReferralId);
        return recomInfo;
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
            if(shareChainDO.getChainId() == parentId){
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
    private RadarUserInfo doInitUser(Map<Integer, UserWxUserDO> idUserMap, int endUserId, List<UserDepthVO> userDepthVOS) {
        RadarUserInfo user = new RadarUserInfo();
        UserWxUserDO userWxUserDO = idUserMap.get(endUserId);
        user.initFromUserWxUser(userWxUserDO);
        int degree = 0;
        for (UserDepthVO userDepthVO : userDepthVOS) {
            if(userDepthVO.getUserId() == endUserId){
                degree = userDepthVO.getDepth();
                break;
            }
        }
        user.setDegree(degree);
        return user;
    }

    private JSONObject doInitPosition(JobPositionDO jobPosition, CandidatePositionDO candidatePositionDO) {
        JSONObject position = new JSONObject();
        position.put("title", jobPosition.getTitle());
        position.put("pid", jobPosition.getId());
        position.put("pv", candidatePositionDO.getViewNumber());
        return position;
    }


    private String handleCandidateName(String name, int presenteeUserId, int recommenderUserId, int applierId) {
        if(presenteeUserId == recommenderUserId || applierId == presenteeUserId){
            return name;
        }else {
            boolean hasChinese = chinese.matcher(name).find();
            if(hasChinese){
                return name.substring(0, 1) + "**";
            }else {
                String trim = " ";
                if(name.replaceAll(trim, "").length() != name.length()){
                    return name.substring(0, name.indexOf(trim)) + "**";
                }
                return name.substring(0, 1) + "**";
            }
        }
    }

    private String getEncourageByProgress(int factProgress) {
        ReferralProgressEnum fact = ReferralProgressEnum.getEnumByProgress(factProgress);
        if(fact.getProgress() == ReferralProgressEnum.FILTERED.getProgress()){
            return "恭喜您通过初筛，好的开始是成功的一半！";
        }else if(fact.getProgress() == ReferralProgressEnum.INTERVIEWED.getProgress()){
            return "恭喜您通过面试，胜利就在不远处！";
        }else if(fact.getProgress() == ReferralProgressEnum.ENTRY.getProgress()){
            return "欢迎优秀的你加入我们！";
        }else if(fact.getProgress() == ReferralProgressEnum.FAILED.getProgress()){
            return "您已进入我司人才库，谢谢您的关注！";
        }
        return "";
    }

    private JSONArray doInitProgressJson(ReferralProgressEnum current, List<HrOperationRecordRecord> hrOperationRecords, boolean refuse) {
        JSONArray progressJson = new JSONArray();
        for(ReferralProgressEnum progressEnum : ReferralProgressEnum.getEnumList()){
            JSONObject oneProgress = new JSONObject();
            if(current.getOrder() > progressEnum.getOrder()){
                oneProgress.put("progress_status", progressEnum.getProgress());
                oneProgress.put("progress_pass", 1);
                oneProgress.put("datetime", getLastOptTime(progressEnum.getProgress(), hrOperationRecords));
                progressJson.add(oneProgress);
            }else if(current.getOrder() == progressEnum.getOrder()) {
                oneProgress.put("progress_status", progressEnum.getProgress());
                oneProgress.put("progress_pass", refuse ? 2 : 1);
                oneProgress.put("datetime", getLastOptTime(current.getProgress(), hrOperationRecords));
                progressJson.add(oneProgress);
            }else{
                break;
            }
        }
        JSONArray result = new JSONArray();
        for(int i=progressJson.size()-1;i>=0;i--){
            result.add(progressJson.get(i));
        }
        return result;
    }

    private String getLastOptTime(int progress, List<HrOperationRecordRecord> hrOperationRecords) {
        long optTime = 0;
        if(progress == 1){
            List<Integer> progressList = new ArrayList<>();
            progressList.add(1);
            initApplyProgressList(progressList);
            for(HrOperationRecordRecord hrOperationRecordDO : hrOperationRecords){
                if(progressList.contains(hrOperationRecordDO.getOperateTplId())){
                    optTime = hrOperationRecordDO.getOptTime().getTime();
                    break;
                }
            }
        }else {
            for(HrOperationRecordRecord hrOperationRecordDO : hrOperationRecords){
                if(progress == hrOperationRecordDO.getOperateTplId()){
                    optTime = hrOperationRecordDO.getOptTime().getTime();
                    break;
                }
            }
        }
        DateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        return sdf.format(new Date(optTime));
    }

    private boolean checkIsNormal(int factProgress, int progress, List<HrOperationRecordRecord> hrOperationRecordDOS) {
        if(progress == ReferralProgressEnum.FAILED.getProgress()){
            return false;
        }
        int lastProgress = factProgress;
        if(factProgress == ReferralProgressEnum.FAILED.getProgress()){
            lastProgress = getLastProgress(lastProgress, hrOperationRecordDOS);

        }
        ReferralProgressEnum last = ReferralProgressEnum.getEnumByProgress(lastProgress);
        ReferralProgressEnum current = ReferralProgressEnum.getEnumByProgress(progress);
        if(current == null){
            throw UserAccountException.REFERRAL_PROGRESS_ERROR;
        }
        return last.getOrder() >= current.getOrder();
    }

    /**
     * 当前申请进度为4时，需要获取上一个进度
     * @param lastProgress 上一个进度值
     * @param hrOperationRecordDOS hr操作记录s
     * @return 返回查询到的上个进度
     */
    private int getLastProgress(int lastProgress, List<HrOperationRecordRecord> hrOperationRecordDOS) {
        for(HrOperationRecordRecord hrOperationRecordDO : hrOperationRecordDOS){
            if(hrOperationRecordDO.getOperateTplId() != 4){
                lastProgress = hrOperationRecordDO.getOperateTplId();
                break;
            }
        }
        return lastProgress;
    }

    private void checkApplyExists(JobApplication jobApplication, ReferralProgressQueryInfo progressQuery) throws BIZException {
        if(jobApplication == null){
            throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.APPLICATION_NOTEXIST);
        }
        if(jobApplication.getApplierId() != progressQuery.getUserId()){
            throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.APPLICATION_STATE_ERROR);
        }
    }

}
