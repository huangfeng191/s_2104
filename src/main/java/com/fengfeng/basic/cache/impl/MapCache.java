package com.fengfeng.basic.cache.impl;

import com.fengfeng.basic.cache.Cache;
import com.fengfeng.basic.exception.MyException;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class MapCache<K,V> implements Cache<K,V> {
    private Map<K,V>  map;
    private final String name; // 一次性，不可更改
    public MapCache(String name,Map<K, V> map) {
        this.map = map;
        this.name=name;
    }

    @Override
    public void put (K key, V value)  throws MyException {
        map.put(key,value);
    }

    @Override
    public void remove(K key)throws MyException {
        map.remove(key);
    }

    @Override
    public int getSize() {
        return map.size();
    }

    @Override
    public V get(K key) throws MyException{
        return map.get(key);

    }

    @Override
    public void clear() throws MyException{
        map.clear();
    }



    public Set<K> keys_test() {
        Set<K> ks = map.keySet();
        return ks;
    }

    @Override
    public Set<K> keys() {
        Set<K> ks = map.keySet();
        if(!ks.isEmpty()){ // 使 key 不可更改
            return Collections.unmodifiableSet(ks);
        }
        return Collections.emptySet();

    }


    public Collection<V> values_test() {
        return map.values();

    }

    @Override
    public Collection<V> values() {
        Collection<V> values = map.values();
        if(!values.isEmpty()){
            return Collections.unmodifiableCollection(values);
        }
//        return null;
        return Collections.emptySet();
    }


}
