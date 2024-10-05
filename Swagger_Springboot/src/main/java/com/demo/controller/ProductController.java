package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Products;
import com.demo.service.ProductService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ProductController {
    
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	//@ApiOperation(value="it will fetch all products")
	public List<Products> getAllProducts(Products products){		
		return productService.getAllProducts(products);	
	}
	
	@GetMapping("/products/{id}")
	//@ApiOperation(value="it will fetch products by ID")
	public Optional<Products> GetProducts(@PathVariable int id) {
		return productService.getproducts(id);		
	}
	
	@PostMapping("/products")
	//@ApiOperation(value="it will save the Products")
	public String saveProducts(@RequestBody Products products) {
		productService.saveProducts(products);
		return products.getName() ;		
	}
	
	@DeleteMapping("/products/{id}")
	//@ApiOperation(value="it will Delete the Products")
	public String deleteProducts(@PathVariable int id) {
		productService.deleteproducts(id);
		return "Products Details Deleted";		
	}
}
