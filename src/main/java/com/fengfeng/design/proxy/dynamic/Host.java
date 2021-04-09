package com.fengfeng.design.proxy.dynamic;

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("I 'm renting ");
    }
}
