package org.example.notifyapp;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PushNotificationService implements NotificationService {

    @Override
    public  void notify(String message){
        System.out.println("message Sent: "+message);
    }
}
