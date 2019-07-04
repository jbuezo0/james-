/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruevas;

import com.dao.CategoryDao;
import com.models.Category;
import java.sql.SQLException;
import java.util.List;

/**
 * * En esta clase realizamos las pruebas de nuestros metodos Dao de category
 * @author JBuezo
 */
public class PruevaCategory {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
       boolean inserted = CategoryDao.add(
                new Category("Accion"));
        System.out.println(inserted);

        /*List<Category> list = com.dao.CategoryDao.getAll();
        for (Category e : list) {
            System.out.println(e.getName_category());
        }*/

    }


    
}
