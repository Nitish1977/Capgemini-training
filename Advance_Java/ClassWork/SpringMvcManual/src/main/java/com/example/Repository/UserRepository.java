package com.example.Repository;

import com.example.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
}
