package com.fengfeng.basic.objoriented;

import lombok.Data;
import lombok.NonNull;

@Data
public class Person {
    @NonNull private String name;
    private String age;

}
