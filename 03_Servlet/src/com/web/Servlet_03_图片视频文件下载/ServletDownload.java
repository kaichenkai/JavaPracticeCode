package com.web.Servlet_03_图片视频文件下载;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/download")
public class ServletDownload extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求参数: 文件名称
        String filename = request.getParameter("filename");
        // 获取上下文对象
        ServletContext context = request.getServletContext();
        // 获取文件的真实路径
        String filepath = context.getRealPath("/WEB-INF/image/" + filename);
        // 获取字节对象
        ServletOutputStream sos = response.getOutputStream();
        FileInputStream fis = new FileInputStream(new File(filepath));

        // 设置响应头类型
        String mimeType = context.getMimeType(filename);
        response.setHeader("content-type", mimeType);
        // 设置响应头 打开方式
        response.setHeader("content-disposition", "attachment; filename=" + filename);
        // 循环写入
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!=-1){
            sos.write(bytes, 0, len);
        }

        // 释放本地资源
        fis.close();
    }
}
