package com.ecom.backend.service;


import com.ecom.backend.model.Product;
import com.ecom.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getDetailsOfProduct() {

        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {


        return productRepository.save(product);
    }


}
