package com.moseeker.position.service.fundationbs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.moseeker.baseorm.dao.analyticsd.StJobSimilarityDao;
import com.moseeker.baseorm.dao.dictdb.DictIndustryDao;
import com.moseeker.baseorm.dao.dictdb.DictIndustryTypeDao;
import com.moseeker.baseorm.dao.hrdb.*;
import com.moseeker.baseorm.dao.jobdb.*;
import com.moseeker.baseorm.dao.userdb.UserHrAccountDao;
import com.moseeker.baseorm.dao.userdb.UserUserDao;
import com.moseeker.baseorm.db.dictdb.tables.pojos.DictIndustryType;
import com.moseeker.baseorm.db.jobdb.tables.JobPcRecommendPositionItem;
import com.moseeker.baseorm.redis.RedisClient;
import com.moseeker.common.constants.Constant;
import com.moseeker.common.constants.ConstantErrorCodeMessage;
import com.moseeker.common.providerutils.ResponseUtils;
import com.moseeker.common.util.query.*;
import com.moseeker.entity.PcRevisionEntity;
import com.moseeker.entity.PositionEntity;
import com.moseeker.thrift.gen.dao.struct.analytics.StJobSimilarityDO;
import com.moseeker.thrift.gen.dao.struct.dictdb.DictIndustryDO;
import com.moseeker.thrift.gen.dao.struct.dictdb.DictIndustryTypeDO;
import com.moseeker.thrift.gen.dao.struct.hrdb.*;
import com.moseeker.thrift.gen.dao.struct.jobdb.*;
import com.moseeker.thrift.gen.dao.struct.userdb.UserHrAccountDO;
import com.moseeker.thrift.gen.dao.struct.userdb.UserUserDO;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TSimpleJSONProtocol;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.alibaba.fastjson.JSON;
import com.moseeker.baseorm.dao.campaigndb.CampaignPcRecommendCompanyDao;
import com.moseeker.baseorm.dao.campaigndb.CampaignPcRecommendPositionDao;
import com.moseeker.baseorm.dao.dictdb.DictCityDao;
import com.moseeker.baseorm.dao.jobdb.JobPositionCityDao;
import com.moseeker.baseorm.dao.jobdb.JobPositionDao;
import com.moseeker.common.annotation.iface.CounterIface;
import com.moseeker.common.util.StringUtils;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.dao.struct.campaigndb.CampaignPcRecommendCompanyDO;
import com.moseeker.thrift.gen.dao.struct.campaigndb.CampaignPcRecommendPositionDO;

import javax.annotation.Resource;

/*
 * create by zzt
 * time 2017/6/28
 *
 */
@Service
@Transactional
public class PositionPcService {
	org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CampaignPcRecommendPositionDao campaignPcRecommendPositionDao;
	@Autowired
	private JobPositionDao jobPositionDao;
	@Autowired
	private HrCompanyDao hrCompanyDao;
	@Autowired
	private HrCompanyAccountDao hrCompanyAccountDao;
	@Autowired
	private HrResourceDao  hrResourceDao;
	@Autowired
	private HrCompanyConfDao hrCompanyConfDao;
	@Autowired
	private HrTeamDao hrTeamDao;
	@Autowired
	private CampaignPcRecommendCompanyDao campaignPcRecommendCompanyDao;
	@Autowired
	private PcRevisionEntity pcRevisionEntity;
	@Autowired
	private UserHrAccountDao userHrAccountDao;
	@Autowired
	private StJobSimilarityDao stJobSimilarityDao;
	@Autowired
	private JobPositionExtDao jobPositionExtDao;
	@Autowired
	private JobCustomDao jobCustomDao;
	@Autowired
	private JobOccupationDao  jobOccupationDao;
	@Autowired
	private DictIndustryDao dictIndustryDao;
	@Autowired
	private  JobPcReportedDao jobPcReportedDao;
	@Resource(name = "cacheClient")
	private RedisClient redisClient;
	private static final String POSITION_PC_REPORT = "POSITION_PC_REPORT";
	@Autowired
	private UserUserDao userUserDao;
	@Autowired
	private JobPcAdvertisementDao jobPcAdvertisementDao;
	@Autowired
	private JobPcRecommendPositionsModuleDao jobPcRecommendPositionsModuleDao;
	@Autowired
	private JobPcRecommendPositionItemDao jobPcRecommendPositionItemDao;
	@Autowired
	private HrWxWechatDao hrWxWechatDao;
	@Autowired
	private JobPositionShareTplConfDao jobPositionShareTplConfDao;
	@Autowired
	private DictIndustryTypeDao dictIndustryTypeDao;
	@Autowired
	private PositionEntity positionEntity;
	/*
     * 获取pc首页职位推荐
     */
	@CounterIface
	public Response getRecommendPositionPC(int page,int pageSize) throws TException{
		List<CampaignPcRecommendPositionDO>  list=campaignPcRecommendPositionDao.getPcRemmendPositionIdList(page,pageSize);
		if(list==null||list.size()==0){
			return ResponseUtils.success("");
		}
		List<Integer> positionIds=this.getPCRecommendPositionIds(list);
		List<Map<String,Object>> result=handleDataJDAndPosition(positionIds,3);
		Response res=null;
		if(StringUtils.isEmptyList(result)){
			res= ResponseUtils.success("");
		}else{
			res= ResponseUtils.success(result);
		}
		return res;
	}
	//获取仟寻推荐公司和相关职位信息接口
	@CounterIface
	public Response getQXRecommendCompanyList(int page,int pageSize) throws TException{
		List<CampaignPcRecommendCompanyDO>  CampaignPcRecommendCompanyList=campaignPcRecommendCompanyDao.getCampaignPcRecommendCompanyList(page,pageSize);
		if(StringUtils.isEmptyList(CampaignPcRecommendCompanyList)){
			return  null;
		}
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for(CampaignPcRecommendCompanyDO dO:CampaignPcRecommendCompanyList){
			Map<String,Object> map=new HashMap<String,Object>();
			String companyIds=dO.getCompanyIds();
			map.put("moduleName", dO.getModuleName());
			map.put("moduleDescription", dO.getModuleDescription());
			List<Integer> companyIdList=new ArrayList<Integer>();
			String [] ids=companyIds.split(",");
			for(int i=0;i<ids.length;i++){
				companyIdList.add(Integer.parseInt(ids[i]));
			}
			List<Map<String,Object>> result=handleRecommendPcCompanyData(companyIdList);
			map.put("data", result);
			list.add(map);
		}
		Response res= ResponseUtils.success(list);
		return res;
	}
	/*
      获取职位详情
     */
	@CounterIface
	public Map<String,Object> getPositionDetails(int positionId) throws Exception {
		Map<String,Object> map=new HashMap<String,Object>();
		Query query=new Query.QueryBuilder().where("id",positionId).and("status",0).buildQuery();
		JobPositionDO  DO=jobPositionDao.getData(query);
		if(DO==null){
			return null;
		}
		/*
		 处理新的职位福利特色，兼容php老代码，不至于改了基础服务，PC端无法使用
		 */
		String feature=getPositionFeature(positionId);
		DO.setFeature(feature);
		this.handlerForPositionDetail(map,DO,positionId);
		return map;
	}
	@CounterIface
	public Map<String,Object> getMiniPositionDetails(int positionId) throws Exception {
		Map<String,Object> map=new HashMap<String,Object>();
		Query query=new Query.QueryBuilder().where("id",positionId).buildQuery();
		JobPositionDO  DO=jobPositionDao.getData(query);
		if(DO==null){
			return null;
		}
			/*
		 处理新的职位福利特色，兼容php老代码，不至于改了基础服务，PC端无法使用
		 */
		String feature=getPositionFeature(positionId);
		DO.setFeature(feature);

		this.handlerForPositionDetail(map,DO,positionId);
		//获取母公司龚公众号
		Map<String,Object> wxData=this.getHrWxChatBtyCompanyId(DO.getCompanyId());
		if(wxData!=null&&!wxData.isEmpty()){
			map.put("wx",wxData);
		}


		return map;
	}
	private Map<String,Object> getIndustryPic(int type) throws TException {
		Query query1=new Query.QueryBuilder().where("code",type).buildQuery();
		DictIndustryTypeDO DO=dictIndustryTypeDao.getData(query1);
		if(DO!=null){
			String DOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(DO);
			Map<String,Object> data= JSON.parseObject(DOs, Map.class);
			return data;
		}
		return null;
	}
	/*
	 获取母公司的公众号信息
	 */
	private Map<String,Object> getHrWxChatBtyCompanyId(int companyId) throws TException {
		Query query=new Query.QueryBuilder().where("company_id",companyId).buildQuery();
		HrWxWechatDO DO=hrWxWechatDao.getData(query);
		if(DO!=null){
			String DOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(DO);
			Map<String,Object> wxData= JSON.parseObject(DOs, Map.class);
			return wxData;
		}
		return null;
	}
	//获取公司分享末班
	private Map<String,Object> getJobShareTplConf(double id) throws TException {
		Query query=new Query.QueryBuilder().where("id",id).buildQuery();
		JobPositionShareTplConfDO DO= jobPositionShareTplConfDao.getData(query);
		if(DO!=null){
			String DOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(DO);
			Map<String,Object> tplData= JSON.parseObject(DOs, Map.class);
			return tplData;
		}
		return null;
	}
	/*
	 提取小程序获取职位详情和pc端获取职位详情的公共部分，组装成公共方法
	 */
	private void handlerForPositionDetail(Map<String,Object> map,JobPositionDO  DO,int positionId) throws Exception {
		String DOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(DO);
		Map<String,Object> positionData= JSON.parseObject(DOs, Map.class);
		map.put("position",positionData);
		int teamId=DO.getTeamId();
		int publisher=DO.getPublisher();
		Map<String,Object> team=this.handleTeamData(teamId);
		map.put("team",team);
		if(teamId!=0){
			int num=this.getTeamPositionNum(teamId);
			map.put("teamPositionNum",num);
		}
		HrCompanyDO companyDO= handleCompanyData(publisher);
		if(companyDO!=null){
			String industryName=companyDO.getIndustry();
			if(StringUtils.isNotNullOrEmpty(industryName)){
				DictIndustryDO industryDO=getDictIndustryByName(industryName);
				if(industryDO!=null){
					String industryDOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(industryDO);
					Map<String,Object> industryData= JSON.parseObject(industryDOs, Map.class);
					map.put("industryData",industryData);
					Map<String,Object> industryPics=this.getIndustryPic(industryDO.getType());
					if(industryPics!=null&&!industryPics.isEmpty()){
						map.put("industryType",industryPics);
					}
				}
			}
			String companyDOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(companyDO);
			Map<String,Object> companyData= JSON.parseObject(companyDOs, Map.class);
			map.put("company",companyData);
			int parentId= (int) companyData.get("parentId");
			int confCompanyId= (int) companyData.get("id");
			if(parentId!=0){
				confCompanyId=parentId;
			}
			this.handlePositionJdData(confCompanyId,map,teamId);
			Map<String,Object> customField=this.handleCustomField(positionId,confCompanyId);
			map.put("customField",customField);
		}
	}

