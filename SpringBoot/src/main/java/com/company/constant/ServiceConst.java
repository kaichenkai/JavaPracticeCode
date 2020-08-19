package com.company.constant;

/**
 * @author ALEI
 * @date 2019/3/21
 * @describe ""
 */
public class ServiceConst {

    public enum STATUS {
        RUNNING(0), WARN(1), STOP(2);
        private int code;

        STATUS(int code) {
            this.code = code;
        }

        public int CODE() {
            return code;
        }
    }

    public enum SERVICENAME {
        AI("AiTraffic"), CRON("Crontask"), CORE("AlgorithmCore"), NGINX("Nginx"), DB("DataBase"), ACCESS("Access"), PUSH("Push");
        private String name;

        SERVICENAME(String name) {
            this.name = name;
        }

        public String NAME() {
            return name;
        }
    }

    public enum DEVICEWARNTYPE{
        //无数据预警
        NODATA(BaseConstant.CONST0,"无数据预警")
        //废片预警
        ,UNPASS(BaseConstant.CONST1,"废片预警")
        //异常预警
        ,EXDATA(BaseConstant.CONST2,"异常预警")
        //正片预警
        ,PASS(BaseConstant.CONST3,"正片预警")
        ,OTHER(BaseConstant.CONST_1,"其他");
        private Integer type;
        private String name;
        DEVICEWARNTYPE(Integer type,String name){
            this.type=type;
            this.name=name;
        }
        public static boolean isLegal(int type){
            for (DEVICEWARNTYPE devicewarntype: DEVICEWARNTYPE.values()) {
                if(devicewarntype.type==type){
                    return true;
                }
            }
            return false;
        }
        public Integer getType(){
            return this.type;
        }
        public String getName(){
            return this.name;
        }
        public static DEVICEWARNTYPE getType(int type){
            for (DEVICEWARNTYPE devicewarntype: DEVICEWARNTYPE.values()) {
                if(devicewarntype.type==type){
                    return devicewarntype;
                }
            }
            return DEVICEWARNTYPE.OTHER;
        }
    }
}
