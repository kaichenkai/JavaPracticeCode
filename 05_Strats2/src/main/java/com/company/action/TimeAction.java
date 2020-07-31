package com.company.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: kaichenkai
 * @create: 7/30/2020 19:27
 */
public class TimeAction {
    private String datetime;

    public String showTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.datetime = dateFormat.format(new Date());
        return "time";
    }

    /*
    getter and setter
     */
    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
