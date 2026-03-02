package org.example.notification;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Sms")
public class Sms implements  NotificationServices{
    @Override
    public  void notify(String message){
        System.out.println("SMS sent: "+message);
    }

}
