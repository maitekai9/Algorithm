package com.qkk.daily.algorithm;

/**
 * @ClassName FindBottomLeftValue.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年06月22日 20:10:10
 */
public class FindBottomLeftValue {
    int curVal = 0;
    int curHeight = 0;
    static class Node {
        int val;
        Node left;
        Node right;
        public Node() {}
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int findBottomLeftValue(Node root) {
        dfs(root, 0);
        return curVal;
    }

    public void dfs(Node node, int height) {
        if (node == null) {
            return;
        }
        height++;
        dfs(node.left, height);
        dfs(node.right, height);
        if (height > curHeight) {
            curHeight = height;
            curVal = node.val;
        }
    }
}
