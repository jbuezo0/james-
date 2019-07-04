/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlest;

import com.dao.FunctionsDaO;
import com.models.Functions;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JBuezo
 */
@WebServlet(name = "CreateFunctiones", urlPatterns = {"/CreateFunctiones"})
public class CreateFunctiones extends HttpServlet {
    
    
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*HttpSession login = request.getSession();

      /*  String user = (String.valueOf(login.getAttribute("usuario_id")));
        int usuario_id = Integer.parseInt(user);
        int movie_id = Integer.parseInt(request.getParameter("movie_id"));
        String classification = request.getParameter("classification");
        String premiere = request.getParameter("premiere");
        String hour = request.getParameter("hour");
          Functions model = new Functions(classification,  premiere,  hour,usuario_id, movie_id);

        try {
            FunctionsDaO.add(model);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CreateFunctiones.class.getName()).log(Level.SEVERE, null, ex);
        }

        response.sendRedirect("CreateListPedido");
    }*/
        
        
  /*  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {*/
  HttpSession login = request.getSession();

        
        try {
            String classification = request.getParameter("classification");
            String premiere = request.getParameter("premiere");
            String hour = request.getParameter("hour");
String user = (String.valueOf(login.getAttribute("id")));
        int id = Integer.parseInt(user);          
        int movie_id = Integer.parseInt(request.getParameter("movie_id"));

            Functions model = new Functions(classification,  premiere,  hour, id, movie_id);
            com.dao.FunctionsDaO.add(model);
            response.sendRedirect("ListFunct");
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
