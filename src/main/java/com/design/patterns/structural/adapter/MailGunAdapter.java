package com.design.patterns.structural.adapter;

import com.design.patterns.structural.adapter.libraries.MailGun;

public class MailGunAdapter implements EmailAdapter{
    MailGun mailGun=new MailGun();
    @Override
    public void sendMail(String from, String to, String content) {
        mailGun.sendMail(content,from,to,null,null);
    }
}
