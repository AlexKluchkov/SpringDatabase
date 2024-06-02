package com.springdatabase.DatabaseSpring.controller;

import com.springdatabase.DatabaseSpring.model.Product;
import com.springdatabase.DatabaseSpring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class ProductsController {
    @Autowired
    private ProductService product_Service_;
    @GetMapping("/Products")
    public String table_of_Product(Model model)
    {
        Iterable<Product> _products = product_Service_.getAllUsers();
        model.addAttribute("_products", _products);
        return "table_of_products";
    }
    @GetMapping("/NewProductRegistrationForm")
    public String add_new_product(Model model)
    {
        return "NewProductRegistrationForm";
    }
    /*@PostMapping("/NewProductRegistrationForm")
    public String add_post_new_product(@RequestParam String name_of_product, @RequestParam int quantity_of_products, @RequestParam int price, Model model)
    {
        Product new_product = new Product(name_of_product, quantity_of_products, price);
        ProductService.saveProduct(new_product);
        return "";
    }*/
}
