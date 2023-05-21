package com.qkk.daily.cache;

/**
 * @ClassName BaseCacheObject.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月18日 08:50:46
 */
public abstract class BaseCacheObject {
    private long timestamp;

    public static final long ONE_MINUIT = 60000L;

    protected BaseCacheObject() {
        timestamp = System.currentTimeMillis();
    }

    protected abstract long getTimeOut();

    protected boolean isTimeOut() {
        return System.currentTimeMillis() - timestamp > getTimeOut();
    }

}
