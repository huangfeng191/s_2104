package com.fengfeng.basic.map;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

    @Test
    void test_collect() {
//        HashMap -> AbstractMap --> Map
//        AbstractMap 实现了 部分 map 方法， 特异性的 由具体类实现 ,HashMap
        HashMap hashMap = new HashMap();
        hashMap.put(1, 121);
        hashMap.put(2, "3232");
        hashMap.remove(2);
        System.out.println(hashMap);
// arrayList 是有序的 , collection 是无序的
//         List -> collection -> iterable

//        collection 线性结构  , map key -value 结构
        List<Object> objects = new ArrayList();
        System.out.println(objects);


//        Java LinkedList（链表） 类似于 ArrayList，是一种常用的数据容器。

//        与 ArrayList 相比，LinkedList 的增加和删除对操作效率更高，而查找和修改的操作效率较低


    }


    @Test
    void test() {
        HashMap<String, String> stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("a", "aa");
        stringStringHashMap.put("b", "bb");
        stringStringHashMap.get("a");

        ArrayList arrayList = new ArrayList();
        HashMap<String, List> stringListHashMap = new HashMap<String, List>();
        stringListHashMap.put("a", arrayList);
        arrayList.add("S");


//        String[0] 数组
        String[] arr = MapTest1.getArr();
        System.out.println(stringStringHashMap.get("a"));
    }
}
