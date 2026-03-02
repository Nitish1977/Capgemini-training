package org.example.notification;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager{
  private final NotificationServices services1;
  private final  NotificationServices services2;

  @Autowired
    public  NotificationManager(NotificationServices services1, @Qualifier("Sms") NotificationServices services2){
      this.services1 = services1;
      this.services2 = services2;
  }
  public void run() {
  services1.notify("Message for Service-1");
      services2.notify("Message for Service-2");


  }
}
