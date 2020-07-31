package com.company.action;

import com.company.model.Product;
import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author: kaichenkai
 * @create: 7/30/2020 19:14
 */
public class ProductAction {
    private Product product;

    public String show(){
        //获取request 和 response 对象
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();

        System.out.println("request:\t" + request);//request:	org.apache.struts2.dispatcher.StrutsRequestWrapper@3ac5f270
        System.out.println("response:\t" + response);//response:	org.apache.catalina.connector.ResponseFacade@29fd7467

        this.product = new Product(1,"iphone11");
        return "product";
    }

    public String add(){
        //        在addProduct.jsp中提交数据的field是product.name
        //        会自动调用对应的Action的setProduct(Product product)方法进行数据的注入
        //        所以ProductAction必须提供setProduct(Product product)方法
        //        在执行到第14行的时候，jsp传过来的name已经被注入进了属性product中了
        System.out.println(this.product.getName());

        //Struts 中的 Session 存储值
        Map<String, Object> sessionMap = ActionContext.getContext().getSession();
        sessionMap.put("productName", product.getName());
        //返回 product.jsp
        return "product";
    }

    /*
    getter and setter
     */
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
