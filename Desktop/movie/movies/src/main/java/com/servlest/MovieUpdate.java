/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlest;

import com.models.Category;
import com.models.Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JBuezo
 */
@WebServlet(name = "MovieUpdate", urlPatterns = {"/MovieUpdate"})
public class MovieUpdate extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Movie movie;
            int id = Integer.parseInt(request.getParameter("id"));
            String name_movie = request.getParameter("name_movie");
            String duration = request.getParameter("duration");
            String description = request.getParameter("description");

            movie = new Movie(id, name_movie, duration, description);
            com.dao.MovieDao.update(movie);
            response.sendRedirect("Lista?id=" + id);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
