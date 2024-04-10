package com.design.patterns.creational.prototype;

public class Student implements Cloneable{
    private int age;
    private String name;
    private String university;

    public Student(int age, String name, String university) {
        this.age = age;
        this.name = name;
        this.university = university;
    }

    public Student(Student orginal){
        this.age=orginal.age;
        this.name=orginal.name;
        this.university=orginal.university;
    }
    public Student clone(){
        return new Student(this);
    }
}
