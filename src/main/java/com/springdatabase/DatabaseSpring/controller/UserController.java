package com.springdatabase.DatabaseSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/users")
    public String allOrders() {
        return "table_of_users";
    }
}
