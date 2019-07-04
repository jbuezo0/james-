/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.conexion;
import com.models.Functions;
import com.models.Movie;
import com.models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * En esta clase realizaremos los elementos CRUD que necesitaremos para el
 * proyecto
 *
 * @author JBuezo
 */
public class FunctionsDaO {

    /**
     * En el Metodo add podremos insertar nuevas registros en este caso modelos
     * de las peliculas
     */
    public static boolean add(Functions functions) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar, nuestra variable de conexion,
         * nuestra sentencia sql y nuestra sentencia
         */
        Connection con;
        PreparedStatement ps;
        String sql = "insert into functions values (null, ?, ?, ?, ?, ?)";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, functions.getClassification());
            ps.setString(2, functions.getPremiere());
            ps.setString(3, functions.getHour());
            ps.setInt(4, functions.getMovie_id());
            ps.setInt(5, functions.getUsuario_id());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            return false;
        }
    }

    /**
     * En el Metodo getAll realizamos un select que muestra todos los elementos
     * de la tabla
     */
    public static List<Functions> getAll() throws ClassNotFoundException, SQLException {
        List<Functions> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select functions.id, functions.classification, functions.premiere, functions.hour, usuario.user_name, movie.name_movie from functions, usuario, movie where functions.usuario_id = usuario.id and functions.movie_id = movie.id order by id;";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Functions(
                        rs.getInt("functions.id"),
                        rs.getString("functions.classification"),
                        rs.getString("functions.premiere"),
                        rs.getString("functions.hour"),
                        rs.getString("usuario.user_name"),
                        rs.getString("movie.name_movie")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            list.clear();
        }
        return list;
    }

    /**
     * Metodo update nos ayudara a actualizar los campos de mercaderia que sean
     * necesarios modificar
     */
    public static boolean update(Functions functions) throws SQLException, ClassNotFoundException {
        /**
         * Creamos nuestras variables, nuestro objeto conexion, sentencia y un
         * int rowAffected
         */
        Connection con;
        PreparedStatement ps;
        String sql = "update functions set classification = ?, premiere = ?, hour = ? where id = ?";
        int rowAffected;

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, functions.getClassification());
            ps.setString(2, functions.getPremiere());
            ps.setString(3, functions.getHour());
            ps.setInt(4, functions.getId());
            rowAffected = ps.executeUpdate();//filas afectadas
            ps.close();
            con.close();
            return rowAffected == 1;
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            return false;
        }
    }

    /**
     * De nuevo el metodo getById para poder tomar un id seleccionado
     */
    public static Functions getById(int id) throws SQLException, ClassNotFoundException {
        /**
         * Creamos las variables, un objeto modelo, nuestra conexion y las
         * sentencias
         */
        Functions functions;
        Connection con;
        PreparedStatement ps;
        String sql = "select * from functions where id = ?";
        ResultSet rs;

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            functions = new Functions(rs.getInt("id"), rs.getString("classification"), rs.getString("premiere"), rs.getString("hour")
            );
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            functions = null;
        }
        return functions;
    }

    /**
     * Este metodo nos sirve para realizar un filtrado por marcas de mercaderias
     */
    public static List<Functions> getFiltrer(String id) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar una lista que recorra la tabla
         */
        List<Functions> list= new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select functions.id idFunctions, functions.classification, usuario.user_name, usuario.id from functions, usuario where functions.usuario_id = usuario.id and usuario.id = ?";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(
                        new Functions(
                                rs.getInt("idFunctions"),
                                rs.getString("classification"),
                                new Usuario(rs.getString("id"),
                                        rs.getString("user_name")
                                )));
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertar: " + e);
            list.clear();
        }
        return list;
    }



  /**
     * 
     * @param function
     * @param functions
     * @param idRel
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     * 
     * el método endRelation elimina la relación entre un usuario y uno de sus
     * contactos. Recible como parámetro una variable int que representa el id
     * del registro de la relación en la base de datos
     */
   

   public static boolean Delete(Functions functions) throws SQLException, ClassNotFoundException {

        /**
         * Creamos nuestras variables, nuestro objeto conexion, sentencia y un
         * int rowAffected
         */
        Connection con;
        PreparedStatement ps;
        String sql = "delete from functions where id=?";
        int rowAffected;

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, functions.getId());
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
