/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.conexion;
import com.models.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * En esta clase realizaremos los elementos CRUD que necesitaremos para el
 * proyecto
 *
 * @author JBuezo
 */
public class CategoryDao {

    /**
     * En el Metodo add podremos insertar nuevas registros en este caso
     * categorias
     */
    public static boolean add(Category category) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar, nuestra variable de conexion,
         * nuestra sentencia sql y nuestra sentencia
         */
        Connection con;
        PreparedStatement ps;
        String sql = "insert into category values (null, ?)";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, category.getName_category());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e);
            return false;
        }
    }

    /**
     * En el Metodo getAll realizamos un select que muestra todos los elementos
     * de la tabla
     */
     public static List<Category> getProductList() throws ClassNotFoundException {
        List<Category> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from category";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(
                        rs.getInt("id"),
                        rs.getString("name_category")
                        
                ));
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("error al mostrar lista prodcuto: " + e);
            list.clear();
        }

        return list;
    }


    public static List<Category> getAll() throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar una lista que recorra la tabla
         */
        List<Category> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from category order by id";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(
                        rs.getInt("id"),
                        rs.getString("name_category")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            list.clear();
        }
        return list;
    }

    /**
     * El Metodo getById nos sirve para tomar un id en especifico que
     * necesitemos
     */
    public static Category getById(int id) throws SQLException, ClassNotFoundException {
        /**
         * Creacion de las variables que necesitaremos
         */
        Category bra;
        Connection con;
        PreparedStatement ps;
        String sql = "select * from category where id = ?";
        ResultSet rs;

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            bra = new Category(rs.getInt("id"), rs.getString("name_categorY")
            );
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            bra = null;
        }
        return bra;
    }

    /**
     * El Metodo update nos ayuda a actualizar los campos de alguna Marca
     */
    public static boolean update(Category category) throws SQLException, ClassNotFoundException {
        /**
         * Creacion de nuestras varialbes
         */
        Connection con;
        PreparedStatement ps;
        String sql = " update category set name_category =? where id=?";
        int rowAffected;

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, category.getName_category());
            ps.setInt(2, category.getId());
            rowAffected = ps.executeUpdate();//filas afectadas
            ps.close();
            con.close();
            return rowAffected == 1;
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            return false;
        }
    }

}
