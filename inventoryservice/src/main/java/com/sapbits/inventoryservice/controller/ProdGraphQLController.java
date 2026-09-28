package com.sapbits.inventoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sapbits.inventoryservice.model.Product;
import com.sapbits.inventoryservice.service.ProductService;

@Controller
public class ProdGraphQLController {

	@Autowired
	ProductService prodSvc;
	
	@QueryMapping
	public List<Product> getAllProducts()
	{
		return prodSvc.getAllProducts();
	}
	
	@QueryMapping
	public List <Product> getProductsByCategory(@Argument String category,@Argument Product product)
	{
		return prodSvc.getProductsByCategory(category);
	}
	
	@MutationMapping
	public Product updateStock(@Argument int id,@Argument int stock)
	{
		return prodSvc.updateStock(id, stock);
	}
	
	@MutationMapping
	public Product receiveShipment(@Argument int id,@Argument int quantity)
	{
		return prodSvc.receiveShipment(id, quantity);
	}
	
	@MutationMapping
	public Product saveProduct(@Argument String name,@Argument String category,@Argument float price,@Argument int stock)
	{
		Product product = new Product(name,category,price,stock);
		return prodSvc.saveProduct(product);
	}
	
	@MutationMapping
	public Product deleteProductById(@Argument int id)
	{
		return prodSvc.deleteProductById(id);
	}

}
