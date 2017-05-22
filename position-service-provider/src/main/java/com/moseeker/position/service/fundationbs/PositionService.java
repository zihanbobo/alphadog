package com.moseeker.position.service.fundationbs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.moseeker.common.annotation.iface.CounterIface;
import com.moseeker.common.constants.AccountSync;
import com.moseeker.common.constants.AppId;
import com.moseeker.common.constants.ConstantErrorCodeMessage;
import com.moseeker.common.constants.KeyIdentifier;
import com.moseeker.common.constants.PositionSync;
import com.moseeker.common.providerutils.QueryUtil;
import com.moseeker.common.providerutils.ResponseUtils;
import com.moseeker.common.providerutils.bzutils.JOOQBaseServiceImpl;
import com.moseeker.common.redis.RedisClientFactory;
import com.moseeker.common.util.BeanUtils;
import com.moseeker.common.util.DateUtils;
import com.moseeker.common.util.MD5Util;
import com.moseeker.db.dictdb.tables.records.DictCityPostcodeRecord;
import com.moseeker.db.dictdb.tables.records.DictCityRecord;
import com.moseeker.db.hrdb.tables.records.HrCompanyAccountRecord;
import com.moseeker.db.hrdb.tables.records.HrTeamRecord;
import com.moseeker.db.jobdb.tables.records.JobCustomRecord;
import com.moseeker.db.jobdb.tables.records.JobOccupationRecord;
import com.moseeker.db.jobdb.tables.records.JobOccupationRelRecord;
import com.moseeker.db.jobdb.tables.records.JobPositionCityRecord;
import com.moseeker.db.jobdb.tables.records.JobPositionExtRecord;
import com.moseeker.db.jobdb.tables.records.JobPositionRecord;
import com.moseeker.position.dao.DictCityPostCodeDao;
import com.moseeker.position.dao.DictConstantDao;
import com.moseeker.position.dao.DictPositionDao;
import com.moseeker.position.dao.HrTeamDao;
import com.moseeker.position.dao.JobCustomDao;
import com.moseeker.position.dao.JobOccupationDao;
import com.moseeker.position.dao.JobOccupationRelDao;
import com.moseeker.position.dao.JobPositionCityDao;
import com.moseeker.position.dao.JobPositionDao;
import com.moseeker.position.dao.JobPositonExtDao;
import com.moseeker.position.dao.PositionDao;
import com.moseeker.position.pojo.DictConstantPojo;
import com.moseeker.position.pojo.JobPositionFailMess;
import com.moseeker.position.pojo.JobPositionPojo;
import com.moseeker.position.pojo.JobPostionResponse;
import com.moseeker.position.pojo.PositionForSynchronizationPojo;
import com.moseeker.position.pojo.RecommendedPositonPojo;
import com.moseeker.position.service.position.PositionChangeUtil;
import com.moseeker.rpccenter.client.ServiceManager;
import com.moseeker.thrift.gen.apps.positionbs.struct.ThirdPartyPosition;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.company.struct.Hrcompany;
import com.moseeker.thrift.gen.dao.service.CompanyDao;
import com.moseeker.thrift.gen.dao.service.HrDBDao;
import com.moseeker.thrift.gen.dao.service.UserHrAccountDao;
import com.moseeker.thrift.gen.dao.struct.ThirdPartAccountData;
import com.moseeker.thrift.gen.dao.struct.ThirdPartyPositionData;
import com.moseeker.thrift.gen.dao.struct.dictdb.DictCityDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyAccountDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrCompanyDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrHbConfigDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrHbItemsDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrHbPositionBindingDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrTeamStruct;
import com.moseeker.thrift.gen.dict.service.DictOccupationDao;
import com.moseeker.thrift.gen.position.struct.BatchHandlerJobPostion;
import com.moseeker.thrift.gen.position.struct.City;
import com.moseeker.thrift.gen.position.struct.JobPostrionObj;
import com.moseeker.thrift.gen.position.struct.Position;
import com.moseeker.thrift.gen.position.struct.RpExtInfo;
import com.moseeker.thrift.gen.position.struct.ThirdPartyPositionForSynchronization;
import com.moseeker.thrift.gen.position.struct.ThirdPartyPositionForSynchronizationWithAccount;
import com.moseeker.thrift.gen.position.struct.WechatPositionListData;
import com.moseeker.thrift.gen.position.struct.WechatPositionListQuery;
import com.moseeker.thrift.gen.position.struct.WechatRpPositionListData;
import com.moseeker.thrift.gen.position.struct.WechatShareData;
import com.moseeker.thrift.gen.searchengine.service.SearchengineServices;
import com.mysql.jdbc.StringUtils;
import org.apache.thrift.TException;
import org.jooq.Field;
import org.jooq.types.UInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.lang.Math.round;
import static java.lang.Math.toIntExact;

