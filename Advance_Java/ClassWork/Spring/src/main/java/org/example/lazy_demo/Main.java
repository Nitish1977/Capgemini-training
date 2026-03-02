package org.example.lazy_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public  static  void main(String[] args){


        System.out.println("Container created");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyConfig.class);
        System.out.println("check");
        LazyBean lazyBean = context.getBean(LazyBean.class);
        System.out.println(("Container started.."));
        lazyBean.run();
        context.close();


    }
}
