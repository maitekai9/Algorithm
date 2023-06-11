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
        StringBuilder sb = new StringBuilder();
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
        main();
    }

    public static void main() {
        String ip = "128#0#255#255"; // 输入虚拟IPv4地址字符串
        int p1, p2, p3, p4;
        String[] parts = ip.split("#");
        p1 = Integer.parseInt(parts[0]);
        p2 = Integer.parseInt(parts[1]);
        p3 = Integer.parseInt(parts[2]);
        p4 = Integer.parseInt(parts[3]); // 解析字符串为四个整数
        if (p1 >= 1 && p1 <= 128 && p2 >= 0 && p2 <= 255 && p3 >= 0 && p3 <= 255 && p4 >= 0 && p4 <= 255) {
            // 判断是否为合法的虚拟IPv4地址
            String res = "";
            int[] arr = {p1, p2, p3, p4};
            for (int i = 0; i < 4; i++) {
                String hex = Integer.toHexString(arr[i]).toUpperCase();
                if (hex.length() == 1) {
                    hex = "0" + hex;
                }
                res += hex;
            }
            System.out.println(Integer.parseInt(res, 16)); // 将16进制字符串转换为整数并输出
        } else {
            System.out.println("invalid IP");
        }
    }
}


