package com.fengfeng.basic.map;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {
    @Test
    void test(){
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
