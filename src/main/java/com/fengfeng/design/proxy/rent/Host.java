package com.fengfeng.design.proxy.rent;

public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("I have a room to rent !");
    }
}
