package com.jpa.springormjpa2.repository;

import com.jpa.springormjpa2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
