package com.qkk.daily.hw;

import java.util.Locale;

/**
 * @ClassName Ip.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月05日 20:39:40
 */
public class Ip {
    public static void getIp() {
        //String s = "100#101#1#5";
        String s = "128#0#255#255";
        //String s = "1#0#0#0";
        String[] split = s.split("#");
        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        StringBuilder sb = new StringBuilder("0x");
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] < 1 || nums[i] > 128) {
                    System.out.println("invalid");
                    return;
                }
            } else if (nums[i] < 0 || nums[i] > 255) {
                System.out.println("invalid");
                return;
            }
            String hex = Integer.toHexString(nums[i]).toUpperCase();
            System.out.println(hex);
            if (hex.length() == 1) {
                sb.append("0");
            }
            sb.append(hex);
        }
        System.out.println(Integer.parseInt(sb.toString(), 16));
    }

    public static void main(String[] args) {
        getIp();
    }
}
