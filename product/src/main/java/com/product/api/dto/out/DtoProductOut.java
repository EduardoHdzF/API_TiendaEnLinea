package com.product.api.dto.out;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DtoProductOut {	
	
	@JsonProperty("product_id")
	private Integer product_id;
	
	@JsonProperty("category_id")
	private Integer category_id;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("gtin")
	private String gtin;
	
	@JsonProperty("price")
	private Float price;
	
	@JsonProperty("product")
	private String product_name;
	
	@JsonProperty("status")	
	private Integer status;
	
	@JsonProperty("stock")
	private Integer stock;
	
	@JsonProperty("image")
	private String image;
	
	public DtoProductOut(Integer product_id, Integer category_id, String description, String gtin, Float price,
			String product_name, Integer status, Integer stock, String image) {
		super();
		this.product_id = product_id;
		this.category_id = category_id;
		this.description = description;
		this.gtin = gtin;
		this.price = price;
		this.product_name = product_name;
		this.status = status;
		this.stock = stock;
		this.image = image;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}	
	
}
