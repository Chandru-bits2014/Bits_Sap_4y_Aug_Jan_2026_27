package com.sapbits.inventoryservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String name;
	String category;
	Float price;
	Integer stock;
	
	public Product(String name, String category, Float price, Integer stock) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}
	
	
}
