package com.qkk.daily.ncoder;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @ClassName StringReverse.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月03日 09:34:17
 */
public class StringReverse {
    public void getReverse(String s) {
        new StringBuilder(s).reverse();
    }

    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost().getHostAddress());
    }
}
