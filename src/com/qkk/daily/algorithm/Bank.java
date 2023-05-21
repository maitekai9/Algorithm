package com.qkk.daily.algorithm;

/**
 * @ClassName Bank.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年03月20日 13:15:20
 */
public class Bank {
    long[] balance;
    public Bank(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 > balance.length || account2 > balance.length || money > balance[account1 - 1]) {
            return false;
        }
        balance[account1 - 1] -= money;
        balance[account1 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (account > balance.length) {
            return false;
        }
        balance[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account > balance.length || balance[account - 1] < money) {
            return false;
        }
        balance[account - 1] -= money;
        return true;
    }
}
