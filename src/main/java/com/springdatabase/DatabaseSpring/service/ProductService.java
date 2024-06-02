package com.springdatabase.DatabaseSpring.service;

import com.springdatabase.DatabaseSpring.model.Product;
import com.springdatabase.DatabaseSpring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getAllUsers() {
        return productRepository.findAll();
    }
    /*
    public void saveProduct(Product product) {
        productRepository.save(product);
    }*/
}
