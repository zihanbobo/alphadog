package com.moseeker.position.service.position.zhilian.refresher;

import com.alibaba.fastjson.JSONObject;
import com.moseeker.common.constants.ChannelType;
import com.moseeker.position.service.position.base.refresh.AbstractRabbitMQParamRefresher;
import com.moseeker.position.service.position.zhilian.refresher.handler.ZhilianResultHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ZhilianParamRefresher extends AbstractRabbitMQParamRefresher {
    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    List<ZhilianResultHandlerAdapter>  refreshList;

    @Override
    public void addSendParam(JSONObject jsonSend) {
        jsonSend.put("moseeker_region",moseekerRegin());
    }

    @Override
    public void receiveAndHandle(String json) {
        //调用所有处理策略
        refreshList.forEach(r->r.handle(json));
    }

    @Override
    public void addUserParam(JSONObject jsonSend) {
        jsonSend.put("user_name",getConfig("zhilian.username"));
        jsonSend.put("password",getConfig("zhilian.password"));
        jsonSend.put("mobile",getConfig("zhilian.mobile"));
        jsonSend.put("account_id",getConfig("zhilian.accountId"));
    }

    @Override
    public ChannelType getChannelType() {
        return ChannelType.ZHILIAN;
    }
}
