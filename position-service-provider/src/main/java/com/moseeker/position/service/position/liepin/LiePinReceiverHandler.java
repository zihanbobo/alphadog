package com.moseeker.position.service.position.liepin;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.moseeker.baseorm.dao.hrdb.HRThirdPartyAccountDao;
import com.moseeker.baseorm.dao.hrdb.HRThirdPartyAccountHrDao;
import com.moseeker.baseorm.dao.hrdb.HRThirdPartyPositionDao;
import com.moseeker.baseorm.dao.jobdb.JobPositionCityDao;
import com.moseeker.baseorm.dao.jobdb.JobPositionDao;
import com.moseeker.baseorm.dao.jobdb.JobPositionLiepinMappingDao;
import com.moseeker.baseorm.dao.logdb.LogDeadLetterDao;
import com.moseeker.baseorm.db.hrdb.tables.HrThirdPartyAccount;
import com.moseeker.common.constants.ConstantErrorCodeMessage;
import com.moseeker.common.constants.PositionSyncVerify;
import com.moseeker.common.providerutils.ExceptionUtils;
import com.moseeker.common.util.DateUtils;
import com.moseeker.position.constants.position.LiepinPositionOperateUrl;
import com.moseeker.position.pojo.LiePinPositionVO;
import com.moseeker.position.service.appbs.PositionBS;
import com.moseeker.position.utils.EmailSendUtil;
import com.moseeker.position.utils.HttpClientUtil;
import com.moseeker.position.utils.Md5Utils;
import com.moseeker.thrift.gen.apps.positionbs.struct.ThirdPartyPosition;
import com.moseeker.thrift.gen.apps.positionbs.struct.ThirdPartyPositionForm;
import com.moseeker.thrift.gen.common.struct.BIZException;
import com.moseeker.thrift.gen.dao.struct.dictdb.DictCityLiePinDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyAccountHrDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO;
import com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionCityDO;
import com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO;
import com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionLiepinMappingDO;
import com.moseeker.thrift.gen.dao.struct.logdb.LogDeadLetterDO;
import com.rabbitmq.client.Channel;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.jooq.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 监听das中的职位操作，进行与猎聘相关的职位处理
 *
 * @author cjm
 * @date 2018-06-04 19:03
 **/
@Component
@PropertySource("classpath:common.properties")
@Transactional(rollbackFor = Exception.class)
public class LiePinReceiverHandler {

    private static Logger log = LoggerFactory.getLogger(LiePinReceiverHandler.class);

    @Autowired
    private HRThirdPartyPositionDao hrThirdPartyPositionDao;

    @Autowired
    private JobPositionDao jobPositionDao;

    @Autowired
    private LogDeadLetterDao logDeadLetterDao;

    @Autowired
    private HRThirdPartyAccountDao thirdPartyAccountDao;

    @Autowired
    private HRThirdPartyAccountHrDao hrThirdPartyDao;

    @Autowired
    private LiepinSocialPositionTransfer liepinSocialPositionTransfer;

    @Autowired
    private JobPositionLiepinMappingDao liepinMappingDao;

    @Autowired
    private PositionBS positionBS;

    @Autowired
    private JobPositionCityDao jobPositionCityDao;

    private String emailSubject = "猎聘api请求操作失败";

    /**
     * 批量处理编辑职位操作
     * 用于ats批量处理
     *
     * @param
     * @return
     * @author cjm
     * @date 2018/6/11
     */
    public boolean batchHandleLiepinEditOperation(List<Integer> ids) throws UnsupportedEncodingException {

        try {
            JSONObject liePinJsonObject = new JSONObject();

            liePinJsonObject.put("id", ids);

            String requestStr = JSONObject.toJSONString(liePinJsonObject);

            Message requestMsg = new Message(requestStr.getBytes("UTF-8"), null);

            handlerPositionLiepinEditOperation(requestMsg, null);

            return true;
        } catch (Exception e) {
            log.error("调用api批量修改职位信息时发生错误，职位ids:{}", ids);
            EmailSendUtil.sendWarnEmail("调用api批量修改职位信息时发生错误，职位ids" + ids.toString(),
                    emailSubject);
            e.printStackTrace();
        }

        return false;
    }


