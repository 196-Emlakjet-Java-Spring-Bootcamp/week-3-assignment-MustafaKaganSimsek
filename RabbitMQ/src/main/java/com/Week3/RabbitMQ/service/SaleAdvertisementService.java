package com.Week3.RabbitMQ.service;

import com.Week3.RabbitMQ.model.SaleAdvertisement;
import com.Week3.RabbitMQ.repository.SaleAdvertisementRepo;
import lombok.AllArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SaleAdvertisementService {

    private final SaleAdvertisementRepo repo;

    private final RabbitTemplate rabbitTemplate;

    private final Queue queue;

    public void create(SaleAdvertisement saleAdvertisement){
        repo.save(saleAdvertisement);
        rabbitTemplate.convertAndSend(queue.getName(),saleAdvertisement.getId());
    }

    public List<SaleAdvertisement> getSale(){
        return  repo.findAll();
    }
}
