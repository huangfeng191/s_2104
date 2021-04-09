package com.fengfeng.design.proxy.dynamic;

public class CommCustomer {
    public static void main(String[] args) {
        Host host = new Host();
        CommInvocationHandle commInvocationHandle = new CommInvocationHandle();
        commInvocationHandle.setObj(host);
//        代理实现的是接口，不是类
        Rent proxy = (Rent) commInvocationHandle.getProxy();
        proxy.rent();
    }
}
