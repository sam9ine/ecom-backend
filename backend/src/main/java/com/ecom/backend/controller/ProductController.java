package com.ecom.backend.controller;

import com.ecom.backend.model.Product;
import com.ecom.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")

public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProduct(){

        return productService.getDetailsOfProduct();

    }

    @PostMapping
    public Product create (@RequestBody Product product){
        return productService.saveProduct(product);
    }

}
