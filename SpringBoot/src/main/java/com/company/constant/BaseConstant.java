package com.company.constant;

/**
 * @author ALEI
 * @date 2018/12/26
 * @describe ""
 */
public interface BaseConstant {
    //==============整数常量=====================//

    /**
     * 1024
     */
    int CONST1024 = 1024;
    /**
     * 60*60*1000
     */
    long CONST3600000 = 3600000;
    /**
     * 常量1800000
     */
    int CONST1800000 = 1800000;
    /**
     * 常量1000000
     */
    int CONST1000000 = 1000000;

    /**
     * 常量300000
     */
    int CONST300000 = 300000;
    /**
     * 常量300000
     */
    int CONST90000 = 90000;
    /**
     * 常量15000
     */
    int CONST15000 = 15000;
    /**
     * 常量3600
     */
    int CONST3600 = 3600;

    /**
     * 常量3000
     */
    int CONST3000 = 3000;
    /**
     * 常量BaseConstant.CONST2000
     */
    int CONST2000 = 2000;
    /**
     * 常量1000
     */
    int CONST1000 = 1000;

    /**
     * 常量500
     */
    int CONST500 = 500;

    /**
     * 常量255
     */
    int CONST255 = 255;

    /**
     * 常量200
     */
    int CONST200 = 200;
    /**
     * 常量100
     */
    int CONST100 = 100;

    /**
     * 常量99
     */
    int CONST99 = 99;
    /**
     * 常量100
     */
    int CONST90 = 90;
    /**
     * 常量60
     */
    int CONST60 = 60;
    /**
     * 常量50
     */
    int CONST50 = 50;
    /**
     * 常量30
     */
    int CONST30 = 30;
    /**
     * 常量24
     */
    int CONST24 = 24;
    /**
     * 常量20
     */
    int CONST20 = 20;

    /**
     * 常量21
     */
    int CONST21 = 21;
    /**
     * 常量零
     */
    int CONST0 = 0;

    /**
     * 常量1
     */
    int CONST1 = 1;
    /**
     * 常量-1
     */
    int CONST_1 = -1;
    /**
     * 常量2
     */
    int CONST2 = 2;
    /**
     * 常量-2
     */
    int CONST_2 = -2;
    /**
     * 常量3
     */
    int CONST3 = 3;
    /**
     * 常量-3
     */
    int CONST_3 = -3;

    /**
     * 常量4
     */
    int CONST4 = 4;
    /**
     * 常量5
     */
    int CONST5 = 5;
    /**
     * 常量6
     */
    int CONST6 = 6;
    /**
     * 常量7
     */
    int CONST7 = 7;
    /**
     * 常量8
     */
    int CONST8 = 8;

    /**
     * 常量9
     */
    int CONST9 = 9;
    /**
     * 常量10
     */
    int CONST10 = 10;
    /**
     * 常量11
     */
    int CONST12 = 12;
    /**
     * 常量15
     */
    int CONST15 = 15;

    /**
     * 常量16
     */
    int CONST16 = 16;
    /**
     * 常量18
     */
    int CONST18 = 18;
    /**
     * 常量64
     */
    int CONST64 = 64;
    //===================小数常量=====================//
    /**
     * 常量0.0
     */
    double CONST0D = 0.0D;
    /**
     * 1.0F
     */
    float CONST1F = 1.0F;
    /**
     * 1.0F
     */
    double CONST1D = 1.0D;
    /**
     * 0.2F
     */
    float CONST0SPORT2D = 0.2F;
    /**
     * 0.75F
     */
    float CONST0SPOT75F = 0.75F;

    //==================特殊字符常量==================//
    /**
     * 左斜杠
     */
    String LEFTSLASHDUB = "\\";
    /**
     * 左斜杠
     */
    String RIGHTSLASHDUB = "//";
    /**
     * 常量百分号
     */
    String PERCENTSIGN = "%";
    /**
     * 空字符串常量
     */
    String EMPTYSTR = "";
    /**
     * 点常量
     */
    String SPOT = ".";
    /**
     * 中横杠常量
     */
    String MIDDLEBAR = "-";
    /**
     * 中横杠常量
     */
    String LOWERBAR = "_";

    /**
     * 星常量
     */
    String STAR = "*";
    /**
     * 逗号常量
     */
    String COMMA = ",";
    /**
     * 右斜杠
     */
    String RIGHTSLASH = "/";
    /**
     * 冒号
     */
    String COLON = ":";

    String OR = "|";
    String WH = "?";
    String DH = "=";
    String AND = "&";
    //==================boolean==================//
    boolean TRUE = true;
    boolean FALSE = false;
    //==================常用字符==================//

    String LOWERX = "x";
    String LOWERDEV = "dev";
    String LOWERTEST = "test";
    String LOWERPROD = "prod";

    String TOSTR = "toString";

    String STRINGCLASSNAME = "class java.lang.String";

    String EXCEPTION = "exception";

    String SERVLETERROREXCEPTION = "javax.servlet.error.exception";

    String MSG_SUCCESS = "success";

    String OUT_OF_MEMORY = "OutOfMemoryError";

    String DATASOURCE = "dataSource";

    String HTTP = "http";
    String HTTPS = "https";
    /**
     * 当前项目id
     */
    Integer CURRENT_PROJECT_ID = 0;

    String DOUBLEMIDDLEBRACKETS = "[]";
    String XFORWARDEDFOR = "x-forwarded-for";
    String PROXYCLIENTIP = "Proxy-Client-IP";
    String WLPROXYCLIENTIP = "WL-Proxy-Client-IP";
    String HTTPCLIENTIP = "HTTP_CLIENT_IP";
    String HTTPXFORWARDFOR = "HTTP_X_FORWARDED_FOR";
    String UNKNOWN = "unknown";
    String TASKNAME = "taskName";

    /**
     * 文件结尾字符
     */
    String LOWERXLS = "xls";
    String LOWERXLSX = "xlsx";
    String LOWERSPOTXLS = ".xls";
    String LOWERSPOTXLSX = ".xlsx";
    String LOWERSPOTZIP = ".zip";
    String LOWERSPOTJPG = "jpg";
    String LOWERSPOTPNG = "png";
    String LOWERSPOTTXT = ".txt";
    String LOWERSPOTJSON = ".json";
    /**
     * 常用中文词汇
     */
    String QITA = "其他";
    String VERIFCODE = "验证码错误";

    /**
     * 数学运算符
     */
    String OP_ADD = "+";
    String OP_MUL = "*";
    String OP_MUL_X = "x";
    String OP_MOD = "%";
    String OP_DIV = "/";

    /**
     * 内置的特殊处理的切图模式标识
     */
    String PATTERN_2_MULX_2 = "2x2";
    String PATTERN_2_MUL_2 = "2*2";
    String PATTERN_2_MULX_3 = "2x3";
    String PATTERN_2_MUL_3 = "2*3";
    String PATTERN_1_ADD_2 = "1+2";
    String PATTERN_1_MUL_1 = "1x1";

    /**
     * 2*3 与 2*2 之间水印的行数关系
     */
    float[] UPROWS = {1f, 0.5f, 2f / 3};
}
