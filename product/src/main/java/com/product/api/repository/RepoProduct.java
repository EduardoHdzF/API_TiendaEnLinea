package com.product.api.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.api.dto.out.DtoProductOut;
import com.product.api.entity.Product;

@Repository
public interface RepoProduct extends JpaRepository<Product, Integer> {
		
	@Query(value = "SELECT p.product_id, p.category_id, p.description, p.gtin, p.price, p.product AS product_name, " 
            + "p.status, p.stock, i.image "
            + " FROM product p "
            + " INNER JOIN product_image i ON p.product_id = i.product_id "
            + " WHERE p.product_id = :productId;", nativeQuery = true)
	List<DtoProductOut> getProduct(@Param("productId") Integer productId);
		
	@Query(value = "SELECT * FROM product WHERE product_id = :productId;", nativeQuery = true)
	List<DtoProductOut> findProduct(@Param("productId") Integer productId);
	
}
