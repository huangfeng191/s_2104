package com.fengfeng.basic.modifier.service.impl;

import com.fengfeng.basic.modifier.service.People;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class PeopleImpl implements People {
    private String name;
    protected String privacy;
    String live;

    public String appearance;
    @Override
    public String cry() {
        return "haha " + name + " is crying ！！！";
    }
}
