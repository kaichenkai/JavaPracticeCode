package com.company.constant;

/**
 * 项目常量
 */
public final class ProjectConstant {
    /**
     *  生成代码所在的基础包名称，可根据自己公司的项目修改（注意：这个配置修改之后需要手工修改src目录项目默认的包路径，使其保持一致，不然会找不到类）
     */
//    public static final String BASE_PACKAGE = "com.seemmo.aitraffic";
    public static final String BASE_PACKAGE = "com.company";
    public static final String MODULE_SUFFIX = ".*";
    /**
     * 生成的Model所在包
     */
    public static final String MODEL_PACKAGE = BASE_PACKAGE + MODULE_SUFFIX + ".model";
    /**
     * 生成的Mapper所在包
     */
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + MODULE_SUFFIX + ".mapper";
    /**
     * 生成的Service所在包
     */
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + MODULE_SUFFIX + ".service";
    /**
     * 生成的ServiceImpl所在包
     */
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";
    /**
     * 生成的Controller所在包
     */
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + MODULE_SUFFIX + ".web";
    /**
     * 存储在session里用户信息的键
     */
    public static final String SESSION_KEY = "seemmo_user_info";

    /**
     */
    public static final String SEESION_ACTIVETIMER = "active_timer";
    /**
     * 通用Mapper插件基础接口的完全限定名
     */
    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".commons.CommonMapper";
    /**
     * 返回成功的编码
     */
    public static final int RECODE_SUCCESS = BaseConstant.CONST0;

    /**
     * 用于用户密码加密的密钥
     */
    public static final String USER_PASSWORD_KEY = "pomklnvzsyhgj";

    public static final String CONFIG_PASSWORD_KEY = "fjljasfkl";

    /**
     * 默认用户密码
     */
    public static final String DEFAULT_PASSWORD = "seemmo12#$";

}
