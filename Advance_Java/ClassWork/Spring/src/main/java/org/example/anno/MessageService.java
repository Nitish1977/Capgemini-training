package org.example.anno;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    private EmailService emailService;
    private  SmsService smsService;
    @Autowired
    public  MessageService(EmailService emailService, SmsService smsService){
        this.emailService = emailService;
        this.smsService = smsService;

    }


//    public EmailService getEmailService() {
//        return emailService;
//    }
//
//    public void setEmailService(EmailService emailService) {
//        this.emailService = emailService;
//    }

    public  void sendMessage(){
        System.out.println("Sending message....");
        emailService.send();
        smsService.send();
    }
}
