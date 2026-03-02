package org.example.notifyapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class NotificationManager {
    private final NotificationService sms;
    private final NotificationService email;
    private final NotificationService push;

    @Autowired
    public NotificationManager(NotificationService push, @Qualifier("sms")NotificationService sms, @Qualifier("email")NotificationService email) {
        this.push = push;
        this.sms = sms;
        this.email = email;
    }

    public void run(){
        System.out.println("====Primary====");
        sms.notify("Hello, I am Nitish");
        email.notify("Hello, I am Nitish");
        push.notify("Hello, I am nitish");
    }
}
