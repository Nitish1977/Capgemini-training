package com.example.Service;

import com.example.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void addUser(User user);
}
