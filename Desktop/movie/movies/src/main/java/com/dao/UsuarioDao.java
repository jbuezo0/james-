/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.conexion;
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
public class UsuarioDao {
     /**
     * En el Metodo add podremos insertar nuevas registros en este caso
     * categorias
     */
    public static boolean add(Usuario usuario) throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar, nuestra variable de conexion,
         * nuestra sentencia sql y nuestra sentencia
         */
        Connection con;
        PreparedStatement ps;
        String sql = "insert into usuario values (null, ?, ?)";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getUser_name());
            ps.setString(2, usuario.getPassword());
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
     public static List<Usuario> getProductList() throws ClassNotFoundException {
        List<Usuario> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from usuario";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Usuario(
                        rs.getInt("id"),
                        rs.getString("user_name"),
                        rs.getString("password")
                        
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


    public static List<Usuario> getAll() throws ClassNotFoundException, SQLException {
        /**
         * Creamos nuestras variables a utilizar una lista que recorra la tabla
         */
        List<Usuario> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from usuario order by id";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Usuario(
                        rs.getInt("id"),
                        rs.getString("user_name"),
                        rs.getString("Password")
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
    public static Usuario getById(int id) throws SQLException, ClassNotFoundException {
        /**
         * Creacion de las variables que necesitaremos
         */
        Usuario bra;
        Connection con;
        PreparedStatement ps;
        String sql = "select * from usuario where id = ?";
        ResultSet rs;

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            rs.first();
            bra = new Usuario(rs.getInt("id"), 
                              rs.getString("user_name"),
                              rs.getString("password")
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
    public static boolean update(Usuario usuario) throws SQLException, ClassNotFoundException {
        /**
         * Creacion de nuestras varialbes
         */
        Connection con;
        PreparedStatement ps;
        String sql = " update usuario set user_name =?, password =? where id=?";
        int rowAffected;

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getUser_name());
            ps.setString(2, usuario.getPassword());
            ps.setInt(3, usuario.getId());
            rowAffected = ps.executeUpdate();//filas afectadas
            ps.close();
            con.close();
            return rowAffected == 1;
        } catch (SQLException e) {
            System.out.println("Error consulta: " + e.getMessage());
            return false;
        }
    }

     public static Usuario getUsuario(String usuario) throws SQLException, ClassNotFoundException {

        String sql = "select id, user_name, password FROM usuario WHERE user_name = '" + usuario + "'";

        try {
            Connection con = conexion.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            Usuario usual;

            usual = new Usuario(
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

