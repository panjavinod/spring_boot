package com.product.controller;

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

import com.product.model.Product;
import com.product.service.ProductService;


@RestController
public class ProduuctController {
	@Autowired
	ProductService productservice;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productservice.getAllProducts();
		
	}
	
	@GetMapping("/product/{id}")
	public Optional<Product> getProductById(@PathVariable Long id) {
		return productservice.getByProductID(id);
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
	public String DeleteProduct(@PathVariable Long id) {
		productservice.DeleteProduct(id);
		return "Product deleted Sucessfully";
	}
}
