package com.moseeker.servicemanager.web.controller.position;

import com.alibaba.fastjson.JSON;
import com.moseeker.common.constants.Constant;
import com.moseeker.common.providerutils.ResponseUtils;
import com.moseeker.common.util.StringUtils;
import com.moseeker.common.validation.ValidateUtil;
import com.moseeker.rpccenter.client.ServiceManager;
import com.moseeker.servicemanager.common.ParamUtils;
import com.moseeker.servicemanager.common.ResponseLogNotification;
import com.moseeker.servicemanager.web.controller.util.Params;
import com.moseeker.thrift.gen.apps.positionbs.service.PositionBS;
import com.moseeker.thrift.gen.apps.positionbs.struct.ThirdPartyPositionForm;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.dao.service.JobDBDao;
import com.moseeker.thrift.gen.dao.struct.ThirdPartAccountData;
import com.moseeker.thrift.gen.dao.struct.ThirdPartyPositionData;
import com.moseeker.thrift.gen.position.service.PositionServices;
import com.moseeker.thrift.gen.position.struct.*;

import org.jooq.tools.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

//@Scope("prototype") // 多例模式, 单例模式无法发现新注册的服务节点
@Controller
public class PositionController {

    private Logger logger = LoggerFactory.getLogger(PositionController.class);

    private PositionServices.Iface positonServices = ServiceManager.SERVICEMANAGER.getService(PositionServices.Iface.class);
    private JobDBDao.Iface jobDBDao = ServiceManager.SERVICEMANAGER.getService(JobDBDao.Iface.class);
    private PositionBS.Iface positionBS = ServiceManager.SERVICEMANAGER.getService(PositionBS.Iface.class);

    com.moseeker.thrift.gen.dao.service.UserHrAccountDao.Iface hraccountDao = ServiceManager.SERVICEMANAGER
            .getService(com.moseeker.thrift.gen.dao.service.UserHrAccountDao.Iface.class);

