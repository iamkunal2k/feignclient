package com.example.fienclient2.domain;

import lombok.Data;

@Data
public class Orders {

    private Long id;
    private String product;
    private int quantity;
    private double price;
}
