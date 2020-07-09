package com.jpa.springormjpa2.controller;

import com.jpa.springormjpa2.model.Product;
import com.jpa.springormjpa2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping(value = "/saveproduct")
    public String addProduct(@RequestBody Product product){
        productRepository.save(product);
        return "Product saved";
    }

}
