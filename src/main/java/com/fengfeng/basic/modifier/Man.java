package com.fengfeng.basic.modifier;

import com.fengfeng.basic.modifier.service.impl.PeopleImpl;

public class Man extends PeopleImpl {
    public String getPrivacy1(){
//        protected 子类能访问
        return this.privacy;
    }
    public String getLive(){
//      default  包外无法访问
//        return this.live;
        return "this.live";
    }

}
