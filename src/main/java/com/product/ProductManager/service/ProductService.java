package com.product.ProductManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.ProductManager.entity.Product;
import com.product.ProductManager.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo repo;
	
	public Product saveProduct(Product pr) {
	return	repo.save(pr);
	}
	
	public List<Product> saveMultipleProduct(List<Product> pr) {
		return	repo.saveAll(pr);
		}
	
	public List<Product> getMultipleProduct() {
		return	repo.findAll();
		}
	public Product getProductById(int id) {
		return repo.findById(id).orElse(null);
	}
	public Product getProductByName(String name) {
		return repo.findByName(name);
	}
	
	public String deleteProduct(int id) {
		repo.deleteById(id);
		return "product deleted"+id;
	}
	public Product updateProduct(Product product) {
		return repo.save(product);
	}

}
