package com.bill.entity;

import java.util.Date;

/**
 * @author: kaichenkai
 * @create: 5/29/2020 16:35
 */
public class Record {
    private int id;
    private int spend;
    private Date date;
    private String comment;
    private int cid;

    public Record() {
    }

    public Record(int id, int spend, Date date, String comment, int cid) {
        this.id = id;
        this.spend = spend;
        this.date = date;
        this.comment = comment;
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", spend=" + spend +
                ", date=" + date +
                ", comment='" + comment + '\'' +
                ", cid=" + cid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpend() {
        return spend;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
}
