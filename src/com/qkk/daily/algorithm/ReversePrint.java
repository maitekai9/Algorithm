package com.qkk.daily.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName ReversePrint.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月14日 23:16:58
 */
public class ReversePrint {
    public int[] reversePrint(NumComponents.ListNode head) {
        List<Integer> list = new ArrayList<>();
        store(head, list);
        Collections.reverse(list);
        int[] res = new int[list.size()];
        int index = 0;
        for (Integer integer: list) {
            res[index++] = index;
        }
        return res;
    }

    void store(NumComponents.ListNode head, List<Integer> list) {
        if (head == null) {
            return;
        }
        store(head.next, list);
        list.add(head.val);
    }
}
