package com.vis.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vis.order.data.ProductCategory;
import com.vis.order.service.ProductCategoryService;

@RestController("/v1/productCategory")
public class ProductCatalogContoller {
	
	@Autowired
	ProductCategoryService productCategoryService;

	@GetMapping("/categories/")
	public List<ProductCategory> productCategory () {
		
		return productCategoryService.getProductCategories();
		
		
	}
	
}
