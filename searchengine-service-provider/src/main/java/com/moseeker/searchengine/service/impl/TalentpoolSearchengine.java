package com.moseeker.searchengine.service.impl;

import com.alibaba.fastjson.JSON;
import com.moseeker.common.util.StringUtils;
import com.moseeker.searchengine.util.SearchUtil;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.ScriptQueryBuilder;
import org.elasticsearch.script.Script;
import org.elasticsearch.search.sort.SortBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by zztaiwll on 17/12/8.
 */
@Service
public class TalentpoolSearchengine {

    @Autowired
    private SearchUtil searchUtil;

    public Map<String,Object>  talentSearch(Map<String,String> params){
        TransportClient client= searchUtil.getEsClient();
        String pageNum=params.get("page_number");
        String pageSize=params.get("page_size");
        return null;
    }
    /*
     组装查询语句
     */
    /*
     组装基本部分的查询条件
     */
    private QueryBuilder queryCommons(Map<String,String> params){
        QueryBuilder defaultquery = QueryBuilders.matchAllQuery();
        QueryBuilder query = QueryBuilders.boolQuery().must(defaultquery);
        String keyword=params.get("keyword");
        String lastCompany=params.get("in_last_job_company");
        String lastPosition=params.get("in_last_job_position");
        String cityName=params.get("city_name");
        String companyName=params.get("company_name");
        String pastPosition=params.get("past_position");
        String intentionCity=params.get("intention_city_name");
        if(StringUtils.isNotNullOrEmpty(intentionCity)){
            this.queryByIntentionCity(intentionCity,query);
        }
        if(StringUtils.isNotNullOrEmpty(keyword)){
            this.queryByKeyWord(keyword,query);
        }
        if(StringUtils.isNotNullOrEmpty(cityName)){
            this.queryByHome(cityName,query);
        }
        if(StringUtils.isNotNullOrEmpty(companyName)){
            this.queryByCompany(companyName,query);
        }

        if(StringUtils.isNotNullOrEmpty(lastCompany)){
            this.queryByLastCompany(lastCompany,query);
        }
        if(StringUtils.isNotNullOrEmpty(lastPosition)){
            this.queryByLastPositions(lastPosition,query);
        }
        if(StringUtils.isNotNullOrEmpty(pastPosition)){
            this.queryByWorkJob(pastPosition,query);
        }
        return query;
    }
    /*
     组装简历部分查询条件
     */
    private QueryBuilder queryProfiles(Map<String,String> params){
        QueryBuilder defaultquery = QueryBuilders.matchAllQuery();
        QueryBuilder query = QueryBuilders.boolQuery().must(defaultquery);
        String degree=params.get("degree");
        String intentionSalaryCode=params.get("intention_salary_code");
        String sex=params.get("sex");
        String workYears=params.get("work_years");
        String ages=params.get("work_years");
        String updateTime=params.get("ages");
        if(StringUtils.isNotNullOrEmpty(degree)){
            this.QueryByDegree(degree,query);
        }
        if(StringUtils.isNotNullOrEmpty(intentionSalaryCode)){
            this.queryByIntentionSalaryCode(intentionSalaryCode,query);
        }
        if(StringUtils.isNotNullOrEmpty(sex)){
            this.queryByGender(sex,query);
        }
        if(StringUtils.isNotNullOrEmpty(workYears)){
            this.queryByWorkYear(workYears,query);
        }
        if(StringUtils.isNotNullOrEmpty(updateTime)){
            this.queryByProfileUpDateTime(updateTime,query);
        }
        if(StringUtils.isNotNullOrEmpty(ages)){
            this.queryByAge(ages,query);
        }
        return query;
    }

