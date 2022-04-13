package com.vis.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/category/")
	public ProductCategory saveProductCategory (@RequestBody ProductCategory productCategory) {
		return productCategoryService.save(productCategory);
	}
	
	@DeleteMapping
	@PostMapping("/category/")
	public ProductCategory deleteProductCategory (@RequestBody ProductCategory productCategory) {
		
		try {
			return productCategoryService.delete(productCategory);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// this is bad, need to put a wrapper for exception and error conditions
		return null;
	}
	
}
