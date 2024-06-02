package com.springdatabase.DatabaseSpring.controller;

import com.springdatabase.DatabaseSpring.model.Order;
import lombok.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
    @GetMapping("/getUsers")
    public String All_Orders() {
        return "table_of_users";
    }
}
