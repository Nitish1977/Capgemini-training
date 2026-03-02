package org.example.BeanLifeCycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DbConnection {
    private String dbName;

    public DbConnection() {
        System.out.println("DB constructor is being called!!!");
    }
    @PostConstruct
    public  void initi(){
        System.out.println("initi method is being called");

    }
    public  void executeQuery(){
        System.out.println("Query is being executed!!");
        System.out.println( "select * from Employee");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method is being called...!!!");
    }



}
