package com.product.rest.api.Reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.rest.api.Entities.Product;
@Repository
public interface productReposatory extends JpaRepository<Product, Integer> {

}
