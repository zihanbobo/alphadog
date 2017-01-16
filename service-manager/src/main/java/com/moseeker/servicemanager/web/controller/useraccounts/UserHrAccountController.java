package com.moseeker.servicemanager.web.controller.useraccounts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moseeker.common.util.StringUtils;
import com.moseeker.common.validation.ValidateUtil;
import com.moseeker.rpccenter.client.ServiceManager;
import com.moseeker.servicemanager.common.ParamUtils;
import com.moseeker.servicemanager.common.ResponseLogNotification;
import com.moseeker.servicemanager.web.controller.util.Params;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.useraccounts.service.UserHrAccountService;
import com.moseeker.thrift.gen.useraccounts.struct.BindAccountStruct;
import com.moseeker.thrift.gen.useraccounts.struct.DownloadReport;
import com.moseeker.thrift.gen.useraccounts.struct.SearchCondition;

/**
 * HR账号服务
 * <p>
 *
 * Created by zzh on 16/6/1.
 */
// @Scope("prototype") // 多例模式, 单例模式无法发现新注册的服务节点
@Controller
public class UserHrAccountController {

	Logger logger = LoggerFactory.getLogger(UseraccountsController.class);

	UserHrAccountService.Iface userHrAccountService = ServiceManager.SERVICEMANAGER
			.getService(UserHrAccountService.Iface.class);

