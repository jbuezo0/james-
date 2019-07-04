/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.conexion;
import com.models.Category;  
import com.models.Movie;
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
public class MovieDao {

    /**
     * En el Metodo add podremos insertar nuevas registros en este caso
     * categorias
     * @param movie
     */
    public static boolean add(Movie movie) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar, nuestra variable de conexion,
         * nuestra sentencia sql y nuestra sentencia
         */
        Connection con;
        PreparedStatement ps;
        String sql = "insert into movie values (null, ?, ?, ?, ?)";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, movie.getName_movie());
            ps.setString(2, movie.getDuration());
            ps.setString(3, movie.getDescription());
            ps.setInt(4, movie.getCategory_id());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e);
            return false;
        }
    }

    public static List<Movie> getAll() throws ClassNotFoundException, SQLException {
        List<Movie> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select movie.id, movie.name_movie, movie.duration, movie.description, category.name_category  from movie, category where movie.category_id = category.id  order by id;";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Movie(
                        rs.getInt("movie.id"),
                        rs.getString("movie.name_movie"),
                        rs.getString("movie.duration"),
                        rs.getString("movie.description"),
                        rs.getString("category.name_category")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            list.clear();
        }
        return list;
    }

    /**
     * En el Metodo getAll realizamos un select que muestra todos los elementos
     * de la tabla
     * @return 
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static List<Movie> getAl() throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar una lista que recorra la tabla
         */
        List<Movie> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from movie order by id";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Movie(
                        rs.getInt("id"),
                        rs.getString("name_movie"),
                        rs.getString("duration"),
                        rs.getString("description")
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
    public static Movie getById(int id) throws SQLException, ClassNotFoundException {
        /**
         * Creacion de las variables que necesitaremos
         */
        Movie bra;
        Connection con;
        PreparedStatement ps;
        String sql = "select * from movie where id = ?";
        ResultSet rs;

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            bra = new Movie(rs.getInt("id"), 
                            rs.getString("name_movie"),
                            rs.getString("duration"),
                            rs.getString("description")
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
    public static boolean update(Movie movie) throws SQLException, ClassNotFoundException {
        /**
         * Creacion de nuestras varialbes
         */
        Connection con;
        PreparedStatement ps;
        String sql = "update movie set name_movie = ?, duration = ?, description = ? where id = ?";
        int rowAffected;

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, movie.getName_movie());
            ps.setString(2, movie.getDuration());
            ps.setString(3, movie.getDescription());
            ps.setInt(4, movie.getId());
            rowAffected = ps.executeUpdate();//filas afectadas
            ps.close();
            con.close();
            return rowAffected == 1;
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            return false;
        }
    }

    


 public static List<Movie> getFiltrer(String id) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar una lista que recorra la tabla
         */
        List<Movie> list= new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select movie.id idMovie, movie.name_movie, category.name_category, category.id from movie, category where movie.category_id = category.id and category.id = ?";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(
                        new Movie(
                                rs.getInt("idMovie"),
                                rs.getString("name_movie"),
                                new Category(
                                        rs.getInt("id"),
                                        rs.getString("name_category")
                                )));
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            list.clear();
        }
        return list;
    }

    public static List<Movie> getFil(String id) throws ClassNotFoundException {
    List<Movie> list= new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select movie.id idMovie, movie.name_movie, movie.duration, movie.description, category.name_category from movie, category where movie.id = category.id and movie.id = ?";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(
                        new Movie(
                                rs.getInt("idMovie"),
                                rs.getString("name_movie"),
                                rs.getString("duration"),
                                rs.getString("description"),
                                rs.getString("name_category")
                        ) 
                                );
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            list.clear();
        }
        return list;
    }
    }
