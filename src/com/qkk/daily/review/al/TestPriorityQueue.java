package com.qkk.daily.review.al;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @ClassName TestPriorityQueue.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月21日 21:49:06
 */
/*
            题目描述
            实现一个支持优先级的队列，高优先级先出队列；同优先级时先进先出。

            如果两个输入数据和优先级都相同，则后一个数据不入队列被丢弃。

            队列存储的数据内容是一个整数。

            输入描述
            一组待存入队列的数据 (包含内容和优先级)

            输出描述
            队列的数据内容(优先级信息输出时不再体现)
*/
public class TestPriorityQueue {

    public static void print(int[][] array) {
        Set<String> set = new HashSet<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>(((o1, o2) -> o2[1] - o1[1]));
        for (int[] arr: array) {
            String key = arr[0] + "-" + arr[1];
            if (set.contains(key)) {
                continue;
            }
            set.add(key);
            queue.add(arr);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()[0]);
        }
    }

    public static void main(String[] args) {
        print(new int[][]{{10, 1}, {20, 1}, {30, 2}, {40, 3}});
        print(new int[][]{{10, 1}, {10, 1}, {30, 2}, {40, 3}});
    }
}

