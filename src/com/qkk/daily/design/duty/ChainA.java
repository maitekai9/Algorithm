package com.qkk.daily.design.duty;

/**
 * @ClassName ChainA.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:50:59
 */
public class ChainA extends Chain{
    @Override
    public boolean handle() {
        boolean flag = false;
        // do something
        if (flag && next != null) {
            next.handle();
        }
        return flag;
    }
}
