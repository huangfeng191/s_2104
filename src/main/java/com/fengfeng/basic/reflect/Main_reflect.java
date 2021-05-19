package com.fengfeng.basic.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main_reflect {
    public String id;

    public void fun(String name, int age) {
        System.out.println("我叫" + name + ",今年" + age + "岁");
    }

    //    获取反射属性
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {

        Class class1 = Class.forName("org.fengfeng.Main_reflect");
        System.out.println(class1.getName());

        Object o = class1.newInstance();
        Main_reflect o1 = new Main_reflect();
        Field id = class1.getField("id");

        System.out.println(o1.getClass());
        System.out.println(Main_reflect.class); // 获取 类的 runtime(字节码文件的) 时的对象

        //newInstance可以初始化一个实例
        //Method method = class1.getMethod("fun", String.class, int.class);//获取方法

//        反射方法 ，有点像是 js 的 call 方法， obj.myFun.apply(db);　
// 拿到方法，再传入对象去调用
        //method.invoke(o1, "tengj", 10);


    }
}
