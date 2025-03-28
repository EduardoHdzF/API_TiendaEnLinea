package com.product.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("category_id")
	@Column(name = "category_id")	
	private int category_id;
	
	@JsonProperty("category")
	@Column(name = "category")
    private String category;
	
	@JsonProperty("tag")
	@Column(name = "tag")
    private String tag;
	
	@JsonProperty("status")
	@Column(name = "status")
    private int status;

    public Category() {
        
    }
    
    /**
     * Constructor de categoria.
     * 
     * @param id Identificador de la categoria.
     * @param category Categoria.
     * @param tag Etiqueta de la categoria.
     */
    public Category(int id, String category, String tag){
    	super();
        this.category_id = id;
        this.category = category;
        this.tag = tag;
        this.status = 1;
    }
    

    /**
     * Regresa el identificador de la categoria.
     * 
     * @return Identificador de la categoria.
     */
    public int getCategoryId(){
        return this.category_id;
    }

    /**
     * Regresa la categoria.
     * 
     * @return Categoria.
     */
    public String getCategory(){
        return this.category;
    }

    /**
     * Regresa la etiqueta de la categoria.
     * 
     * @return Etiqueta de la categoria.
     */
    public String getTag(){
        return this.tag;
    }

    /**
     * Regresa el estado de la categoria.
     * 
     * @return Estado de la categoria.
     */
    public int getStatus(){
        return this.status;
    }

    
    /**
     * Actualiza el identificador de la categoria.
     * 
     * @param category_id Identificador de la categoria.
     */
    public void setCategoryId(int category_id){
        this.category_id = category_id;
    }

    /**
     * Actualiza la categoria.
     * 
     * @param category Categoria.
     */
    public void setCategory(String category){
        this.category = category;
    }

    /**
     * Actualiza la etiqueta de la categoria.
     * 
     * @param tag Etiqueta de la categoria.
     */
    public void setTag(String tag){
        this.tag = tag;
    }

    /**
     * Actualiza el estado de la categoria.
     * 
     * @param status Estado de la categoria.
     */
    public void setStatus(int status){
        this.status = status;
    }
    
     /**
     * Verifica si otra categoria es igual a la categoria.
     * 
     * @param other_category Otra categoria.
     * @return Verdadero si son iguales o de lo contrario falso.
     */
    public boolean equals(Category other_category){
        boolean same = false;
        String categoryA = (this.category).toLowerCase();
        String tagA = (this.tag).toLowerCase();
        String categoryB = (other_category.getCategory()).toLowerCase();
        String tagB = (other_category.getTag()).toLowerCase();
        if(this.category_id == other_category.getCategoryId() || categoryA.equals(categoryB) || tagA.equals(tagB)){
            same = true;
            System.out.println(same);
        }
        return same;
    }
    
  
    /**
     * Imprime la categoria.
     * 
     * @return Cadena de la categoria.
     */
    public String toString(){
        return "{" +this.category_id + ", " + this.category + ", " + this.tag + ", " + this.status + "}";
    }
}