	/**
	 * 注册HR发送验证码
	 *
	 */
	@RequestMapping(value = "/hraccount/sendsignupcode", method = RequestMethod.POST)
	@ResponseBody
	public String sendMobileVerifiyCode(HttpServletRequest request, HttpServletResponse response) {
		try {
			// 获取HR用户实体对象
			String mobile = request.getParameter("mobile");
			String code = request.getParameter("code");
			int source = Integer.valueOf(request.getParameter("source"));

			Response result = userHrAccountService.sendMobileVerifiyCode(mobile, code, source);
			return ResponseLogNotification.success(request, result);
		} catch (Exception e) {
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}

	/**
	 * 添加HR账号
	 * <p>
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/hraccount", method = RequestMethod.POST)
	@ResponseBody
	public String postUserHrAccount(HttpServletRequest request, HttpServletResponse response) {
		try {
			// 获取HR用户实体对象
			DownloadReport downloadReport = ParamUtils.initModelForm(request, DownloadReport.class);
			ValidateUtil vu = new ValidateUtil();
			vu.addRequiredStringValidate("验证码", downloadReport.getCode(), null, null);
			vu.addRequiredStringValidate("公司名称", downloadReport.getCompany_name(), null, null);
			String message = vu.validate();
			if (StringUtils.isNullOrEmpty(message)) {
				Response result = userHrAccountService.postResource(downloadReport);
				return ResponseLogNotification.success(request, result);
			} else {
				return ResponseLogNotification.fail(request, message);
			}
		} catch (Exception e) {
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}
	
	@RequestMapping(value = "/hraccount/binding", method = RequestMethod.POST)
	@ResponseBody
	public String bindThirdPartyAccount(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			BindAccountStruct struct = ParamUtils.initModelForm(request, BindAccountStruct.class);
			
			Response result = userHrAccountService.bind(struct);
			return ResponseLogNotification.success(request, result);
		} catch (Exception e) {
			return ResponseLogNotification.fail(request, e.getMessage());
		} finally {
			//do nothing
		}
	}
	
	/**
	 * 获取hr常用筛选项
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/hraccount/searchcondition", method = RequestMethod.GET)
	@ResponseBody
	public String getSearchCondition(HttpServletRequest request, HttpServletResponse response) {
		try {
			Params<String, Object> params = ParamUtils.parseRequestParam(request);
			Integer hrAccountId = params.getInt("hr_account_id");
			int type = params.getInt("type", 0);
			ValidateUtil vu = new ValidateUtil();
			vu.addRequiredValidate("hr账号", hrAccountId);
			if (StringUtils.isNullOrEmpty(vu.validate())) {
				Response result = userHrAccountService.getSearchCondition(hrAccountId, type);
				return ResponseLogNotification.success(request, result);
			} else {
				return ResponseLogNotification.fail(request, vu.validate());
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}
	
	/**
	 * 保存hr常用筛选项
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/hraccount/searchcondition", method = RequestMethod.POST)
	@ResponseBody
	public String postSearchCondition(HttpServletRequest request, HttpServletResponse response) {
		try {
			SearchCondition searchCondition = ParamUtils.initModelForm(request, SearchCondition.class);
			ValidateUtil vu = new ValidateUtil();
			vu.addIntTypeValidate("hr账号", searchCondition.getHr_account_id(), null, "hr账号不能为空", 1, null);
			vu.addStringLengthValidate("筛选名", searchCondition.getName(), null, null, 1, 12);
			if (StringUtils.isNullOrEmpty(vu.validate())) {
				Response result = userHrAccountService.postSearchCondition(searchCondition);
				return ResponseLogNotification.success(request, result);
			} else {
				return ResponseLogNotification.fail(request, vu.validate());
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}
	
	/**
	 * 删除hr常用筛选项
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/hraccount/searchcondition", method = RequestMethod.DELETE)
	@ResponseBody
	public String DelSearchCondition(HttpServletRequest request, HttpServletResponse response) {
		try {
			Params<String, Object> params = ParamUtils.parseRequestParam(request);
			Integer hrAccountId = params.getInt("hr_account_id");
			Integer id = params.getInt("id");
			ValidateUtil vu = new ValidateUtil();
			vu.addRequiredValidate("hr账号", hrAccountId, null, null);
			vu.addRequiredValidate("筛选项id", id, null, null);
			if (StringUtils.isNullOrEmpty(vu.validate())) {
				Response result = userHrAccountService.delSearchCondition(hrAccountId, id);
				return ResponseLogNotification.success(request, result);
			} else {
				return ResponseLogNotification.fail(request, vu.validate());
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}
	
	/**
	 * 将候选人加入人才库
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/hraccount/talentpool", method = RequestMethod.POST)
	@ResponseBody
	public String joinTalentpool(HttpServletRequest request, HttpServletResponse response) {
		try {
			Params<String,Object> params = ParamUtils.parseRequestParam(request);
			Integer hrAccountId = params.getInt("hr_account_id");
			String applierIds = params.getString("applier_ids");
			ValidateUtil vu = new ValidateUtil();
			vu.addRequiredValidate("hr账号", hrAccountId, null, null);
			vu.addRequiredValidate("候选人id", applierIds, null, null);
			if (StringUtils.isNullOrEmpty(vu.validate())) {
				Response result = userHrAccountService.joinTalentpool(hrAccountId, applierIds.replaceAll("\\[|\\]", ""));
				return ResponseLogNotification.success(request, result);
			} else {
				return ResponseLogNotification.fail(request, vu.validate());
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}
	
	/**
	 * 将候选人移出人才库
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/hraccount/talentpool", method = RequestMethod.DELETE)
	@ResponseBody
	public String shiftOutTalentpool(HttpServletRequest request, HttpServletResponse response) {
		try {
			Params<String,Object> params = ParamUtils.parseRequestParam(request);
			Integer hrAccountId = params.getInt("hr_account_id");
			String applierIds = params.getString("applier_ids");
			ValidateUtil vu = new ValidateUtil();
			vu.addRequiredValidate("hr账号", hrAccountId, null, null);
			vu.addRequiredValidate("候选人id", applierIds, null, null);
			if (StringUtils.isNullOrEmpty(vu.validate())) {
				Response result = userHrAccountService.shiftOutTalentpool(hrAccountId, applierIds.replaceAll("\\[|\\]", ""));
				return ResponseLogNotification.success(request, result);
			} else {
				return ResponseLogNotification.fail(request, vu.validate());
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return ResponseLogNotification.fail(request, e.getMessage());
		}
	}
}
