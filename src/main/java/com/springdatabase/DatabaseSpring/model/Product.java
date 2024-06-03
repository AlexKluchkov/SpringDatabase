package com.springdatabase.DatabaseSpring.model;

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
    public Product(String name_of_product, int quantity_of_products, int price)
    {
        this.name = name_of_product;
        this.quantity = quantity_of_products;
        this.price = price;
    }
}
