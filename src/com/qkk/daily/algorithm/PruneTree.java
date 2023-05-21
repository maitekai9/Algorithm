package com.qkk.daily.algorithm;

/**
 * @ClassName PruneTree.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年07月21日 22:17:55
 */
public class PruneTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public TreeNode pruneTree(TreeNode node) {
        if (node == null) {
            return null;
        }
        node.left = pruneTree(node.left);
        node.right = pruneTree(node.right);
        if (node.left == null && node.right == null && node.val == 0) {
            return null;
        }
        return node;
    }
}


