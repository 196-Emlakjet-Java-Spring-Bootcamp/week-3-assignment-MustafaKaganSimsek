package com.Week3.RabbitMQ.repository;

import com.Week3.RabbitMQ.model.SaleAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleAdvertisementRepo extends JpaRepository<SaleAdvertisement,Long> {

}
