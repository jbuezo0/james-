/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruevas;

import com.dao.UsuarioDao;
import com.models.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JBuezo
 */
public class PruevaUsuario {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
      /* boolean inserted = UsuarioDao.add(
                new Usuario("Jaime", "1234"));
        System.out.println(inserted);*/

        List<Usuario> list = com.dao.UsuarioDao.getAll();
        for (Usuario e : list) {
            System.out.println(e.getUser_name());
            System.out.println(e.getPassword());
        }

    }


    
}