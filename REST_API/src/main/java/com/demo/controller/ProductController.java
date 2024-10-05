package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productservice;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productservice.getProducts();
		
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable int id) {
		return productservice.getProductById(id);
	}
	
	@PostMapping("/product")
	public void saveProducts(@RequestBody Product product) {
		productservice.saveProduct(product);
	}
	
	@PutMapping("/product")
	public Product UpdateProduct(@RequestBody Product product) {
		productservice.saveProduct(product);
		return product;
	}
	
	@DeleteMapping("/product/{id}")
	public String DeleteProduct(@PathVariable int id) {
		productservice.DeleteProduct(id);
		return "Product deleted Sucessfully";
	}
}
