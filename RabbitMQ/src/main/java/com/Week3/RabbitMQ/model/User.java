package com.Week3.RabbitMQ.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue()
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

}
