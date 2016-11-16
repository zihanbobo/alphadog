namespace java com.moseeker.thrift.gen.dao.service

include "../../common/struct/common_struct.thrift"
include "../../useraccounts/struct/useraccounts_struct.thrift"
include "../struct/dao_struct.thrift"

service UserHrAccountDao {
	common_struct.Response getAccount(1:common_struct.CommonQuery query);
	common_struct.Response getThirdPartyAccount(1:common_struct.CommonQuery query);
	common_struct.Response createThirdPartyAccount(1:useraccounts_struct.BindAccountStruct account);
	common_struct.Response upsertThirdPartyAccount(1:useraccounts_struct.BindAccountStruct account);
}

service WordpressDao {
	#查找文章
	dao_struct.WordpressPosts getPost(1:common_struct.CommonQuery query);
	#查找在发布状态下的最后一篇关于版本更新的文章
        dao_struct.WordpressPosts getReleaseVersionPost();
	#查找关系数据
	dao_struct.WordpressTermRelationships getRelationships(1:i64 objectId, 2:i64 termTaxonomyId);
	#查找这个类型下最后的文章
	dao_struct.WordpressTermRelationships getLastRelationships(1:i64 termTaxonomyId);
	#查找文章的版本号和平台字段
	dao_struct.PostExt getPostExt(1:i64 objectId);

	#查找用户读过的版本更新文章
	i64 getReadedPostId(1:i32 userId);
	#更新用户读过的版本更新内容
	common_struct.Response upsertUserPost(1:i32 userId, 2:i64 postId);
}

service CompanyDao {
	dao_struct.ThirdPartAccountData getThirdPartyAccount(1:common_struct.CommonQuery query);
}
