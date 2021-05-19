package com.fengfeng.basic.sup;

public class Asian extends People {
    private String sex;

    public Asian(String name, String age, String sex) {
        super(name, age);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPeopleName(String name) {
        super.setName(name);
    }

    public String getPeopleName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Asian{" +
                "sex='" + sex + '\'' +
                "name='" + super.getName() + '\'' +
                "age='" + super.getAge() + '\'' +
                '}';
    }

}
