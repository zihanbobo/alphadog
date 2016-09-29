# file: useraccounts.thrift

include "../struct/useraccounts_struct.thrift"
include "../../common/struct/common_struct.thrift"

namespace java com.moseeker.thrift.gen.useraccounts.service

/**
* 用户服务
**/
service UseraccountsServices {

    // 用户用户数据
    common_struct.Response getUserById(1: i64 userId);
    common_struct.Response getUsers(1: common_struct.CommonQuery query);

    // 更新用户数据
    common_struct.Response updateUser(1: useraccounts_struct.User user);

    common_struct.Response getismobileregisted(1: string mobile);
    common_struct.Response postuserlogin(1: useraccounts_struct.Userloginreq userloginreq);
    common_struct.Response postuserlogout(1: i32 userid);
    common_struct.Response postsendsignupcode(1: string mobile);
    // 用户注册
    //common_struct.Response postusermobilesignup(1: string mobile, 2: string code, 3: string password);
    common_struct.Response postusermobilesignup(1: useraccounts_struct.User user, 2: string code);

    common_struct.Response postuserwxbindmobile(1: i32 appid, 2: string unionid, 3: string code,4: string mobile);
    common_struct.Response postuserchangepassword(1: i32 user_id, 2: string old_password,  3: string password);
    common_struct.Response postusersendpasswordforgotcode(1: string mobile);
    common_struct.Response postvalidatepasswordforgotcode(1: string mobile, 2:string code);
    common_struct.Response validateVerifyCode(1: string mobile, 2:string code, 3:i32 type);
    common_struct.Response sendVerifyCode(1: string mobile, 3:i32 type);
    common_struct.Response checkEmail(1: string email);
    common_struct.Response postuserresetpassword(1: string mobile, 2: string code, 3: string password);
    common_struct.Response postusermergebymobile(1: i32 appid, 2: string mobile);
    common_struct.Response postsendchangemobilecode(1: string oldmobile);
    common_struct.Response postvalidatechangemobilecode(1: string oldmobile, 2:string code);
    common_struct.Response postsendresetmobilecode(1:string newmobile);
    common_struct.Response postresetmobile(1: i32 user_id, 2: string newmobile, 3:string code);

    // 用户是否对该职位已经感兴趣
    common_struct.Response getUserFavPositionCountByUserIdAndPositionId(1: i32 userId, 2: i32 positionId);
    // 用户感兴趣账职位
    common_struct.Response postUserFavoritePosition(1: useraccounts_struct.UserFavoritePosition userFavoritePosition);

}

/**
* 用户配置服务
**/
service UsersettingServices {
    common_struct.Response getResource(1: common_struct.CommonQuery query);
    common_struct.Response putResource(1: useraccounts_struct.Usersetting usersetting);
    common_struct.Response postResource(1: useraccounts_struct.Usersetting usersetting);
}

/**
* HR账户服务
**/
service UserHrAccountService {

    // 发送手机验证码
    common_struct.Response sendMobileVerifiyCode(1: string mobile, 2: string code,  3: i32 source);
    common_struct.Response postResource(1: useraccounts_struct.DownloadReport downloadReport);
    common_struct.Response putResource(1: useraccounts_struct.UserHrAccount userHrAccount);

}
