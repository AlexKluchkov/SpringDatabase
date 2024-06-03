package com.springdatabase.DatabaseSpring.controller;

import com.springdatabase.DatabaseSpring.entity.Order;
import com.springdatabase.DatabaseSpring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/Orders")
    public String allOrders(Model model) {
        try {
            List<Order> orders = orderRepository.findAll();
            model.addAttribute("orders", orders);
            return "table_of_order";
        } catch (Exception e) {
            return "Error";
        }
    }
}