    private QueryBuilder queryApplications(Map<String,String> params){
        QueryBuilder defaultquery = QueryBuilders.matchAllQuery();
        QueryBuilder query = QueryBuilders.boolQuery().must(defaultquery);
        String publisherIds=params.get("publisher_ids");
        String candidateSource=params.get("candidate_source");
        String recommend=params.get("only_recommend");
        String origins=params.get("origins");
        String submitTime=params.get("submit_time");
        String progressStatus=params.get("progress_status");
        if(StringUtils.isNotNullOrEmpty(publisherIds)){
            this.queryByPublisher(publisherIds,query);
        }
        if(StringUtils.isNotNullOrEmpty(candidateSource)){
            this.queryByCandidateSource(Integer.parseInt(candidateSource),query);
        }
        if(StringUtils.isNotNullOrEmpty(recommend)){
            this.queryByRecom(query);
        }
        if(StringUtils.isNotNullOrEmpty(submitTime)){
            this.queryBySubmitTime(submitTime,query);
        }
        if(StringUtils.isNotNullOrEmpty(progressStatus)){
            this.queryByProgress(Integer.parseInt(progressStatus),query);
        }
        if(StringUtils.isNotNullOrEmpty(origins)){

        }
        return query;
    }

    /*
     组装nest的查询语句
     */
    public QueryBuilder queryNest(Map<String,String> params){
        QueryBuilder defaultquery = QueryBuilders.matchAllQuery();
        QueryBuilder query = QueryBuilders.boolQuery().must(defaultquery);
        String tagIds=params.get("tag_ids");
        String favoriteHrs=params.get("favorite_hrs");
        String isPublic=params.get("public");
        if(StringUtils.isNotNullOrEmpty(tagIds)){
            this.queryByTagId(tagIds,query);
        }
        if(StringUtils.isNotNullOrEmpty(favoriteHrs)){
            this.queryHrTagId(favoriteHrs,query);
        }
        if(StringUtils.isNotNullOrEmpty(isPublic)){
            this.queryByPublic(Integer.parseInt(isPublic),query);
        }
        query=QueryBuilders.nestedQuery("user.talent_pool",query);
        return query;
    }

    /*
      使用script的方式组装对application的查询
     */

    public ScriptQueryBuilder queryScript(Map<String,String> params){
        String publisherIds=params.get("publisher_ids");
        String candidateSource=params.get("candidate_source");
        String recommend=params.get("only_recommend");
        String origins=params.get("origins");
        String submitTime=params.get("submit_time");
        String progressStatus=params.get("progress_status");
        if(StringUtils.isNullOrEmpty(publisherIds)
                &&StringUtils.isNullOrEmpty(progressStatus)
                &&StringUtils.isNullOrEmpty(candidateSource)
                &&StringUtils.isNullOrEmpty(recommend)
                &&StringUtils.isNullOrEmpty(origins)
                &&StringUtils.isNullOrEmpty(submitTime)){
            return null;

        }
        StringBuffer sb=new StringBuffer();
        sb.append("origin=0;profile=_source.user.profiles.profile;if(profile){origin=profile.origin};for ( val in _source.user.applications) {");
        if(StringUtils.isNotNullOrEmpty(publisherIds)){
            List<Integer> publisherIdList=this.convertStringToList(publisherIds);
            if(!StringUtils.isEmptyList(publisherIdList)){
                sb.append("if(val.publisher in "+publisherIdList.toArray()+"&&");
            }
        }
        if(StringUtils.isNotNullOrEmpty(candidateSource)){
            sb.append("val.candidate_source="+candidateSource+"&&");
        }
        if(StringUtils.isNotNullOrEmpty(recommend)){
            sb.append("val.recommender_user_id>0 &&");
        }
        if(StringUtils.isNotNullOrEmpty(origins)){
            sb.append("(val.origin="+origins+" or origin="+origins+")&&");
        }

        if(StringUtils.isNotNullOrEmpty(submitTime)){
            sb.append(" val.submit_time>"+submitTime+"&&");
        }
        if(StringUtils.isNotNullOrEmpty(progressStatus)){
            sb.append(" val.progress_status="+progressStatus+"&&");
        }
        sb=sb.deleteCharAt(sb.lastIndexOf("&"));
        sb=sb.deleteCharAt(sb.lastIndexOf("&"));
        sb.append("){return true}");
        ScriptQueryBuilder script=new ScriptQueryBuilder(new Script(sb.toString()));
        return script;
    }

