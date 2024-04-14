package com.design.patterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
//        EmailHelper emailAdapter=new EmailHelper(new SendGridAdapter());
        EmailHelper emailAdapter=new EmailHelper(new MailGunAdapter());
        emailAdapter.sendMail("bhavik@gmail.com","b@gmail.com","hi");
    }
}
