package com.bill.gui.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 * @author: kaichenkai
 * @create: 5/29/2020 15:29
 */
public class MainFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 450);//尺寸大小, 单位像素
        f.setTitle("账本");//标题
        f.setLocationRelativeTo(null);//取消相对定位
        f.setResizable(true);//尺寸是否可变
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认关闭操作

        //工具栏
        JToolBar tb = new JToolBar();
        //功能选项(导航菜单)
        JButton bSpend = new JButton("消费一览");
        JButton bRecord = new JButton("记一笔");
        JButton bCategory = new JButton("消费分类");
        JButton bReport = new JButton("月消费报表");
        JButton bConfig = new JButton("设置");
        JButton bBackup = new JButton("备份");
        JButton bRecover = new JButton("恢复");
        //将功能添加到工具栏
        tb.add(bSpend);
        tb.add(bRecord);
        tb.add(bCategory);
        tb.add(bReport);
        tb.add(bConfig);
        tb.add(bBackup);
        tb.add(bRecover);

        //
        f.setLayout(new BorderLayout());//主面板设置边框
        f.add(tb, BorderLayout.NORTH);//将工具栏放置在北边(顶部)
        f.add(new JPanel(), BorderLayout.CENTER);//添加新的面板放在中间
        f.setVisible(true);//显示主面板, 跑起来

        //按钮点击事件绑定
        bSpend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        bRecord.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        bCategory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        bConfig.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        bBackup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        bRecover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
}
