package com.qkk.daily.design.duty;

/**
 * @ClassName ChainB.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:53:17
 */
public class ChainB extends Chain{
    @Override
    public boolean handle() {
        boolean flag = false;
        // do something o
        if (flag && next != null) {
            next.handle();
        }
        return flag;
    }
}
