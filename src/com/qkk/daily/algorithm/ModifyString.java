package com.qkk.daily.algorithm;

/**
 * @ClassName ModifyString.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年01月05日 21:14:01
 */
public class ModifyString {
    public String modifyString(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            char c = chars[i];
            if (c == '?') {
                for (char j = 'a'; j <= 'c'; j++) {
                    if ((i > 0 && chars[i - 1] == j) || (i < len - 1 && chars[i + 1] == j)) {
                        continue;
                    }
                    chars[i] = j;
                    break;
                }
            }
        }
        return new String(chars);
    }
}
