package com.ds;

public class Student {

    private String name;
    private int age;
    private String addess;

    public Student(String name, int age, String addess) {
        this.name = name;
        this.age = age;
        this.addess = addess;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addess='" + addess + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddess() {
        return addess;
    }

    public void setAddess(String addess) {
        this.addess = addess;
    }
}


