# file: useraccounts.struct

namespace java com.moseeker.thrift.gen.useraccounts.struct

typedef string Timestamp;

struct Userloginreq { 
    1: optional string unionid,
    2: optional string mobile,
    3: optional string password,
    4: optional string code
}

struct Usersetting { 
    1: optional i32 id,
    2: optional i32 user_id,
    3: optional string banner_url,
    4: optional i32 privacy_policy
}

/*
  用户实体
*/
struct User {
     1: optional i64        id              ,    // 主key
     2: optional string     username        ,    // 用户名，比如手机号、邮箱等
     3: optional string     password        ,    // 密码
     4: optional byte       is_disable      ,    // 是否禁用，0：可用，1：禁用
     5: optional i64        rank            ,    // 用户等级
     6: optional Timestamp  register_time   ,    // 注册时间
     7: optional string     register_ip     ,    // 注册IP
     8: optional Timestamp  last_login_time ,    // 最近登录时间
     9: optional string     last_login_ip   ,    // 最近登录IP
    10: optional i64        login_count     ,    // 登录次数
    11: optional i64        mobile          ,    // user pass mobile registe
    12: optional string     email           ,    // user pass email registe
    13: optional byte       activation      ,    // is not activation 0:no 1:yes
    14: optional string     activation_code ,    // activation code
    15: optional string     token           ,    // 用户校验token
    16: optional string     name            ,    // 姓名或微信昵称
    17: optional string     headimg         ,    // 头像
    18: optional i64        country_id      ,    // 国家字典表ID, dict_country.id
    19: optional i64        wechat_id       ,    // 注册用户来自于哪个公众号, 0:默认为来自浏览器的用户
    20: optional string     unionid         ,    // 存储仟寻服务号的unionid
    21: optional byte       source          ,    // 来源：0:手机注册, 1:聚合号一键登录, 2:企业号一键登录, 7:PC(正常添加), 8:PC(我要投递), 9: PC(我感兴趣)
    22: optional string     company         ,    // 点击我感兴趣时填写的公司
    23: optional string     position        ,    // 点击我感兴趣时填写的职位
    24: optional i64        parentid             // 合并到了新用户的id
}

/*
  我感兴趣/职位收藏关系表
*/
struct UserFavoritePosition {
    1: optional i64       id              ,       // ID
    2: optional i32       sysuser_id      ,       // 用户ID
    3: optional i32       position_id     ,       // 职位ID
    4: optional byte      favorite        ,       // 0:收藏, 1:取消收藏, 2:感兴趣
    5: optional string    mobile          ,       // 感兴趣的手机号
    6: optional i64       wxuser_id       ,       // wx_user.id
    7: optional i32       recom_id        ,       // 推荐者 fk:wx_user.id
    8: optional Timestamp create_time     ,       //
    9: optional Timestamp update_time             //
}

/*
HR用户实体
*/
struct UserHrAccount{
     1: optional i64               id              , //
     2: optional i64               company_id      , // company.id
     3: optional string            mobile          , // 手机号码
     4: optional string            email           , // 邮箱
     5: optional i64               wxuser_id       , // 绑定的微信账号
     6: optional string            password        , // 登录密码
     7: optional string            username        , // 企业联系人
     8: optional byte              account_type    , // 0 超级账号；1：子账号; 2：普通账号
     9: optional byte              activation      , // 账号是否激活，1：激活；0：未激活
    10: optional byte              disable         , // 1：可用账号；0禁用账号 ） 遵循数据库整体的设计习惯，1表示可用，0表示不可用
    11: optional Timestamp         register_time   , // 注册时间
    12: optional string            register_ip     , // 注册时的IP地址
    13: optional Timestamp         last_login_time , // 最后的登录时间
    14: optional string            last_login_ip   , // 最后一次登录的IP
    15: optional i32               login_count     , // 登录次数
    16: optional i32               source          , // 来源1:雇主 2:官网 3:微信扫描 4:我也要招人(聚合号) 5:我也要招人(企业号)
    17: optional string            download_token  , // 下载行业报告校验码
    18: optional Timestamp         create_time     , // 创建时间
    19: optional Timestamp         update_time       // 修改时间
}

