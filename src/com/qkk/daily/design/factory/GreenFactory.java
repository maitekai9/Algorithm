package com.qkk.daily.design.factory;

/**
 * @ClassName GreenFactory.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:23:51
 */
public class GreenFactory implements Factory{
    @Override
    public Color getColor() {
        return new GreenColor();
    }

    @Override
    public Pen getPen() {
        return new GreenPen();
    }
}
