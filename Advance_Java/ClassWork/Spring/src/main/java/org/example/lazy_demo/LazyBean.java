package org.example.lazy_demo;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component

public class LazyBean {




    public  LazyBean(){
        System.out.println("Lazy Bean is created!!");
    }
    public  void run(){
        System.out.println("Lazy Bean has been started.");
    }
}
