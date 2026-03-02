package org.example.anno;

import org.springframework.stereotype.Component;

@Component
public class SmsService {
    public  void send(){
        System.out.println("Notify");
    }

}
