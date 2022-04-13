package com.vis.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vis.order.data.ProductCategory;
import com.vis.order.repository.ProductCategoryRepo;

@Service
public class ProductCategoryService {
	
	@Autowired
	ProductCategoryRepo productCategoryRepo;
	
	
	public List<ProductCategory> getProductCategories () {
		List<ProductCategory> result = new ArrayList<ProductCategory>();    
		 productCategoryRepo.findAll().forEach(result::add);
		 return result;
	}

}