	/*
	 修改福利特色
	 */
	public String getPositionFeature(int pid){
		List<Map<String,Object>> list= positionEntity.getPositionFeatureList(pid);
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		String features="";
		for(Map<String,Object> map:list){
			String feature=(String)map.get("feature");
			if(StringUtils.isNotNullOrEmpty(feature)){
				features+=feature+"#";
			}
		}
		if(StringUtils.isNotNullOrEmpty(features)){
			features=features.substring(0,features.lastIndexOf("#"));
		}
		return features;
	}
	//添加举报信息
	@CounterIface
	public  Response addPositionReport(JobPcReportedDO DO){
		String positionReport = redisClient.get(Constant.APPID_ALPHADOG, POSITION_PC_REPORT,
				String.valueOf(DO.getUserId()), String.valueOf(DO.getPositionId()));
		if(positionReport!=null){
			return ResponseUtils.fail(1,"举报职位过度频繁");
		}
		int userId=DO.getUserId();
		Query query=new Query.QueryBuilder().where("id",userId).and("is_disable",0).buildQuery();
		UserUserDO userUserDO=userUserDao.getData(query);
		if(userUserDO==null){
			return ResponseUtils.fail(1,"该用户不存在");
		}
		Query query1=new Query.QueryBuilder().where("id",DO.getPositionId()).and("status",0).buildQuery();
		JobPositionDO PositionDO=jobPositionDao.getData(query1);
		if(PositionDO==null){
			return ResponseUtils.fail(1,"该职位不存在");
		}
		JobPcReportedDO reportDO=jobPcReportedDao.addData(DO);
		if(reportDO!=null&&reportDO.getId()>0){
			redisClient.set(Constant.APPID_ALPHADOG, POSITION_PC_REPORT,
					String.valueOf(DO.getUserId()), String.valueOf(DO.getPositionId()),JSON.toJSONString(reportDO));
			return ResponseUtils.success("");
		}
		return ResponseUtils.fail(1,"举报职位失败");
	}


