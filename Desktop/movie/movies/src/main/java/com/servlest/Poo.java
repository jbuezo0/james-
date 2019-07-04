/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlest;

import com.models.Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JBuezo
 */
@WebServlet(name = "Poo", urlPatterns = {"/Poo"})
public class Poo extends HttpServlet {




  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        System.out.println("ID: " + id);
        List<Movie> movie = new ArrayList();
      try {
          movie = com.dao.MovieDao.getFil(id);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(MovieFilter.class.getName()).log(Level.SEVERE, null, ex);
      }
        for (Movie mod : movie) {
            System.out.println(mod.getId());
        }
        request.setAttribute("Movie", movie);
        request.getRequestDispatcher("movie_filter.jsp").forward(request, response);
    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
