package com.product.api.repository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.api.entity.ProductImage;

@Repository
public class RepoProductImage {

	public ProductImage findByProduct_id(@Param("product_id") Integer product_id) {
		return null;
	}

	public void save(ProductImage productImage) {
		// TODO Auto-generated method stub
		
	}	
	
}
