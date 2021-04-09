package com.fengfeng.basic.annotation;

@MyAnnotation
public class Parent {
    public Parent() {
        System.out.println("I'm parent " +this.getClass().isAnnotationPresent(MyAnnotation.class));
    }
}