	/*
	  获取pc端的广告位
	 */
	@CounterIface
	public List<Map<String,Object>> getAdvertisement(int page,int pageSize) throws TException {
		List<Map<String,Object>> result=new ArrayList<Map<String, Object>>();
		Query query=new Query.QueryBuilder().setPageNum(page).setPageSize(pageSize).buildQuery();
		List<JobPcAdvertisementDO> list=jobPcAdvertisementDao.getDatas(query);
		if(StringUtils.isEmptyList(list)){
			return result;
		}
		for(JobPcAdvertisementDO DO:list){
			String DOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(DO);
			Map<String,Object> jobPcAdvertisementDOs= JSON.parseObject(DOs, Map.class);
			result.add(jobPcAdvertisementDOs);
		}
		return result;
	}
	/*
	 根据模块id获取职位信息
	 */
	@CounterIface
	public Map<String,Object> getModuleRecommendPosition(int page,int pageSize,int moduleId) throws TException {
		Map<String,Object> map=new HashMap<>();
		JobPcRecommendPositionsModuleDO jobPcRecommendPositionsModuleDO=getJobPcRecommendPositionsModuleDOById(moduleId);
		if(jobPcRecommendPositionsModuleDO==null){
			return map;
		}
		Map<String,Object> positionMap=handleModuleRecommendPosition(page,pageSize,moduleId);
		if(positionMap==null&&positionMap.isEmpty()){
			return null;
		}
		String DOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(jobPcRecommendPositionsModuleDO);
		Map<String,Object> ModuleDOMap= JSON.parseObject(DOs, Map.class);
//		int totalnum=handleModulePositionNum(moduleId);
		List<Map<String,Object>> positionList= (List<Map<String, Object>>) positionMap.get("list");
		map.put("module",ModuleDOMap);
		map.put("position",positionList);
		map.put("totalnum",positionMap.get("num"));
		return map;
	}
	/*
	  根据id获取模块内容
	 */
	public JobPcRecommendPositionsModuleDO getJobPcRecommendPositionsModuleDOById(int moduleId){
		Query query=new Query.QueryBuilder().where("id",moduleId).and("status",1).buildQuery();
		JobPcRecommendPositionsModuleDO jobPcRecommendPositionsModuleDO=jobPcRecommendPositionsModuleDao.getData(query);
		return jobPcRecommendPositionsModuleDO;
	}
	/*
		获取该模块下所有的items
	 */
	public List<JobPcRecommendPositionItemDO> getJobPcRecommendPositionItemDOByModuleId(int moduleId){
		Query query=new Query.QueryBuilder().where("module_id",moduleId).and("status",1).orderBy("id", Order.DESC).buildQuery();
		List<JobPcRecommendPositionItemDO> list=jobPcRecommendPositionItemDao.getDatas(query);
		return list;
	}
	/*
		获取所有的positionid
	 */
	public List<Integer> getPositionIdByJobPcRecommendPositionItemDOList(List<JobPcRecommendPositionItemDO> list){
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		List<Integer> result=new ArrayList<>();
		for(JobPcRecommendPositionItemDO DO:list){
			result.add(DO.getPositionId());
		}
		return result;
	}
	/*
		处理推荐模块获取职位信息
	 */
	public Map<String,Object> handleModuleRecommendPosition(int page,int pageSize,int moduleId) throws TException {
		List<JobPcRecommendPositionItemDO> itemsList=getJobPcRecommendPositionItemDOByModuleId(moduleId);
		List<Integer> positionIdList=getPositionIdByJobPcRecommendPositionItemDOList(itemsList);
		List<Map<String,Object>> result=handleDataJDAndPosition(positionIdList,3);
		List<Map<String,Object>> list=new ArrayList<>();
		Map<String,Object> map=new HashMap<>();
		if(StringUtils.isEmptyList(result)){
			return null;
		}
		if(result.size()>=page*pageSize){
			for(int i=(page-1)*pageSize;i<page*pageSize;i++){
				list.add(result.get(i));
			}
		}else{
			if((page-1)*pageSize>result.size()){
				return null;
			}else{
				for(int i=(page-1)*pageSize;i<result.size();i++){
					list.add(result.get(i));
				}
			}
		}
		map.put("list",list);
		map.put("num",result.size());
		return map;
	}
	/*
	 获取该模块的item的总数
	 */
	public int handleModulePositionNum(int moduleId){
		List<JobPcRecommendPositionItemDO> jobPcRecommendPositionItemDOS=getRecommendPositionItemByModuleId(moduleId);
		List<Integer> positionIdList=getPositionIdByJobPcRecommendPositionItemDOs(jobPcRecommendPositionItemDOS);
		return getPositionNumByIdList(positionIdList);
	}
	/*
	 获取推荐职位模块下的具体推荐项
	 */
	public List<JobPcRecommendPositionItemDO> getRecommendPositionItemByModuleId(int moduleId){
		Query query=new Query.QueryBuilder().where("module_id",moduleId).and("status",1).buildQuery();
		List<JobPcRecommendPositionItemDO> jobPcRecommendPositionItemDOs=jobPcRecommendPositionItemDao.getDatas(query);
		return jobPcRecommendPositionItemDOs;
	}
	//根据JobPcRecommendPositionItemDO的list获取positionid

	public List<Integer> getPositionIdByJobPcRecommendPositionItemDOs(List<JobPcRecommendPositionItemDO> list){
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		List<Integer> result=new ArrayList<Integer>();
		for(JobPcRecommendPositionItemDO DO:list){
			result.add(DO.getPositionId());
		}
		return result;
	}
	/*
	根据position。id获取position的数量
	 */
	public int getPositionNumByIdList(List<Integer> positionIdList){
		if(StringUtils.isEmptyList(positionIdList)){
			return 0;
		}
		Query query=new Query.QueryBuilder().where(new Condition("id",positionIdList.toArray(),ValueOp.IN)).and("status",0).buildQuery();
		int num=jobPositionDao.getCount(query);
		return num;
	}
	//获取自定义字段
	public Map<String,Object> handleCustomField(int positionId,int companyId){
		Map<String,Object> map=new HashMap<String,Object>();
		JobPositionExtDO extDO=this.getJobPositionExt(positionId);
		if(extDO!=null){
			int customId=extDO.getJobCustomId();
			int occupationId=extDO.getJobOccupationId();
			if(customId!=0||occupationId!=0){
				Map<String,String> custom=this.handleCustomData(customId,companyId);
				if(custom!=null&&!custom.isEmpty()){
					map.put("custom",custom);
				}
				Map<String,String> occupation=this.handleOccupationData(occupationId,companyId);
				if(occupation!=null&&!occupation.isEmpty()){
					map.put("occupation",occupation);
				}
			}
		}
		return map;
	}
	//处理自定义字段数据
	private Map<String,String> handleCustomData(int customId,int companyId){
		Map<String,String> custom=new HashMap<>();
		if(customId!=0){
			JobCustomDO customDO=getJobCustom(customId);
			if(customDO!=null){
				String customContent=customDO.getName();
				if(StringUtils.isNotNullOrEmpty(customContent)){
					HrCompanyConfDO conf=getHrCompanyConf(companyId);
					custom.put("content",customContent);
					String customName="自定义";
					if(conf!=null&&StringUtils.isNotNullOrEmpty(conf.getJobCustomTitle())){
						customName=conf.getJobCustomTitle();
					}
					custom.put("name",customName);
				}
			}

		}

		return custom;
	}
	//处理职位职能数据
	public Map<String,String> handleOccupationData(int occupationId,int companyId){
		Map<String, String> occupationMap = new HashMap<>();
		if(occupationId!=0){
			JobOccupationDO occupationDO=getJobOccupation(occupationId);
			if(occupationDO!=null){
				String occupation=occupationDO.getName();
				if(StringUtils.isNotNullOrEmpty(occupation)) {
					HrCompanyConfDO conf=getHrCompanyConf(companyId);
					occupationMap.put("content", occupation);
					String occupationName="职位职能";
					if(conf!=null&&StringUtils.isNotNullOrEmpty(conf.getJobOccupation())){
						occupationName=conf.getJobOccupation();
					}
					occupationMap.put("name",occupationName);
				}
			}
		}
		return occupationMap;
	}
	//获取Job_Position_Ext
	private JobPositionExtDO getJobPositionExt(int positionId){
		Query query=new Query.QueryBuilder().where("pid",positionId).buildQuery();
		JobPositionExtDO DO=jobPositionExtDao.getData(query);
		return DO;
	}
	//获取job_position_custom
	public JobCustomDO getJobCustom(int customId){
		Query query=new Query.QueryBuilder().where("id",customId).and("status",1).buildQuery();
		JobCustomDO DO=jobCustomDao.getData(query);
		return DO;
	}
	//获取job_position_custom
	public JobOccupationDO getJobOccupation(int occupationId){
		Query query=new Query.QueryBuilder().where("id",occupationId).and("status",1).buildQuery();
		JobOccupationDO DO=jobOccupationDao.getData(query);
		return DO;
	}
	//获取企业配置信息

