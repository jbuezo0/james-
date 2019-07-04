/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlest;

import com.models.Category;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * En el servlet CreateBrand realizamos la creacion de las marcas existentes
 * @author JBuezo
 */
@WebServlet(name = "CreateCategoria", urlPatterns = {"/CreateCategoria"})
public class CreateCategoria extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String name = request.getParameter("name");
            com.dao.CategoryDao.add(new Category(name));
            response.sendRedirect("CategoryList");
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
