package com.fengfeng.basic.stat;

import org.junit.jupiter.api.Test;

public class StaticTest {
    @Test
    public void test() {

        StatT statT = new StatT();
        statT.name = "3";
        System.out.println(StatT.name);
        String name = statT.name;
        System.out.println(name);
//        对象能访问今天变量

    }
}
