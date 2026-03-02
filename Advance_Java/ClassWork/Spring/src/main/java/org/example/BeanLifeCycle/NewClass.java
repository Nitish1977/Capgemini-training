package org.example.BeanLifeCycle;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Prototype")

public class NewClass {

    @PostConstruct
    public  void initi(){
        System.out.println("Initi method is calles... 2");
    }
}
