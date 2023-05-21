package com.qkk.daily.algorithm;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName WidthOfBinaryTree.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年08月28日 19:09:11
 */
public class WidthOfBinaryTree {
    Map<Integer, Integer> map = new HashMap<>();

    public int depthOfBinaryTree(TreeNode root) {
        return dfs(root, 1, 1);
    }
    public int dfs(TreeNode node, int depth, int index) {
        if (node == null) {
            return 0;
        }
        map.putIfAbsent(depth, index);
        return Math.max(index - map.get(depth) + 1,
                Math.max(dfs(node.left, depth + 1, index * 2),
                        dfs(node.right, depth + 1, index * 2 + 1)));
    }
    public int widthOfBinaryTree(TreeNode treeNode) {
        List<Pair<TreeNode, Integer>> arr = new ArrayList<>();
        arr.add(new Pair<>(treeNode, 1));
        int res = 0;
        while (!arr.isEmpty()) {
            List<Pair<TreeNode, Integer>> tem = new ArrayList<>();
            for (Pair<TreeNode, Integer> pair: arr) {
                TreeNode node = pair.getKey();
                int index = pair.getValue();
                if (node.left != null) {
                    tem.add(new Pair<>(node.left, index * 2));
                }
                if (node.right != null) {
                    tem.add(new Pair<>(node.right, index * 2 + 1));
                }
            }
            res = Math.max(res, arr.get(arr.size() - 1).getValue() - arr.get(0).getValue() + 1);
            arr = tem;
        }
        return res;
    }
}
