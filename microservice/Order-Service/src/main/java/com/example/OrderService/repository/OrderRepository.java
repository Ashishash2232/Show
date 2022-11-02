package com.example.OrderService.repository;

import com.example.OrderService.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order,Integer> {

    List<Order> findByPid(int pid);
}
