package com.fengfeng.basic.thread.consult.first.group;

public class ThreadClassDemo {
    public static void main(String[] args) {
        Runnable hello = new DesplayMessage("Hello");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true); // daemon ( /ˈdiːmən/ )
        thread1.setName("Hello");
        System.out.println("Starting Hello Thread ...."); // 重要的 放前面, 所以 hello 写在 thread 的前面
        thread1.start();

        Runnable goodbye = new DesplayMessage("Goodbye");
        Thread thread2 = new Thread(goodbye);
        thread2.setDaemon(true);
        thread2.setPriority(Thread.MIN_PRIORITY); // 优先级比较低的话 被调用的 可能性 大大减小.
        System.out.println("Starting Goodbye Thread...");
        thread2.start();
        System.out.println("Starting GuessNumber Thread...");
        GuessNumber thread3 = new GuessNumber(30);
        thread3.start();
    }
}
