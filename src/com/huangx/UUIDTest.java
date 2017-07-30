package com.huangx;

import com.huangx.utils.Print;

import java.util.UUID;

/**
 * Created by Administrator on 2017/7/30.
 */
public class UUIDTest {

    public static void main(String[] args) {
        Print.show( getUUID() );
    }

    /**
     * 获取UUID字符串
     * @return
     */
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

}
