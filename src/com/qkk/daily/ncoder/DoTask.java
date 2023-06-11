package com.qkk.daily.ncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName DoTask.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月08日 20:13:37
 */
public class DoTask {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int m = 2; // 输入数据组数

        List<List<List<Integer>>> tasks = new ArrayList<>(); // 存储每组数据

        for (int i = 0; i < m; i++) {
            int n = 3; // 输入机器数量
            List<List<Integer>> machine = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                List<Integer> setting = new ArrayList<>(2);
                setting.add(j + 1);
                setting.add(j + 1);
                machine.add(setting);
            }
            tasks.add(machine); // 将每组数据存入 tasks 中
        }

        for (List<List<Integer>> machine : tasks) { // 处理每组数据
            machine.sort((a, b) -> b.get(1) - a.get(1)); // 按完成时间从大到小排序

            int n = machine.size();
            int[] dp = new int[n];
            dp[0] = machine.get(0).get(0) + machine.get(0).get(1); // 初始化 dp 数组

            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(dp[i - 1], dp[i - 1] - machine.get(i - 1).get(1) + machine.get(i).get(0) + machine.get(i).get(1)); // 动态规划转移方程
            }

            System.out.println(dp[n - 1]); // 输出最短完成时间
        }
    }

}
