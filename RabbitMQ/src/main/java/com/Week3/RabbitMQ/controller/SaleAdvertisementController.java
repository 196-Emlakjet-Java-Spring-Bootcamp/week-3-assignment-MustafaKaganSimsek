package com.Week3.RabbitMQ.controller;

import com.Week3.RabbitMQ.model.SaleAdvertisement;
import com.Week3.RabbitMQ.service.SaleAdvertisementService;
import lombok.AllArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("sale-advitasement")
public class SaleAdvertisementController {

    private final SaleAdvertisementService service;


    @GetMapping
    public List<SaleAdvertisement> getAll(){
        return service.getSale();
    }

    @PostMapping("create")
    public String create(@RequestBody SaleAdvertisement saleAdvertisement){
        service.create(saleAdvertisement);
        return "Event Added";
    }

}
