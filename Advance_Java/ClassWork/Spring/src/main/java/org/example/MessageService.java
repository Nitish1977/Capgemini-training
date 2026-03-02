package org.example;

public class MessageService {
    private  EmailService emailService;

//    public MessageService(EmailService emailService) {
//        this.emailService = emailService;
//    }

    public EmailService getEmailService() {
        return emailService;
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public  void sendMessage(){
        System.out.println("Message is being sent");
        emailService.send();
    }
}
