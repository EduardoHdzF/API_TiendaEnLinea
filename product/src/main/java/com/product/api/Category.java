package com.product.api;

import java.util.ArrayList;
import java.util.List;

public class Category {
		
	private int category_id;
    private String category;
    private String tag;
    private int status;

    //TODO Implementar constructor, status siempre 1
    /**
     * Constructor de categoria.
     * 
     * @param category Categoria.
     * @param tag Etiqueta de la categoria.
     */
    public Category() {
    	
    }
    
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
