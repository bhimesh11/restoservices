package com.resto.OrderService.repositoryu;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.resto.OrderService.entity.Order;

@Repository
public interface OrderRepo extends MongoRepository<Order,Integer> {

}
