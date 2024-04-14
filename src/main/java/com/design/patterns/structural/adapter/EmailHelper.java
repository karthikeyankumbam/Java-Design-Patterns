package com.design.patterns.structural.adapter;

import com.design.patterns.structural.adapter.libraries.MailGun;

public class EmailHelper {
    EmailAdapter adapter;

    public EmailHelper(EmailAdapter adapter) {
        this.adapter = adapter;
    }
    public void sendMail(String from, String to, String content) {
        adapter.sendMail(content,from,to);
    }
}
