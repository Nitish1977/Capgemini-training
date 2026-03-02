package org.example.SmartPayment;


import org.springframework.stereotype.Component;

@Component
public interface PaymentService {
    void send(String message);

}
