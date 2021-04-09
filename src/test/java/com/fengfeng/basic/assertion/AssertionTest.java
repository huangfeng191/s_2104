package com.fengfeng.basic.assertion;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AssertionTest {
    @Test
   void contextLoad(){
        double x = Math.abs(-123.45);
        assert x < 0;
        System.out.println(x);
   }
}
