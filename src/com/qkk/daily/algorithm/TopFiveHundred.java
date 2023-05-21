package com.qkk.daily.algorithm;

import java.util.PriorityQueue;

/**
 * @ClassName TopFiveHundred.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月19日 22:09:02
 */
public class TopFiveHundred {
    static class DataSource implements Comparable<DataSource>{
        private int no;
        private int value;
        private int index;
        public DataSource(int no, int value, int index) {
            this.no = no;
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(DataSource o) {
            return o.value - this.value;
        }
    }

    public int[] topFiveHundred(int[][] arrays) {
        int m = arrays.length;
        int n = arrays[0].length;
        int[] res = new int[n];
        PriorityQueue<DataSource> queue = new PriorityQueue<>(m);
        for (int i = 0;i < m; i++) {
            queue.add(new DataSource(i, arrays[i][0], 0));
        }

        int count = 0;
        while (count < n) {
            DataSource poll = queue.poll();
            res[count] = poll.value;
            poll.index++;
            queue.add(new DataSource(poll.no, arrays[poll.no][poll.index], poll.index));
            count++;
        }
        return res;
    }
}
