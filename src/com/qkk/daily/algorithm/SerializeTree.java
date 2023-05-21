package com.qkk.daily.algorithm;

import java.util.*;

/**
 * @ClassName SerializeTree.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月05日 22:22:55
 */
public class SerializeTree {
    Map<String, TreeNode> serialTreeMap = new HashMap<>();
    Set<TreeNode> repeatSet = new HashSet<>();
    public List<TreeNode> getRepeatTree(TreeNode root) {
        getSerialTree(root);
        return new ArrayList<>(repeatSet);
    }

    public String getSerialTree(TreeNode node) {
        if (node == null) {
            return "";
        }
        String serial = "(" +
                getSerialTree(node.left) +
                ")(" +
                getSerialTree(node.right) +
                ")";
        if (serialTreeMap.containsKey(serial)) {
            repeatSet.add(serialTreeMap.get(serial));
        } else {
            serialTreeMap.put(serial, node);
        }
        return serial;
    }
}
