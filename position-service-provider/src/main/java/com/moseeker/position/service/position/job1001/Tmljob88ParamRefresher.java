package com.moseeker.position.service.position.job1001;

import com.alibaba.fastjson.JSONObject;
import com.moseeker.position.service.position.job1001.refresh.handler.YLParamRefresher;
import org.springframework.stereotype.Component;

@Component
public class Tmljob88ParamRefresher extends YLParamRefresher{
    @Override
    public void addUserParam(JSONObject jsonSend) {
        jsonSend.put("user_name",getConfig("job1001.username"));
        jsonSend.put("password",getConfig("job1001.password"));
        jsonSend.put("safe_code",getConfig("job1001.safecode"));
        jsonSend.put("subsite",getConfig("tmjob88.subsite"));
    }
}
