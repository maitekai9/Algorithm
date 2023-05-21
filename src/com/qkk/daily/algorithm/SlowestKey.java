package com.qkk.daily.algorithm;

/**
 * @ClassName SlowestKey.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年01月09日 16:33:54
 */
public class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int time = releaseTimes[0];
        char key = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            int temTime = releaseTimes[i] - releaseTimes[i - 1];
            char temKey = keysPressed.charAt(i);
            if (temTime > time || (temTime == time && temKey > key) ) {
                time = temTime;
                key = temKey;
            }
        }
        return key;
    }
}
