package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductRepo;

import com.demo.model.Products;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
    
	public List<Products> getAllProducts(Products products) {
		return productRepo.findAll() ;	
	}
	@SuppressWarnings("deprecation")
	public Optional<Products> getproducts(int id) {
		return productRepo.findById(id)	;	
	}
	public void saveProducts(Products products) {
		productRepo.save(products);
	}
	public void deleteproducts(int id) {
		productRepo.deleteById(id);
	}
	
}
