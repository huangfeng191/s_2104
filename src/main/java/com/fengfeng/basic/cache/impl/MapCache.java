package com.fengfeng.basic.cache.impl;

import com.fengfeng.basic.cache.Cache;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapCache<K,V> implements Cache<K,V> {
    private Map<K,V>  map;

    public MapCache(Map<K, V> map) {
        this.map = map;
    }

    @Override
    public void put(K key, V value) {
        map.put(key,value);
    }

    @Override
    public void remove(K key) {
        map.remove(key);
    }

    @Override
    public int getSize() {
        return map.size();
    }

    @Override
    public V get(K key) {
        return map.get(key);

    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<K> keys() {
        return map.keySet();

    }

    @Override
    public Collection<V> values() {
        return map.values();
//        return null;
    }
}
