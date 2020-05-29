package com.bill.gui.util;

import java.awt.Color;

/**
 * @author: kaichenkai
 * @create: 5/29/2020 16:21
 */
public class ColorUtil {
    public static Color blueColor = Color.decode("#3399FF");//淡蓝色
    public static Color grayColor = Color.decode("#999999");//灰色
    public static Color backgroundColor = Color.decode("#eeeeee");//背景色
    public static Color warningColor = Color.decode("#FF3333");//警告红色

    public static Color getByPercentage(int per) {
        if (per > 100)
            per = 100;
        int r = 51;
        int g = 255;
        int b = 51;
        float rate = per / 100f;
        r = (int) ((255 - 51) * rate + 51);
        g = 255 - r + 51;
        Color color = new Color(r, g, b);
        return color;
    }
}
