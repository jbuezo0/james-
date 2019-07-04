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
 *
 * @author JBuezo
 */
@WebServlet(name = "CategoryUpdate", urlPatterns = {"/CategoryUpdate"})
public class CategoryUpdate extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Category category;
            int id = Integer.parseInt(request.getParameter("id"));
            String name_category = request.getParameter("name_category");

            category = new Category(id, name_category);
            com.dao.CategoryDao.update(category);
            response.sendRedirect("CategoryList?id=" + id);
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
