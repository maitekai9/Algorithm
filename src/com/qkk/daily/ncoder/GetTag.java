package com.qkk.daily.ncoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName GetTag.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月06日 20:35:24
 */
public class GetTag {
    public static void getTag() {
        String s = "32 01 00 AE";
        String target = "32";
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            String tag = s1[i++];
            int count = Integer.parseInt(s1[i++] + s1[i++], 16);
            if (tag.equals(target)) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    sb.append(s1[i++]).append(" ");
                }
                System.out.println(sb.toString().trim());
                break;
            }
        }
    }

    public static void main(String[] args) {
        getTag();
    }
}
