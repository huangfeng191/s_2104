package com.fengfeng.basic.iter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//@SpringBootTest
public class ArrayTest {
    @Test
    void arrayTest(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("2asdfad");
        arrayList.add(new Integer("1"));
        arrayList.forEach((e)->{
// 对每个对象遍历
            System.out.println(e.getClass());
            System.out.println(e);
        });
        Iterator iterator = arrayList.iterator();
        System.out.println(iterator.getClass());

    }
    @Test
    void arrayTest1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("2asdfad");
        arrayList.add(new Integer("1"));

        HashSet hashSet = new HashSet();
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add("3");
        for (Object o:arrayList
        ) {
            System.out.println(o);
        }
        for (Object o:hashSet
        ) {
            System.out.println(o);
        }

    }

}
