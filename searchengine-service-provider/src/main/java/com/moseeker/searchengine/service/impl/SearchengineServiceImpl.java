package com.moseeker.searchengine.service.impl;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.QueryBuilders.*;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.lang.Exception;
import com.alibaba.fastjson.JSON;

import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

import com.moseeker.common.providerutils.ResponseUtils;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.searchengine.service.SearchengineServices.Iface;

@Service
public class SearchengineServiceImpl implements Iface {
    @Override
    public Response query(String keywords, String cities, String industries, String occupations, String scale,
            String employment_type, String candidate_source, String experience, String degree, String salary,
            String company_id, int page_from, int page_size) throws TException {
        if (page_from == 0) {
            page_from = 0;
        }
        if (page_size == 0) {
            page_size = 20;
        }
        SearchResponse response = null;
        try {

            Settings settings = Settings.settingsBuilder().put("cluster.name", "es-bj")
                    // .put("client.transport.sniff", true)
                    .build();

            TransportClient client = TransportClient.builder().settings(settings).build()
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("123.57.155.239"), 9300));

            if (keywords == null) {
                keywords = "android";
            }
            System.out.println(keywords);

            QueryBuilder defaultquery = QueryBuilders.matchAllQuery();
            QueryBuilder query = QueryBuilders.boolQuery().must(defaultquery);

            if (keywords != null) {
                QueryBuilder keyquery = QueryBuilders.simpleQueryStringQuery(keywords);
                query = QueryBuilders.boolQuery().must(keyquery);
            }

            if (cities != null) {
                String[] city_list = cities.split(",");
                QueryBuilder cityor = QueryBuilders.boolQuery();
                for (int i = 0; i < city_list.length; i++) {
                    String city = city_list[i];
                    System.out.println(city);
                    QueryBuilder cityfilter = QueryBuilders.termQuery("city", city);
                    ((BoolQueryBuilder) cityor).should(cityfilter);
                }
                ((BoolQueryBuilder) query).must(cityor);
            }

            if (industries != null) {
                String[] industry_list = industries.split(",");
                QueryBuilder industryor = QueryBuilders.boolQuery();
                for (int i = 0; i < industry_list.length; i++) {
                    String industry = industry_list[i];
                    QueryBuilder industryfilter = QueryBuilders.matchQuery("industry", industry);
                    ((BoolQueryBuilder) query).should(industryfilter);
                }
                ((BoolQueryBuilder) query).must(industryor);
            }

            if (occupations != null) {
                String[] occupation_list = occupations.split(",");
                QueryBuilder occupationor = QueryBuilders.boolQuery();
                for (int i = 0; i < occupation_list.length; i++) {
                    String occupation = occupation_list[i];
                    QueryBuilder occupationfilter = QueryBuilders.matchQuery("occupation", occupation);
                    ((BoolQueryBuilder) query).should(occupationfilter);
                }
                ((BoolQueryBuilder) query).must(occupationor);
            }

            if (scale != null) {
                QueryBuilder scalefilter = QueryBuilders.termQuery("scale", scale);
                ((BoolQueryBuilder) query).must(scalefilter);
            }

            if (employment_type != null) {
                QueryBuilder employmentfilter = QueryBuilders.termQuery("employment_type", employment_type);
                ((BoolQueryBuilder) query).must(employmentfilter);
            }

            if (candidate_source != null) {
                QueryBuilder candidatefilter = QueryBuilders.termQuery("candidate_source", candidate_source);
                ((BoolQueryBuilder) query).must(candidatefilter);
            }

            if (experience != null) {
                QueryBuilder experiencefilter = QueryBuilders.termQuery("experience", experience);
                ((BoolQueryBuilder) query).must(experiencefilter);
            }

            if (degree != null) {
                QueryBuilder degreefilter = QueryBuilders.termQuery("degree", degree);
                ((BoolQueryBuilder) query).must(degreefilter);
            }

            if (company_id != null) {
                QueryBuilder companyfilter = QueryBuilders.termQuery("company_id", company_id);
                ((BoolQueryBuilder) query).must(companyfilter);
            }

            if (salary != null) {
                QueryBuilder salaryfilter = QueryBuilders.termQuery("salary", salary);
                ((BoolQueryBuilder) query).must(salaryfilter);
            }

            response = client.prepareSearch("index").setTypes("fulltext").setQuery(query).setFrom(page_from)
                    .setSize(page_size).execute().actionGet();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        // System.out.println(JSON.toJSONString(response.toString()));

        Map<String, String> res = new HashMap<String, String>();
        res.put("searchres", response.toString());

        return ResponseUtils.success(res);

    }

    @Override
    public Response updateposition(String positionid) throws TException {
        // TODO Auto-generated method stub
        return null;
    }

}
