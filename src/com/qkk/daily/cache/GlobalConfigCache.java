package com.qkk.daily.cache;

/**
 * @ClassName GlobalConfigCache.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月18日 09:06:02
 */
public class GlobalConfigCache extends BaseCache<String, GlobalConfig>{
    @Override
    protected int getCacheSize() {
        return 100;
    }

    @Override
    protected GlobalConfig initBaseObject(String key) {
        return new GlobalConfig(key, null);
    }

    public GlobalConfig getByName(String name) {
        return get(name);
    }
}
