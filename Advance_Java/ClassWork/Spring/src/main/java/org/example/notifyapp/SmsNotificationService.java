package org.example.notifyapp;


import org.springframework.stereotype.Component;

@Component
//@Qualifier("sms")
public class SmsNotificationService implements  NotificationService {
    @Override
    public  void notify(String message){
        System.out.println("Sms sent: "+message);
    }

}
