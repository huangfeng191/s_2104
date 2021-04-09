package com.fengfeng.basic.lambda;

import org.junit.jupiter.api.Test;

public class LambdaTest {
    @Test
    void test(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    System.out.println("Thread: " + 1 + ", " + i);
                    // 让线程睡眠一会
//                    try {
//                        Thread.sleep(50);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        };
        runnable.run();
        System.out.println("-----------------------");
        Runnable runnable1=()->{
            System.out.println("111");
        };
        runnable1.run();
    }
}
