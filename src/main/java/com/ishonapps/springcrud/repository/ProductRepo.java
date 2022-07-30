package com.ishonapps.springcrud.repository;

import com.ishonapps.springcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
