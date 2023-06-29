package com.abhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
