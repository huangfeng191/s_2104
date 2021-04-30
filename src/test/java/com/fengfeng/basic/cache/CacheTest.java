package com.fengfeng.basic.cache;

import com.fengfeng.basic.cache.impl.MapCache;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;


public class CacheTest {

    @Test
    void cacheTest(){
        HashMap hashMap = new HashMap();

        MapCache<String, Object> stringObjectMapCache = new MapCache<>(hashMap);
        stringObjectMapCache.put("1","1");
        stringObjectMapCache.put("2","7");
        stringObjectMapCache.put("3","1");
        stringObjectMapCache.put("4","1");
        stringObjectMapCache.remove("9"); // 为空时 ，不返回异常
        int size = stringObjectMapCache.getSize();
        System.out.println(size);
        Collection<Object> values = stringObjectMapCache.values();
        System.out.println(values);
    }

}
