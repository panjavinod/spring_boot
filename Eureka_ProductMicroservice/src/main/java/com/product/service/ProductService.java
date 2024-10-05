package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;


@Service
public class ProductService {

	@Autowired
	ProductRepository productrepo;
	
	public List<Product> getAllProducts(){
		return productrepo.findAll();	
	}
	
	public Optional<Product> getByProductID(Long id) {
		return productrepo.findById(id);
	}
	
	public void saveProduct(Product product) {
		productrepo.save(product);
	}
	
	public Product updateProduct(Product product) {
		return productrepo.save(product);	
	}
	public void DeleteProduct(Long id) {
		productrepo.deleteById(id);
	}
}
