package com.qkk.daily.algorithm;

/**
 * @ClassName ReformatNumber.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年10月01日 22:48:06
 */
public class ReformatNumber {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char cur = number.charAt(i);
            if (Character.isDigit(cur)) {
                sb.append(cur);
            }
        }
        int n = sb.length();
        int pt = 0;
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            if (n > 4) {
                res.append(sb.substring(pt, pt + 3)).append("-");
                pt += 3;
                n -= 3;
            } else {
                if (n == 4) {
                    res.append(sb.substring(pt, pt + 2)).append("-").append(sb.substring(pt + 2, pt + 4));
                } else {
                    res.append(sb.substring(pt));
                }
                break;
            }
        }
        return res.toString();
    }
}
