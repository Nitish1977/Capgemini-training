package org.example.bean_scope;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class BeanScopeDemo {
    public  static  void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanScopeConfig.class);

        System.out.println("====Singleton Scope======");
        SingletonBean b1 = context.getBean(SingletonBean.class);
        SingletonBean b2 = context.getBean(SingletonBean.class);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1==b2);


        System.out.println("=====Prototype Scope======");

        PrototypeBean p1 = context.getBean(PrototypeBean.class);
        PrototypeBean p2 = context.getBean(PrototypeBean.class);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
        context.close();
    }
}
