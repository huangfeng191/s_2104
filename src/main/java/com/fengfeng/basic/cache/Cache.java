package com.fengfeng.basic.cache;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface Cache<K,V> {
//    所谓的缓存 其实就是存储 key value ,
//    得到一个缓存对象，可用 往里面 取 存 统计
    void put(K k,V v);
    void remove(K k);
    int getSize();
    V get(K k);
    void clear();
    Set<K> keys();  // key 是唯一的 所以 用set
    Collection<V> values(); //

}
