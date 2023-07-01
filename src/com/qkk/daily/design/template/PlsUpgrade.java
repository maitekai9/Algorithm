package com.qkk.daily.design.template;

/**
 * @ClassName PlsUpgrade.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:07:24
 */
public class PlsUpgrade extends Upgrade{
    @Override
    public boolean openTemplate() {
        System.out.println("打开pls升级模板");
        return true;
    }

    @Override
    public boolean closeTemplate() {
        System.out.println("关闭pls升级模板");
        return true;
    }
}
