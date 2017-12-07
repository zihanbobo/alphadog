package com.moseeker.position.service.position.job1001.refresh.handler;

import com.alibaba.fastjson.JSONObject;
import com.moseeker.common.constants.ChannelType;
import com.moseeker.position.service.position.base.refresh.AbstractRabbitMQParamRefresher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class YLParamRefresher extends AbstractRabbitMQParamRefresher{
    Logger logger= LoggerFactory.getLogger(YLParamRefresher.class);

    @Autowired
    List<YLResultHandlerAdapter> refreshList;

    @Override
    public void addSendParam(JSONObject jsonSend) {

    }

    @Override
    public void receiveAndHandle(String json) {
        logger.info("receive json:{}" ,json);
        //调用所有处理策略
        refreshList.forEach(r->r.handle(json));
    }

    @Override
    public ChannelType getChannelType() {
        return ChannelType.JOB1001;
    }
}
