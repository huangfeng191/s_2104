package com.fengfeng.basic.cache;

public class ConsumeCache1 extends Thread {
    private  Cache cache;

    public ConsumeCache1(Cache cache) {
        this.cache = cache;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8000; i++) {
            cache.put(i,i);
            cache.remove(i);
        }
        
    }
    @Override
    public String toString() {
        return "ConsumeCache1{" +
                "cache=" + cache +
                '}';
    }
}
