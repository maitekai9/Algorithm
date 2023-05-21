package com.qkk.daily.algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LevelOrder.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年04月08日 22:34:47
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                list.add(cur.val);
                for (Node child: cur.children) {
                    queue.offer(child);
                }
            }
            res.add(list);
        }
        return res;
    }

    class Node {
        public int val;
        public List<Node> children;
        public Node() {}
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, List<Node> children) {
            this.children = children;
        }
    }
}


