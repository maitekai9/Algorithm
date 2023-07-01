package com.qkk.daily.design.template;

/**
 * @ClassName BsrUpgrade.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:05:41
 */
public class BsrUpgrade extends Upgrade{
    @Override
    public boolean openTemplate() {
        System.out.println("打开bsr升级模板");
        return true;
    }

    @Override
    public boolean closeTemplate() {
        System.out.println("关闭bsr升级模板");
        return true;
    }
}
