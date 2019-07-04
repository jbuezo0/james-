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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * En este servlet desplegamos la lista con todas las marcas
 * @author JBuezo
 */
@WebServlet(name = "CategoryList", urlPatterns = {"/CategoryList"})
public class CategoryList extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            List<Category> list = com.dao.CategoryDao.getAll();

            request.setAttribute("lista", list);
            request.getRequestDispatcher("list_category.jsp").include(request, response);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}



    