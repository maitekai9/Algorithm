package com.qkk.daily.ncoder;

/**
 * @ClassName Balance.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月17日 23:07:08
 */
public class Balance {
    public boolean isBalance(MyNode root) {
        if (root == null) {
            return true;
        }
        return getLength(root) != -1;
    }

    public int getLength(MyNode root) {
        if (root == null) {
            return 0;
        }
        int left = getLength(root.left);
        if (left == -1) {
            return -1;
        }
        int right = getLength(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
class MyNode{
    MyNode left;
    MyNode right;
    Integer val;

    public MyNode() {}

    public MyNode(MyNode l, MyNode r, Integer v) {
        left = l;
        right = r;
        val = v;
    }
}
