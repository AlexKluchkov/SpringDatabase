package com.springdatabase.DatabaseSpring.repo;

import com.springdatabase.DatabaseSpring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {}
