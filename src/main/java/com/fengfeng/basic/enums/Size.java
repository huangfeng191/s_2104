package com.fengfeng.basic.enums;

public enum Size {
    small(100),
    intermediate(400),
    big(500);
    private int measure;

    Size(int measure) {
        this.measure = measure;
    }

    public int getMeasure() {
        return measure;
    }
}
