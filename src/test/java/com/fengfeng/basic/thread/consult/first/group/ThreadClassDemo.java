package com.fengfeng.basic.thread.consult.first.group;

public class ThreadClassDemo {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber(30);
        guessNumber.start();
    }
}
