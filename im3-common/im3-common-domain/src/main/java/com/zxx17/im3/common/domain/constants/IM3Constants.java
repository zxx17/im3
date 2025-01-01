package com.zxx17.im3.common.domain.constants;

/**
 * .
 *
 * @author Xinxuan Zhuo
 * @version 1.0.0
 * @since 2025/1/1
 **/
public final class IM3Constants {
    /*********************分隔符相关********************/

    /**
     * 用户id分隔符
     */
    public static final String USER_ID_SPLIT = ",";
    /**
     * Redis Key的分隔符
     */
    public static final String REDIS_KEY_SPLIT = ":";

    /**
     * 发送消息的Key
     */
    public static final String MESSAGE_KEY_SPLIT = "_";

    /*******************基本信息相关*******************/
    /**
     * 在线状态过期时间，默认是600秒，也就是10分钟
     */
    public static final long ONLINE_TIMEOUT_SECONDS = 600;

    /**
     * 消息允许撤回时间，默认300秒，也就是5分钟
     */
    public static final long ALLOW_RECALL_SECOND = 300;

    /*******************Redis相关*******************/
    /**
     * im-server最大id,从0开始递增
     */
    public final static String IM_MAX_SERVER_ID = "im:max_server_id";
    /**
     * 用户ID所连接的IM-server的ID
     */
    public final static String IM_USER_SERVER_ID = "im:user:server_id";


    /*******************RocketMQ相关*******************/
    /**
     * 消息的key
     */
    public static final String MSG_KEY = "message";
    /**
     * 未读私聊消息队列
     */
    public final static String IM_MESSAGE_PRIVATE_QUEUE = "im_message_private";

    /**
     * 未读私聊消息空队列
     */
    public final static String IM_MESSAGE_PRIVATE_NULL_QUEUE = "im_null_private";

    /**
     * 监听私聊消息消费分组
     */
    public final static String IM_MESSAGE_PRIVATE_CONSUMER_GROUP = "im_message_private_consumer_group";
    /**
     * 未读群聊消息队列
     */
    public final static String IM_MESSAGE_GROUP_QUEUE = "im_message_group";

    /**
     * 未读群聊消息空队列
     */
    public final static String IM_MESSAGE_GROUP_NULL_QUEUE = "im_null_group";

    /**
     * 监听群聊消息消费分组
     */
    public final static String IM_MESSAGE_GROUP_CONSUMER_GROUP = "im_message_group_consumer_group";
    /**
     * 私聊消息发送结果队列
     */
    public final static String IM_RESULT_PRIVATE_QUEUE = "im_result_private";
    /**
     * 私聊消息结果消费分组
     */
    public final static String IM_RESULT_PRIVATE_CONSUMER_GROUP = "im_result_private_consumer_group";
    /**
     * 群聊消息发送结果队列
     */
    public final static String IM_RESULT_GROUP_QUEUE = "im_result_group";

    /**
     * 群聊消息结果消费分组
     */
    public final static String IM_RESULT_GROUP_CONSUMER_GROUP = "im_result_group_consumer_group";


    /*************************Channel连接相关***********************/

    /**
     * 用户ID
     */
    public static final String USER_ID = "USER_ID";
    /**
     * 终端类型
     */
    public static final String TERMINAL_TYPE = "TERMINAL_TYPE";
    /**
     * 心跳次数
     */
    public static final String HEARTBEAT_TIMES = "HEARTBEAt_TIMES";

    /**
     * 读取的最小字节数
     */
    public static final int MIN_READABLE_BYTES = 4;

    /**
     * Redis Service
     */
    public static final String DISTRIBUTED_CACHE_REDIS_SERVICE_KEY = "distributed_cache_redis_service";

    /**
     * IM Server Group Bean Name
     */
    public static final String IM_SERVER_GROUP_BEAN_NAME = "IMServerGroup";


    /*************************平台相关********************/
    /**
     * 最大图片上传大小
     */
    public static final long MAX_IMAGE_SIZE = 5 * 1024 * 1024;
    /**
     * 最大上传文件大小
     */
    public static final long MAX_FILE_SIZE = 10 * 1024 * 1024;
    /**
     * 群聊最大人数
     */
    public static final long MAX_GROUP_MEMBER = 500;


    /**
     * 已读群聊消息位置(已读最大id)
     */
    public final static String IM_GROUP_READED_POSITION = "im:readed:group:position";
    /**
     * webrtc 会话信息
     */
    public final static String IM_WEBRTC_SESSION = "im:webrtc:session";
    /**
     * 缓存前缀
     */
    public final static String IM_CACHE = "im:cache:";
    /**
     * 缓存是否好友：bool
     */
    public final static String IM_CACHE_FRIEND = IM_CACHE + "friend";
    /**
     * 缓存群聊信息
     */
    public final static String IM_CACHE_GROUP = IM_CACHE + "group";
    /**
     * 缓存群聊成员id
     */
    public final static String IM_CACHE_GROUP_MEMBER_ID = IM_CACHE + "group_member_ids";

}
