package com.vis.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vis.order.data.ProductCategory;
import com.vis.order.repository.ProductCategoryRepo;

import io.netty.util.internal.ObjectUtil;

@Service
public class ProductCategoryService {
	
	@Autowired
	ProductCategoryRepo productCategoryRepo;
	
	
	public List<ProductCategory> getProductCategories () {
		List<ProductCategory> result = new ArrayList<ProductCategory>();    
		 productCategoryRepo.findAll().forEach(result::add);
		 return result;
	}


	public ProductCategory save(ProductCategory productCategory) {
		return productCategoryRepo.save(productCategory);
	}


	public ProductCategory delete(ProductCategory productCategory) throws Exception {
		
		Optional.ofNullable(productCategory.getProductCode())
		        .orElseThrow(() -> new Exception(""));
		
		
		productCategoryRepo.delete(productCategory);
		return productCategory;
	}

}
