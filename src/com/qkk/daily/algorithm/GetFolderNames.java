package com.qkk.daily.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GetFolderNames.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年03月03日 20:46:05
 */
public class GetFolderNames {
    public String[] getFolderNames(String[] names) {
        int n = names.length;
        String[] res = new String[n];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int index = map.getOrDefault(names[i], 1);
            res[i] = names[i];
            while (map.containsKey(res[i])) {
                res[i] = names[i] + "(" + index + ")";
                index++;
            }
            map.put(names[i], index);
            map.put(res[i], 1);
        }
        return res;
    }
}