    @RabbitListener(queues = PositionSyncVerify.POSITION_QUEUE_EDIT, containerFactory = "rabbitListenerContainerFactoryAutoAck")
    @RabbitHandler
    public void handlerPositionLiepinEditOperation(Message message, Channel channel) {
        String msgBody = "{}";
        List<Integer> ids = null;
        try {

            msgBody = new String(message.getBody(), "UTF-8");

            log.info("===============msgBody:{}===============", msgBody);

            ids = requireValidMessage(msgBody);

            if (ids == null || ids.size() == 0) {
                return;
            }

            int positionChannel = 2;

            int positionId = ids.get(0);

            String liePinToken = getLiepinToken(positionId);

            if (StringUtils.isBlank(liePinToken)) {
                log.info("============token为空=============");
                return;
            }

            JobPositionDO jobPositionDO = null;

            log.info("==============liePinToken:{}===============", liePinToken);
            for (int id : ids) {

                positionId = id;

                // 获取das端已修改后的职位数据
                jobPositionDO = jobPositionDao.getJobPositionById(positionId);

                // 获取在仟寻填写的猎聘职位信息
                HrThirdPartyPositionDO hrThirdPartyPositionDO = hrThirdPartyPositionDao.getThirdPartyPositionById(positionId, positionChannel);

                if (hrThirdPartyPositionDO == null) {
                    log.info("==============positionId:{}填写的第三方职位信息查不到=============", positionId);
                    continue;
                }

                ThirdPartyPosition thirdPartyPosition = new ThirdPartyPosition();

                // 组装同步时需要的数据，相当于在第三方页面填写的表单数据，将不匹配字段手动映射
                BeanUtils.copyProperties(hrThirdPartyPositionDO, thirdPartyPosition);
                thirdPartyPosition.setSalaryDiscuss(hrThirdPartyPositionDO.getSalaryDiscuss() != 0);
                thirdPartyPosition.setSalaryBottom(thirdPartyPosition.getSalaryBottom() / 1000);
                thirdPartyPosition.setSalaryTop(thirdPartyPosition.getSalaryTop() / 1000);
                String occupations = hrThirdPartyPositionDO.getOccupation();
                String[] occupationsArr = occupations.split(",");
                thirdPartyPosition.setOccupation(Arrays.asList(occupationsArr));

                // 将数据组装为向猎聘请求的格式，此数据也是用户编辑后的数据
                LiePinPositionVO liePinPositionVO = liepinSocialPositionTransfer.changeToThirdPartyPosition(thirdPartyPosition, jobPositionDO, null);
                log.info("================liePinPositionVO:{}=============", liePinPositionVO);
                // 用于查询所修改的职位之前是否发布过
                List<JobPositionLiepinMappingDO> liepinMappingDOList = liepinMappingDao.getMappingDataByPid(positionId);

                // 判断编辑的城市中是否有未发布过的城市，如果有，就走一遍发布流程，职位发布中会判断如果是发布过的职位，不会重新发布
                boolean flag = true;

                // 编辑职位中的城市list
                List<JobPositionCityDO> positionCityList = jobPositionCityDao.getPositionCitysByPid(positionId);
                log.info("==============编辑城市positionCityList:{}============", positionCityList);
                // 编辑职位中的城市codelist
                List<String> cityCodesList = positionCityList.stream().map(positionCityDO -> String.valueOf(positionCityDO.getCode())).collect(Collectors.toList());
                log.info("==============编辑城市cityCodesList:{}============", cityCodesList);
                // 如果数据库不存在编辑的职位，则发布新职位
                if (null != liepinMappingDOList && liepinMappingDOList.size() > 0) {

                    // 数据库中该仟寻职位id对应的城市codes list
                    List<String> cityDbList = liepinMappingDOList.stream().map(mappingDo -> String.valueOf(mappingDo.getCityCode())).collect(Collectors.toList());
                    log.info("===============数据库中该仟寻职位id对应的城市cityDbList:{}====================", cityDbList);

                    // 数据库中该仟寻职位id对应的titlelist
                    List<String> titleDbList = liepinMappingDOList.stream().map(mappingDo -> mappingDo.getJobTitle()).collect(Collectors.toList());

                    // 将titlelist去重复
                    titleDbList = removeDuplicateTitle(titleDbList);
                    log.info("===============数据库中该仟寻职位id对应的titlelist:{}====================", titleDbList);

                    // 先判断title是否存在，不存在的话发布新职位
                    if (titleDbList.contains(jobPositionDO.getTitle())) {
                        log.info("=================title存在=====================");
                        for (String cityCode : cityCodesList) {

                            for (JobPositionLiepinMappingDO mappingDO : liepinMappingDOList) {

                                // 存在城市，并且状态正常
                                if (cityCode.equals(String.valueOf(mappingDO.getCityCode())) && mappingDO.getState() == 1) {
                                    log.info("===============存在城市，并且状态正常，修改================");
                                    // 修改
                                    editSinglePosition(liePinPositionVO, liePinToken, mappingDO);
                                    break;

                                } else if (cityCode.equals(String.valueOf(mappingDO.getCityCode())) && mappingDO.getState() == 0) {
                                    log.info("============存在城市，但是状态为下架，先上架，后修改============");
                                    // 存在城市，但是状态为下架，先上架，后修改
                                    upShelfOldSinglePosition(mappingDO, liePinToken);

                                    // 修改
                                    editSinglePosition(liePinPositionVO, liePinToken, mappingDO);
                                    break;

                                } else if (!cityCodesList.contains(String.valueOf(mappingDO.getCityCode())) && mappingDO.getState() == 1) {
                                    log.info("============如果编辑的城市中没有数据库中的该城市，并且该城市之前出于上架状态，则将其下架============");
                                    // 如果编辑的城市中没有数据库中的该城市，并且该城市之前出于上架状态，则将其下架
                                    downShelfOldSinglePosition(mappingDO, liePinToken);

                                } else if (!cityDbList.isEmpty() && !cityDbList.contains(cityCode)) {
                                    // 如果该职位数据库的发布城市中没有编辑职位中的第i个城市，判定为新城市，需要发布
                                    log.info("================如果该职位数据库的发布城市中没有编辑职位中的第i个城市，判定为新城市，需要发布================");
                                    flag = false;
                                }
                            }

                        }
                    } else {
                        //  title变化，将之前所有的下架获取所有的jobMappingIds，新的发布
                        downShelfOldPositions(liepinMappingDOList, liePinToken);

                        // 发布新title对应的职位
                        sendSyncPosition(positionId, thirdPartyPosition);
                    }

                } else {
                    // 不存在映射记录，发布职位
                    sendSyncPosition(positionId, thirdPartyPosition);
                }

                if (!flag) {
                    // 说明编辑职位中存在没有发布的城市，需要新发布职位
                    sendSyncPosition(positionId, thirdPartyPosition);
                }


            }


        } catch (Exception e) {
            this.handleTemplateLogDeadLetter(message, msgBody, e.getMessage());
            EmailSendUtil.sendWarnEmail("调用api批量修改职位信息时发生错误，职位ids" + (ids == null ? msgBody : ids.toString()),
                    emailSubject);
            log.error(e.getMessage(), e);
        }
    }

