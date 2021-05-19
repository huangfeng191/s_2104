package com.fengfeng.basic.annotation;

public class Son extends Parent {
    public Son() {
        super();
        System.out.println(this.getClass().isAnnotationPresent(MyAnnotation.class));
    }
}

