package com.example.ProductService.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id

    private int pid;
    private String productName;
    private String productPrice;

    private List orderDetails;
}
