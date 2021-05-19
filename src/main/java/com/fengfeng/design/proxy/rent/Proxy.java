package com.fengfeng.design.proxy.rent;

public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        this.host.rent();
        seeHouse();
        brokerage();
    }

    public void seeHouse() {
        System.out.println("see the  apartment ");
    }

    public void brokerage() {
        System.out.println("give me  money");
    }
}
