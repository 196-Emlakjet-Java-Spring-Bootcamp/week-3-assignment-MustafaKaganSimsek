package com.Week3.RabbitMQ.service;

import com.Week3.RabbitMQ.model.User;
import com.Week3.RabbitMQ.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepo repo;

    public void createUser(User user){
        repo.save(user);
    }


}
