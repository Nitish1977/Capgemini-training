package org.example.SmartPayment;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditCard implements PaymentService{


    @PostConstruct
    public  void initi(){
        System.out.println("Bean is Initialisation");
    }

    @PreDestroy
    public  void destroy(){
        System.out.println("Bean is destroy");
    }
    @Override
    public void send(String message){
        System.out.println("Credit Card: "+message);

    }

}
