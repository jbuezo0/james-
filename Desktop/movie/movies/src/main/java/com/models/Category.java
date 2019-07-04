/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/** *
 * Esta clase contiene todos los contructores, getters y setters del modelo
 Category
 * @author JBuezo
 */
public class Category {
    

  /**
     * Los variables que utilizamos para el modelo Category
     */
    private int id;
    private String name_category;
     private int category_id;
    private  String categorymovie;
    private Category category;

    /**
     * Constructores que ocuparemos en los metodos Dao
     */
    public Category(int id, String name_category) {    
        this.id = id;
        this.name_category = name_category;
        
    }

    public Category(String name_category) {
        this.name_category = name_category;
    }
    
    public Category(int id, String name_category, int category_id) {
        this.id = id;
        this.name_category = name_category;
        this.category_id = category_id;
    }

    

    /**
     * Creacion de Metodos Get y Set
     */
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_category() {
        return name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }

    public String getCategorymovie() {
        return categorymovie;
    }

    public void setCategorymovie(String categorymovie) {
        this.categorymovie = categorymovie;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
    