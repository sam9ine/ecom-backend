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

    public Product updateProduct(Long id,Product updatedProduct){
        Product existingProduct= productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found with given id"));

        existingProduct.setName(updatedProduct.getName());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setDescription(updatedProduct.getDescription());

        return productRepository.save(existingProduct);

    }

    public void deleteProduct(Long id) {

        if (!productRepository.existsById(id)) {
            throw new RuntimeException("Product not found with id: " + id);
        }
        productRepository.deleteById(id);
    }





}
