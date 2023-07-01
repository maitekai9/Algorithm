package com.qkk.daily.design.factory;

/**
 * @ClassName YellowFactory.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:24:50
 */
public class YellowFactory implements Factory{
    @Override
    public Color getColor() {
        return new YellowColor();
    }

    @Override
    public Pen getPen() {
        return new YellowPen();
    }
}
