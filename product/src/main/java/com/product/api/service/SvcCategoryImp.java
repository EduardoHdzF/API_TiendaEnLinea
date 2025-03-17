package com.product.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.product.api.entity.Category;
import com.product.api.repository.RepoCategory;
import com.product.exception.ApiException;

@Service
public class SvcCategoryImp implements SvcCategory{
	@Autowired
	RepoCategory repo;
	
	@Override
	public ResponseEntity<List<Category>> getCategories() {
		try {
			List<Category> categories = repo.getCategories();
			//List<Category> categories = repo.findByStatus(1);
			//List<Category> categories = repo.findByStatusOrderByCategory(1);			
		}catch (DataAccessException e) {
			throw new ApiException(HttpStatus.BAD_REQUEST, "Error en la consulta de categorías. Verifique los parámetros enviados.");			
		}
		return new ResponseEntity<>(repo.getCategories(), HttpStatus.OK);
	}
	
	private void validateCategoryId(int id) {
		if(repo.findById(id).isEmpty())
			throw new ApiException(HttpStatus.NOT_FOUND, "El id de la categoría no existe");
	}

}