    @RequestMapping(value = "/positions", method = RequestMethod.GET)
    @ResponseBody
    public String get(HttpServletRequest request, HttpServletResponse response) {
        try {
            // GET方法 通用参数解析并赋值
            CommonQuery query = ParamUtils.initCommonQuery(request, CommonQuery.class);
            Response result = positonServices.getResources(query);

            return ResponseLogNotification.success(request, result);
        } catch (Exception e) {
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }

    @RequestMapping(value = "/position/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getPosition(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) {
        try {
            Response result = positonServices.getPositionById(id);
            return ResponseLogNotification.success(request, result);
        } catch (Exception e) {
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }

    /**
     * 获取职位列表
     *
     * @param request  request
     * @param response response
     * @return 职位列表数据
     */
    @RequestMapping(value = "/position/list", method = RequestMethod.GET)
    @ResponseBody
    public String getPositionList(HttpServletRequest request, HttpServletResponse response) {
        try {
            WechatPositionListQuery query = new WechatPositionListQuery();

            Map<String, Object> map = ParamUtils.parseRequestParam(request);
            logger.info("map: " + map.toString());

            if (map.getOrDefault("company_id", null) != null) {
                query.setCompany_id(Integer.valueOf((String) map.get("company_id")));
            } else {
                throw new Exception("公司 id 未提供!");
            }

            query.setPage_from(Integer.valueOf((String) map.getOrDefault("page_from", "0")));
            query.setPage_size(Integer.valueOf((String) map.getOrDefault("page_size", "10")));

            query.setKeywords((String) map.getOrDefault("keywords", ""));
            query.setCities((String) map.getOrDefault("cities", ""));
            query.setIndustries((String) map.getOrDefault("industries", ""));
            query.setOccupations((String) map.getOrDefault("occupations", ""));
            query.setScale((String) map.getOrDefault("scale", ""));
            query.setCandidate_source((String) map.getOrDefault("candidate_source", ""));
            query.setEmployment_type((String) map.getOrDefault("employment_type", ""));
            query.setExperience((String) map.getOrDefault("experience", ""));
            query.setSalary((String) map.getOrDefault("salary", ""));
            query.setDegree((String) map.getOrDefault("degree", ""));
            query.setDepartment((String) map.getOrDefault("department", ""));
            query.setCustom((String) map.getOrDefault("custom", ""));
            query.setDid(Integer.valueOf((String) map.getOrDefault("did", "0")));

            String param_setOrder_by_priority = (String) map.getOrDefault("order_by_priority", "True");
            query.setOrder_by_priority(param_setOrder_by_priority.equals("True"));

            List<WechatPositionListData> positionList = positonServices.getPositionList(query);
            Response res = ResponseUtils.success(positionList);
            return ResponseLogNotification.success(request, res);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }

    @RequestMapping(value = "/positions/verifyCustomize", method = RequestMethod.GET)
    @ResponseBody
    public String verifyRequires(HttpServletRequest request, HttpServletResponse response) {
        //PrintWriter writer = null;
        try {

            //ImportCVForm form = ParamUtils.initModelForm(request, ImportCVForm.class);
            String positionId = request.getParameter("position_id");
            ValidateUtil vu = new ValidateUtil();
            vu.addRequiredValidate("职位编号", positionId);
            vu.addIntTypeValidate("职位编号", positionId, null, null, 1, Integer.MAX_VALUE);
            String message = vu.validate();
            if (StringUtils.isNullOrEmpty(message)) {
                Response result = positonServices.verifyCustomize(Integer.valueOf(positionId));
                return ResponseLogNotification.success(request, result);
            } else {
                return ResponseLogNotification.fail(request, message);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }

    @RequestMapping(value = "/thirdparty/customfield", method = RequestMethod.GET)
    @ResponseBody
    public String customField(HttpServletRequest request, HttpServletResponse response) {
        //PrintWriter writer = null;
        try {
            Map<String, Object> map = ParamUtils.parseRequestParam(request);
            Response result = positonServices.CustomField(JSONObject.toJSONString(map));
            return ResponseLogNotification.success(request, result);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }

    @RequestMapping(value = "/thirdparty/joboccupation", method = RequestMethod.GET)
    @ResponseBody
    public String occupation(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> map = ParamUtils.parseRequestParam(request);
            String company_id = (String) map.get("company_id");
            CommonQuery query = new CommonQuery();
            HashMap<String, String> param = new HashMap<String, String>();
            param.put("company_id", company_id + "");
            query.setEqualFilter(param);
            query.setPer_page(Integer.MAX_VALUE);
            Response result = jobDBDao.getJobOccupations(query);
            return ResponseLogNotification.success(request, result);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }

    @RequestMapping(value = "/position/sync", method = RequestMethod.POST)
    @ResponseBody
    public String synchronizePosition(HttpServletRequest request, HttpServletResponse response) {
        try {
            logger.info("-----------synchronizePosition------------params:" + request.getParameterMap());
            ThirdPartyPositionForm form = PositionParamUtils.parseSyncParam(request);
            logger.info("-----------synchronizePosition------------");
            logger.info("params:" + JSON.toJSONString(form));
            Response result = positionBS.synchronizePositionToThirdPartyPlatform(form);
            logger.info("result:" + JSON.toJSONString(result));
            logger.info("-----------synchronizePosition end------------");
            return ResponseLogNotification.success(request, result);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }

    @RequestMapping(value = "/thirdparty/position", method = RequestMethod.GET)
    @ResponseBody
    public String thirdpartyposition(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> data = ParamUtils.parseRequestParam(request);
            List<ThirdPartyPositionData> datas = null;
            if (data.containsKey("position_id")) {
                //获取发布人的ID
                int positionId = Integer.valueOf(data.get("position_id").toString());
                Response resp = positonServices.getPositionById(positionId);
                if(resp.getStatus() == 0) {
                    int publisher = JSON.parseObject(resp.getData()).getInteger("publisher");
                    //获取该发布人的第三方账号
                    List<ThirdPartAccountData> thirdPartAccountDatas = hraccountDao.getThirdPartyAccountsByUserId(publisher);
                    if (thirdPartAccountDatas.size() > 0) {
                        CommonQuery qu = ParamUtils.initModelForm(data, CommonQuery.class);
                        StringBuilder inIds = new StringBuilder();
                        inIds.append('[');
                        for (ThirdPartAccountData d : thirdPartAccountDatas) {
                            inIds.append(',').append(d.getId());
                        }
                        inIds.delete(0, 1).append(']');
                        qu.getEqualFilter().put("third_party_account_id", inIds.toString());
                        datas = positonServices.getThirdPartyPositions(qu);
                    }
                }
            }
            Response result = ResponseUtils.success(datas);
            return ResponseLogNotification.success(request, result);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseLogNotification.fail(request, e.getMessage());
        } finally {
            //do nothing
        }
    }

    /**
     * 职位刷新
     */
    @RequestMapping(value = "/position/refresh", method = RequestMethod.POST)
    @ResponseBody
    public String refreshPosition(HttpServletRequest request, HttpServletResponse response) {
        try {
            logger.info("/position/refresh");
            Params<String, Object> params = ParamUtils.parseRequestParam(request);
            List<HashMap<Integer, Integer>> paramList = PositionParamUtils.parseRefreshParam(params);
            logger.info("/position/refresh paramList.size:" + paramList.size());
            List<Object> refreshResult = new ArrayList<>();
            Integer user_id = params.getInt("user_id");
            ValidateUtil vu = new ValidateUtil();
            vu.addRequiredValidate("user_id", user_id);
            vu.addIntTypeValidate("user_id", user_id, null, null, 1, Integer.MAX_VALUE);
            String message = vu.validate();
            if (message != null) {
                return ResponseLogNotification.fail(request, message);
            } else if (paramList.size() > 0) {
                paramList.forEach(map -> {
                    map.forEach((positionId, channel) -> {
                        try {
                            logger.info("positionId:" + positionId + "    channel:" + channel);
                            Response refreshPositionResponse = positionBS.refreshPositionToThirdPartyPlatform(user_id, positionId, channel);
                            logger.info("data:" + refreshPositionResponse.getData());
                            refreshResult.add(JSON.parse(refreshPositionResponse.getData()));
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                            HashMap<String, Object> param = new HashMap<>();
                            param.put("position_id", String.valueOf(positionId));
                            param.put("channel", String.valueOf(channel));
                            param.put("sync_status", "0");
                            param.put("sync_fail_reason", Constant.POSITION_REFRESH_FAILED);
                            refreshResult.add(param);
                        } finally {
                            //do nothing
                        }
                    });
                });
            }
            Response res = ResponseUtils.success(refreshResult);
            return ResponseLogNotification.success(request, res);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }

    /**
     * 根据 hb_config_id 获取分享信息
     *
     * @param request  request
     * @param response response
     * @return 分享信息
     */
    @RequestMapping(value = "/position/list/hb_share_info", method = RequestMethod.GET)
    @ResponseBody
    public String getHbShareInfo(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> params = ParamUtils.parseRequestParam(request);
            Integer hbConfigId = Integer.valueOf((String) params.get("hb_config_id"));
            WechatShareData shareData = positonServices.getShareInfo(hbConfigId);

            Response res = ResponseUtils.success(shareData);
            return ResponseLogNotification.success(request, res);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }

    /**
     * 根据 hb_config_id 获取职位列表
     *
     * @param request  request
     * @param response response
     * @return 红包职位列表
     */
    @RequestMapping(value = "/position/rplist", method = RequestMethod.GET)
    @ResponseBody
    public String getRpPositionList(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> params = ParamUtils.parseRequestParam(request);
            Integer hbConfigId = Integer.valueOf((String) params.get("hb_config_id"));
            if (hbConfigId == null) {
                throw new Exception("红包活动 id 不正确!");
            }
            List<WechatRpPositionListData> rpPositionList = positonServices.getRpPositionList(hbConfigId);

            Response res = ResponseUtils.success(rpPositionList);
            return ResponseLogNotification.success(request, res);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }

    /**
     * 根据 pids (List<Integer>) 获取职位的红包附加信息
     *
     * @param request  request
     * @param response response
     * @return 红包职位列表
     */
    @RequestMapping(value = "/position/rpext", method = RequestMethod.GET)
    @ResponseBody
    @SuppressWarnings("unchecked")
    public String getPositionListRpExt(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> params = ParamUtils.parseRequestParam(request);
            List<String> pidStringList = asList(((String) params.get("pids")).split(","));
            List<Integer> pids = pidStringList.stream().map(Integer::valueOf).collect(Collectors.toList());

            List<RpExtInfo> rpExtInfoList = positonServices.getPositionListRpExt(pids);

            Response res = ResponseUtils.success(rpExtInfoList);
            return ResponseLogNotification.success(request, res);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }


    /**
     * 批量修改职位
     */
    @RequestMapping(value = "/jobposition/batchhandler", method = RequestMethod.POST)
    @ResponseBody
    public String batchHandlerJobPostion(HttpServletRequest request, HttpServletResponse response) {
        try {
            BatchHandlerJobPostion batchHandlerJobPostion = PositionParamUtils.parseBatchHandlerJobPostionParam(request);
            Response res = positonServices.batchHandlerJobPostion(batchHandlerJobPostion);
            return ResponseLogNotification.success(request, res);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseLogNotification.fail(request, e.getMessage());
        } finally {
            //do nothing
        }
    }


    /**
     * 删除职位
     */
    @RequestMapping(value = "/jobposition", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteJobPostion(HttpServletRequest request, HttpServletResponse response) {
        try {
            DelePostion params = ParamUtils.initModelForm(request, DelePostion.class);
            Response res = positonServices.deleteJobposition(params);
            return ResponseLogNotification.success(request, res);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }


    /**
     * 通过companyId和部门名获取TeamId
     */
    @RequestMapping(value = "/jobposition/getteamidbydepartmentname", method = RequestMethod.GET)
    @ResponseBody
    public String getTeamIdByDepartmentName(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> map = ParamUtils.parseRequestParam(request);
            Integer companyId = null;
            if ((String) map.get("company_id") != null) {
                companyId = Integer.valueOf((String) map.get("company_id"));
            } else {
                return ResponseLogNotification.fail(request, "请设置 company_id!");
            }
            String departmentName = (String) map.get("department_name");
            Response res = positonServices.getTeamIdByDepartmentName(companyId, departmentName);
            return ResponseLogNotification.success(request, res);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ResponseLogNotification.fail(request, e.getMessage());
        }
    }
}
