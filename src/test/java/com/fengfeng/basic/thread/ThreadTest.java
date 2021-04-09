package com.fengfeng.basic.thread;

import org.junit.jupiter.api.Test;

public class ThreadTest {
@Test
 void test() {
// TODO Auto-generated method stub
        ThreadName thread1=new ThreadName();//创建线程
        ThreadName thread2=new ThreadName();
        ThreadName thread3=new ThreadName();
//        thread1.setName("1号");//设置线程名字
//        thread2.setName("2号");
//        thread3.setName("3号");
        thread1.start();//执行线程
        thread2.start();
        thread3.start();
    }

}
