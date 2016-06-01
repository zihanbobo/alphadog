package com.moseeker.servicemanager.web.controller.profile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moseeker.rpccenter.common.ServiceUtil;
import com.moseeker.servicemanager.common.ParamUtils;
import com.moseeker.servicemanager.common.ResponseLogNotification;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.profile.service.WorkExpServices;
import com.moseeker.thrift.gen.profile.struct.WorkExp;

@Scope("prototype") // 多例模式, 单例模式无法发现新注册的服务节点
@Controller
public class WorksExpController {

	Logger logger = LoggerFactory.getLogger(WorksExpController.class);

	WorkExpServices.Iface workExpService = ServiceUtil.getService(WorkExpServices.Iface.class);
	
	@RequestMapping(value = "/profile/workexp", method = RequestMethod.GET)
	@ResponseBody
	public String get(HttpServletRequest request, HttpServletResponse response) {
		//PrintWriter writer = null;
		try {
			// GET方法 通用参数解析并赋值
			CommonQuery query = ParamUtils.initCommonQuery(request, CommonQuery.class);

			Response result = workExpService.getResources(query);
			
			return ResponseLogNotification.success(request, result);
		} catch (Exception e) {	
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}

	@RequestMapping(value = "/profile/workexp", method = RequestMethod.POST)
	@ResponseBody
	public String post(HttpServletRequest request, HttpServletResponse response) {
		//PrintWriter writer = null;
		try {
			WorkExp workExp = ParamUtils.initModelForm(request, WorkExp.class);
			Response result = workExpService.postResource(workExp);
			
			return ResponseLogNotification.success(request, result);
		} catch (Exception e) {	
			e.printStackTrace();
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}

	@RequestMapping(value = "/profile/workexp", method = RequestMethod.PUT)
	@ResponseBody
	public String put(HttpServletRequest request, HttpServletResponse response) {
		try {
			WorkExp workExp = ParamUtils.initModelForm(request, WorkExp.class);
			Response result = workExpService.putResource(workExp);
			
			return ResponseLogNotification.success(request, result);
		} catch (Exception e) {	
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}

	@RequestMapping(value = "/profile/workexp", method = RequestMethod.DELETE)
	@ResponseBody
	public String delete(HttpServletRequest request, HttpServletResponse response) {
		try {
			WorkExp workExp = ParamUtils.initModelForm(request, WorkExp.class);
			Response result = workExpService.delResource(workExp);
			
			return ResponseLogNotification.success(request, result);
		} catch (Exception e) {	
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}
}
