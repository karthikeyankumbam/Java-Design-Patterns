package com.design.patterns.creational.prototype;

public class IntellijentStudent extends Student {
    private int iq;

    public IntellijentStudent(int age, String name, String university, int iq) {
        super(age, name, university);
        this.iq = iq;
    }

    public IntellijentStudent(IntellijentStudent orginal) {
        super(orginal);
        this.iq=orginal.iq;
    }
    public IntellijentStudent clone(){
        return new IntellijentStudent(this);
    }
}
