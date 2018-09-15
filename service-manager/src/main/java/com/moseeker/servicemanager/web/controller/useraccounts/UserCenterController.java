package com.moseeker.servicemanager.web.controller.useraccounts;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.moseeker.common.annotation.iface.CounterIface;
import com.moseeker.common.validation.ValidateUtil;
import com.moseeker.servicemanager.web.controller.Result;
import com.moseeker.servicemanager.web.controller.useraccounts.vo.UserCenterInfoVO;
import com.moseeker.thrift.gen.useraccounts.struct.CenterUserInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.moseeker.common.providerutils.ResponseUtils;
import com.moseeker.rpccenter.client.ServiceManager;
import com.moseeker.servicemanager.common.ResponseLogNotification;
import com.moseeker.thrift.gen.useraccounts.service.UserCenterService;
import com.moseeker.thrift.gen.useraccounts.struct.ApplicationRecordsForm;
import com.moseeker.thrift.gen.useraccounts.struct.FavPositionForm;

@Controller
@CounterIface
public class UserCenterController {

	Logger logger = LoggerFactory.getLogger(UseraccountsController.class);

	UserCenterService.Iface userCenterService = ServiceManager.SERVICEMANAGER
			.getService(UserCenterService.Iface.class);
	
	@RequestMapping(value = "/user/{id}/applications", method = RequestMethod.GET)
	@ResponseBody
	public String applications(HttpServletRequest request, HttpServletResponse response, @PathVariable int id) {
		try {
			List<ApplicationRecordsForm> forms = userCenterService.getApplications(id);
			return ResponseLogNotification.success(request, ResponseUtils.success(forms));
		} catch (Exception e) {
			return ResponseLogNotification.fail(request, e.getMessage());
		} finally {
			//do nothing
		}
	}
	
	@RequestMapping(value = "/user/{id}/fav-position", method = RequestMethod.GET)
	@ResponseBody
	public String favPositions(HttpServletRequest request, HttpServletResponse response, @PathVariable int id) {
		try {
			List<FavPositionForm> forms = userCenterService.getFavPositions(id);
			return ResponseLogNotification.success(request, ResponseUtils.success(forms));
		} catch (Exception e) {
			return ResponseLogNotification.fail(request, e.getMessage());
		} finally {
			//do nothing
		}
	}

	@RequestMapping(value = "/v1/users/{id}/center-info", method = RequestMethod.GET)
	@ResponseBody
	public String getUserCenterInfo(@PathVariable Integer id,
									@RequestParam(value = "company_id") Integer companyId,
									@RequestParam(value = "company_id") Integer appid) throws Exception {
		ValidateUtil validateUtil = new ValidateUtil();
		validateUtil.addRequiredValidate("appid", appid);
		validateUtil.addRequiredValidate("用户编号", id);
		validateUtil.addIntTypeValidate("用户编号", id, 1, null);
		validateUtil.addRequiredValidate("公司编号", companyId);
		validateUtil.addIntTypeValidate("公司编号", companyId, 1, null);
		String validateResult = validateUtil.validate();
		if (StringUtils.isBlank(validateResult)) {
			CenterUserInfo userInfo = userCenterService.getCenterUserInfo(id, companyId);
			UserCenterInfoVO userCenterInfoVO = new UserCenterInfoVO();
			BeanUtils.copyProperties(userInfo, userCenterInfoVO);
			return Result.success(userCenterInfoVO).toJson();
		} else {
			return Result.validateFailed(validateResult).toJson();
		}
	}
}
