package com.fengfeng.basic.cache;

public class ConsumeCache extends Thread {
    private  Cache cache;

    public ConsumeCache(Cache cache) {
        this.cache = cache;
    }

    @Override
    public void run() {

        for (int i = 0; i < 8000; i++) {
            cache.put(i,i);
            System.out.println(cache.getSize());
            cache.remove(i);
        }

    }

    @Override
    public String toString() {
        return "ConsumeCache{" +
                "cache=" + cache +
                '}';
    }
}
