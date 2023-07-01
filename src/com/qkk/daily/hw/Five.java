package com.qkk.daily.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flag = scanner.nextLine();
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals("0")) {
                pos.add(i);
            }
        }
        List<int[]> res = new ArrayList<>();
        for (int i: pos) {
            int len = 1;
            s1[i] = flag;
            int left = i - 1, right = i + 1;
            boolean l_flag = false, r_flag = false;
            while (left >= 0 || right < s1.length) {
                if (left >= 0) {
                    if (s1[left].equals(flag)) {
                        len++;
                        left--;
                    } else {
                        l_flag = true;
                    }
                }
                if (right <= s1.length) {
                    if (s1[right].equals(flag)) {
                        len++;
                        right++;
                    } else {
                        r_flag = true;
                    }
                }
                if (l_flag && r_flag) {
                    break;
                }
            }
            if (len != 1 && len <= 5) {
                res.add(new int[]{i, len});
            }
            s1[i] = "0";
        }
        if (res.isEmpty()) {
            System.out.println("-1");
        }
        int mid = s1.length / 2;
        res.sort((o1, o2) -> {
            if (o2[1] != o1[1]) {
                return o2[1] - o1[1];
            } else {
                return Integer.compare(Math.abs(o1[0] - mid), Math.abs(o2[0] - mid));
            }
        });
        System.out.println(res.get(0)[0]);
    }
}
