package com.fengfeng.basic.thread.consult.first;


class ThreadDemo extends Thread{


    private String threadName;
    private Thread t;

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
    }


    @Override
    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");

    }
    public void start(){
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
// 必须在 start 前调用, 否则会有异常
//  只有守护线程存在时,程序会退出

//            t.setDaemon(true);
//            没跑完就退出了 ，哈哈
            t.start ();
//            t.setPriority(10);


        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo T1 = new ThreadDemo( "Thread-1");
        T1.start();


        ThreadDemo T2 = new ThreadDemo( "Thread-2");
        T2.start();

    }
}
