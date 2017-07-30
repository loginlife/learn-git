package com.huangx;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/30.
 */
public class StringBufferTest {

    public static void main(String[] args) {
        StringBufferTest test = new StringBufferTest();
        test.testAppend();
    }

    public void testAppend() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("当前日期：");
        buffer.append( new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        System.out.println( buffer.toString() );
    }
}
