package com.fengfeng.basic.str;

import org.junit.jupiter.api.Test;

public class StrTest {
    @Test
    void stringBuilderTest(){
        String a = "111";
        String b = "111";
        String b1 = a;
        b1 = "222";
        String c = new String("111");
        String d=new String("111");
        System.out.println(b1);
        System.out.println(a == b);
        System.out.println(a==c);
    }
}
