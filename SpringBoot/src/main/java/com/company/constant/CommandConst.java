package com.company.constant;

public interface CommandConst {

    /**
     * 启动项目时，可用的执行命令
     */
    String COMMAND_SHORT = "cmd";

    String DAYS_SHORT = "d";

    /**
     * 统计违法数据，统计当前有变更的违法天
     */
    String CMD_STATISTICSILLEGAL = "statistics";

    /**
     * 统计违法数据,按违法天统计
     */
    String CMD_STATISTICSDAY = "statisticsDay";

    /**
     * 统计违法日期，cmd为statisticsDay时使用，多天用逗号隔开
     */
    String CMD_ILLEGALDAY = "illegalDay";

    /**
     * 清除数据命令
     */
    String CMD_CLEAN = "cleanData";
    String CLEAN_TYPE = "type";
    String CLEAN_RECORD_DAY = "recordDay";
    String CLEAN_BATCH = "batch";

    /**
     * 用于指定加密密码的密文
     */
    String PASSWORD = "password";

    /**
     * 导出场景图片
     */
    String EXPORTSCENEIMAGE = "sceneImage";
    String EXPORTPNAME = "pname";
    String EXPORTIMAGENUM = "imagenum";
    String EXPORTEXPORTDIR = "exportdir";
}
