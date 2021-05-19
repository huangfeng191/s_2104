package com.fengfeng.basic.thread.consult.first;
//https://www.tutorialspoint.com/java/java_multithreading.htm
class RunnableDemo  implements Runnable{
    private Thread t;
    private String threadName;
// 如果没有构造函数的时候,会默认空构造, 如果有构造函数, 则不会默认；
    public RunnableDemo(String threadName) {
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
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}

public class RunnableTest{
    public static void main(String[] args) {
        RunnableDemo runnableDemo= new RunnableDemo("Thread-1");
        runnableDemo.start();

        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        R2.start();

    }
}