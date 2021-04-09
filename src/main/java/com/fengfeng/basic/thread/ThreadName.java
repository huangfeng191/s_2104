package com.fengfeng.basic.thread;

public class ThreadName extends Thread{

    public void run()
    {

        System.out.println("线程:"+this.getName());//打印线程名字
    }




}
