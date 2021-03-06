package com.moseeker.useraccounts.service.impl.radar;

import com.alibaba.fastjson.JSONObject;
import com.moseeker.baseorm.db.referraldb.tables.records.ReferralSeekRecommendRecord;
import com.moseeker.baseorm.db.userdb.tables.records.UserEmployeeRecord;
import com.moseeker.thrift.gen.dao.struct.jobdb.JobApplicationDO;
import com.moseeker.useraccounts.pojo.neo4j.UserDepthVO;
import com.moseeker.useraccounts.service.constant.ReferralTypeEnum;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class SeekReferralHandler extends AbstractReferralTypeHandler {

    @Override
    ReferralTypeEnum getReferralType() {
        return ReferralTypeEnum.SEEK_REFERRAL;
    }

    @Override
    protected JSONObject initRecomUserInfo(JobApplicationDO jobApplicationDO, JSONObject applyIdEvaluateMap, boolean radarSwitchOpen) {

        JSONObject recom = new JSONObject();
        recom.put("type", getReferralType().getType());
        Object evaluate = applyIdEvaluateMap.get(jobApplicationDO.getId()+"");
        recom.put("evaluate", evaluate == null ? 0 : 1);
        if(evaluate != null){
            ReferralSeekRecommendRecord recommendRecord = (ReferralSeekRecommendRecord)evaluate;
            recom.put("referral_id", recommendRecord.getId());
        }
        return recom;
    }

    @Override
    protected List<JobApplicationDO> getApplicationsByReferralType(List<JobApplicationDO> jobApplicationDOS) {
        List<JobApplicationDO> seekReferralList = new ArrayList<>();
        for(JobApplicationDO jobApplicationDO : jobApplicationDOS){
            ReferralTypeEnum referralTypeEnum = ReferralTypeEnum.getReferralTypeByApplySource(jobApplicationDO.getOrigin());
            if(referralTypeEnum.getType() == ReferralTypeEnum.SEEK_REFERRAL.getType()){
                seekReferralList.add(jobApplicationDO);
            }
        }
        return seekReferralList;
    }

    @Override
    protected JSONObject getReferralTypeMap(UserEmployeeRecord employeeRecord, List<JobApplicationDO> jobApplicationDOS, List<UserDepthVO> applierDegrees) {
        List<JobApplicationDO> seekReferralList = getApplicationsByReferralType(jobApplicationDOS);
        JSONObject seekApplyMap = new JSONObject();
        if(seekReferralList.size() != 0){
            List<Integer> seekAppids = seekReferralList.stream().map(JobApplicationDO::getId).distinct().collect(Collectors.toList());
            List<ReferralSeekRecommendRecord> seekRecommendReords = seekRecommendDao.fetchSeekRecommendByAppids(seekAppids);
            for(ReferralSeekRecommendRecord seekRecommendRecord : seekRecommendReords){
                seekApplyMap.put(seekRecommendRecord.getAppId() + "", seekRecommendRecord);
            }
        }
        return seekApplyMap;
    }

}
