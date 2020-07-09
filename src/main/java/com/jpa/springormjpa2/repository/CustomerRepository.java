package com.jpa.springormjpa2.repository;


import com.jpa.springormjpa2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
