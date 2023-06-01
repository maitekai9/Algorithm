package com.qkk.daily.ncoder;

import com.qkk.daily.entity.TreeNode;

import java.util.*;

/**
 * @ClassName ForTree.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年06月01日 22:04:55
 */
public class ForTree {
    public void getPre(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.getVal());
        getPre(root.getLeft(), res);
        getPre(root.getRight(),res);
    }
    public List<Integer> getPre(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        while (!deque.isEmpty()) {
            TreeNode cur = deque.poll();
            if (cur == null) {
                continue;
            }
            res.add(cur.getVal());
            deque.push(cur.getRight());
            deque.push(cur.getLeft());
        }
        return res;
    }

    public List<Integer> getLast(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        while (!deque.isEmpty()) {
            TreeNode cur = deque.poll();
            if (cur == null) {
                continue;
            }
            res.add(cur.getVal());
            deque.push(cur.getLeft());
            deque.push(cur.getRight());
        }
        int left = 0, right = res.size() - 1;
        while (left < right) {
            int tem = res.get(left);
            res.set(left, res.get(right));
            res.set(right, tem);
            left++;
            right--;
        }
        return res;
    }

    public List<Integer> getMiddle(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !deque.isEmpty()) {
            if (cur != null) {
                deque.push(cur);
                cur = cur.getLeft();
            } else {
                cur = deque.pop();
                res.add(cur.getVal());
                cur = cur.getRight();
            }
        }
        return res;
    }
}
