/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlest;

import com.models.Movie;
import java.io.IOException;
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
@WebServlet(name = "CreateMovie", urlPatterns = {"/CreateMovie"})
public class CreateMovie extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String name = request.getParameter("name_movie");
            String duration = request.getParameter("duration");
            String description = request.getParameter("description");
            int category_id = Integer.parseInt(request.getParameter("category_id"));

            com.dao.MovieDao.add(new Movie(name, duration, description, category_id));
            response.sendRedirect("Lista");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