@Service
public class PositionService extends JOOQBaseServiceImpl<Position, JobPositionRecord> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PositionDao dao;

    @Autowired
    private JobPositionDao jobPositionDao;

    @Autowired
    private DictConstantDao dictConstantDao;

    @Autowired
    private JobCustomDao jobCustomDao;

    @Autowired
    private JobPositionCityDao jobPositionCityDao;

    @Autowired
    private JobPositonExtDao jobPositonExtDao;

    @Autowired
    private JobOccupationDao jobOccupationDao;

    @Autowired
    private JobOccupationRelDao jobOccupationRelDao;

    private UserHrAccountDao.Iface hrAccountDao = ServiceManager.SERVICEMANAGER.getService(UserHrAccountDao.Iface.class);


    private DictOccupationDao.Iface dictOccupationDao = ServiceManager.SERVICEMANAGER.getService(DictOccupationDao.Iface.class);


    @Autowired
    private DictCityPostCodeDao dictCityPostCodeDao;

    @Autowired
    private DictPositionDao dictPositionDao;

    @Autowired
    private HrTeamDao hrTeamDao;


    com.moseeker.thrift.gen.dao.service.PositionDao.Iface positionDaoService = ServiceManager.SERVICEMANAGER
            .getService(com.moseeker.thrift.gen.dao.service.PositionDao.Iface.class);
    private CompanyDao.Iface companyDao = ServiceManager.SERVICEMANAGER.getService(CompanyDao.Iface.class);

    //获取hrdb库中的内容
    HrDBDao.Iface hrDBDao = ServiceManager.SERVICEMANAGER.getService(HrDBDao.Iface.class);
    private SearchengineServices.Iface searchEngineService = ServiceManager.SERVICEMANAGER.getService(SearchengineServices.Iface.class);

    private HrDBDao.Iface hrDao = ServiceManager.SERVICEMANAGER.getService(HrDBDao.Iface.class);


    com.moseeker.thrift.gen.searchengine.service.SearchengineServices.Iface searchengineServices = ServiceManager.SERVICEMANAGER
            .getService(com.moseeker.thrift.gen.searchengine.service.SearchengineServices.Iface.class);


    com.moseeker.thrift.gen.company.service.CompanyServices.Iface companyServices = ServiceManager.SERVICEMANAGER
            .getService(com.moseeker.thrift.gen.company.service.CompanyServices.Iface.class);

    @Override
    protected void initDao() {
        super.dao = this.dao;
    }

    @Override
    protected Position DBToStruct(JobPositionRecord r) {
        return (Position) BeanUtils.DBToStruct(Position.class, r);
    }

    @Override
    protected JobPositionRecord structToDB(Position p) {
        return (JobPositionRecord) BeanUtils.structToDB(p, JobPositionRecord.class);
    }

    /**
     * 获取推荐职位
     * <p>
     * </p>
     *
     * @param pid 当前职位 id
     * @return 推荐职位列表
     */
    @CounterIface
    public Response getRecommendedPositions(int pid) {

        List<RecommendedPositonPojo> recommendPositons = this.dao.getRecommendedPositions(pid);

        return ResponseUtils.successWithoutStringify(JSON.toJSONString(recommendPositons, new ValueFilter() {
            @Override
            public Object process(Object object, String name, Object value) {
                if (value == null) {
                    return "";
                }
                return value;
            }
        }));

    }

    @CounterIface
    public Response verifyCustomize(int positionId) throws TException {
        try {
            JobPositionRecord positionRecord = jobPositionDao.getPositionById(positionId);

            if (positionRecord == null) {
                return ResponseUtils.fail(ConstantErrorCodeMessage.PROFILE_POSITION_NOTEXIST);
            }
            if (positionRecord.getAppCvConfigId() != null && positionRecord.getAppCvConfigId() > 0) {
                return ResponseUtils.success(true);
            } else {
                return ResponseUtils.success(false);
            }
        } catch (Exception e) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION);
        }
    }

    /**
     * 根据职位Id获取当前职位信息
     *
     * @param positionId 当前职位 id
     * @return 职位信息
     * @throws TException TException
     */
    @CounterIface
    public Response getPositionById(int positionId) throws TException {

        try {
            // 必填项校验
            if (positionId == 0) {
                return ResponseUtils
                        .fail(ConstantErrorCodeMessage.PROGRAM_VALIDATE_REQUIRED.replace("{0}", "position_id"));
            }

            // NullPoint check
            JobPositionRecord jobPositionRecord = jobPositionDao.getPositionById(positionId);
            if (jobPositionRecord == null) {
                return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_DATA_EMPTY);
            }

            JobPositionPojo jobPositionPojo = jobPositionDao.getPosition(positionId);
            jobPositionPojo.team_name = "";
            jobPositionPojo.department = "";
            int team_id = jobPositionPojo.team_id;
            if (team_id != 0) {
                CommonQuery query = new CommonQuery();
                Map<String, String> map = new HashMap<String, String>();
                map.put("id", team_id + "");
                map.put("disable", "0");
                query.setEqualFilter(map);
                Response result = hrDBDao.getHrTeam(query);
                if (result.getStatus() == 0 && result.getData() != null && !"".equals(result.getData()) && !"null".equals(result.getData())) {
                    HrTeamStruct team = JSONObject.toJavaObject(JSONObject.parseObject(result.getData()), HrTeamStruct.class);
                    jobPositionPojo.department = team.getName();
                    jobPositionPojo.team_name = team.getName();
                }
            }


            /** 子公司Id设置 **/
            if (jobPositionPojo.publisher != 0) {
                HrCompanyAccountRecord hrCompanyAccountRecord = jobPositionDao
                        .getHrCompanyAccountByPublisher(jobPositionPojo.publisher);
                // 子公司ID>0
                if (hrCompanyAccountRecord != null && hrCompanyAccountRecord.getCompanyId() > 0) {
                    jobPositionPojo.publisher_company_id = hrCompanyAccountRecord.getCompanyId();
                }
            }

            // 常量转换
            // 性别
            if (jobPositionPojo.gender < 2) {
                jobPositionPojo.gender_name = getDictConstantJson(2102, jobPositionPojo.gender);
            }

            // 学历
            if (jobPositionPojo.degree > 0) {
                jobPositionPojo.degree_name = getDictConstantJson(2101, jobPositionPojo.degree);
            }

            // 工作性质
            jobPositionPojo.employment_type_name = getDictConstantJson(2103, jobPositionPojo.employment_type);

            // 招聘类型
            jobPositionPojo.candidate_source_name = getDictConstantJson(2104, jobPositionPojo.candidate_source);

            // 自定义字段 与 自定义职位职能
            JobPositionExtRecord jobPositionExtRecord = getJobPositionExtRecord(positionId);
            if (jobPositionExtRecord != null) {
                if (jobPositionExtRecord.getJobCustomId() > 0) {
                    JobCustomRecord jobCustomRecord = jobCustomDao
                            .getJobCustomRecord(jobPositionExtRecord.getJobCustomId());
                    if (jobCustomRecord != null && !"".equals(jobCustomRecord.getName())) {
                        jobPositionPojo.custom = jobCustomRecord.getName();
                    }
                }
                if (jobPositionExtRecord.getJobCustomId() > 0) {
                    JobOccupationRecord jobOccupationRecord =
                            jobOccupationDao.getJobOccupationRecord(jobPositionExtRecord.getJobOccupationId());
                    if (jobOccupationRecord != null && com.moseeker.common.util.StringUtils.isNotNullOrEmpty(jobOccupationRecord.getName())) {
                        jobPositionPojo.occupation = jobOccupationRecord.getName();
                    }
                }


            }

            // 修改更新时间
            jobPositionPojo.publish_date_view = DateUtils.dateToPattern(jobPositionPojo.publish_date,
                    DateUtils.SHOT_TIME);
            jobPositionPojo.update_time_view = DateUtils.dateToPattern(jobPositionPojo.update_time,
                    DateUtils.SHOT_TIME);

            // 省份
            List<DictCityRecord> provinces = dao.getProvincesByPositionID(positionId);
            if (provinces != null && provinces.size() > 0) {
                StringBuffer sb = new StringBuffer();
                provinces.forEach(province -> {
                    sb.append(province.getName()).append(",");
                });
                sb.deleteCharAt(sb.length() - 1);
                jobPositionPojo.province = sb.toString();
            }

            return ResponseUtils.success(jobPositionPojo);
        } catch (Exception e) {
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION);
        }
    }

    /**
     * 获取常量字典一条记录
     */
    private String getDictConstantJson(Integer parentCode, Integer code) throws Exception {
        DictConstantPojo dictConstantPojo = dictConstantDao.getDictConstantJson(parentCode, code);
        return dictConstantPojo != null ? dictConstantPojo.getName() : "";
    }

    private JobPositionExtRecord getJobPositionExtRecord(int positionId) {
        return jobPositonExtDao.getJobPositonExtRecordByPositionId(positionId);
    }

    /**
     * 校验同步职位必填信息
     */
    public boolean verifySynchronizePosition(PositionForSynchronizationPojo position) {
        return false;
    }

    /**
     * 转成第三方渠道职位
     */
    public List<ThirdPartyPositionForSynchronization> changeToThirdPartyPosition(List<ThirdPartyPosition> forms,
                                                                                 Position position) {
        List<ThirdPartyPositionForSynchronization> positions = new ArrayList<>();
        if (forms != null && forms.size() > 0 && position != null && position.getId() > 0) {
            forms.forEach(form -> {
                ThirdPartyPositionForSynchronization p = PositionChangeUtil.changeToThirdPartyPosition(form, position);
                positions.add(p);
            });
        }
        return positions;
    }

    /**
     * 该职位是否可以刷新
     *
     * @param positionId 职位编号
     * @param account_id 第三方账号ID
     * @return bool
     */
    public boolean ifAllowRefresh(int positionId, int account_id) {
        boolean permission = false;
        try {
            logger.info("ifAllowRefresh");
            QueryUtil findPositionById = new QueryUtil();
            findPositionById.addEqualFilter("id", String.valueOf(positionId));
            logger.info("search position");
            Position position = positionDaoService.getPosition(findPositionById);
            logger.info("position:" + JSON.toJSONString(position));
            if (position.getId() > 0) {
                QueryUtil queryUtil = new QueryUtil();
                queryUtil.addEqualFilter("id", account_id);
                ThirdPartAccountData account = hrAccountDao.getThirdPartyAccount(queryUtil);
                logger.info("ifAllowRefresh third party account:" + JSON.toJSONString(account));

                logger.info("search thirdparyposition");
                ThirdPartyPositionData p = positionDaoService.getThirdPartyPosition(positionId, account_id);
                logger.info("thirdparyposition" + JSON.toJSONString(p));
                if (account != null && account.getBinding() == AccountSync.bound.getValue() && p.getId() > 0
                        && p.getIs_synchronization() == PositionSync.bound.getValue()) {
                    logger.info("data allow");
                    String str = RedisClientFactory.getCacheClient().get(AppId.APPID_ALPHADOG.getValue(),
                            KeyIdentifier.THIRD_PARTY_POSITION_REFRESH.toString(), String.valueOf(positionId), String.valueOf(account_id));
                    permission = true;
                    if (StringUtils.isNullOrEmpty(str)) {
                        logger.info("cache allow");
                        permission = true;
                    }
                }
            }
        } catch (TException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        } finally {
            // do nothing
        }
        return permission;
    }

    /**
     * 创建刷新职位数据
     *
     * @param positionId 职位编号
     * @param account_id 第三方账号ID
     */
    public ThirdPartyPositionForSynchronizationWithAccount createRefreshPosition(int positionId, int account_id) {

        ThirdPartyPositionForSynchronizationWithAccount account = new ThirdPartyPositionForSynchronizationWithAccount();
        try {
            ThirdPartyPosition form = new ThirdPartyPosition();
            QueryUtil findPosition = new QueryUtil();
            findPosition.addEqualFilter("id", String.valueOf(positionId));
            Position position = positionDaoService.getPosition(findPosition);

            ThirdPartyPositionData thirdPartyPosition = positionDaoService.getThirdPartyPosition(positionId, account_id);

            QueryUtil findAccount = new QueryUtil();
            findAccount.addEqualFilter("id", account_id);
            ThirdPartAccountData accountData = hrAccountDao.getThirdPartyAccount(findAccount);
            account.setUser_name(accountData.getUsername());
            account.setMember_name(accountData.getMembername());
            account.setPassword(accountData.getPassword());
            account.setChannel(String.valueOf(accountData.getChannel()));
            account.setPosition_id(String.valueOf(positionId));
            account.setAccount_id(String.valueOf(account_id));

            form.setChannel((byte) accountData.getChannel());
            if (position.getId() > 0 && thirdPartyPosition.getId() > 0) {
                ThirdPartyPositionForSynchronization p = PositionChangeUtil.changeToThirdPartyPosition(form, position);
                p.setJob_id(thirdPartyPosition.getThird_part_position_id());
                account.setPosition_info(p);
            }
        } catch (TException e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
        } finally {
            //do nothing
        }
        return account;
    }

    /**
     * 批量处理修改职位
     */
    @CounterIface
    public Response batchHandlerJobPostion(BatchHandlerJobPostion batchHandlerJobPosition) {
        logger.info("------开始批量修改职位--------");
        try {
            JobPostionResponse jobPostionResponse = new JobPostionResponse();
            // 返回新增或者更新失败的职位信息
            List<JobPositionFailMess> jobPositionFailMessPojos = new ArrayList<>();
            // 提交的数据
            List<JobPostrionObj> jobPositionHandlerDates = batchHandlerJobPosition.getData();
            // 如果为true, 数据不能删除. 否则,允许删除, data中的数据根据fields_nohash中以外的字段, 判断data中的记录和数据库中已有记录的关系, 进行添加, 修改,删除
            Boolean noDelete = batchHandlerJobPosition.nodelete;
            // 参数有误
            if (null == noDelete) {
                return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION_STATUS, ConstantErrorCodeMessage.POSITION_NODELETE_BLANK);
            }
            // 提交的数据为空
            if (com.moseeker.common.util.StringUtils.isEmptyList(batchHandlerJobPosition.getData())) {
                return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION_STATUS, ConstantErrorCodeMessage.POSITION_DATA_BLANK);
            }
            Integer companyId;
            if (jobPositionHandlerDates.get(0).getId() != 0) {
                QueryUtil queryUtil = new QueryUtil();
                queryUtil.addEqualFilter("id", String.valueOf(jobPositionHandlerDates.get(0).getId()));
                JobPositionRecord jobPostionTemp = jobPositionDao.getResource(queryUtil);
                if (jobPostionTemp != null) {
                    companyId = jobPostionTemp.getCompanyId().intValue();
                } else {
                    return ResponseUtils.fail(ConstantErrorCodeMessage.POSITION_JOBPOSITION_COMPANY_ID_BLANK);
                }
            } else {
                // 将该公司下的所有职位查询出来
                companyId = jobPositionHandlerDates.get(0).getCompany_id();
            }
            // 将该公司下所有的部位取出来，用于判断更新或者新增数据时，部门设置是否正确
            QueryUtil queryUtilDepartment = new QueryUtil();
            queryUtilDepartment.addEqualFilter("company_id", String.valueOf(companyId));
            queryUtilDepartment.addEqualFilter("disable", 0);
            queryUtilDepartment.setPer_page(100000);
            // 取的该公司下的所有部门信息
            List<HrTeamRecord> hrTeamRecordList = hrTeamDao.getResources(queryUtilDepartment);
            HashMap hashMapHrTeam = new HashMap();
            // 当更新或者新增jobPosition数据时，如果公司部门信息为空，提示无法更新或者新增jobposition
            if (!com.moseeker.common.util.StringUtils.isEmptyList(hrTeamRecordList)) {
                for (HrTeamRecord hrTeamRecord : hrTeamRecordList) {
                    hashMapHrTeam.put(replaceBlank(hrTeamRecord.getName()), hrTeamRecord);
                }
            }
            CommonQuery commonQuery = new CommonQuery();
            HashMap hashMap = new HashMap();
            hashMap.put("company_id", String.valueOf(companyId));
            hashMap.put("source", String.valueOf(9));
            // 默认会取10条数据
            commonQuery.setPer_page(100000);
            commonQuery.setEqualFilter(hashMap);
            // 数据库中该公司的职位列表
            List<JobPositionRecord> dbList = jobPositionDao.getResources(commonQuery);
            HashMap dbListMap = new HashMap();
            List<JobPositionRecord> dbOnlineList = new ArrayList<>();
            for (JobPositionRecord jobPositionRecord : dbList) {
                dbListMap.put(jobPositionRecord.getId(), jobPositionRecord);
                if (jobPositionRecord.getStatus() == 0) {
                    dbOnlineList.add(jobPositionRecord);
                }
            }
            HashMap jobOccupationMap = new LinkedHashMap();
            // 公司下职能信息
            QueryUtil jobOccupationQuery = new QueryUtil();
            jobOccupationQuery.addEqualFilter("company_id", String.valueOf(companyId));
            jobOccupationQuery.setPer_page(100000);
            jobOccupationQuery.addEqualFilter("status", 1);
            List<JobOccupationRecord> jobOccupationList = jobOccupationDao.getResources(jobOccupationQuery);
            for (JobOccupationRecord jobOccupationRecord : jobOccupationList) {
                jobOccupationMap.put(jobOccupationRecord.getName().trim(), jobOccupationRecord);
            }
            // 需要删除的城市的数据ID列表
            List<Integer> deleteCitylist = new ArrayList<>();
            // 需要删除jobOccupationRel数据列表
            List<Integer> jobOccupationRelIdList = new ArrayList<>();
            // 需要更新ES的jobpostionID
            List<Integer> jobPositionIds = new ArrayList<>();
            Integer deleteCounts = 0;
            // 删除操作,删除除了data以外的数据库中的数据
            if (!noDelete) {
                if (!com.moseeker.common.util.StringUtils.isEmptyList(dbOnlineList)) {
                    // 不需要删除的数据
                    List<JobPositionRecord> noDeleJobPostionRecords = new ArrayList<>();
                    // 提交的数据处理
                    for (JobPositionRecord jobPositionRecord : dbOnlineList) {
                        boolean existed = false;
                        for (JobPostrionObj jobPositionHandlerDate : jobPositionHandlerDates) {
                            // 当ID相同，数据不需要删除
                            if (jobPositionRecord.getId().intValue() == jobPositionHandlerDate.getId()) {
                                noDeleJobPostionRecords.add(jobPositionRecord);
                                existed = true;
                                break;
                            }
                            // 当 source = 9 ，source_id ,company_id, jobnumber 相等时候，不需要删除
                            if (jobPositionRecord.getSource() == 9 && jobPositionRecord.getSourceId().intValue() == jobPositionHandlerDate.getSource_id()
                                    && jobPositionRecord.getCompanyId().intValue() == jobPositionHandlerDate.getCompany_id()
                                    && jobPositionRecord.getJobnumber().equals(jobPositionHandlerDate.getJobnumber())) {
                                noDeleJobPostionRecords.add(jobPositionRecord);
                                existed = true;
                                break;
                            }
                        }
                        if (!existed) {
                            jobPositionRecord.setStatus((byte) 1);
                            jobPositionIds.add(jobPositionRecord.getId());
                        }
                    }
                    // 需要删除的列表不为空，否则全部删除
                    if (noDeleJobPostionRecords.size() > 0) {
                        // 将总数据和不需要删除的数据取差集
                        dbOnlineList.removeAll(noDeleJobPostionRecords);
                    }
                    deleteCounts = dbOnlineList.size();
                    // 更新jobposition数据，由于做逻辑删除，所以不删除jobpositionExt和jobpositionCity数据
                    jobPositionDao.putResources(dbOnlineList);
                }
            }
            // 判断哪些数据不需要更新的
            String fieldsNooverwrite = batchHandlerJobPosition.getFields_nooverwrite();
            String[] fieldsNooverwriteStrings = null;
            if (!StringUtils.isNullOrEmpty(fieldsNooverwrite)) {
                fieldsNooverwriteStrings = fieldsNooverwrite.split(",");
            }
            // 判断数据是否需要更新
            String fieldsNohash = batchHandlerJobPosition.getFields_nohash();
            String[] fieldsNohashs = null;
            if (!StringUtils.isNullOrEmpty(fieldsNohash)) {
                fieldsNohashs = fieldsNohash.split(",");
            }
            // 需要更新JobPostion的数据
            List<JobPositionRecord> jobPositionUpdateRecordList = new ArrayList<>();
            // 需要新增JobPostion的数据
            List<JobPositionRecord> jobPositionAddRecordList = new ArrayList<>();
            //  需要更新的JobPositionExtRecord数据
            List<JobPositionExtRecord> jobPositionExtRecordUpdateRecords = new ArrayList<>();
            //  需要新增的JobPositionExtRecord数据
            List<JobPositionExtRecord> jobPositionExtRecordAddRecords = new ArrayList<>();
            // 需要更新的JobPositionCity数据
            List<JobPositionCityRecord> jobPositionCityRecordsUpdatelist = new ArrayList<>();
            // 需要新增的JobPositionCity数据
            List<JobPositionCityRecord> jobPositionCityRecordsAddlist = new ArrayList<>();
            // 需要新增的JobOccupationRel 数据
            List<JobOccupationRelRecord> jobOccupationRelRecordList = new ArrayList<>();
            // 处理数据
            for (JobPostrionObj jobPositionHandlerDate : jobPositionHandlerDates) {
                logger.info("提交的数据：" + jobPositionHandlerDate.toString());
                logger.info("提交的部门信息：" + jobPositionHandlerDate.getDepartment());
                JobPositionRecord record = BeanUtils.structToDB(jobPositionHandlerDate, JobPositionRecord.class);
                // 当职位要求为空时候，设置空串
                if (com.moseeker.common.util.StringUtils.isNullOrEmpty(record.getRequirement())) {
                    record.setRequirement("");
                }
                int team_id = 0;
                if (!com.moseeker.common.util.StringUtils.isNullOrEmpty(record.getDepartment())) {
                    logger.info(record.getDepartment().trim());
                    String department = replaceBlank(record.getDepartment());
                    HrTeamRecord hrTeamRecord = (HrTeamRecord) hashMapHrTeam.get(department);
                    if (hrTeamRecord != null) {
                        logger.info("-----取到TeamId-------");
                        logger.info("----部门ID为---:" + hrTeamRecord.getId());
                        team_id = hrTeamRecord.getId();
                    } else {
                        logger.info("-----未取到TeamId-------");
                        logger.info("--部门名称为--:" + record.getDepartment());
                        logger.info("--company_id--:" + record.getCompanyId());
                        logger.info("--JobPositionRecord数据--:" + record.toString());
                        logger.info("--提交的数据--:" + jobPositionHandlerDate.toString());
                        JobPositionFailMess jobPositionFailMessPojo = new JobPositionFailMess();
                        jobPositionFailMessPojo.setCompanyId(jobPositionHandlerDate.getCompany_id());
                        jobPositionFailMessPojo.setJobNumber(jobPositionHandlerDate.getJobnumber());
                        jobPositionFailMessPojo.setSourceId(jobPositionHandlerDate.getSource_id());
                        jobPositionFailMessPojo.setJobPostionId(jobPositionHandlerDate.getId());
                        jobPositionFailMessPojo.setDepartment(jobPositionHandlerDate.getDepartment());
                        jobPositionFailMessPojo.setMessage(ConstantErrorCodeMessage.POSITION_DATA_DEPARTMENT_ERROR);
                        jobPositionFailMessPojos.add(jobPositionFailMessPojo);
                        continue;
                    }
                } else {
                    record.setDepartment("");
                }
                int jobOccupationId = 0;
                // 验证职能信息是否正确
                if (!com.moseeker.common.util.StringUtils.isNullOrEmpty(jobPositionHandlerDate.getOccupation())) {
                    JobOccupationRecord jobOccupationRecord = (JobOccupationRecord) jobOccupationMap.get(jobPositionHandlerDate.getOccupation().trim());
                    if (jobOccupationRecord != null) {
                        jobOccupationId = jobOccupationRecord.getId();
                    } else {
                        logger.info("-----职位职能设置错误,职能为:" + jobPositionHandlerDate.getOccupation());
                        JobPositionFailMess jobPositionFailMessPojo = new JobPositionFailMess();
                        jobPositionFailMessPojo.setCompanyId(jobPositionHandlerDate.getCompany_id());
                        jobPositionFailMessPojo.setJobNumber(jobPositionHandlerDate.getJobnumber());
                        jobPositionFailMessPojo.setSourceId(jobPositionHandlerDate.getSource_id());
                        jobPositionFailMessPojo.setJobPostionId(jobPositionHandlerDate.getId());
                        jobPositionFailMessPojo.setMessage(ConstantErrorCodeMessage.POSITION_DATA_OCCUPATION_ERROR.replace("{MESSAGE}", jobPositionHandlerDate.getOccupation()));
                        jobPositionFailMessPojos.add(jobPositionFailMessPojo);
                        continue;
                    }
                }
                // 换算薪资范围
                if (record.getSalaryBottom().intValue() == 0 && record.getSalaryTop().intValue() == 0) {
                    record.setSalary("面议");
                }
                if (record.getSalaryBottom().intValue() > 0 && record.getSalaryTop().intValue() == 999) {
                    record.setSalary(record.getSalaryBottom().intValue() + "K以上");
                }
                // 按company_id + .source_id + .jobnumber + source=9取得数据
                QueryUtil queryUtil = new QueryUtil();
                queryUtil.addEqualFilter("company_id", String.valueOf(jobPositionHandlerDate.getCompany_id()));
                queryUtil.addEqualFilter("source", "9");
                queryUtil.addEqualFilter("source_id", String.valueOf(jobPositionHandlerDate.getSource_id()));
                queryUtil.addEqualFilter("jobnumber", jobPositionHandlerDate.getJobnumber());
                JobPositionRecord jobPositionRecord = jobPositionDao.getResource(queryUtil);


                // 更新或者新增数据
                if (jobPositionHandlerDate.getId() != 0 || !com.moseeker.common.util.StringUtils.isEmptyObject(jobPositionRecord)) {  // 数据更新
                    // 按company_id + .source_id + .jobnumber + source=9取得数据为空时，按Id进行更新
                    if (!com.moseeker.common.util.StringUtils.isEmptyObject(jobPositionRecord)) {
                        record.setId(jobPositionRecord.getId());
                        jobPositionIds.add(jobPositionRecord.getId());
                    }
                    // 取出数据库中的数据进行对比操作
                    JobPositionRecord jobPositionRecordTemp = (JobPositionRecord) dbListMap.get(record.getId());
                    if (jobPositionRecordTemp != null) {
                        QueryUtil query = new QueryUtil();
                        query.addEqualFilter("pid", String.valueOf(jobPositionRecordTemp.getId()));
                        JobPositionExtRecord jobPositionExtRecord = jobPositonExtDao.getResource(query);
                        if (fieldsNohashs == null ||
                                (!md5(fieldsNohashs, jobPositionRecordTemp, jobPositionExtRecord != null ? jobPositionExtRecord.getExtra() : "").equals(md5(fieldsNohashs, record, jobPositionHandlerDate.getExtra())))) {

                            record.setSourceId(jobPositionRecordTemp.getSourceId());
                            record.setCompanyId(UInteger.valueOf(companyId));
                            if (com.moseeker.common.util.StringUtils.isNullOrEmpty(record.getJobnumber())) {
                                record.setJobnumber(jobPositionRecordTemp.getJobnumber());
                            }
                            // 当城市无法转换时，入库为提交的数据
                            String city = citys(jobPositionHandlerDate.getCity());
                            if (com.moseeker.common.util.StringUtils.isNotNullOrEmpty(city)) {
                                record.setCity(city);
                            }
                            record.setTeamId(team_id);
                            // 设置不需要更新的字段
                            if (fieldsNooverwriteStrings != null && fieldsNooverwriteStrings.length > 0) {
                                for (Field field : record.fields()) {
                                    for (String fieldNo : fieldsNooverwriteStrings) {
                                        if (field.getName().equals(fieldNo)) {
                                            record.set(field, jobPositionRecordTemp.getValue(field.getName()));
                                        }
                                    }
                                }
                            }
                            // 将需要更新JobPosition的数据放入更新的列表
                            jobPositionUpdateRecordList.add(record);
                            // 需要更新JobPositionCity数据
                            if (cityCode(jobPositionHandlerDate.getCity(), record.getId()) != null && cityCode(jobPositionHandlerDate.getCity(), record.getId()).size() > 0) {
                                // 更新时候需要把之前的jobPositionCity数据删除
                                deleteCitylist.add(record.getId());
                                jobPositionCityRecordsUpdatelist.addAll(cityCode(jobPositionHandlerDate.getCity(), record.getId()));
                            }
                            // 需要更新的JobPositionExra数据
                            if (jobPositionHandlerDate.getExtra() != null || jobOccupationId != 0) {
                                if (jobPositionExtRecord == null) {
                                    jobPositionExtRecord = new JobPositionExtRecord();
                                    jobPositionExtRecord.setPid(jobPositionRecordTemp.getId());
                                    jobPositionExtRecord.setExtra(jobPositionHandlerDate.getExtra() == null ? "" : jobPositionHandlerDate.getExtra());
                                    jobPositionExtRecord.setJobOccupationId(jobOccupationId);
                                    jobPositionExtRecordAddRecords.add(jobPositionExtRecord);
                                } else {
                                    jobPositionExtRecord.setExtra(jobPositionHandlerDate.getExtra() == null ? "" : jobPositionHandlerDate.getExtra());
                                    jobPositionExtRecord.setJobOccupationId(jobOccupationId);
                                    jobPositionExtRecordUpdateRecords.add(jobPositionExtRecord);
                                }
                            }
                        }
                    }
                } else { // 数据的新增
                    record.setTeamId(team_id);
                    String city = citys(jobPositionHandlerDate.getCity());
                    // 当城市无法转换时，入库为提交的数据
                    if (com.moseeker.common.util.StringUtils.isNotNullOrEmpty(city)) {
                        record.setCity(city);
                    }
                    logger.info("-- 新增jobPostion数据开始，新增的jobPostion数据为：" + record.toString() + "--");
                    Integer pid = jobPositionDao.insertJobPostion(record);
                    logger.info("-- 新增jobPostion数据结束,新增职位ID为：" + pid);
                    if (pid != null) {
                        jobPositionIds.add(pid);
                        if (cityCode(jobPositionHandlerDate.getCity(), record.getId()) != null && cityCode(jobPositionHandlerDate.getCity(), record.getId()).size() > 0) {
                            // 新增城市code时，需要先删除jobpostionCity数据
                            jobPositionCityRecordsAddlist.addAll(cityCode(jobPositionHandlerDate.getCity(), record.getId()));
                        }
                    }
                    // 需要新增的JobPosition数据
                    jobPositionAddRecordList.add(record);
                    if (!com.moseeker.common.util.StringUtils.isNullOrEmpty(jobPositionHandlerDate.getExtra()) || jobOccupationId != 0) {
                        // 新增jobPostion_ext数据
                        JobPositionExtRecord jobPositionExtRecord = new JobPositionExtRecord();
                        jobPositionExtRecord.setExtra(jobPositionHandlerDate.getExtra() == null ? "" : jobPositionHandlerDate.getExtra());
                        jobPositionExtRecord.setJobOccupationId(jobOccupationId);
                        jobPositionExtRecord.setPid(pid);
                        jobPositionExtRecordAddRecords.add(jobPositionExtRecord);
                    }
                }
            }
            logger.info("----------------------------------------------------------");
            logger.info("需要更新jobPostion数据的条数:" + jobPositionCityRecordsUpdatelist.size());
            logger.info("需要更新jobPostionExt数据的条数:" + jobPositionExtRecordUpdateRecords.size());
            logger.info("新增jobPostionExt数据的条数:" + jobPositionExtRecordAddRecords.size());
            logger.info("新增jobPositionCity数据的条数:" + jobPositionCityRecordsAddlist.size());
            logger.info("需要更新jobPositionCity数据条数:" + jobPositionCityRecordsUpdatelist.size());
            logger.info("需要更新职能信息数据条数:" + jobOccupationRelRecordList.size());
            logger.info("---------------------------------------------------------");
            try {
                // 更新jobPostion数据
                if (jobPositionUpdateRecordList.size() > 0) {
                    logger.info("-------------更新jobPostion数据开始------------------");
                    jobPositionDao.putResources(jobPositionUpdateRecordList);
                    logger.info("-------------更新jobPostion数据结束------------------");
                }
                // 更新jobPostionExt数据
                if (jobPositionExtRecordUpdateRecords.size() > 0) {
                    logger.info("-------------更新jobPostionExt数据开始------------------");
                    jobPositonExtDao.putResources(jobPositionExtRecordUpdateRecords);
                    logger.info("-------------更新jobPostionExt数据结束------------------");
                }
                // 新增jobPostionExt数据
                if (jobPositionExtRecordAddRecords.size() > 0) {
                    logger.info("-------------新增jobPostionExt数据开始------------------");
                    jobPositonExtDao.postResources(jobPositionExtRecordAddRecords);
                    logger.info("-------------新增jobPostionExt数据结束------------------");
                }
                // 新增jobPositionCity数据
                if (jobPositionCityRecordsAddlist.size() > 0) {
                    logger.info("-------------新增jobPositionCity数据开始------------------");
                    jobPositionCityDao.postResources(jobPositionCityRecordsAddlist);
                    logger.info("-------------新增jobPositionCity数据结束------------------");
                }
                // 更新jobPositionCity数据
                if (jobPositionCityRecordsUpdatelist.size() > 0) {
                    if (deleteCitylist.size() > 0) {
                        logger.info("-------------需要删除jobPositionCity的数据：" + deleteCitylist.toString());
                        logger.info("-------------删除jobPositionCity的数据开始------------------");
                        jobPositionCityDao.delJobPostionCityByPids(deleteCitylist);
                        logger.info("-------------删除jobPositionCity的数据结束------------------");
                    }
                    logger.info("-------------新增jobPositionCity的数据开始------------------");
                    jobPositionCityDao.postResources(jobPositionCityRecordsUpdatelist);
                    logger.info("-------------新增jobPositionCity的数据结束------------------");
                }
                // 职能信息数据
                if (jobOccupationRelRecordList.size() > 0) {
                    if (jobOccupationRelIdList.size() > 0) { // 先删除jobOccupationRel数据
                        logger.info("-------------需要删除jobOccupationRel数据：" + jobOccupationRelIdList.toString());
                        logger.info("-------------删除jobOccupationRel数据开始------------------");
                        jobOccupationRelDao.delJobOccupationRelByPids(jobOccupationRelIdList);
                        logger.info("-------------删除jobOccupationRel数据结束------------------");
                    }
                    logger.info("-------------新增jobOccupationRel数据开始------------------");
                    jobOccupationRelDao.postResources(jobOccupationRelRecordList);
                    logger.info("-------------新增jobOccupationRel数据结束------------------");
                }
            } catch (Exception e) {
                logger.info("更新和插入数据发生异常,异常信息为：" + e.getMessage());
                e.printStackTrace();
            }
            jobPostionResponse.setJobPositionFailMessPojolist(jobPositionFailMessPojos);
            jobPostionResponse.setDeleteCounts(deleteCounts);
            jobPostionResponse.setInsertCounts(jobPositionAddRecordList.size());
            jobPostionResponse.setUpdateCounts(jobPositionUpdateRecordList.size());
            jobPostionResponse.setTotalCounts(jobPositionHandlerDates.size());
            if (jobPositionIds.size() > 0) {
                logger.info("插入和新增的jobPositionIds为:" + jobPositionIds.toString());
                // 更新ES Search Engine
                PositionService.UpdateES updataESThread = new PositionService.UpdateES(jobPositionIds);
                Thread thread = new Thread(updataESThread);
                thread.start();
                return ResponseUtils.success(jobPostionResponse);
            }
            logger.info("-------批量修改职位结束---------");
            return ResponseUtils.fail(1, JSONArray.toJSONString(jobPostionResponse));
        } catch (Exception e) {
            logger.info("发生异常，异常信息：" + e.getMessage());
            logger.error(e.getMessage(), e);
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION_STATUS, e.getMessage());
        }
    }

    /**
     * 删除职位
     */
    public Response deleteJobposition(Integer id, Integer companyId, String jobnumber, Integer sourceId) {
        try {
            JobPositionRecord jobPositionRecord = null;
            if (id != null && id.intValue() != 0) {
                QueryUtil queryUtil = new QueryUtil();
                queryUtil.addEqualFilter("id", String.valueOf(id));
                jobPositionRecord = jobPositionDao.getResource(queryUtil);

            } else if (companyId != null && jobnumber != null && sourceId != null) {
                QueryUtil queryUtil = new QueryUtil();
                queryUtil.addEqualFilter("company_id", String.valueOf(companyId));
                queryUtil.addEqualFilter("source", "9");
                queryUtil.addEqualFilter("source_id", String.valueOf(sourceId));
                queryUtil.addEqualFilter("jobnumber", jobnumber);
                jobPositionRecord = jobPositionDao.getResource(queryUtil);
            } else {
                return ResponseUtils.fail(ConstantErrorCodeMessage.POSITION_DATA_DELETE_PARAM);
            }
            // 删除jobPositionCity数据
            List<Integer> list = new ArrayList<>();
            if (jobPositionRecord != null && jobPositionRecord.getStatus().intValue() != 1) {
                jobPositionRecord.setStatus((byte) 1);
                // 删除JobPostion
                jobPositionDao.putResource(jobPositionRecord);
                // 更新ES Search Engine
                list.add(jobPositionRecord.getId());
                PositionService.UpdateES updataESThread = new PositionService.UpdateES(list);
                Thread thread = new Thread(updataESThread);
                thread.start();
                return ResponseUtils.success(0);
            } else {
                return ResponseUtils.fail(ConstantErrorCodeMessage.POSITION_DATA_DELETE_FAIL);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION_STATUS, e.getMessage());
        }
    }


    /**
     * 对JobPositionRecord 进行除了nohash字段之外的值进行MD5进行计算
     */
    public String md5(String[] nohashs, JobPositionRecord jobPositionRecord, String extra) {
        String md5 = null;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            HashMap hashMap = new HashMap();
            for (String nohash : nohashs) {
                hashMap.put(nohash, nohash);
            }
            // 判断JobPosion字段
            for (Field field : jobPositionRecord.fields()) {
                String str = (String) hashMap.get(field.getName());
                if (!com.moseeker.common.util.StringUtils.isEmptyObject(str)) {
                    stringBuffer.append(jobPositionRecord.get(field.getName()));
                }
            }
            String str = (String) hashMap.get("extra");
            if (!com.moseeker.common.util.StringUtils.isEmptyObject(str)) {
                stringBuffer.append(extra);
            }
            md5 = MD5Util.md5(stringBuffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5;
    }

    // 特殊城市拼音转CityCode
    public final static Map specialCityMap = new LinkedHashMap();

    static {
        specialCityMap.put("Amur River", "黑龙江省");
        specialCityMap.put("Anhwei", "安徽省");
        specialCityMap.put("Canton", "广东省");
        specialCityMap.put("Kwangtung", "广东省");
        specialCityMap.put("Fukian", "福建省");
        specialCityMap.put("Harbin", "哈尔滨");
        specialCityMap.put("Hong Kong", "香港");
        specialCityMap.put("Nankin", "南京");
        specialCityMap.put("Nanking", "南京");
        specialCityMap.put("Inner Mongolia", "内蒙古");
        specialCityMap.put("Pekin", "北京");
        specialCityMap.put("Peking", "北京");
        specialCityMap.put("Shanxi", "山西省");
        specialCityMap.put("Shaanxi", "陕西省");
        specialCityMap.put("Szechwan", "四川");
        specialCityMap.put("Taipei", "台北");
        specialCityMap.put("Tibet", "西藏");
        specialCityMap.put("Urumchi", "乌鲁木齐");
        specialCityMap.put("Urumqi", "乌鲁木齐");
        specialCityMap.put("Ürümqi", "乌鲁木齐");
    }

    /**
     * 将地区或者邮编转换成行政编码
     */
    public List<JobPositionCityRecord> cityCode(List<City> citys, Integer pid) {
        List<JobPositionCityRecord> jobPositionCityRecordList = new ArrayList<>();
        try {
            // 将已经查询的到的cityCode放到map中，避免多次查询
            HashMap cityPostCodeMap = new LinkedHashMap();
            // 将从DictCity查询
            HashMap cityMap = new LinkedHashMap();
            if (citys != null && citys.size() > 0 && pid != null) {
                for (City city : citys) {
                    // 查询DictCityPostCode条件
                    QueryUtil cityCodeQuery = new QueryUtil();
                    // 查询DictCity条件
                    QueryUtil cityQuery = new QueryUtil();
                    JobPositionCityRecord jobPositionCityRecord = new JobPositionCityRecord();
                    jobPositionCityRecord.setPid(pid);
                    logger.info("城市类型：" + city.getType().toLowerCase());
                    logger.info("VAlUE：" + city.getValue());
                    // 城市名字，转换成cityCode，传入的是城市的时候查询dict_city
                    if (city.getType().toLowerCase().equals("text")) {
                        // 判断是不是特殊城市中的
                        String specicalCity = (String) specialCityMap.get(city.getValue());
                        if (specicalCity != null) {
                            city.setValue(specicalCity);
                        }
                        // 判断下是否是中文还是英文
                        if (isChinese(city.getValue())) { // 是中文
                            cityQuery.addEqualFilter("name", city.getValue());
                        } else { // 英文
                            cityQuery.addEqualFilter("ename", city.getValue());
                        }
                        try {
                            DictCityDO dictCityDO = (DictCityDO) cityMap.get(city.getValue());
                            if (dictCityDO != null) {
                                jobPositionCityRecord.setCode(dictCityDO.getCode());
                            } else {
                                dictCityDO = dictOccupationDao.dictCityDO(cityQuery);
                                if (dictCityDO != null && dictCityDO.getCode() != 0) {
                                    jobPositionCityRecord.setCode(dictCityDO.getCode());
                                    cityMap.put(city.getValue(), dictCityDO);
                                }
                            }
                        } catch (Exception e) {
                            logger.error(e.getMessage(), e);
                        }
                    } else if (city.getType().toLowerCase().equals("postcode")) { // 邮编，转成citycode
                        try {
                            DictCityPostcodeRecord cityPostcodeRecord = (DictCityPostcodeRecord) cityPostCodeMap.get(city.getValue());
                            if (cityPostcodeRecord != null) {
                                jobPositionCityRecord.setCode(Integer.valueOf(cityPostcodeRecord.getCode()));
                            } else {
                                cityCodeQuery.addEqualFilter("postcode", city.getValue());
                                cityPostcodeRecord = dictCityPostCodeDao.getResource(cityCodeQuery);
                                if (cityPostcodeRecord != null && cityPostcodeRecord.getCode() != null) {
                                    jobPositionCityRecord.setCode(Integer.valueOf(cityPostcodeRecord.getCode()));
                                    cityPostCodeMap.put(city.getValue(), cityPostcodeRecord);
                                }
                            }
                        } catch (Exception e) {
                            logger.error(e.getMessage(), e);
                        }
                    } else if (city.getType().toLowerCase().equals("citycode")) { // citycode 直接存储
                        jobPositionCityRecord.setCode(Integer.valueOf(city.getValue()));
                    } else if (city.getType().toLowerCase().equals("fuzzypostcode")) { // 模糊邮编，取邮编的前四位查询
                        String postCodeTemp = city.getValue().substring(0, 4);
                        DictCityPostcodeRecord cityPostcodeRecord = (DictCityPostcodeRecord) cityPostCodeMap.get(postCodeTemp);
                        if (cityPostcodeRecord != null) {
                            jobPositionCityRecord.setCode(Integer.valueOf(cityPostcodeRecord.getCode()));
                        } else {
                            cityPostcodeRecord = dictCityPostCodeDao.fuzzyGetCityPostCode(postCodeTemp);
                            if (cityPostcodeRecord != null && cityPostcodeRecord.getCode() != null) {
                                jobPositionCityRecord.setCode(Integer.valueOf(cityPostcodeRecord.getCode()));
                                cityPostCodeMap.put(city.getValue(), cityPostcodeRecord);
                            }
                        }
                    }
                    // 如果cityCode不入库
                    if (jobPositionCityRecord.getCode() != null) {
                        jobPositionCityRecordList.add(jobPositionCityRecord);
                    }
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return jobPositionCityRecordList;
    }

    /**
     * 将city列表转换成城市以逗号分开
     */
    public String citys(List<City> list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (list != null && list.size() > 0) {
            // 将已经查询的到的cityCode放到map中，避免多次查询
            HashMap cityPostCodeMap = new LinkedHashMap();
            int i = 0;
            for (City city : list) {
                QueryUtil cityCodeQuery = new QueryUtil();
                if (city.getType().toLowerCase().equals("text")) { // 城市名字，转换成cityCode
                    // 判断是不是特殊城市中的
                    String specicalCity = (String) specialCityMap.get(city.getValue());
                    if (specicalCity != null) {
                        stringBuffer.append(specicalCity);
                    } else {
                        if (isChinese(city.getValue())) { // 是中文
                            stringBuffer.append(city.getValue());
                        } else { // 英文
                            cityCodeQuery.addEqualFilter("ename", city.getValue());
                            try {
                                DictCityDO dictCityDO = (DictCityDO) cityPostCodeMap.get(city.getValue());
                                if (dictCityDO != null) {
                                    stringBuffer.append(dictCityDO.getName());
                                } else {
                                    dictCityDO = dictOccupationDao.dictCityDO(cityCodeQuery);
                                    if (dictCityDO != null && dictCityDO.getCode() != 0) {
                                        stringBuffer.append(dictCityDO.getName());
                                        cityPostCodeMap.put(city.getValue(), dictCityDO);
                                    } else {
                                        stringBuffer.append(city.getValue());
                                    }
                                }
                            } catch (Exception e) {
                                logger.error(e.getMessage(), e);
                            }
                        }
                    }
                } else if (city.getType().toLowerCase().equals("postcode")) { // 邮编，转成城市名
                    try {
                        DictCityPostcodeRecord cityPostcodeRecord = (DictCityPostcodeRecord) cityPostCodeMap.get(city.getValue());
                        if (cityPostcodeRecord != null) {
                            stringBuffer.append(cityPostcodeRecord.getCity());
                        } else {
                            cityCodeQuery.clear();
                            cityCodeQuery.addEqualFilter("postcode", city.getValue());
                            cityPostcodeRecord = dictCityPostCodeDao.getResource(cityCodeQuery);
                            if (cityPostcodeRecord != null && cityPostcodeRecord.getCity() != null) {
                                if (com.moseeker.common.util.StringUtils.isEmptyObject(cityPostcodeRecord.getCity())) {
                                    stringBuffer.append(cityPostcodeRecord.getProvince());
                                } else {
                                    stringBuffer.append(cityPostcodeRecord.getCity());
                                }
                                cityPostCodeMap.put(city.getValue(), cityPostcodeRecord);
                            }
                        }
                    } catch (Exception e) {
                        logger.error(e.getMessage(), e);
                    }
                } else if (city.getType().toLowerCase().equals("citycode")) { // citycode 直接存储
                    try {
                        DictCityDO dictCityDO = (DictCityDO) cityPostCodeMap.get(city.getValue());
                        if (dictCityDO != null) {
                            stringBuffer.append(dictCityDO.getName());
                        } else {
                            cityCodeQuery.clear();
                            cityCodeQuery.addEqualFilter("code", city.getValue());
                            dictCityDO = dictOccupationDao.dictCityDO(cityCodeQuery);
//                            cityPostcodeRecord = dictCityPostCodeDao.getResource(cityCodeQuery);
                            if (dictCityDO != null && dictCityDO.getName() != null) {
                                stringBuffer.append(dictCityDO.getName());
                                cityPostCodeMap.put(city.getValue(), dictCityDO);
                            }
                        }
                    } catch (Exception e) {
                        logger.error(e.getMessage(), e);
                    }
                } else if (city.getType().toLowerCase().equals("fuzzypostcode")) {  // 模糊邮编查询，转为城市名字
                    try {
                        String postCodeTemp = city.getValue().substring(0, 4);
                        DictCityPostcodeRecord cityPostcodeRecord = (DictCityPostcodeRecord) cityPostCodeMap.get(postCodeTemp);
                        if (cityPostcodeRecord != null) {
                            stringBuffer.append(cityPostcodeRecord.getCity());
                        } else {
                            cityPostcodeRecord = dictCityPostCodeDao.fuzzyGetCityPostCode(postCodeTemp);
                            if (cityPostcodeRecord != null && cityPostcodeRecord.getCity() != null) {
                                if (!com.moseeker.common.util.StringUtils.isEmptyObject(cityPostcodeRecord.getCity())) {
                                    stringBuffer.append(cityPostcodeRecord.getCity());
                                } else {
                                    stringBuffer.append(cityPostcodeRecord.getProvince());
                                }
                                cityPostCodeMap.put(city.getValue(), cityPostcodeRecord);
                            }
                        }
                    } catch (Exception e) {
                        logger.error(e.getMessage(), e);
                    }
                }
                i = i + 1;
                if (i != list.size() && com.moseeker.common.util.StringUtils.isNotNullOrEmpty(stringBuffer.toString()) && !stringBuffer.toString().endsWith(",")) {
                    stringBuffer.append(",");
                }
            }
            if (stringBuffer.toString().endsWith(",")) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public JobOccupationDao getJobOccupationDao() {
        return jobOccupationDao;
    }

    public void setJobOccupationDao(JobOccupationDao jobOccupationDao) {
        this.jobOccupationDao = jobOccupationDao;
    }

    public List<ThirdPartyPositionData> getThirdPartyPositions(CommonQuery query) {
        List<ThirdPartyPositionData> datas = new ArrayList<>();
        try {
//			if(query.getEqualFilter() != null) {
//				query.getEqualFilter().put("channel", "1");
//			} else {
//				Map<String, String> equalFilter = new HashMap<>();
//				equalFilter.put("channel", "1");
//				query.setEqualFilter(equalFilter);
//			}
            datas = positionDaoService.getPositionThirdPartyPositions(query);
        } catch (TException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //do nothing
        }
        return datas;
    }

    /**
     * 获取微信端职位列表
     *
     * @param query 查询条件
     * @return 微信端职位列表信息
     */
    public List<WechatPositionListData> getPositionList(WechatPositionListQuery query) {

        List<WechatPositionListData> dataList = new ArrayList<>();

        try {
            String childCompanyId = "";
            String companyId = "";

            logger.info("----- in getPositionList ");
            logger.info("query.getDid() :" + String.valueOf(query.getDid()));
            logger.info("query.getCompany_id() :" + String.valueOf(query.getCompany_id()));


            if (query.isSetDid() && query.getDid() != 0) {
                // 如果有did, 赋值 childCompanyId
                childCompanyId = String.valueOf(query.getDid());

            } else
            {
                QueryUtil qu = new QueryUtil();
                qu.addEqualFilter("parent_id", query.getCompany_id());
                List<Hrcompany> companies = companyDao.getCompanies(qu);

                List<Integer> cIds = new ArrayList<>();
                if (companies.size() > 0) {
                    cIds = companies.stream().map(Hrcompany::getId).collect(Collectors.toList());
                }
                cIds.add(query.getCompany_id());
                companyId = org.apache.commons.lang.StringUtils.join(cIds.toArray(), ",");

                logger.info("companyId:" + companyId);
            }

            logger.info("<><><><><><><><><><><>");
            logger.info("companyId: " + companyId);
            logger.info("childCompanyId: " + childCompanyId);
            logger.info("<><><><><><><><><><><>");
            logger.info("query.getKeywords():" + query.getKeywords());
            logger.info("query.getCities():" + query.getCities());
            logger.info("query.getIndustries():" + query.getIndustries());
            logger.info("query.getOccupations():" + query.getOccupations());
            logger.info("query.getScale():" + query.getScale());
            logger.info("query.getEmployment_type(): " + query.getEmployment_type());
            logger.info("query.getCandidate_source():" + query.getCandidate_source());
            logger.info("query.getExperience():" + query.getExperience());
            logger.info("query.getDegree():" + query.getDegree());
            logger.info("query.getSalary():" + query.getSalary());
            logger.info("query.getPage_from(): " + query.getPage_from());
            logger.info("query.getPage_size(): " + query.getPage_size());
            logger.info("query.getDepartment(): " + query.getDepartment());
            logger.info("query.getCustom(): " + query.getCustom());
            logger.info("<><><><><><><><><><><>");

            //获取 pid list
            Response ret = searchEngineService.query(
                    query.getKeywords(),
                    query.getCities(),
                    query.getIndustries(),
                    query.getOccupations(),
                    query.getScale(),
                    query.getEmployment_type(),
                    query.getCandidate_source(),
                    query.getExperience(),
                    query.getDegree(),
                    query.getSalary(),
                    companyId,
                    query.getPage_from(),
                    query.getPage_size(),
                    childCompanyId,
                    query.getDepartment(),
                    true,
                    query.getCustom());

            if (ret.getStatus() == 0 && !StringUtils.isNullOrEmpty(ret.getData())) {

                // 通过 pid 列表查询 position 信息
                JSONObject jobj = JSON.parseObject(ret.getData());

                JSONArray pidsJson = jobj.getJSONArray("jd_id_list");

                logger.info("pidsJson: " + pidsJson);

                ArrayList<Integer> pids = new ArrayList<>();
                if (pidsJson != null) {
                    int len = pidsJson.size();
                    for (int i = 0; i < len; i++) {
                        pids.add(pidsJson.getInteger(i));
                    }
                }

                QueryUtil q = new QueryUtil();
                q.addEqualFilter("id", "[" + org.apache.commons.lang.StringUtils.join(pids.toArray(), ",") + "]");
                List<JobPositionRecord> jobRecords = jobPositionDao.getResources(q);

                for (Integer pid : pids) {

                    logger.info("pid: " + String.valueOf(pid));

                    List<JobPositionRecord> jrList = jobRecords.stream().filter(p -> p.getId() == pid).collect(Collectors.toList());
                    if (jrList != null && !jrList.isEmpty()) {
                        logger.info("jrList: " + jrList.toString());

                        JobPositionRecord jr = jrList.get(0);

                        WechatPositionListData e = new WechatPositionListData();
                        e.setTitle(jr.getTitle());
                        e.setId(jr.getId());

                        // 数据库的 salary_top 和 salary_bottom 默认是 NULL 不是 0
                        // 所以这里需要对这两个字段做 null pointer 检查
                        if (jr.getSalaryTop() == null) {
                            e.setSalary_top(0);
                        } else {
                            e.setSalary_top(jr.getSalaryTop());
                        }

                        if (jr.getSalaryBottom() == null) {
                            e.setSalary_bottom(0);
                        } else {
                            e.setSalary_bottom(jr.getSalaryBottom());
                        }

                        e.setPublish_date(new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(jr.getUpdateTime()));
                        e.setDepartment(jr.getDepartment());
                        e.setVisitnum(jr.getVisitnum());
                        e.setIn_hb(jr.getHbStatus() > 0);
                        e.setCount(jr.getCount());
                        e.setCity(jr.getCity());
                        e.setPriority(jr.getPriority());
                        e.setPublisher(jr.getPublisher()); // will be used for fetching sub company info

                        dataList.add(e);
                    }
                }

                logger.info(dataList.toString());

                // 获取公司信息，拼装 company abbr, logo 等信息
                Map<Integer /* publisher id */, HrCompanyDO> publisherCompanyMap = new HashMap<>();

                QueryUtil hrm = new QueryUtil();

                // 子公司特定
                if (query.isSetDid() && query.getDid() != 0) {

                    // 获取子公司info
                    hrm.addEqualFilter("id", String.valueOf(query.getDid()));
                    HrCompanyDO subCompanyInfo = companyDao.getCompany(hrm);

                    // 获取 hr_company_account
                    hrm = new QueryUtil();
                    hrm.addEqualFilter("company_id", subCompanyInfo.getId());
                    List<HrCompanyAccountDO> companyAccountList = hrDBDao.listHrCompanyAccount(hrm);
                    HrCompanyAccountDO subCompanyAccount = companyAccountList.get(0);

                    // 写入 map
                    publisherCompanyMap.put(subCompanyAccount.getAccountId(), subCompanyInfo);

                }
                // 母公司 + 子公司
                else {
                    List<Integer> publisherList = dataList.stream().map(WechatPositionListData::getPublisher)
                            .collect(Collectors.toList());

                    // publisherList 应该不为空
                    // 如果 publisherList 为空，那么返回空 ArrayList
                    if (publisherList == null || publisherList.size() == 0) {
                        return new ArrayList<>();
                    }

                    // 根据 pbulisher_list 查询 hr_company_account_list
                    hrm.addEqualFilter("account_id", buildQueryIds(publisherList));

                    List<HrCompanyAccountDO> companyAccountList = hrDBDao.listHrCompanyAccount(hrm);

                    for (HrCompanyAccountDO hrCompanyAccount : companyAccountList) {
                        hrm = new QueryUtil();
                        hrm.addEqualFilter("id", hrCompanyAccount.getCompanyId());
                        HrCompanyDO companyInfo = hrDBDao.getCompany(hrm);
                        publisherCompanyMap.put(hrCompanyAccount.accountId, companyInfo);

                    }
                }

                //拼装 company 相关内容
                dataList = dataList.stream().map(s -> {
                    s.setCompany_abbr(publisherCompanyMap.get(s.getPublisher()).getAbbreviation());
                    s.setCompany_logo(publisherCompanyMap.get(s.getPublisher()).getLogo());
                    s.setCompany_name(publisherCompanyMap.get(s.getPublisher()).getName());
                    return s;
                }).collect(Collectors.toList());
            } else {
                return new ArrayList<>();
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new ArrayList<>();
        } finally {
            // do nothing
        }
        return dataList;
    }

    /**
     * 获得红包活动的分享信息
     *
     * @param hb_config_id 红包活动id
     * @return 红包活动分享信息
     */
    public WechatShareData getShareInfo(int hb_config_id) {
        WechatShareData result = new WechatShareData();

        QueryUtil qu = new QueryUtil();
        qu.addEqualFilter("id", String.valueOf(hb_config_id));
        try {
            HrHbConfigDO hbConfig = this.hrDao.getHbConfig(qu);
            result.setCover(hbConfig.getShareImg());
            result.setTitle(hbConfig.getShareTitle());
            result.setDescription(hbConfig.getShareDesc());

        } catch (TException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 返回指定 pid 的红包信息
     *
     * @param pids pids
     * @return pids 对应职位红包活动的额外信息
     */
    public List<RpExtInfo> getPositionListRpExt(List<Integer> pids) {
        List<RpExtInfo> result = new ArrayList<>();

        try {
            // 获取 company_id
            int company_id = 0;
            if (pids.size() > 0) {
                QueryUtil qu = new QueryUtil();
                qu.addEqualFilter("id", String.valueOf(pids.get(0)));
                Position p = positionDaoService.getPosition(qu);
                company_id = p.getCompany_id();
            }

            // 获取正在运行的转发类红包活动集合
            QueryUtil qu = new QueryUtil();
            qu.addEqualFilter("status", "3"); //正在运行
            qu.addEqualFilter("company_id", String.valueOf(company_id));
            qu.addEqualFilter("type", "[2,3]"); //转发类职位
            List<HrHbConfigDO> hbConfigs = hrDao.getHbConfigs(qu);
            List<Integer> hbConfgIds = hbConfigs.stream().map(HrHbConfigDO::getId).collect(Collectors.toList());
            String allHbConfigIdsFilterString = "[" + org.apache.commons.lang.StringUtils.join(hbConfgIds.toArray(), ",") + "]";

            for (Integer pid : pids) {
                //对于每个 pid，先获取 position
                RpExtInfo rpExtInfo = new RpExtInfo();

                qu = new QueryUtil();
                qu.addEqualFilter("id", String.valueOf(pid));
                Position p = this.positionDaoService.getPosition(qu);

                if (p.getHb_status() == 1 || p.getHb_status() == 2) {
                    // 该职位参与了一个红包活动

                    //获取 binding 记录
                    qu = new QueryUtil();
                    qu.addEqualFilter("position_id", String.valueOf(p.getId()));
                    qu.addEqualFilter("hb_config_id", allHbConfigIdsFilterString);

                    List<HrHbPositionBindingDO> bindings = hrDao.getHbPositionBindings(qu);

                    // 确认 binding 只有一个，获取binding 对应的红包活动信息
                    if (bindings != null && bindings.size() > 0) {
                        HrHbConfigDO hbConfig = hbConfigs.stream().filter(c -> c.getId() == bindings.get(0).getHbConfigId())
                                .findFirst().orElseGet(null);

                        if (hbConfig != null) {
                            // 更新红包发送对象
                            rpExtInfo.setEmployee_only(hbConfig.getTarget() == 0);
                        } else {
                            logger.warn("查询不到对应的 hbConfig");
                            rpExtInfo.setEmployee_only(false);
                        }

                        // 根据 binding 获取 hb_items 记录
                        qu = new QueryUtil();
                        qu.addEqualFilter("binding_id", String.valueOf(bindings.get(0).getId()));
                        qu.addEqualFilter("wxuser_id", "0"); // 还未发出的
                        List<HrHbItemsDO> remainItems = hrDao.getHbItems(qu);

                        Double remain = remainItems.stream().mapToDouble(HrHbItemsDO::getAmount).sum();
                        Integer remainInt = toIntExact(round(remain));
                        if (remainInt < 0) {
                            remainInt = 0;
                        }

                        rpExtInfo.setPid(p.getId());
                        rpExtInfo.setRemain(remainInt);

                        result.add(rpExtInfo);
                    }
                } else if (p.getHb_status() == 3) {
                    // 该职位参与了两个红包活动

                    // 获取 binding 记录
                    qu = new QueryUtil();
                    qu.addEqualFilter("position_id", String.valueOf(p.getId()));
                    qu.addEqualFilter("hb_config_id", allHbConfigIdsFilterString);

                    List<HrHbPositionBindingDO> bindings = hrDao.getHbPositionBindings(qu);
                    //获取binding ids
                    List<Integer> bindingIds = bindings.stream().map(HrHbPositionBindingDO::getId).collect(Collectors.toList());
                    //获取binding 所对应的红包活动 id
                    List<Integer> hbConfigIds = bindings.stream().map(HrHbPositionBindingDO::getHbConfigId).collect(Collectors.toList());

                    // 得到对应的红包活动 pojo （2个）
                    List<HrHbConfigDO> configs = hbConfigs.stream().filter(s -> hbConfigIds.contains(s.getId())).collect(Collectors.toList());

                    // 如果任意一个对象是非员工，设置成 false
                    for (HrHbConfigDO config : configs) {
                        if (config.target > 0) {
                            rpExtInfo.setEmployee_only(false);
                            break;
                        }
                    }
                    // 否则对象设置成 true
                    if (!rpExtInfo.isSetEmployee_only()) {
                        rpExtInfo.setEmployee_only(true);
                    }

                    String bindingIdsFilterString = "[" + org.apache.commons.lang.StringUtils.join(bindingIds.toArray(), ",") + "]";
                    // 根据 binding 获取 hb_items 记录
                    qu = new QueryUtil();
                    qu.addEqualFilter("binding_id", String.valueOf(bindingIdsFilterString));
                    qu.addEqualFilter("wxuser_id", "0"); // 未发出
                    List<HrHbItemsDO> remainItems = hrDao.getHbItems(qu);

                    Double remain = remainItems.stream().mapToDouble(HrHbItemsDO::getAmount).sum();
                    Integer remainInt = toIntExact(round(remain));
                    if (remainInt < 0) {
                        remainInt = 0;
                    }

                    rpExtInfo.setPid(p.getId());
                    rpExtInfo.setRemain(remainInt);
                    result.add(rpExtInfo);

                } else {
                    // 如果该职位已经不属于任何红包活动，这不做任何操作
                    logger.warn("pid: " + p.getId() + " 已经不属于任何红包活动");
                }
            }
        } catch (TException e) {
            e.printStackTrace();
            return result;
        } finally {

        }
        return result;
    }

    /**
     * @param company_id      公司ID
     * @param department_name 部门名称
     */
    public Response getTeamIdbyDepartmentName(Integer company_id, String department_name) {
        try {
            if (com.moseeker.common.util.StringUtils.isNullOrEmpty(department_name)) {
                return ResponseUtils.fail(ConstantErrorCodeMessage.POSTION_COMPANY_DEPARTMENTI_PARAMETER_BLANK);
            }
            QueryUtil queryUtilDepartment = new QueryUtil();
            queryUtilDepartment.addEqualFilter("company_id", String.valueOf(company_id));
            queryUtilDepartment.addEqualFilter("disable", 0);
            queryUtilDepartment.addEqualFilter("name", department_name);
            HrTeamRecord hrTeamRecord = hrTeamDao.getResource(queryUtilDepartment);
            if (com.moseeker.common.util.StringUtils.isEmptyObject(hrTeamRecord)) {
                return ResponseUtils.fail(ConstantErrorCodeMessage.POSITION_DATA_DEPARTMENT_ERROR);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("team_id", hrTeamRecord.getId());
            return ResponseUtils.success(hashMap);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION_STATUS, e.getMessage());
        }
    }

    /**
     * 根据 hbConfigId 返回职位列表
     *
     * @param hbConfigId 红包活动id
     * @return 红包职位列表
     */
    public List<WechatRpPositionListData> getRpPositionList(int hbConfigId) {
        List<WechatRpPositionListData> result = new ArrayList<>();
        try {
            QueryUtil qu = new QueryUtil();
            qu.addEqualFilter("hb_config_id", String.valueOf(hbConfigId));
            List<HrHbPositionBindingDO> bindings = hrDao.getHbPositionBindings(qu);
            List<Integer> pids = bindings.stream().map(HrHbPositionBindingDO::getPositionId).collect(Collectors.toList());
            String pidFilter = "[" + org.apache.commons.lang.StringUtils.join(pids.toArray(), ",") + "]";

            QueryUtil q = new QueryUtil();
            q.addEqualFilter("id", pidFilter);
            q.setSortby("priority");
            q.setOrder("asc");
            List<JobPositionRecord> jobRecords = jobPositionDao.getResources(q);

            // filter 出已经发完红包的职位
            jobRecords = jobRecords.stream().filter(p -> p.getHbStatus() > 0).collect(Collectors.toList());

            // 拼装职位信息
            for (JobPositionRecord jr : jobRecords) {
                WechatRpPositionListData e = new WechatRpPositionListData();
                e.setTitle(jr.getTitle());
                e.setId(jr.getId());
                e.setSalary_top(jr.getSalaryTop());
                e.setSalary_bottom(jr.getSalaryBottom());
                e.setPublish_date(new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(jr.getUpdateTime()));
                e.setDepartment(jr.getDepartment());
                e.setVisitnum(jr.getVisitnum());
                e.setIn_hb(true);
                e.setCount(jr.getCount());
                e.setCity(jr.getCity());
                result.add(e);
            }

            // 拼装公司信息
            qu = new QueryUtil();
            qu.addEqualFilter("id", String.valueOf(hbConfigId));
            Integer companyId = hrDao.getHbConfig(qu).getCompanyId();
            qu.addEqualFilter("id", String.valueOf(companyId));
            HrCompanyDO company = companyDao.getCompany(qu);
            result.forEach(s -> {
                s.setCompany_abbr(company.getAbbreviation());
                s.setCompany_logo(company.getLogo());
                s.setCompany_name(company.getName());
            });

            // 拼装红包信息
            List<RpExtInfo> rpExtInfoList = getPositionListRpExt(pids);

            result.forEach(s -> {
                RpExtInfo rpInfo = rpExtInfoList.stream().filter(e -> e.getPid() == s.getId()).findFirst().orElse(
                        null);
                if (rpInfo != null) {
                    s.setRemain(rpInfo.getRemain());
                    s.setEmployee_only(rpInfo.isEmployee_only());
                }
            });

        } catch (TException e) {
            e.printStackTrace();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return result;
        } finally {
            // do nothing
        }
        // 查询到职位
        return result;
    }

    public String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }

    /**
     * 内部线程类
     * 用于更改ES索引
     */
    private class UpdateES extends Thread {
        private List<Integer> list;

        public UpdateES(List<Integer> list) {
            this.list = list;
        }

        public void run() {
            String position = "";
            try {
                logger.info("---Start ES Search Engine---");
                for (Integer jobPositionId : list) {
                    Response result = getPositionById(jobPositionId);
                    position = result.data;
                    Map position_map = JSON.parseObject(position, Map.class);
                    String company_id = BeanUtils.converToString(position_map.get("company_id"));
                    CommonQuery query = new CommonQuery();
                    query.putToEqualFilter("id", company_id);
                    Response company_resp = companyServices.getAllCompanies(query);
                    String company = company_resp.data;
                    if (com.moseeker.common.util.StringUtils.isNotNullOrEmpty(company) && company.startsWith("[")) {
                        List company_maps = JSON.parseObject(company, List.class);
                        Map company_map = (Map) company_maps.get(0);
                        String company_name = (String) company_map.get("name");
                        String scale = (String) company_map.get("scale");
                        position_map.put("company_name", company_name);
                        String degree_name = BeanUtils.converToString(position_map.get("degree_name"));
                        Integer degree_above = BeanUtils.converToInteger(position_map.get("degree_above"));
                        if (degree_above == 1) {
                            degree_name = degree_name + "及以上";
                        }
                        position_map.put("degree_name", degree_name);
                        position_map.put("scale", scale);
                        logger.info("position_map:" + position_map.toString());
                    }
                    position = JSON.toJSONString(position_map);
                    logger.info("position:" + position);
                    searchengineServices.updateposition(position, jobPositionId);
                }
                logger.info("--- ES Search Engine end---");
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e.getMessage(), e);
            }
        }
    }


    private String buildQueryIds(List<Integer> idList) {

        if (idList == null || idList.size() == 0) {
            return "[]";
        }

        StringBuffer sb = new StringBuffer();
        for (Integer i : idList) {
            sb.append(String.valueOf(i) + ",");
        }
        return "[" + sb.substring(0, sb.length() - 1) + "]";
    }


    /**
     * 输入的字符是否是汉字
     *
     * @return boolean
     */
    public boolean isChinese(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            int v = str.charAt(i);
            if ((v >= 19968 && v <= 171941)) {
                flag = true;
                break;
            }
        }
        return flag;
    }


}
