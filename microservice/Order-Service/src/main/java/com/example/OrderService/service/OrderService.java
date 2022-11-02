package com.example.OrderService.service;

import com.example.OrderService.model.Order;
import com.example.OrderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired

    private OrderRepository repository;

    public Order addOrder(Order order){
        return repository.save(order);
    }

    public Order save(Order order) {
        return repository.save(order);
    }

    public String delete(Integer pid) {
        repository.deleteById(pid);
        return "Order Deleted Success Fully";
    }
}
