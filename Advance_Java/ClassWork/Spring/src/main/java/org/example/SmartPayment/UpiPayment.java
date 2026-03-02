package org.example.SmartPayment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upi")
public class UpiPayment implements PaymentService {
    @Override
    public void send(String message){
        System.out.println("UPI: "+message);

    }
}
