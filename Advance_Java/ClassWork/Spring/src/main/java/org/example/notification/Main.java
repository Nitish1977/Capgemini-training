package org.example.notification;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public  static  void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NotificationConfig.class);
        NotificationManager notificationServices = context.getBean(NotificationManager.class);
        notificationServices.run();

        context.close();


    }

}
