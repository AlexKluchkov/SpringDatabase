package com.springdatabase.DatabaseSpring.controller;

import com.springdatabase.DatabaseSpring.entity.Product;
import com.springdatabase.DatabaseSpring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {
    @Autowired
    private ProductService productService;
    @GetMapping("/Products")
    public String allProduct(Model model)
    {
        Iterable<Product> products = productService.getAllUsers();
        model.addAttribute("products", products);
        return "table_of_products";
    }
    @GetMapping("/NewProductRegistrationForm")
    public String addNewProduct(Model model)
    {
        return "NewProductRegistrationForm";
    }
    @PostMapping("/NewProductRegistrationForm")
    public String addPostNewProduct(@RequestParam String name_of_product, @RequestParam int quantity_of_products, @RequestParam int price, Model model)
    {
        Product newProduct = new Product(name_of_product, quantity_of_products, price);
        productService.saveProduct(newProduct);
        return "";
    }
}
