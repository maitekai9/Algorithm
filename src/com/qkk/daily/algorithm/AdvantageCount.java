package com.qkk.daily.algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName AdvantageCount.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年10月08日 21:00:58
 */
// this is a test
public class AdvantageCount {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Integer[] s1 = new Integer[n];
        Integer[] s2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            s1[i] = i;
            s2[i] = i;
        }
        Arrays.sort(s1, Comparator.comparingInt(i -> nums1[i]));
        Arrays.sort(s2, Comparator.comparingInt(i -> nums2[i]));
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (nums1[s1[i]] > nums2[s2[left]]) {
                ans[s2[left]] = nums1[s1[i]];
                left++;
            } else {
                ans[s2[right]] = nums1[s1[i]];
                right--;
            }
        }
        return ans;
    }
}
