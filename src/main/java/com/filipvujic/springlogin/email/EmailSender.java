package com.filipvujic.springlogin.email;

public interface EmailSender {

    void send(String to, String email);
}
