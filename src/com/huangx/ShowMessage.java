package com.huangx;

import com.huangx.utils.Print;

import java.lang.StringBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowMessage {

    public static void main(String[] args) {
        ShowMessage temp = new ShowMessage();
        Print.show( "当前日期：" + temp.getCurrentDate() );
    }

    /**
     * 获取当前系统时间
     */
    public String getCurrentDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return format.format(new Date());
    }

}
