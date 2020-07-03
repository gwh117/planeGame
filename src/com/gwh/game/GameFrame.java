package com.gwh.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author gwh
 * @description 创建游戏窗口
 * @time 2020/7/3 17:31
 */
public class GameFrame extends JFrame {
    @Override
    public void print(Graphics g) {

    }

    /**
     * 初始化窗口
     */
    public void launchFrame(){
        this.setTitle("飞机小游戏");//窗口名称标题
        this.setVisible(true);//设置窗口显示 true显示 ， false 不显示
        this.setSize(300,300);//设置窗口的大小
        this.setLocation(500,250);//设置窗口的位置
        /**
         * 设置关闭窗口时程序结束运行
         */
        this.addWindowListener(new WindowAdapter() {//添加监听
            @Override
            public void windowClosing(WindowEvent e) {//当执行窗口关闭时把程序关闭
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.launchFrame();
    }
}
