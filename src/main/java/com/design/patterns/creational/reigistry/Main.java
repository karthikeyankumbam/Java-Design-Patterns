package com.design.patterns.creational.reigistry;

import com.design.patterns.creational.prototype.IntellijentStudent;
import com.design.patterns.creational.prototype.Student;

public class Main {
    public static final String STUDENT_KEY="STUDENT_KEY";
    public static final String INTELLIJENT_STUDENT_KEY="INTELLIJENT_STUDENT_KEY";

    public static void main(String[] args) {
        setUpRegistry();
        StudentRegistry studentRegistry=StudentRegistry.getInstance();
        IntellijentStudent intellijent =(IntellijentStudent) studentRegistry.get(INTELLIJENT_STUDENT_KEY);
    }
    public static void   setUpRegistry(){
        StudentRegistry studentRegistry=StudentRegistry.getInstance();
        Student student=new Student(20,"Ram","JNTU");
        IntellijentStudent intellijentStudent=new IntellijentStudent(20,"Ram","JNTU",2);
        studentRegistry.register(STUDENT_KEY,student);
        studentRegistry.register(INTELLIJENT_STUDENT_KEY,intellijentStudent);
    }
}
