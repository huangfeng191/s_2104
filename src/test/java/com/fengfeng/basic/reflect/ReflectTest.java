package com.fengfeng.basic.reflect;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest {
    @Test
    void loadProperties() throws IOException {
        Properties properties = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("classLoaderTest.properties");
        properties.load(resourceAsStream);
        Object name = properties.get("name");
        System.out.println(name);
        System.out.println("111");
    }

    @Test
    void loadProperties2() throws IOException {
//        未成功   FileInputStream 基础未学好
        Properties properties = new Properties();
//        加载的是 根目录(父工程)的 文件 study_2103.cs.property
        FileInputStream fileInputStream = new FileInputStream("classLoaderTest2.properties");
        properties.load(fileInputStream);
        Object name = properties.get("name");
        System.out.println(name);
    }

    @Test
    void getClassTest() throws ClassNotFoundException {
/**
 * Java -Java 学习- Java 基础到高级-宋红康-零基础自学Java-尚硅谷 P643 643.15-尚硅谷-高级-ClassLoader的理解
 */
        //第一种：Class c1 = Code.class;
        Class class1 = ReflectTest.class;
        System.out.println(class1.getName());


//        //第二种：Class c2 = code1.getClass();
        ReflectTest demo2 = new ReflectTest();
        Class c2 = demo2.getClass();
        System.out.println(c2.getName());
//
//        //第三种：

        Class class3 = Class.forName("com.fengfeng.basic.reflect.ReflectTest");
        System.out.println(class3.getName());
    }

}

