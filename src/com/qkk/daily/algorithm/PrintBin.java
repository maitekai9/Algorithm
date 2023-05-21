package com.qkk.daily.algorithm;

/**
 * @ClassName PrintBin.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年03月02日 20:50:07
 */
public class PrintBin {
    public String printBin(double num) {
        StringBuilder sb = new StringBuilder("0.");
        while (num != 0 && sb.length() <= 32) {
            num *= 2;
            int digit = (int) num;
            sb.append(digit);
            num -= digit;
        }
        return sb.length() <= 32 ? sb.toString() : "ERROR";
    }
}
