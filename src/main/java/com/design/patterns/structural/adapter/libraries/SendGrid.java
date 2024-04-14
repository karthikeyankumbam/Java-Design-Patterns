package com.design.patterns.structural.adapter.libraries;

import com.design.patterns.structural.adapter.EmailAdapter;

public class SendGrid {
    public void sendMail(String content, String from, String to, String[] cc, String[] bcc) {
        System.out.println("Sending email via SendGrid");
        //code to make api Call
    }
}
