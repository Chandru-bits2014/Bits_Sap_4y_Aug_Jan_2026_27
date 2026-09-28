package com.sapbits.inventoryservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapbits.inventoryservice.model.Product;
import com.sapbits.inventoryservice.repository.ProductRepository;

@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepository prodRepo;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
		
	
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return prodRepo.findByCategory(category);
	}

	@Override
	public Product updateStock(int id, int stock) {
		// TODO Auto-generated method stub
		Product prodU = prodRepo.findById(id).get();
		prodU.setStock(stock);
		return prodRepo.save(prodU);
		
	
	} // SOLID 

	@Override
	public Product receiveShipment(int id, int quantity) {
		// TODO Auto-generated method stub
		Product prodExist = prodRepo.findById(id).get();
		prodExist.setStock(prodExist.getStock() + quantity);
		return prodRepo.save(prodExist);
	}



	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return prodRepo.save(product);
	}



	@Override
	public Product deleteProductById(int productId) {
		// TODO Auto-generated method stub
		Product product = prodRepo.getById(productId);
		prodRepo.deleteById(productId);
		return product;
	}
	
	
	

}
