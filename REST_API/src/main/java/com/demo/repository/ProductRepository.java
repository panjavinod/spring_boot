package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

	public Product findByName(String name);
}