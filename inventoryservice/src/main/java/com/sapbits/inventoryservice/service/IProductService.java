package com.sapbits.inventoryservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sapbits.inventoryservice.model.Product;

@Service
public interface IProductService {

	public List <Product> getAllProducts();
	public List <Product> getProductsByCategory(String category);
	public Product updateStock(int id,int stock);
	public Product receiveShipment(int id,int quantity);
	
	public Product saveProduct(Product product);
	public Product deleteProductById(int productId);
}
