package com.Week3.RabbitMQ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Week3.RabbitMQ.model.User;

public interface UserRepo extends JpaRepository<User,Long> {
}
