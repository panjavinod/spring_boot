package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Product;
import com.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productrepository;

	public List<Product> getProducts(){
	  return  productrepository.findAll();
		
	}
	
	public Optional<Product> getProductById(int id) {
		return productrepository.findById(id);
	}
	
	public void saveProduct(Product product) {
		productrepository.save(product);
	}
	
	public Product updateProduct(Product product) {
		return productrepository.save(product);
	}
	
	public void DeleteProduct(int id) {
		productrepository.deleteById(id);
	}
}
