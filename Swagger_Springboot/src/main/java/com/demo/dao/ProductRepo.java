package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Products;

public interface ProductRepo extends JpaRepository<Products,Integer> {

}
