package com.example.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.assignment.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
