package com.huangx.utils;

/**
 * 打印信息到控制台，提供System.out.println的便捷方法
 * Created by Administrator on 2017/7/30.
 */
public class Print {

    /**
     * 简单将信息输出到控制台
     * @param message
     */
    public static void show(String message) {
        System.out.println( message );
    }

    /**
     * 批量输出多个信息到控制台
     * @param messages
     */
    public static void show(String... messages) {
        for (String message : messages) {
            System.out.println(message);
        }
    }

}

