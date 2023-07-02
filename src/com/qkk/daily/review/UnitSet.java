package com.qkk.daily.review;

/**
 * @ClassName UnitSet.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月02日 17:35:15
 */
public class UnitSet {
    private int[] parent;
    public UnitSet(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    int findParent(int i) {
        if (i != parent[i]) {
            parent[i] = findParent(parent[i]);
        }
        return parent[i];
    }
    void set(int i, int j) {
        int ip = findParent(i);
        int jp = findParent(j);
        if (ip != jp) {
            parent[j] = ip;
        }
    }
}
