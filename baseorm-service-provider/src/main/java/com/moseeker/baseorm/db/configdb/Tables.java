/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.configdb;


import com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationChannel;
import com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationEvents;
import com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationGroup;
import com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationGroupmembers;
import com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationMembers;
import com.moseeker.baseorm.db.configdb.tables.ConfigAtsSource;
import com.moseeker.baseorm.db.configdb.tables.ConfigCacheconfigRediskey;
import com.moseeker.baseorm.db.configdb.tables.ConfigCronjobs;
import com.moseeker.baseorm.db.configdb.tables.ConfigHbBalance;
import com.moseeker.baseorm.db.configdb.tables.ConfigOmsSwitchManagement;
import com.moseeker.baseorm.db.configdb.tables.ConfigPositionKenexa;
import com.moseeker.baseorm.db.configdb.tables.ConfigSysAdministrator;
import com.moseeker.baseorm.db.configdb.tables.ConfigSysAppTemplate;
import com.moseeker.baseorm.db.configdb.tables.ConfigSysCvTpl;
import com.moseeker.baseorm.db.configdb.tables.ConfigSysH5StyleTpl;
import com.moseeker.baseorm.db.configdb.tables.ConfigSysPointsConfTpl;
import com.moseeker.baseorm.db.configdb.tables.ConfigSysTemplateMessageColumnConfig;
import com.moseeker.baseorm.db.configdb.tables.ConfigSysTemplateMessageLibrary;
import com.moseeker.baseorm.db.configdb.tables.ConfigSysTemplateType;
import com.moseeker.baseorm.db.configdb.tables.ConfigSysTheme;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in configdb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>configdb.config_adminnotification_channel</code>.
     */
    public static final ConfigAdminnotificationChannel CONFIG_ADMINNOTIFICATION_CHANNEL = com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationChannel.CONFIG_ADMINNOTIFICATION_CHANNEL;

    /**
     * 管理员通知事件列表
     */
    public static final ConfigAdminnotificationEvents CONFIG_ADMINNOTIFICATION_EVENTS = com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationEvents.CONFIG_ADMINNOTIFICATION_EVENTS;

    /**
     * 管理员通知群组
     */
    public static final ConfigAdminnotificationGroup CONFIG_ADMINNOTIFICATION_GROUP = com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationGroup.CONFIG_ADMINNOTIFICATION_GROUP;

    /**
     * 管理员通知群组联系人
     */
    public static final ConfigAdminnotificationGroupmembers CONFIG_ADMINNOTIFICATION_GROUPMEMBERS = com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationGroupmembers.CONFIG_ADMINNOTIFICATION_GROUPMEMBERS;

    /**
     * 管理员通知联系人
     */
    public static final ConfigAdminnotificationMembers CONFIG_ADMINNOTIFICATION_MEMBERS = com.moseeker.baseorm.db.configdb.tables.ConfigAdminnotificationMembers.CONFIG_ADMINNOTIFICATION_MEMBERS;

    /**
     * The table <code>configdb.config_ats_source</code>.
     */
    public static final ConfigAtsSource CONFIG_ATS_SOURCE = com.moseeker.baseorm.db.configdb.tables.ConfigAtsSource.CONFIG_ATS_SOURCE;

    /**
     * redis缓存配置表
     */
    public static final ConfigCacheconfigRediskey CONFIG_CACHECONFIG_REDISKEY = com.moseeker.baseorm.db.configdb.tables.ConfigCacheconfigRediskey.CONFIG_CACHECONFIG_REDISKEY;

    /**
     * The table <code>configdb.config_cronjobs</code>.
     */
    public static final ConfigCronjobs CONFIG_CRONJOBS = com.moseeker.baseorm.db.configdb.tables.ConfigCronjobs.CONFIG_CRONJOBS;

    /**
     * 手动录入微信账户余额
     */
    public static final ConfigHbBalance CONFIG_HB_BALANCE = com.moseeker.baseorm.db.configdb.tables.ConfigHbBalance.CONFIG_HB_BALANCE;

    /**
     * The table <code>configdb.config_oms_switch_management</code>.
     */
    public static final ConfigOmsSwitchManagement CONFIG_OMS_SWITCH_MANAGEMENT = com.moseeker.baseorm.db.configdb.tables.ConfigOmsSwitchManagement.CONFIG_OMS_SWITCH_MANAGEMENT;

    /**
     * kenexa职位字段映射表
     */
    public static final ConfigPositionKenexa CONFIG_POSITION_KENEXA = com.moseeker.baseorm.db.configdb.tables.ConfigPositionKenexa.CONFIG_POSITION_KENEXA;

    /**
     * 大岂运维平台管理员表
     */
    public static final ConfigSysAdministrator CONFIG_SYS_ADMINISTRATOR = com.moseeker.baseorm.db.configdb.tables.ConfigSysAdministrator.CONFIG_SYS_ADMINISTRATOR;

    /**
     * 申请字段模板表
     */
    public static final ConfigSysAppTemplate CONFIG_SYS_APP_TEMPLATE = com.moseeker.baseorm.db.configdb.tables.ConfigSysAppTemplate.CONFIG_SYS_APP_TEMPLATE;

    /**
     * 简历模板库
     */
    public static final ConfigSysCvTpl CONFIG_SYS_CV_TPL = com.moseeker.baseorm.db.configdb.tables.ConfigSysCvTpl.CONFIG_SYS_CV_TPL;

    /**
     * 大岂H5模板表
     */
    public static final ConfigSysH5StyleTpl CONFIG_SYS_H5_STYLE_TPL = com.moseeker.baseorm.db.configdb.tables.ConfigSysH5StyleTpl.CONFIG_SYS_H5_STYLE_TPL;

    /**
     * 积分配置模板表
     */
    public static final ConfigSysPointsConfTpl CONFIG_SYS_POINTS_CONF_TPL = com.moseeker.baseorm.db.configdb.tables.ConfigSysPointsConfTpl.CONFIG_SYS_POINTS_CONF_TPL;

    /**
     * 模板消息字段配置
     */
    public static final ConfigSysTemplateMessageColumnConfig CONFIG_SYS_TEMPLATE_MESSAGE_COLUMN_CONFIG = com.moseeker.baseorm.db.configdb.tables.ConfigSysTemplateMessageColumnConfig.CONFIG_SYS_TEMPLATE_MESSAGE_COLUMN_CONFIG;

    /**
     * 模板消息库
     */
    public static final ConfigSysTemplateMessageLibrary CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY = com.moseeker.baseorm.db.configdb.tables.ConfigSysTemplateMessageLibrary.CONFIG_SYS_TEMPLATE_MESSAGE_LIBRARY;

    /**
     * 系统模板类型管理
     */
    public static final ConfigSysTemplateType CONFIG_SYS_TEMPLATE_TYPE = com.moseeker.baseorm.db.configdb.tables.ConfigSysTemplateType.CONFIG_SYS_TEMPLATE_TYPE;

    /**
     * 部门主题表
     */
    public static final ConfigSysTheme CONFIG_SYS_THEME = com.moseeker.baseorm.db.configdb.tables.ConfigSysTheme.CONFIG_SYS_THEME;
}
