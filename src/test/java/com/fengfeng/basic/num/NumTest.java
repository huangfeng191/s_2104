package com.fengfeng.basic.num;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


public class NumTest {
    @Test
    void intLimit() {
//        int 最大数字未 2^31
        int i = 2_000_000_000;
        System.out.println(i);
    }
}
