package com.Week3.RabbitMQ.service;

import com.Week3.RabbitMQ.model.SaleAdvertisement;
import com.Week3.RabbitMQ.repository.SaleAdvertisementRepo;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class Consumer {

    private final SaleAdvertisementRepo repo;

    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload Long id) throws InterruptedException{
        Thread.sleep(3000);
        Optional<SaleAdvertisement> data=repo.findById(id);
        if(data.isPresent()==true){
            SaleAdvertisement item = data.get();
            item.setPriceGraphPath(item.getPhoto() + " graph");
            repo.save(item);
        }

    }
}
