package com.qkk.daily.algorithm;

/**
 * @ClassName MaxConsecutiveAnswers.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年03月29日 20:35:04
 */
public class MaxConsecutiveAnswers {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxConsecutiveChar(answerKey, k, 'T'),
                maxConsecutiveChar(answerKey, k, 'F'));
    }
    public int maxConsecutiveChar(String answerKey, int k, char ch) {
        int n = answerKey.length();
        int ans = 0;
        for (int left = 0, right = 0, sum = 0; right < n; right++) {
            sum += answerKey.charAt(right) != ch ? 1 : 0;
            while (sum > k) {
                sum -= answerKey.charAt(left++) != ch ? 1 : 0;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
