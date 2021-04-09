package com.fengfeng.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CommInvocationHandle implements InvocationHandler {
    private Object obj;

    public void setObj(Object obj) {
        this.obj = obj;
    }

     public Object getProxy() {
         return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(obj, args);
        return result;
    }

    public void log(String msg) {
        System.out.println(msg +" is invoked ");
    }
}
