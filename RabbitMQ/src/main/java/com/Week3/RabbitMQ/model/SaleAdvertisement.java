package com.Week3.RabbitMQ.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "sale_advertisement")
public class SaleAdvertisement {

    @Id
    @GeneratedValue()
    private Long id;

    @Column
    private Long userId;

    @Column
    private String title;

    @Column
    private String photo;

    @Column
    private String detailsMessage;

    @Column
    private String priceGraphPath;
}