	//获取团队下职位数量
	public int getTeamPositionNum(int teamId){
		Query query=new Query.QueryBuilder().where("team_id",teamId).and("status",0).buildQuery();
		int num=jobPositionDao.getCount(query);
		return num;
	}
	/*
       获取推荐职位的信息
     */
	public List<Map<String,Object>> getRecommendPosition(int positionId,int page,int pageSize) throws TException {
		List<Integer> positionIdList=getRecommendPositionidList(positionId, page, pageSize);
		List<Map<String,Object>> result=handleDataJDAndPosition(positionIdList,3);
		return result;
	}
	/*
      获取相关职位的推荐职位
     */
	public List<Integer> getRecommendPositionidList(int positionId,int page,int pageSize){
		JobPositionDO positionDO=getSinglePosition(positionId);
		if(positionDO==null){
			return null;
		}
		int publisher=positionDO.getPublisher();
		HrCompanyAccountDO companyAccountDO=this.getSingleCompanyAccount(publisher);
		if(companyAccountDO==null){
			return null;
		}
		int companyId=companyAccountDO.getCompanyId();
		HrCompanyDO companyDO=getSingleCompany(companyId);
		int parentId=companyDO.getParentId();
		List<Integer> positionIdList=new ArrayList<Integer>();
		if(parentId!=0){
			positionIdList=getChildRecommendPosition(companyId,positionId,page,pageSize);
		}else{
			positionIdList=getMotherRecommendPosition(companyId,positionId,page,pageSize);
		}
		return positionIdList;
	}
	/*
       获取单个职位
     */
	public JobPositionDO getSinglePosition(int positionId){
		Query query=new Query.QueryBuilder().where("id",positionId).and("status",0).buildQuery();
		JobPositionDO DO=jobPositionDao.getData(query);
		return DO;
	}
	/*
     根据publisher获取hr_company_account
     */
	public HrCompanyAccountDO  getSingleCompanyAccount(int publisher){
		Query query=new Query.QueryBuilder().where("account_id",publisher).buildQuery();
		HrCompanyAccountDO DO=hrCompanyAccountDao.getData(query);
		return DO;
	}

	/*
     获取母公司的推荐职位
     */
	public List<Integer> getMotherRecommendPosition(int companyId,int positionId,int page,int pageSize){
		List<UserHrAccountDO>  userHrAccountList=getUserHrAccountDOS(companyId);
		List<Integer> publisher=getPublisherByUserHrAccount(userHrAccountList);
		List<HrCompanyAccountDO> companyAccountDOList=getCompanyAccountList(publisher);
		List<Integer> companyIdList=getHrCompanyIdList(companyAccountDOList);
		if(StringUtils.isEmptyList(companyIdList)){
			return null;
		}
		List<StJobSimilarityDO> StJobSimilarityDOList=getStJobSimilarityDOList(companyIdList,positionId,page,pageSize);
		List<Integer> positionIdList=getPositionListByStJobSimilarityDOList(StJobSimilarityDOList);
		return positionIdList;
	}
	/*
      获取所有的推荐职位
     */
	public List<StJobSimilarityDO> getStJobSimilarityDOList(List<Integer> companyIdList,int positionId,int page,int pageSize){
		if(StringUtils.isEmptyList(companyIdList)){
			return null;
		}
		Query query=new Query.QueryBuilder()
				.where(new Condition("department_id",companyIdList.toArray(),ValueOp.IN))
				.and("pos_id",positionId)
				.setPageNum(page)
				.setPageSize(pageSize)
				.buildQuery();
		List<StJobSimilarityDO> list=stJobSimilarityDao.getDatas(query);
		return list;
	}
	/*
     获取job_position.id的list
     */
	public List<Integer> getPositionListByStJobSimilarityDOList(List<StJobSimilarityDO> list){
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		List<Integer> result=new ArrayList<Integer>();
		for(StJobSimilarityDO DO:list){
			result.add(DO.getRecomId());
		}
		return result;
	}
	/*
     获取userhraccount的信息
     */
	public List<UserHrAccountDO> getUserHrAccountDOS(int companyId){
		Query query=new Query.QueryBuilder().where("company_id",companyId).buildQuery();
		List<UserHrAccountDO> list=userHrAccountDao.getDatas(query);
		return list;
	}
	/*
      通过userhraccount获取publisher列表
     */
	public List<Integer> getPublisherByUserHrAccount(List<UserHrAccountDO> userHrAccountList){
		List<Integer> list=new ArrayList<Integer>();
		if(StringUtils.isEmptyList(userHrAccountList)){
			return null;
		}
		for(UserHrAccountDO DO:userHrAccountList){
			list.add(DO.getId());
		}
		return list;
	}

