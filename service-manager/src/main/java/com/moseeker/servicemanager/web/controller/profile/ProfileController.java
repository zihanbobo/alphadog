package com.moseeker.servicemanager.web.controller.profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.moseeker.common.providerutils.ResponseUtils;
import com.moseeker.common.util.BeanUtils;
import com.moseeker.common.util.Constant;
import com.moseeker.rpccenter.client.ServiceManager;
import com.moseeker.servicemanager.common.ParamUtils;
import com.moseeker.servicemanager.common.ResponseLogNotification;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.profile.service.WholeProfileServices;

//@Scope("prototype") // 多例模式, 单例模式无法发现新注册的服务节点
@Controller
public class ProfileController {

	Logger logger = LoggerFactory.getLogger(ProfileController.class);

	WholeProfileServices.Iface profileService = ServiceManager.SERVICEMANAGER
			.getService(WholeProfileServices.Iface.class);

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	@ResponseBody
	public String get(HttpServletRequest request, HttpServletResponse response) {
		// PrintWriter writer = null;
		try {
			// GET方法 通用参数解析并赋值
			ImportCVForm form = ParamUtils.initModelForm(request, ImportCVForm.class);
			Response result = profileService.getResource(form.getUser_id(), form.getId(), form.getUuid());

			return ResponseLogNotification.success(request, result);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ResponseLogNotification.fail(request, e.getMessage());
		} finally {
			// do nothing
		}
	}

	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	@ResponseBody
	public String post(HttpServletRequest request, HttpServletResponse response) {
		// PrintWriter writer = null;
		try {

			ImportCVForm form = ParamUtils.initModelForm(request, ImportCVForm.class);
			Response result = profileService.postResource(form.getProfile(), form.getUser_id());

			return ResponseLogNotification.success(request, result);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ResponseLogNotification.fail(request, e.getMessage());
		} finally {
			// do nothing
		}
	}

	/*
	 * 批量profile接口
	 */
	@RequestMapping(value = "/profiles", method = RequestMethod.POST)
	@ResponseBody
	public String getBatchProfiles(HttpServletRequest request, HttpServletResponse response) {
		// PrintWriter writer = null;
		try {
			// GET方法 通用参数解析并赋值
			Map<String, Object> param = ParamUtils.mergeRequestParameterList(request);
			Object[] userIds = (Object[]) param.get("user_id");
			Object[] uuids = (String[]) param.get("uuid");
			Object[] profileIds = (Object[]) param.get("profile_id");
			if ((userIds != null && userIds.length > 0) || (uuids != null && uuids.length > 0)
					|| (profileIds != null && profileIds.length > 0)) {
				int count = 0;
				if(userIds != null) {
					count = userIds.length;
				}
				if(uuids != null) {
					count = Math.max(count, uuids.length);
				}
				if(profileIds != null) {
					count = Math.max(count, profileIds.length);
				}
				if(count > 1000) {
					count = 1000;
				}
				List<Object> profileData = new ArrayList<>();
				Response result = null;
				for(int i=0; i<count; i++) {
					int userId = 0;
					int profileId = 0;
					String uuid = null;
					if(userIds != null && userIds.length-1 >= i) {
						userId = BeanUtils.converToInteger(userIds[i]);
					}
					if(profileIds != null && profileIds.length-1 >=i) {
						try {
							profileId = BeanUtils.converToInteger(profileIds[i]);
						} catch (Exception e) {
							logger.error(e.getMessage(), e);
						}
					}
					if(uuids != null && uuids.length -1 >= i) {
						uuid = BeanUtils.converToString(uuids[i]);
					}
					result = profileService.getResource(userId, profileId, uuid);
					if(result != null && result.getStatus() == 0) {
						profileData.add(JSON.parse(result.getData()));
					}
				}
				Response res =  ResponseUtils.success(profileData);
				return ResponseLogNotification.success(request, res);
			}
			return ResponseLogNotification.fail(request, "参数错误");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ResponseLogNotification.fail(request, e.getMessage());
		} finally {
			// do nothing
		}
	}
}
