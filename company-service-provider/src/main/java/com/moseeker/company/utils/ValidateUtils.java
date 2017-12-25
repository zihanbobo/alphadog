package com.moseeker.company.utils;

import com.moseeker.baseorm.db.jobdb.tables.records.JobApplicationRecord;
import com.moseeker.baseorm.db.talentpooldb.tables.records.TalentpoolTalentRecord;
import com.moseeker.common.util.StringUtils;
import com.moseeker.entity.TalentPoolEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by zztaiwll on 17/12/20.
 */
@Service
public class ValidateUtils {
    @Autowired
    private TalentPoolEntity talentPoolEntity;
    /*
       验证hr操作user_id是否合法
       1:有操作权限
       2：hr不属于本公司无法操作
       3，该人未投递过此hr，无法操作
    */
    public int validateHrTalent(int hrId,int userId,int companyId){
        int result=validateHr(hrId,companyId);
        if(result==0){
            return 2;
        }
        int result1=talentPoolEntity.validateApplication(hrId,userId,companyId);
        if(result1==0){
            return 3;
        }
        return 1;
    }

    /*
    验证user_id是否投递过这个hr
   */
    public int validateApplication(int hrId,int userId,int companyId){
        int result1=talentPoolEntity.valiadteMainAccount(hrId,companyId);
        if(result1>0){
            return  talentPoolEntity.valicateCompanyApplication(userId,companyId);
        }else{
            int result2=talentPoolEntity.validatePublisherUserApp(hrId,userId);
            return result2;
        }
    }

    /*
     验证这个hr是否是这家公司的
     */
    public int validateHr(int hrId,int companyId){
        List<Map<String,Object>> hrList=talentPoolEntity.getCompanyHrList(companyId);
        Set<Integer> hrIdList=this.getIdListByUserHrAccountList(hrList);
        if(StringUtils.isEmptyList(hrList)){
            return 0;
        }
        if(!hrIdList.contains(hrId)){
            return 0;
        }
        return 1;
    }
    /*
          处理userid被hr收藏的关系
         */
    public  Map<Integer,Set<Map<String,Object>>> handlerTalentAndHr(Set<Integer> userIdList,Set<Integer> hrAccountIdList,List<Map<String,Object>> userHrList){
        if(StringUtils.isEmptySet(userIdList)||StringUtils.isEmptySet(hrAccountIdList)||StringUtils.isEmptyList(userHrList)){
            return null;
        }
        List<Map<String,Object>> talentpoolHrList=talentPoolEntity.getTalentpoolHrTalentByuserIdListAndhrIdList(userIdList,hrAccountIdList);
        if(StringUtils.isEmptyList(talentpoolHrList)){
            return null;
        }
        Map<Integer,Set<Integer>> userIdHrMap=talentPoolEntity.handleTalentAndRecord(userIdList,talentpoolHrList);
        if(userIdHrMap==null||userIdHrMap.isEmpty()){
            return null;
        }
        Map<Integer,Set<Map<String,Object>>> result=talentPoolEntity.handleDataResult(userIdHrMap,userHrList);
        return result;
    }

    /*
    验证是否能够添加或者删除备注
     */
    public int validateComment(int hrId,int companyId,int userId){
        //获取是不是主账号
        int count=talentPoolEntity.valiadteMainAccount(hrId,companyId);
        if(count>0){
            int result=talentPoolEntity.valicateCompanyApplication(userId,companyId);
            if(result==0){
                return talentPoolEntity.isUpLoad(companyId,userId);
            }
        }
        Set<Integer> userIdSet=new HashSet<>();
        userIdSet.add(userId);
        List<JobApplicationRecord> applist=talentPoolEntity.getJobApplicationByPublisherAndApplierId(userIdSet,hrId);
        if(!StringUtils.isEmptyList(applist)){
            return applist.size();
        }
        List<TalentpoolTalentRecord> list=talentPoolEntity.getTalentpoolTalentByCompanyId(companyId);
        Set<Integer> userIdList=this.getUserIdListByTalentpoolTalent(list);
        if(!StringUtils.isEmptySet(userIdList)){
            if(userIdList.contains(userId)){
                return 1;
            }
        }
        return 0;
    }
    /*
       根据TalentpoolTalentRecord获取userId
      */
    public Set<Integer> getUserIdListByTalentpoolTalent(List<TalentpoolTalentRecord> list){
        if(StringUtils.isEmptyList(list)){
            return null;
        }
        Set<Integer> result=new HashSet<>();
        for(TalentpoolTalentRecord record:list){
            result.add(record.getUserId());
        }
        return result;
    }

