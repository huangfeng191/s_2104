package com.fengfeng.design.proxy.rent;

public class Customer {
    public static void main(String[] args) {
        Host host=new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
