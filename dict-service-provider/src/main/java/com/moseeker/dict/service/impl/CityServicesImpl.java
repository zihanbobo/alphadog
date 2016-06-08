package com.moseeker.dict.service.impl;

import com.alibaba.fastjson.JSON;
import com.moseeker.common.exception.CacheConfigNotExistException;
import com.moseeker.common.providerutils.ResponseUtils;
import com.moseeker.common.redis.RedisClient;
import com.moseeker.common.redis.RedisClientFactory;
import com.moseeker.dict.dao.CityDao;
import com.moseeker.dict.pojo.CityPojo;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.dict.service.CityServices.Iface;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
public class CityServicesImpl implements Iface {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected CityDao dao;

    public Response getResources(CommonQuery query) throws TException {
        Response result;
        try {
            String cachKey = genCachKey(query);
            String patternString = "DICT_CITY";
            int appid = 0; // 允许所有app_id的请求缓存
            RedisClient rc = RedisClientFactory.getCacheClient();
            String cachedResult = rc.get(appid, patternString, cachKey, () -> {
                return JSON.toJSONString(this.getCitiesResponse());
            });
            result = JSON.parseObject(cachedResult, Response.class);
        } catch (CacheConfigNotExistException e) {
            logger.error(e.getMessage(), e);
            result = this.getCitiesResponse();
        }
        return result;
    }

    public Response getCitiesResponse() {
        List<CityPojo> cities = this.dao.getCities();
        HashMap transformed = transformData(cities);
        return ResponseUtils.success(transformed);
    }

    private HashMap transformData(List<CityPojo> s) {
        DictCityHashMap dictCity = new DictCityHashMap(s);
        HashMap hm = dictCity.getHashMap();
        return hm;
    }

    private String genCachKey(CommonQuery query) {
        return "all"; // 这里没有根据query来计算
    }
}

class DictCityHashMap {
    // TODO: 改成并行处理
    static final int PROVINCE = 1;
    static final int CITY = 2;
    static final int DISTRICT = 3;
    static final String[][] groups = {{"A", "G"}, {"H", "K"}, {"L", "S"}, {"T", "Z"}};
    private HashMap hm;

    public DictCityHashMap(List<CityPojo> s) {
        hm = new HashMap();
        if (s != null) {
            HashMap provinces = new HashMap();
            for (String[] group : groups) {
                String concatGroup = concatGroup(group);
                provinces.put(concatGroup, new ArrayList());
            }
            hm.put("86", provinces);
            for (CityPojo city : s) {
                DictCityHashMap.put(hm, city);
            }
        }
    }

    public HashMap getHashMap() {
        return this.hm;
    }

    static String concatGroup(String[] group) {
        return (group[0] + "-" + group[1]).toUpperCase();
    }

    static void put(HashMap hm, CityPojo city) {
        switch (city.level) {
            case PROVINCE: // province
                DictCityHashMap.putProvince(hm, city);
                break;
            case CITY: // city
                DictCityHashMap.putCity(hm, city);
                break;
            case DISTRICT: // district
                DictCityHashMap.putDistrict(hm, city);
                break;
        }
    }

    static String getGroup(String letter) {
        String g = null;
        for (String[] group : groups) {
            if (letter.compareToIgnoreCase(group[0]) >= 0 && letter.compareToIgnoreCase(group[1]) <= 0) {
                g = concatGroup(group);
                break;
            }
        }
        return g;
    }

    static void putProvince(HashMap hm, CityPojo city) {
        if (!hm.containsKey("" + city.code)) {
            hm.put("" + city.code, new HashMap());
        }
        // 按首字母分区的
        String initialLetter = city.ename.substring(0, 1).toUpperCase();
        String group = getGroup(initialLetter);
        List goupedProvinces = (List) ((HashMap) hm.get("86")).get(group);
        HashMap province = new HashMap();
        province.put("code", city.code + "");
        province.put("address", city.name);
        goupedProvinces.add(province);
    }

    static void putCity(HashMap hm, CityPojo city) {
        int provinceCode = city.code / 1000 * 1000;
        if (!hm.containsKey("" + provinceCode)) {
            hm.put("" + provinceCode, new HashMap());
        }
        HashMap p = (HashMap) hm.get("" + provinceCode);
        p.put("" + city.code, city.name);
    }

    static void putDistrict(HashMap hm, CityPojo city) {
        int provinceCode = city.code / 1000 * 1000;
        if (!hm.containsKey("" + provinceCode)) {
            hm.put("" + provinceCode, new HashMap());
        }
        int cityCode = city.code / 100 * 100;
        if (!hm.containsKey("" + cityCode)) {
            hm.put("" + cityCode, new HashMap());
        }

        HashMap c = (HashMap) hm.get("" + cityCode);
        c.put("" + city.code, city.name);
    }

}