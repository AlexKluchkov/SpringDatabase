package com.springdatabase.DatabaseSpring.service;

import com.springdatabase.DatabaseSpring.model.Product;
import com.springdatabase.DatabaseSpring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService
{
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> getAllUsers() {
        return productRepository.findAll();
    }
    public void saveProduct(Product product) {
        productRepository.save(product);
    }
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }
}
