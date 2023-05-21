package com.qkk.daily.algorithm;

/**
 * @ClassName NumArray.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年04月04日 16:27:30
 */
public class NumArray {
//    private final int[] array;
//    public NumArray(int[] nums) {
//        array = nums;
//    }
//
//    public void update(int index, int val) {
//        array[index] = val;
//    }
//
//    public int sumRange(int left, int right) {
//        int num = 0;
//        for (int i = left; i <= right ; i++) {
//            num += array[i];
//        }
//        return num;
//    }
    int[] sum;
    int size;
    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        int n = nums.length;
        size = (int) Math.sqrt(n);
        sum = new int[(n + size - 1) / size];
        for (int i = 0; i < n; i++) {
            sum[i / size] += nums[i];
        }
    }

    public void update(int index, int val) {
        sum[index / size] += val - nums[index];
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int a1 = left / size, b1 = left % size, a2 = right / size, b2 = right % size;
        if (a1 == a2) {
            int sum = 0;
            for (int i = b1; i <= b2; i++) {
                sum += nums[a1 * size + i];
            }
            return sum;
        }

        int sum1 = 0;
        for (int i = b1; i < size; i++) {
            sum1 += nums[a1 * size + i];
        }
        int sum2 = 0;
        for (int i = a1 + 1; i < a2; i++) {
            sum2 += sum[i];
        }
        int sum3 = 0;
        for (int i = 0; i <= b2; i++) {
            sum3 += nums[a2 * size + i];
        }
        return sum1 + sum2 + sum3;
    }
}
