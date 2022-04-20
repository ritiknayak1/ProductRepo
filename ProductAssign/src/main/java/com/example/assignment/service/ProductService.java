package com.example.assignment.service;

import java.util.List;

import com.example.assignment.model.Product;
import com.example.assignment.vo.ProductVo;



public interface ProductService {

	String addProduct(ProductVo productVo);

	List<ProductVo> getAllProduct();

	void deleteProduct(ProductVo productvo);

	String  updateProduct(ProductVo pr);

}
