package com.product.rest.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.rest.api.Entities.Product;
import com.product.rest.api.Reposetory.productReposatory;

@Service
public class ProductService {
  @Autowired
private final productReposatory prepository;	
	

	public ProductService(productReposatory prepository) {
		this.prepository=prepository;
		
		
	}
	public Product saveData(Product p) {
		return prepository.save(p);
	}
	public  List<Product> getAllData(){
		return prepository.findAll();
	}
	public Optional<Product>getDataById(int id){
		return prepository.findById(id);
	}
	public Product updateData(Integer id,Product p) {
		Optional<Product>existingData=prepository.findById(id);
		if(existingData.isPresent()) {
			
			Product product=existingData.get();
			product.setName(p.getName());
			product.setPrice(p.getPrice());
			product.setDetails(p.getDetails());
			return prepository.save(product);
			
		}else {
			
	            throw new RuntimeException("Product not found");
	        
		}
		
		
	}
	public void deleteData(Integer id ) {
		prepository.deleteById(id);
	}
}
