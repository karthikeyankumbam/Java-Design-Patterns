package com.design.patterns.creational.builder;

public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * 1. To get rid off two classes and have single class.
         * 2. Make builder as static inner class.
         * 3. Create a method in student(getBuilder) which returns object of builder
         * 4. We changed the return type of setters to Builder.
         * */
//        Student.Builder sb= new Student.Builder();
/**
        Student.Builder sb= Student.getBuilder();
        sb.setAge(34);
        sb.setName("Sa");
        Student student=new Student(sb);

 */
        /**
        Student.Builder sb=Student.getBuilder().setAge(24).setName("Sa");
        Student student=new Student(sb);
        */
        Student student=Student.getBuilder().setAge(24).setName("Sa").setEmail("abc@gmail.com").
                setPhoneNumber("+1234").build();

    }
}
