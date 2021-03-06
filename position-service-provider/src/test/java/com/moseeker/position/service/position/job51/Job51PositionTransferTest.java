package com.moseeker.position.service.position.job51;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.moseeker.baseorm.dao.jobdb.JobPositionDao;
import com.moseeker.common.util.StringUtils;
import com.moseeker.common.util.query.Query;
import com.moseeker.position.config.AppConfig;
import com.moseeker.position.service.position.job51.pojo.Position51;
import com.moseeker.position.service.position.job51.pojo.Position51Form;
import com.moseeker.thrift.gen.apps.positionbs.struct.ThirdPartyPosition;
import com.moseeker.thrift.gen.apps.positionbs.struct.ThirdPartyPositionForm;
import com.moseeker.thrift.gen.dao.struct.hrdb.HrThirdPartyPositionDO;
import com.moseeker.thrift.gen.dao.struct.jobdb.JobPositionDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)
public class Job51PositionTransferTest {

    @Autowired
    Job51PositionTransfer job51PositionTransfer;

    @Autowired
    JobPositionDao jobPositionDao;

    @Test
    public void getCities(){
        JobPositionDO positionDO=new JobPositionDO();
        positionDO.setId(1909676);
        System.out.print(JSON.toJSONString(job51PositionTransfer.getCities(positionDO)));
    }

    @Test
    public void setOccupation(){
        Position51 position = new Position51();
        Position51Form positionForm = new Position51Form();

        List<String> occupation = new ArrayList<>();
        occupation.add("[\"0400\",\"0450\"]");
        occupation.add("[\"0400\",\"0401\"]");
        occupation.add("[\"0400\",\"0445\"]");
        positionForm.setOccupation(occupation);
        job51PositionTransfer.setOccupation(positionForm,position);
        System.out.println(position.getOccupation());
    }

    @Test
    public void toThirdPartyPosition(){
        List<String> occupations = new ArrayList<>();
        occupations.add("[\"0400\",\"0450\"]");
        occupations.add("[\"0400\",\"0401\"]");
        occupations.add("[\"0400\",\"0445\"]");

        ThirdPartyPosition position = new ThirdPartyPosition();
        position.setOccupation(occupations);

        HrThirdPartyPositionDO data = new HrThirdPartyPositionDO();
        //将最后一个职能的Code存到数据库
        /*if (!StringUtils.isEmptyList(position.getOccupation())) {
            List<String> occupation = position.getOccupation().stream().filter(StringUtils::isNotNullOrEmpty).map(o->{
                if(o.startsWith("[")){
                    JSONArray array = JSON.parseArray(o);
                    return array.getString(array.size()-1);
                }else{
                    return o;
                }
            }).collect(Collectors.toList());
            data.setOccupation(String.join(",",occupation));
        }*/

        System.out.println(data.getOccupation());
    }

//    @Test
    public void test(){
        String json="{\n" +
                "  \"appid\": 4,\n" +
                "  \"channels\": [\n" +
                "    {\n" +
                "      \"addressId\": 38327,\n" +
                "      \"addressName\": \"淮北市淮北\",\n" +
                "      \"channel\": 1,\n" +
                "      \"companyId\": 2454,\n" +
                "      \"companyName\": \"上海和黄药业有限公司\",\n" +
                "      \"count\": 0,\n" +
                "      \"departmentId\": 0,\n" +
                "      \"feedbackPeriod\": 0,\n" +
                "      \"occupation\": [\n" +
                "        \"0\",\n" +
                "        \"200\",\n" +
                "        \"203\"\n" +
                "      ],\n" +
                "      \"occupationSize\": 3,\n" +
                "      \"practicePerWeek\": 0,\n" +
                "      \"practiceSalary\": 0,\n" +
                "      \"practiceSalaryUnit\": 0,\n" +
                "      \"salaryBottom\": 4,\n" +
                "      \"salaryDiscuss\": false,\n" +
                "      \"salaryMonth\": 0,\n" +
                "      \"salaryTop\": 8,\n" +
                "      \"thirdPartyAccountId\": 0,\n" +
                "      \"useCompanyAddress\": false\n" +
                "    }\n" +
                "  ],\n" +
                "\n" +
                "  \"positionId\": 1915084\n" +
                "}";
        ThirdPartyPositionForm form= JSON.toJavaObject(JSON.parseObject(json),ThirdPartyPositionForm.class);
        Query qu = new Query.QueryBuilder().where("id", form.positionId).buildQuery();
        JobPositionDO jobPositionDO = jobPositionDao.getData(qu);
//        job51PositionTransfer.changeToThirdPartyPosition(JSON.parseObject(json),form.getChannels().get(0),jobPositionDO);
    }
}