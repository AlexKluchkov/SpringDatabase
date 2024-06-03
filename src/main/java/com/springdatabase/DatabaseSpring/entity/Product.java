package com.springdatabase.DatabaseSpring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    public Product(){}
    public Product(String name, int quantity, int price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
