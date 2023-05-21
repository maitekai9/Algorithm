package com.qkk.daily.algorithm;

/**
 * @ClassName IsGoodArray.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月15日 20:28:28
 */
public class IsGoodArray {

    public boolean isGoodArray(int[] nums) {
        int num1 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num1 = gcd(num1, nums[i]);
            if (num1 == 1) {
                return true;
            }
        }
        return false;
    }

    public int gcd(int num1, int num2) {
        while (num2 > 0) {
            int tem = num1;
            num1 =num2;
            num2 = tem % num1;
        }
        return num1;
    }
}
