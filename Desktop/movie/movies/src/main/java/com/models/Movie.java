/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *  ** Esta clase contiene todos los contructores, getters y setters del modelo
 Movie
 *
 * @author JBuezo
 */
public class Movie {
    /**
     * Los variables que utilizamos para el modelo Movie
     */
    private int id;
    private  String name_movie;
    private  String duration;
    private String description;
    private int category_id;
    private  String categorymovie;
    private Category category;
    /**
     * Constructores que ocuparemos en los metodos Dao
     * @param name_movie
     */
       

    public Movie(String name_movie, String duration, String description, int category_id) {
        this.name_movie = name_movie;
        this.duration = duration;
        this.description = description;
        this.category_id = category_id;
    }

    public Movie(int id, String name_movie,String duration, String description, Category category) {
        this.id = id;
        this.name_movie = name_movie;
        this.name_movie = duration;
        this.name_movie = description;
        this.category = category;
    }
    public Movie(int id, String name_movie, Category category) {
        this.id = id;
        this.name_movie = name_movie;
        this.category = category;
    }

    public Movie(int id, String name_movie, String categorymovie, Category category) {
        this.id = id;
        this.name_movie = name_movie;
        this.categorymovie = categorymovie;
        this.category = category;
    }
    
    public Movie(int id, String name_movie, String duration, String description, String categorymovie, Category category) {
        this.id = id;
        this.name_movie = name_movie;
        this.duration = duration;
        this.description = description;
        this.categorymovie = categorymovie;
        this.category = category;
    }

    public Movie(int id, String name_movie, int category_id, String categorymovie) {
        this.id = id;
        this.name_movie = name_movie;
        this.category_id = category_id;
        this.categorymovie = categorymovie;
    }
    

    public Movie(int id, String name_movie, String duration, String description, String categorymovie) {
        this.id = id;
        this.name_movie = name_movie;
        this.duration = duration;
        this.description = description;
        this.categorymovie = categorymovie;
    }

    public Movie(int id, String name_movie, String duration, String description) {
        this.id = id;
        this.name_movie = name_movie;
        this.duration = duration;
        this.description = description;
    }

   

   
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_movie() {
        return name_movie;
    }

    public void setName_movie(String name_movie) {
        this.name_movie = name_movie;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
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