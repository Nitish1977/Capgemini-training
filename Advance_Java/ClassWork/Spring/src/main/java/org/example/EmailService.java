package org.example;

public class EmailService {
    public EmailService(){
        System.out.println("Constructor is called");
    }

    public void  initi(){
        System.out.println("Initi method is called");

    }
    public  void destroy(){
        System.out.println("Destroy method is called");
    }

    public  void send() {
        System.out.println("Email through!!");
    }
}
