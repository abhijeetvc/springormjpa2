package com.jpa.springormjpa2.controller;

import com.jpa.springormjpa2.model.Customer;
import com.jpa.springormjpa2.model.Product;
import com.jpa.springormjpa2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(value = "/savecustomer")
    public String addCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Customer saved";
    }
}
