package com.sapbits.inventoryservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapbits.inventoryservice.model.Product;

public interface ProductRepository extends JpaRepository <Product,Integer>{

	List<Product> findByCategory(String category);

}
