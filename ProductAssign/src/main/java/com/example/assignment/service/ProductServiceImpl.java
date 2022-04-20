package com.example.assignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assignment.dao.ProductRepository;
import com.example.assignment.model.Product;
import com.example.assignment.vo.PriceRangeVo;
import com.example.assignment.vo.ProductVo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public String addProduct(ProductVo pVo) {
	  Product pr=new Product();
	  pr.setProductName(pVo.getProductName());
	  pr.setProductType(pVo.getProductType());
	  pr.setProductCategory(pVo.getProductCategory());
	  pr.setMaxPrice(pVo.getPricerange().getMaxPrice());
	  pr.setMinPrice(pVo.getPricerange().getMinPrice());
	  productRepo.save(pr);
		return "Data Added";
	}

	@Override
	public List<ProductVo> getAllProduct() {
		List<Product> pr=productRepo.findAll();
		List<ProductVo> pvo=new ArrayList<ProductVo>();
		for(Product p:pr) {
			ProductVo prv=new ProductVo();
			prv.setId(p.getId());
			prv.setProductName(p.getProductName());
			  prv.setProductType(p.getProductType());
			  prv.setProductCategory(p.getProductCategory());
			  PriceRangeVo price=new PriceRangeVo();
			  price.setMaxPrice(p.getMaxPrice());
			  price.setMinPrice(p.getMinPrice());
			prv.setPricerange(price);
			pvo.add(prv);
		}
		return pvo;
	}

	@Override
	public void deleteProduct(ProductVo pvo) {
		Product pr=productRepo.getById(pvo.getId());
		pr.setMaxPrice(pvo.getPricerange().getMaxPrice());
		pr.setMinPrice(pvo.getPricerange().getMinPrice());
		pr.setProductCategory(pvo.getProductCategory());
		pr.setProductName(pvo.getProductName());
		pr.setProductType(pvo.getProductType());
		productRepo.save(pr);
		productRepo.delete(pr);
		
	}

	@Override
	public String updateProduct(ProductVo pro) {
		Product pr=productRepo.getById(pro.getId());
		pr.setMaxPrice(pro.getPricerange().getMaxPrice());
		pr.setMinPrice(pro.getPricerange().getMinPrice());
		pr.setProductCategory(pro.getProductCategory());
		pr.setProductName(pro.getProductName());
		pr.setProductType(pro.getProductType());
		productRepo.save(pr);
		return "Data Updated";
	}

	
}
