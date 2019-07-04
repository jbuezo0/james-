/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlest;

import com.models.Functions;
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
@WebServlet(name = "FunctionsUpdate", urlPatterns = {"/FunctionsUpdate"})
public class FunctionsUpdate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            Functions model;
            int id = Integer.parseInt(request.getParameter("id"));
            String classification = request.getParameter("classification");
            String premiere = request.getParameter("premiere");
            String hour = request.getParameter("hour");
            model = new Functions(id, classification, premiere, hour);
            com.dao.FunctionsDaO.update(model);
            response.sendRedirect("LIstFunct?id=" + id);
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