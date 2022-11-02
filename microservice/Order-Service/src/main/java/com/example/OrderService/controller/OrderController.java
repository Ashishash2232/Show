package com.example.OrderService.controller;

import com.example.OrderService.model.Order;
import com.example.OrderService.repository.OrderRepository;
import com.example.OrderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @Autowired
    private OrderRepository repository;

    @Autowired

    private RestTemplate restTemplate;

    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order){
        return service.addOrder(order);
    }

    @GetMapping("/get")

    public ResponseEntity<List<Order>> getAllOrder(){
        return ResponseEntity.ok(repository.findAll());
    }
    @GetMapping("/get/{pid}")
    public List<Order> getOrder(@PathVariable int pid){
        return repository.findByPid(pid);
    }
    @PutMapping("/update")
    public ResponseEntity<Order> updateOrder(@RequestBody Order order){
        return ResponseEntity.ok(service.save(order));
    }
    @DeleteMapping("/delete/{pid}")

    public ResponseEntity delete(@PathVariable Integer pid){
        return ResponseEntity.ok(service.delete(pid));
    }
}
