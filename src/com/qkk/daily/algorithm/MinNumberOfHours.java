package com.qkk.daily.algorithm;

/**
 * @ClassName MinNumberOfHours.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年03月13日 21:23:34
 */
public class MinNumberOfHours {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sum = 0;
        for (int e: energy) {
            sum += e;
        }
        int train = sum > initialEnergy ? 1 + sum - initialEnergy : 0;
        for (int e: experience) {
            if (initialExperience <= e) {
                train += 1 + e - initialExperience;
                initialExperience = 2 * e + 1;
            } else {
                initialExperience += e;
            }
        }
        return train;
    }
}
