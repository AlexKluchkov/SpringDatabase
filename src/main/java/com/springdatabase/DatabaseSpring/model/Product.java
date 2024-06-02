package com.springdatabase.DatabaseSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name_of_product;
    private int quantity_of_products;
    private int price;
    public Product(){}
    public Product(String name_of_product, int quantity_of_products, int price)
    {
        this.name_of_product = name_of_product;
        this.quantity_of_products = quantity_of_products;
        this.price = price;
    }
}
