package com.qkk.daily.algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName LetterCasePermutation.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年10月30日 08:34:18
 */
public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        Queue<StringBuffer> queue = new ArrayDeque<>();
        queue.offer(new StringBuffer());
        while (!queue.isEmpty()) {
            StringBuffer cur = queue.peek();
            if (cur.length() == s.length()) {
                ans.add(cur.toString());
                queue.poll();
            } else {
                int len = cur.length();
                if (Character.isLetter(s.charAt(len))) {
                    StringBuffer ano = new StringBuffer(cur);
                    ano.append((char) (s.charAt(len) ^ 32));
                    queue.offer(ano);
                }
                cur.append(s.charAt(len));
            }
        }
        return ans;
    }
}
