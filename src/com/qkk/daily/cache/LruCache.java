package com.qkk.daily.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.logging.Logger;

/**
 * @ClassName LruCache.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年09月17日 09:14:36
 */
public class LruCache<V> {
    class Node {
        String key;
        V value;
        Node pre, next;
        private Node(String key, V value) {
            this.key = key;
            this.value = value;
            pre = this;
            next = this;
        }
    }

    private Map<String, Node> cacheMap;

    private int capacity;

    private Node doubleNodes;

    private Lock lock;

    public LruCache(int capacity) {
        this.capacity = capacity;
        doubleNodes = new Node("", null);
        cacheMap = new HashMap<>();
        lock = new ReentrantReadWriteLock().writeLock();
    }

    private void add(Node node) {
        doubleNodes.pre.next = node;
        node.pre = doubleNodes.pre;
        node.next = doubleNodes;
        doubleNodes.pre = node;
    }

    private void remove(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public V get(String key) {
        lock.lock();
        V value = null;
        try {
            if (cacheMap.containsKey(key)) {
                Node node = cacheMap.get(key);
                remove(node);
                add(node);
                value = node.value;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            lock.unlock();
        }
        return value;
    }

    public void put(String key, V value) {
        lock.lock();
        Node node;
        try {
            if (cacheMap.containsKey(key)) {
                node = cacheMap.get(key);
                node.value = value;
                remove(node);
            } else {
                if (cacheMap.size() >= capacity) {
                    remove(doubleNodes.next);
                    cacheMap.remove(doubleNodes.next.key);
                }
                node = new Node(key, value);
                cacheMap.put(key, node);
            }
            add(node);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void delete(String key) {
        lock.lock();
        try {
            if (!cacheMap.containsKey(key)) {
                return;
            }
            Node node =cacheMap.get(key);
            cacheMap.remove(key);
            remove(node);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
