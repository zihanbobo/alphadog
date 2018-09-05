package com.moseeker.profile.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.moseeker.baseorm.constant.ReferralType;
import com.moseeker.baseorm.db.jobdb.tables.records.JobPositionRecord;
import com.moseeker.baseorm.db.userdb.tables.records.UserUserRecord;
import com.moseeker.baseorm.redis.RedisClient;
import com.moseeker.common.annotation.iface.CounterIface;
import com.moseeker.common.constants.AppId;
import com.moseeker.common.constants.Constant;
import com.moseeker.common.constants.KeyIdentifier;
import com.moseeker.common.constants.Position.PositionStatus;
import com.moseeker.common.exception.CommonException;
import com.moseeker.common.thread.ThreadPool;
import com.moseeker.common.util.FormCheck;
import com.moseeker.common.validation.ValidateUtil;
import com.moseeker.entity.Constant.ApplicationSource;
import com.moseeker.entity.*;
import com.moseeker.entity.biz.ProfileParseUtil;
import com.moseeker.entity.biz.ProfilePojo;
import com.moseeker.entity.exception.ApplicationException;
import com.moseeker.entity.pojo.profile.ProfileObj;
import com.moseeker.entity.pojo.resume.ResumeObj;
import com.moseeker.profile.constants.GenderType;
import com.moseeker.profile.domain.ResumeEntity;
import com.moseeker.profile.exception.ProfileException;
import com.moseeker.profile.service.ReferralService;
import com.moseeker.profile.service.impl.serviceutils.ProfileExtUtils;
import com.moseeker.profile.service.impl.serviceutils.StreamUtils;
import com.moseeker.profile.service.impl.vo.CandidateInfo;
import com.moseeker.profile.service.impl.vo.FileNameData;
import com.moseeker.profile.service.impl.vo.ProfileDocParseResult;
import com.moseeker.rpccenter.client.ServiceManager;
import com.moseeker.thrift.gen.application.service.JobApplicationServices;
import com.moseeker.thrift.gen.application.struct.JobApplication;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.dao.struct.userdb.UserEmployeeDO;
import org.apache.commons.lang.StringUtils;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/**
 * 内推服务
 * @Author: jack
 * @Date: 2018/9/4
 */
