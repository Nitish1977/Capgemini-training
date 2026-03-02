package org.example.notification;


import org.springframework.stereotype.Component;

@Component
public interface NotificationServices {

    public  void notify(String message);

}
