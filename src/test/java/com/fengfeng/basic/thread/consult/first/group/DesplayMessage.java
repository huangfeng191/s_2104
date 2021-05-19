package com.fengfeng.basic.thread.consult.first.group;

public class DesplayMessage implements Runnable {
    private String message;

    public DesplayMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(message);
        }
    }
}
