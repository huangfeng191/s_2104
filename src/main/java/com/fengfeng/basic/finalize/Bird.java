package com.fengfeng.basic.finalize;

import lombok.Data;

@Data
public class Bird {
    private String name;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我快死了！！！");
        super.finalize();
    }
}
