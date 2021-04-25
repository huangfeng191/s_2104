package com.fengfeng.basic.enums;

import org.junit.jupiter.api.Test;

public class EnumTest {
    @Test
    public void getColor(){
        System.out.println(Color.pink);
    }
    @Test
    public void colorFor(){
//        for (Color color :
//                Color.values() ) {
//            System.out.println(color);
//        }
        System.out.println(Color.pink.ordinal());
        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
        System.out.println(Color.valueOf("white").ordinal());
        System.out.println(Color.valueOf("white").getClass().toString());
        System.out.println(Color.white.getIdx());
        System.out.println(Color.violet.getIdx());
    }
    @Test
    public void sizeTest(){
        Size intermediate = Size.intermediate;
        System.out.println(intermediate.getMeasure());
    }
}
