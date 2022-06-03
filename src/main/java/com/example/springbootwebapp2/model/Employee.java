package com.example.springbootwebapp2.model;

public class Employee {
    String name;
    String dept;
    int age;

    public Employee() {
    }

    public Employee(String name, String dept, int age) {
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
