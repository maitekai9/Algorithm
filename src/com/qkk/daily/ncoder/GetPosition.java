package com.qkk.daily.ncoder;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName GetPosition.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月06日 21:06:58
 */
public class GetPosition {
    public static void getPosition() {
        String s = "a123(3,10)43fa(3,4)vwa(4,10)2qdf";
        Pattern pattern = Pattern.compile("([\\d]*),([\\d]*)");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
            System.out.println(matcher.end());
        }
    }

    public static void main(String[] args) {
        getPosition();
    }
}
