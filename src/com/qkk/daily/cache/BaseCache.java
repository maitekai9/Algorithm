package com.qkk.daily.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName BaseCache.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月18日 08:54:25
 */
public abstract class BaseCache<K, V extends BaseCacheObject> {
    private Map<K, V> cacheMap = new ConcurrentHashMap<>();

    protected abstract int getCacheSize();

    protected abstract V initBaseObject(K key);

    protected V put(K key, V value) {
        if (key == null) {
            return null;
        }
        if (cacheMap.containsKey(key)) {
            cacheMap.put(key, value);
        } else {
            if (cacheMap.size() >= getCacheSize()) {
                cacheMap.clear();
                cacheMap.put(key, value);
            }
        }
        return value;
    }

    protected V get(K key) {
        if (key == null) {
            return null;
        }
        V value = cacheMap.get(key);
        if (value == null || value.isTimeOut()) {
            value = initBaseObject(key);
            if (value != null) {
                if (cacheMap.size() >= getCacheSize()) {
                    cacheMap.clear();
                    cacheMap.put(key, value);
                }
            }
        }
        return value;
    }
}
