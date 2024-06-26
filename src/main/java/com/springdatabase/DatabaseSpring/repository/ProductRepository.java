package com.springdatabase.DatabaseSpring.repository;

import com.springdatabase.DatabaseSpring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}
