package com.example.ProductService.controller;

import com.example.ProductService.model.Product;
import com.example.ProductService.repository.ProductRepository;
import com.example.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService service;
    @Autowired
    ProductRepository repository;
    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/add")

    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }
    @GetMapping("/get/{pid}")
    public ResponseEntity<Product> findById(@PathVariable int pid){
        Optional<Product> productDetails = repository.findById(pid);
        List orderDetails = restTemplate.getForObject("http://order-service/get/" + pid, List.class );
        productDetails.get().setOrderDetails(orderDetails);

        return ResponseEntity.ok(productDetails.get());
    }

    @PutMapping("/update")
    public ResponseEntity<Product> update(@RequestBody Product product){
        return ResponseEntity.ok(service.save(product));
    }

    @DeleteMapping("/delete")
    public ResponseEntity delete(@PathVariable Integer pid){
        return ResponseEntity.ok(service.delete(pid));
    }
}
