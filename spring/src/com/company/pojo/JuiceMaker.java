package com.company.pojo;

public class JuiceMaker {
    private Source source;

    public void makeJuice(){
        String info = "XXX 用户点了一杯果汁, "  +  this.source.getFruit() + this.source.getSugar() + this.source.getSize();
        System.out.println(info);
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
