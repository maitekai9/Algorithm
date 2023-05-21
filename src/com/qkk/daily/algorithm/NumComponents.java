package com.qkk.daily.algorithm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName NumComponents.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年10月12日 08:13:08
 */
public class NumComponents {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.next = next;
        }
    }

    public int numComponents(ListNode root, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        int res = 0;
        boolean flag = false;
        while (root != null) {
            if (set.contains(root.val)) {
                if (!flag) {
                    res++;
                    flag = true;
                }
            } else {
                flag = false;
            }
            root = root.next;
        }
        return res;
    }
}
