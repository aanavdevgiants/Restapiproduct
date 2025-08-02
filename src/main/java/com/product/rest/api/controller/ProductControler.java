package com.product.rest.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.rest.api.Entities.Product;
import com.product.rest.api.service.ProductService;

@RestController
@RequestMapping("/api/p1")
public class ProductControler {

	private final ProductService productService;
	
	public ProductControler(ProductService productService) {
		this.productService=productService;
		
	}
	@PostMapping("/product")
	public ResponseEntity<Product>saveData(@RequestBody Product product){
		Product newproduct=productService.saveData(product);
		return ResponseEntity.ok(newproduct);
	}
	@GetMapping("/getProducts")
	public List<Product>getAllData(){
		return productService.getAllData();
	}
	@GetMapping("/products/{id}")
	public ResponseEntity<Product>getDataById( @PathVariable int id){
		Optional<Product> productOptional=productService.getDataById(id);
		return productOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	@PutMapping("/putProduct/{id}")
	public ResponseEntity<Product>updateData(@PathVariable Integer id,@RequestBody Product product){
		Product updateProduct=productService.updateData(id, product);
		return ResponseEntity.ok(updateProduct);
	}
	@DeleteMapping("/deProduct/{id}")
	public ResponseEntity<String>deleteData(@PathVariable Integer id){
		productService.deleteData(id);
		return ResponseEntity.ok("Product deleted successfuly");
	}
}
