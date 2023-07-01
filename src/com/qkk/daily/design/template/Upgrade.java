package com.qkk.daily.design.template;

/**
 * @ClassName Upgrade.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:03:39
 */
public abstract class Upgrade {
    public abstract boolean openTemplate();
    public void dispatchTask() {
        System.out.println("下发升级任务");
    }
    public abstract boolean closeTemplate();
}
