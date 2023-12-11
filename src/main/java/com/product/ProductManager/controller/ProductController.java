package com.product.ProductManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.ProductManager.entity.Product;
import com.product.ProductManager.service.ProductService;

@RestController
public class ProductController {
@Autowired
ProductService service;

@PostMapping("/addproduct")
public Product addProduct(@RequestBody Product pr) {
	return service.saveProduct(pr);
}

@PostMapping("/addproducts")
public List<Product> addProduct(@RequestBody List<Product> pr) {
	return service.saveMultipleProduct(pr);
}

@GetMapping("/getproducts")
public List<Product> getProducts(){
	return service.getMultipleProduct();
}

@GetMapping("/getproduct/{id}")
public Product getProduct(@PathVariable int id){
	return service.getProductById(id);
}

@PutMapping("/update")
public Product updateProduct(@RequestBody Product pr) {
	return service.saveProduct(pr);
}

@DeleteMapping("/delete/{id}")
public String deleteProduct(@PathVariable int id) {
	return service.deleteProduct(id);
}
}
