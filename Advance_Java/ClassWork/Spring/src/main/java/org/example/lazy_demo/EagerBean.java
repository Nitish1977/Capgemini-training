package org.example.lazy_demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EagerBean {

    public  EagerBean(){
        System.out.println("Eager Bean created!!");
    }

    public void run(){
        System.out.println("Eager Bean has been started");
    }
}
