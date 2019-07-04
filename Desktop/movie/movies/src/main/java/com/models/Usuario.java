/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 * clase donde se declaran los atributos constructor,getters y setters del
 * objeto usuario
 * @author JBuezo
 */
public class Usuario {
     private int id;
    private String user_name;
    private String password;

    public Usuario(int id, String user_name, String password) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
    }

   
    public Usuario(int id, String user_name) {
        this.id = id;
        this.user_name = user_name;
        
    }

    public Usuario(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
 
    
}