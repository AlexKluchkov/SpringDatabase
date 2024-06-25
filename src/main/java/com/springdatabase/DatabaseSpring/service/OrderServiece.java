package com.springdatabase.DatabaseSpring.service;

import com.springdatabase.DatabaseSpring.entity.Order;
import com.springdatabase.DatabaseSpring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiece {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiece(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Iterable<Order> getAllUsers() {
        return orderRepository.findAll();
    }
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }
    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }
}
