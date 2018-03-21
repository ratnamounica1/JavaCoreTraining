package com.SageIT.JavaClasses.CoreJava;


public class Object_BeanStudent {
    private int id;
    private String name;
    public Object_BeanStudent(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}