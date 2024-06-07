package com.springdatabase.DatabaseSpring.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private int quantity;
    private int price;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
    public Product(){}
    public Product(String name, int quantity, int price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
