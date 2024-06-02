package com.springdatabase.DatabaseSpring.controller;

import com.springdatabase.DatabaseSpring.model.Order;
import com.springdatabase.DatabaseSpring.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @Autowired
    private OrderRepository order_repository;

    @GetMapping("/getOrder")
    public String All_Orders(Model model) {
        try {
            Iterable<Order> _orders = order_repository.findAll();
            model.addAttribute("_orders", _orders);
            return "table_of_order";
        } catch (Exception e) {
            return "Error";
        }
    }
}
