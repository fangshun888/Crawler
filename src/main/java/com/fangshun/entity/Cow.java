package com.fangshun.entity;

public class Cow {
    private String name;
    private String sex;

    public Cow(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Cow() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
