/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlest;

import com.dao.UsuarioDao;
import com.models.Usuario;
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
@WebServlet(name = "CreateUsuario", urlPatterns = {"/CreateUsuario"})
public class CreateUsuario extends HttpServlet {

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /**
         * @getRequestDispatcher.forward(request, response) reenvia la solicitud
         * @senRedirect redirige la petición a otro servlet
         * @getParameter recupera un parámetro de la request. Devuelve un String con el valor del parámetro o null en caso de que no exista 
         * @getRequestDispatcher.forward(request, response) reenvia la solicitud
         */
        
    
     try {
            String name = request.getParameter("name");
            String pass = request.getParameter("pass");
            com.dao.UsuarioDao.add(new Usuario(name, pass));
                    request.getRequestDispatcher("index.jsp").forward(request, response);

        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}