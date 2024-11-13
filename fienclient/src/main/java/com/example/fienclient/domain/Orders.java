package com.example.fienclient.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private int quantity;
    private double price;
}