	/*
     获取子公司的推荐职位
     */
	public List<Integer> getChildRecommendPosition(int companyId,int positionId,int page,int pageSize){
		List<Integer> companyIdList=new ArrayList<Integer>();
		companyIdList.add(companyId);
		List<StJobSimilarityDO> list=getStJobSimilarityDOList(companyIdList,positionId,page,pageSize);
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		List<Integer> result=new ArrayList<Integer>();
		for(StJobSimilarityDO DO:list){
			result.add(DO.getRecomId());

		}
		return result;
	}
	/*
    获取推荐职位的id
     */
    /*
        获取职位的jd页
     */
	private void handlePositionJdData(int confCompanyId,Map<String,Object> map,int teamId) throws Exception {
		map.put("newJd",0);
		HrCompanyConfDO hrCompanyConfDO=getHrCompanyConf(confCompanyId);
		if(hrCompanyConfDO!=null){
			int newJdStatus=hrCompanyConfDO.getNewjdStatus();
			if(newJdStatus==2) {
				List<Integer> jdID = new ArrayList<Integer>();
				jdID.add(teamId);
				List<Map<String,Object>>jdList=pcRevisionEntity.HandleCmsResource(jdID,3);
				if(!StringUtils.isEmptyList(jdList)){
					Map<String,Object> jdMap=jdList.get(0);
					if(jdMap!=null&&!jdMap.isEmpty()){
						map.put("newJd",1);
						map.put("jd",jdMap);
					}
				}
			}
		}
	}
	/*
      获取公司配置
    */
	public HrCompanyConfDO getHrCompanyConf(int companyId){
		Query query=new Query.QueryBuilder().where("company_id",companyId).buildQuery();
		HrCompanyConfDO DO= hrCompanyConfDao.getData(query);
		return DO;
	}
	/*
        获取发布职位的公司信息
     */
	public HrCompanyAccountDO getSingleCompanyId(int publisher){
		Query query=new Query.QueryBuilder().where("account_id",publisher).buildQuery();
		HrCompanyAccountDO DO=hrCompanyAccountDao.getData(query);
		return DO;
	}
	/*
       获取单个企业的信息
     */
	public HrCompanyDO getSingleCompany(int companyId){
		HrCompanyDO DO=hrCompanyDao.getCompanyById(companyId);
		return DO;
	}
	/*
      处理职位的公司数据
     */
	private HrCompanyDO handleCompanyData(int publisher){
		HrCompanyAccountDO accountDO=this.getSingleCompanyId(publisher);
		HrCompanyDO companyDO=this.getSingleCompany(accountDO.getCompanyId());
		if(companyDO!=null){
			int parentId=companyDO.getParentId();
			if(parentId!=0){
				HrCompanyDO companyParent=this.getSingleCompany(parentId);
				if(StringUtils.isNullOrEmpty(companyDO.getImpression())){
					String impression=companyParent.getImpression();
					companyDO.setImpression(impression);
				}
				if(StringUtils.isNullOrEmpty(companyDO.getBanner())){
					String banner=companyParent.getBanner();
					companyDO.setBanner(banner);
				}
			}
		}

		return companyDO;
	}
	/*
        获取团队信息
     */
	public HrTeamDO getSingleTeamInfo(int teamId){
		HrTeamDO DO=hrTeamDao.getHrTeam(teamId);
		return DO;
	}
	/*
       处理团队数据
     */
	private  Map<String,Object> handleTeamData(int teamId) throws TException{
		Map<String,Object> map=new HashMap<String,Object>();
		HrTeamDO teamDO=getSingleTeamInfo(teamId);
		if(teamDO==null){
			return map;
		}
		String teamDOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(teamDO);
		Map<String,Object> teamData= JSON.parseObject(teamDOs, Map.class);
		map.put("teamInfo",teamData);
		int resId=teamDO.getResId();
		if(resId>0){
			List<Integer> resIdList=new ArrayList<Integer>();
			resIdList.add(resId);
			List<HrResourceDO> resourceDOList=hrResourceDao.getHrResourceByIdList(resIdList);
			if(!StringUtils.isEmptyList(resourceDOList)){
				HrResourceDO resourceDO=resourceDOList.get(0);
				String resourceDOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(resourceDO);
				Map<String,Object> resourceData= JSON.parseObject(resourceDOs, Map.class);
				map.put("teamPic",resourceData);
			}
		}
		List<Integer> teamIdList=new ArrayList<>();
		teamIdList.add(teamId);
		Map<Integer,List<Map<String,Object>>> teamMember=pcRevisionEntity.handlerTeamMember(teamIdList);
		if(teamMember!=null&&!teamMember.isEmpty()){
			List<Map<String,Object>> list=teamMember.get(teamId);
			map.put("teamMember",list);
		}
		return map;
	}
	/*
     * 根据推荐职位列表获取职位id
     */
	private List<Integer> getPCRecommendPositionIds(List<CampaignPcRecommendPositionDO> list){
		if(list==null||list.size()==0){
			return null;
		}
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++){
			CampaignPcRecommendPositionDO record=list.get(i);
			result.add(record.getPositionId());
		}
		return result;
	}

	/*
        获取publisher的列表
    */
	private List<Integer> getPublisherIdList(List<JobPositionDO> list){
		if(list==null||list.size()==0){
			return null;
		}
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++){
			JobPositionDO positionDO=list.get(i);
			result.add(positionDO.getPublisher());
		}
		return result;
	}
	/*
    获取publisher和companyId的对应关系集合
     */
	private List<Map<String,Integer>> getPublisherCompanyId(List<HrCompanyAccountDO> list){
		if(list==null||list.size()==0){
			return null;
		}
		List<Map<String,Integer>> result=new ArrayList<Map<String,Integer>>();
		Map<String,Integer> map=null;
		for(HrCompanyAccountDO DO:list){
			int publisher=DO.getAccountId();
			int companyId=DO.getCompanyId();
			map=new HashMap<String,Integer>();
			map.put("companyId",companyId);
			map.put("publisher",publisher);
			result.add(map);
		}
		return result;
	}
	//获取hrcompanyAccount列表
	public List<HrCompanyAccountDO> getCompanyAccountList(List<Integer> list){
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		Query query=new Query.QueryBuilder().where(new Condition("account_id",list.toArray(),ValueOp.IN)).buildQuery();
		List<HrCompanyAccountDO> records=hrCompanyAccountDao.getDatas(query);
		return records;
	}
	/*
     * 通过publisher的id列表获取公司的id列表
     */
	public List<Integer> getHrCompanyIdList(List<HrCompanyAccountDO> list){
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		List<Integer> result=new ArrayList<Integer>();
		for(HrCompanyAccountDO DO:list){
			result.add(DO.getCompanyId());
		}
		return result;
	}

	/*
        获取所有有jd的公司
     */
	public List<Integer> getJdCompanyIds(List<HrCompanyConfDO>  list){
		if(list==null||list.size()==0){
			return null;
		}
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++){
			HrCompanyConfDO confDO=list.get(i);
			result.add(confDO.getCompanyId());
		}
		return result;
	}

	/*
       获取团队列表
     */
	public List<Integer> getTeamIdList(List<JobPositionDO> list){
		if(list==null||list.size()==0){
			return null;
		}
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++){
			JobPositionDO positionDO=list.get(i);
			result.add(positionDO.getTeamId());
		}
		return result;
	}
	/*
     *处理position和company的数据
     */
	public List<Map<String,Object>> handleCompanyAndPositionData(List<JobPositionDO> positionList, List<HrCompanyDO> companyList,List<HrTeamDO> teamList
			,List<Map<String,Integer>> publisherAndCompanyId,Map<Integer,List<String>> positionCitys) throws TException{
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		if(positionList==null||positionList.size()==0){
			return null;
		}
		List<String> industryNameList=this.getIndustryName(companyList);
		List<DictIndustryDO> industryList=this.getDictIndustryListByName(industryNameList);
		for(int i=0;i<positionList.size();i++){
			JobPositionDO positionDo=positionList.get(i);
			int publisher=positionDo.getPublisher();
			int teamId=positionDo.getTeamId();
			int positionId=positionDo.getId();
			Map<String,Object> map=new HashMap<String,Object>();
			if(!StringUtils.isEmptyList(companyList)){
				for(int j=0;j<companyList.size();j++){
					HrCompanyDO companyDO=companyList.get(j);
					int companyId=companyDO.getId();
					int parentId=companyDO.getParentId();
					// 本处如此做是为了过滤掉已经删除的子公司的信息
					if(!StringUtils.isEmptyList(publisherAndCompanyId)){
						for(int z=0;z<publisherAndCompanyId.size();z++){
							Map<String,Integer> maps=publisherAndCompanyId.get(z);
							Integer oripublisher=maps.get("publisher");
							Integer oriCompanyid=maps.get("companyId");
							if(oripublisher!=null&&oripublisher==publisher&&oriCompanyid!=null&&oriCompanyid==companyId){
								String companyDOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(companyDO);
								Map<String,Object> companyData=JSON.parseObject(companyDOs, Map.class);
								String positionDOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(positionDo);
								Map<String,Object> positionData=JSON.parseObject(positionDOs, Map.class);
								map.put("position", positionData);
								map.put("company",companyData);
								break;
							}
						}
					}
					if(map.get("position")!=null){
						String industryName=companyDO.getIndustry();
						if(!StringUtils.isEmptyList(industryList)&&StringUtils.isNotNullOrEmpty(industryName)){
							for(DictIndustryDO dictIndustryDO:industryList){
								String name=dictIndustryDO.getName();
								if(name.equals(industryName)){
									String industryDOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(dictIndustryDO);
									Map<String,Object> industryData=JSON.parseObject(industryDOs, Map.class);
									map.put("industryData",industryData);
									break;
								}
							}
						}
					}
				}
				if(map.get("position")!=null){
					if(positionCitys!=null&&!positionCitys.isEmpty()&&!map.isEmpty()){
						if(positionCitys.get(positionId)!=null){
							map.put("cityList", positionCitys.get(positionId));
						}
					}
				}

			}
			// 本处如此做是为了过滤掉已经删除的子公司的信息
			if(!map.isEmpty()){
				for(HrTeamDO teamDo:teamList){
					int id=teamDo.getId();
					if(teamId==id){
						String teamDos=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(teamDo);
						Map<String,Object> teamData=JSON.parseObject(teamDos, Map.class);
						map.put("team",teamData);
					}
				}
				list.add(map);
			}
		}

		return list;
	}
	/*
       获取有jd的团队列表
     */
	public List<Integer> getJdTeamIdList(List<Integer> companyIds,List<HrTeamDO> list){
		List<Integer> result=new ArrayList<Integer>();
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		for(HrTeamDO teamDO :list){
			int companyId=teamDO.getCompanyId();
			int teamId=teamDO.getId();
			if(!StringUtils.isEmptyList(companyIds)){
				for(Integer id:companyIds){
					if(id==companyId){
						result.add(teamId);
					}
				}
			}

		}
		return result;
	}
	/*
       处理position 或者 Team jd页数据，获取首张图片
     */
	public List<Map<String,Object>> handlePositionJdPic(List<HrTeamDO> teamList,List<Integer> companyIds,int type) throws TException{
		List<HrCompanyConfDO> AccountList=hrCompanyConfDao.getHrCompanyConfByCompanyIds(companyIds);
		List<Integer> jdCompanyids=this.getJdCompanyIds(AccountList);
		List<Integer> jdTeamids=this.getJdTeamIdList(jdCompanyids,teamList);
		List<Map<String,Object>> list=pcRevisionEntity.HandleCmsResource(jdTeamids,type);
		return list;
	}
	/*
     总体上处理数据
      */
	public List<Map<String,Object>> handleDataJDAndPosition(List<Integer> positionIds,int type) throws TException{
		if(StringUtils.isEmptyList(positionIds)){
			return  null;
		}
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		List<JobPositionDO> positionList=this.orderPosition(positionIds,jobPositionDao.getPositionList(positionIds));
		List<Integer> publisherIds=this.getPublisherIdList(positionList);
		List<HrCompanyAccountDO> companyAccountList= getCompanyAccountList(publisherIds);
		List<Integer> compantIds=this.getHrCompanyIdList(companyAccountList);
		List<HrCompanyDO> companyList=hrCompanyDao.getHrCompanyByCompanyIds(compantIds);
		companyList=this.filterCompanyList(companyList);
		companyList=this.handlerCompanys(companyList);
		List<Map<String,Integer>> publisherAndCompanyId=getPublisherCompanyId(companyAccountList);
		List<Integer> teamIds=this.getTeamIdList(positionList);
		List<HrTeamDO> teamList=hrTeamDao.getTeamList(teamIds);
		Map<Integer,List<String>> positionCitys=pcRevisionEntity.handlePositionCity(positionIds);
		list=this.handleCompanyAndPositionData(positionList,companyList,teamList,publisherAndCompanyId,positionCitys);
		List<Map<String,Object>> jdpictureList=this.handlePositionJdPic(teamList,this.getPositionCompanyId(positionList),type);
		this.handleJDAndPosition(list, jdpictureList);
		return list;
	}
	//将数据库中查出的职位列表按照原有顺序返回
	private List<JobPositionDO> orderPosition(List<Integer> positionIds,List<JobPositionDO> positionList){
		List<JobPositionDO> list=new ArrayList<>();
		for(Integer pid:positionIds){
			for(JobPositionDO DO:positionList){
				int positionId=DO.getId();
				if(pid==positionId){
					list.add(DO);
				}
			}
		}
		return list;
	}
	//处理 公司的顺序
	private  List<HrCompanyDO> orderCompany(List<Integer> companyIds,List<HrCompanyDO> list){
		List<HrCompanyDO> result=new ArrayList<>();
		if(StringUtils.isEmptyList(list)){
			return result;
		}
		for(Integer companyId:companyIds){
			for(HrCompanyDO DO:list){
				int id=DO.getId();
				if(id==companyId){
					result.add(DO);
				}
			}
		}
		return result;
	}
	//获取职位中的company_id列表
	private List<Integer> getPositionCompanyId(List<JobPositionDO> positionList){
		if(StringUtils.isEmptyList(positionList)){
			return null;
		}
		List<Integer> list=new ArrayList<Integer>();
		for(JobPositionDO DO:positionList){
			list.add(DO.getCompanyId());
		}
		return list;
	}
	//处理jd页和position的信息
	private void handleJDAndPosition( List<Map<String,Object>> list, List<Map<String,Object>> jdpictureList){
		if(!StringUtils.isEmptyList(jdpictureList)){
			for(Map<String,Object> map:jdpictureList){
				Integer configId=(Integer)map.get("configId");
				String picture=(String)map.get("imgUrl");
				for(Map<String,Object> map1:list){
					Map<String,Object> teamDO=(Map<String, Object>) map1.get("team");
					if(teamDO!=null&&!teamDO.isEmpty()){
						int id=(int) teamDO.get("id");
						if(id==configId){
							map1.put("jdPic",picture);
						}
					}
				}
			}

		}
	}
	//获取全部公司
	public List<Map<String,Object>> getAllCompanyRecommend(int page,int pageSize) throws TException{
		List<CampaignPcRecommendCompanyDO>  CampaignPcRecommendCompanyList=campaignPcRecommendCompanyDao.getCampaignPcRecommendCompanyList(page,pageSize);
		if(StringUtils.isEmptyList(CampaignPcRecommendCompanyList)){
			return  null;
		}
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		List<Integer> companyIdList=new ArrayList<Integer>();
		for(CampaignPcRecommendCompanyDO dO:CampaignPcRecommendCompanyList){
			String companyIds=dO.getCompanyIds();
			String [] ids=companyIds.split(",");
			for(int i=0;i<ids.length;i++){
				companyIdList.add(Integer.parseInt(ids[i]));
			}
		}
		List<Map<String,Object>> result=handleRecommendPcCompanyData(companyIdList);
		return result;
	}
	//获取所有公司
	public List<Integer> getAllCompanyIds(Map<Integer,Set<Integer>> data){
		if(data==null||data.isEmpty()){
			return null;
		}
		List<Integer> companyIdList=new ArrayList<Integer>();
		for(Integer key:data.keySet()){
			companyIdList.addAll(data.get(key));
		}
		return companyIdList;
	}



	/*
     * 获取该公司id列表下的职位数量
     */
	public int getPositionNum(List<Integer> publisherIds){
		if(StringUtils.isEmptyList(publisherIds)){
			return  0;
		}
		Query query=new Query.QueryBuilder()
				.where(new Condition("publisher",publisherIds.toArray(),ValueOp.IN))
				.and("status",0).buildQuery();
		int num=jobPositionDao.getCount(query);
		return num;
	}
	/*
     *  获取companyIds的list集合
     */
	public List<Integer> getCompanyIds(List<HrCompanyDO> list){
		if(StringUtils.isEmptyList(list)){
			return  null;
		}
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++){
			HrCompanyDO companyDO=list.get(i);
			result.add(companyDO.getId());
		}
		return result;
	}
	/*
     * 处理数据获取千寻推荐企业严选数据
     */
	public List<Map<String,Object>> handleRecommendPcCompanyData(List<Integer> companyIds) throws TException{
		if(StringUtils.isEmptyList(companyIds)){
			return  null;
		}
		List<HrCompanyDO> companyList=hrCompanyDao.getHrCompanyByCompanyIds(companyIds);
		if(StringUtils.isEmptyList(companyList)){
			return  null;
		}
		companyList=filterCompanyList(companyList);
		if(StringUtils.isEmptyList(companyList)){
			return  null;
		}
		companyList=orderCompany(companyIds,companyList);
		companyList=this.handlerCompanys(companyList);
		Map<Integer,List<Integer>> companyPulisher=pcRevisionEntity.handleCompanyPublisher(companyIds);
		logger.info("companyPulisher========"+companyPulisher);
		Map<Integer,Integer> mapTeamNum=this.getTeamNum(companyList, companyPulisher);
		List<Integer> companyids=this.getCompanyIds(companyList);
		List<Map<String,Object>> jdlist=pcRevisionEntity.HandleCmsResource(companyids,1);
		Map<Integer,Set<String>> companyPositionCityData=pcRevisionEntity.handlerCompanyPositionCity(companyPulisher);
		logger.info("companyPositionCityData========"+companyPositionCityData);
		List<Map<String,Object>> list=handleDataForCompanyRecommend(companyList,companyPulisher,mapTeamNum,jdlist,companyPositionCityData);
		return list;
	}

	//获取推荐公司下边团队的数量
	private Map<Integer,Integer> getTeamNum(List<HrCompanyDO> companyList, Map<Integer,List<Integer>> companyPulisher){
		if(StringUtils.isEmptyList(companyList)){
			return new HashMap<Integer,Integer>();
		}
		if(companyPulisher==null||companyPulisher.isEmpty()){
			return new HashMap<Integer,Integer>();
		}
		Map<Integer,Integer> motherTeamNum=this.handlerMotherTeamNum(companyList);
		Map<Integer,Integer> childteamNum=this.getChildTeamNum(companyList,companyPulisher);
		Map<Integer,Integer> result=new HashMap<Integer,Integer>();
		if(motherTeamNum!=null&&!motherTeamNum.isEmpty()){
			result.putAll(motherTeamNum);
		}
		if(childteamNum!=null&&!childteamNum.isEmpty()){
			result.putAll(childteamNum);
		}
		return result;
	}
	//获取母公司的团队数量
	private  Map<Integer,Integer> handlerMotherTeamNum(List<HrCompanyDO> companyList){
		if(StringUtils.isEmptyList(companyList)){
			return new HashMap<Integer,Integer>();
		}
		List<Integer> motherCompanyIdList=this.getMotherCompanyIdList(companyList);
		List<Map<String,Object>> motherTeamList=hrTeamDao.getTeamNum(motherCompanyIdList);
		if(StringUtils.isEmptyList(motherTeamList)){
			return new HashMap<Integer,Integer>();
		}
		Map<Integer,Integer> result=new HashMap<Integer,Integer>();
		for(Map<String,Object> map:motherTeamList){
			int number=(int) map.get("id_count");
			int companyId=(int) map.get("company_id");
			result.put(companyId, number);
		}
		return result;

	}
	//获取子公司的团队数量
	public Map<Integer,Integer> getChildTeamNum(List<HrCompanyDO> companyList, Map<Integer,List<Integer>> companyPulisher){
		Map<Integer,List<Integer>> childCompanyPublisherMap=this.getChildCompanyIdPulisherMap(companyList, companyPulisher);
		if(childCompanyPublisherMap!=null||!childCompanyPublisherMap.isEmpty()){
			List<Integer> publisherList=pcRevisionEntity.getAllPulisherByCompanyPublisher(childCompanyPublisherMap);
			List<Map<String,Object>> mapList=getChildTeamNumBypublisherList(publisherList);
			Map<Integer,Integer> result=this.handleChildTeamNum(mapList,childCompanyPublisherMap);
			return result;
		}
		return null;
	}

	//从数据库中获取发布人的下的带有team_id的职位
	public List<Map<String,Object>> getChildTeamNumBypublisherList(List<Integer> publisherList){
		if(StringUtils.isEmptyList(publisherList)){
			return null;
		}
		Query  query=new Query.QueryBuilder().select(new Select("team_id", SelectOp.DISTINCT))
				.select("publisher")
				.where(new Condition("team_id",0,ValueOp.NEQ))
				.and(new Condition("publisher",publisherList,ValueOp.IN))
				.and("status",0)
				.buildQuery();
		List<Map<String,Object>> result=jobPositionDao.getMaps(query);
		return result;
	}
	//处理子公司的职位的
	private Map<Integer,Integer> handleChildTeamNum(List<Map<String,Object>> list,Map<Integer,List<Integer>> companyPulisher){
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		if(companyPulisher!=null&&companyPulisher.isEmpty()){
			return null;
		}
		Map<Integer,Integer> result=new HashMap<Integer,Integer>();
		for(Map<String,Object> map:list){
			int publisher=(int) map.get("publisher");
			for(Integer key:companyPulisher.keySet()){
				List<Integer> publisherList=companyPulisher.get(key);
				if(!StringUtils.isEmptyList(publisherList)){
					if(publisherList.contains(publisher)){
						Integer num=result.get(key);
						if(num==null){
							result.put(key, 1);
						}else{
							result.put(key, num+1);
						}
						break;
					}
				}
			}

		}

		return result;
	}
	//获取列表中所有母公司的id
	private List<Integer> getMotherCompanyIdList(List<HrCompanyDO> companyList){
		List<Integer> list=new ArrayList<Integer>();
		for(HrCompanyDO DO:companyList){
			int id=DO.getId();
			int parentId=DO.getParentId();
			if(parentId==0){
				list.add(id);
			}
		}
		return list;
	}
	//获取列表中所有母公司的id以及他的accountid的map
	public Map<Integer,List<Integer>> getChildCompanyIdPulisherMap(List<HrCompanyDO> companyList,Map<Integer,List<Integer>> companyPulisher){
		Map<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
		for(HrCompanyDO DO:companyList){
			int id=DO.getId();
			int parentId=DO.getParentId();
			int disable=DO.getDisable();
			if(parentId!=0&&disable==1){
				map.put(id, companyPulisher.get(id));
			}
		}
		return map;
	}
	//处理企业信息的组合问题
	public List<Map<String,Object>> handleDataForCompanyRecommend( List<HrCompanyDO> companyList,
																   Map<Integer,List<Integer>> companyPulisher,Map<Integer,Integer> mapTeamNum
			,List<Map<String,Object>> jdlist,Map<Integer,Set<String>> companyPositionCityData) throws TException{
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		Map<String,Object> map=null;
		if(StringUtils.isEmptyList(companyList)){
			return list;
		}
		List<String> industryNameList=this.getIndustryName(companyList);
		Map<Integer,Integer> companyIdPositionNum=this.getCompanyPositionNum(companyList,companyPulisher);
		if(companyIdPositionNum==null||companyIdPositionNum.isEmpty()){
			companyIdPositionNum=new HashMap<>();
		}
		List<DictIndustryDO> industryList=this.getDictIndustryListByName(industryNameList);
		for(int i=0;i<companyList.size();i++){
			map=new HashMap<String,Object>();
			HrCompanyDO companyDO=companyList.get(i);
			int companyId=companyDO.getId();
			String companyDOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(companyDO);
			Map<String,Object> companyData=JSON.parseObject(companyDOs, Map.class);
			map.put("company", companyData);
			String industryName=companyDO.getIndustry();
			if(!StringUtils.isEmptyList(industryList)&&StringUtils.isNotNullOrEmpty(industryName)){
				for(DictIndustryDO industryDO:industryList){
					String name=industryDO.getName();
					if(industryName.equals(name)){
						String industryDOs=new TSerializer(new TSimpleJSONProtocol.Factory()).toString(industryDO);
						Map<String,Object> industryData=JSON.parseObject(industryDOs, Map.class);
						map.put("industryData",industryData);
						break;
					}
				}
			}
//			if(companyPulisher!=null&&!companyPulisher.isEmpty()){
//				List<Integer> publisherIds=companyPulisher.get(companyId);
//				if(publisherIds!=null&&publisherIds.size()>0){
//					int num=this.getPositionNum(publisherIds);
//					map.put("positionNum", num);
//				}else{
//					map.put("positionNum", 0);
//				}
//			}else{
//				map.put("positionNum", 0);
//			}
			Integer positionNum=companyIdPositionNum.get(companyId);
			if(positionNum!=null){
				map.put("positionNum", positionNum);
			}else{
				map.put("positionNum", 0);
			}

			if(!StringUtils.isEmptyList(companyList)&&mapTeamNum!=null&&!mapTeamNum.isEmpty()){
				Integer teamNum=mapTeamNum.get(companyId);
				if(teamNum!=null){
					map.put("teamNum", teamNum);
				}else{
					map.put("teamNum", 0);
				}
			}else{
				map.put("teamNum", 0);
			}
			if(!StringUtils.isEmptyList(jdlist)){
				for(Map<String,Object> jdmap:jdlist){
					Integer configId=(Integer) jdmap.get("configId");
					if(companyId==configId){
						if(jdmap.get("imgUrl")!=null){
							map.put("jdPic", jdmap.get("imgUrl"));
						}
						break;
					}
				}
			}
			if(companyPositionCityData!=null&&!companyPositionCityData.isEmpty()){
				if(companyPositionCityData.get(companyId)!=null){
					map.put("cityList", companyPositionCityData.get(companyId));
				}
			}
			list.add(map);
		}
		return list;
	}

	/*
	 获取推荐公司下的职位数量
	 */
	private Map<Integer,Integer> getCompanyPositionNum(List<HrCompanyDO> companyList,Map<Integer,List<Integer>> companyPulisher){
		Map<Integer,Integer> result=new HashMap<>();
		List<Integer> motherCompanyIdList=new ArrayList<>();
		List<Integer> childCompanyIdList=new ArrayList<>();
		for(HrCompanyDO DO:companyList){
			if(DO.getParentId()==0){
				motherCompanyIdList.add(DO.getId());
			}else{
				childCompanyIdList.add(DO.getId());
			}
		}
		for(Integer cid:motherCompanyIdList){
			int count=this.getPositionNumByCompanyId(cid);
			result.put(cid,count);
		}
		for(Integer cid:childCompanyIdList){
			int flag=0;
			for(Integer key:companyPulisher.keySet()){
				if(cid.intValue()==key.intValue()){
					List<Integer> publisherlist=companyPulisher.get(key);
					if(StringUtils.isEmptyList(publisherlist)){
						result.put(cid,0);
					}else {
						int count = this.getPositionNum(publisherlist);
						result.put(cid, count);
					}
					flag=1;
					break;
				}
			}
			if(flag==0){
				result.put(cid,0);
			}
		}
		return result;
	}
	/*
	 通过公司Id获取公司再招职位数量
	 */
	private int getPositionNumByCompanyId(int cid){
		Query query=new Query.QueryBuilder().where("company_id",cid).and("status",0).buildQuery();
		int count=jobPositionDao.getCount(query);
		return count;
	}
	/*
     * 删除已经删除的公司
     */
	public List<HrCompanyDO> filterCompanyList(List<HrCompanyDO> list){
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		List<HrCompanyDO> newList=new ArrayList<HrCompanyDO>();
		for(HrCompanyDO companyDO:list){
			int parentId=companyDO.getParentId();
			if(parentId!=0){
				int disable=companyDO.getDisable();
				if(disable==1){
					newList.add(companyDO);
				}
			}else{
				newList.add(companyDO);
			}
		}
		return newList;
	}
	//处理impression和banner
	private List<HrCompanyDO> handlerCompanys(List<HrCompanyDO> list){
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		List<Integer> parentIdList=new ArrayList<Integer>();
		for(HrCompanyDO DO:list){
			int parentId=DO.getParentId();
			if(parentId!=0){
				parentIdList.add(parentId);
			}
		}
		if(StringUtils.isEmptyList(parentIdList)){
			return list;
		}
		List<HrCompanyDO> parentCompanyDOList=hrCompanyDao.getHrCompanyByCompanyIds(parentIdList);
		if(StringUtils.isEmptyList(parentCompanyDOList)){
			return list;
		}
		for(HrCompanyDO childDO:list){
			int parentId=childDO.getParentId();
			if(parentId!=0&&(StringUtils.isNullOrEmpty(childDO.getImpression())||StringUtils.isNullOrEmpty(childDO.getBanner()))){
				for(HrCompanyDO parentDO:parentCompanyDOList){
					if(parentDO.getId()==parentId){
						if(StringUtils.isNullOrEmpty(childDO.getImpression())){
							childDO.setImpression(parentDO.getImpression());
						}
						if(StringUtils.isNullOrEmpty(childDO.getBanner())){
							childDO.setBanner(parentDO.getBanner());
						}
					}

				}
			}
		}
		return list;
	}
	//获取企业行业list <String>
	private List<String> getIndustryName(List<HrCompanyDO> list){
		if(StringUtils.isEmptyList(list)){
			return null;
		}
		List<String> result=new ArrayList<String>();
		for(HrCompanyDO DO:list){
			String name=DO.getIndustry();
			result.add(name);
		}
		return result;
	}
	//根据企业行业的名称获取行业信息
	private List<DictIndustryDO> getDictIndustryListByName(List<String> industryNameList){
		if(StringUtils.isEmptyList(industryNameList)){
			return null;
		}
		Query query=new Query.QueryBuilder().where(new Condition("name",industryNameList.toArray(),ValueOp.IN)).buildQuery();
		List<DictIndustryDO> list=dictIndustryDao.getDatas(query);
		return list;
	}
	//根据name获取单个dictindustry
	private DictIndustryDO getDictIndustryByName(String name){
		Query query=new Query.QueryBuilder().where("name",name).buildQuery();
		DictIndustryDO DO=dictIndustryDao.getData(query);
		return DO;
	}
	//根据company_ids获取hr_company_conf的列表
	public List<HrCompanyConfDO> getHrCompanyConfDOList(List<Integer> companyIdList){
		if(StringUtils.isEmptyList(companyIdList)){
			return null;
		}
		Query query=new Query.QueryBuilder().where(new Condition("company_id",companyIdList.toArray(),ValueOp.IN)).buildQuery();
		List<HrCompanyConfDO> list=hrCompanyConfDao.getDatas(query);
		return list;
	}
	//获取公司列表中所有公司的母公司的列表
	public List<Integer> getAllMotherCompanyIdList(List<HrCompanyDO> list){
		List<Integer> result=new ArrayList<>();
		if(StringUtils.isEmptyList(list)){
			return result;
		}
		for(HrCompanyDO DO:list){
			int id=DO.getId();
			int parentId=DO.getParentId();
			if(parentId>0){
				result.add(parentId);
			}else{
				result.add(id);
			}
		}
		return result;
	}
	//获取hr_company_conf的数据
	private List<HrCompanyConfDO> getHrCompanyConfData(List<HrCompanyDO> list){
		List<Integer> idList=this.getAllMotherCompanyIdList(list);
		List<HrCompanyConfDO> confList=this.getHrCompanyConfDOList(idList);
		return confList;
	}
}
