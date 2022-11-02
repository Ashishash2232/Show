package com.example.ProductService.service;

import com.example.ProductService.model.Product;
import com.example.ProductService.repository.ProductRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public Product addProduct(Product product){
        return repo.save(product);
    }

    public Product save(Product product) {
        return repo.save(product);
    }

    public String delete(Integer pid){
        repo.deleteById(pid);
        return "Product deleted success Fully";
    }
}
