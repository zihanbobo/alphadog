package com.moseeker.chat.service.entity;

import com.moseeker.chat.constant.ChatSpeakerType;
import com.moseeker.common.providerutils.QueryUtil;
import com.moseeker.common.thread.ThreadPool;
import com.moseeker.common.util.StringUtils;
import com.moseeker.rpccenter.client.ServiceManager;
import com.moseeker.thrift.gen.dao.service.HrDBDao;
import com.moseeker.thrift.gen.dao.service.UserDBDao;
import com.moseeker.thrift.gen.dao.struct.*;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by jack on 09/03/2017.
 */
public class ChatDao {

    Logger logger = LoggerFactory.getLogger(ChatDao.class);

    HrDBDao.Iface hrDBDao = ServiceManager.SERVICEMANAGER.getService(HrDBDao.Iface.class);
    UserDBDao.Iface userDBDao = ServiceManager.SERVICEMANAGER.getService(UserDBDao.Iface.class);

    ThreadPool threadPool = ThreadPool.Instance;

    /**
     * 按照未阅读对聊天室排序
     * @param type 聊天对象类型
     * @param id 编号
     * @param pageNo 页码
     * @param pageSize 每页显示的数量
     * @return 聊天室列表
     */
    public List<HrChatUnreadCountDO> listChatRoomUnreadCount(ChatSpeakerType type, int id, int pageNo, int pageSize) {
        QueryUtil queryUtil = new QueryUtil();
        queryUtil.addSelectAttribute("room_id");
        queryUtil.setOrder("desc");
        switch (type) {
            case HR:
                queryUtil.addSelectAttribute("hr_unread_count").addSelectAttribute("hr_id");
                queryUtil.setSortby("hr_unread_count");
                queryUtil.addEqualFilter("hr_unread_count", id);
                break;
            case USER:
                queryUtil.addSelectAttribute("user_unread_count").addSelectAttribute("user_id");
                queryUtil.setSortby("user_unread_count");
                queryUtil.addEqualFilter("user_unread_count", id);
                break;
            default:
        }
        queryUtil.setPer_page(pageSize);
        queryUtil.setPage(pageNo);
        try {
            return hrDBDao.listChatRoomUnreadSort(queryUtil);
        } catch (CURDException e) {
            return new ArrayList<>();
        } catch (TException e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 根据HR编号查找聊天室列表
     * @param hrId hr编号
     * @return 聊天室列表
     */
    public List<HrWxHrChatListDO> listHRChatRoom(int[] hrId) {

        QueryUtil queryUtil = new QueryUtil();
        queryUtil.addEqualFilter("hraccount_id", hrId);

        try {
            return hrDBDao.listChatRooms(queryUtil);
        } catch (TException e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 查找聊天室数量
     * @param hrId HR编号
     * @return 聊天室数量
     */
    public int countHRChatRoom(int hrId) {
        QueryUtil queryUtil = new QueryUtil();
        queryUtil.addEqualFilter("hraccount_id", hrId);
        try {
            return hrDBDao.countChatRooms(queryUtil);
        } catch (TException e) {
            return 0;
        }
    }

    /**
     * 查找聊天室
     * @param roomIdArray 聊天室编号数组
     * @return 聊天室
     */
    public List<HrWxHrChatListDO> listChatRoom(int[] roomIdArray) {
        QueryUtil queryUtil = new QueryUtil();
        queryUtil.addSelectAttribute("create_time").addSelectAttribute("wx_chat_time").addSelectAttribute("hr_chat_time")
                .addSelectAttribute("id");

        queryUtil.addEqualFilter("id", StringUtils.converFromArrayToStr(roomIdArray));
        try {
            return hrDBDao.listChatRooms(queryUtil);
        } catch (CURDException e) {
            return null;
        } catch (TException e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 查找用户信息
     * @param userIdArray 用户编号
     * @return 用户信息列表
     */
    public List<UserUserDO> listUsers(int[] userIdArray) {
        String idStr = StringUtils.converFromArrayToStr(userIdArray);
        QueryUtil queryUtil = new QueryUtil();
        queryUtil.addSelectAttribute("id").addSelectAttribute("name").addSelectAttribute("headimg")
                .addSelectAttribute("nickname");

        queryUtil.addEqualFilter("id", idStr);
        try {
            List<UserUserDO> userUserDOList = userDBDao.listUser(queryUtil);
            if(userUserDOList != null && userUserDOList.size() > 0) {

                /** 如果存在没有头像的用户信息，那么查找绑定的微信账号，并取微信账号的头像 */
                int[] noHeadImgArray = userUserDOList.stream()
                        .filter(userUserDO -> StringUtils.isNullOrEmpty(userUserDO.getHeadimg()))
                        .mapToInt(userUserDO -> userUserDO.getId()).toArray();
                if(noHeadImgArray != null && noHeadImgArray.length > 0) {
                    String wxUserIdStr = StringUtils.converFromArrayToStr(noHeadImgArray);
                    QueryUtil findHeadImg = new QueryUtil();
                    findHeadImg.addSelectAttribute("headimgurl").addSelectAttribute("id");
                    findHeadImg.addEqualFilter("sysuser_id", wxUserIdStr);
                    List<UserWxUserDO> wxUserDOList = userDBDao.listUserWxUserDO(findHeadImg);
                    if(wxUserDOList != null && wxUserDOList.size() > 0) {

                        userUserDOList.stream().filter(userUserDO -> StringUtils.isNullOrEmpty(userUserDO.getHeadimg())).forEach(userUserDO -> {
                            wxUserDOList.forEach(userWxUserDO -> {
                                if(userUserDO.getId() == userWxUserDO.getSysuserId()) {
                                    userUserDO.setHeadimg(userWxUserDO.getHeadimgurl());
                                }
                            });
                        });
                    }
                }

            }

            return userUserDOList;
        } catch (CURDException e) {
            return new ArrayList<>();
        } catch (TException e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 根据HR编号查找公司名称和logo
     * @param hrIdArray hr编号
     * @return 公司信息集合
     */
    public List<HrCompanyDO> listCompany(int[] hrIdArray) {
        List<HrCompanyDO> companyDOList = null;
        if(hrIdArray != null && hrIdArray.length > 0) {
            String hrId = StringUtils.converFromArrayToStr(hrIdArray);
            QueryUtil queryUtil = new QueryUtil();
            queryUtil.addSelectAttribute("id").addSelectAttribute("name").addSelectAttribute("abbreviation")
                    .addSelectAttribute("logo");
            queryUtil.addEqualFilter("id", hrId);
            try {
                companyDOList = hrDBDao.listCompany(queryUtil);
            } catch (CURDException e) {
                companyDOList = new ArrayList<>();
            } catch (TException e) {
                logger.error(e.getMessage(), e);
            }
        }
        return companyDOList;
    }

    /**
     * 查询用户聊天室数量
     * @param userId 用户编号
     * @return 聊天室数量
     */
    public int countUserChatRoom(int userId) {
        QueryUtil queryUtil = new QueryUtil();
        queryUtil.addEqualFilter("sysuser_id", userId);
        try {
            return hrDBDao.countChatRooms(queryUtil);
        } catch (TException e) {
            return 0;
        }
    }

    /**
     * 查找HR信息
     * @param hrIdArray hr编号
     * @return HR信息集合
     */
    public List<UserHrAccountDO> listHr(int[] hrIdArray) {


        String idStr = StringUtils.converFromArrayToStr(hrIdArray);
        QueryUtil queryUtil = new QueryUtil();
        queryUtil.addSelectAttribute("id").addSelectAttribute("company_id").addSelectAttribute("username")
                .addSelectAttribute("headimgurl").addSelectAttribute("wxuser_id");
        queryUtil.addEqualFilter("id", idStr);
        List<UserHrAccountDO> userHrAccountDOList = null;
        try {
            userHrAccountDOList = userDBDao.listUserHrAccount(queryUtil);

            /** 需要检查HR的头像是否存在，如果不存在则使用HR绑定的微信账号的头像；如果还是没有，则使用公司的logo */
            if(userHrAccountDOList != null && userHrAccountDOList.size() > 0) {
                //查找头像不存在的HR的微信编号
                int[] wxUserIdArray = userHrAccountDOList.stream()
                        .filter(userHrAccountDO -> StringUtils.isNullOrEmpty(userHrAccountDO.getHeadimgurl()))
                        .mapToInt(userHrAccountDO -> userHrAccountDO.getWxuserId()).toArray();
                //查找头像不存在的公司编号
                int[] companyIdArray = userHrAccountDOList.stream()
                        .filter(userHrAccountDO -> StringUtils.isNullOrEmpty(userHrAccountDO.getHeadimgurl()))
                        .mapToInt(userHrAccountDO -> userHrAccountDO.getCompanyId()).toArray();

                /** 查找微信信息 */
                if(wxUserIdArray.length > 0) {
                    String wxUserIdStr = StringUtils.converFromArrayToStr(wxUserIdArray);
                    QueryUtil findWxUser = new QueryUtil();
                    findWxUser.addSelectAttribute("id").addSelectAttribute("headimgurl").addSelectAttribute("nickname");
                    findWxUser.addEqualFilter("id", wxUserIdStr);
                    Future wxUserFuture = threadPool.startTast(() -> userDBDao.listUserWxUserDO(findWxUser));

                    /** 过滤头像不存在的HR，匹配微信的头像*/
                    userHrAccountDOList.stream()
                            .filter(userHrAccountDO -> StringUtils.isNullOrEmpty(userHrAccountDO.getHeadimgurl()))
                            .forEach(userHrAccountDO -> {
                                try {
                                    List<UserWxUserDO> wxUserDOList = (List<UserWxUserDO>) wxUserFuture.get();
                                    if(wxUserDOList != null && wxUserDOList.size() > 0) {
                                        wxUserDOList.forEach(wxUserDO -> {
                                            if(userHrAccountDO.getWxuserId() == wxUserDO.getWechatId()) {
                                                userHrAccountDO.setHeadimgurl(wxUserDO.getHeadimgurl());
                                            }
                                        });
                                    }
                                } catch (InterruptedException | ExecutionException e) {
                                    logger.error(e.getMessage(), e);
                                }
                            });
                }

                /** 查找公司信息 */
                if(companyIdArray.length > 0) {
                    String companyIdStr = StringUtils.converFromArrayToStr(companyIdArray);
                    QueryUtil findCompany = new QueryUtil();
                    findCompany.addSelectAttribute("id").addSelectAttribute("logo");
                    findCompany.addEqualFilter("id",companyIdStr);
                    Future companyFuture = threadPool.startTast(() -> hrDBDao.listCompany(queryUtil));


                    /** 过滤头像不存在的HR，匹配公司logo*/
                    userHrAccountDOList.stream()
                            .filter(userHrAccountDO -> StringUtils.isNullOrEmpty(userHrAccountDO.getHeadimgurl()))
                            .forEach(userHrAccountDO -> {
                                try {
                                    List<HrCompanyDO> companyDOList = (List<HrCompanyDO>) companyFuture.get();
                                    if(companyDOList != null && companyDOList.size() > 0) {
                                        companyDOList.forEach(companyDO -> {
                                            if(userHrAccountDO.getCompanyId() == companyDO.getId()) {
                                                userHrAccountDO.setHeadimgurl(companyDO.getLogo());
                                            }
                                        });
                                    }
                                } catch (InterruptedException | ExecutionException e) {
                                    logger.error(e.getMessage(), e);
                                }
                            });
                }

            }
            return userHrAccountDOList;
        } catch (CURDException e) {
            return new ArrayList<>();
        } catch (TException e) {
            logger.error(e.getMessage(), e);
            return null;
        }

    }

    /**
     * 计算聊天室的聊天记录总数
     * @param roomId 聊天室编号
     * @return 聊天室的聊天记录总数
     */
    public int countChatLog(int roomId) {
        QueryUtil queryUtil = new QueryUtil();
        queryUtil.addEqualFilter("chatlist_id", roomId);
        queryUtil.setOrder("desc");
        queryUtil.setSortby("create_time");
        try {
            return hrDBDao.countChats(queryUtil);
        } catch (TException e) {
            return 0;
        }
    }

    /**
     * 分页查找聊天室下的聊天记录
     * @param roomId 聊天室编号
     * @return 聊天内容集合
     */
    public List<HrWxHrChatDO> listChat(int roomId) {
        QueryUtil queryUtil = new QueryUtil();
        queryUtil.addEqualFilter("chatlist_id", roomId);
        queryUtil.setOrder("desc");
        queryUtil.setSortby("create_time");
        try {
            return hrDBDao.listChats(queryUtil);
        } catch (CURDException e) {
            return new ArrayList<>();
        } catch (TException e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    public HrWxHrChatDO saveChat(HrWxHrChatDO chatDO) {
        try {
            return hrDBDao.saveChat(chatDO);
        } catch (TException e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    public HrWxHrChatListDO saveChatRoom(HrWxHrChatListDO chatRoom) {
        try {
            return hrDBDao.saveChatRoom(chatRoom);
        } catch (TException e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    public HrCompanyDO getCompany(int hrId) {
        HrCompanyDO companyDO = null;

        return companyDO;
    }

    public JobPositionDO getPosition(int roomId) {
        return null;
    }

    public UserHrAccountDO getHr(int hrId) {
        return null;
    }
}
