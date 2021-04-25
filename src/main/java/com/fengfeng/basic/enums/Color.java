package com.fengfeng.basic.enums;

public enum Color {
    yellow,black,white,pink,violet{
        public int getIdx(){//枚举对象实现抽象方法
            return 100;
        }
    };
    // 构造函数
    private Color()
    {
        System.out.println("Constructor called for : " + this.toString());
    }

    public int getIdx(){
        return this.ordinal();
    }

    }
