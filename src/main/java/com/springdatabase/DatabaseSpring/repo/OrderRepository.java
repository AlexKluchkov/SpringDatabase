package com.springdatabase.DatabaseSpring.repo;

import com.springdatabase.DatabaseSpring.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {}
