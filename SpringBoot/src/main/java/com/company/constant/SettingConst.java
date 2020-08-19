package com.company.constant;

public interface SettingConst {
    /**
     * 设备编码生成规则的标识符
     */
    String ID_DEVICE_CODE_RULE = "DEVICE_CODE_RULE";
    /**
     * 数据发布类型，0外挂系统，1执法平台
     */
    String ID_PUSH_TYPE = "PUSH_TYPE";
    /**
     * 发布方式
     */
    String ID_PUSH_METHOD = "PUSH_METHOD";
    /**
     * 是否发布原始信息
     */
    String ID_PUSH_SRC_RECORD = "ID_PUSH_SRC_RECORD";

    /**
     * 有效时间
     */
    String ID_VALID_DAY = "VALID_DAY";

    /**
     * 上报开始时间
     */
    String ID_UPLOAD_STARTTIME = "UPLOAD_STARTTIME";
    /**
     * 发布url
     */
    String ID_PUSH_URL = "PUSH_URL";

    /**
     * 上报截止相对时间
     */
    String ID_OFFSET_ENDDAY = "UPLOAD_OFFSET_ENDDAY";
}
