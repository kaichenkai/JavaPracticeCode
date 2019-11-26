package com.web.Servlet_05_验证码登录案例.web;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * 生成图片验证码, 并把验证码存储到 session
 */
@WebServlet("/image/code2")
public class GenerateVerificationCode extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 创建一个对象, 在内存中生成图片
        // 定义图片验证码的宽和高
        int width = 100;
        int height = 50;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);

        // 美化图片
        Graphics g = image.getGraphics();  // 画笔对象
        g.setColor(Color.PINK);  // 设置画笔颜色
        g.fillRect(0, 0, width, height);  // 填充背景色
        g.setColor(Color.BLUE);
        g.drawRect(0, 0, width-1, height-1);  // 画边框

        // 画上随机字母数字
        // 定义数组, 将随机数字存储到数组中
        StringBuilder imageCode = new StringBuilder();
        String randomStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random ran = new Random();
        for (int i = 1; i <= 4 ; i++) {
            int index = ran.nextInt(randomStr.length());
            String s = String.valueOf(randomStr.charAt(index));
            g.drawString(s, width / 5 * i, height / 2);
            imageCode.append(s);
        }
        // 存入到 session
        System.out.println(imageCode);
        HttpSession session = request.getSession();
        session.setAttribute("imageCode", imageCode.toString());

        // 画干扰线
        g.setColor(Color.GREEN);
        for (int i = 1; i <= 10 ; i++) {
            int x1 = ran.nextInt(width);
            int y1 = ran.nextInt(height);
            int x2 = ran.nextInt(width);
            int y2 = ran.nextInt(height);
            g.drawLine(x1, y1, x2, y2);
        }

        // 将图片验证码输出到浏览器
        ImageIO.write(image, "jpg", response.getOutputStream());
    }
}
