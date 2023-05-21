package com.qkk.daily.cache;

/**
 * @ClassName GlobalConfig.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月18日 09:07:16
 */
public class GlobalConfig extends BaseCacheObject{
    private String key;
    private String value;

    public GlobalConfig(String key, String value) {
        this.key = key;
        this.value = value;
    }
    @Override
    protected long getTimeOut() {
        return ONE_MINUIT;
    }
}
