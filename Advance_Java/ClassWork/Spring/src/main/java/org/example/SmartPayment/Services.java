package org.example.SmartPayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Services {

    @Autowired
    public  PaymentService upi;

    @Autowired
    @Qualifier("upi")
    private  PaymentService credit;
//    @Autowired
//    public Services(PaymentService credit, @Qualifier("upi")PaymentService upi) {
//        this.upi = upi;
//        this.credit = credit;
//    }

    public  void run(){
        System.out.println("====Payment Methods====");
        upi.send("Payment is successfully");
        credit.send("Payment is successfully");

    }
}
