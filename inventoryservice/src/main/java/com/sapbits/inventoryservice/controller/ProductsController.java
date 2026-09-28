package com.sapbits.inventoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapbits.inventoryservice.model.Product;
import com.sapbits.inventoryservice.service.ProductService;
/* WHEN GRAPHQL IS IMPLEMENTED NO NEED TO IMPLEMENT RESTCONTROLLER*/
@RestController
@RequestMapping("/products")
public class ProductsController {
	
	@Autowired
	ProductService prodSvc;
	
	@GetMapping("/all")
	public List<Product> getAllProducts()
	{
		return prodSvc.getAllProducts();
	}
	
	@GetMapping("/byCategory/{category}")
	public List <Product> getProductsByCategory(@PathVariable String category)
	{
		return prodSvc.getProductsByCategory(category);
	}

}