    private List<Integer> convertStringToList(String params){
        if(StringUtils.isNotNullOrEmpty(params)){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        String[] arr=params.split(",");
        for(String item:arr){
            list.add(Integer.parseInt(item));
        }
        return list;
    }
    /*
     根据简历的更新时间查询
     */
    private void queryByProfileUpDateTime(String updateTime,QueryBuilder queryBuilder){
        Date date=new Date(updateTime);
        Long datetime=date.getTime();
        this.searchUtil.hanleRange(datetime,queryBuilder,"user.profiles.profile.update_time");
    }

    /*
     创建按照hr查询的索引语句
     */
    private void queryByPublisher(String publisherIds,QueryBuilder queryBuilder){
        searchUtil.handleTerms(publisherIds,queryBuilder,"user.applications.publisher");
    }
    /*
     构建按照关键词查询的索引语句
     */
    private void queryByKeyWord(String keyWord,QueryBuilder queryBuilder){
        List<String> fieldList=this.getFieldList();
        List<Integer> boostList=this.getBoostList();
        searchUtil.keyWordforQueryStringPropery(keyWord,queryBuilder,fieldList,boostList);
    }
    /*
       构建招聘类型的查询语句
     */
    private void queryByCandidateSource(int source,QueryBuilder queryBuilder){
        searchUtil.handleMatch(source,queryBuilder,"user.applications.candidate_source");
    }
    /*
      构建是否内推的查询语句
     */
    private void queryByRecom(QueryBuilder queryBuilder){
        searchUtil.hanleRange(0,queryBuilder,"user.applications.recommender_user_id");
    }
    /*
      构建简历来源的查询语句
     */
    private void queryByOrigin(String condition1,String condition2,QueryBuilder queryBuilder){

    }
    /*
      构建通过职位来查询的语句
     */
    private void queryByPositionId(String positionIds,QueryBuilder queryBuilder ){
        searchUtil.handleTerms(positionIds,queryBuilder,"user.applications.position_id");
    }

    /*

    /*
      构建是否公开的查询语句,注意这个位置要做成nest的查询
     */
    private void queryByPublic(int isPublic,QueryBuilder queryBuilder){
        searchUtil.handleMatch(isPublic,queryBuilder,"user.talent_pool.is_public");
    }
    /*
      构建收藏人的查询语句
     */
    private void queryByCollectid(String hrIds,QueryBuilder queryBuilder){
        searchUtil.handleTerms(hrIds,queryBuilder,"user.talent_pool.hr_id");
    }
    /*
      构建按招标签的查询语句
     */
    private void queryByTagId(String tagIds,QueryBuilder queryBuilder){
        searchUtil.handleTerms(tagIds,queryBuilder,"user.talent_pool.tag.tag_id");
    }
    /*
      构建按照期望城市名称的查询语句
     */
    private void queryByIntentionCity(String cityNames,QueryBuilder queryBuilder){
        searchUtil.handleTerms(cityNames,queryBuilder,"user.profiles.intentions.city");
    }
    /*
      按照公司名称查询
     */
    private void queryByIntentionSalaryCode(String salaryCodes,QueryBuilder queryBuilder){
        searchUtil.handleTerms(salaryCodes,queryBuilder,"user.profiles.intentions.city");
    }
    /*
      按照学历查询
     */
    private void QueryByDegree(String degrees,QueryBuilder queryBuilder){
        searchUtil.handleTerms(degrees,queryBuilder,"user.profiles.basic.gender");
    }
    /*
      按照最后工作的公司查询
     */
    private void queryByLastCompany(String companys,QueryBuilder queryBuilder){
        searchUtil.handleTerms(companys,queryBuilder,"user.profiles.recent_job.company_name");
    }
    /*
      按照最后工作的职位名称查询
     */
    private void queryByLastPositions(String positions,QueryBuilder queryBuilder){
        searchUtil.handleTerms(positions,queryBuilder,"user.profiles.recent_job.job");
    }
    /*
      按照现居住地查询
     */

    private void queryByHome(String home,QueryBuilder queryBuilder){
        searchUtil.handleTerm(home,queryBuilder,"user.profiles.basic.city_name");
    }
    /*
      按照期望薪资查询
     */
    private void queryBySlalryCode(String salaryCode,QueryBuilder queryBuilder){
        searchUtil.handleTerms(salaryCode,queryBuilder,"user.profiles.intentions.salary_code");
    }
    /*
      按照年龄查询
     */
    private void queryByAge(String ages,QueryBuilder queryBuilder){
        List<Map<String,Integer>> list=this.convertParams(ages);
        searchUtil.shoudRangeAgeOrDegreeList(list,queryBuilder,"user.age");
    }
    /*
     将字符串转换成SON
     */
    private List<Map<String,Integer>> convertParams(String params){
        List<Map<String,Integer>> list= (List<Map<String, Integer>>) JSON.toJSON(params);
        return list;
    }
    /*
      按照曾任职务查询
     */
    private void queryByWorkJob(String works,QueryBuilder queryBuilder){
        Map<String,Object> queryMap=new HashMap<>();
        queryMap.put("user.profiles.recent_job.job",works);
        queryMap.put("user.profiles.workexps.job",works);
        searchUtil.shouldTermsQuery(queryMap,queryBuilder);
    }
    /*
     构建通过曾经工作的公司查询
     */
    private void queryByCompany(String companys,QueryBuilder queryBuilder){
        Map<String,Object> queryMap=new HashMap<>();
        queryMap.put("user.profiles.recent_job.company_name",companys);
        queryMap.put("user.profiles.workexps.company_name",companys);
        searchUtil.shouldTermsQuery(queryMap,queryBuilder);
    }
    /*
      按照性别查询
     */
    private void queryByGender(String gender,QueryBuilder queryBuilder){
        searchUtil.handleTerm(gender,queryBuilder,"user.profiles.basic.gender");
    }
    /*
      按照投递时间查询
     */
    private void queryBySubmitTime(String submitTime,QueryBuilder queryBuilder){
        Date date=new Date(submitTime);
        Long datetime=date.getTime();
        searchUtil.hanleRange(datetime,queryBuilder,"user.applications.submit_time");
    }
    /*
      按照工作年限查新
     */
    private void queryByWorkYear(String workYears,QueryBuilder queryBuilder){
        List<Map<String,Integer>> list=this.convertParams(workYears);
        searchUtil.shoudRangeAgeOrDegreeList(list,queryBuilder,"user.workyear");
    }
    /*
      按照招聘进度查询
     */
    private void queryByProgress(int progress,QueryBuilder queryBuilder){
        searchUtil.handleMatch(progress,queryBuilder,"user.applications.progress");
    }
    /*
     根据hr的标签查询
     */
    private void queryHrTagId(String hrIds,QueryBuilder queryBuilder){
        searchUtil.handleTerms(hrIds,queryBuilder,"user.talent_pool.hr_id");
    }
    /*
        组装全文检索查询的条件
     */
    private List<String> getFieldList(){
        List<String> fieldList=new ArrayList<>();
        fieldList.add("user.profiles.basic.name");
        fieldList.add("user.profiles.recent_job.company_name");
        fieldList.add("user.profiles.recent_job.department_name");
        fieldList.add("user.profiles.recent_job.job");
        fieldList.add("user.profiles.other_workexps.company_name");
        fieldList.add("user.profiles.other_workexps.department_name");
        fieldList.add("user.profiles.other_workexps.job");
        fieldList.add("user.profiles.other_workexps.description");
        fieldList.add("user.profiles.educations.description");
        fieldList.add("user.profiles.projectexps.name");
        fieldList.add("user.profiles.projectexps.description");
        fieldList.add("user.profiles.skills");
        fieldList.add("user.profiles.credentials.name");
        return fieldList;
    }
    /*
        组装全文检索查询的权重
   */
    private List<Integer> getBoostList(){
        List<Integer> boostList=new ArrayList<>();
        boostList.add(20);
        boostList.add(10);
        boostList.add(10);
        boostList.add(10);
        boostList.add(8);
        boostList.add(8);
        boostList.add(8);
        boostList.add(5);
        boostList.add(5);
        boostList.add(3);
        boostList.add(3);
        boostList.add(1);
        boostList.add(1);
        return boostList;
    }
    /*
     组装查询语句

     */
    private SortBuilder handlerOrderScript(String publisherIds,String hrId){

        return null;
    }

}
