package com.qkk.daily.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName BuildTree.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月15日 20:38:34
 */
public class BuildTree {

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

//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//
//    }

    public void pre(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        pre(root.left);
        pre(root.right);
    }

    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, n - 1, 0);
    }

    public TreeNode build(int[] preorder,
                          int pre_left,
                          int pre_right,
                          int in_left) {
        if (pre_left > pre_right) {
            return null;
        }
        int rootVal = preorder[pre_left];
        int rootIndex = map.get(rootVal);

        TreeNode node = new TreeNode(rootVal);
        int left_length = rootIndex - in_left;
        node.left = build(preorder, pre_left + 1, pre_left + left_length , in_left);
        node.right = build(preorder, pre_left + left_length + 1, pre_right, rootIndex + 1);
        return node;
    }


}