@Service
@CounterIface
@PropertySource("classpath:setting.properties")
public class ReferralServiceImpl implements ReferralService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource(name = "cacheClient")
    private RedisClient client;

    private ThreadPool tp = ThreadPool.Instance;

    @Autowired
    public ReferralServiceImpl(EmployeeEntity employeeEntity, ProfileEntity profileEntity, ResumeEntity resumeEntity,
                               UserAccountEntity userAccountEntity, ProfileParseUtil profileParseUtil,
                               PositionEntity positionEntity, ReferralEntity referralEntity,

                               Environment env ) {
        this.employeeEntity = employeeEntity;
        this.profileEntity = profileEntity;
        this.resumeEntity = resumeEntity;
        this.userAccountEntity = userAccountEntity;
        this.profileParseUtil = profileParseUtil;
        this.positionEntity = positionEntity;
        this.referralEntity = referralEntity;
        this.env = env;
    }

    /**
     * 员工简历解析
     * @param employeeId 员工编号
     * @param fileName 文件名称
     * @param fileData 文件二进制刘
     * @return 解析结果
     * @throws ProfileException 业务异常
     */
    public ProfileDocParseResult parseFileProfile(int employeeId, String fileName, ByteBuffer fileData) throws ProfileException {
        ProfileDocParseResult profileDocParseResult = new ProfileDocParseResult();

        UserEmployeeDO employeeDO = employeeEntity.getEmployeeByID(employeeId);
        if (employeeDO == null || employeeDO.getId() <= 0) {
            throw ProfileException.PROFILE_EMPLOYEE_NOT_EXIST;
        }

        byte[] dataArray = StreamUtils.ByteBufferToByteArray(fileData);
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        FileNameData fileNameData = StreamUtils.persistFile(dataArray, env.getProperty("profile.persist.url"), suffix);
        profileDocParseResult.setFile(fileNameData.getFileName());
        fileNameData.setOriginName(fileName);

        // 调用SDK得到结果
        ResumeObj resumeObj;
        try {
            resumeObj = profileEntity.profileParserAdaptor(fileName, StreamUtils.byteArrayToBase64String(dataArray));
        } catch (TException | IOException e) {
            logger.error(e.getMessage(), e);
            throw ProfileException.PROFILE_PARSE_TEXT_FAILED;
        }
        ProfileObj profileObj = resumeEntity.handlerParseData(resumeObj,0,fileName);
        profileDocParseResult.setMobile(profileObj.getUser().getMobile());
        profileDocParseResult.setName(profileObj.getUser().getName());
        profileObj.setResumeObj(null);
        JSONObject jsonObject = ProfileExtUtils.convertToReferralProfileJson(profileObj);
        ProfileExtUtils.createAttachment(jsonObject, fileNameData, Constant.EMPLOYEE_PARSE_PROFILE_DOCUMENT);
        ProfileExtUtils.createReferralUser(jsonObject, profileDocParseResult.getName(), profileDocParseResult.getMobile());

        ProfilePojo profilePojo = profileEntity.parseProfile(jsonObject.toJSONString());

        client.set(AppId.APPID_ALPHADOG.getValue(), KeyIdentifier.EMPLOYEE_REFERRAL_PROFILE.toString(), String.valueOf(employeeId),
                "", JSONObject.toJSONString(profilePojo), 24*60*60);

        client.set(AppId.APPID_ALPHADOG.getValue(), KeyIdentifier.EMPLOYEE_REFERRAL_PROFILE.toString(), String.valueOf(employeeId),
                "", JSONObject.toJSONString(profilePojo), 24*60*60);

        return profileDocParseResult;
    }

    /**
     * 员工推荐
     * 产生虚拟用户、简历、申请记录
     * @param employeeId 员工编号
     * @param name 推荐者名称
     * @param mobile 手机号码
     * @param referralReasons 推荐理由
     * @param position 职位编号
     * @param referralType 推荐方式
     * @return 推荐记录编号
     * @throws ProfileException
     */
    @Override
    public int employeeReferralProfile(int employeeId, String name, String mobile, List<String> referralReasons,
                                       int position, byte referralType) throws ProfileException {

        ValidateUtil validateUtil = new ValidateUtil();
        validateUtil.addRequiredOneValidate("推荐理由", referralReasons);
        if (referralReasons != null) {
            String reasons = referralReasons.stream().collect(Collectors.joining(","));
            validateUtil.addStringLengthValidate("推荐理由", reasons, null, 512);
        }
        validateUtil.addRequiredStringValidate("候选人姓名", name);
        validateUtil.addStringLengthValidate("候选人姓名", name, null, 100);
        validateUtil.addRequiredStringValidate("手机号码", mobile);
        validateUtil.addRegExpressValidate("手机号码", mobile, FormCheck.getMobileExp());
        validateUtil.addIntTypeValidate("推荐方式", referralType, 1, 4);
        String validateResult = validateUtil.validate();
        if (StringUtils.isNotBlank(validateResult)) {
            throw ProfileException.validateFailed(validateResult);
        }

        ReferralType type = ReferralType.instanceFromValue(referralType);
        if (type == null) {
            throw ApplicationException.APPLICATION_REFERRAL_TYPE_NOT_EXIST;
        }

        UserEmployeeDO employeeDO = employeeEntity.getEmployeeByID(employeeId);
        if (employeeDO == null || employeeDO.getId() <= 0) {
            throw ProfileException.PROFILE_EMPLOYEE_NOT_EXIST;
        }

        JobPositionRecord positionRecord = positionEntity.getPositionByID(position);
        if (positionRecord == null || positionRecord.getStatus() != PositionStatus.ACTIVED.getValue()) {
            throw ApplicationException.APPLICATION_POSITION_NOTEXIST;
        }

        List<Integer> companyIdList = employeeEntity.getCompanyIds(employeeDO.getCompanyId());
        if (!companyIdList.contains(positionRecord.getCompanyId())) {
            throw ApplicationException.NO_PERMISSION_EXCEPTION;
        }

        String profilePojoStr = client.get(AppId.APPID_ALPHADOG.getValue(),
                KeyIdentifier.EMPLOYEE_REFERRAL_PROFILE.toString(), String.valueOf(employeeId));

        if (StringUtils.isBlank(profilePojoStr)) {
            throw ProfileException.REFERRAL_PROFILE_NOT_EXIST;
        } else {
            client.del(AppId.APPID_ALPHADOG.getValue(),
                    KeyIdentifier.EMPLOYEE_REFERRAL_PROFILE.toString(), String.valueOf(employeeId));
        }

        JSONObject jsonObject = JSONObject.parseObject(profilePojoStr);

        ProfilePojo profilePojo = ProfilePojo.parseProfile(jsonObject, profileParseUtil.initParseProfileParam());
        profilePojo.getUserRecord().setName(name);
        profilePojo.getUserRecord().setMobile(Long.parseLong(mobile));

        GenderType genderType = GenderType.Secret;
        if (profilePojo.getBasicRecord() != null && profilePojo.getBasicRecord().getGender() != null) {
            if (GenderType.instanceFromValue(profilePojo.getBasicRecord().getGender().intValue()) != null) {
                genderType = GenderType.instanceFromValue(profilePojo.getBasicRecord().getGender().intValue());
            }
        }
        String email = StringUtils.defaultIfBlank(profilePojo.getUserRecord().getEmail(), "");

        return recommend(profilePojo, employeeDO, positionRecord, name, mobile, referralReasons,
                (byte)genderType.getValue(), email, type);
    }

    /**
     * 员工提交候选人关键信息
     * @param employeeId 员工编号
     * @param candidate 候选人信息
     * @return 推荐记录编号
     * @throws ProfileException 业务异常
     */
    @Override
    public int postCandidateInfo(int employeeId, CandidateInfo candidate) throws ProfileException {
        ValidateUtil validateUtil = new ValidateUtil();
        validateUtil.addRequiredStringValidate("姓名", candidate.getName());
        validateUtil.addStringLengthValidate("姓名", candidate.getName(), 0, 100);
        validateUtil.addRequiredStringValidate("手机号码", candidate.getMobile());
        validateUtil.addRegExpressValidate("手机号码", candidate.getMobile(), FormCheck.getMobileExp());
        validateUtil.addRequiredStringValidate("邮箱", candidate.getEmail());
        validateUtil.addRegExpressValidate("邮箱", candidate.getEmail(), FormCheck.getEmailExp());
        validateUtil.addStringLengthValidate("邮箱", candidate.getEmail(), null, 50);
        validateUtil.addRequiredStringValidate("就职公司", candidate.getCompany());
        validateUtil.addStringLengthValidate("就职公司", candidate.getCompany(), null, 200);
        validateUtil.addRequiredStringValidate("就职职位", candidate.getPosition());
        validateUtil.addStringLengthValidate("就职职位", candidate.getPosition(), null, 200);
        validateUtil.addRequiredOneValidate("推荐理由", candidate.getReasons());
        if (candidate.getReasons() != null) {
            String reasons = candidate.getReasons().stream().collect(Collectors.joining(","));
            validateUtil.addStringLengthValidate("推荐理由", reasons, null, 512);
        }

        String result = validateUtil.validate();

        if (StringUtils.isNotBlank(result)) {
            throw ProfileException.validateFailed(result);
        }

        UserEmployeeDO employeeDO = employeeEntity.getEmployeeByID(employeeId);
        if (employeeDO == null || employeeDO.getId() <= 0) {
            throw ProfileException.PROFILE_EMPLOYEE_NOT_EXIST;
        }

        JobPositionRecord positionRecord = positionEntity.getPositionByID(candidate.getPosition());
        if (positionRecord == null || positionRecord.getStatus() != PositionStatus.ACTIVED.getValue()) {
            throw ApplicationException.APPLICATION_POSITION_NOTEXIST;
        }

        List<Integer> companyIdList = employeeEntity.getCompanyIds(employeeDO.getCompanyId());
        if (!companyIdList.contains(positionRecord.getCompanyId())) {
            throw ApplicationException.NO_PERMISSION_EXCEPTION;
        }

        ProfilePojo profilePojo = new ProfilePojo();
        ProfileExtUtils.createReferralProfileData(profilePojo);
        ProfileExtUtils.createReferralUser(profilePojo, candidate.getName(), candidate.getMobile(), candidate.getEmail());

        return recommend(profilePojo, employeeDO, positionRecord, candidate.getName(), candidate.getMobile(),
                candidate.getReasons(), candidate.getGender(), candidate.getEmail(), ReferralType.PostInfo);

    }

    /**
     * 推荐执行的业务
     * @param profilePojo 简历数据
     * @param employeeDO 员工数据
     * @param positionRecord 职位数据
     * @param name 用户姓名
     * @param mobile 用户手机号码
     * @param referralReasons 推荐理由
     * @param gender
     * @param email @return 推荐记录编号
     * @param referralType 推荐方式
     * @throws ProfileException 业务异常
     */
    private int recommend(ProfilePojo profilePojo, UserEmployeeDO employeeDO, JobPositionRecord positionRecord,
                          String name, String mobile, List<String> referralReasons, byte gender, String email, ReferralType referralType)
            throws ProfileException {

        UserUserRecord userRecord = userAccountEntity.getReferralUser(
                profilePojo.getUserRecord().getMobile().toString(), employeeDO.getCompanyId());
        int userId;
        if (userRecord != null) {
            userId = userRecord.getId();
            profilePojo.setUserRecord(userRecord);
            if (StringUtils.isBlank(userRecord.getUsername())) {
                profileEntity.mergeProfile(profilePojo, userRecord.getId());
            }
        } else {
            userRecord = profileEntity.storeReferralUser(profilePojo, employeeDO.getId(), employeeDO.getCompanyId());
            profilePojo.getProfileRecord().setUserId(userRecord.getId());
            userId = userRecord.getId();
        }

        int referralId = referralEntity.logReferralOperation(employeeDO.getId(), userId, positionRecord.getId(),
                referralType);

        Future<Response> responseFeature = tp.startTast(() -> {
            try {
                JobApplication jobApplication = new JobApplication();
                jobApplication.setApp_tpl_id(userId);
                jobApplication.setCompany_id(positionRecord.getCompanyId());
                jobApplication.setAppid(0);
                jobApplication.setApplier_name(name);
                jobApplication.setOrigin(ApplicationSource.EMPLOYEE_REFERRAL.getValue());
                jobApplication.setRecommender_user_id(employeeDO.getSysuserId());
                jobApplication.setApp_tpl_id(Constant.RECRUIT_STATUS_UPLOAD_PROFILE);
                Response response = applicationService.postApplication(jobApplication);

                int applicationId = 0;
                if (response.getStatus() == 0) {
                    JSONObject jsonObject1 = JSONObject.parseObject(response.getData());
                    applicationId = jsonObject1.getInteger("jobApplicationId");
                }
                referralEntity.logReferralOperation(positionRecord.getId(), applicationId, 1, referralReasons,
                        mobile, employeeDO, userId, gender, email);

                return response;
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
                return new Response(ProfileException.PROGRAM_EXCEPTION.getCode(), ProfileException.PROGRAM_EXCEPTION.getMessage());
            }
        });

        try {
            Response response = responseFeature.get();
            if (response.status == 0) {
                return referralId;
            } else {
                throw  new CommonException(response.getStatus(), response.getMessage());
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw ProfileException.PROGRAM_EXCEPTION;
        }
    }

    JobApplicationServices.Iface applicationService = ServiceManager.SERVICEMANAGER
            .getService(JobApplicationServices.Iface.class);

    private EmployeeEntity employeeEntity;
    private ProfileEntity profileEntity;
    private ResumeEntity resumeEntity;
    private UserAccountEntity userAccountEntity;
    private ProfileParseUtil profileParseUtil;
    private PositionEntity positionEntity;
    private ReferralEntity referralEntity;

    private Environment env;

}