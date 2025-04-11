package com.product.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.dto.in.DtoProductImageIn;
import com.product.api.service.SvcProductImage;
import com.product.commons.dto.ApiResponse;
import com.product.exception.ApiException;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/product-image")
@Tag(name = "Imagen-producto", description = "Catálogo de imágenes de un producto")
public class CtrlProductImage {

	@Autowired
	SvcProductImage svc;
	
    @PostMapping    
    public ResponseEntity<ApiResponse> createProductImage(@Valid @RequestBody DtoProductImageIn in, BindingResult bindingResult) {
	        if (bindingResult.hasErrors())
	        	throw new ApiException(HttpStatus.BAD_REQUEST, bindingResult.getFieldError().getDefaultMessage());
		
	        return svc.uploadProductImage(in);
	}
    
    @DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse> deleteProductImage(@PathVariable Integer id) {
		return svc.deleteProductImage(id);
	}
	
}
