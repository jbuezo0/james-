/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlest;

import com.models.Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
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
@WebServlet(name = "CategoryFilter", urlPatterns = {"/CategoryFilter"})
public class CategoryFilter extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      try {
          String id = request.getParameter("id");
          System.out.println("ID: " + id);
          List<Movie> movie = new ArrayList();
          movie = com.dao.MovieDao.getFiltrer(id);
          for (Movie mod : movie) {
              System.out.println(mod.getCategory_id());
          }
          request.setAttribute("Movie", movie);
          request.getRequestDispatcher("category_filter.jsp").forward(request, response);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(CategoryFilter.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(CategoryFilter.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

