package com.design.patterns.creational.prototype;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student student=get();
        Student clone=student.clone();
    }
    public static Student get(){
        Random r=new Random();
        int x= r.nextInt();
        Student s;
        if(x%2==0){
            s=new Student(20,"Rahul","MGIT");
        }else{
            s=new IntellijentStudent(25,"Rohit","JNTU",35);
        }
        return s;
    }
}
