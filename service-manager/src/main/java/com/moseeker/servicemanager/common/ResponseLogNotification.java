package com.moseeker.servicemanager.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.moseeker.common.constants.ConstantErrorCodeMessage;
import com.moseeker.common.redis.RedisClientFactory;
import com.moseeker.common.util.ConfigPropertiesUtil;
import com.moseeker.common.util.Notification;
import com.moseeker.thrift.gen.common.struct.Response;

public class ResponseLogNotification {

	private final static int appid = 0;
	private final static String logkey = "LOG";
	private final static String eventkey = "RESTFUL_API_ERROR";
	private static  Logger logger = LoggerFactory.getLogger(ResponseLogNotification.class);

	
	public static String success(HttpServletRequest request, Response response) {
		try {
			String jsonresponse = JSON.toJSONString(CleanJsonResponseWithParse.convertFrom(response));
			logRequestResponse(request, jsonresponse);
			return jsonresponse;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return ConstantErrorCodeMessage.PROGRAM_EXCEPTION;		

	}


	public static String fail(HttpServletRequest request, Response response) {
		try {
			String jsonresponse = JSON.toJSONString(CleanJsonResponse.convertFrom(response));
			logRequestResponse(request, jsonresponse);
			int appid = 0;
			if (request.getParameter("appid") != null){
				appid = Integer.parseInt(request.getParameter("appid"));
			}
			logger.info(JSON.toJSONString(response));
			Notification.sendNotification(appid, eventkey, response.getMessage());
			return jsonresponse;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return ConstantErrorCodeMessage.PROGRAM_EXCEPTION;		
		
	}

	public static String fail(HttpServletRequest request, String message) {
		try {
			Response response = new Response();
			response.setStatus(1);
			response.setMessage(message);
			String jsonresponse = JSON.toJSONString(CleanJsonResponse.convertFrom(response));
			logRequestResponse(request, jsonresponse);
			int appid = 0;
			if (request.getParameter("appid") != null){
				appid = Integer.parseInt(request.getParameter("appid"));
			}
			logger.info(JSON.toJSONString(response));
			Notification.sendNotification(appid, eventkey, response.getMessage());
			return jsonresponse;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return ConstantErrorCodeMessage.PROGRAM_EXCEPTION;		
		
	}
	
	private static void logRequestResponse(HttpServletRequest request, String response) {
		try {
			ConfigPropertiesUtil propertiesUtils = ConfigPropertiesUtil.getInstance();
			propertiesUtils.loadResource("setting.properties");
			boolean switchLogRedis =  propertiesUtils.get("switch_log_redis", Boolean.class);
			if(switchLogRedis) {
				Map<String, Object> reqResp = new HashMap<>();
				reqResp.put("appid", request.getParameter("appid"));
				reqResp.put("request", request.getParameterMap());
				reqResp.put("response", response);
				reqResp.put("remote_ip", ParamUtils.getRemoteIp(request));
				reqResp.put("web_server_ip", ParamUtils.getLocalHostIp());

				RedisClientFactory.getLogClient().lpush(appid, logkey, JSON.toJSONString(reqResp));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//logger.info("下线日志记录功能");
	}

	public static void main(String[] args) {
		Notification.sendNotification(0, "MYSQL_CONNECT_ERROR", "mysql ip : 123.44.44.44");
	}
}
