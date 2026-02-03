package com.hsbc.controller;

import com.hsbc.entity.Product;
import com.hsbc.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/products")

public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAllProduct(){
        List<Product> products = productService.findAllProducts();
        return products;
    }


}
