package com.design.patterns.structural.adapter;

import com.design.patterns.structural.adapter.libraries.SendGrid;

public class SendGridAdapter implements EmailAdapter {
    SendGrid sendGrid=new SendGrid();
    @Override
    public void sendMail(String from, String to, String content) {
        sendGrid.sendMail(content,from,to,null,null);
    }
}
