package com.fengfeng.basic.sup;

import org.junit.jupiter.api.Test;

// sup : super 的使用
public class SuperTest {
    @Test
    void test() {
        Asian asian = new Asian("fengfeng", "10", "mail");
//        asian.setPeopleName("fengyunxi");
        System.out.println(asian.getName());
        System.out.println(asian);
        People people = asian;
        people.setName("fengyunxi");
        System.out.println(people);
        Asian a = (Asian) people; // 父类到子类需要强转，子类到父类不需要
        System.out.println(a);
    }
}
