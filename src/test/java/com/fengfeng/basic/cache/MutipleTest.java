package com.fengfeng.basic.cache;

import com.fengfeng.basic.cache.impl.MapCache;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MutipleTest {
    @Test
    void test() throws InterruptedException {
        HashMap hashMap = new HashMap();  // 线程不安全
        MapCache mapCache = new MapCache("不安全",hashMap);
        ConsumeCache consumeCache = new ConsumeCache(mapCache);
        ConsumeCache1 consumeCache1 = new ConsumeCache1(mapCache);
        consumeCache.start();
        consumeCache1.start();

//        四、join()方法的概念
//        如果在当前线程（main或其他线程）中调用线程对象join,当前线程阻塞，直到线程对象的run执行完毕，当前线程阻塞结束
        consumeCache.join();
        consumeCache1.join();
        System.out.println(mapCache);
        System.out.println(mapCache.getSize());

    }

    @Test
    void test2() throws InterruptedException {
        ConcurrentMap hashMap = new ConcurrentHashMap();  // 线程安全
        MapCache mapCache = new MapCache("fengfeng",hashMap);
        ConsumeCache consumeCache = new ConsumeCache(mapCache);
        ConsumeCache1 consumeCache1 = new ConsumeCache1(mapCache);
        consumeCache.start();
        consumeCache1.start();


        consumeCache.join();
        consumeCache1.join();
        System.out.println(mapCache);
        System.out.println(mapCache.getSize());

    }

}
