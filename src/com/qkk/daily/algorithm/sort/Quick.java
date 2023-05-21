package com.qkk.daily.algorithm.sort;

/**
 * @ClassName Quick.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月26日 18:19:58
 */
public class Quick {
    public void sort(int[] nums, int l, int r) {
        if (l < r) {
            int pivot = getPivot(nums, l, r);
            sort(nums, l, pivot - 1);
            sort(nums, pivot + 1, r);
        }
    }
    public int getPivot(int[] nums, int low, int high) {
        int tem = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= tem) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] <= tem) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = tem;
        return low;
    }
}
