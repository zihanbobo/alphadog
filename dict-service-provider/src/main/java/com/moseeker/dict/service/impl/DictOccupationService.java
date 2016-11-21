package com.moseeker.dict.service.impl;

import java.util.HashMap;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import com.moseeker.common.constants.Constant;
import com.moseeker.common.redis.RedisClient;
import com.moseeker.common.redis.RedisClientFactory;
import com.moseeker.dict.enums.ConstantEnum;
import com.moseeker.rpccenter.client.ServiceManager;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.dict.service.DictOccupationDao;

@Service
public class DictOccupationService {
	/**
	 *   查询dict的职位字典
	 * @param single_layer 是否只返回一层
	 * @param channel 渠道类型
	 * @return
	 * @Auth zzt
	 * @time 2016－11－17
	 */
	Logger logger = org.slf4j.LoggerFactory.getLogger(DictOccupationService.class);
	DictOccupationDao.Iface dictOccupationDao = ServiceManager.SERVICEMANAGER
			.getService(DictOccupationDao.Iface.class);
	private RedisClient redisClient = RedisClientFactory.getCacheClient();
	/*
	 * 查询第三方职位职能
	 */
	public Response queryOccupation(String param){
		JSONObject obj=JSONObject.parseObject(param);
		boolean single_layer=obj.getBooleanValue("single_layer");
		int channel=obj.getIntValue("channel");
		try{
			if(single_layer){
				Integer level=obj.getInteger("level") ;
				Integer id=obj.getInteger("id");
				Integer parientId=obj.getInteger("parientId");
				CommonQuery query=new CommonQuery();
				HashMap<String,String> map=new HashMap<String,String>();
				if(id!=null){
					map.put("id", String.valueOf(id));
				}
				if(parientId!=null){
					map.put("parientId",String.valueOf(parientId));
				}
				if(level!=null){
					map.put("level", String.valueOf(level));
				}
				query.setEqualFilter(map);
				if(channel==1){
					return dictOccupationDao.getOccupation51(query);
				}else if(channel==2){
					return dictOccupationDao.getOccupationsZPin();
				}
			}else{
				if(channel==1){
					String key="51JobList";
					String result=redisClient.get(Constant.APPID_ALPHADOG,ConstantEnum.JOB_OCCUPATION_KEY.toString(),key);
					if(!StringUtils.isEmpty(result)){
						Response res=JSONObject.toJavaObject(JSONObject.parseObject(result), Response.class);
						return res;
					}else{
						Response res=dictOccupationDao.getOccupations51();
						redisClient.set(Constant.APPID_ALPHADOG,ConstantEnum.JOB_OCCUPATION_KEY.toString(),key,JSONObject.toJSONString(res));
						return res;
					}
				}else if(channel==2){
					String key="zPinList";
					String result=redisClient.get(Constant.APPID_ALPHADOG,ConstantEnum.JOB_OCCUPATION_KEY.toString(),key);
					if(!StringUtils.isEmpty(result)){
						Response res=JSONObject.toJavaObject(JSONObject.parseObject(result), Response.class);
						return res;
					}else{
						Response res=dictOccupationDao.getOccupationsZPin();
						redisClient.set(Constant.APPID_ALPHADOG,ConstantEnum.JOB_OCCUPATION_KEY.toString(),key ,JSONObject.toJSONString(res));
						return res;
					}
				}
			}
			}catch(Exception e){
				e.printStackTrace();
				logger.error(e.getMessage());
			}
			return null;
	}
	
}
