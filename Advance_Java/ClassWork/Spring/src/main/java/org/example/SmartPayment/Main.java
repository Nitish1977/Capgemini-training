package org.example.SmartPayment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public  static  void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SmartPaymentConfig.class);
        Services services = context.getBean(Services.class);

        services.run();
        context.close();
    }
}
