package org.example.anno;


import org.springframework.stereotype.Component;

@Component
public class EmailService {

    public  void send(){
        System.out.println("Throw message");

    }
}
