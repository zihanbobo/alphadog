package com.moseeker.searchengine.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.moseeker.common.annotation.iface.CounterIface;
import com.moseeker.common.constants.ConstantErrorCodeMessage;
import com.moseeker.common.providerutils.ResponseUtils;
import com.moseeker.common.util.ConfigPropertiesUtil;
import com.moseeker.common.util.ConverTools;
import com.moseeker.searchengine.util.SearchUtil;
import com.moseeker.thrift.gen.common.struct.Response;

import com.sun.jmx.snmp.Timestamp;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.apache.thrift.TException;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.script.Script;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.AbstractAggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.metrics.MetricsAggregationBuilder;
import org.elasticsearch.search.sort.ScriptSortBuilder;
import org.elasticsearch.search.sort.SortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@CounterIface
public class SearchengineService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SearchUtil searchUtil;

    public Response query(String keywords, String cities, String industries, String occupations, String scale,
                          String employment_type, String candidate_source, String experience, String degree, String salary,
                          String company_name, int page_from, int page_size, String child_company_name, String department, boolean order_by_priority, String custom) throws TException {

        List listOfid = new ArrayList();

        if (page_from == 0) {
            page_from = 0;
        }
        if (page_size == 0) {
            page_size = 20;
        }
        SearchResponse response = null;
        ConfigPropertiesUtil propertiesReader = ConfigPropertiesUtil.getInstance();
        try {
            propertiesReader.loadResource("es.properties");
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        String cluster_name = propertiesReader.get("es.cluster.name", String.class);
        String es_connection = propertiesReader.get("es.connection", String.class);
        Integer es_port = propertiesReader.get("es.port", Integer.class);

        TransportClient client = null;
        try {

            Settings settings = Settings.settingsBuilder().put("cluster.name", cluster_name)
                    .build();

            client = TransportClient.builder().settings(settings).build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(es_connection), es_port));

            QueryBuilder defaultquery = QueryBuilders.matchAllQuery();
            QueryBuilder query = QueryBuilders.boolQuery().must(defaultquery);

            boolean haskey = false;

            if (!StringUtils.isEmpty(keywords)) {
                haskey = true;
                String[] keyword_list = keywords.split(" ");
                QueryBuilder keyand = QueryBuilders.boolQuery();
                for (int i = 0; i < keyword_list.length; i++) {
                    String keyword = keyword_list[i];
                    BoolQueryBuilder keyor = QueryBuilders.boolQuery();
                    QueryBuilder fullf = QueryBuilders.queryStringQuery(keyword)
//                            .field("_all", 1.0f)
                            .field("title", 20.0f)
                            .field("city", 10.0f)
//                            .field("company_name", 5.0f)
                            .field("team_name", 5.0f)
                            .field("custom", 4.0f)
                            .field("occupation", 3.0f);
                    ((BoolQueryBuilder) keyand).must(fullf);
                }
                ((BoolQueryBuilder) query).must(keyand);
            }


            if (!StringUtils.isEmpty(cities)) {
                String[] city_list = cities.split(",");
                QueryBuilder cityor = QueryBuilders.boolQuery();
                for (int i = 0; i < city_list.length; i++) {
                    String city = city_list[i];
                    System.out.println(city);
                    QueryBuilder cityfilter = QueryBuilders.matchPhraseQuery("city", city);
                    QueryBuilder cityboosting = QueryBuilders.boostingQuery()
                            .positive(cityfilter)
                            .negative(QueryBuilders.matchPhraseQuery("title", city)).negativeBoost(0.5f);

                    ((BoolQueryBuilder) cityor).should(cityboosting);
                }
                ((BoolQueryBuilder) query).must(cityor);
            }

            if (!StringUtils.isEmpty(industries)) {
                haskey = true;
                String[] industry_list = industries.split(",");
                QueryBuilder industryor = QueryBuilders.boolQuery();
                for (int i = 0; i < industry_list.length; i++) {
                    String industry = industry_list[i];
                    QueryBuilder industryfilter = QueryBuilders.matchPhraseQuery("industry", industry);
                    ((BoolQueryBuilder) industryor).should(industryfilter);
                }
                ((BoolQueryBuilder) query).must(industryor);
            }

            if (!StringUtils.isEmpty(occupations)) {
                String[] occupation_list = occupations.split(",");
                QueryBuilder occupationor = QueryBuilders.boolQuery();
                for (int i = 0; i < occupation_list.length; i++) {
                    String occupation = occupation_list[i];
                    QueryBuilder occupationfilter = QueryBuilders.matchPhraseQuery("occupation", occupation);
                    ((BoolQueryBuilder) occupationor).should(occupationfilter);
                }
                ((BoolQueryBuilder) query).must(occupationor);
            }

            if (!StringUtils.isEmpty(scale)) {

                QueryBuilder scalefilter = QueryBuilders.matchPhraseQuery("scale", scale);
                ((BoolQueryBuilder) query).must(scalefilter);
            }

            if (!StringUtils.isEmpty(employment_type)) {
                QueryBuilder employmentfilter = QueryBuilders.matchPhraseQuery("employment_type_name", employment_type);
                ((BoolQueryBuilder) query).must(employmentfilter);
            }

            if (!StringUtils.isEmpty(candidate_source)) {

                QueryBuilder candidatefilter = QueryBuilders.matchPhraseQuery("candidate_source_name", candidate_source);
                ((BoolQueryBuilder) query).must(candidatefilter);
            }

            if (!StringUtils.isEmpty(department)) {
                QueryBuilder departmentfilter = QueryBuilders.matchPhraseQuery("team_name", department);
                ((BoolQueryBuilder) query).must(departmentfilter);
            }

            if (!StringUtils.isEmpty(experience)) {
                QueryBuilder experiencefilter = QueryBuilders.matchPhraseQuery("experience", experience);
                ((BoolQueryBuilder) query).must(experiencefilter);
            }


            if (!StringUtils.isEmpty(degree)) {
                String[] degree_list = degree.split(",");
                QueryBuilder degreeor = QueryBuilders.boolQuery();
                for (int i = 0; i < degree_list.length; i++) {
                    String degree_name = degree_list[i];
                    QueryBuilder degreefilter = QueryBuilders.matchPhraseQuery("degree_name", degree_name);
                    ((BoolQueryBuilder) degreeor).should(degreefilter);
                }
                ((BoolQueryBuilder) query).must(degreeor);
            }


            if (!StringUtils.isEmpty(company_name)) {
                String[] company_list = company_name.split(",");
                QueryBuilder companyor = QueryBuilders.boolQuery();
                for (int i = 0; i < company_list.length; i++) {
                    String company_id = company_list[i];
                    QueryBuilder companyfilter = QueryBuilders.matchPhraseQuery("company_id", company_id);
                    ((BoolQueryBuilder) companyor).should(companyfilter);
                }
                ((BoolQueryBuilder) query).must(companyor);
            }


            if (!StringUtils.isEmpty(salary)) {
                String[] salary_list = salary.split(",");
                String salary_from = salary_list[0];
                String salary_to = salary_list[1];
                QueryBuilder salary_bottom_filter = QueryBuilders.rangeQuery("salary_bottom").from(salary_from).to(salary_to);
                QueryBuilder salary_top_filter = QueryBuilders.rangeQuery("salary_top").from(salary_from).to(salary_to);
                QueryBuilder salaryor = QueryBuilders.boolQuery();

                ((BoolQueryBuilder) salaryor).should(salary_bottom_filter);
                ((BoolQueryBuilder) salaryor).should(salary_top_filter);
                ((BoolQueryBuilder) query).must(salaryor);
            }

            if (!StringUtils.isEmpty(child_company_name)) {
                QueryBuilder child_company_filter = QueryBuilders.matchPhraseQuery("publisher_company_id", child_company_name);
                ((BoolQueryBuilder) query).must(child_company_filter);
            }

            if (!StringUtils.isEmpty(custom)) {
                QueryBuilder custom_filter = QueryBuilders.matchPhraseQuery("custom", custom);
                ((BoolQueryBuilder) query).must(custom_filter);
            }

            QueryBuilder status_filter = QueryBuilders.matchPhraseQuery("status", "0");
            ((BoolQueryBuilder) query).must(status_filter);

            if (order_by_priority) {

                if (haskey) {

                    response = client.prepareSearch("index").setTypes("fulltext")
                            .setQuery(query)
                            .addSort("priority", SortOrder.ASC)
                            .addSort("_score", SortOrder.DESC)
                            .setFrom(page_from)
                            .setSize(page_size).execute().actionGet();
                } else {
                    response = client.prepareSearch("index").setTypes("fulltext")
                            .setQuery(query)
                            .addSort("priority", SortOrder.ASC)
                            .addSort("update_time", SortOrder.DESC)
                            .setFrom(page_from)
                            .setSize(page_size).execute().actionGet();
                }

            } else {
                response = client.prepareSearch("index").setTypes("fulltext")
                        .setQuery(query)
                        .addSort("_score", SortOrder.DESC)
                        .setFrom(page_from)
                        .setSize(page_size).execute().actionGet();
            }

            for (SearchHit hit : response.getHits()) {
                //Handle the hit...
                String id = ConverTools.converToString(hit.getSource().get("id"));
                listOfid.add(id);
            }

        } catch (Exception e) {
            logger.error("error in search", e);
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION);
        } finally {
            client.close();
        }

        Map<String, List> res = new HashMap<String, List>();
        res.put("jd_id_list", listOfid);

        return ResponseUtils.success(res);

    }


    public Response updateposition(String position, int id) throws TException {
        ConfigPropertiesUtil propertiesReader = ConfigPropertiesUtil.getInstance();
        try {
            propertiesReader.loadResource("es.properties");
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        String cluster_name = propertiesReader.get("es.cluster.name", String.class);
        logger.info(cluster_name);
        String es_connection = propertiesReader.get("es.connection", String.class);
        Integer es_port = propertiesReader.get("es.port", Integer.class);
        Settings settings = Settings.settingsBuilder().put("cluster.name", cluster_name)
                .build();
        String idx = "" + id;
        TransportClient client = null;
        try {
            client = TransportClient.builder().settings(settings).build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(es_connection), es_port));
            IndexResponse response = client.prepareIndex("index", "fulltext", idx)
                    .setSource(position)
                    .execute()
                    .actionGet();
        } catch (UnknownHostException e) {
            logger.error("error in update", e);
            return ResponseUtils.fail(ConstantErrorCodeMessage.PROGRAM_EXCEPTION);
        } catch (Error error) {
            logger.error(error.getMessage());
        } finally {
            client.close();
        }

        return ResponseUtils.success("");
    }

    private SortBuilder buildSortScript(String field, SortOrder sortOrder) {
        StringBuffer sb = new StringBuffer();
        sb.append("double score=0; award=doc['" + field + "'].value;if(award){score=award}; return score;");
        String scripts = sb.toString();
        Script script = new Script(scripts);
        SortBuilder builder = new ScriptSortBuilder(script, "number");
        builder.order(sortOrder);
        return builder;
    }

    private SearchRequestBuilder getSearchRequestBuilder(List<Integer> companyIds, Integer employeeId, String activation, int pageSize, int pageNum, String timespan) {
        QueryBuilder defaultquery = QueryBuilders.matchAllQuery();
        QueryBuilder query = QueryBuilders.boolQuery().must(defaultquery);
        searchUtil.handleTerms(Arrays.toString(companyIds.toArray()).replaceAll("\\[|\\]| ", ""), query, "company_id");
        searchUtil.handleTerms(timespan, query, "awards." + timespan + ".timespan");
        if (activation != null) {
            searchUtil.handleTerms(activation, query, "activation");
        }
        if (employeeId != null) {
            searchUtil.handleTerms(String.valueOf(employeeId), query, "employee_id");
        }
        SearchRequestBuilder searchRequestBuilder = searchUtil.getEsClient().prepareSearch("awards").setTypes("award").setQuery(query)
                .addSort(buildSortScript("awards." + timespan + ".award", SortOrder.DESC))
                .addSort(buildSortScript("awards." + timespan + ".last_update_time", SortOrder.ASC))
                .setFetchSource(new String[]{"employee_id", "awards." + timespan + ".award", "awards." + timespan + ".last_update_time"}, null);
        if (pageNum > 0 && pageSize > 0) {
            searchRequestBuilder.setSize(pageSize).setFrom((pageNum - 1) * pageSize);
        }
        logger.info(searchRequestBuilder.toString());
        return searchRequestBuilder;
    }

    /*
      "scripted_metric": {
        "init_script": "_agg['transactions'] = []",
        "map_script": "int i = 0; val=doc['awards.2015'].value;if(val){if(val.award>100){i=i+1}else if(val.awars==100&&val.timespan<1000){i=i+1;}};_agg['transactions'].add(i)",
        "combine_script": "profit = 0; for (t in _agg.transactions) { profit += t }; return profit",
        "reduce_script": "profit = 0; for (a in _aggs) { profit += a }; return profit"
      }

     */
    private AbstractAggregationBuilder handleAggScale(String nodeName, int award, long lastUpdateTime){
        StringBuffer sb=new StringBuffer();
        sb.append("int i = 0;");
        sb.append(String.format("awardVal = doc['%s.award'].value; lastUpTimeVal = doc['%s.last_update_time'].value;", nodeName, nodeName));
        sb.append(String.format("if(awardVal > %d) {i = i+1}", award));
        sb.append(String.format("else if(awardVal == %d && lastUpTimeVal < %d) {i = i+1};", award, lastUpdateTime));
        sb.append("_agg['transactions'].add(i)");
        String mapScript=sb.toString();
        StringBuffer sb1=new StringBuffer();
        sb1.append("profit = 0; for (t in _agg.transactions) { profit += t }; return profit");
        String combinScript=sb1.toString();
        StringBuffer sb2=new StringBuffer();
        sb2.append("profit = 0; for (a in _aggs) { profit += a }; return profit");
        String reduceScript=sb2.toString();
        MetricsAggregationBuilder build= AggregationBuilders.scriptedMetric("ranking")
                .initScript(new Script("_agg['transactions'] = []"))
                .mapScript(new Script(mapScript))
                .reduceScript(new Script(reduceScript))
                .combineScript(new Script(combinScript));
        return build;
    }

    public Response queryAwardRanking(List<Integer> companyIds, String timespan, int pageSize, int pageNum) {
        SearchRequestBuilder searchRequestBuilder = getSearchRequestBuilder(companyIds, null, null, pageSize, pageNum, timespan);
        SearchResponse response = searchRequestBuilder.execute().actionGet();
        List<Map<String, Object>> data = new ArrayList<>();
        Map<String, Object> object = new HashMap<>();
        object.put("total", response.getHits().getTotalHits());
        for (SearchHit searchHit : response.getHits().getHits()) {
            Map<String, Object> objectMap = new HashMap<>();
            JSONObject jsonObject = JSON.parseObject(searchHit.getSourceAsString());
            objectMap.put("employeeId", jsonObject.remove("employee_id"));
            objectMap.put("award", jsonObject.getJSONObject("awards").getJSONObject(timespan).getInteger("award"));
            data.add(objectMap);
        }
        object.put("data", data);
        return ResponseUtils.success(object);
    }

    public Response queryAwardRankingInWx(List<Integer> companyIds, String timespan, Integer employeeId) {
        // 查找所有员工的积分排行
        SearchResponse response =  getSearchRequestBuilder(companyIds, null, "0", 22, 1, timespan).execute().actionGet();
        // 保证插入有序，使用linkedhashMap
        Map<Integer, Object> data = new LinkedHashMap<>();
        int index = 1;
        for (SearchHit searchHit : response.getHits().getHits()) {
            JSONObject jsonObject = JSON.parseObject(searchHit.getSourceAsString());
            if(jsonObject.getJSONObject("awards").getJSONObject(timespan).getIntValue("award") > 0) {
                JSONObject obj = JSON.parseObject("{}");
                obj.put("employee_id", jsonObject.getIntValue("employee_id"));
                obj.put("ranking", index);
                obj.put("last_update_time", jsonObject.getJSONObject("awards").getJSONObject(timespan).getString("last_update_time"));
                obj.put("award", jsonObject.getJSONObject("awards").getJSONObject(timespan).getString("award"));
                data.put(jsonObject.getIntValue("employee_id"), obj);
                index++;
            }
        }
        // 当前用户在 >= 22 名，显示返回前22条，小于22条返回前20+用户前一名+用户排名+用户后一名，未上榜返回前20条
        List<Object> allRankingList = new ArrayList<>(data.values());
        List<Object> resultList = new ArrayList<>(23);
        if ((!data.isEmpty() && data.containsKey(employeeId)) || (employeeId == null || employeeId == 0)) {
            resultList = allRankingList.subList(0, allRankingList.size() >= 22 ? 22 : allRankingList.size());
        } else {
            // 默认查询前20条
            resultList = allRankingList.subList(0, allRankingList.size() >= 20 ? 20 : allRankingList.size());
            SearchResponse hitEmployee =  getSearchRequestBuilder(companyIds, employeeId,"0", 0, 0, timespan).execute().actionGet();
            if (hitEmployee != null && hitEmployee.getHits().getHits().length > 0) {
                JSONObject employeeJson = JSONObject.parseObject(hitEmployee.getHits().getHits()[0].getSourceAsString()).getJSONObject("awards").getJSONObject(timespan);
                int employeeAward = employeeJson.getIntValue("award");
                long lastUpdateTime = java.sql.Timestamp.valueOf(LocalDateTime.parse(employeeJson.getString("last_update_time"))).getTime();
                if (employeeAward != 0) {
                    // 获取用户名次
                    SearchRequestBuilder builder=getSearchRequestBuilder(companyIds, null,"0", 0, 0, timespan).
                            addAggregation(handleAggScale("awards." + timespan, employeeAward, lastUpdateTime));
                    logger.info(builder.toString());
                    SearchResponse hitEmployeeRanking = builder.execute().actionGet();
                    if (hitEmployeeRanking != null && hitEmployeeRanking.getHits().getHits().length > 0) {
                        int ranking = (int)hitEmployeeRanking.getAggregations().asMap().get("ranking").getProperty("value");
                        SearchHits hits = getSearchRequestBuilder(companyIds, null,"0", 0, 0, timespan).setFrom(ranking).setSize(3).execute().actionGet().getHits();
                        for (SearchHit searchHit : hits.getHits()) {
                            JSONObject jsonObject = JSON.parseObject(searchHit.getSourceAsString());
                            JSONObject obj = JSON.parseObject("{}");
                            obj.put("employee_id", jsonObject.getIntValue("employee_id"));
                            obj.put("ranking", ranking);
                            obj.put("last_update_time", jsonObject.getJSONObject("awards").getJSONObject(timespan).getString("last_update_time"));
                            obj.put("award", jsonObject.getJSONObject("awards").getJSONObject(timespan).getString("award"));
                            resultList.add(obj);
                            ranking++;
                        }
                    }
                }
            }
        }
        data = resultList.stream().map(m -> JSONObject.parseObject(JSON.toJSONString(m))).collect(Collectors.toMap(k -> TypeUtils.castToInt(k.remove("employee_id")), v -> v));
        return ResponseUtils.success(data);
    }
}
