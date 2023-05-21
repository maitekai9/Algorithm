package com.qkk.daily.design.prototype;

import java.io.*;

/**
 * @ClassName Woman.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年11月29日 21:56:54
 */
public class Woman implements Cloneable{
    String hobby;
    Man man;
    public Woman(String hobby, Man man) {
        this.hobby = hobby;
        this.man = man;
    }

    @Override
    protected Woman clone() throws CloneNotSupportedException {
        Woman woman = (Woman) super.clone();
        woman.man = man.clone();
        return woman;
    }

    public Object deepClone() {
        Object woman = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            woman = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return woman;
    }
}
