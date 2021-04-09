package com.fengfeng.basic.objoriented;


import org.junit.jupiter.api.Test;

public class OrientedTest {
    @Test
    void testHashCode(){
        /**
         *       我们先来看一下Object.hashCode的通用约定（摘自《Effective Java》第45页）
         *     在一个应用程序执行期间，如果一个对象的equals方法做比较所用到的信息没有被修改的话，那么，对该对象调用hashCode方法多次，它必须始终如一地返回 同一个整数。在同一个应用程序的多次执行过程中，这个整数可以不同，即这个应用程序这次执行返回的整数与下一次执行返回的整数可以不一致。
         *     如果两个对象根据equals(Object)方法是相等的，那么调用这两个对象中任一个对象的hashCode方法必须产生同样的整数结果。
         *   如果两个对象根据equals(Object)方法是不相等的，那么调用这两个对象中任一个对象的hashCode方法，不要求必须产生不同的整数结果。然而，程序员应该意识到这样的事实，对于不相等的对象产生截然不同的整数结果，有可能提高散列表（hash table）的性能。
         *       如果只重写了equals方法而没有重写hashCode方法的话，则会违反约定的第二条：相等的对象必须具有相等的散列码
         * ————————————————
         * 版权声明：本文为CSDN博主「木叶之荣」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
         * 原文链接：https://blog.csdn.net/zknxx/article/details/53862572
         */
//    如果重写的 equals 必须重写 hashcode;
//        重写的hashcode 所以当设置完后 对象的hashcode 就变掉了
        Animal animal = new Animal();
        System.out.println(animal.hashCode());
        animal.setAge("1");
        System.out.println(animal.hashCode());


        Bird bird = new Bird();
        System.out.println(bird.hashCode());
        bird.setAge("1");
        System.out.println(bird.hashCode());

    }
    @Test
    void lombokTest(){

//        重写的hashcode 所以当设置完后 对象的hashcode 就变掉了
//        lombok data 只是生成了一个空的构造函数
        Person people = new Person();
        System.out.println(people.hashCode());
        people.setAge("1");
        System.out.println(" lombok data 重写了 hashcode "+people.hashCode());

        Person people2 = new Person("fengfeng","11");
        System.out.println(people.hashCode());
    }

}
