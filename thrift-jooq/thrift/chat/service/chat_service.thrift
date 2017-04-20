# file: chat_service.thrift

include "../../common/struct/common_struct.thrift"
include "../struct/chat_struct.thrift"
namespace java com.moseeker.thrift.gen.chat.service

service ChatService {
    chat_struct.HRChatRoomsVO listHRChatRoom(1: i32 hrId, 2: i32 pageNo, 3: i32 pageSize) throws (1: common_struct.CURDException e)
    chat_struct.UserChatRoomsVO listUserChatRoom(1: i32 userId, 2: i32 pageNo, 3: i32 pageSize) throws (1: common_struct.CURDException e)
    chat_struct.ChatsVO listChatLogs(1: i32 roomId, 2: i32 pageNo, 3: i32 pageSize) throws (1: common_struct.CURDException e)
    void saveChat(1: i32 roomId, 2: string content, 3: i32 positionId, 4: i8 speaker) throws (1: common_struct.CURDException e)
    chat_struct.ResultOfSaveRoomVO enterRoom(1: i32 userId, 2: i32 hrId, 3: i32 positionId, 4: i32 roomId) throws (1: common_struct.CURDException e)
    chat_struct.ChatVO getChat(1: i32 roomId, 2: i8 speaker) throws (1: common_struct.CURDException e)
    void leaveChatRoom(1: i32 roomId, 2: i8 speaker) 
}
