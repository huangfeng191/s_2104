package com.fengfeng.basic.finalize;

import org.junit.jupiter.api.Test;

public class FinalizeTest {
    @Test
    public void test(){
        Bird bird = new Bird();
        bird.setName("fengfeng");
        System.out.println(bird);
        bird=null;
        System.gc();
    }
}
