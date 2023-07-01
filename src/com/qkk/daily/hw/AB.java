package com.qkk.daily.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();

        String[] split1 = line1.split(" ");
        int m_q = Integer.parseInt(split1[0]);
        int n_q = Integer.parseInt(split1[1]);
        int r_q = Integer.parseInt(split1[2]);

        String[] split2 = line2.split(" ");
        int[] a_q = new int[m_q];
        for (int i = 0; i < m_q; i++) {
            a_q[i] = Integer.parseInt(split2[i]);
        }

        String[] split3 = line3.split(" ");
        int[] b_q = new int[n_q];
        for (int i = 0; i < n_q; i++) {
            b_q[i] = Integer.parseInt(split3[i]);
        }
        ArrayList<int[]> res = new ArrayList<>();
        int start = 0;
        for (int a: a_q) {
            boolean flag = false;
            for (int i = 0; i < m_q; i++) {
                if (b_q[i] >= a && b_q[start] < a) {
                    start = i;
                }
                if (a + r_q == b_q[i]) {
                    res.add(new int[]{a, b_q[i]});
                    break;
                }
                if (b_q[i] - a > r_q) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                res.add(new int[]{a, b_q[start]});
            }
        }
        for (int[] r: res) {
            System.out.println(r[0] + " " + r[1]);
        }
    }
}
