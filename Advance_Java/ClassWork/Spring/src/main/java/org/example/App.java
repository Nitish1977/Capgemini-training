package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        MessageService messageService =  context.getBean(MessageService.class);
        messageService.sendMessage();

        System.out.println(messageService);


        EmailService emailService = context.getBean(EmailService.class);
        EmailService emailService1 = context.getBean(EmailService.class);

        System.out.println(emailService);
        System.out.println(emailService1);
        System.out.println((emailService1==emailService));




        ((ClassPathXmlApplicationContext) context).close();
    }
}
