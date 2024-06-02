package com.springdatabase.DatabaseSpring.Service;

import com.springdatabase.DatabaseSpring.model.Product;
import com.springdatabase.DatabaseSpring.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllUsers() {
        return ProductRepository.findAll();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }
}
