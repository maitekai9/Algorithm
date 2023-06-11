package com.qkk.daily.hw;

import java.util.Arrays;

/**
 * @ClassName TVL.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月09日 22:07:32
 */
public class TVL {
    public static void main(String[] args) {
        String s = "0F04ABABABAB1002FF";
        System.out.println(Integer.parseInt("0F", 16));
        System.out.println(Integer.toHexString(15));
        int n = s.length();
        int m = n / 2;
        String[] arr = new String[m];
        for (int i = 0; i < m; i++) {
            arr[i] = s.substring(2 * i, 2 * i + 2);
        }
        int i = 0;
        while (i < m) {
            int tag = Integer.parseInt(arr[i++], 16);
            int length = Integer.parseInt(arr[i++], 16);
            StringBuilder sb = new StringBuilder();
            boolean flag = false;
            for (int j = 0; j < length; j++) {
                sb.append(arr[i++]);
                if (i >= m) {
                    flag = true;
                    break;
                }
                if (j < length - 1) {
                    sb.append(",");
                }
            }
            if (flag) {
                System.out.println("缺失");
                break;
            }
            System.out.println(tag);
            System.out.println(sb);
        }
    }
}
