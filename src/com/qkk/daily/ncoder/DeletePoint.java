package com.qkk.daily.ncoder;

import java.util.ArrayList;

/**
 * @ClassName DeletePoint.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月16日 22:24:35
 */
public class DeletePoint {
    public static void main(String[] args) {
        String str = "5 2 3 2 4 3 5 2 1 4 3";
        String[] nums = str.split(" ");
        int del = Integer.parseInt(nums[nums.length - 1]);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(nums[1]));
        for (int i = 2; i < nums.length - 1;) {
            int cur = Integer.parseInt(nums[i]);
            int target = Integer.parseInt(nums[i + 1]);
            list.add(list.indexOf(target) + 1, cur);
            i += 2;
        }
        list.remove((Integer) del);
        for (Integer integer: list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
