package com.example.UserService.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${server.port:8085}")
    private String port;

    @GetMapping("/users")
    public String getUser(){
        return "Users fetched from USER_SERVICE running on port: "+port;
    }
}
