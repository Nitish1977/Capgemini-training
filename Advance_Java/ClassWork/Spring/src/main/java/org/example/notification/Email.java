package org.example.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Email implements  NotificationServices{

    @Override
    public  void notify(String message){
        System.out.println("Email sent: "+message);

    }
}
