package com.fengfeng.design.proxy.dynamic;

public class Customer {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandle proxyInvocationHandle = new ProxyInvocationHandle();
        proxyInvocationHandle.setRent(host);
        Rent rent = (Rent) proxyInvocationHandle.getProxy();
        rent.rent();


    }
}
