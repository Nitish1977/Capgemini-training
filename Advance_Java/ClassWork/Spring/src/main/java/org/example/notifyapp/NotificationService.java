package org.example.notifyapp;


import org.springframework.stereotype.Component;

@Component
public interface NotificationService {
    void notify(String message);
}