    /*
    获取一个人才被这个公司下hr的收藏情况
    */
    public List<Map<String,Object>>  getHrAboutTalent(int userId,int companyId){
        List<Map<String,Object>> userHrList=talentPoolEntity.getCompanyHrList(companyId);
        Set<Integer> hrAccountIdList=this.getIdListByUserHrAccountList(userHrList);
        List<Map<String,Object>> talentpoolHrList=talentPoolEntity.getTalentpoolHrTalentByuserIdAndhrIdList(userId,hrAccountIdList);
        Set<Integer> hrIdList=this.getIdListByTalentpoolHrTalentList(talentpoolHrList);
        List<Map<String,Object>> result=talentPoolEntity.getHrList(hrIdList,userHrList);
        return result;
    }
    /*
    通过user_Hr_Account的list获取hrIdList
   */
    private Set<Integer> getIdListByUserHrAccountList(List<Map<String,Object>> list){
        if(StringUtils.isEmptyList(list)){
            return null;
        }
        Set<Integer> hrIdList=new HashSet<>();
        for(Map<String,Object> record:list){
            hrIdList.add((int)record.get("id"));
        }
        return hrIdList;
    }


    /*
   处理人才和人才库记录的数据，获取map的数据map<人才id，hr的set集合>
  */
    private Map<Integer,Set<Integer>> handleTalentAndRecord(Set<Integer> userIdList,List<Map<String,Object>> talentpoolHrList){
        Map<Integer,Set<Integer>> userIdHrMap=new HashMap<>();
        for(Integer userId:userIdList){
            for(Map<String,Object> record:talentpoolHrList){
                int applierId=(int)record.get("user_id");
                int hrId=(int)record.get("hr_id");
                if(userId==applierId){
                    if(userIdHrMap.get(userId)==null){
                        Set<Integer> hrIdSet=new HashSet<>();
                        hrIdSet.add(hrId);
                        userIdHrMap.put(userId,hrIdSet);
                    }else{
                        Set<Integer> hrIdSet=userIdHrMap.get(userId);
                        hrIdSet.add(hrId);
                        userIdHrMap.put(userId,hrIdSet);
                    }
                }
            }
        }
        return userIdHrMap;
    }

    /*
     通过TalentpoolHrTalentRecord 的集合获取User_id的list
     */
    private Set<Integer> getIdListByTalentpoolHrTalentList(List<Map<String,Object>> list){
        if(StringUtils.isEmptyList(list)){
            return null;
        }
        Set<Integer> UserIdList=new HashSet<>();
        for(Map<String,Object> record:list){
            UserIdList.add((int)record.get("user_id"));
        }
        return UserIdList;
    }
    /*
    通过userIdList获取所有的公开人和收藏人
    */
    public Map<Integer,Object> handlerPublicAndTalent(int companyId,Set<Integer> userIdSet){
        List<Map<String,Object>> userHrList=talentPoolEntity.getCompanyHrList(companyId);
        Set<Integer> hrIdSet=this.getIdListByUserHrAccountList(userHrList);
        if(StringUtils.isEmptySet(userIdSet)||StringUtils.isEmptySet(hrIdSet)){
            return null;
        }
        List<Map<String,Object>> list=talentPoolEntity.getTalentpoolHrTalentByuserIdListAndhrIdList(userIdSet,hrIdSet);
        Map<Integer,Object> result=this.handlerPublicAndTalentData(list,userIdSet,userHrList);
        return result;
    }

    private Map<Integer,Object> handlerPublicAndTalentData( List<Map<String,Object>> list,Set<Integer> userIdSet,List<Map<String,Object>> userHrList){
        if(StringUtils.isEmptyList(list)){
            return null;
        }
        Map<Integer,Object> result=new HashMap<>();
        for(Integer key:userIdSet){
            Set<Map<String,Object>> talentSet=new HashSet<>();
            Set<Map<String,Object>> publicSet=new HashSet<>();
            Map<String,Object> data=new HashMap<>();
            data.put("favorite_hrs",talentSet);
            data.put("public_hrs",publicSet);
            for(Map<String,Object> map:list) {
                int userId = (int) map.get("user_id");
                int hrId = (int) map.get("hr_id");
                byte isPublic = (Byte) map.get("public");
                if (userId == key) {
                    for (Map<String, Object> hr : userHrList) {
                        int id = (int) hr.get("id");
                        if (id == hrId) {
                            talentSet.add(hr);
                            if (isPublic == 1) {
                                publicSet.add(hr);
                            }
                        }
                    }
                }
            }
            result.put(key,data);
        }
        return result;
    }


}
