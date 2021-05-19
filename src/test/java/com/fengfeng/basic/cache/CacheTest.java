package com.fengfeng.basic.cache;

import com.fengfeng.basic.cache.impl.MapCache;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

import java.util.*;


public class CacheTest {

    @Test
    void cacheTest() {
        HashMap hashMap = new HashMap();

// 缓存加名字 的原因是，可以有多个缓存， 可用让容器创建，多个缓存
        // 因为交由容器的,所以 name 用final 类型
        MapCache<String, Object> stringObjectMapCache = new MapCache<>("我的老家", hashMap);
        stringObjectMapCache.put("1", "1");
        stringObjectMapCache.put("2", "7");
        stringObjectMapCache.put("3", "1");
        stringObjectMapCache.put("4", "1");
        stringObjectMapCache.remove("9"); // 为空时 ，不返回异常
        int size = stringObjectMapCache.getSize();
        System.out.println(size);
        Collection<Object> values = stringObjectMapCache.values();
        System.out.println(values);

//
        Set<String> strings = stringObjectMapCache.keys_test();
        strings.add("aaaa");
        System.out.println(strings);
        Set<String> strings1 = stringObjectMapCache.keys_test();
        System.out.println(strings1);
    }


    @Test
    void cacheTest1() {
        HashMap hashMap = new HashMap();

// 缓存加名字 的原因是，可以有多个缓存， 可用让容器创建，多个缓存
        // 因为交由容器的,所以 name 用final 类型
        MapCache<String, Object> stringObjectMapCache = new MapCache<>("我的老家", hashMap);
        stringObjectMapCache.put("1", "1");

        Set<String> hashSet = new HashSet();
        hashSet.add("aaa");
        System.out.println(hashSet);

        Set<String> strings = stringObjectMapCache.keys();
//       缓存 获取的 keys 不允许修改
        strings.add("aaaa");
        System.out.println(strings);
        Set<String> strings1 = stringObjectMapCache.keys_test();
        System.out.println(strings1);
    }


    @Test
    void cacheTest_values() {
        HashMap hashMap = new HashMap();

// 缓存加名字 的原因是，可以有多个缓存， 可用让容器创建，多个缓存
        // 因为交由容器的,所以 name 用final 类型
        MapCache<String, Object> stringObjectMapCache = new MapCache<>("我的老家", hashMap);
        stringObjectMapCache.put("1", "1");
        stringObjectMapCache.put("1", 333);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("cs", 3);
        stringObjectMapCache.put("map", hashMap1);

        Collection<Object> values = stringObjectMapCache.values_test();
        Iterator<Object> iterator = values.iterator();
//        循环
        iterator.forEachRemaining(ele -> {
            if (ele instanceof Map) {
                ((Map) ele).put("cs2", 4);
            }
        });
        System.out.println(values);
// 缓存对象 被修改了。
        Collection<Object> values1 = stringObjectMapCache.values_test();
        System.out.println(values1);

//
    }

    @Test
    void cacheTest_values_unmodify() {
        HashMap hashMap = new HashMap();

// 缓存加名字 的原因是，可以有多个缓存， 可用让容器创建，多个缓存
        // 因为交由容器的,所以 name 用final 类型
        MapCache<String, Object> stringObjectMapCache = new MapCache<>("我的老家", hashMap);
        stringObjectMapCache.put("1", "1");
        stringObjectMapCache.put("1", 333);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("cs", 3);
        stringObjectMapCache.put("map", hashMap1);

        Collection<Object> values = stringObjectMapCache.values();

        Iterator<Object> iterator = values.iterator();
//        循环
        iterator.forEachRemaining(ele -> {
            if (ele instanceof Map) {
                ((Map) ele).put("cs2", 4);
            }
        });
        System.out.println(values);
// 缓存对象 被修改了。
        Collection<Object> values1 = stringObjectMapCache.values();
        System.out.println(values1);

//
    }

}
