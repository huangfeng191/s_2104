package com.fengfeng.basic.modifier;

import com.fengfeng.basic.modifier.service.People;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class ModifierTest {
    @Autowired
    People people;
    @Test
    public void test(){
// 定义interface 里的方法,只要给默认 权限就好了，因为实际使用的时接口的实现，只要等访问到接口就可以了
        people.setName("fengfeng");
        System.out.println(people.getName());
        people.setName("yun");
    }
    @Test
    public void test2(){
        System.out.println("我是方法2 ");
        System.out.println(people.cry());


    }
}
