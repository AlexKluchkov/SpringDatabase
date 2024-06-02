package com.springdatabase.DatabaseSpring.controller;

import com.springdatabase.DatabaseSpring.model.Order;
import com.springdatabase.DatabaseSpring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@Controller
public class OrderController {

    @Autowired
    private OrderRepository order_repository;

    @GetMapping("/Orders")
    public String All_Orders(Model model) {
        try {
            List<Order> _orders = order_repository.findAll();
            model.addAttribute("_orders", _orders);
            return "table_of_order";
        } catch (Exception e) {
            return "Error";
        }
    }
}
