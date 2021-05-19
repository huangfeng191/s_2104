package com.fengfeng.basic.modifier;


import com.fengfeng.basic.modifier.service.People;
import com.fengfeng.basic.modifier.service.impl.PeopleImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ModifierTest {
    @Autowired
    People people;

    @Test
    public void test() {
// 定义interface 里的方法,只要给默认 权限就好了，因为实际使用的时接口的实现，只要等访问到接口就可以了
        people.setName("fengfeng");
        System.out.println(people.getName());
        people.setName("yun");
    }

    @Test
    public void test2() {
        System.out.println("我是方法2 ");
        System.out.println(people.cry());


    }
    @Test
    public void testModifier(){
        PeopleImpl people = new PeopleImpl();
        people.setAppearance("aa");
        people.setPrivacy("first level");
        System.out.println(people.appearance);
//        System.out.println(people.privacy);
//        默认情况 不同包 无法访问

    }
    @Test
    public void testModifier1(){
        Man people = new Man();
        people.setAppearance("aa");
        people.setPrivacy("first level");
        System.out.println(people.appearance);
//        跨包了 无法访问 , 但子类可以访问
        System.out.println(people.getPrivacy1());

//        定义接口只要访问 结构体就行 ，所以 可以 默认modifier
//        默认情况 不同包 无法访问

    }

}
