package com.vis.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vis.order.data.ProductCategory;

@Repository
public interface ProductCategoryRepo extends CrudRepository<ProductCategory, Long>{
	
}
