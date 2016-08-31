package com.moseeker.servicemanager.web.controller.dict;

import com.moseeker.rpccenter.client.ServiceManager;
import com.moseeker.rpccenter.common.ServiceUtil;
import com.moseeker.servicemanager.common.ResponseLogNotification;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.dict.service.DictCountryService;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 国家字典数据服务
 * <p>
 *
 * Created by zzh on 16/5/27.
 */
//@Scope("prototype") // 多例模式, 单例模式无法发现新注册的服务节点
@Controller
public class DictCountryController {

    Logger logger = org.slf4j.LoggerFactory.getLogger(DictCountryController.class);

    DictCountryService.Iface dictCountryService = ServiceManager.SERVICEMANAGER.getService(DictCountryService.Iface.class);

    @RequestMapping(value = "/dict/country", method = RequestMethod.GET)
    @ResponseBody
    public String get(HttpServletRequest request, HttpServletResponse response) {
        try {
            Response result = dictCountryService.getDictCountry();
            return ResponseLogNotification.success(request, result);
        } catch (Exception e) {
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }
}