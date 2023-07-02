package com.qkk.daily.review;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName BinSearch.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月02日 10:49:50
 */
public class BinSearch {
    public static void main(String[] args) {
        int[] target = {10, 9, 8, 7, 6, 4, 3, 2, 1};
        getMin(target, 4, 5);
    }

    public static void getMin() {
        String s = "9 4 5";
        String[] s1 = s.split(" ");
        int n = Integer.parseInt(s1[0]);
        int k = Integer.parseInt(s1[1]);
        int d = Integer.parseInt(s1[2]);
        String s2 = "10 9 8 7 6 4 3 2 1";
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[i] = Integer.parseInt(s2.split(" ")[i]);
        }
        Arrays.sort(target);
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target[mid] > d) {
                right = mid - 1;
            } else if (target[mid] < d) {
                left = mid + 1;
            } else {
                break;
            }
        }
        System.out.println(left);
        System.out.println(target[left]);
    }

    public static int[] getMin(int[] target, int n, int d) {
        List<Integer> collect = Arrays.stream(target).boxed().collect(Collectors.toList());
        collect.sort(Comparator.comparingInt(o -> Math.abs(o - d)));
        System.out.println(Arrays.toString(collect.toArray(new Integer[0])));
        return target;
    }
}
