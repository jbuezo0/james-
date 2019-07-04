/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.conexion;
import com.models.User;
import com.models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JBuezo
 */
public class UserDao {
    
    
    
       public static User getUser(String usuario) throws SQLException, ClassNotFoundException {

        String sql = "select id, user_name, password FROM user WHERE user_name = '" + usuario + "'";

        try {
            Connection con = conexion.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            User usual;

            usual = new User(
                    rs.getInt("id"),
                    rs.getString("user_name"),
                    rs.getString("password")
            );
            return usual;
        } catch (SQLException e) {
            System.out.println("error usuario" + e);
            return null;
        }
    }


   
    
}
