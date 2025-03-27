package com.product.api.dto.out;

public class DtoProductOut {
	private Integer product_id;
	private String category_id;
	private String description;
	private String gtin;
	private String price;
	private String product;
	private String status;
	private String stock;
	private String image;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