    /**
     * 批量处理职位下架
     * ats批量下架
     *
     * @param
     * @return
     * @author cjm
     * @date 2018/6/11
     */
    public boolean batchHandlerLiepinDownShelfOperation(List<Integer> ids) throws UnsupportedEncodingException {
        try {
            JSONObject liePinJsonObject = new JSONObject();

            liePinJsonObject.put("id", ids);

            String requestStr = JSONObject.toJSONString(liePinJsonObject);

            Message requestMsg = new Message(requestStr.getBytes("UTF-8"), null);

            handlerPositionLiepinDownShelfOperation(requestMsg, null);
            return true;
        } catch (Exception e) {
            log.error("==============猎聘api批量处理职位下架失败, ids:{}==============", ids);
            EmailSendUtil.sendWarnEmail("猎聘api批量处理职位下架失败" + ids.toString(), emailSubject);
            e.printStackTrace();
        }
        return false;

    }

    @RabbitListener(queues = PositionSyncVerify.POSITION_QUEUE_RESYNC, containerFactory = "rabbitListenerContainerFactoryAutoAck")
    @RabbitHandler
    public void handlerPositionLiepinReSyncOperation(Message message, Channel channel) {
        String msgBody = "{}";
        List<Integer> ids = null;
        try {
            msgBody = new String(message.getBody(), "UTF-8");

            ids = requireValidMessage(msgBody);

            if (ids == null || ids.size() == 0) {
                return;
            }

            int positionId = ids.get(0);

            // 获取hr账号在猎聘token
            String liepinToken = getLiepinToken(positionId);

            for (int id : ids) {
                List<Integer> idsList = new ArrayList<>();
                try {

                    // 通过职位id获取职位所在城市list
                    List<JobPositionCityDO> jobPositionCityList = jobPositionCityDao.getPositionCitysByPid(id);

                    // 获取职位所在城市codeList
                    List<Integer> rePublishCityCodes = jobPositionCityList.stream().map(jobPositionCityDO -> jobPositionCityDO.getCode()).collect(Collectors.toList());

                    // 通过职位id和code获取JobPositionLiepinMapping表的信息，此表存的是仟寻请求猎聘生成的职位主键id等信息的映射
                    List<JobPositionLiepinMappingDO> liepinMappingDOList = liepinMappingDao.getMappingDataByPidAndCode(id, rePublishCityCodes);

                    if(liepinMappingDOList == null || liepinMappingDOList.size() < 1){
                        log.info("===============未在猎聘发布过，不需要重新发布================");
                        continue;
                    }

                    // 过滤重新发布城市中的state已经为1的城市
                    liepinMappingDOList = filterUnneedRepublishCitys(liepinMappingDOList);

                    if (liepinMappingDOList.size() > 0) {

                        // 将需要重新发布的城市的主键id取出，用于向猎聘请求
                        idsList = liepinMappingDOList.stream().map(liepinMappingDO -> liepinMappingDO.getId()).collect(Collectors.toList());

                        List<String> requestIdsStr = liepinMappingDOList.stream().map(liepinMappingDO -> String.valueOf(liepinMappingDO.getId())).collect(Collectors.toList());

                        List<Integer> idsListDb = liepinMappingDOList.stream().map(liepinMappingDO -> liepinMappingDO.getId()).collect(Collectors.toList());

                        String requestIds = String.join(",", requestIdsStr);

                        if (StringUtils.isNotBlank(requestIds)) {

                            JSONObject liePinJsonObject = new JSONObject();

                            liePinJsonObject.put("ejob_extRefids", requestIds);

                            String httpResultJson = sendRequest2LiePin(liePinJsonObject, liepinToken, LiepinPositionOperateUrl.liepinPositionRepub);

                            log.info("===================httpResultJson:{}=====================", httpResultJson);

                            requireValidResult(httpResultJson);

                            liepinMappingDao.updateState(idsListDb, (byte) 1);

                        }
                    }
                } catch (BIZException e) {
                    liepinMappingDao.updateErrMsgBatch(positionId, e.getMessage());
                } catch (Exception e1) {
                    EmailSendUtil.sendWarnEmail("下架猎聘职位失败：" + idsList.toString(), emailSubject);
                    liepinMappingDao.updateErrMsgBatch(idsList, e1.getMessage());
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            EmailSendUtil.sendWarnEmail("调用api批量修改职位信息时发生错误，职位ids" + (ids == null ? msgBody : ids.toString()),
                    emailSubject);
            this.handleTemplateLogDeadLetter(message, msgBody, "职位操作通过api同步到猎聘失败");
        }

    }

    @RabbitListener(queues = PositionSyncVerify.POSITION_QUEUE_DELETE, containerFactory = "rabbitListenerContainerFactoryAutoAck")
    @RabbitHandler
    public void handlerPositionLiepinDeleteOperation(Message message, Channel channel) {
        handlerPositionLiepinDownShelfOperation(message, channel);
    }

    @RabbitListener(queues = PositionSyncVerify.POSITION_QUEUE_DOWNSHELF, containerFactory = "rabbitListenerContainerFactoryAutoAck")
    @RabbitHandler
    public void handlerPositionLiepinDownShelfOperation(Message message, Channel channel) {
        String msgBody = "{}";
        List<Integer> ids = null;
        try {
            msgBody = new String(message.getBody(), "UTF-8");

            ids = requireValidMessage(msgBody);

            if (ids == null || ids.size() == 0) {
                return;
            }

            int positionId = ids.get(0);

            // 获取hr账号在猎聘token
            String liepinToken = getLiepinToken(positionId);

            List<Integer> requestIds = null;

            for (int id : ids) {

                try {

                    List<JobPositionLiepinMappingDO> liepinMappingDOS = liepinMappingDao.getValidMappingDataByPid(id, (byte) 1);

                    if(liepinMappingDOS == null || liepinMappingDOS.size() < 1){
                        log.info("==============该职位没有在猎聘发布过，不需要下架==============");
                        continue;
                    }

                    requestIds = liepinMappingDOS.stream().map(liepinMappingDO -> liepinMappingDO.getId()).collect(Collectors.toList());

                    List<String> requestIdsStr = liepinMappingDOS.stream().map(liepinMappingDO -> String.valueOf(liepinMappingDO.getId())).collect(Collectors.toList());

                    if (requestIds.size() < 1) {
                        log.info("==============没有需要下架的猎聘职位==============");
                        continue;
                    }

                    // 构造请求数据
                    JSONObject liePinJsonObject = new JSONObject();

                    String requestStr = String.join(",", requestIdsStr);

                    liePinJsonObject.put("ejob_extRefids", requestStr);

                    String httpResultJson = sendRequest2LiePin(liePinJsonObject, liepinToken, LiepinPositionOperateUrl.liepinPositionEnd);

                    log.info("===================httpResultJson:{}=====================", httpResultJson);


                    // 猎聘返回code如果不是0，就抛异常
                    requireValidResult(httpResultJson);

                    liepinMappingDao.updateState(requestIds, (byte) 0);
                } catch (BIZException e) {
                    log.info("=============下架猎聘职位失败：requestIds:{},失败信息:msg:{}=================", requestIds.toString(), e.getMessage());
                    EmailSendUtil.sendWarnEmail("下架猎聘职位失败：" + requestIds.toString(), emailSubject);
                } catch (Exception e1) {
                    EmailSendUtil.sendWarnEmail("下架猎聘职位失败,职位id：" + positionId, emailSubject);
                    liepinMappingDao.updateErrMsgBatch(requestIds, e1.getMessage());
                }

            }

        } catch (Exception e) {
            EmailSendUtil.sendWarnEmail("调用api批量修改职位信息时发生错误，职位ids" + (ids == null ? msgBody : ids.toString()),
                    emailSubject);
            this.handleTemplateLogDeadLetter(message, msgBody, e.getMessage());
            log.error(e.getMessage(), e);
        }
    }

    /**
     * 取出rabbitmq发来的message
     *
     * @param
     * @return
     * @author cjm
     * @date 2018/6/13
     */
    private List<Integer> requireValidMessage(String msgBody) throws UnsupportedEncodingException {

        JSONObject jsonObject = JSONObject.parseObject(msgBody);

        log.info("职位操作的rabitmq的参数是========" + jsonObject.toJSONString());

        JSONArray positionIds = jsonObject.getJSONArray("id");

        if (positionIds == null || positionIds.isEmpty()) {
            log.info("===============传入id为空=================");
            return new ArrayList<>();
        }

        List<String> idStrs = positionIds.toJavaList(String.class);

        List<Integer> ids = new ArrayList<>();

        for (String id : idStrs) {
            if (StringUtils.isBlank(id)) {
                continue;
            }
            ids.add(Integer.parseInt(id));
        }

        if (ids.size() < 1) {
            log.info("===============传入id为空=================");
            return new ArrayList<>();
        }
        return ids;
    }

    /**
     * 通过职位id获取token
     *
     * @param
     * @return
     * @author cjm
     * @date 2018/6/13
     */
    private String getLiepinToken(int positionId) throws Exception {

        int channel = 2;

        // 获取发布人hrid
        JobPositionDO jobPositionDO = jobPositionDao.getJobPositionById(positionId);

        if (jobPositionDO == null) {
            return null;
        }

        int publisher = jobPositionDO.getPublisher();

        // 获取第三方账号和hr账号关联表数据
        HrThirdPartyAccountHrDO hrThirdDO = hrThirdPartyDao.getHrAccountInfo(publisher, channel);

        if (hrThirdDO == null) {
            return null;
        }

        int thirdAccountId = hrThirdDO.getThirdPartyAccountId();

        // 获取第三方账号token
        HrThirdPartyAccountDO thirdPartyAccountDO = thirdPartyAccountDao.getAccountById(thirdAccountId);

        if (thirdPartyAccountDO == null) {
            return null;
        }

        return thirdPartyAccountDO.getExt2();
    }

    /**
     * 获取猎聘职位信息      todo 不确定是否用得到
     *
     * @param positionId 职位id
     * @param id         liepinmapping中的主键id
     * @return
     * @author cjm
     * @date 2018/6/10
     */
    public String getLpPositionInfo(Integer positionId, Integer id) throws Exception {
        int positionChannel = 2;
        JobPositionDO jobPositionDO = jobPositionDao.getJobPositionById(positionId);
        if (jobPositionDO == null) {
            throw new Exception("职位不存在");
        }
        int publisher = jobPositionDO.getPublisher();
        log.info("===========publisher:{}===========", publisher);
        Result result = thirdPartyAccountDao.getThirdPartyAccountTokenByHrId(publisher, positionChannel);
        if (result != null && result.size() > 0) {
            String liePinToken = String.valueOf(result.getValue(0, HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.EXT2));
            String liePinUserId = String.valueOf(result.getValue(0, HrThirdPartyAccount.HR_THIRD_PARTY_ACCOUNT.EXT));
            JSONObject liePinJsonObject = new JSONObject();
            liePinJsonObject.put("ejob_extRefids", id);
            liePinJsonObject.put("usere_id", liePinUserId);
            return sendRequest2LiePin(liePinJsonObject, liePinToken, LiepinPositionOperateUrl.liepinPositionGet);
        }
        return null;
    }
    /**
     * 过滤不需要重新发布的职位，通过发布状态是否为1来确定
     * @param
     * @author  cjm
     * @date  2018/6/19
     * @return
     */
    private List<JobPositionLiepinMappingDO> filterUnneedRepublishCitys(List<JobPositionLiepinMappingDO> liepinMappingDOList) {
        List<JobPositionLiepinMappingDO> list = new ArrayList<>();
        for (JobPositionLiepinMappingDO mappingDO : liepinMappingDOList) {
            if (mappingDO.getState() == 1) {
                continue;
            }
            list.add(mappingDO);
        }
        return list;
    }

    /**
     * 编辑单个职位信息
     *
     * @param liePinToken 猎聘生成的hr账号token
     * @return
     * @author cjm
     * @date 2018/6/10
     */
    private void editSinglePosition(LiePinPositionVO liePinPositionVO, String liePinToken, JobPositionLiepinMappingDO mappingDO) throws BIZException {
        // 猎聘修改职位api必填字段
//        liePinPositionVO.setDetail_duty(liePinPositionVO.getDetail_duty());
//
//        liePinPositionVO.setDetail_require(liePinPositionVO.getDetail_require());

        liePinPositionVO.setEjob_extRefid(String.valueOf(mappingDO.getId()));

        liePinPositionVO.setEjob_id(mappingDO.getLiepinJobId());

        DictCityLiePinDO cityLiePinDO = liepinSocialPositionTransfer.getValidLiepinDictCode(mappingDO.getCityCode() + "");

        liePinPositionVO.setEjob_dq(cityLiePinDO.getCode());

        JSONObject liePinObject = (JSONObject) JSONObject.toJSON(liePinPositionVO);
        try {

            String httpResultJson = sendRequest2LiePin(liePinObject, liePinToken, LiepinPositionOperateUrl.liepinPositionEdit);

            log.info("============httpResultJson:{}===========", httpResultJson);

            requireValidResult(httpResultJson);

        } catch (BIZException e) {
            liepinMappingDao.updateErrMsg(mappingDO.getId(), e.getMessage());
            EmailSendUtil.sendWarnEmail("修改猎聘职位失败：mappingId为" + mappingDO.getId(), emailSubject);
        } catch (Exception e1) {
            EmailSendUtil.sendWarnEmail("修改猎聘职位失败：mappingId为" + mappingDO.getId(), emailSubject);
            liepinMappingDao.updateErrMsg(mappingDO.getId(), e1.getMessage());
        }
    }

    /**
     * 上架单个职位，并没有上架多个职位的接口
     *
     * @param mappingDO 数据库liepingmapping表中针对当前pid的单个职位
     * @return
     * @author cjm
     * @date 2018/6/10
     */
    private void upShelfOldSinglePosition(JobPositionLiepinMappingDO mappingDO, String liepinToken) {

        JSONObject liePinJsonObject = new JSONObject();

        liePinJsonObject.put("ejob_extRefids", mappingDO.getId());

        try {

            String httpResultJson = sendRequest2LiePin(liePinJsonObject, liepinToken, LiepinPositionOperateUrl.liepinPositionRepub);

            requireValidResult(httpResultJson);

            List<Integer> ids = new ArrayList<>();

            ids.add(mappingDO.getId());

            liepinMappingDao.updateState(ids, (byte) 1);

        } catch (BIZException e) {
            liepinMappingDao.updateErrMsg(mappingDO.getId(), e.getMessage());
            EmailSendUtil.sendWarnEmail("上架猎聘职位失败：mappingId为" + mappingDO.getId(), emailSubject);
        } catch (Exception e1) {
            EmailSendUtil.sendWarnEmail("上架猎聘职位失败：mappingId为" + mappingDO.getId(), emailSubject);
            liepinMappingDao.updateErrMsg(mappingDO.getId(), e1.getMessage());
        }
    }

    /**
     * 下架单个职位
     *
     * @param
     * @return
     * @author cjm
     * @date 2018/6/11
     */
    private void downShelfOldSinglePosition(JobPositionLiepinMappingDO jobPositionMapping, String liepinToken) {

        List<JobPositionLiepinMappingDO> list = new ArrayList<>();

        list.add(jobPositionMapping);

        downShelfOldPositions(list, liepinToken);
    }

    /**
     * 下架多个职位
     *
     * @param
     * @return
     * @author cjm
     * @date 2018/6/11
     */
    public void downShelfOldPositions(List<JobPositionLiepinMappingDO> liepinMappingDOList, String liepinToken) {

        List<String> downShelfPositonList = new ArrayList<>();

        List<Integer> downShelfPositonListDb = new ArrayList<>();

        for (JobPositionLiepinMappingDO liepinMappingDO : liepinMappingDOList) {

            int state = liepinMappingDO.getState();

            if (state == 1) {

                downShelfPositonList.add(String.valueOf(liepinMappingDO.getId()));

                downShelfPositonListDb.add(liepinMappingDO.getId());
            }
        }
        if (downShelfPositonList.size() > 0) {

            // 将所有状态为1的职位下架
            JSONObject liePinJsonObject = new JSONObject();

            String ids = String.join(",", downShelfPositonList);

            liePinJsonObject.put("ejob_extRefids", ids);

            try {
                log.info("==================title变化，将之前所有的下架获取所有的hashid，新的发布=====================");

                // 下架
                String httpResultJson = sendRequest2LiePin(liePinJsonObject, liepinToken, LiepinPositionOperateUrl.liepinPositionEnd);

                requireValidResult(httpResultJson);

                liepinMappingDao.updateState(downShelfPositonListDb, (byte) 0);

            } catch (BIZException e) {
                liepinMappingDao.updateErrMsgBatch(downShelfPositonListDb, e.getMessage());
                EmailSendUtil.sendWarnEmail("downShelfOldPositions批量下架猎聘职位失败：mappingIds为" + ids, emailSubject);
            } catch (Exception e1) {
                EmailSendUtil.sendWarnEmail("上架猎聘职位失败：mappingIds为" + ids, emailSubject);
                liepinMappingDao.updateErrMsgBatch(downShelfPositonListDb, e1.getMessage());
                log.error("===============向猎聘请求下架失败，mapping表主键ids:{}===============", ids);
            }
        }
    }

    public JSONObject requireValidResult(String httpResultJson) throws BIZException {

        if (StringUtils.isBlank(httpResultJson)) {
            throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.LIEPIN_REQUEST_RESPONSE_NULL);
        }

        JSONObject httpResult = JSONObject.parseObject(httpResultJson);

        if (null == httpResult) {

            throw ExceptionUtils.getBizException(ConstantErrorCodeMessage.LIEPIN_REQUEST_RESPONSE_NULL);

        } else if (httpResult.getIntValue("code") != 0) {

            log.info("==============httpResult:{}================", httpResult);
            throw ExceptionUtils.getBizException("{'status':-1,'message':'猎聘职位操作请求失败！" + httpResult.getString("message") + "'}");
        }
        return httpResult;
    }

    public String sendRequest2LiePin(JSONObject liePinJsonObject, String liePinToken, String url) throws Exception {

        String t = DateUtils.dateToPattern(new Date(), "yyyyMMdd");

        liePinJsonObject.put("t", t);

        String sign = Md5Utils.getMD5SortKey(Md5Utils.mapToList(liePinJsonObject), liePinJsonObject);

        liePinJsonObject.put("sign", sign);

        //设置请求头
        Map<String, String> headers = new HashMap<>();

        headers.put("channel", "qianxun");

        headers.put("token", liePinToken);

        return HttpClientUtil.sentHttpPostRequest(url, headers, liePinJsonObject);
    }

    private List<String> removeDuplicateTitle(List<String> titleDbList) {
        LinkedHashSet<String> set = new LinkedHashSet<>(titleDbList.size());
        set.addAll(titleDbList);
        titleDbList.clear();
        titleDbList.addAll(set);
        return titleDbList;
    }

    private void sendSyncPosition(int positionId, ThirdPartyPosition thirdPartyPosition) throws Exception {

        ThirdPartyPositionForm positionForm = new ThirdPartyPositionForm();

        positionForm.setAppid(0);
        positionForm.setPositionId(positionId);
        positionForm.setRequestType(1);
        List<String> list = new ArrayList<>();
        list.add(JSONObject.toJSONString(thirdPartyPosition));
        positionForm.setChannels(list);

        hrThirdPartyPositionDao.updateBindState(positionId, 2);

        positionBS.syncPositionToThirdParty(positionForm);
    }

    private void handleTemplateLogDeadLetter(Message message, String msgBody, String errorMessage) {
        LogDeadLetterDO logDeadLetterDO = new LogDeadLetterDO();
        logDeadLetterDO.setAppid(NumberUtils.toInt(message.getMessageProperties().getAppId(), 0));
        logDeadLetterDO.setErrorLog(errorMessage);
        logDeadLetterDO.setMsg(msgBody);
        logDeadLetterDO.setExchangeName(StringUtils.defaultIfBlank(message.getMessageProperties().getReceivedExchange(), ""));
        logDeadLetterDO.setRoutingKey(StringUtils.defaultIfBlank(message.getMessageProperties().getReceivedRoutingKey(), ""));
        logDeadLetterDO.setQueueName(StringUtils.defaultIfBlank(message.getMessageProperties().getConsumerQueue(), ""));
        logDeadLetterDao.addData(logDeadLetterDO);
    }


}
