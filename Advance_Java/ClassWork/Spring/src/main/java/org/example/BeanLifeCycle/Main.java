package org.example.BeanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public  static  void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        DbConnection dbConnection = context.getBean(DbConnection.class);

        dbConnection.executeQuery();

        context.close();

    }

}
