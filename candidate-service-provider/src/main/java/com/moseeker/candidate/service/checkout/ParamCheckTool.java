package com.moseeker.candidate.service.checkout;

import com.moseeker.common.validation.ValidateUtil;
import com.moseeker.common.validation.rules.DateType;
import com.moseeker.thrift.gen.candidate.struct.CandidateListParam;
import com.moseeker.thrift.gen.candidate.struct.RecommmendParam;

import java.util.List;

/**
 * 校验工具
 * Created by jack on 06/04/2017.
 */
public class ParamCheckTool {

    public static ValidateUtil checkCandidateList(CandidateListParam param) {

        ValidateUtil vu = new ValidateUtil();
        vu.addIntTypeValidate("推荐人信息", param.getPostUserId(), null, "缺少必要的参数“推荐人信息”", 0, Integer.MAX_VALUE);
        vu.addRequiredStringValidate("点击时间", param.getClickTime(), null, "缺少必要的参数“点击时间”");
        vu.addIntTypeValidate("部门信息", param.getCompanyId(), null, "缺少必要的参数“部门信息”", 0, Integer.MAX_VALUE);
        vu.addDateValidate("点击时间", param.getClickTime(), DateType.shortDate, null, "“点击时间”格式不正确");
        return vu;
    }

    public static ValidateUtil checkRecommends(int companyId, List<Integer> idList) {
        ValidateUtil vu = new ValidateUtil();
        vu.addIntTypeValidate("公司编号", companyId, null, null, 1, Integer.MAX_VALUE);
        vu.addRequiredOneValidate("推荐记录编号", idList, null, null);
        return vu;
    }

    public static ValidateUtil checkRecommend(RecommmendParam param) {

        ValidateUtil vu = new ValidateUtil();
        vu.addRequiredValidate("推荐人信息", param.getPostUserId(), null, null);
        vu.addIntTypeValidate("推荐人信息", param.getPostUserId(), null, "缺少必要参数“推荐人信息”", 1, Integer.MAX_VALUE);
        vu.addRequiredStringValidate("点击时间", param.getClickTime(), null, "缺少必要参数“点击时间”");
        vu.addDateValidate("点击时间", param.getClickTime(), DateType.shortDate, null, "推荐时间格式有误！");
        vu.addRequiredValidate("推荐记录编号", param.getId(), null, "缺少必要参数“推荐记录编号”");
        vu.addIntTypeValidate("推荐记录编号", param.getId(), null, null, 1, Integer.MAX_VALUE);
        vu.addRequiredValidate("公司编号", param.getCompanyId(), null, null);
        vu.addIntTypeValidate("公司编号", param.getCompanyId(), null, "缺少必要参数“部门编号”", 1, Integer.MAX_VALUE);
        return vu;
    }

    public static ValidateUtil checkGetRecommendation(int id, int postUserId) {

        ValidateUtil validateUtil = new ValidateUtil();
        validateUtil.addIntTypeValidate("职位转发浏览记录编号", id, null, null , 1, Integer.MAX_VALUE);
        validateUtil.addIntTypeValidate("转发者编号", postUserId, null, null, 1, Integer.MAX_VALUE);
        return validateUtil;
    }

    public static ValidateUtil checkRecommendatorySorting(int postUserId, int companyId) {
        ValidateUtil validateUtil = new ValidateUtil();
        validateUtil.addIntTypeValidate("转发者编号", postUserId, null, null , 1, Integer.MAX_VALUE);
        validateUtil.addIntTypeValidate("公司编号", companyId, null, null, 1, Integer.MAX_VALUE);
        return validateUtil;
    }

    public static ValidateUtil checkignore(int id, int companyId, int postUserId, String clickTime) {
        ValidateUtil vu = new ValidateUtil();
        vu.addIntTypeValidate("推荐人信息", postUserId, null, "缺少必要参数“推荐人信息”", 1, Integer.MAX_VALUE);
        vu.addRequiredStringValidate("点击时间", clickTime, null, "缺少必要参数“点击时间”");
        vu.addDateValidate("点击时间", clickTime, DateType.shortDate, null, "推荐时间格式有误！");
        vu.addIntTypeValidate("推荐记录编号", id, null, null, 1, Integer.MAX_VALUE);
        vu.addRequiredValidate("公司编号", companyId, null, null);
        return vu;
    }
}
