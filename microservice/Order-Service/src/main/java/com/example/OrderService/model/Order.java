package com.example.OrderService.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {

    @Id
    private int oid;
    private String customerName;
    private String customerAddress;

    private int pid;
}
