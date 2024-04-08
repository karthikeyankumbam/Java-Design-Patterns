package com.design.patterns.creational.builder;

public class Student {
  private Student(Builder builder){
    this.age=builder.age;
    this.email=builder.email;
    this.name=builder.name;
    this.track=builder.track;
  }
  private String name;
  private String email;
  private int age;
  private int yeaOfGraduation;
  private String track;
  private String phoneNumber;
  private String university;
  public static Builder getBuilder(){
    return new Builder();
  }
  static class Builder{
    private String name;
    private String email;
    private int age;
    private int yeaOfGraduation;
    private String track;
    private String phoneNumber;
    private String university;

    public Builder setName(String name) {
      this.name = name;
      return this;
    }


    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public Builder setYeaOfGraduation(int yeaOfGraduation) {
      this.yeaOfGraduation = yeaOfGraduation;
      return this;
    }

    public Builder setTrack(String track) {
      this.track = track;
      return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public Builder setUniversity(String university) {
      this.university = university;
      return this;
    }
    public Student build() throws Exception {
      if(this.age<18){
        throw new Exception("Age should not be less than 18");
      }
      if(this.name==null || this.email==null){
        throw  new Exception("Name or Email is missing");
      }
      return new Student(this);
    }

  }
}
