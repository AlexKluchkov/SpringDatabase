package com.springdatabase.DatabaseSpring.repository;

import com.springdatabase.DatabaseSpring.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
