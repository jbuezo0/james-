/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.models;

/**
 *
 * @author JBuezo
 */
public class User {
    
     private int id;
    private String user_name;
    private String password;

    public User(int id, String user_name, String password) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
    }

    public User(int id, String user_name) {
        this.id = id;
        this.user_name = user_name;
    }

    public User(String user_name, String password) {
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
