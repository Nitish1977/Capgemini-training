package org.example.notifyapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public  static  void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NotificationConfig .class);

        NotificationManager notificationManager = context.getBean(NotificationManager.class);
        notificationManager.run();

        context.close();

    }

}
