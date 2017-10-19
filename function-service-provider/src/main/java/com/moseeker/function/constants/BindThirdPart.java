package com.moseeker.function.constants;

public class BindThirdPart {
    public final static int APP_ID=0;
    public final static String KEY_IDENTIFIER="BIND_THRID_PART";

    public final static String BIND_CODE_MSG="异地登陆需要验证码";
    public final static String BIND_UP_ERR_MSG="用户名或密码错误";
    public final static String BIND_EXP_MSG="绑定异常，请重新绑定";
    public final static String BIND_ERR_MSG="绑定错误，请重新绑定";
    public final static String BIND_TIMEOUT_MSG="绑定超时，请稍后重试";

    public final static String BIND_EXCHANGE_NAME="chaos";

    public final static String BIND_SEND_ROUTING_KEY="bind.request";
    public final static String BIND_GET_ROUTING_KEY="bind.response";
    public final static String BIND_GET_QUEUE_NAME="bind.response.web";

    public final static String BIND_CONFIRM_SEND_ROUTING_KEY="mobile_confirm.request";
    public final static String BIND_CONFIRM_GET_ROUTING_KEY="mobile_confirm.response";
    public final static String BIND_CONFIRM_GET_QUEUE_NAME="mobile_confirm.response.web";

    public final static String BIND_CODE_SEND_ROUTING_KEY="mobile_code.request";
    public final static String BIND_CODE_GET_ROUTING_KEY="mobile_code.response";
    public final static String BIND_CODE_GET_QUEUE_NAME="mobile_code.response.web";

    public final static String CHAOS_ACCOUNTID="accountId";

}
