/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruevas;

import com.dao.CategoryDao;
import com.dao.MovieDao;
import com.models.Category;
import com.models.Movie;
import java.sql.SQLException;
import java.util.List;

/**
 *  En esta clase realizamos las pruebas de nuestros metodos Dao de category
 * @author JBuezo
 */
public class PruevaMovie {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
       /*boolean inserted = MovieDao.add(
                new Movie("Los increibles","4h","Protagonizada por una famila que pretende ser normal..."));
        System.out.println(inserted);
*/
        List<Movie> list = com.dao.MovieDao.getAll();
        for (Movie e : list) {
            System.out.println(e.getName_movie()
                                + e.getDescription()
                                + e.getDuration());
        }

    }


    

    
}
